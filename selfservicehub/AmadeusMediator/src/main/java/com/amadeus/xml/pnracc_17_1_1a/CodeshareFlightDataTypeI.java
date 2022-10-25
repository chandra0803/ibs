
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * provide codeshare information
 * 
 * <p>Java class for CodeshareFlightDataTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodeshareFlightDataTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airline" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="flightNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length0To4"/&gt;
 *         &lt;element name="inventory" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length0To3"/&gt;
 *         &lt;element name="sellingClass" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1"/&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2"/&gt;
 *         &lt;element name="suffix" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="cascadingIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodeshareFlightDataTypeI", propOrder = {
    "airline",
    "flightNumber",
    "inventory",
    "sellingClass",
    "type",
    "suffix",
    "cascadingIndicator"
})
public class CodeshareFlightDataTypeI {

    @XmlElement(required = true)
    protected String airline;
    @XmlElement(required = true)
    protected BigInteger flightNumber;
    @XmlElement(required = true)
    protected String inventory;
    @XmlElement(required = true)
    protected String sellingClass;
    @XmlElement(required = true)
    protected String type;
    protected String suffix;
    protected BigInteger cascadingIndicator;

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFlightNumber(BigInteger value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventory(String value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the sellingClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellingClass() {
        return sellingClass;
    }

    /**
     * Sets the value of the sellingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellingClass(String value) {
        this.sellingClass = value;
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
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the cascadingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCascadingIndicator() {
        return cascadingIndicator;
    }

    /**
     * Sets the value of the cascadingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCascadingIndicator(BigInteger value) {
        this.cascadingIndicator = value;
    }

}
