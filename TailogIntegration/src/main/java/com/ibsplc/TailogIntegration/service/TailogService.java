package com.ibsplc.TailogIntegration.service;

import java.io.Serializable;

import com.ibsplc.TailogIntegration.VO.FlightObject;
import com.ibsplc.TailogIntegration.VO.TailogRequest;
import com.ibsplc.TailogIntegration.VO.TailogResponse;

public interface TailogService extends Serializable{
	
	
	public void retrieveTailogFlightObject();

}
