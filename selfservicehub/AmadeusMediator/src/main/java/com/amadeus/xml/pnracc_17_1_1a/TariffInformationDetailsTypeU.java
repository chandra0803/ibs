
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the rates or tariff details.
 * 
 * <p>Java class for TariffInformationDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationDetailsTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To18"/&gt;
 *         &lt;element name="currencyCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="priceQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationDetailsTypeU", propOrder = {
    "priceAmount",
    "currencyCode",
    "priceQualifier"
})
public class TariffInformationDetailsTypeU {

    @XmlElement(required = true)
    protected BigDecimal priceAmount;
    @XmlElement(required = true)
    protected String currencyCode;
    @XmlElement(required = true)
    protected String priceQualifier;

    /**
     * Gets the value of the priceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceAmount() {
        return priceAmount;
    }

    /**
     * Sets the value of the priceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceAmount(BigDecimal value) {
        this.priceAmount = value;
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

    /**
     * Gets the value of the priceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceQualifier() {
        return priceQualifier;
    }

    /**
     * Sets the value of the priceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceQualifier(String value) {
        this.priceQualifier = value;
    }

}
