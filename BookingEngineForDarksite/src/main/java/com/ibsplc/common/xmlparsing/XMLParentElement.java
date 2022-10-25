/**
 * @(#)XMLParentElement.java 0.1 Feb 23, 2007 9:01:47 AM;
 *
 * Copyright 2009 IBS Software Services (P) Ltd. All Rights Reserved.
 *
 * This Software is the proprietary information of IBS Software Services (P)
 * Ltd.Use is subject to License terms.
 */
package com.ibsplc.common.xmlparsing;

import java.util.List;
import java.util.Map;

/**
 * This class represents the XML parent element, depending upon which
 * the xml elements are grouped
 * @author A
 */
public class XMLParentElement {

	/**
	 * xmlElements
	 */
	private List<XMLElement> xmlElements;

	/**
	 * To get the attribute of the
	 */
	private Map<String, String> attributes;

	/**
	 * getXmlElements
	 * @return
	 */
	public List<XMLElement> getXmlElements() {
		return xmlElements;
	}

	/**
	 * setXmlElements
	 * @param xmlElements
	 */
	public void setXmlElements(List<XMLElement> xmlElements) {
		this.xmlElements = xmlElements;
	}

	/**
	 *  (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new StringBuffer("Elements are\n").
			append(xmlElements).append(attributes).toString();
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
