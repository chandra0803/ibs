package com.ibsplc.TailogIntegration.service.impl;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibsplc.TailogIntegration.VO.FuelPlusServiceResponse;
import com.ibsplc.TailogIntegration.VO.FuelPlusVO;
import com.ibsplc.TailogIntegration.VO.TailogResponse;
import com.ibsplc.TailogIntegration.VO.WSO2Response;
import com.ibsplc.TailogIntegration.service.FuelPlusProxy;
import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;

@Service("fuelPlusProxy")
public class FuelPlusClientImpl implements FuelPlusProxy{

	private static final String CONFIGURATION_PROPERTIES = "/configuration.properties";
	
	private static final Logger LOGGER = Log4j2Logger.create(FuelPlusClientImpl.class);
	
	
	//public void fuelPlusWebServiceInvocation(TailogResponse tailogResponse) {
	public void fuelPlusWebServiceInvocation(WSO2Response wso2Response) {
		
		RestTemplate restTemplate=new RestTemplate();
		
		Properties prop = new Properties();
		InputStream inputStream;
		try {
		inputStream = getClass().getClassLoader().getResourceAsStream(CONFIGURATION_PROPERTIES);
		
		if (inputStream != null) {
			prop.load(inputStream);
		} else {
			throw new FileNotFoundException("property file " + CONFIGURATION_PROPERTIES + " not found in the classpath");
		}
		
		}catch(Exception e) {
			LOGGER.info("Exception occured while reading config.properties"+e);
		}
		
		String url=prop.getProperty("fuelplus.webservice.url");
		
		LOGGER.info("Fuel Plus wso2 endpoint:"+url);
		
		ResponseEntity<FuelPlusServiceResponse> response = null;
		
		try {
		response = restTemplate.postForEntity(url, wso2Response, FuelPlusServiceResponse.class);
		
		if(response!=null) {
			LOGGER.info("Status code :"+response.getStatusCodeValue());
			if(response.getStatusCodeValue()==200) {
				
				LOGGER.info("Successfully posted tailog response for Fuel Plus");
				
				LOGGER.info("Response Body"+response.getBody());
			}
		}
		}catch(Exception e) {
			LOGGER.info("Exception occured :"+e);
		}
		
	}
	
}
