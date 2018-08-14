package com.synerzip.survey_builder.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "servey_type")
public class ServeyType {

	@Id
	private ObjectId typeId;

	private String type;

	public ObjectId getTypeId() {
		return typeId;
	}

	public void setTypeId(ObjectId typeId) {
		this.typeId = typeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

}
