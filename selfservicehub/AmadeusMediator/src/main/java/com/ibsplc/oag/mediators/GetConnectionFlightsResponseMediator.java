package com.ibsplc.oag.mediators;

import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.oag.vo.ConnectionFlights;
import com.ibsplc.oag.vo.ConnectionFlightsList;
import com.ibsplc.oag.vo.ConnectionsFlightListResponse;
import com.ibsplc.oag.vo.ConnectionsFlightsResponse;
import com.ibsplc.oag.vo.GetConnectionsResponse;

public class GetConnectionFlightsResponseMediator extends AbstractMediator{

	final static Logger log = Logger.getLogger(GetConnectionFlightsResponseMediator.class.getName());
	
	public boolean mediate(MessageContext context) {
		// TODO Auto-generated method stub

		ConnectionsFlightListResponse flightListResponse=new ConnectionsFlightListResponse(new ArrayList<ConnectionsFlightsResponse>());
		
		log.info("Entering GetConnectionFlightsResponseMediator");
		final String xmlFilePath = "/projects/airlink/OAG/ConnectionsFlights.xml";
		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();
		log.info("SOAP Message : "+soapMessage);
		ByteArrayInputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		 
		Unmarshaller unmarshaller;
		JAXBContext jc;
		
		try{
			log.info("newInstance of JAXBContext");
			jc = JAXBContext.newInstance(GetConnectionsResponse.class);
			log.info("Create Unmarshaller...");
			unmarshaller = jc.createUnmarshaller();

			
			log.info("Unmarshalling...");
			/*
			GetDirectFlightsResponse getDirectFlightsResponse = (GetDirectFlightsResponse) unmarshaller
					.unmarshal(inputStream);
					*/
			GetConnectionsResponse getConnectionsResponse = (GetConnectionsResponse) unmarshaller.unmarshal(inputStream);
			
			List<ConnectionsFlightsResponse> listOfFlights=flightListResponse.getConnectionsFlightResponse();
			
			//GetDirectFlightsResponse getDirectFlightsResponse=root.getValue();
			
			log.info("GetConnectionsResponse : "+getConnectionsResponse.toString());
			
			log.info("Getting CbXmlResponse ...");
			String response=getConnectionsResponse.getReturn().getCbXmlResponse();
			
			log.info("Response :"+response);
			
			if(response.startsWith("<![CDATA[")){
				response.replaceAll("<![CDATA[", "");
			}
			
			if(response.endsWith("]]>")){
				response.replaceAll("]]>", "");
			}
			log.info("CbXmlResponse:"+response);
			
			//Use method to convert XML string content to XML Document object
	        Document doc = convertStringToXMLDocument( response );
	        
	        String firNodeName=doc.getFirstChild().getNodeName();
	        log.info("First node name : "+firNodeName);
	        
	        //Normalize the xml document - optional, but recommended
	        doc.getDocumentElement().normalize();
	        
	        log.info("Root element : " + doc.getDocumentElement().getNodeName());
			
	        if(doc.getElementsByTagName("Flight")!=null){
	    	NodeList nList = doc.getElementsByTagName("Flight");
	    	
	    	for (int temp = 0; temp < nList.getLength(); temp++) {

	    		Node nNode = nList.item(temp);
	    				
	    		System.out.println("\nCurrent Element 1 : " + nNode.getNodeName());
	    		
	    		ConnectionsFlightsResponse connectionsFlightsResponse=new ConnectionsFlightsResponse();
	    				
	    		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	    			
	    			
	    			List<ConnectionFlights> listOfConnectionFlights=new ArrayList<ConnectionFlights>();
	    			ConnectionFlights connectionFlights1=new ConnectionFlights();
    	    		ConnectionFlights connectionFlights2=new ConnectionFlights();
    	    		ConnectionFlightsList connectionFlightListVO=new ConnectionFlightsList();
    	    		
    	    		String carrierName1=null;
    	    		String carrierName2=null;
    	    		

	    			Element eElement = (Element) nNode;
	    			/*
	    			 * Setting the ground time
	    			 */
	    			if(eElement.getAttribute("GroundTime1")!=null)
	    			connectionsFlightsResponse.setGroundTime(eElement.getAttribute("GroundTime1").trim());
	    			log.info("Ground Time 1 : "+connectionsFlightsResponse.getGroundTime());
	    			
	    			/*
	    			 * Setting arrival day offset
	    			 */
	    			if(eElement.getAttribute("ArrDayOffset")!=null)
	    			connectionsFlightsResponse.setArrivalDayOffset(eElement.getAttribute("ArrDayOffset").trim());
	    			log.info("ArrivalDayOffset 1 : "+connectionsFlightsResponse.getArrivalDayOffset());
	    			
	    			if(eElement.getAttribute("ElapsedTime")!=null){
	    			int elapsedTime=Integer.parseInt(eElement.getAttribute("ElapsedTime"));
	    			Map<String,String> map=convertMinutes(elapsedTime);

	    	        /*
	    	         * Setting total travel time
	    	         */
	    	        String displayValue = map.get("hoursToDisplay") + ":" + map.get("minToDisplay");
	    	        connectionsFlightsResponse.setTotalElapsedTime(displayValue);
	    			}
	    	        log.info("Total Elapsed Time 1 : "+connectionsFlightsResponse.getTotalElapsedTime());
    	    		
    	    		 /*
    	    		  * Parsing Dep tag - starts
    	    		  */
	    	        
	    	        String dep1Stops=null;
	    	        String dep2Stops=null;
	    	        String seqNum=null;

	    	        if(eElement.getElementsByTagName("Dep").item(0)!=null){

	    	    		Node depNode = eElement.getElementsByTagName("Dep").item(0);
	    	    		
	    	    		log.info("\nCurrent Node :" + depNode.getNodeName());
	    	    		
	    	    			
	    	    			log.info(depNode.getNodeName()+" is an element node");
	    	    			Element depElement = (Element) depNode;
	    			
	    			//Element depElement = (Element)eElement.getElementsByTagName("Dep").item(0);
	    	    			
	    	    			if(depElement.getAttribute("Stops")!=null){
	    	    				log.info("No.of stops for 1st flight : "+depElement.getAttribute("Stops"));
	    	    				//connectionFlights1.setNoOfStops(depElement.getAttribute("Stops"));
	    	    				dep1Stops=depElement.getAttribute("Stops");
	    	    			}
	    	    			
	    	    			if(depElement.getAttribute("Frequency")!=null){
	    			log.info("Frequency 1 : "+depElement.getAttribute("Frequency"));
	    			connectionFlights1.setFrequency(depElement.getAttribute("Frequency"));
	    	    			}
	    			log.info("Frequency 1 :"+connectionFlights1.getFrequency());
	    			
	    			if(depElement.getAttribute("ElapsedTime")!=null){
	    			log.info("ElapsedTime 1 : "+depElement.getAttribute("ElapsedTime"));
	    			Map<String,String> elapsedTime1Map=convertMinutes(Integer.parseInt(depElement.getAttribute("ElapsedTime")));
	    			String flightDuration1 = elapsedTime1Map.get("hoursToDisplay") + ":" + elapsedTime1Map.get("minToDisplay");
	    			connectionFlights1.setFlightDuration(flightDuration1);
	    			}
	    			log.info("Flight Duration 1 :"+connectionFlights1.getFlightDuration());
	    			
	    			if(depElement.getAttribute("DepTime")!=null){
	    			log.info("DepTime 1 : "+depElement.getAttribute("DepTime").substring(11));
	    			connectionFlights1.setDepartureDate(depElement.getAttribute("DepTime").substring(0,10));
	    			connectionFlights1.setDepartureTime(depElement.getAttribute("DepTime").substring(11).trim());
	    			}
	    			log.info("Departure Time 1 :"+connectionFlights1.getDepartureTime());
	    			
	    			if(depElement.getAttribute("KM")!=null){
	    			log.info("Flight distance(in KM)"+depElement.getAttribute("KM"));
	    			connectionFlights1.setFlightDistance(depElement.getAttribute("KM")+"KM");
	    			}
	    			log.info("Flight Distance 1 :"+connectionFlights1.getFlightDistance());
	    			
	    			
	    			/*
	    			 * Setting effective from and effective to dates for 1st flight
	    			 */
	    			if((Element)depElement.getElementsByTagName("EffFrom").item(0)!=null){
	    				
	    				Element effFrom=(Element)depElement.getElementsByTagName("EffFrom").item(0);
	    				
	    				if(effFrom.getTextContent()!=null){
	    					connectionFlights1.setEffectiveFrom(effFrom.getTextContent());
	    				}
	    			}
	    			
	    			if((Element)depElement.getElementsByTagName("EffTo").item(0)!=null){
	    				
	    				Element effTo=(Element)depElement.getElementsByTagName("EffTo").item(0);
	    				
	    				if(effTo.getTextContent()!=null){
	    					connectionFlights1.setEffectiveTo(effTo.getTextContent());
	    				}
	    			}
	    			
	    			/*
	    			 *Setting flight number for 1st flight 
	    			 */
	    			if((Element)depElement.getElementsByTagName("Carrier").item(0)!=null){
	    			Element carrierElement = (Element)depElement.getElementsByTagName("Carrier").item(0);
	    			log.info("Carrier code 1 :"+carrierElement.getAttribute("Code")+", Service Number:"+carrierElement.getAttribute("ServiceNumber"));
	    			connectionFlights1.setFlightNumber(new StringBuffer().append(carrierElement.getAttribute("Code").trim()).append(carrierElement.getAttribute("ServiceNumber").trim()).toString());
	    			if(carrierElement.getTextContent()!=null)
	    			carrierName1=carrierElement.getTextContent();
	    			
	    			}
	    			log.info("Flight Number 1 :"+connectionFlights1.getFlightNumber());
	    			
	    			/*
	    			 * Setting departing port code and name for 1st flight
	    			 */
	    			if((Element)depElement.getElementsByTagName("Port").item(0)!=null){
	    			Element depPortElement = (Element)depElement.getElementsByTagName("Port").item(0);
	    			if(depPortElement.getAttribute("PortCode")!=null)
	    			connectionFlights1.setDeparturePortCode(depPortElement.getAttribute("PortCode"));
	    			if(depPortElement.getTextContent()!=null)
	    			connectionFlights1.setDeparturePortName(depPortElement.getTextContent());
	    			}
	    			log.info("Port code 1 : "+connectionFlights1.getDeparturePortCode()+", Port Name : "+connectionFlights1.getDeparturePortName());
	    			
	    			if((Element)depElement.getElementsByTagName("Country").item(0)!=null){
		    			Element depCountryElement = (Element)depElement.getElementsByTagName("Country").item(0);
		    			if(depCountryElement.getTextContent()!=null)
		    			connectionFlights1.setDepartingCountry(depCountryElement.getTextContent());
		    			}
	    			
	    			if((Element)depElement.getElementsByTagName("SAD").item(0)!=null){
	    			Element sadElement = (Element)depElement.getElementsByTagName("SAD").item(0);
	    			log.info("SADName : "+sadElement.getAttribute("SADName"));
	    			if(sadElement.getAttribute("SADName").equalsIgnoreCase("Sa Airlink")){
	    				if(connectionFlights1.getFlightNumber().contains("SA"))
		    				connectionFlights1.setAirline("Airlink in cooperation with "+carrierName1);
		    				else if(connectionFlights1.getFlightNumber().contains("4Z"))
			    				connectionFlights1.setAirline("Airlink");
	    			}else{
	    				connectionFlights1.setAirline(sadElement.getAttribute("SADName").trim());
	    			}
	    			}else{
	    				connectionFlights1.setAirline(carrierName1);
	    			}
	    			log.info("Airline 1 :"+connectionFlights1.getAirline());
	    			
	    			if((Element)depElement.getElementsByTagName("Equipment").item(0)!=null){
	    			Element equipElement = (Element)depElement.getElementsByTagName("Equipment").item(0);
	    			log.info("Equipment Code 1 : "+equipElement.getAttribute("Code"));
	    			connectionFlights1.setAircraftType(new StringBuffer().append(equipElement.getAttribute("Code").trim()).append("-").append(equipElement.getTextContent().trim()).toString());
	    			}
	    			log.info("Aircraft Type 1 :"+connectionFlights1.getAircraftType());
	    			
	    			
	    			if(depElement.getElementsByTagName("Term").item(0)!=null){
	    			Element termElement = (Element)depElement.getElementsByTagName("Term").item(0);
	    			if(termElement.getTextContent()!=null){
	    			log.info("Terminal 1 : "+termElement.getTextContent());
	    			connectionFlights1.setTerminal(termElement.getTextContent().trim());
	    			}
	    			}
	    			log.info("Terminal 1 : "+connectionFlights1.getTerminal());
	    		}
	    	        /*
	    			 * Parsing Dep tag -ends
	    			 */
	    			
	    			/*
	    			 * Parsing Via tag - starts
	    			 */
	    	        if(eElement.getElementsByTagName("Via").item(0)!=null){
	    			Node viaNode = eElement.getElementsByTagName("Via").item(0);
	    			
	    			Element viaElement = (Element) viaNode;
	    			
	    			if(viaElement.getAttribute("SeqNum")!=null)
	    			seqNum=viaElement.getAttribute("SeqNum");
	    			
	    			/*
	    			 * Setting arrival time for 1st flight
	    			 */
	    			if((Element)viaElement.getElementsByTagName("Arr").item(0)!=null){
	    			Element arr1Element = (Element)viaElement.getElementsByTagName("Arr").item(0);
	    			
	    			if(arr1Element.getAttribute("ArrTime")!=null){
	    			log.info("ArrTime 1 : "+arr1Element.getAttribute("ArrTime"));
	    			connectionFlights1.setArrivalDate(arr1Element.getAttribute("ArrTime").substring(0,10));
	    			connectionFlights1.setArrivalTime(arr1Element.getAttribute("ArrTime").substring(11).trim());
	    			}
	    			/*
	    			 * Setting arrival port code and port name for 1st flight
	    			 */
	    			if((Element)arr1Element.getElementsByTagName("Port").item(0)!=null){
	    			Element arrivalPort1Element = (Element)arr1Element.getElementsByTagName("Port").item(0);
	    			if(arrivalPort1Element.getAttribute("PortCode")!=null)
	    			connectionFlights1.setArrivalPortCode(arrivalPort1Element.getAttribute("PortCode"));
	    			if(arrivalPort1Element.getTextContent()!=null)
	    			connectionFlights1.setArrivalPortName(arrivalPort1Element.getTextContent());
	    			}
	    			
	    			if((Element)arr1Element.getElementsByTagName("Country").item(0)!=null){
	    				Element country1Element=(Element)arr1Element.getElementsByTagName("Country").item(0);
	    				if(country1Element.getTextContent()!=null)
	    					connectionFlights1.setArrivingCountry(country1Element.getTextContent());
	    			}
	    			
	    			}
	    			log.info("Arrival Date : "+connectionFlights1.getArrivalDate());
	    			log.info("Arrival Time 1 : "+connectionFlights1.getArrivalTime());
	    			log.info("Arrival Port code : "+connectionFlights1.getArrivalPortCode());
	    			log.info("Arrival Port Name : "+connectionFlights1.getArrivalPortName());
	    			
	    			
	    			/*
	    			 * Retrieving Dep element for 2nd flight
	    			 */
	    			if((Element)viaElement.getElementsByTagName("Dep").item(0)!=null){
	    			Element dep2Element = (Element)viaElement.getElementsByTagName("Dep").item(0);
	    			
	    			/*
	    			 * Setting no.of stops for 2nd flight
	    			 */
	    			if(dep2Element.getAttribute("Stops")!=null){
	    				log.info("No.of stops for 2nd flight : "+dep2Element.getAttribute("Stops"));
	    				//connectionFlights2.setNoOfStops(dep2Element.getAttribute("Stops"));
	    				dep2Stops=dep2Element.getAttribute("Stops");
	    			}
	    			/*
	    			 * Setting frequency for 2nd flight
	    			 */
	    			if(dep2Element.getAttribute("Frequency")!=null){
	    			log.info("Frequency 2: "+dep2Element.getAttribute("Frequency"));
	    			connectionFlights2.setFrequency(dep2Element.getAttribute("Frequency"));
	    			}
	    			log.info("Frequency 2 :"+connectionFlights2.getFrequency());
	    			
	    			if((Element)dep2Element.getElementsByTagName("Port").item(0)!=null){
	    			Element depPort2Element = (Element)dep2Element.getElementsByTagName("Port").item(0);
	    			if(depPort2Element.getAttribute("PortCode")!=null)
	    			connectionFlights2.setDeparturePortCode(depPort2Element.getAttribute("PortCode"));
	    			if(depPort2Element.getTextContent()!=null)
	    			connectionFlights2.setDeparturePortName(depPort2Element.getTextContent());
	    			}
	    			
	    			if((Element)dep2Element.getElementsByTagName("Country").item(0)!=null){
		    			Element depCountry2Element = (Element)dep2Element.getElementsByTagName("Country").item(0);
		    			if(depCountry2Element.getTextContent()!=null)
		    			connectionFlights2.setDepartingCountry(depCountry2Element.getTextContent());
		    			}

	    			
	    			/*
	    			 * Setting flight duration for 2nd flight
	    			 */
	    			if(dep2Element.getAttribute("ElapsedTime")!=null){
	    			log.info("ElapsedTime 2 : "+dep2Element.getAttribute("ElapsedTime"));
	    			Map<String,String> elapsedTime2Map=convertMinutes(Integer.parseInt(dep2Element.getAttribute("ElapsedTime")));
	    			String flightDuration2 = elapsedTime2Map.get("hoursToDisplay") + ":" + elapsedTime2Map.get("minToDisplay");
	    			connectionFlights2.setFlightDuration(flightDuration2);
	    			}
	    			log.info("Flight Duration 2 :"+connectionFlights2.getFlightDuration());
	    			
	    			if(dep2Element.getAttribute("KM")!=null){
	    			log.info("Flight distance(in KM)"+dep2Element.getAttribute("KM"));
	    			connectionFlights2.setFlightDistance(dep2Element.getAttribute("KM")+"KM");
	    			}
	    			log.info("Flight Distance 2 :"+connectionFlights2.getFlightDistance());
	    			
	    			/*
	    			 * Setting departure time for 2nd flight
	    			 */
	    			if(dep2Element.getAttribute("DepTime")!=null){
	    			log.info("DepTime 2 : "+dep2Element.getAttribute("DepTime").substring(11));
	    			connectionFlights2.setDepartureDate(dep2Element.getAttribute("DepTime").substring(0,10));
	    			connectionFlights2.setDepartureTime(dep2Element.getAttribute("DepTime").substring(11).trim());
	    			}
	    			log.info("Departure Time 2 :"+connectionFlights2.getDepartureTime());

	    			/*
	    			 * Setting effective from and effective to dates for 1st flight
	    			 */
	    			if((Element)dep2Element.getElementsByTagName("EffFrom").item(0)!=null){
	    				
	    				Element effFrom=(Element)dep2Element.getElementsByTagName("EffFrom").item(0);
	    				
	    				if(effFrom.getTextContent()!=null){
	    					connectionFlights2.setEffectiveFrom(effFrom.getTextContent());
	    				}
	    			}
	    			
	    			if((Element)dep2Element.getElementsByTagName("EffTo").item(0)!=null){
	    				
	    				Element effTo=(Element)dep2Element.getElementsByTagName("EffTo").item(0);
	    				
	    				if(effTo.getTextContent()!=null){
	    					connectionFlights2.setEffectiveTo(effTo.getTextContent());
	    				}
	    			}
	    			/*
	    			 * Setting flight number for 2nd flight
	    			 */
	    			if((Element)dep2Element.getElementsByTagName("Carrier").item(0)!=null){
	    			Element carrier2Element = (Element)dep2Element.getElementsByTagName("Carrier").item(0);
	    			log.info("Carrier code 2 :"+carrier2Element.getAttribute("Code")+", Service Number:"+carrier2Element.getAttribute("ServiceNumber"));
	    			connectionFlights2.setFlightNumber(new StringBuffer().append(carrier2Element.getAttribute("Code").trim()).append(carrier2Element.getAttribute("ServiceNumber").trim()).toString());
	    			if(carrier2Element.getTextContent()!=null)
	    			carrierName2=carrier2Element.getTextContent();
	    			}
	    			log.info("Flight Number 2 :"+connectionFlights2.getFlightNumber());
	    			
	    			/*
	    			 * Setting Airline component for 2nd flight
	    			 */
	    			
	    			if((Element)dep2Element.getElementsByTagName("SAD").item(0)!=null){
	    			Element sad2Element = (Element)dep2Element.getElementsByTagName("SAD").item(0);
	    			log.info("SADName 2 : "+sad2Element.getAttribute("SADName"));
	    			if(sad2Element.getAttribute("SADName").equalsIgnoreCase("Sa Airlink")){
	    				if(connectionFlights2.getFlightNumber().contains("SA"))
	    				connectionFlights2.setAirline("Airlink in cooperation with "+carrierName2);
	    				else if(connectionFlights2.getFlightNumber().contains("4Z"))
		    				connectionFlights2.setAirline("Airlink");
	    			}else{
	    				connectionFlights2.setAirline(sad2Element.getAttribute("SADName").trim());
	    			}
	    			}else{
	    				connectionFlights2.setAirline(carrierName2);
	    			}
	    			log.info("Airline 2 :"+connectionFlights1.getAirline());
	    			
	    			/*
	    			 * Setting aircraft type for 2nd flight
	    			 */
	    			if((Element)dep2Element.getElementsByTagName("Equipment").item(0)!=null){
	    			Element equip2Element = (Element)dep2Element.getElementsByTagName("Equipment").item(0);
	    			log.info("Equipment Code 2 : "+equip2Element.getAttribute("Code"));
	    			connectionFlights2.setAircraftType(new StringBuffer().append(equip2Element.getAttribute("Code").trim()).append("-").append(equip2Element.getTextContent().trim()).toString());
	    			}
	    			log.info("Aircraft Type 2 :"+connectionFlights2.getAircraftType());
	    			
	    			
	    			/*
	    			 * Setting terminal code for 2nd flight
	    			 */
	    			
	    			if((Element)dep2Element.getElementsByTagName("Term").item(0)!=null){
	    			Element term2Element = (Element)dep2Element.getElementsByTagName("Term").item(0);
	    			log.info("Terminal 2 : "+term2Element.getTextContent());
	    			connectionFlights2.setTerminal(term2Element.getTextContent().trim());
	    			}else{
	    				log.info("Terminal code is empty");
	    			}
	    			log.info("Terminal 2 : "+connectionFlights2.getTerminal());
	    	        }
	    		}
	    			/*
	    			 * Parsing via tag -ends
	    			 */
	    			
	    			/*
	    			 * Parsing arrival tag for 2nd flight - starts
	    			 */
	    	        if((Element) eElement.getElementsByTagName("Arr").item(1)!=null){
	    			Element arr2Element = (Element) eElement.getElementsByTagName("Arr").item(1);
	    			
	    			if(arr2Element.getAttribute("ArrTime")!=null){
	    				log.info("ArrTime : "+arr2Element.getAttribute("ArrTime"));
	    				connectionFlights2.setArrivalDate(arr2Element.getAttribute("ArrTime").substring(0,10));
	    			connectionFlights2.setArrivalTime(arr2Element.getAttribute("ArrTime").substring(11).trim());
	    			}
	    	        
	    			log.info("Arrival Time:"+connectionFlights2.getArrivalTime());
	    			
	    			/*
	    			 * Setting arrival port code and port name for 2nd flight
	    			 */
	    		
	    			if((Element)arr2Element.getElementsByTagName("Port").item(0)!=null){
	    			Element arrivalPort2Element = (Element)arr2Element.getElementsByTagName("Port").item(0);
	    			if(arrivalPort2Element.getAttribute("PortCode")!=null)
	    			connectionFlights2.setArrivalPortCode(arrivalPort2Element.getAttribute("PortCode"));
	    			if(arrivalPort2Element.getTextContent()!=null)
	    			connectionFlights2.setArrivalPortName(arrivalPort2Element.getTextContent());
	    			}
	    			
	    			if((Element)arr2Element.getElementsByTagName("Country").item(0)!=null){
	    				Element country2Element=(Element)arr2Element.getElementsByTagName("Country").item(0);
	    				if(country2Element.getTextContent()!=null)
	    					connectionFlights2.setArrivingCountry(country2Element.getTextContent());
	    			}
	    			}
	    			/*
	    			 * Parsing arrival tag for 2nd flight - ends
	    			 */
	    	        int noOfStops=Integer.parseInt(dep1Stops)+Integer.parseInt(dep2Stops)+Integer.parseInt(seqNum);
	    	        connectionsFlightsResponse.setNoOfStops(String.valueOf(noOfStops));
	    	        
	    	        log.info("No.of stops : "+connectionsFlightsResponse.getNoOfStops());

	    			log.info("Adding each flight to the list");
	    			if(connectionFlights1!=null)
	    			listOfConnectionFlights.add(connectionFlights1);
	    			if(connectionFlights2!=null)
	    			listOfConnectionFlights.add(connectionFlights2);
	    			
	    			if(listOfConnectionFlights!=null)
	    			connectionFlightListVO.setConnectionFlightList(listOfConnectionFlights);
	    	        
	    	        log.info("Setting list of connection flights in the rsponse VO");
	    	        if(connectionFlightListVO!=null)
	    	        connectionsFlightsResponse.setListOfConnectionFlights(connectionFlightListVO);
	    
	    		
	    		}
	    		
	    		if(connectionsFlightsResponse!=null)
	    			listOfFlights.add(connectionsFlightsResponse);
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
			context.setProperty("getConnectionFlightsErrorMessage", e.getMessage());
		}
		return true;
	}
	
	 private static Document convertStringToXMLDocument(String xmlString) 
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
	            e.printStackTrace();
	        }
	        return null;
	    }
	 
	 private static Map<String,String> convertMinutes(int elapsedTime){
		 
		 Map<String,String> map=new HashMap<String,String>();
		 
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
	        
	        map.put("hoursToDisplay", hoursToDisplay);
	        map.put("minToDisplay", minToDisplay);
	        
	        return map;
	 }

	

}