
package com.amadeus.xml.apalrr_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a ticket number, type of ticket, and related information.
 * 
 * <p>Java class for TicketNumberDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To15"/>
 *         &lt;element name="type" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="numberOfBooklets" type="{http://xml.amadeus.com/APALRR_17_1_1A}NumericInteger_Length1To14" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberDetailsType", propOrder = {
    "number",
    "type",
    "numberOfBooklets"
})
public class TicketNumberDetailsType {

    @XmlElement(required = true)
    protected String number;
    @XmlElement(required = true)
    protected String type;
    protected BigInteger numberOfBooklets;

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

}
