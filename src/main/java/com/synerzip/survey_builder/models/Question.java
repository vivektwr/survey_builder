package com.synerzip.survey_builder.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "question")
public class Question {

    @Id
    private String id;

    private String query;

    private String type;

    private List<String> options;

    private boolean isRequired;

    public Question() {
    }

    public Question(String query, String type, List<String> options, boolean isRequired) {
        this.query = query;
        this.type = type;
        this.options = options;
        this.isRequired = isRequired;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
