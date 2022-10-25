package com.ibsplc.corporate.service.impl;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;


public class PNRListRequestVO extends AbstractVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Request Object for 
	 */
	

	private String officeID;
	private String queNumber;
	private String beginYear;
	private String beginMonth;
	private String beginDay;
	private String endYear;
	private String endMonth;
	private String endDay;
	private String selectionDetails;
	private String categoryNumber;
    private String categoryType;	
	public String getOfficeID() {
		return officeID;
	}
	public void setOfficeID(String officeID) {
		this.officeID = officeID;
	}
	public String getBeginYear() {
		return beginYear;
	}
	public void setBeginYear(String beginYear) {
		this.beginYear = beginYear;
	}
	public String getBeginMonth() {
		return beginMonth;
	}
	public void setBeginMonth(String beginMonth) {
		this.beginMonth = beginMonth;
	}
	public String getBeginDay() {
		return beginDay;
	}
	public void setBeginDay(String beginDay) {
		this.beginDay = beginDay;
	}
	public String getEndYear() {
		return endYear;
	}
	public void setEndYear(String endYear) {
		this.endYear = endYear;
	}
	public String getEndMonth() {
		return endMonth;
	}
	public void setEndMonth(String endMonth) {
		this.endMonth = endMonth;
	}
	public String getEndDay() {
		return endDay;
	}
	public void setEndDay(String endDay) {
		this.endDay = endDay;
	}
	public String getQueNumber() {
		return queNumber;
	}
	public void setQueNumber(String queNumber) {
		this.queNumber = queNumber;
	}
	public String getSelectionDetails() {
		return selectionDetails;
	}
	public void setSelectionDetails(String selectionDetails) {
		this.selectionDetails = selectionDetails;
	}
	public String getCategoryNumber() {
		return categoryNumber;
	}
	public void setCategoryNumber(String categoryNumber) {
		this.categoryNumber = categoryNumber;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	
	

}
