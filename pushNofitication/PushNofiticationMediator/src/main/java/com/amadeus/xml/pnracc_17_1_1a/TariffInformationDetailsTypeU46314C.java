
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the rates or tariff details.
 * 
 * <p>Java class for TariffInformationDetailsTypeU_46314C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationDetailsTypeU_46314C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rateIdentifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To7"/>
 *         &lt;element name="unitaryAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To30"/>
 *         &lt;element name="currencyCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="tariffQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="totalAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To20" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="tariffStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationDetailsTypeU_46314C", propOrder = {
    "rateIdentifier",
    "unitaryAmount",
    "currencyCode",
    "tariffQualifier",
    "totalAmount",
    "quantity",
    "tariffStatus"
})
public class TariffInformationDetailsTypeU46314C {

    @XmlElement(required = true)
    protected String rateIdentifier;
    @XmlElement(required = true)
    protected BigDecimal unitaryAmount;
    protected String currencyCode;
    @XmlElement(required = true)
    protected String tariffQualifier;
    protected BigDecimal totalAmount;
    protected BigInteger quantity;
    protected String tariffStatus;

    /**
     * Gets the value of the rateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateIdentifier() {
        return rateIdentifier;
    }

    /**
     * Sets the value of the rateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateIdentifier(String value) {
        this.rateIdentifier = value;
    }

    /**
     * Gets the value of the unitaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnitaryAmount() {
        return unitaryAmount;
    }

    /**
     * Sets the value of the unitaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnitaryAmount(BigDecimal value) {
        this.unitaryAmount = value;
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
     * Gets the value of the tariffQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffQualifier() {
        return tariffQualifier;
    }

    /**
     * Sets the value of the tariffQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffQualifier(String value) {
        this.tariffQualifier = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalAmount(BigDecimal value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the tariffStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTariffStatus() {
        return tariffStatus;
    }

    /**
     * Sets the value of the tariffStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTariffStatus(String value) {
        this.tariffStatus = value;
    }

}
