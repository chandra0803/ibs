package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class AirportList implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	public List<Airports> airports;

	public List<Airports> getAirports() {
		return airports;
	}

	public void setAirports(List<Airports> airports) {
		this.airports = airports;
	}

	@Override
	public String toString() {
		return "AirportList [airports=" + airports + "]";
	}
}
