
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * <p>Java class for MonetaryInformationDetailsTypeI_260502C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationDetailsTypeI_260502C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareDataQualifier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="fareAmount" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To11" minOccurs="0"/&gt;
 *         &lt;element name="fareCurrency" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="fareLocation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationDetailsTypeI_260502C", propOrder = {
    "fareDataQualifier",
    "fareAmount",
    "fareCurrency",
    "fareLocation"
})
public class MonetaryInformationDetailsTypeI260502C {

    @XmlElement(required = true)
    protected String fareDataQualifier;
    protected String fareAmount;
    protected String fareCurrency;
    protected String fareLocation;

    /**
     * Gets the value of the fareDataQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareDataQualifier() {
        return fareDataQualifier;
    }

    /**
     * Sets the value of the fareDataQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareDataQualifier(String value) {
        this.fareDataQualifier = value;
    }

    /**
     * Gets the value of the fareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareAmount() {
        return fareAmount;
    }

    /**
     * Sets the value of the fareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareAmount(String value) {
        this.fareAmount = value;
    }

    /**
     * Gets the value of the fareCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCurrency() {
        return fareCurrency;
    }

    /**
     * Sets the value of the fareCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCurrency(String value) {
        this.fareCurrency = value;
    }

    /**
     * Gets the value of the fareLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareLocation() {
        return fareLocation;
    }

    /**
     * Sets the value of the fareLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareLocation(String value) {
        this.fareLocation = value;
    }

}
