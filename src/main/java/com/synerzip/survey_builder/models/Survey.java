package com.synerzip.survey_builder.models;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "survey")
public class Survey {

	@Id
	public String id;

	private String title;

	private String description;

	private SurveyType surveyType;

	@Transient
	private String surveyTypeId;

	private String other;

	private Date dueDate;

	private List<Question> questions;

	private SurveyStatus surveyStatus;

	public Survey() {
	}

	public Survey(String title, String description, SurveyType surveyType, String surveyTypeId,
				  String other, Date dueDate, List<Question> questions, SurveyStatus surveyStatus) {
		this.title = title;
		this.description = description;
		this.surveyType = surveyType;
		this.surveyTypeId = surveyTypeId;
		this.other = other;
		this.dueDate = dueDate;
		this.questions = questions;
		this.surveyStatus = surveyStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public SurveyType getSurveyType() {
		return surveyType;
	}

	public void setSurveyType(SurveyType surveyType) {
		this.surveyType = surveyType;
	}

	public String getSurveyTypeId() {
		return surveyTypeId;
	}

	public void setSurveyTypeId(String surveyTypeId) {
		this.surveyTypeId = surveyTypeId;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public SurveyStatus getSurveyStatus() {
		return surveyStatus;
	}

	public void setSurveyStatus(SurveyStatus surveyStatus) {
		this.surveyStatus = surveyStatus;
	}
}
