package com.ibsplc.amadeus.vo;

import java.util.List;

public class MarketingInfoVO  extends AbstractVO {
	
	private FreeTextDetailsVO freetextDetail;
	private List<String> text;
	

 
 
	/**
	 * @return the freetextDetail
	 */
	public FreeTextDetailsVO getFreetextDetail() {
		return freetextDetail;
	}

	/**
	 * @param freetextDetail the freetextDetail to set
	 */
	public void setFreetextDetail(FreeTextDetailsVO freetextDetail) {
		this.freetextDetail = freetextDetail;
	}

	/**
	 * @return the text
	 */
	public List<String> getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(List<String> text) {
		this.text = text;
	}
	
	
}
