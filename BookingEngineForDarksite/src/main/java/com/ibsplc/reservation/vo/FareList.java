package com.ibsplc.reservation.vo;

import java.util.List;

import com.ibsplc.framework.vo.AbstractVO;

public class FareList extends AbstractVO{

	private List<String> amountReferenceNumber;
	
	private List<String> passengerType;
	
	private String amountLineNumber;
	
	private String totalAmount;

	public List<String> getAmountReferenceNumber() {
		return amountReferenceNumber;
	}

	public void setAmountReferenceNumber(List<String> amountReferenceNumber) {
		this.amountReferenceNumber = amountReferenceNumber;
	}

	public List<String> getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(List<String> passengerType) {
		this.passengerType = passengerType;
	}

	public String getAmountLineNumber() {
		return amountLineNumber;
	}

	public void setAmountLineNumber(String amountLineNumber) {
		this.amountLineNumber = amountLineNumber;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
