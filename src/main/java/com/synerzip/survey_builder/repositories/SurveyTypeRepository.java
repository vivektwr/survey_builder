package com.synerzip.survey_builder.repositories;

import com.synerzip.survey_builder.models.SurveyType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface SurveyTypeRepository extends MongoRepository<SurveyType, String> {

    @Query("{ 'id' : ?0 }")
    SurveyType findBySurveyTypeId(String id);
}
