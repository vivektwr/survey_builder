package com.synerzip.survey_builder.config;

import com.github.mongobee.Mongobee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SurveyBuilderConfiguration {

    @Bean
    public Mongobee mongobee(){
        Mongobee runner = new Mongobee("mongodb://localhost:27017/survey_builder");
        runner.setDbName("survey_builder");
        runner.setChangeLogsScanPackage("com.synerzip.survey_builder.changelogs");
        return runner;
    }
}
