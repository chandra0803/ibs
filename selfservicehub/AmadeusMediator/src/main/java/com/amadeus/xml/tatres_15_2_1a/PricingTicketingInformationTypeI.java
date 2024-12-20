
package com.amadeus.xml.tatres_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify indicators related to pricing and ticketing.
 * 
 * <p>Java class for PricingTicketingInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ticketingModeIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="internationalDomSalesIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="statisticalCode" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="selfSaleIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="netReportingIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="taxOnCommissionIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonEndorsableIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonRefundableIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="penaltyRestrictionIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="presentCreditCardIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="emergencySet" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="emergencyClear" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonInterlineableIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonCommissionable" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="presentDebitCardIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="nonReissuableIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="carrierFeeReportingIndicator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="refundSystemComputerCalculated" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="refundManuallyCalculated" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="indicators" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" maxOccurs="11" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingInformationTypeI", propOrder = {
    "ticketingModeIndicator",
    "internationalDomSalesIndicator",
    "statisticalCode",
    "selfSaleIndicator",
    "netReportingIndicator",
    "taxOnCommissionIndicator",
    "nonEndorsableIndicator",
    "nonRefundableIndicator",
    "penaltyRestrictionIndicator",
    "presentCreditCardIndicator",
    "emergencySet",
    "emergencyClear",
    "nonInterlineableIndicator",
    "nonCommissionable",
    "presentDebitCardIndicator",
    "nonReissuableIndicator",
    "carrierFeeReportingIndicator",
    "refundSystemComputerCalculated",
    "refundManuallyCalculated",
    "indicators"
})
public class PricingTicketingInformationTypeI {

    protected String ticketingModeIndicator;
    protected String internationalDomSalesIndicator;
    protected String statisticalCode;
    protected String selfSaleIndicator;
    protected String netReportingIndicator;
    protected String taxOnCommissionIndicator;
    protected String nonEndorsableIndicator;
    protected String nonRefundableIndicator;
    protected String penaltyRestrictionIndicator;
    protected String presentCreditCardIndicator;
    protected String emergencySet;
    protected String emergencyClear;
    protected String nonInterlineableIndicator;
    protected String nonCommissionable;
    protected String presentDebitCardIndicator;
    protected String nonReissuableIndicator;
    protected String carrierFeeReportingIndicator;
    protected String refundSystemComputerCalculated;
    protected String refundManuallyCalculated;
    protected List<String> indicators;

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
     * Gets the value of the statisticalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalCode() {
        return statisticalCode;
    }

    /**
     * Sets the value of the statisticalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalCode(String value) {
        this.statisticalCode = value;
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
     * Gets the value of the emergencySet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencySet() {
        return emergencySet;
    }

    /**
     * Sets the value of the emergencySet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencySet(String value) {
        this.emergencySet = value;
    }

    /**
     * Gets the value of the emergencyClear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyClear() {
        return emergencyClear;
    }

    /**
     * Sets the value of the emergencyClear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyClear(String value) {
        this.emergencyClear = value;
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
     * Gets the value of the nonCommissionable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonCommissionable() {
        return nonCommissionable;
    }

    /**
     * Sets the value of the nonCommissionable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonCommissionable(String value) {
        this.nonCommissionable = value;
    }

    /**
     * Gets the value of the presentDebitCardIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentDebitCardIndicator() {
        return presentDebitCardIndicator;
    }

    /**
     * Sets the value of the presentDebitCardIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentDebitCardIndicator(String value) {
        this.presentDebitCardIndicator = value;
    }

    /**
     * Gets the value of the nonReissuableIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonReissuableIndicator() {
        return nonReissuableIndicator;
    }

    /**
     * Sets the value of the nonReissuableIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonReissuableIndicator(String value) {
        this.nonReissuableIndicator = value;
    }

    /**
     * Gets the value of the carrierFeeReportingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierFeeReportingIndicator() {
        return carrierFeeReportingIndicator;
    }

    /**
     * Sets the value of the carrierFeeReportingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierFeeReportingIndicator(String value) {
        this.carrierFeeReportingIndicator = value;
    }

    /**
     * Gets the value of the refundSystemComputerCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundSystemComputerCalculated() {
        return refundSystemComputerCalculated;
    }

    /**
     * Sets the value of the refundSystemComputerCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundSystemComputerCalculated(String value) {
        this.refundSystemComputerCalculated = value;
    }

    /**
     * Gets the value of the refundManuallyCalculated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundManuallyCalculated() {
        return refundManuallyCalculated;
    }

    /**
     * Sets the value of the refundManuallyCalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundManuallyCalculated(String value) {
        this.refundManuallyCalculated = value;
    }

    /**
     * Gets the value of the indicators property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indicators property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndicators().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIndicators() {
        if (indicators == null) {
            indicators = new ArrayList<String>();
        }
        return this.indicators;
    }

}
