
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxFieldsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxFieldsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="taxCurrency" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="taxAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To12"/>
 *         &lt;element name="taxCountryCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="taxNatureCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxFieldsType", propOrder = {
    "taxIndicator",
    "taxCurrency",
    "taxAmount",
    "taxCountryCode",
    "taxNatureCode"
})
public class TaxFieldsType {

    @XmlElement(required = true)
    protected String taxIndicator;
    @XmlElement(required = true)
    protected String taxCurrency;
    @XmlElement(required = true)
    protected String taxAmount;
    @XmlElement(required = true)
    protected String taxCountryCode;
    protected String taxNatureCode;

    /**
     * Gets the value of the taxIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxIndicator() {
        return taxIndicator;
    }

    /**
     * Sets the value of the taxIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxIndicator(String value) {
        this.taxIndicator = value;
    }

    /**
     * Gets the value of the taxCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCurrency() {
        return taxCurrency;
    }

    /**
     * Sets the value of the taxCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCurrency(String value) {
        this.taxCurrency = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAmount(String value) {
        this.taxAmount = value;
    }

    /**
     * Gets the value of the taxCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCountryCode() {
        return taxCountryCode;
    }

    /**
     * Sets the value of the taxCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCountryCode(String value) {
        this.taxCountryCode = value;
    }

    /**
     * Gets the value of the taxNatureCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNatureCode() {
        return taxNatureCode;
    }

    /**
     * Sets the value of the taxNatureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNatureCode(String value) {
        this.taxNatureCode = value;
    }

}
