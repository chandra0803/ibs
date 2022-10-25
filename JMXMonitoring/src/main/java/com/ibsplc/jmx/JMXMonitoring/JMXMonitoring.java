package com.ibsplc.jmx.JMXMonitoring;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Optional;
import java.util.logging.Logger;

import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.openmbean.CompositeData;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class JMXMonitoring {
	public static Logger logger = Logger.getLogger(JMXMonitoring.class.getName());
	
	private String getConnect() throws MalformedURLException, IOException{
		String host ="localhost";
		host="10.130.212.10";
		int port = 8686;
		HashMap map = new HashMap();
		String[] credentials = new String[2];
		credentials[0] = "ibsuser";
		credentials[1] = "#!bsu$er#123";
		map.put("jmx.remote.credentials", credentials);
		JMXConnector c = JMXConnectorFactory.newJMXConnector(createConnectionURL(host, port), map);
		c.connect();
		logger.info("JMX is connected");
		Object o = null;
		try {
			o = c.getMBeanServerConnection().getAttribute(new ObjectName("java.lang:type=Memory"), "HeapMemoryUsage");
		} catch (AttributeNotFoundException | InstanceNotFoundException | MalformedObjectNameException | MBeanException
				| ReflectionException e) {
			logger.severe("Exception during JMX monitoring process due to "+e.getMessage());			
			e.printStackTrace();
		}
		CompositeData cd = (CompositeData) o;
		logger.info("Getting Data from MBean:"+cd.get("committed"));
		String response = Optional.ofNullable(cd.get("committed").toString()).orElse( "No Response");
    	 
		return response;
	}
		private static JMXServiceURL createConnectionURL(String host, int port) throws MalformedURLException
		{
		    return new JMXServiceURL("rmi", "", 0, "/jndi/rmi://" + host + ":" + port + "/jmxrmi");
		}
	 
		@RequestMapping(value = { "/monitor" }, method = { RequestMethod.GET })
		public static String monitor(){
			JMXMonitoring jmxMonitoring = new JMXMonitoring();
			String response = "Response from JMX is ";
			try {
				  response = response + Optional.ofNullable(jmxMonitoring.getConnect()).orElse( "No Response");
		    		 
			} catch (MalformedURLException e1) {
				logger.severe("URLException during JMX monitoring process due to "+e1.getMessage());			 
			} catch (IOException e2) {
				logger.severe("IOException during JMX monitoring process due to "+e2.getMessage());			 
			}
			return response;
			 
		}
		
	public static void main(String arg[]){
		JMXMonitoring jmxMonitoring = new JMXMonitoring();
		try {
			jmxMonitoring.getConnect();
		} catch (MalformedURLException e1) {
			logger.severe("URLException during JMX monitoring process due to "+e1.getMessage());			 
		} catch (IOException e2) {
			logger.severe("IOException during JMX monitoring process due to "+e2.getMessage());			 
		}
		 
	}
}
