package com.ibsplc.TailogIntegration.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ibsplc.TailogIntegration.VO.FlightObject;
import com.ibsplc.TailogIntegration.VO.TailogRequest;
import com.ibsplc.TailogIntegration.VO.TailogResponse;
import com.ibsplc.TailogIntegration.service.TailogService;
import com.ibsplc.TailogIntegration.service.impl.TailogServiceImpl;
import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;


@RestController
@RequestMapping("/api")
public class TailogController {
	/*
	@Autowired
	TailogService tailogService;
	*/
	private static final Logger log = Log4j2Logger.create(TailogController.class);

	@RequestMapping(value = { "/getCompletedFlights" }, produces = {"application/JSON"}, method = { RequestMethod.GET })
	//public FlightObject getDelayedBagStatus(
	public void getDelayedBagStatus() {
		
		log.info("Inside tailog Controller...");
		//return tailogService.retrieveTailogFromFile();
		//return tailogService.retrieveTailogFlightObject();
		
		

	}
}
