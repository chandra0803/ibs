package com.ibsplc.framework.exception.handler;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.exception.model.CustomGenericException;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.framework.vo.GenerateExceptionResponseVO;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.controller.CommonController;
import com.ibsplc.common.util.CommonsUtil;

/**
 * @author a-5316
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler extends CommonController {

	/**
     * to get logs
     */
	 private static final Logger LOGGER = Log4j2Logger.create(GlobalExceptionHandler.class);
	 
	 @Autowired
	 private Environment environment;  
	 private String errorMessage;
	 private String errorInfo;

    /**
     * customExceptionResponse
     * 
     * To generate custom error responses
     * @A-7352 - Author
     * @param httpRequest
     */

    @ExceptionHandler(CustomGenericException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map < String, GenerateExceptionResponseVO > customExceptionResponse(HttpServletRequest request,
        CustomGenericException ex) {
        Map < String, GenerateExceptionResponseVO > exceptionResponseMap = new HashMap < String, GenerateExceptionResponseVO > ();
        GenerateExceptionResponseVO exceptionResponse = new GenerateExceptionResponseVO();

        String[] customExceptionMessages = getExceptionMessage(ex);
        
        if (customExceptionMessages != null) {
        	
            errorMessage = customExceptionMessages[0];
            errorInfo = customExceptionMessages[1];
        }

        exceptionResponse.setResultMessage(CommonKeys.ERROR_MESSAGE);
        exceptionResponse.setResultCode(CommonKeys.ERROR_RESULT_CODE);
        try {
           // exceptionResponse.setErrorMessage(errorMessage.substring(0, errorMessage.length() - 3));
        	exceptionResponse.setDisplayMessage(ex.getErrMsg());
            exceptionResponse.setErrorMessage(ex.getErrMsg());
            exceptionResponse.setErrorInfo(errorInfo.substring(0, errorInfo.length() - 3));
        } catch (ArrayIndexOutOfBoundsException e) {
            String defaultErrorMessage = environment.getRequiredProperty("no.error.messages.available");
            LOGGER.info("Exception occured while setting custom exception message : " + e);


            exceptionResponse.setErrorMessage(defaultErrorMessage);
            exceptionResponse.setErrorInfo(defaultErrorMessage);
        }

        exceptionResponse.setSessionId(getSessionId());
        exceptionResponse.setClientSessionId("");
        exceptionResponse.setRequestURL(request.getRequestURL().toString());

        exceptionResponseMap.put("errorResponse", exceptionResponse);
        return exceptionResponseMap;
    }


    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Map < String, GenerateExceptionResponseVO > generalException(HttpServletRequest request, Exception ex) {

        Map < String, GenerateExceptionResponseVO > exceptionResponseMap = new HashMap < String, GenerateExceptionResponseVO > ();
        GenerateExceptionResponseVO exceptionResponse = new GenerateExceptionResponseVO();

        String[] generalExceptionMessages = getExceptionMessage(ex);
        
        if (generalExceptionMessages != null) {        	
            errorMessage = generalExceptionMessages[0];
            errorInfo = generalExceptionMessages[1];
        }

        exceptionResponse.setResultMessage(CommonKeys.ERROR_MESSAGE);
        exceptionResponse.setResultCode(CommonKeys.ERROR_RESULT_CODE);
        try {
            exceptionResponse.setErrorMessage(errorMessage.substring(0, errorMessage.length() - 3));
            exceptionResponse.setErrorInfo(errorInfo.substring(0, errorInfo.length() - 3));
        } catch (ArrayIndexOutOfBoundsException e) {
            String defaultErrorMessage = environment.getRequiredProperty("no.error.messages.available");
            LOGGER.info("Exception occured while setting general exception message : " + e);
            exceptionResponse.setErrorMessage(environment.getRequiredProperty(defaultErrorMessage));
            exceptionResponse.setErrorInfo(environment.getRequiredProperty(defaultErrorMessage));
        }
        exceptionResponse.setDisplayMessage(environment.getRequiredProperty("message.to.users"));
        exceptionResponse.setSessionId(request.getRequestedSessionId());
        exceptionResponse.setClientSessionId("");
        exceptionResponse.setRequestURL(request.getRequestURL().toString());

        exceptionResponseMap.put("errorResponse", exceptionResponse);
        return exceptionResponseMap;

    }
    
    public String[] getExceptionMessage(Exception ex) {
    	
    	String stackTrace;
    	String [] exceptionMessages = null;
    	
    	stackTrace = CommonsUtil.getStringFromStackTrace(ex);
    	
    	if(stackTrace != null) {
    		exceptionMessages = stackTrace.split("at ");
    	}
    	
    	return exceptionMessages;    	
    }
    
    /**
	 * customExceptionResponse
	 * 
	 * To generate custom error responses @A-5316 - Author
	 * 
	 * @param httpRequest
	 */

	@ExceptionHandler(CustomException.class)
	@ResponseStatus(value = HttpStatus.OK)
	@ResponseBody
	public Map<String, GenerateExceptionResponseVO> customErrorResponse(HttpServletRequest request,
			CustomException ex) {
		Map<String, GenerateExceptionResponseVO> customExceptionResponseMap = new HashMap<String, GenerateExceptionResponseVO>();
		GenerateExceptionResponseVO customExceptionResponse = new GenerateExceptionResponseVO();

		String[] customErrorMessages = getExceptionMessage(ex);

		if (customErrorMessages != null) {

			errorMessage = customErrorMessages[0];
			errorInfo = customErrorMessages[1];
		}

		customExceptionResponse.setResultMessage(CommonKeys.ERROR_MESSAGE);
		customExceptionResponse.setResultCode(CommonKeys.ERROR_RESULT_CODE);
		try {

			customExceptionResponse.setDisplayMessage(ex.getErrMsg());
			//customExceptionResponse.setErrorMessage(ex.getErrMsg());
			//customExceptionResponse.setErrorInfo(errorInfo.substring(0, errorInfo.length() - 3));
		} catch (ArrayIndexOutOfBoundsException e) {
			String defaultErrorMessage = environment.getRequiredProperty("no.error.messages.available");
			LOGGER.info("Exception occured while setting custom exception message : " + e);

			customExceptionResponse.setErrorMessage(defaultErrorMessage);
			customExceptionResponse.setErrorInfo(defaultErrorMessage);
		}

		customExceptionResponse.setSessionId(getSessionId());
		customExceptionResponse.setClientSessionId("");
		customExceptionResponse.setRequestURL(request.getRequestURL().toString());

		customExceptionResponseMap.put("errorResponse", customExceptionResponse);
		return customExceptionResponseMap;
	}
}


