package com.ibsplc.pushNotification.vo;

import java.util.List;

public class TerminalGateInformationVO extends AbstractVO{
	
	private static final long serialVersionUID = 1L;
	
	private String airportCode;
	 
	private String terminalInformation;
	
	private List<GateInfoVO> gateInfo;

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}

	public String getTerminalInformation() {
		return terminalInformation;
	}

	public void setTerminalInformation(String terminalInformation) {
		this.terminalInformation = terminalInformation;
	}

	public List<GateInfoVO> getGateInfo() {
		return gateInfo;
	}

	public void setGateInfo(List<GateInfoVO> gateInfo) {
		this.gateInfo = gateInfo;
	}	

}
