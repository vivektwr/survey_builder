package com.synerzip.survey_builder.repositories;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.synerzip.survey_builder.models.CustomServey;

@Repository
public interface CustomServeyRepository extends MongoRepository<CustomServey, ObjectId>{

}
