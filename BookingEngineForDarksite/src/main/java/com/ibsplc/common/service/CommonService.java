package com.ibsplc.common.service;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchMobileVORequest;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.framework.exception.model.SystemException;
 


/**
 * @author a-5316
 *
 */
public interface CommonService {
	
	//public String saveSessionDetails(String clientId, Object obj, String key); -- Removed on 27th Apr 2020 by A-8986
	
	public String saveSessionDetails(String clientId, String obj, String key);
	
	//public Object getClientSessionWithId(String clientId, String key); -- Removed on 28th Apr 2020 by A-8986
	/*public String getClientSessionWithId(String clientId, String key);
	
	public boolean deleteClientSessionDtl(String clientId, String objectName);
	
	public boolean deleteSessionId(String sessionId);
	*/
	public  Map<String, Object> getFlightSearchServiceParametersList(
			FlightSearchRequestVO flightSearchRequestVO);
	public  void getCommonResponseBody(String status, String sessionId, String clientSessionId,Object object);
	
	/*public  Map<String, LoginResponseVO> getBookingDetails(LoginRequestVO loginvo);
	//self service
	public  Map<String, LoginResponseSelfServiceVO> getBookingDetailsSelfServcie(LoginRequestSelfServiceVo loginvo);
	public  void getCommonResponseBody(String status, String sessionId, String clientSessionId,Object object);
	*/
	public  Map<String, Object> getMultiCityFlightSearchServiceParametersList(
			FlightSearchRequestVO multiCityFlightSearchRequestVO);
	
	/*public  String getPassengerListProfiling(PaxDetailsRequestVO paxDetailsRequestVO,
			FlexPricerRequestVO flexPricerRequestVO) throws SystemException;
	
	public void deleteSessionDtl();
	
	public Map<String, CheckInResponseVO> getCheckInResponseURL(CheckInRequestVO checkInRequestVO);
//self servcie
	public Map<String, CheckInResponseVO> getCheckInResponseURLSelfServcie(CheckInRequestVO checkInRequestVO);
	public void updateOfficeIDList();
	
	public boolean isRequestComingFromBrowser(HttpServletRequest request);

	public Map<String, Object> getFlightSearchMobileServiceParametersList(
			FlightSearchMobileVORequest flightSearchMobileVORequest);

	public Map<String, Object> getFlightSearchMultiCityMobileServiceParametersList(
			FlightSearchMultiCityMobileRequest flightSearchMultiCityMobileVORequest);
*/
}
