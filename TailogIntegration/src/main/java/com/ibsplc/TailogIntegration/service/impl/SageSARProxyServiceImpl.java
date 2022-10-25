package com.ibsplc.TailogIntegration.service.impl;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Properties;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibsplc.TailogIntegration.VO.SageRequest;
import com.ibsplc.TailogIntegration.VO.SageSARServiceResponse;
import com.ibsplc.TailogIntegration.VO.SageServiceResponse;
import com.ibsplc.TailogIntegration.VO.TailogRestRequest;
import com.ibsplc.TailogIntegration.VO.TailogServiceResponse;
import com.ibsplc.TailogIntegration.VO.WSO2SageResponse;
import com.ibsplc.TailogIntegration.VO.WSO2SageSARResponse;
import com.ibsplc.TailogIntegration.VO.WSO2TailogResponse;
import com.ibsplc.TailogIntegration.service.SageSARProxyService;
import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;

@Service("sageSARProxyService")
public class SageSARProxyServiceImpl implements SageSARProxyService{
	
	private static final String CONFIGURATION_PROPERTIES = "/configuration.properties";
	
	public static final ZoneId southAfricaZoneID = ZoneId.of("Africa/Johannesburg");
	public static final ZoneId utc=ZoneId.of("Etc/UTC");
	
	private static final Logger log = Log4j2Logger.create(SageProxyServiceImpl.class);
	
	@Override
	public void retrieveSageSARFile() {
	
	log.info("Inside tailog service implementation class");
	
RestTemplate restTemplate = null;

try {
	restTemplate = restTemplate();
} catch (Exception e2) {
	// TODO Auto-generated catch block
	log.info("Exception occured while generating rest template instance:"+e2);
	e2.printStackTrace();
}


Properties prop = new Properties();
InputStream inputStream;
try {
inputStream = getClass().getClassLoader().getResourceAsStream(CONFIGURATION_PROPERTIES);

if (inputStream != null) {
	log.info("CONFIGURATION_PROPERTIES is not null");
	prop.load(inputStream);
} else {
	throw new FileNotFoundException("property file " + CONFIGURATION_PROPERTIES + " not found in the classpath");
}

}catch(Exception e) {
	log.info("Exception occured while reading config.properties"+e);
}

SageRequest request=new SageRequest();

request.setCurrentDate(LocalDate.now().toString());

log.info("Request SAR:"+request.toString());


String url=prop.getProperty("sageSAR.webservice.url");

log.info("WSO2 Sage SAR endpoint:"+url);



//ResponseEntity<WSO2SageSARResponse> response = null;
ResponseEntity<String> response = null;
SageSARServiceResponse sageServiceResponse=null;
try {
	log.info("Calling WSO2 endpoint...");
//response = restTemplate.postForEntity(url,request, WSO2TailogResponse.class);
	response = restTemplate.postForEntity(url,request, String.class);

if(response!=null) {
	log.info("Status code :"+response.getStatusCodeValue());
	if(response.getStatusCodeValue()==200) {
		
		log.info("Successfully called WSO2 endpoint to call Sage service");

		if(response.getBody()!=null) {
			log.info("Response body is present");
			
			
		log.info("Result SAR Message: "+response.getBody().toString());
			
		}else {
			log.info("Response body is null");
		}
	}
}else {
	log.info("No response received");
}
}catch(Exception e) {
	log.info("Exception occured : "+e);
}
		
	}
	
	public RestTemplate restTemplate() throws Exception {
		

		int timeout = 300000;
		
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.setRequestFactory(new SimpleClientHttpRequestFactory());
		
		SimpleClientHttpRequestFactory rf = (SimpleClientHttpRequestFactory) restTemplate
		.getRequestFactory();
		
		rf.setConnectTimeout(timeout);
		rf.setReadTimeout(timeout);

	return restTemplate;
	}


}