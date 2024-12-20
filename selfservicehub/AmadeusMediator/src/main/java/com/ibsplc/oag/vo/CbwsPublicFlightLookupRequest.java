//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.03.03 at 12:43:24 PM IST 
//


package com.ibsplc.oag.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for cbwsPublicFlightLookupRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cbwsPublicFlightLookupRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.connections.oag.com/}cbwsPublicRequest">
 *       &lt;sequence>
 *         &lt;element name="carrierCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeFormat" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portOfInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cbwsPublicFlightLookupRequest", propOrder = {
    "carrierCode",
    "serviceNumber",
    "timeFormat",
    "portOfInterest"
})
public class CbwsPublicFlightLookupRequest
    extends CbwsPublicRequest
{

    protected String carrierCode;
    protected String serviceNumber;
    protected String timeFormat;
    protected String portOfInterest;

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the serviceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceNumber() {
        return serviceNumber;
    }

    /**
     * Sets the value of the serviceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceNumber(String value) {
        this.serviceNumber = value;
    }

    /**
     * Gets the value of the timeFormat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * Sets the value of the timeFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeFormat(String value) {
        this.timeFormat = value;
    }

    /**
     * Gets the value of the portOfInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortOfInterest() {
        return portOfInterest;
    }

    /**
     * Sets the value of the portOfInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortOfInterest(String value) {
        this.portOfInterest = value;
    }

}
