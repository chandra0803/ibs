package com.ibsplc.common.controller;

import java.net.UnknownHostException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.constants.CommonRequestObject;
import com.ibsplc.common.constants.CommonSessionObject;
import com.ibsplc.common.service.CommonService;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.flightsearch.vo.FlightSearchMobileVORequest;
import com.ibsplc.flightsearch.vo.FlightSearchMultiCityMobileRequest;
import com.ibsplc.flightsearch.vo.FlightSearchRequestVO;
import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

/**
 * @author a-5316
 *
 */
/**
 * @author a-7352
 *
 */
@ComponentScan(basePackages = "com.ibsplc.common.service.CommonService")
@Component
public class CommonController {

	private static final Logger LOGGER = Log4j2Logger.create(CommonController.class);
	private static final String THIS_CLASSNAME = "CommonController";
	@Autowired
	private CommonService commonService;
	@Autowired
	private Environment environment;
	@Autowired
	private HttpServletRequest request;

	/**
	 * 
	 * This method will validate the session id and save or update the values to the
	 * session managing table.
	 * 
	 * @param sessionId
	 *            : Client session id.
	 * 
	 * @param obj
	 *            : java object to save in DB
	 * 
	 * @param key
	 *            : session key to Identify the object
	 * 
	 * @return boolean
	 */
	/*
	 * Removed on 27th Apr 2020 by A-8986
	 */
	/*protected boolean setSessionValue(String key, Object obj) {
		boolean validateStatus = false;
		String sessionId = getSessionId();
		LOGGER.info("sessionId ...." + sessionId);
		if (validateSessionDtl(sessionId)) {
			String status = commonService.saveSessionDetails(sessionId, obj, key);
			if (status != null && !"".equals(status)) {
				validateStatus = true;
			}
			LOGGER.info("Save session status in controller : " + status);
		} else {
			validateStatus = false;
		}
		return validateStatus;
	}*/
	
	 
	//TODO
	protected boolean setSessionValue(String key, String obj) {
		boolean validateStatus = false;
		String sessionId = getSessionId();
		//LOGGER.info("sessionId ...." + sessionId);
		if (validateSessionDtl(sessionId)) {
			String status = commonService.saveSessionDetails(sessionId, obj, key);
			if (status != null && !"".equals(status)) {
				validateStatus = true;
			}
			LOGGER.info("Save session status in controller : " + status);
		} else {
			validateStatus = false;
		}
		return validateStatus;
	}

	/**
	 * 
	 * This method will fetch the values from the DB after the session validation
	 * for the given clientId and session Key(objectName)
	 * 
	 * @param sessionId
	 *            : Client session id.
	 * 
	 * @param key
	 *            : session key to Identify the object
	 * 
	 * @return Object
	 */
	//protected Object getSessionValues(String key) { -- Removed on 28th Apr 2020 by A-8986
	/*protected String getSessionValues(String key) {
		String sessionId = getSessionId();
		if (validateSessionDtl(sessionId)) {
			return (String) commonService.getClientSessionWithId(sessionId, key);
		} else {
			return null;
		}
	}*/

	/**
	 * This method will delete the values from the session managing table after the
	 * session validation with the given clientId and session Key(objectName) from
	 * the Data Base.
	 * 
	 * @param sessionId
	 *            : Client session id.
	 * 
	 * @param key
	 *            : session key to Identify the object
	 * 
	 * @return boolean
	 */
	/*protected boolean deleteSessionIdDtl(String key) {
		String sessionId = getSessionId();
		if (validateSessionDtl(sessionId)) {
			return commonService.deleteClientSessionDtl(sessionId, key);
		} else {
			return false;
		}
	}*/

