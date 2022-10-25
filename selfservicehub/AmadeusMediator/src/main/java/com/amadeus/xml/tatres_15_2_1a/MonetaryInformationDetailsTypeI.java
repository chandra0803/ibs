
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type of monetary amount, the amount, and the currency code.
 * 
 * <p>Java class for MonetaryInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeQualifier" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="amount" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35"/&gt;
 *         &lt;element name="currency" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="locationFrom" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/&gt;
 *         &lt;element name="locationTo" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To25" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationDetailsTypeI", propOrder = {
    "typeQualifier",
    "amount",
    "currency",
    "locationFrom",
    "locationTo"
})
public class MonetaryInformationDetailsTypeI {

    @XmlElement(required = true)
    protected String typeQualifier;
    @XmlElement(required = true)
    protected String amount;
    protected String currency;
    protected String locationFrom;
    protected String locationTo;

    /**
     * Gets the value of the typeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeQualifier() {
        return typeQualifier;
    }

    /**
     * Sets the value of the typeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeQualifier(String value) {
        this.typeQualifier = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmount(String value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the locationFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationFrom() {
        return locationFrom;
    }

    /**
     * Sets the value of the locationFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationFrom(String value) {
        this.locationFrom = value;
    }

    /**
     * Gets the value of the locationTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTo() {
        return locationTo;
    }

    /**
     * Sets the value of the locationTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTo(String value) {
        this.locationTo = value;
    }

}
