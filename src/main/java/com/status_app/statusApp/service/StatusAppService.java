package com.status_app.statusApp.service;

import com.status_app.statusApp.dto.IncidentDTO;
import com.status_app.statusApp.dto.IncidentUpdateDTO;
import com.status_app.statusApp.dto.ServiceDTO;

import java.util.List;

public interface StatusAppService {

    public List<ServiceDTO> getServices();
    public List<IncidentDTO> getIncidents();
    public boolean createIncident(IncidentDTO incident);
    public boolean createIncidentUpdate(IncidentUpdateDTO incidentUpdateDTO);
    public List<IncidentUpdateDTO> getIncidentUpdates(String incidentId);
}
