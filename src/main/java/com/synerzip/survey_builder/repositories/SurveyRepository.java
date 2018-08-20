package com.synerzip.survey_builder.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.synerzip.survey_builder.models.Survey;

@Repository
public interface SurveyRepository extends MongoRepository<Survey, String>{

    @Query("{ 'id' : ?0 }")
    Survey findBySurveyId(String id);
}
