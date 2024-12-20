
package com.amadeus.xml.tatreq_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify indicators related to pricing and ticketing.
 * 
 * <p>Java class for PricingTicketingInformationTypeI_83775C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingInformationTypeI_83775C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticketingModeIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="internationalDomSalesIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="statisticalCodeIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="selfSaleIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="netReportingIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="taxOnCommissionIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonEndorsableIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonRefundableIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="penaltyRestrictionIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="presentCreditCardIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonInterlineableIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonCommissionableIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonExchangeableIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingInformationTypeI_83775C", propOrder = {
    "ticketingModeIndicator",
    "internationalDomSalesIndicator",
    "statisticalCodeIndicator",
    "selfSaleIndicator",
    "netReportingIndicator",
    "taxOnCommissionIndicator",
    "nonEndorsableIndicator",
    "nonRefundableIndicator",
    "penaltyRestrictionIndicator",
    "presentCreditCardIndicator",
    "nonInterlineableIndicator",
    "nonCommissionableIndicator",
    "nonExchangeableIndicator"
})
public class PricingTicketingInformationTypeI83775C {

    protected String ticketingModeIndicator;
    protected String internationalDomSalesIndicator;
    protected String statisticalCodeIndicator;
    protected String selfSaleIndicator;
    protected String netReportingIndicator;
    protected String taxOnCommissionIndicator;
    protected String nonEndorsableIndicator;
    protected String nonRefundableIndicator;
    protected String penaltyRestrictionIndicator;
    protected String presentCreditCardIndicator;
    protected String nonInterlineableIndicator;
    protected String nonCommissionableIndicator;
    protected String nonExchangeableIndicator;

    /**
     * Gets the value of the ticketingModeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingModeIndicator() {
        return ticketingModeIndicator;
    }

    /**
     * Sets the value of the ticketingModeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingModeIndicator(String value) {
        this.ticketingModeIndicator = value;
    }

    /**
     * Gets the value of the internationalDomSalesIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalDomSalesIndicator() {
        return internationalDomSalesIndicator;
    }

    /**
     * Sets the value of the internationalDomSalesIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalDomSalesIndicator(String value) {
        this.internationalDomSalesIndicator = value;
    }

    /**
     * Gets the value of the statisticalCodeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalCodeIndicator() {
        return statisticalCodeIndicator;
    }

    /**
     * Sets the value of the statisticalCodeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalCodeIndicator(String value) {
        this.statisticalCodeIndicator = value;
    }

    /**
     * Gets the value of the selfSaleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelfSaleIndicator() {
        return selfSaleIndicator;
    }

    /**
     * Sets the value of the selfSaleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelfSaleIndicator(String value) {
        this.selfSaleIndicator = value;
    }

    /**
     * Gets the value of the netReportingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetReportingIndicator() {
        return netReportingIndicator;
    }

    /**
     * Sets the value of the netReportingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetReportingIndicator(String value) {
        this.netReportingIndicator = value;
    }

    /**
     * Gets the value of the taxOnCommissionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOnCommissionIndicator() {
        return taxOnCommissionIndicator;
    }

    /**
     * Sets the value of the taxOnCommissionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOnCommissionIndicator(String value) {
        this.taxOnCommissionIndicator = value;
    }

    /**
     * Gets the value of the nonEndorsableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEndorsableIndicator() {
        return nonEndorsableIndicator;
    }

    /**
     * Sets the value of the nonEndorsableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEndorsableIndicator(String value) {
        this.nonEndorsableIndicator = value;
    }

    /**
     * Gets the value of the nonRefundableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonRefundableIndicator() {
        return nonRefundableIndicator;
    }

    /**
     * Sets the value of the nonRefundableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonRefundableIndicator(String value) {
        this.nonRefundableIndicator = value;
    }

    /**
     * Gets the value of the penaltyRestrictionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyRestrictionIndicator() {
        return penaltyRestrictionIndicator;
    }

    /**
     * Sets the value of the penaltyRestrictionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyRestrictionIndicator(String value) {
        this.penaltyRestrictionIndicator = value;
    }

    /**
     * Gets the value of the presentCreditCardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentCreditCardIndicator() {
        return presentCreditCardIndicator;
    }

    /**
     * Sets the value of the presentCreditCardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentCreditCardIndicator(String value) {
        this.presentCreditCardIndicator = value;
    }

    /**
     * Gets the value of the nonInterlineableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonInterlineableIndicator() {
        return nonInterlineableIndicator;
    }

    /**
     * Sets the value of the nonInterlineableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonInterlineableIndicator(String value) {
        this.nonInterlineableIndicator = value;
    }

    /**
     * Gets the value of the nonCommissionableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCommissionableIndicator() {
        return nonCommissionableIndicator;
    }

    /**
     * Sets the value of the nonCommissionableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCommissionableIndicator(String value) {
        this.nonCommissionableIndicator = value;
    }

    /**
     * Gets the value of the nonExchangeableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonExchangeableIndicator() {
        return nonExchangeableIndicator;
    }

    /**
     * Sets the value of the nonExchangeableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonExchangeableIndicator(String value) {
        this.nonExchangeableIndicator = value;
    }

}
