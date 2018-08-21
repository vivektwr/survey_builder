package com.synerzip.survey_builder.exceptions;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ApiErrorInfo {

    private HttpStatus httpStatus;

    private LocalDateTime timestamp;

    private String message;

    private  String debugMessage;

    ApiErrorInfo(){
        timestamp = LocalDateTime.now();
    }

    ApiErrorInfo(HttpStatus httpStatus) {
        this();
        this.httpStatus = httpStatus;
    }

    ApiErrorInfo(HttpStatus httpStatus, String message) {
        this();
        this.httpStatus = httpStatus;
        this.message = message;
    }

    ApiErrorInfo(HttpStatus httpStatus, Throwable tx) {
        this();
        this.httpStatus = httpStatus;
        this.message = tx.getMessage();
        this.debugMessage = tx.getLocalizedMessage();
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDebugMessage() {
        return debugMessage;
    }
}
