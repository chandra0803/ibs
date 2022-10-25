package com.ibsplc.common.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.persistence.dao.CommonDao;
import com.ibsplc.common.service.CommonService;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.flightsearch.service.FlightSearchService;
import com.ibsplc.flightsearch.service.MultiCityFlightSearchService;
import com.ibsplc.flightsearch.util.FlightSearchUtil;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.exception.model.CustomGenericException;
import com.ibsplc.framework.exception.model.SystemException;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.framework.vo.CommonResponseVO;
import com.ibsplc.reservation.util.ReservationUtil;
import com.ibsplc.reservation.vo.BookingVO;
import com.ibsplc.reservation.vo.LoginRequestVO;
import com.ibsplc.reservation.vo.LoginResponseVO;

/**
 * @author a-5316
 *
 */
@Service("commonService")
@Transactional
public class CommonServiceImpl implements CommonService {

	//@Autowired
	//private CommonDao commonDao;

	@Autowired
	private FlightSearchService flightSearchService;
	/*@Autowired
	private RetrievePNRService retrievePNRService;
	@Autowired
	private RetrieveSelfServicePNRService retrieveSelfServciePNRServcie;
	@Autowired
	private CorporateService corporateService;
	*/
	@Autowired
	private MultiCityFlightSearchService multicityflightsearchService;
	@Autowired
	private Environment environment;

	/**
	 * to get logs
	 */
	private static final Logger LOGGER = Log4j2Logger.create(CommonServiceImpl.class);

	private static final String THIS_CLASS_NAME = "CommonServiceImpl";

	/**
	 * This method will save or update the values to the session managing table.
	 * 
	 * @param clientId
	 *            : Client session id.
	 * 
	 * @param obj
	 *            : java object to save in DB
	 * 
	 * @param objectName
	 *            : session key to Identify the object
	 * 
	 * @return String
	 */
	
	public String saveSessionDetails(String clientId, String obj, String key) {
		String className = "";
		String status = "";
		//SessionDtlEntity sessionDtlEntity = null;
	 
		if (obj != null) {
			className = obj.getClass().getName();
		} else {
			className = "java.lang.String";
		}
		return null;
	}
	 

