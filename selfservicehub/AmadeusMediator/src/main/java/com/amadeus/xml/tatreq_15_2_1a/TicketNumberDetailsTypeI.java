
package com.amadeus.xml.tatreq_15_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a ticket number, type of ticket, and related information.
 * 
 * <p>Java class for TicketNumberDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="numberOfBooklets" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericInteger_Length1To15" minOccurs="0"/&gt;
 *         &lt;element name="dataIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="inConnectionWith" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberDetailsTypeI", propOrder = {
    "number",
    "type",
    "numberOfBooklets",
    "dataIndicator",
    "inConnectionWith"
})
public class TicketNumberDetailsTypeI {

    protected String number;
    protected String type;
    protected BigInteger numberOfBooklets;
    protected String dataIndicator;
    protected String inConnectionWith;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the numberOfBooklets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfBooklets() {
        return numberOfBooklets;
    }

    /**
     * Sets the value of the numberOfBooklets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfBooklets(BigInteger value) {
        this.numberOfBooklets = value;
    }

    /**
     * Gets the value of the dataIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataIndicator() {
        return dataIndicator;
    }

    /**
     * Sets the value of the dataIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataIndicator(String value) {
        this.dataIndicator = value;
    }

    /**
     * Gets the value of the inConnectionWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInConnectionWith() {
        return inConnectionWith;
    }

    /**
     * Sets the value of the inConnectionWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInConnectionWith(String value) {
        this.inConnectionWith = value;
    }

}
