package com.synerzip.survey_builder.changelogs;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;

@ChangeLog
public class DatabaseChangelog {

    @ChangeSet(order = "001", id = "addDefaultSurveyType", author = "Vivek Tiwari")
    public void addDefaultSurveyType(DB db){
        DBCollection dbCollection = db.getCollection("survey_type");
        BasicDBObject doc = new BasicDBObject().append("type", "Technical");
        dbCollection .insert(doc);
    }
}

