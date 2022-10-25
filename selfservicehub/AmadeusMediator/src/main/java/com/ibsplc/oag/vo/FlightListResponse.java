package com.ibsplc.oag.vo;

import java.util.ArrayList;
import java.util.List;

public class FlightListResponse {

	private List<DirectFlightsResponse> listOfFlights;
	
	

	public FlightListResponse(List<DirectFlightsResponse> listOfFlights) {
		super();
		this.listOfFlights = listOfFlights;
	}

	public List<DirectFlightsResponse> getListOfFlights() {
		return listOfFlights;
	}

	public void setListOfFlights(List<DirectFlightsResponse> listOfFlights) {
		this.listOfFlights = listOfFlights;
	}
	
}
