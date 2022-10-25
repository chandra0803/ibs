package com.ibsplc.TailogIntegration.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Properties;

import org.json.CDL;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.ibsplc.TailogIntegration.VO.FuelPlusServiceResponse;
import com.ibsplc.TailogIntegration.VO.IFlightLiteVO;
import com.ibsplc.TailogIntegration.VO.IFlightResponse;
import com.ibsplc.TailogIntegration.VO.TailogResponse;
import com.ibsplc.TailogIntegration.VO.WSO2Response;
import com.ibsplc.TailogIntegration.service.IFlightProxy;
import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;
import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import org.apache.commons.io.FileUtils;

@Service("iFlightProxy")
public class IFlightClientImpl implements IFlightProxy{


	private static final String CONFIGURATION_PROPERTIES = "/configuration.properties";
	
	private static final Logger LOGGER = Log4j2Logger.create(IFlightClientImpl.class);
	
	public static final ZoneId southAfricaZoneID = ZoneId.of("Africa/Johannesburg");
	
	//public void iFlightLiteWebServiceInvocation(TailogResponse tailogResponse) {
	public void iFlightLiteWebServiceInvocation(WSO2Response wso2Response) {
		
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
		
		String url=prop.getProperty("iFlight.webservice.url");
		
		LOGGER.info("IFlight wso2 endpoint:"+url);
		
		ResponseEntity<IFlightResponse> response = null;
		
		IFlightResponse iFlightResponse=null;
		
		try {
		response = restTemplate.postForEntity(url, wso2Response, IFlightResponse.class);
		
		if(response!=null) {
			LOGGER.info("Status code :"+response.getStatusCodeValue());
			if(response.getStatusCodeValue()==200) {
				
				LOGGER.info("Successfully posted tailog response for iFlight");
				
				iFlightResponse=response.getBody();
				
				LOGGER.info("Response Body"+iFlightResponse);
			}
		}
		}catch(Exception e) {
			LOGGER.info("Exception occured :"+e);
		}
		
	}
		
	   
		
		
		
	}



	 
