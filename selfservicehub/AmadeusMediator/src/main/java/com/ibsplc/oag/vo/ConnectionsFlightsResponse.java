package com.ibsplc.oag.vo;

import java.io.Serializable;
import java.util.List;

public class ConnectionsFlightsResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String groundTime;
	private String totalElapsedTime;
	private String arrivalDayOffset;
	private String noOfStops;
	private ConnectionFlightsList listOfConnectionFlights;
	
	
	public String getArrivalDayOffset() {
		return arrivalDayOffset;
	}
	public void setArrivalDayOffset(String arrivalDayOffset) {
		this.arrivalDayOffset = arrivalDayOffset;
	}
	public String getGroundTime() {
		return groundTime;
	}
	public void setGroundTime(String groundTime) {
		this.groundTime = groundTime;
	}
	public String getTotalElapsedTime() {
		return totalElapsedTime;
	}
	public void setTotalElapsedTime(String totalElapsedTime) {
		this.totalElapsedTime = totalElapsedTime;
	}
	public ConnectionFlightsList getListOfConnectionFlights() {
		return listOfConnectionFlights;
	}
	public void setListOfConnectionFlights(ConnectionFlightsList listOfonnectionFlights) {
		this.listOfConnectionFlights = listOfonnectionFlights;
	}
	public String getNoOfStops() {
		return noOfStops;
	}
	public void setNoOfStops(String noOfStops) {
		this.noOfStops = noOfStops;
	}
	@Override
	public String toString() {
		return "ConnectionsFlightsResponse [groundTime=" + groundTime + ", totalElapsedTime=" + totalElapsedTime
				+ ", arrivalDayOffset=" + arrivalDayOffset + ", noOfStops=" + noOfStops + ", listOfConnectionFlights="
				+ listOfConnectionFlights + "]";
	}
	
	
}
