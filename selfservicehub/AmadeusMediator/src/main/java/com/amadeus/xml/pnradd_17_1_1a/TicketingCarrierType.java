
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ticketing carrier
 * 
 * <p>Java class for TicketingCarrierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketingCarrierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="airlineCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="optionInfo" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="printerNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketingCarrierType", propOrder = {
    "airlineCode",
    "optionInfo",
    "printerNumber",
    "language"
})
public class TicketingCarrierType {

    @XmlElement(required = true)
    protected String airlineCode;
    protected String optionInfo;
    protected String printerNumber;
    protected String language;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the optionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionInfo() {
        return optionInfo;
    }

    /**
     * Sets the value of the optionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionInfo(String value) {
        this.optionInfo = value;
    }

    /**
     * Gets the value of the printerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrinterNumber() {
        return printerNumber;
    }

    /**
     * Sets the value of the printerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrinterNumber(String value) {
        this.printerNumber = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
