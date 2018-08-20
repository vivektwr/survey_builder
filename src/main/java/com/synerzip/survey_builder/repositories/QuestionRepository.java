package com.synerzip.survey_builder.repositories;

import com.synerzip.survey_builder.models.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}
