package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class WSO2FRMSResponse implements Serializable{
	
	private FRMSServiceResponse frmsServiceResponse;

	public FRMSServiceResponse getFrmsServiceResponse() {
		return frmsServiceResponse;
	}

	public void setFrmsServiceResponse(FRMSServiceResponse frmsServiceResponse) {
		this.frmsServiceResponse = frmsServiceResponse;
	}

	@Override
	public String toString() {
		return "WSO2FRMSResponse [frmsServiceResponse=" + frmsServiceResponse + "]";
	}	

}
