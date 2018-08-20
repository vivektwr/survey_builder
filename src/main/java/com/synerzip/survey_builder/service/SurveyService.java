package com.synerzip.survey_builder.service;

import com.synerzip.survey_builder.models.Question;
import com.synerzip.survey_builder.models.Survey;
import com.synerzip.survey_builder.models.SurveyType;
import com.synerzip.survey_builder.repositories.QuestionRepository;
import com.synerzip.survey_builder.repositories.SurveyRepository;
import com.synerzip.survey_builder.repositories.SurveyTypeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

@Service
public class SurveyService {

    private static Logger LOGGER = LoggerFactory.getLogger(SurveyService.class);

    @Autowired
    private SurveyRepository surveyRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private SurveyTypeRepository surveyTypeRepository;

    public List<Survey> findAll() {
        return surveyRepository.findAll();
    }

    public Optional<Survey> findOne(String id) {
        return surveyRepository.findById(id);
    }

    public Survey create(Survey survey) {
        String surveyTypeId = survey.getSurveyTypeId();
        SurveyType surveyType = surveyTypeRepository.findBySurveyTypeId(surveyTypeId);
        if (null != surveyType) {
            survey.setSurveyType(surveyType);
        }
        return surveyRepository.save(survey);
    }

    public Survey update(Survey survey, String id) {
        Survey dbSurvey = surveyRepository.findBySurveyId(id);
        if (null != dbSurvey) {
            if (!StringUtils.isEmpty(survey.getDescription())) {
                dbSurvey.setDescription(survey.getDescription());
            }
            if (!StringUtils.isEmpty(survey.getDueDate())) {
                dbSurvey.setDueDate(survey.getDueDate());
            }
        }
        return surveyRepository.save(dbSurvey);
    }

    public void delete(String id) {
        surveyRepository.deleteById(id);
    }
	
}
