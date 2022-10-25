package com.ibsplc.amadeus.vo;

import java.util.ArrayList;
import java.util.List;

public class AdditionalInfoVO  extends AbstractVO {
	
	private FreeTextDetailsVO freeTextDetails;
	private List<String> freeText =new ArrayList<String>();
 
	
	

	/**
	 * @return the freeTextDetails
	 */
	public FreeTextDetailsVO getFreeTextDetails() {
		return freeTextDetails;
	}

	/**
	 * @param freeTextDetails the freeTextDetails to set
	 */
	public void setFreeTextDetails(FreeTextDetailsVO freeTextDetails) {
		this.freeTextDetails = freeTextDetails;
	}

	/**
	 * @return the freeText
	 */
	public List<String> getFreeText() {
		return freeText;
	}

	/**
	 * @param freeText the freeText to set
	 */
	public void setFreeText(List<String> freeText) {
		this.freeText = freeText;
	}
 
	

}
