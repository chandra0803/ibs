package com.ibsplc.notificationhub.security.fix;

import java.util.Arrays;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@RestController
public class NotificationHubSecurityFix {
	
	//private static final String AMADEUS_WS_PROPERTIES = "amadeusWS.properties";
	
	 private static final Logger LOGGER = LoggerFactory.getLogger(NotificationHubSecurityFix.class);
	
	//public static final String REST_SERVICE_URL = "http://localhost:8080/notificationhub/auth";
	//private static Properties amadeusWSProperties;
	
	
	
	//@GetMapping("/auth")
	//@PostMapping("/auth1")
	public ResponseEntity<String> getAuthDetails() {
		LOGGER.info("getAuthDetails");
		 HttpHeaders httpHeaders=null;
		 ResponseEntity<String> response = null;
		try {
		RestTemplate restTemplate = new RestTemplate();
		//String url = amadeusWSProperties.getProperty("AMADEUS_PNR_LIST_ENDPOINT");
		//String url=REST_SERVICE_URL;
		  httpHeaders = new HttpHeaders();
		  httpHeaders.set("x-auth-channel" , "Notification@IBST");
		  httpHeaders.set("x-auth-token ", "Notification12@token$$");
		    httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 
		
		    response= restTemplate.postForEntity(null, httpHeaders, String.class);
		    LOGGER.info("response--:"+response);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return response;
		
	}
	

}  