/**
 * @(#)XMLParser.java 0.1 Feb 23, 2007 9:01:47 AM;
 *
 * Copyright 2009 IBS Software Services (P) Ltd. All Rights Reserved.
 *
 * This Software is the proprietary information of IBS Software Services (P)
 * Ltd.Use is subject to License terms.
 */
package com.ibsplc.common.xmlparsing;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.ibsplc.common.service.impl.CommonServiceImpl;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This util is usefull for pasrsing xml files of the form.
 * 	<SomeValue>
 * 		<CodeAndValue>
 *			<Code>Value</Code>
 *		</CodeAndValue>
 *	</SomeValue>
 *
 * The only elements permitted are those of CodeAndValue as the parent node and
 * Code && Value as the child nodes element and value.
 * For parsing an xml file of the above form, we have to call the parse function with
 * the file name and the name of the parent node (codeValue) as arguments.
 * @author A
  */
public class XMLParser extends DefaultHandler{

    /**
     * log
     */
    //private static final Logger log = Log.getLogger(XMLParser.class);   
	
	private static final Logger LOGGER = Log4j2Logger.create(CommonServiceImpl.class);
	/**
	 * PARENT_NODE
	 */
	private String parent_node = "";


	/**
	 * tempVal
	 */
	private String tempVal;
	/**
	 * attr
	 */
	private Map<String, String> attr;
	
	//to maintain context
	/**
	 * xmlParentElement
	 */
	private XMLParentElement xmlParentElement;
	/**
	 * xmlElement
	 */
	private XMLElement xmlElement;

	/**
	 * xmlParentElements
	 */
	private List<XMLParentElement> xmlParentElements;


	/**
	 * This method is used to get parse the given xml file, given the parent node.
	 * @String fileName - the absolute location where the file is located
	 * @String parentNode - the parent node used for distinguishing the files
	 */
	public List<XMLParentElement> parseDocument(String fileName, String parentNode) {
		if(fileName == null || parentNode == null){
			return new ArrayList<>();
		}

		this.parent_node = parentNode;

		//get a factory
		SAXParserFactory spf = SAXParserFactory.newInstance();
		xmlParentElements = new ArrayList<XMLParentElement>();
		try {

			//get a new instance of parser
			SAXParser sp = spf.newSAXParser();

			//parse the file and also register this class for call backs
			sp.parse(fileName, this);

		}catch(SAXException se) {
			//log.error("",se);
			LOGGER.error("", se);
		}catch(ParserConfigurationException pce) {
			//log.error("",pce);
			LOGGER.error("", pce);
		}catch (IOException ie) {
			//log.error("",ie);
			LOGGER.error("", ie);
		}
		return xmlParentElements;
	}


	//Event Handlers
	/**
	 * (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, 
	 * java.lang.String, org.xml.sax.Attributes)
	 */
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		//reset
		tempVal = "";
		attr = null;
		if(attributes != null && attributes.getLength() > 0) {
			attr = new HashMap<String, String>();
			for(int i = 0; i < attributes.getLength(); ++i) {
				attr.put(attributes.getQName(i), attributes.getValue(i));
			}		
		}
		if(qName.equalsIgnoreCase(parent_node)) {
			//create a new instance of XMLParentElement
			if(xmlParentElement == null){
				xmlParentElement = new XMLParentElement();
			}

			xmlParentElement.setXmlElements(new ArrayList<XMLElement>());

			xmlParentElement.setAttributes(attr);
		}
	}


	/**
	 * (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	public void characters(char[] ch, int start, int length) throws SAXException {
		//tempVal = new String(ch,start,length);
		tempVal = String.valueOf(ch,start,length);
	}

	/**
	 * (non-Javadoc)
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String, java.lang.String, java.lang.String)
	 */
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equalsIgnoreCase(parent_node)) {
			//add it to the list
			xmlParentElements.add(xmlParentElement);
			//create a new instance of XMLParentElement
			xmlParentElement = new XMLParentElement();

		}else if(xmlParentElement != null && xmlParentElement.getXmlElements() != null) {
			xmlElement = new XMLElement();
			xmlElement.setElement(qName);
			xmlElement.setValue(tempVal);
			xmlElement.setAttributes(attr);
			xmlParentElement.getXmlElements().add(xmlElement);
		}
	}

/*	public static void main(String args[]) {
		ArrayList result = new XMLParser().parseDocument("D:\\Projects\\ifly\\managereservations
		\\config\\master\\permittedCities.xml","CityList");
		log.debug("Result" + result);
	}*/

}




