package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class EMDDetailsVO extends AbstractVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String emdNumber;

	private String serviceType;

	private String serviceAmount;

	private String serviceCurrency;

	public String getEmdNumber() {
		return emdNumber;
	}

	public void setEmdNumber(String emdNumber) {
		this.emdNumber = emdNumber;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getServiceAmount() {
		return serviceAmount;
	}

	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}

	public String getServiceCurrency() {
		return serviceCurrency;
	}

	public void setServiceCurrency(String serviceCurrency) {
		this.serviceCurrency = serviceCurrency;
	}

	@Override
	public String toString() {
		return "EMDDetailsVO [emdNumber=" + emdNumber + ", serviceType=" + serviceType + ", serviceAmount="
				+ serviceAmount + ", serviceCurrency=" + serviceCurrency + "]";
	}	

}
