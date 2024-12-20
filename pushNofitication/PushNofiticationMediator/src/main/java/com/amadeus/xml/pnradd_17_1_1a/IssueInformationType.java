
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Issue information
 * 
 * <p>Java class for IssueInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssueInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airlineCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length3To3"/>
 *         &lt;element name="documentNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To10"/>
 *         &lt;element name="documentCD" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="coupon1" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="coupon2" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="coupon3" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="coupon4" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="lastConjunction" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length2To2" minOccurs="0"/>
 *         &lt;element name="exchangeDocumentCD" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="lastConjunction1" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="lastConjunction2" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="lastConjunction3" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="lastConjunction4" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="cityCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length3To3"/>
 *         &lt;element name="dateOfIssue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}Date_DDMMYY"/>
 *         &lt;element name="iataNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericDecimal_Length1To10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssueInformationType", propOrder = {
    "airlineCode",
    "documentNumber",
    "documentCD",
    "coupon1",
    "coupon2",
    "coupon3",
    "coupon4",
    "lastConjunction",
    "exchangeDocumentCD",
    "lastConjunction1",
    "lastConjunction2",
    "lastConjunction3",
    "lastConjunction4",
    "cityCode",
    "dateOfIssue",
    "iataNumber",
    "currency",
    "amount"
})
public class IssueInformationType {

    @XmlElement(required = true)
    protected String airlineCode;
    @XmlElement(required = true)
    protected String documentNumber;
    protected BigInteger documentCD;
    protected String coupon1;
    protected String coupon2;
    protected String coupon3;
    protected String coupon4;
    protected BigInteger lastConjunction;
    protected BigInteger exchangeDocumentCD;
    protected String lastConjunction1;
    protected String lastConjunction2;
    protected String lastConjunction3;
    protected String lastConjunction4;
    @XmlElement(required = true)
    protected String cityCode;
    @XmlElement(required = true)
    protected String dateOfIssue;
    protected String iataNumber;
    protected String currency;
    protected BigDecimal amount;

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
     * Gets the value of the documentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNumber() {
        return documentNumber;
    }

    /**
     * Sets the value of the documentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNumber(String value) {
        this.documentNumber = value;
    }

    /**
     * Gets the value of the documentCD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentCD() {
        return documentCD;
    }

    /**
     * Sets the value of the documentCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentCD(BigInteger value) {
        this.documentCD = value;
    }

    /**
     * Gets the value of the coupon1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon1() {
        return coupon1;
    }

    /**
     * Sets the value of the coupon1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon1(String value) {
        this.coupon1 = value;
    }

    /**
     * Gets the value of the coupon2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon2() {
        return coupon2;
    }

    /**
     * Sets the value of the coupon2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon2(String value) {
        this.coupon2 = value;
    }

    /**
     * Gets the value of the coupon3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon3() {
        return coupon3;
    }

    /**
     * Sets the value of the coupon3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon3(String value) {
        this.coupon3 = value;
    }

    /**
     * Gets the value of the coupon4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoupon4() {
        return coupon4;
    }

    /**
     * Sets the value of the coupon4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoupon4(String value) {
        this.coupon4 = value;
    }

    /**
     * Gets the value of the lastConjunction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastConjunction() {
        return lastConjunction;
    }

    /**
     * Sets the value of the lastConjunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastConjunction(BigInteger value) {
        this.lastConjunction = value;
    }

    /**
     * Gets the value of the exchangeDocumentCD property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExchangeDocumentCD() {
        return exchangeDocumentCD;
    }

    /**
     * Sets the value of the exchangeDocumentCD property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExchangeDocumentCD(BigInteger value) {
        this.exchangeDocumentCD = value;
    }

    /**
     * Gets the value of the lastConjunction1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastConjunction1() {
        return lastConjunction1;
    }

    /**
     * Sets the value of the lastConjunction1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastConjunction1(String value) {
        this.lastConjunction1 = value;
    }

    /**
     * Gets the value of the lastConjunction2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastConjunction2() {
        return lastConjunction2;
    }

    /**
     * Sets the value of the lastConjunction2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastConjunction2(String value) {
        this.lastConjunction2 = value;
    }

    /**
     * Gets the value of the lastConjunction3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastConjunction3() {
        return lastConjunction3;
    }

    /**
     * Sets the value of the lastConjunction3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastConjunction3(String value) {
        this.lastConjunction3 = value;
    }

    /**
     * Gets the value of the lastConjunction4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastConjunction4() {
        return lastConjunction4;
    }

    /**
     * Sets the value of the lastConjunction4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastConjunction4(String value) {
        this.lastConjunction4 = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the dateOfIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * Sets the value of the dateOfIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfIssue(String value) {
        this.dateOfIssue = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIataNumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIataNumber(String value) {
        this.iataNumber = value;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

}
