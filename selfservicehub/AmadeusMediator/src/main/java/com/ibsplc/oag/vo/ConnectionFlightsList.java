package com.ibsplc.oag.vo;

import java.io.Serializable;
import java.util.List;

public class ConnectionFlightsList implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<ConnectionFlights> connectionFlightList;

	public List<ConnectionFlights> getConnectionFlightList() {
		return connectionFlightList;
	}

	public void setConnectionFlightList(List<ConnectionFlights> connectionFlightList) {
		this.connectionFlightList = connectionFlightList;
	}

	@Override
	public String toString() {
		return "ConnectionFlightsList [connectionFlightList=" + connectionFlightList + "]";
	}
	

}
