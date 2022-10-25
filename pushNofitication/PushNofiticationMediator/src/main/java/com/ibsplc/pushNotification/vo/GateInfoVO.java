package com.ibsplc.pushNotification.vo;

public class GateInfoVO extends AbstractVO{
	
	private static final long serialVersionUID = 1L;
	
	private String gateType;
	
	private String gateIdentifier;

	public String getGateType() {
		return gateType;
	}

	public void setGateType(String gateType) {
		this.gateType = gateType;
	}

	public String getGateIdentifier() {
		return gateIdentifier;
	}

	public void setGateIdentifier(String gateIdentifier) {
		this.gateIdentifier = gateIdentifier;
	}	

}
