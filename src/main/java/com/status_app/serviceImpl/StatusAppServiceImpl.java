package com.status_app.serviceImpl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.status_app.dto.ServiceDTO;
import com.status_app.entity.ServiceEntity;
import com.status_app.helper.DtoMapperHelper;
import com.status_app.repository.ServiceRepository;
import com.status_app.service.StatusAppService;

@Service
public class StatusAppServiceImpl implements StatusAppService{
	
	private static final Logger logger = LoggerFactory.getLogger(StatusAppServiceImpl.class);

	@Autowired
	ServiceRepository serviceRepository;
	
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
			logger.error("issue while getting the list - {}",e);;
		}
		return null;
	}

}
