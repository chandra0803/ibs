package com.ibsplc.reservation.vo;

 

import com.ibsplc.common.vo.CommonRequestParametersVO;

public class LoginRequestVO extends CommonRequestParametersVO{
	private static final long serialVersionUID = 1L;
	/**
	 * PNR Num
	 */	
 
	private String pnrNumber;
	
	/**
	 * SurName
	 */	
 
	private String surName;

	public String getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(String pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	
}
