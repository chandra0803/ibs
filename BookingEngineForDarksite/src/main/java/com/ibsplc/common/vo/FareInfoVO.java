package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class FareInfoVO extends AbstractVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String fareType;

	private String fareAmount;

	private String fareCurrency;

	public String getFareType() {
		return fareType;
	}

	public void setFareType(String fareType) {
		this.fareType = fareType;
	}

	public String getFareAmount() {
		return fareAmount;
	}

	public void setFareAmount(String fareAmount) {
		this.fareAmount = fareAmount;
	}

	public String getFareCurrency() {
		return fareCurrency;
	}

	public void setFareCurrency(String fareCurrency) {
		this.fareCurrency = fareCurrency;
	}

}
