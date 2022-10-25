package com.ibsplc.amadeus.vo;

public class RemarkDetailsVO   extends AbstractVO {
	
	private String type;
	private String freetext;
	private String language;
	private String encoding;
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the freetext
	 */
	public String getFreetext() {
		return freetext;
	}
	/**
	 * @param freetext the freetext to set
	 */
	public void setFreetext(String freetext) {
		this.freetext = freetext;
	}
	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * @return the encoding
	 */
	public String getEncoding() {
		return encoding;
	}
	/**
	 * @param encoding the encoding to set
	 */
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}
	
	
	

}
