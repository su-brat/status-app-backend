package com.status_app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ServiceDTO {
	
	private String id;

	private String name;
	
	private String description;
	
	private String status;

	@Override
	public String toString() {
		return "ServiceDTO [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status + "]";
	}
}
