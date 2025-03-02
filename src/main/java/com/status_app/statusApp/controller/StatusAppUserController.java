package com.status_app.statusApp.controller;

import java.util.List;

import com.status_app.statusApp.dto.IncidentDTO;
import com.status_app.statusApp.dto.ServiceDTO;
import com.status_app.statusApp.service.StatusAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/api")
public class StatusAppUserController {

    @Autowired
    StatusAppService statusAppService;

    @GetMapping("/services")
    public ResponseEntity<List<ServiceDTO>> getServiceList(){
        List<ServiceDTO> serviceListResp=statusAppService.getServices();
        if(!CollectionUtils.isEmpty(serviceListResp)) {
            return ResponseEntity.status(HttpStatus.OK).body(serviceListResp);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @GetMapping("/incidents")
    public ResponseEntity<List<IncidentDTO>> getIncidentList() {
        List<IncidentDTO> incidentListResp=statusAppService.getIncidents();
        if(!CollectionUtils.isEmpty(incidentListResp)) {
            return ResponseEntity.status(HttpStatus.OK).body(incidentListResp);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }

    @PostMapping("/incidents")
    public ResponseEntity<String> postIncident(
        @RequestBody IncidentDTO incidentDTO
    ) {
        boolean success = statusAppService.createIncident(incidentDTO);
        if(success) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Success");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failure");
    }

}
