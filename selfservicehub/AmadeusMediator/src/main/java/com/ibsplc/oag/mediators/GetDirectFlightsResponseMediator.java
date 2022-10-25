package com.ibsplc.oag.mediators;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.NamespaceContext;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.stream.Location;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.axiom.soap.SOAPBody;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.oag.vo.DirectFlightsResponse;
import com.ibsplc.oag.vo.FlightListResponse;
import com.ibsplc.oag.vo.GetDirectFlightsResponse;
import com.ibsplc.oag.vo.NamespaceFilter;
import com.ibsplc.oag.vo.ObjectFactory;

import java.io.StringReader;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;


public class GetDirectFlightsResponseMediator extends AbstractMediator {

	final static Logger log = Logger.getLogger(GetDirectFlightsResponseMediator.class.getName());

	
	public boolean mediate(MessageContext context) {
		// TODO Auto-generated method stub

		FlightListResponse flightListResponse=new FlightListResponse(new ArrayList<DirectFlightsResponse>());
		
		log.info("Entering GetDirectFlightsResponseMediator");
		final String xmlFilePath = "/projects/airlink/OAG/DirectFlights.xml";
		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();
		log.info("SOAP Message : "+soapMessage);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		 
		Unmarshaller unmarshaller;
		JAXBContext jc;
		
		try{
			log.info("newInstance of JAXBContext");
			jc = JAXBContext.newInstance(GetDirectFlightsResponse.class);
			log.info("Create Unmarshaller...");
			unmarshaller = jc.createUnmarshaller();

			
			log.info("Unmarshalling...");
			/*
			GetDirectFlightsResponse getDirectFlightsResponse = (GetDirectFlightsResponse) unmarshaller
					.unmarshal(inputStream);
					*/
			GetDirectFlightsResponse getDirectFlightsResponse = (GetDirectFlightsResponse) unmarshaller.unmarshal(inputStream);
			
			List<DirectFlightsResponse> listOfFlights=flightListResponse.getListOfFlights();
			
			//GetDirectFlightsResponse getDirectFlightsResponse=root.getValue();
			
			log.info("GetDirectFlightsResponse : "+getDirectFlightsResponse.toString());
			
			log.info("Getting CbXmlResponse ...");
			String response=getDirectFlightsResponse.getReturn().getCbXmlResponse();
			
			log.info("Response :"+response);
			
			if(response.startsWith("<![CDATA[")){
				response.replaceAll("<![CDATA[", "");
			}
			
			if(response.endsWith("]]>")){
				response.replaceAll("]]>", "");
			}
			log.info("CbXmlResponse:"+response);
			
			//Use method to convert XML string content to XML Document object
	        Document doc = convertStringToXMLDocument( response ,context);
	        
	        String firNodeName=doc.getFirstChild().getNodeName();
	        log.info("First node name:"+firNodeName);
	        
	        //Normalize the xml document - optional, but recommended
	        doc.getDocumentElement().normalize();
	        
	        log.info("Root element :" + doc.getDocumentElement().getNodeName());
			
	        if(doc.getElementsByTagName("Flight")!=null){
	    	NodeList nList = doc.getElementsByTagName("Flight");
	    	
	    	for (int temp = 0; temp < nList.getLength(); temp++) {

	    		Node nNode = nList.item(temp);
	    				
	    		System.out.println("\nCurrent Element :" + nNode.getNodeName());
	    		
	    		DirectFlightsResponse directFlightsResponse=new DirectFlightsResponse();
	    				
	    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

	    			Element eElement = (Element) nNode;
	    			
	    			String carrierName=null;
	    			
	    			if(eElement.getAttribute("ArrDayOffset")!=null)
	    			directFlightsResponse.setArrivalDayOffset(eElement.getAttribute("ArrDayOffset").trim());
	    			log.info("ArrivalDayOffset : "+directFlightsResponse.getArrivalDayOffset());
	    			
	    			if(eElement.getAttribute("ElapsedTime")!=null){
	    			int elapsedTime=Integer.parseInt(eElement.getAttribute("ElapsedTime"));
	    			int hours = elapsedTime / 60;
	    	        //int hoursToDisplay = hours;
	    	        
	    	        String hoursToDisplay = null;
	    	        if(hours == 0 ) hoursToDisplay = "00";     
	    	        else if( hours < 10 ) hoursToDisplay = "0" + hours ;
	    	        else hoursToDisplay = "" + hours ;

	    	        int minutesToDisplay = elapsedTime - (hours * 60);

	    	        String minToDisplay = null;
	    	        if(minutesToDisplay == 0 ) minToDisplay = "00";     
	    	        else if( minutesToDisplay < 10 ) minToDisplay = "0" + minutesToDisplay ;
	    	        else minToDisplay = "" + minutesToDisplay ;

	    	        String displayValue = hoursToDisplay + ":" + minToDisplay;
	    	        directFlightsResponse.setFlightDuration(displayValue);
	    			}
	    	        
	    	        log.info("Flight duration : "+directFlightsResponse.getFlightDuration());
	    			
	    	        if((Element)eElement.getElementsByTagName("Dep").item(0)!=null){
	    			Element depElement = (Element)eElement.getElementsByTagName("Dep").item(0);
	    			log.info("Frequency : "+depElement.getAttribute("Frequency"));
	    			if(depElement.getAttribute("Frequency")!=null)
	    			directFlightsResponse.setFrequency(depElement.getAttribute("Frequency"));
	    			log.info("Frequency:"+directFlightsResponse.getFrequency());
	    			
	    			if(depElement.getAttribute("KM")!=null)
	    			directFlightsResponse.setFlightDistance(depElement.getAttribute("KM")+"KM");
	    			log.info("Flight Distance :"+directFlightsResponse.getFlightDistance());
	    			
	    			if(depElement.getAttribute("DepTime")!=null){
	    			log.info("DepTime : "+depElement.getAttribute("DepTime").substring(11));
	    			directFlightsResponse.setDepartureDate(depElement.getAttribute("DepTime").substring(0,10));
	    			directFlightsResponse.setDepartureTime(depElement.getAttribute("DepTime").substring(11).trim());
	    			}
	    			log.info("Departure Date:"+directFlightsResponse.getDepartureDate());
	    			log.info("Departure Time:"+directFlightsResponse.getDepartureTime());
	    	        }
	    	        
	    	        
	    	        /*
	    			 * Setting effective from and effective to dates for 1st flight
	    			 */
	    			if((Element)eElement.getElementsByTagName("EffFrom").item(0)!=null){
	    				
	    				Element effFrom=(Element)eElement.getElementsByTagName("EffFrom").item(0);
	    				
	    				if(effFrom.getTextContent()!=null){
	    					directFlightsResponse.setEffectiveFrom(effFrom.getTextContent());
	    				}
	    			}
	    			
	    			if((Element)eElement.getElementsByTagName("EffTo").item(0)!=null){
	    				
	    				Element effTo=(Element)eElement.getElementsByTagName("EffTo").item(0);
	    				
	    				if(effTo.getTextContent()!=null){
	    					directFlightsResponse.setEffectiveTo(effTo.getTextContent());
	    				}
	    			}

	    	        if((Element)eElement.getElementsByTagName("Carrier").item(0)!=null){
	    			Element carrierElement = (Element)eElement.getElementsByTagName("Carrier").item(0);
	    			log.info("Carrier code:"+carrierElement.getAttribute("Code")+", Service Number:"+carrierElement.getAttribute("ServiceNumber"));
	    			directFlightsResponse.setFlightNumber(new StringBuffer().append(carrierElement.getAttribute("Code").trim()).append(carrierElement.getAttribute("ServiceNumber").trim()).toString());
	    			if(carrierElement.getTextContent()!=null)
	    			carrierName=carrierElement.getTextContent();
	    	        }
	    			log.info("Flight Number:"+directFlightsResponse.getFlightNumber());
	    			
	    			
	    			if((Element)eElement.getElementsByTagName("Arr").item(0)!=null){
	    			Element arrElement = (Element)eElement.getElementsByTagName("Arr").item(0);
	    			if(arrElement.getAttribute("ArrTime")!=null){
	    			log.info("ArrTime : "+arrElement.getAttribute("ArrTime"));
	    			directFlightsResponse.setArrivalDate(arrElement.getAttribute("ArrTime").substring(0,10));
	    			directFlightsResponse.setArrivalTime(arrElement.getAttribute("ArrTime").substring(11).trim());
	    			}
	    			if(arrElement.getElementsByTagName("Port").item(0)!=null){
	    				
	    				Element arrivalPortElement = (Element)arrElement.getElementsByTagName("Port").item(0);
	    				
	    				if(arrivalPortElement.getAttribute("PortCode")!=null)
	    					directFlightsResponse.setArrPortCode(arrivalPortElement.getAttribute("PortCode"));
	    				if(arrivalPortElement.getTextContent()!=null)
	    					directFlightsResponse.setArrPortName(arrivalPortElement.getTextContent());
	    			}
	    			
	    		}
	    			log.info("Arrival Date : "+directFlightsResponse.getArrivalDate());
	    			log.info("Arrival Time:"+directFlightsResponse.getArrivalTime());
	    			log.info("Arrival Port : "+directFlightsResponse.getArrPortCode());
	    			log.info("Arrival Port Name : "+directFlightsResponse.getArrPortName());
	    			
	    			if((Element)eElement.getElementsByTagName("SAD").item(0)!=null){
	    			Element sadElement = (Element)eElement.getElementsByTagName("SAD").item(0);
	    			log.info("SADName : "+sadElement.getAttribute("SADName"));
	    			if(sadElement.getAttribute("SADName").equalsIgnoreCase("Sa Airlink")){
	    			
	    			if(directFlightsResponse.getFlightNumber().contains("SA"))
	    				directFlightsResponse.setAirline("Airlink in cooperation with "+carrierName);
	    				else if(directFlightsResponse.getFlightNumber().contains("4Z"))
	    					directFlightsResponse.setAirline("Airlink");
	    			}else{
	    				
	    				directFlightsResponse.setAirline(sadElement.getAttribute("SADName").trim());
	    			}
	    			}else{
	    				directFlightsResponse.setAirline(carrierName);
	    			}
	    			log.info("Airline:"+directFlightsResponse.getAirline());
	    			
	    			if((Element)eElement.getElementsByTagName("Equipment").item(0)!=null){
	    			Element equipElement = (Element)eElement.getElementsByTagName("Equipment").item(0);
	    			
	    			if(equipElement.getAttribute("Code")!=null||equipElement.getTextContent()!=null ){
	    				log.info("Equipment Code : "+equipElement.getAttribute("Code"));
	    			directFlightsResponse.setAircraftType(new StringBuffer().append(equipElement.getAttribute("Code").trim()).append("-").append(equipElement.getTextContent().trim()).toString());
	    			}
	    			}
	    			log.info("Aircraft Type:"+directFlightsResponse.getAircraftType());
	    			
	    			
	    			if((Element)eElement.getElementsByTagName("Port").item(0)!=null){
	    				
	    				Element portElement = (Element)eElement.getElementsByTagName("Port").item(0);
	    				if(portElement.getAttribute("PortCode")!=null)
	    				directFlightsResponse.setDepPortCode(portElement.getAttribute("PortCode"));
	    				if(portElement.getTextContent()!=null)
	    					directFlightsResponse.setDepPortName(portElement.getTextContent());
	    			}
	    			
	    			log.info("Departure Port Code : "+directFlightsResponse.getDepPortCode());
	    			log.info("Departure Port Name : "+directFlightsResponse.getDepPortName());
	    			

	    		}
	    		
	    		if(directFlightsResponse!=null)
	    			listOfFlights.add(directFlightsResponse);
	    	}
		}
	    	ObjectMapper mapperObj = new ObjectMapper();
    		String jsonResponse = null;
	    	if(listOfFlights!=null){
				jsonResponse = mapperObj.writeValueAsString(listOfFlights);
	    	context.setProperty("flightListResponse", jsonResponse.toString());
	    	}
	    	else{
	    		log.info("listOfFlights is null");
	    		context.setProperty("flightListResponse", null);
	    	}
			
		}catch(Exception e){
			log.info("Exception occured:"+e);
			context.setProperty("getDirectFlightsErrorMessage", e.getMessage());
		}
		return true;
	}
	
	 private static Document convertStringToXMLDocument(String xmlString,MessageContext context) 
	    {
	        //Parser that produces DOM object trees from XML content
	        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	         
	        //API to obtain DOM Document instance
	        DocumentBuilder builder = null;
	        try
	        {
	            //Create DocumentBuilder with default configuration
	            builder = factory.newDocumentBuilder();
	             
	            //Parse the content to Document object
	            Document doc = builder.parse(new InputSource(new StringReader(xmlString)));
	            return doc;
	        } 
	        catch (Exception e) 
	        {
	        	log.info("Exception occured while converting the string to xml:"+e);
	        	context.setProperty("getDirectFlightsErrorMessage", e.getMessage());
	           // e.printStackTrace();
	        }
	        return null;
	    }

	

}