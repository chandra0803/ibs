package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class Result implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	private List<FlightObject> flightObjects;

	public List<FlightObject> getFlightObjects() {
		return flightObjects;
	}

	public void setFlightObjects(List<FlightObject> flightObjects) {
		this.flightObjects = flightObjects;
	}
	
	
}
