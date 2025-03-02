package com.status_app.statusApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IncidentUpdateDTO {
    private String id;

    private String incidentId;

    private LocalDateTime updatedAt;

    private String message;

}
