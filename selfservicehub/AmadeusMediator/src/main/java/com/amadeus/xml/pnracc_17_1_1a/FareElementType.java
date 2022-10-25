
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare element extracted from TST
 * 
 * <p>Java class for FareElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="connection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="notValidBefore" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length6To6" minOccurs="0"/&gt;
 *         &lt;element name="notValidAfter" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length6To6" minOccurs="0"/&gt;
 *         &lt;element name="baggageAllowance" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To3" minOccurs="0"/&gt;
 *         &lt;element name="fareBasis" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="ticketDesignator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To6" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareElementType", propOrder = {
    "primaryCode",
    "connection",
    "notValidBefore",
    "notValidAfter",
    "baggageAllowance",
    "fareBasis",
    "ticketDesignator"
})
public class FareElementType {

    @XmlElement(required = true)
    protected String primaryCode;
    protected String connection;
    protected String notValidBefore;
    protected String notValidAfter;
    protected String baggageAllowance;
    protected String fareBasis;
    protected String ticketDesignator;

    /**
     * Gets the value of the primaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryCode() {
        return primaryCode;
    }

    /**
     * Sets the value of the primaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryCode(String value) {
        this.primaryCode = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnection(String value) {
        this.connection = value;
    }

    /**
     * Gets the value of the notValidBefore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotValidBefore(String value) {
        this.notValidBefore = value;
    }

    /**
     * Gets the value of the notValidAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotValidAfter(String value) {
        this.notValidAfter = value;
    }

    /**
     * Gets the value of the baggageAllowance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * Sets the value of the baggageAllowance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowance(String value) {
        this.baggageAllowance = value;
    }

    /**
     * Gets the value of the fareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * Sets the value of the fareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasis(String value) {
        this.fareBasis = value;
    }

    /**
     * Gets the value of the ticketDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketDesignator() {
        return ticketDesignator;
    }

    /**
     * Sets the value of the ticketDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketDesignator(String value) {
        this.ticketDesignator = value;
    }

}
