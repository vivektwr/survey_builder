package com.synerzip.survey_builder.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class GlobalRestControllerExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(SurveyNotFoundException.class)
    protected ResponseEntity<ApiErrorInfo> handleSurveyNotFoundException(SurveyNotFoundException ex) {
        ApiErrorInfo apiErrorInfo = new ApiErrorInfo(HttpStatus.NOT_FOUND, ex.getMessage());
        return new ResponseEntity<>(apiErrorInfo, apiErrorInfo.getHttpStatus());
    }
}
