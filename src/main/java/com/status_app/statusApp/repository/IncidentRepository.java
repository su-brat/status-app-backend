package com.status_app.statusApp.repository;

import com.status_app.statusApp.entity.IncidentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncidentRepository extends MongoRepository<IncidentEntity,String> {
}
