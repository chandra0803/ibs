package com.ibsplc.oag.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConnectionsFlightListResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<ConnectionsFlightsResponse> connectionsFlightResponse;

	public ConnectionsFlightListResponse(ArrayList<ConnectionsFlightsResponse> connectionsFlightResponse) {
		// TODO Auto-generated constructor stub
		this.connectionsFlightResponse=connectionsFlightResponse;
	}

	public List<ConnectionsFlightsResponse> getConnectionsFlightResponse() {
		return connectionsFlightResponse;
	}

	public void setConnectionsFlightResponse(List<ConnectionsFlightsResponse> connectionsFlightResponse) {
		this.connectionsFlightResponse = connectionsFlightResponse;
	}

	@Override
	public String toString() {
		return "ConnectionsFlightListResponse [connectionsFlightResponse=" + connectionsFlightResponse + "]";
	}
	
}
