package com.ibsplc.flightsearch.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseParams {

	@JsonProperty("LANGUAGE")
	private String language;
	@JsonProperty("SITE")
	private String site;
	@JsonProperty("EMBEDDED_TRANSACTION")
	private String embedded_transaction;
	@JsonProperty("ENCT")
	private String enct;
	@JsonProperty("ENC")
	private String enc;
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getEmbedded_transaction() {
		return embedded_transaction;
	}
	public void setEmbedded_transaction(String embedded_transaction) {
		this.embedded_transaction = embedded_transaction;
	}
	public String getEnct() {
		return enct;
	}
	public void setEnct(String enct) {
		this.enct = enct;
	}
	public String getEnc() {
		return enc;
	}
	public void setEnc(String enc) {
		this.enc = enc;
	}
	
	
}
