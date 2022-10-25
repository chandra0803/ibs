package com.ibsplc.TailogIntegration.VO;

public class SageRequest {
	
	private String currentDate;

	public String getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}

	@Override
	public String toString() {
		return "SageRequest [currentDate=" + currentDate + "]";
	}


}
