
package com.amadeus.xml.tatreq_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the current and/or original fare basis code.
 * 
 * <p>Java class for RateTariffClassInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateTariffClassInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rateTariffClass" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="rateTariffIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="otherRateTariffClass" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="otherRateTariffIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateTariffClassInformationTypeI", propOrder = {
    "rateTariffClass",
    "rateTariffIndicator",
    "otherRateTariffClass",
    "otherRateTariffIndicator"
})
public class RateTariffClassInformationTypeI {

    protected String rateTariffClass;
    protected String rateTariffIndicator;
    protected String otherRateTariffClass;
    protected String otherRateTariffIndicator;

    /**
     * Gets the value of the rateTariffClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTariffClass() {
        return rateTariffClass;
    }

    /**
     * Sets the value of the rateTariffClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTariffClass(String value) {
        this.rateTariffClass = value;
    }

    /**
     * Gets the value of the rateTariffIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateTariffIndicator() {
        return rateTariffIndicator;
    }

    /**
     * Sets the value of the rateTariffIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateTariffIndicator(String value) {
        this.rateTariffIndicator = value;
    }

    /**
     * Gets the value of the otherRateTariffClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRateTariffClass() {
        return otherRateTariffClass;
    }

    /**
     * Sets the value of the otherRateTariffClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRateTariffClass(String value) {
        this.otherRateTariffClass = value;
    }

    /**
     * Gets the value of the otherRateTariffIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRateTariffIndicator() {
        return otherRateTariffIndicator;
    }

    /**
     * Sets the value of the otherRateTariffIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRateTariffIndicator(String value) {
        this.otherRateTariffIndicator = value;
    }

}