	/**
	 * This method will delete the values from the session managing table after the
	 * session validation with the given client session Id from the Data Base.
	 * 
	 * @param sessionId
	 *            : Client session id.
	 * 
	 * @return boolean
	 */
	/*protected boolean deleteSessionId(String sessionId) {
		if (validateSessionDtl(sessionId)) {
			return commonService.deleteSessionId(sessionId);
		} else {
			return false;
		}
	}
*/
	/**
	 * Build an encrypted session Id.
	 * 
	 * @return String
	 */
	public String getNewSessionId() {
		String key = environment.getRequiredProperty(CommonKeys.SESSION_KEY);
		String initVector = environment.getRequiredProperty(CommonKeys.SESSION_INITVECTOR);
		String randomNum = RandomStringUtils.random(5, 0, 20, true, true, "qw32rfHIJk9iQ8Ud7h0X".toCharArray());
		String currentTime = String.valueOf(System.currentTimeMillis());
		String sessionKey = environment.getRequiredProperty(CommonKeys.SESSION_IDENTIFIER);
		String sessionId = randomNum.concat(sessionKey); // sessionKey+currentTime;
		sessionId = sessionId.concat(currentTime);
		//LOGGER.info("sessionId--" + sessionId);
		sessionId = CommonsUtil.encrypt(key, initVector, sessionId);
		//LOGGER.info("encrypted sessionId--" + sessionId);
		return sessionId;
	}

	/**
	 * Validate the given session id, whether it is created by our system or not
	 * 
	 * @param sessionId
	 * @return boolean
	 */
	private boolean validateSessionDtl(String sessionId) {
		String key = environment.getRequiredProperty(CommonKeys.SESSION_KEY);
		String initVector = environment.getRequiredProperty(CommonKeys.SESSION_INITVECTOR);
		final String sessionIdentifier = environment.getRequiredProperty(CommonKeys.SESSION_IDENTIFIER);
		boolean validateStatus = false;
		String decryptKey = CommonsUtil.decrypt(key, initVector, sessionId);
	//	LOGGER.info("decrypted Key--" + decryptKey);
		if (decryptKey != null && !"".equals(decryptKey) && !CommonKeys.ERROR_MESSAGE.equals(decryptKey)) {
			String authString = decryptKey.substring(5, 10);
		//	LOGGER.info("authString--" + authString);
			if (authString != null && authString.equals(sessionIdentifier)) {
				validateStatus = true;
			}
		}
		return validateStatus;
	}

	/**
	 * Generate session id from request header or create a new session id.
	 * 
	 * @return String
	 */
	public String getSessionId() {
		String sessionId = getHeadersInfo().get("session_id");
		//LOGGER.info("sessionId in header...." + sessionId);
		if (sessionId != null && !"".equals(sessionId)) {
			return sessionId;
		} else {
			if (request != null && request.getAttribute(CommonKeys.SESSION_ID) != null
					&& !"".equals(request.getAttribute(CommonKeys.SESSION_ID))) {
				sessionId = (String) request.getAttribute(CommonKeys.SESSION_ID);
				return sessionId;
			} else {
				sessionId = getNewSessionId();
				if (sessionId != null) {
					request.setAttribute(CommonKeys.SESSION_ID, sessionId);
					return sessionId;
				}
			}

		}
		return null;

	}

	/**
	 * Get the header information
	 * 
	 * @return String
	 */
	private Map<String, String> getHeadersInfo() {
		Map<String, String> map = new HashMap<String, String>();
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = (String) headerNames.nextElement();
			String value = request.getHeader(key);
			map.put(key, value);
		}
		LOGGER.info("getHeadersInfo: " + map.values());
		//LOGGER.info("getHeadersInfoKey: " + map.keySet());

