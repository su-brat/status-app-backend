package com.status_app.statusApp.helper;

import com.status_app.statusApp.dto.ServiceDTO;
import com.status_app.statusApp.entity.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DtoMapperHelper {

	ServiceDTO toServiceDTO(ServiceEntity ServiceEntity);

	List<ServiceDTO> toServiceDTOs(List<ServiceEntity> serviceentities);
}
