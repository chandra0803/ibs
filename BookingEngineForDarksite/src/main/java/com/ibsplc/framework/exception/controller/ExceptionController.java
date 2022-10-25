package com.ibsplc.framework.exception.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.framework.exception.model.CustomGenericException;

/**
 * @author a-5316
 *
 */
@RestController
public class ExceptionController {
	
	@RequestMapping(value = {"/exceptionResponse" }, method = RequestMethod.GET)
    public void invalidServiceName(@RequestParam(value="errorMessage") String errorMessage) {    			
			throw new CustomGenericException("201",errorMessage);	
    }
}
