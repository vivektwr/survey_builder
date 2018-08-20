package com.synerzip.survey_builder.controller;

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
        return surveyService.findOne(id);
    }

    @PostMapping("/survey")
    public Survey create(@RequestBody Survey survey) {
        return surveyService.create(survey);
    }

    @GetMapping("/survey/{id}")
    public Survey update(@RequestBody Survey survey, @PathVariable("id") String id) {
        return surveyService.update(survey, id);
    }


    @GetMapping("/survey/{id}")
    public void delete(@PathVariable("id") String id) {
        surveyService.delete(id);
    }
}