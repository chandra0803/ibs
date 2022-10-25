package com.ibsplc.TailogIntegration.service.impl;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibsplc.TailogIntegration.VO.TailogRestRequest;
import com.ibsplc.TailogIntegration.VO.TailogServiceResponse;
import com.ibsplc.TailogIntegration.VO.WSO2TailogResponse;
import com.ibsplc.TailogIntegration.service.TailogIflightService;
import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;

@Service("tailogIflightService")
public class TailogIflightServiceImpl implements TailogIflightService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final String CONFIGURATION_PROPERTIES = "/configuration.properties";
	
	//DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	public static final ZoneId southAfricaZoneID = ZoneId.of("Africa/Johannesburg");
	public static final ZoneId utc=ZoneId.of("Etc/UTC");
	
	private static final Logger log = Log4j2Logger.create(TailogServiceImpl.class);
	
	public void retrieveTailogIFlightObject(){
		
		log.info("Inside tailog service implementation class");
		
RestTemplate restTemplate = null;
String stdFromDate=null;
String stdToDate=null;
String updateDate=null;
try {
	restTemplate = restTemplate();
} catch (Exception e2) {
	// TODO Auto-generated catch block
	log.info("Exception occured while generating rest template instance:"+e2);
	e2.printStackTrace();
}
		
log.info("Loading CONFIGURATION_PROPERTIES...");
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
		
		DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		Connection conn= createJDBCConnection();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
        String flag=null;
        // SELECT query 
		ResultSet rs=selectUpdatedAfterValue(conn);
      
		String updatedAfter=null;
		LocalDateTime stdFromDateAsLocalDateTime=null;
		
        try {
        	
			if (rs.next()) 
			{ 
				flag="true";
				updatedAfter=rs.getString(2);
				log.info("Updated_after value : " + rs.getString(2)); 
				updateDate=updatedAfter.substring(0,19);
				/*
				LocalDateTime dateTime = LocalDateTime.parse(updateDate, formatter).minusHours(72).atZone(utc).toLocalDateTime();
		    	stdFromDate=dateTime.toString().replace("T", " ");
		    	*/
				ZonedDateTime zonedDateTime = LocalDateTime.parse(updateDate, formatter).minusHours(72).atZone(utc);
	    		stdFromDateAsLocalDateTime=zonedDateTime.toLocalDateTime();
	    		stdFromDate=stdFromDateAsLocalDateTime.format(formatter).toString();
	    		
	    		log.info("stdFromDate:"+stdFromDate);
	    		if(stdFromDate.contains("T")) {
	    			stdFromDate.replace("T", " ");
	    		}
		    	   
		   		log.info("stdFromDate:"+stdFromDate);
			} 
			else
			{ 
				log.info("No such user id is already registered"); 
				
				log.info("updateDate is null..stdFromDate=current time-72 hrs");
			       // stdFromDate=LocalDateTime.parse(updatedAfter.substring(0,19), formatter).toString();
			        	ZonedDateTime zonedDateTime = LocalDateTime.now().minusHours(72).atZone(utc);
			    		stdFromDateAsLocalDateTime=zonedDateTime.toLocalDateTime();
			    		stdFromDate=stdFromDateAsLocalDateTime.format(formatter).toString();
			    		updateDate=stdFromDateAsLocalDateTime.format(formatter).toString();
			    		log.info("stdFromDate:"+stdFromDate);
			    		if(stdFromDate.contains("T")) {
			    			stdFromDate.replace("T", " ");
			    			updateDate.replace("T", " ");
			    		}
			    		log.info("stdFromDate(after replacing 'T'):"+stdFromDate+",updateDate(after replacing 'T'):"+updateDate);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
        
        /*
       if(updateDate!=null) {
    	
	
        }
	
	else {
        	
        }*/
	

		ZonedDateTime zonedCurrentDateTime = LocalDateTime.now().atZone(utc);
		LocalDateTime stdToDateAsLocalDateTime=zonedCurrentDateTime.toLocalDateTime();
		stdToDate=stdToDateAsLocalDateTime.format(formatter).toString();
		
Duration duration=Duration.between(stdFromDateAsLocalDateTime, stdToDateAsLocalDateTime);
		
		long hours=(duration.getSeconds())/(60*60);
		
		if(hours>72) {
			
			log.info("From date is greater than 72 hrs");
			
			ZonedDateTime zonedDateTime = LocalDateTime.now().minusHours(72).atZone(utc);
    		stdFromDateAsLocalDateTime=zonedDateTime.toLocalDateTime();
    		stdFromDate=stdFromDateAsLocalDateTime.format(formatter).toString();
    		updateDate=stdFromDateAsLocalDateTime.format(formatter).toString();
    		log.info("stdFromDate:"+stdFromDate);
    		if(stdFromDate.contains("T")) {
    			stdFromDate.replace("T", " ");
    			updateDate.replace("T", " ");
    		}
    		log.info("New stdFromDate(after replacing 'T'):"+stdFromDate+",updateDate(after replacing 'T'):"+updateDate);
			
		}
		
		log.info("stdFromDate(utc):"+stdFromDate+",stdToDate(utc):"+stdToDate+",updatedAfter(utc):"+updateDate);
		if(stdFromDate.length()<19) {
			log.info("stdFromDate:"+stdFromDate);
			stdFromDate=new StringBuilder(stdFromDate).append(":00").toString();
			log.info("stdFromDate(after transformation):"+stdFromDate);
		}
		if(stdToDate.length()<19) {
			log.info("stdToDate:"+stdToDate);
			stdToDate=new StringBuilder(stdToDate).append(":00").toString();
			log.info("stdToDate(after transformation):"+stdToDate);
		}
		if(updateDate.length()<19) {
			log.info("updateDate:"+updateDate);
			updateDate=new StringBuilder(updateDate).append(":00").toString();
			log.info("updateDate(after transformation):"+updateDate);
		}
		
		TailogRestRequest request=new TailogRestRequest();
		request.setFromDate(stdFromDate);
		request.setToDate(stdToDate);
		request.setUpdateDate(updateDate);
		
		log.info("Request:"+request.toString());
		
		
		String url=prop.getProperty("tailog.iflight.webservice.url");
		
		log.info("WSO2 endpoint:"+url);
		
		/*
		ResponseEntity<WSO2TailogResponse> response = null;
		
		WSO2TailogResponse wso2TailogResponse=null;
		*/
		
		//ResponseEntity<WSO2TailogResponse> response = null;
		WSO2TailogResponse wso2TailogResponse=null;
		TailogServiceResponse tailogServiceResponse=null;
		ResponseEntity<String> response = null;
		
		try {
			log.info("Calling WSO2 endpoint...");
		//response = restTemplate.postForEntity(url,request, WSO2TailogResponse.class);
			response = restTemplate.postForEntity(url,request, String.class);
		
		if(response!=null) {
			log.info("Status code :"+response.getStatusCodeValue());
			if(response.getStatusCodeValue()==200) {
				
				log.info("Successfully called WSO2 endpoint to call Tailog service");
				
				//tailogServiceResponse=response.getBody().getTailogServiceResponse();
				
				//log.info(""+response.getBody().toString());
				String responseBody=response.getBody();
				log.info("responseBody as string:"+responseBody);
				
				JSONObject responseBodyJson = new JSONObject(responseBody);
				
				log.info("JSON:"+responseBodyJson.toString());
				String updatedAfterValue=(String) responseBodyJson.getJSONObject("TailogServiceResponse").get("updatedAfter");
				//String updatedAfterValue=tailogServiceResponse.getUpdatedAfter();
				log.info("updatedAfterValue:"+updatedAfterValue);
				int x = 0;
				
				if(updatedAfterValue.equals("0")) {
				log.info("Response Body:"+tailogServiceResponse);
				
				if(flag!=null) {
				if(flag.equalsIgnoreCase("true")) {
				// Updating database 
					log.info("Updating with stdToDate");
	            String updateQuery = "UPDATE airlinkdatabase.update_table set updated_after = '" + stdToDate +"' where id=2"; 
	            log.info("Update Query:"+updateQuery);
	            x = stmt.executeUpdate(updateQuery); 
				}else {
					log.info("Inserting with stdToDate");
					String insertQuery = "INSERT INTO airlinkdatabase.update_table (id,updated_after) VALUES (2,'" + stdToDate +"')"; 
		            log.info("Insert Query:"+insertQuery);
		            stmt.execute(insertQuery);
		            x=1;
				}
				}else {
					
					log.info("Flag value is null...Inserting with stdToDate");
					String insertQuery = "INSERT INTO airlinkdatabase.update_table (id,updated_after) VALUES (2,'" + stdToDate +"')"; 
		            log.info("Insert Query:"+insertQuery);
		            stmt.execute(insertQuery);
		            x=1;
				}
				
				}else {
					
					if(flag!=null) {
					if(flag.equalsIgnoreCase("true")) {
						log.info("Updating with stdFromDate");
					String updateQuery = "UPDATE airlinkdatabase.update_table set updated_after = '" + stdFromDate +"' where id=2"; 
		            log.info("Update Query:"+updateQuery);
		            x = stmt.executeUpdate(updateQuery);
					}else {
						log.info("Inserting with stdFromDate");
						String insertQuery = "INSERT INTO airlinkdatabase.update_table (id,updated_after) VALUES (2,'" + stdFromDate +"')"; 
			            log.info("Insert Query:"+insertQuery);
			            stmt.execute(insertQuery);
			            x=1;
					}
					}else {
						
						log.info("Flag is null...Inserting with stdFromDate");
						String insertQuery = "INSERT INTO airlinkdatabase.update_table (id,updated_after) VALUES (2,'" + stdFromDate +"')"; 
			            log.info("Insert Query:"+insertQuery);
			            stmt.execute(insertQuery);
			            x=1;
						
					}
				
				
				}
	              
	            if (x > 0)             
	            	log.info("Updated/Inserted the value 'updated_after' successfully");             
	            else            
	            	log.info("Error occured during updating the value 'updated_after'"); 
	              
	            
			}
		}
		}catch(Exception e) {
			log.info("Exception occured :"+e);
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.info("Exception occured during connection closing:"+e);
			e.printStackTrace();
		}
	}
	
	public Connection createJDBCConnection() {
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
				log.info("Exception occured while reading config.properties"+e);
			}
		Connection conn=null;
		try
	    {
	      // Step 1: "Load" the JDBC driver
	      //Class.forName("com.mysql.jdbc.Driver");
			Class.forName(prop.getProperty("jdbc.driverClassName"));

	      // Step 2: Establish the connection to the database 
	      String url = prop.getProperty("jdbc.url"); 
	      conn = DriverManager.getConnection(url,prop.getProperty("jdbc.username"),prop.getProperty("jdbc.password"));  
	    }
	    catch (Exception e)
	    {
	    	log.info("Exception occured during establishing DB connectivity:"+e); 
	    } 
		return conn;
		
	}
	public RestTemplate restTemplate() throws Exception {
		
		/*
	HttpComponentsClientHttpRequestFactory requestFactory =
	            new HttpComponentsClientHttpRequestFactory();

	int timeout = 300000;

	log.info("Setting timeout values.....");
	requestFactory.setConnectTimeout(timeout);
	requestFactory.setReadTimeout(timeout);
	requestFactory.setConnectionRequestTimeout(timeout);

	RestTemplate restTemplate = new RestTemplate(requestFactory);
	*/
		int timeout = 300000;
		
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.setRequestFactory(new SimpleClientHttpRequestFactory());
		
		SimpleClientHttpRequestFactory rf = (SimpleClientHttpRequestFactory) restTemplate
		.getRequestFactory();
		
		rf.setConnectTimeout(timeout);
		rf.setReadTimeout(timeout);

	return restTemplate;
	}
	
	public ResultSet selectUpdatedAfterValue(Connection  conn) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		  String selectQuery = "select * from airlinkdatabase.update_table where id=2"; 
	        ResultSet rs = null;
			try {
				rs = stmt.executeQuery(selectQuery);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
			return rs;
	}

}
