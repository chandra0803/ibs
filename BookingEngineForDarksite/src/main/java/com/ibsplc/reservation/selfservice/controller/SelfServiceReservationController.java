package com.ibsplc.reservation.selfservice.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.constants.CommonSessionObject;
import com.ibsplc.common.controller.CommonController;
import com.ibsplc.common.service.CommonService;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.reservation.vo.CheckInRequestVO;
import com.ibsplc.reservation.vo.CheckInResponseVO;

@RestController
public class SelfServiceReservationController extends CommonController {

	private static final Logger LOGGER = Log4j2Logger.create(SelfServiceReservationController.class);
	@Autowired
	private CommonService commonSelfService;

	/**
	 * Method which invokes the retrievePNRService to build the SelfService redirection
	 * URL for retrieving booking details
	 * 
	 */
	//@RequestMapping(value = { "/retrieveSelfPNRService" }, method = { RequestMethod.POST })
	/*public Map<String, LoginResponseSelfServiceVO> getBookingDetails(@Valid @RequestBody LoginRequestSelfServiceVo loginRequestVO,
			Errors errors, HttpServletRequest request) {

		LOGGER.info("In ResrvationController ");
		checkIfErrorExists(errors);
		
		LOGGER.info("Country : "+loginRequestVO.getCountry()+", Language : "+loginRequestVO.getLanguage()+
				", Product : "+loginRequestVO.getProduct());
		
		String country=loginRequestVO.getCountry();
		String language=loginRequestVO.getLanguage();
		String product=loginRequestVO.getProduct();
		
		LOGGER.info("Country : "+country+", Language : "+language+", Product : "+product);
		
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_COUNTRY, country);
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_LOCALE, language);
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_PRODUCT, product);

		LOGGER.info("Login Session Id: " + getSessionId() + " Params:  " + loginRequestVO.toString());
		CommonSessionObject sessionObj = new CommonSessionObject();
		sessionObj.setSessionId(getSessionId());
		LOGGER.info("In FlightSearchController sessionId" + getSessionId());
		sessionObj.setProduct((String) (getSessionValues(CommonKeys.SESSION_LOGGED_IN_PRODUCT)));
		sessionObj.setCountry((String) getSessionValues(CommonKeys.SESSION_LOGGED_IN_COUNTRY));
		sessionObj.setLanguage((String) getSessionValues(CommonKeys.SESSION_LOGGED_IN_LOCALE));
		loginRequestVO.setSessionObj(sessionObj);

		return commonSelfService.getBookingDetailsSelfServcie(loginRequestVO);
	}*/

	/**
	 * Method which invokes the checkIn service to build the Amadeus redirection URL
	 * for check in
	 * 
	 */
	/*@RequestMapping(value = { "/checkInSelfService" }, method = { RequestMethod.POST })
	public Map<String, CheckInResponseVO> getCheckInResponseURL(@Valid @RequestBody CheckInRequestVO checkInRequestVO,
			Errors errors, HttpServletRequest request) {

		LOGGER.info("In check in service");
		checkIfErrorExists(errors);
		LOGGER.info("Check-In Session Id: " + getSessionId() + " Params:  " + checkInRequestVO.toString());
		CommonSessionObject sessionObj = new CommonSessionObject();
		sessionObj.setSessionId(getSessionId());
		checkInRequestVO.setSessionObj(sessionObj);
		return commonSelfService.getCheckInResponseURLSelfServcie(checkInRequestVO);

	}*/

}
