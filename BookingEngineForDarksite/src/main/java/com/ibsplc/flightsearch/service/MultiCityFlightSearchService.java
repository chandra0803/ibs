package com.ibsplc.flightsearch.service;

import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchVO;
import com.ibsplc.framework.exception.model.SystemException;

public interface MultiCityFlightSearchService {
	public FlexPricerRequestVO getMultiCityFlightAvailabilityURL(FlightSearchRequestVO multiCityFlightSearchRequestVO)
			throws SystemException;
/*added to determine route config params for mcity bookings--A-8551--*/
	
	public FlightSearchVO setRouteParametersMcity(FlightSearchRequestVO flightSearchRequestVO,
			FlightSearchVO flightSearchVO);

	FlexPricerRequestVO getFlightAvailabilityMultiCityMobileURL(
			FlightSearchMultiCityMobileRequest flightSearchMultiCityMobileRequest);
}
