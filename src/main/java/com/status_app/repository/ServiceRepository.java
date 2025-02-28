package com.status_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.status_app.entity.ServiceEntity;

@Repository
public interface ServiceRepository extends MongoRepository<ServiceEntity,String> {
}
