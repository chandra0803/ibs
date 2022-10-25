package com.ibsplc.common.constants;

import java.io.Serializable;

public class CommonSessionObject implements Serializable{
	private static final long serialVersionUID = 1L;
	private String sessionId;
	private String product;
	private String language;
	private String country;
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}
