package com.ibsplc.flightsearch.service.impl;

import com.ibsplc.common.service.impl.CommonServiceImpl;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

/*
 * Created on 12 June 2020 by A-8986 to test automated flight search calls
 * 
 * use this class only in test environment
 */
public class AutomatedFlightSearchServiceImpl {
	
	private static final Logger LOGGER = Log4j2Logger.create(AutomatedFlightSearchServiceImpl.class);
	
	public void callFlightSearch() {
		
		
		String url="https://stage.flyairlink.com/BookingEngine/flightSearch";
		
		LOGGER.info("Hitting url : "+url);
		
		
		FlightSearchRequestVO flightSearchRequestVO=new FlightSearchRequestVO();
		flightSearchRequestVO.setCountry("ZA");
		flightSearchRequestVO.setLanguage("EN");
		flightSearchRequestVO.setProduct("LRB");
		flightSearchRequestVO.setIsMobileDevice("false");
		flightSearchRequestVO.setTripType("O");
		flightSearchRequestVO.setDepartureCity("KIM");
		flightSearchRequestVO.setDestinationCity("CPT");
		flightSearchRequestVO.setDepartureDate("10-7-2020");
		flightSearchRequestVO.setAdultCount("1");
		//A-10083 on 17/02/2022
		flightSearchRequestVO.setYoungAdultCount("0");
		flightSearchRequestVO.setChildCount("0");
		flightSearchRequestVO.setInfantCount("0");
		flightSearchRequestVO.setCabinClass("0");
		flightSearchRequestVO.setClientSessionId("123");
		
		
		
		
		
	}

}
