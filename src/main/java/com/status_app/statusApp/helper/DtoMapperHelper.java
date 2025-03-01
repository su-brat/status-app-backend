package com.status_app.statusApp.helper;

import com.status_app.statusApp.dto.IncidentDTO;
import com.status_app.statusApp.dto.ServiceDTO;
import com.status_app.statusApp.entity.IncidentEntity;
import com.status_app.statusApp.entity.ServiceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DtoMapperHelper {

    IncidentEntity toIncidentEntity(IncidentDTO incidentDTO);

	ServiceDTO toServiceDTO(ServiceEntity serviceEntity);

	List<ServiceDTO> toServiceDTOs(List<ServiceEntity> serviceEntities);

	IncidentDTO toIncidentDTO(IncidentEntity incidentEntity);

	List<IncidentDTO> toIncidentDTOs(List<IncidentEntity> incidentEntities);
}