		return map;
	}

	/**
	 * Sets the session values to an object
	 * 
	 * @param flightSearchRequestVO
	 */
	/* -- Commented on 27th Jan
	protected void setCommonSessionObjects(FlightSearchRequestVO flightSearchRequestVO) {
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_COUNTRY, flightSearchRequestVO.getCountry());
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_LOCALE, flightSearchRequestVO.getLanguage());
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_PRODUCT, flightSearchRequestVO.getProduct());

		CommonSessionObject sessionObj = new CommonSessionObject();
		sessionObj.setSessionId(getSessionId());
		LOGGER.info("In FlightSearchController sessionId" + getSessionId());
		sessionObj.setProduct((String) (getSessionValues(CommonKeys.SESSION_LOGGED_IN_PRODUCT)));
		sessionObj.setCountry((String) getSessionValues(CommonKeys.SESSION_LOGGED_IN_COUNTRY));
		sessionObj.setLanguage((String) getSessionValues(CommonKeys.SESSION_LOGGED_IN_LOCALE));
		flightSearchRequestVO.setSessionObj(sessionObj);
	}*/
	/*
	 * Added on 27th Apr 2020 to remove 
	 */
	protected void setCommonSessionObjects(FlightSearchRequestVO flightSearchRequestVO) {
		
		//setSessionValue(CommonKeys.SESSION_LOGGED_IN_COUNTRY, flightSearchRequestVO.getCountry());
		//setSessionValue(CommonKeys.SESSION_LOGGED_IN_LOCALE, flightSearchRequestVO.getLanguage());
		//setSessionValue(CommonKeys.SESSION_LOGGED_IN_PRODUCT, flightSearchRequestVO.getProduct());
		
		CommonSessionObject sessionObj = new CommonSessionObject();
		sessionObj.setSessionId(getSessionId());
		//LOGGER.info("In FlightSearchController sessionId" + getSessionId());
		sessionObj.setProduct(flightSearchRequestVO.getProduct());
		sessionObj.setCountry(flightSearchRequestVO.getCountry());
		sessionObj.setLanguage(flightSearchRequestVO.getLanguage());
		flightSearchRequestVO.setSessionObj(sessionObj);
	}
	
	//Added on 21/10/2020 by A-8986 for mobile API -- start
	protected void setCommonMobileSessionObjects(FlightSearchMobileVORequest flightSearchRequestVO) {
		
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_COUNTRY, flightSearchRequestVO.getCountry());
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_LOCALE, flightSearchRequestVO.getLanguage());
		setSessionValue(CommonKeys.SESSION_LOGGED_IN_PRODUCT, flightSearchRequestVO.getProduct());
		
		CommonSessionObject sessionObj = new CommonSessionObject();
		sessionObj.setSessionId(getSessionId());
		//LOGGER.info("In FlightSearchController sessionId" + getSessionId());
		sessionObj.setProduct(flightSearchRequestVO.getProduct());
		sessionObj.setCountry(flightSearchRequestVO.getCountry());
		sessionObj.setLanguage(flightSearchRequestVO.getLanguage());
		flightSearchRequestVO.setSessionObj(sessionObj);
	}
	
	protected void setCommonMultiCityMobileSessionObjects(FlightSearchMultiCityMobileRequest flightSearchRequestVO) {
		
		//setSessionValue(CommonKeys.SESSION_LOGGED_IN_COUNTRY, flightSearchRequestVO.getCountry());
		//setSessionValue(CommonKeys.SESSION_LOGGED_IN_LOCALE, flightSearchRequestVO.getLanguage());
		//setSessionValue(CommonKeys.SESSION_LOGGED_IN_PRODUCT, flightSearchRequestVO.getProduct());
		
		CommonSessionObject sessionObj = new CommonSessionObject();
		sessionObj.setSessionId(getSessionId());
		LOGGER.info("In FlightSearchController sessionId" + getSessionId());
		sessionObj.setProduct(flightSearchRequestVO.getProduct());
		sessionObj.setCountry(flightSearchRequestVO.getCountry());
		sessionObj.setLanguage(flightSearchRequestVO.getLanguage());
		flightSearchRequestVO.setSessionObj(sessionObj);
	}
