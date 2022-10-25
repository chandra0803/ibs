package com.ibsplc.reservation.vo;

public class ManageBookingVO extends LoginRequestVO {
	
	private static final long serialVersionUID = 1L;
	private String siteID;;
	private String amadeusLanguageCode;
	
	private String embTransRetrieveAction;
	private String encryptionEnabled;

	public String getSiteID() {
		return siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	public String getAmadeusLanguageCode() {
		return amadeusLanguageCode;
	}

	public void setAmadeusLanguageCode(String amadeusLanguageCode) {
		this.amadeusLanguageCode = amadeusLanguageCode;
	}

	public String getEncryptionEnabled() {
		return encryptionEnabled;
	}

	public void setEncryptionEnabled(String encryptionEnabled) {
		this.encryptionEnabled = encryptionEnabled;
	}

	public String getEmbTransRetrieveAction() {
		return embTransRetrieveAction;
	}

	public void setEmbTransRetrieveAction(String embTransRetrieveAction) {
		this.embTransRetrieveAction = embTransRetrieveAction;
	}

	
		
}
