package com.synerzip.survey_builder.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SurveyNotFoundException extends RuntimeException {

    public SurveyNotFoundException(String exception) {
        super(exception);
    }
}
