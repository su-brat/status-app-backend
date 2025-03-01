package com.status_app.statusApp.repository;

import com.status_app.statusApp.entity.ServiceEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends MongoRepository<ServiceEntity,String> {
}
