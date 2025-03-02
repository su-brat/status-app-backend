package com.status_app.statusApp.serviceImpl;

import com.status_app.statusApp.dto.IncidentDTO;
import com.status_app.statusApp.dto.IncidentUpdateDTO;
import com.status_app.statusApp.dto.ServiceDTO;
import com.status_app.statusApp.entity.IncidentEntity;
import com.status_app.statusApp.entity.IncidentUpdateEntity;
import com.status_app.statusApp.entity.ServiceEntity;
import com.status_app.statusApp.helper.DtoMapperHelper;
import com.status_app.statusApp.repository.IncidentRepository;
import com.status_app.statusApp.repository.IncidentUpdateRepository;
import com.status_app.statusApp.repository.ServiceRepository;
import com.status_app.statusApp.service.StatusAppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StatusAppServiceImpl implements StatusAppService {

    private static final Logger logger = LoggerFactory.getLogger(StatusAppServiceImpl.class);

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    IncidentRepository incidentRepository;

    @Autowired
    IncidentUpdateRepository incidentUpdateRepository;

    private final DtoMapperHelper dtoMapperHelper;

    public StatusAppServiceImpl(DtoMapperHelper dtoMapperHelper) {
        this.dtoMapperHelper = dtoMapperHelper;
    }

    @Override
    public List<ServiceDTO> getServices() {
        try {
            List<ServiceEntity> serviceList=serviceRepository.findAll();
            logger.info("serviceList - [{}]",serviceList);
            List<ServiceDTO> servicesList=dtoMapperHelper.toServiceDTOs(serviceList);
            logger.info("servicesList -[{}]",servicesList);
            return servicesList;
        }catch(Exception e) {
            logger.error("issue while getting the list - {}",e);
        }
        return null;
    }

    @Override
    public List<IncidentDTO> getIncidents() {
        try {
            List<IncidentEntity> incidentEntities = incidentRepository.findAll();
            logger.info("incidentEntities - [{}]", incidentEntities);
            List<IncidentDTO> incidentDTOs = dtoMapperHelper.toIncidentDTOs(incidentEntities);
            logger.info("incidentDTOs -[{}]",incidentDTOs);
            return incidentDTOs;
        } catch(Exception e) {
            logger.error("issue while getting the list - {}", e);
        }
        return null;
    }

    @Override
    public boolean createIncident(IncidentDTO incident) {
        try {
            IncidentEntity incidentEntity = dtoMapperHelper.toIncidentEntity(incident);
            incidentRepository.save(incidentEntity);
            return true;
        } catch(Exception e) {
            logger.error("issue while creating incident {}", e);
            return false;
        }
    }

    @Override
    public boolean createIncidentUpdate(IncidentUpdateDTO incidentUpdateDTO) {
        try {
            IncidentUpdateEntity incidentUpdateEntity = dtoMapperHelper.toIncidentUpdateEntity(incidentUpdateDTO);
            incidentUpdateRepository.save(incidentUpdateEntity);
            return true;
        } catch(Exception e) {
            logger.error("issue while creating incident updates {}", e);
            return false;
        }
    }

    @Override
    public List<IncidentUpdateDTO> getIncidentUpdates(String incidentId) {
       try{
           List<IncidentUpdateEntity> incidentUpdateLists=incidentUpdateRepository.findByIncidentId(incidentId);
           if(!CollectionUtils.isEmpty(incidentUpdateLists)){
               return dtoMapperHelper.toIncidentUpdateDTOLists(incidentUpdateLists);
           }else{
               logger.error("No records found.. GTH");
           }
       }catch(Exception e){
            logger.error("Exception occured while getting the incidentUpdate list - {}",e);
       }
       return null;
    }


}