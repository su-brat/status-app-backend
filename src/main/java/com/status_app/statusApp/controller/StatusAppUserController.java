package com.status_app.statusApp.controller;

import java.util.List;

import com.status_app.statusApp.dto.ServiceDTO;
import com.status_app.statusApp.service.StatusAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/statusApp")
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
}
