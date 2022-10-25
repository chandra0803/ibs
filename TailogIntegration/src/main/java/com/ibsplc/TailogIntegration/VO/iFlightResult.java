package com.ibsplc.TailogIntegration.VO;

public class iFlightResult {
	
	private String resultCode;
	private String resultMessage;
	private String updatedAfter;
	
	//private TailogResponse tailogResponse;
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	/*
	public TailogResponse getTailogResponse() {
		return tailogResponse;
	}
	public void setTailogResponse(TailogResponse tailogResponse) {
		this.tailogResponse = tailogResponse;
	}
	*/
	public String getUpdatedAfter() {
		return updatedAfter;
	}
	public void setUpdatedAfter(String updatedAfter) {
		this.updatedAfter = updatedAfter;
	}
	
	

}
