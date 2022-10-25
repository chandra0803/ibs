package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class FirNotam implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	public List<AirportNotamDetails> airportNotamDetails;
	
	public List<AirportNotamDetails> getAirportNotamDetails() {
		return airportNotamDetails;
	}

	public void setAirportNotamDetails(List<AirportNotamDetails> airportNotamDetails) {
		this.airportNotamDetails = airportNotamDetails;
	}

	@Override
	public String toString() {
		return "AirportNotam [airportNotamDetails=" + airportNotamDetails + "]";
	}
}
