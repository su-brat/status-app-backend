package com.status_app.statusApp.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document("services")
@Data
public class ServiceEntity {

    @MongoId
    private String id;

    private String name;

    private String description;

    private String status;
}