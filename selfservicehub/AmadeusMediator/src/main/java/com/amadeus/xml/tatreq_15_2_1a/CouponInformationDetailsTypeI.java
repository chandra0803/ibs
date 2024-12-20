
package com.amadeus.xml.tatreq_15_2_1a;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the coupon number, status, value, and other related information.
 * 
 * <p>Java class for CouponInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cpnNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="cpnStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="cpnAmount" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericDecimal_Length1To18" minOccurs="0"/&gt;
 *         &lt;element name="cpnExchangeMedia" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="settlementAuthorization" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="voluntaryIndicator" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="cpnPreviousStatus" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="cpnInConnectionWith" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="cpnSequenceNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="cpnInConnectionWithQualifier" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationDetailsTypeI", propOrder = {
    "cpnNumber",
    "cpnStatus",
    "cpnAmount",
    "cpnExchangeMedia",
    "settlementAuthorization",
    "voluntaryIndicator",
    "cpnPreviousStatus",
    "cpnInConnectionWith",
    "cpnSequenceNumber",
    "cpnInConnectionWithQualifier"
})
public class CouponInformationDetailsTypeI {

    protected String cpnNumber;
    protected String cpnStatus;
    protected BigDecimal cpnAmount;
    protected String cpnExchangeMedia;
    protected String settlementAuthorization;
    protected String voluntaryIndicator;
    protected String cpnPreviousStatus;
    protected String cpnInConnectionWith;
    protected String cpnSequenceNumber;
    protected String cpnInConnectionWithQualifier;

    /**
     * Gets the value of the cpnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnNumber() {
        return cpnNumber;
    }

    /**
     * Sets the value of the cpnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnNumber(String value) {
        this.cpnNumber = value;
    }

    /**
     * Gets the value of the cpnStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnStatus() {
        return cpnStatus;
    }

    /**
     * Sets the value of the cpnStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnStatus(String value) {
        this.cpnStatus = value;
    }

    /**
     * Gets the value of the cpnAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCpnAmount() {
        return cpnAmount;
    }

    /**
     * Sets the value of the cpnAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCpnAmount(BigDecimal value) {
        this.cpnAmount = value;
    }

    /**
     * Gets the value of the cpnExchangeMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnExchangeMedia() {
        return cpnExchangeMedia;
    }

    /**
     * Sets the value of the cpnExchangeMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnExchangeMedia(String value) {
        this.cpnExchangeMedia = value;
    }

    /**
     * Gets the value of the settlementAuthorization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAuthorization() {
        return settlementAuthorization;
    }

    /**
     * Sets the value of the settlementAuthorization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAuthorization(String value) {
        this.settlementAuthorization = value;
    }

    /**
     * Gets the value of the voluntaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoluntaryIndicator() {
        return voluntaryIndicator;
    }

    /**
     * Sets the value of the voluntaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoluntaryIndicator(String value) {
        this.voluntaryIndicator = value;
    }

    /**
     * Gets the value of the cpnPreviousStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnPreviousStatus() {
        return cpnPreviousStatus;
    }

    /**
     * Sets the value of the cpnPreviousStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnPreviousStatus(String value) {
        this.cpnPreviousStatus = value;
    }

    /**
     * Gets the value of the cpnInConnectionWith property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnInConnectionWith() {
        return cpnInConnectionWith;
    }

    /**
     * Sets the value of the cpnInConnectionWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnInConnectionWith(String value) {
        this.cpnInConnectionWith = value;
    }

    /**
     * Gets the value of the cpnSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnSequenceNumber() {
        return cpnSequenceNumber;
    }

    /**
     * Sets the value of the cpnSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnSequenceNumber(String value) {
        this.cpnSequenceNumber = value;
    }

    /**
     * Gets the value of the cpnInConnectionWithQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnInConnectionWithQualifier() {
        return cpnInConnectionWithQualifier;
    }

    /**
     * Sets the value of the cpnInConnectionWithQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnInConnectionWithQualifier(String value) {
        this.cpnInConnectionWithQualifier = value;
    }

}
