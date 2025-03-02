package com.status_app.statusApp.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("incidentUpdates")
@Data
public class IncidentUpdateEntity {

    @Id
    private String id;

    private String incidentId;

    private LocalDateTime updatedAt;

    private String message;
}