//Added on 21/10/2020 by A-8986 for mobile API -- end

	

	/**
	 * Sets the Request values and host IP address to an object
	 * 
	 * @param flightSearchRequestVO
	 * @param request
	 */
	protected void setCommonRequestObjects(FlightSearchRequestVO flightSearchRequestVO, HttpServletRequest request) {

		CommonRequestObject reqObj = new CommonRequestObject();
		reqObj.setUrl(request.getRequestURL().toString());
		reqObj.setUri(request.getRequestURI());
		reqObj.setContextPath(request.getContextPath());
		LOGGER.info("In commonController requester url: " + request.getRequestURL());
		//LOGGER.info("In commonController uri" + request.getRequestURI());
		//LOGGER.info("In commonController contextpath" + request.getContextPath());

		java.net.InetAddress localMachine;
		try {
			localMachine = java.net.InetAddress.getLocalHost();
			if (localMachine != null) {
				reqObj.setHostIpAddress(localMachine.getHostAddress());
				LOGGER.info("HostIp : " + localMachine.getHostAddress());
			}
		} catch (UnknownHostException e) {
			LOGGER.error("SystemException in getting Hostaddress" + e);
		}
		flightSearchRequestVO.setReqObj(reqObj);
	}
	
	//Added on 21/10/2020 by A-8986 for mobile API -- start
	protected void setCommonMobileRequestObjects(FlightSearchMobileVORequest flightSearchRequestVO, HttpServletRequest request) {

		CommonRequestObject reqObj = new CommonRequestObject();
		reqObj.setUrl(request.getRequestURL().toString());
		reqObj.setUri(request.getRequestURI());
		reqObj.setContextPath(request.getContextPath());
		LOGGER.info("In commonController url:" + request.getRequestURL());
		//LOGGER.info("In commonController uri" + request.getRequestURI());
		//LOGGER.info("In commonController contextpath" + request.getContextPath());

		java.net.InetAddress localMachine;
		try {
			localMachine = java.net.InetAddress.getLocalHost();
			if (localMachine != null) {
				reqObj.setHostIpAddress(localMachine.getHostAddress());
				LOGGER.info("HostIp : " + localMachine.getHostAddress());
			}
		} catch (UnknownHostException e) {
			LOGGER.error("SystemException in getting Hostaddress" + e);
		}
		flightSearchRequestVO.setReqObj(reqObj);
	}
	
	protected void setCommonMultiCityMobileRequestObjects(FlightSearchMultiCityMobileRequest flightSearchRequestVO, HttpServletRequest request) {

		CommonRequestObject reqObj = new CommonRequestObject();
		reqObj.setUrl(request.getRequestURL().toString());
		reqObj.setUri(request.getRequestURI());
		reqObj.setContextPath(request.getContextPath());
		LOGGER.info("In commonController url:" + request.getRequestURL());
		//LOGGER.info("In commonController uri" + request.getRequestURI());
		//LOGGER.info("In commonController contextpath" + request.getContextPath());

		java.net.InetAddress localMachine;
		try {
			localMachine = java.net.InetAddress.getLocalHost();
			if (localMachine != null) {
				reqObj.setHostIpAddress(localMachine.getHostAddress());
				LOGGER.info("HostIp : " + localMachine.getHostAddress());
			}
		} catch (UnknownHostException e) {
			LOGGER.error("SystemException in getting Hostaddress" + e);
		}
		flightSearchRequestVO.setReqObj(reqObj);
	}
	//Added on 21/10/2020 by A-8986 for mobile API -- end

	/**
	 * Checks if error is present in the error Object
	 * 
	 * @param errors
	 */
	protected void checkIfErrorExists(Errors errors) {
		LOGGER.entering(THIS_CLASSNAME, "checkIfErrorExists");
		if (errors.hasErrors()) {
			StringBuilder resMsg = new StringBuilder("Parameter missing:");
			for (Object object : errors.getAllErrors()) {
				if (object instanceof FieldError) {
					FieldError fieldError = (FieldError) object;
					resMsg.append(fieldError.getDefaultMessage());
				}
			}
			LOGGER.error("Error exists - " + resMsg.toString());
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE, resMsg.toString());
		}
		//LOGGER.info("No error exists");
	}

}
