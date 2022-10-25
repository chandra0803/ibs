
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the rates or tariff details.
 * 
 * <p>Java class for TariffInformationDetailsTypeI_50731C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationDetailsTypeI_50731C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareBasisCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/&gt;
 *         &lt;element name="fareBaseAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To18" minOccurs="0"/&gt;
 *         &lt;element name="currencyCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationDetailsTypeI_50731C", propOrder = {
    "fareBasisCode",
    "fareBaseAmount",
    "currencyCode"
})
public class TariffInformationDetailsTypeI50731C {

    protected String fareBasisCode;
    protected BigDecimal fareBaseAmount;
    protected String currencyCode;

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareBasisCode(String value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the fareBaseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFareBaseAmount() {
        return fareBaseAmount;
    }

    /**
     * Sets the value of the fareBaseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFareBaseAmount(BigDecimal value) {
        this.fareBaseAmount = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

}
