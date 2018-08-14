package com.synerzip.survey_builder.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "custom_servey")
public class CustomServey {

	@Id
	private ObjectId customServeyId;

	private String serveyTitle;

	private String serveyTitleDescrption;

	private ServeyType serveyType;

	private String other;

	private Map<String, ArrayList<Object>> questions;

	private String question;

	private String answerType;

	private List<String> ansOptions;

	private boolean isRequired;

	private ServeyStatus serveyStatus;

	public ObjectId getCustomServeyId() {
		return customServeyId;
	}

	public void setCustomServeyId(ObjectId customServeyId) {
		this.customServeyId = customServeyId;
	}

	public String getServeyTitle() {
		return serveyTitle;
	}

	public void setServeyTitle(String serveyTitle) {
		this.serveyTitle = serveyTitle;
	}

	public String getServeyTitleDescrption() {
		return serveyTitleDescrption;
	}

	public void setServeyTitleDescrption(String serveyTitleDescrption) {
		this.serveyTitleDescrption = serveyTitleDescrption;
	}

	public ServeyType getServeyType() {
		return serveyType;
	}

	public void setServeyType(ServeyType serveyType) {
		this.serveyType = serveyType;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Map<String, ArrayList<Object>> getQuestions() {
		return questions;
	}

	public void setQuestions(Map<String, ArrayList<Object>> questions) {
		this.questions = questions;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswerType() {
		return answerType;
	}

	public void setAnswerType(String answerType) {
		this.answerType = answerType;
	}

	public List<String> getAnsOptions() {
		return ansOptions;
	}

	public void setAnsOptions(List<String> ansOptions) {
		this.ansOptions = ansOptions;
	}

	public boolean isRequired() {
		return isRequired;
	}

	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	public ServeyStatus getServeyStatus() {
		return serveyStatus;
	}

	public void setServeyStatus(ServeyStatus serveyStatus) {
		this.serveyStatus = serveyStatus;
	}

}
