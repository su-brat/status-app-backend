package com.status_app.statusApp.entity;

import lombok.Data;

import org.bson.BsonTimestamp;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("incidents")
@Data
public class IncidentEntity {

    @MongoId
    private String id;

    private String serviceId;

    private String title;

    private BsonTimestamp createdAt;

    private BsonTimestamp closedAt;
}