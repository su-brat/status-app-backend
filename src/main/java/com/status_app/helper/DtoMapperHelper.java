package com.status_app.helper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import com.status_app.dto.ServiceDTO;
import com.status_app.entity.ServiceEntity;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DtoMapperHelper {

//	@Mapping(source = "id", target = "id")
//    @Mapping(source = "name", target = "name")
//	@Mapping(source = "description", target = "description")
//	@Mapping(source = "status", target = "status")
//	ServiceDTO toServiceDTO(ServiceEntity ServiceEntity);
//	
//	List<ServiceDTO> toServiceDTOs(List<ServiceEntity> serviceentities);
}