	/**
	 * This method returns flight search redirect URL
	 */
	//@Override
	public Map<String, Object> getFlightSearchServiceParametersList(FlightSearchRequestVO flightSearchRequestVO) {
		 String flightSearchRedirectURL = "";

		try {
			FlexPricerRequestVO flexPricerRequestVO = flightSearchService
					.getFlightAvailabilityURL(flightSearchRequestVO);
			LOGGER.info("flexPricerRequestVO.baseurl...." + flexPricerRequestVO.getBasePspURL());
			 
			if (CommonsUtil.isStringValid(flexPricerRequestVO.getDepartureDate())
					&& CommonsUtil.isStringValid(flexPricerRequestVO.getReturnDate())
					&& !flexPricerRequestVO.getIsMonthsBetweenValid()) {
				throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
						environment.getRequiredProperty("error.todate.invalid"));
			}
 
			flightSearchRedirectURL = FlightSearchUtil.createFlightSearchRedirectURL(flexPricerRequestVO);
			Map<String, Object> flexPricerMap = new HashMap<>();
			flexPricerMap.put("FlexPricerRequestVO", flexPricerRequestVO);
			flexPricerMap.put("flightSearchRedirectURL", flightSearchRedirectURL);
			return flexPricerMap;

		} catch (SystemException e) {
			LOGGER.error("SystemException in getFlightSearchServiceParametersList due to  " + e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);
		} catch (Exception exc) {
			LOGGER.error("Exception in getFlightSearchServiceParametersList due to  " + exc);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, exc);
		}

	}
 /**
 * This method returns Login redirect URL
 */
	public Map<String, LoginResponseVO> getBookingDetails(LoginRequestVO loginRequestVO) {
 
		String loginRedirectURL = "";
		Map<String, LoginResponseVO> loginDetailMap = new HashMap<>();
		LoginResponseVO loginResponseVO = new LoginResponseVO();
		BookingVO bookingVO = null;
		try {
			LOGGER.info("Calling PNR Retrieve service..");
			//bookingVO = retrievePNRService.getBookingDetails(loginRequestVO);
			if(bookingVO != null ) {
			//if (bookingVO != null && CommonsUtil.isStringValid(bookingVO.getAmadeusSiteOfficeID())
				 
			if (CommonsUtil.isStringValid(bookingVO.getAmadeusSiteOfficeID())
					&& bookingVO.getAmadeusSiteOfficeID().contains(CommonKeys.AIRLINK_AIRLINE_CODE)) {
			 
				LOGGER.info("Creating Amadeus redirection URL...");
				loginRedirectURL = ReservationUtil.createRetrieveFlowURL(bookingVO);
				loginResponseVO.setIsRedirectedToSAA(CommonKeys.NO);
			}  
				//Checking added on 20/01/2020 - Redirect to SAA only if the Office ID is an SAA office ID
			
			 /* Removed on 10 June 2020 by A-8986 to disable redirection to SAA while retrieving PNR details
			 * in Manage My Booking flow
			 */
			else if(bookingVO.getAmadeusSiteOfficeID().contains(CommonKeys.SA_AIRLINE_CODE)) {
					LOGGER.info("Redirecting to SAA...");	
				loginResponseVO.setIsRedirectedToSAA(CommonKeys.YES);
				}
				
			//Added on 13 May 2020 to identify travel agency bookings
			else {
					loginResponseVO.setIsRedirectedToSAA("TA");
				}
				
			
			}else {
				LOGGER.info("BookingVO is null...");
			}
			
			LOGGER.info("Is redirected to SAA :"+loginResponseVO.getIsRedirectedToSAA());
			loginResponseVO.setLoginRedirectUrl(loginRedirectURL);
			getCommonResponseBody(CommonKeys.CHAR_Y, loginRequestVO.getSessionObj().getSessionId(),
					loginRequestVO.getClientSessionId(), loginResponseVO);
			loginDetailMap.put("RetrievePNRResponse", loginResponseVO);
			
			LOGGER.info("RetrievePNRResponse:"+loginResponseVO);

			return loginDetailMap;
/*		} catch (SystemException e) {
			LOGGER.error("SystemException in getBookingDetails" + e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);*/
		} catch (Exception exc) {
			LOGGER.error("Exception in getBookingDetails" + exc);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, exc);
		}

	}

	/**
	 * Build common web service body.
	 * 
	 * @param status
	 * @param sessionId
	 * @return CommonResponseVO
	 */
	public void getCommonResponseBody(String status, String sessionId, String clientSessionId, Object object) {
		CommonResponseVO commonresponseVO = (CommonResponseVO) object;
		commonresponseVO.setSessionId(sessionId);
		commonresponseVO.setClientSessionId(clientSessionId);
		if (status != null && status.equalsIgnoreCase(CommonKeys.CHAR_Y)) {
			commonresponseVO.setResultCode(CommonKeys.SUCCESS_RESULT_CODE);
			commonresponseVO.setResultMessage(CommonKeys.SUCCESS_MESSAGE);

		} else {
			commonresponseVO.setResultCode(CommonKeys.ERROR_RESULT_CODE);
			commonresponseVO.setResultMessage(CommonKeys.ERROR_MESSAGE);
		}

	}

	/**
	 * This method returns flexPricerMap for multicity
	 */
	@Override
	public Map<String, Object> getMultiCityFlightSearchServiceParametersList(
			FlightSearchRequestVO multiCityFlightSearchRequestVO) {
		LOGGER.info("inside MultiCityFlightSearchService ");
		String flightSearchRedirectURL = "";

		try {
			FlexPricerRequestVO flexPricerRequestVO = multicityflightsearchService
					.getMultiCityFlightAvailabilityURL(multiCityFlightSearchRequestVO);
			 
			flightSearchRedirectURL = FlightSearchUtil.createMultiCityFlightSearchURL(flexPricerRequestVO);
			Map<String, Object> flexPricerMap = new HashMap<>();
			flexPricerMap.put("FlexPricerRequestVO", flexPricerRequestVO);
			flexPricerMap.put("flightSearchRedirectURL", flightSearchRedirectURL);
			return flexPricerMap;
		} catch (Exception e) {
			LOGGER.error("Exception in getMultiCityFlightSearchService" + e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);
		}

	} 
}