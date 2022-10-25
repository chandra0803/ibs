/**
 * @(#)XMLElement.java 0.1 Feb 23, 2007 9:01:47 AM;
 *
 * Copyright 2009 IBS Software Services (P) Ltd. All Rights Reserved.
 *
 * This Software is the proprietary information of IBS Software Services (P)
 * Ltd.Use is subject to License terms.
 */


package com.ibsplc.common.xmlparsing;

import java.util.Map;

/**
 * This class represents each element of the xml
 * Its of the form <element value/>
 * @author Joseph
 */
public class XMLElement {

	/**
	 * element
	 */
	private String element;

	/**
	 * value
	 */
	private String value;

	/**
	 * To get the attribute of the element
	 */
	private Map<String, String> attributes;

	/**
	 * getElement
	 * @return
	 */
	public String getElement() {
		return element;
	}

	/**
	 * setElement
	 * @param element
	 */
	public void setElement(String element) {
		this.element = element;
	}

	/**
	 * getValue
	 * @return
	 */
	public String getValue() {
		return value;
	}

	/**
	 * setValue
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	
	/**
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new StringBuffer("").
			append("element ").append(element).append("\n").
			append("value ").append(value).
			append("attributes ").append(attributes).toString();
	}

	/**
	 * getAttributes
	 * @return
	 */
	public Map<String, String> getAttributes() {
		return attributes;
	}
	

	/**
	 * setAttributes
	 * @param attributes
	 */
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	
}
