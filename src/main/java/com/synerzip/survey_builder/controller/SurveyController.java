package com.synerzip.survey_builder.controller;

import com.synerzip.survey_builder.exceptions.SurveyNotFoundException;
import com.synerzip.survey_builder.models.Survey;
import com.synerzip.survey_builder.service.SurveyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SurveyController {

    private static Logger LOGGER = LoggerFactory.getLogger(SurveyController.class);

    @Autowired
    private SurveyService surveyService;

    @GetMapping("/survey")
    public List<Survey> findAll() {
        return surveyService.findAll();
    }

    @GetMapping("/survey/{id}")
    public Optional<Survey> findOne(@PathVariable("id") String id) {
        Optional<Survey> survey = surveyService.findOne(id);
        if (!survey.isPresent())
            throw new SurveyNotFoundException("Survey Id " + id);
        return survey;
    }

    @PostMapping("/survey")
    public Survey create(@RequestBody Survey survey) {
        return surveyService.create(survey);
    }

    @PutMapping("/survey/{id}")
    public Survey update(@RequestBody Survey survey, @PathVariable("id") String id) {
        return surveyService.update(survey, id);
    }

    @DeleteMapping("/survey/{id}")
    public void delete(@PathVariable("id") String id) {
        surveyService.delete(id);
    }
}
