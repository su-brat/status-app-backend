package com.status_app.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.Data;

@Document("services")
public class ServiceEntity {

	@MongoId
	private String id;
	
	private String name;
	
	private String description;
	
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

//	@Override
//	public String toString() {
//		return "ServiceEntity [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
//				+ "]";
//	}
}
