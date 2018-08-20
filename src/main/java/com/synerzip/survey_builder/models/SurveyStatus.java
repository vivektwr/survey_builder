package com.synerzip.survey_builder.models;

public enum SurveyStatus {
	
	PENDING(0),

	PUBLISHED(1);

	private final int value;

	private SurveyStatus(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
