package com.status_app.statusApp.repository;

import com.status_app.statusApp.entity.IncidentUpdateEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IncidentUpdateRepository extends MongoRepository<IncidentUpdateEntity,String> {

    @Query(value = "{ 'incidentId' : ?0 }")
    List<IncidentUpdateEntity> findByIncidentId(String incidentId);
}
