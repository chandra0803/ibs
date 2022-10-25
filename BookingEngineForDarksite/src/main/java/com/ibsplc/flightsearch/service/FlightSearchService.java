package com.ibsplc.flightsearch.service;

import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchVO;
import com.ibsplc.framework.exception.model.SystemException;



import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchMobileVORequest;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;

public interface FlightSearchService {
	public FlexPricerRequestVO getFlightAvailabilityURL(FlightSearchRequestVO flightSearchRequestVO)
		throws SystemException;
	
	/*
	 * Commented on 23/10/2020 by A-8986 for mobile API -- start
	 * 
	public FlightSearchVO setPOSCityandCountry(FlightSearchVO flightSearchVO,
			FlightSearchRequestVO flightSearchRequestVO, String departureCountry);
			*
			*Commented on 23/10/2020 by A-8986 for mobile API -- end
			*/
	
	//Added on 23/10/2020 by A-8986 for mobile API -- start
	public FlightSearchVO setPOSCityandCountry(FlightSearchVO flightSearchVO,String country,
			String language,String product, String departureCountry);
	//Added on 23/10/2020 by A-8986 for mobile API -- end

	//public FlightSearchVO setPosCityMasterVO(FlightSearchVO flightSearchVO);

	public FlightSearchVO setRouteConfigVOParameters(FlightSearchRequestVO flightSearchRequestVO,
			FlightSearchVO flightSearchVO);
	
	public boolean checkForDomesticFlight(String destination, String origin, String country, String language,
			String product, boolean forRegionalCheck);

	//Added boolean parameter in the method as part of Mobile API changes
	public FlexPricerRequestVO createFlexPricerRequestVO(FlightSearchVO flightSearchVO, String corporateId, boolean isConvert);
	
	public FlightSearchVO mapIsDomesticorRegional(FlightSearchRequestVO flightSearchRequestVO);

	public FlexPricerRequestVO getFlightAvailabilityMobileURL(FlightSearchMobileVORequest flightSearchMobileVORequest);

	public FlightSearchVO setRouteConfigMobileVOParameters(FlightSearchMobileVORequest flightSearchMobileVORequest,
			FlightSearchVO flightSearchVO);

	
}
