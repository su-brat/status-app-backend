package com.status_app.statusApp.dto;

import org.bson.BsonTimestamp;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentDTO {

    private String id;

    private String serviceId;

    private String title;

    private BsonTimestamp createdAt;

    private BsonTimestamp closedAt;

}