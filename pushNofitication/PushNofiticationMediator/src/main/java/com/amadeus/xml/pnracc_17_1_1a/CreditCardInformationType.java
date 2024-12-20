
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * credit card info
 * 
 * <p>Java class for CreditCardInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vendorCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/>
 *         &lt;element name="vendorCodeSubType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To25" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To19" minOccurs="0"/>
 *         &lt;element name="securityId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="expiryDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Date_MMYY" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Date_MMYY" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Date_MMYY" minOccurs="0"/>
 *         &lt;element name="ccHolderName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To99" minOccurs="0"/>
 *         &lt;element name="issuingBankName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To3" minOccurs="0"/>
 *         &lt;element name="cardCountryOfIssuance" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="issueNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="issuingBankLongName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To64" minOccurs="0"/>
 *         &lt;element name="track1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length0To108" minOccurs="0"/>
 *         &lt;element name="track2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length0To56" minOccurs="0"/>
 *         &lt;element name="track3" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length0To144" minOccurs="0"/>
 *         &lt;element name="pinCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To100" minOccurs="0"/>
 *         &lt;element name="rawTrackData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To400" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardInformationType", propOrder = {
    "vendorCode",
    "vendorCodeSubType",
    "cardNumber",
    "securityId",
    "expiryDate",
    "startDate",
    "endDate",
    "ccHolderName",
    "issuingBankName",
    "cardCountryOfIssuance",
    "issueNumber",
    "issuingBankLongName",
    "track1",
    "track2",
    "track3",
    "pinCode",
    "rawTrackData"
})
public class CreditCardInformationType {

    protected String vendorCode;
    protected String vendorCodeSubType;
    protected String cardNumber;
    protected String securityId;
    protected String expiryDate;
    protected String startDate;
    protected String endDate;
    protected String ccHolderName;
    protected String issuingBankName;
    protected String cardCountryOfIssuance;
    protected BigInteger issueNumber;
    protected String issuingBankLongName;
    protected String track1;
    protected String track2;
    protected String track3;
    protected String pinCode;
    protected String rawTrackData;

    /**
     * Gets the value of the vendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Sets the value of the vendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Gets the value of the vendorCodeSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCodeSubType() {
        return vendorCodeSubType;
    }

    /**
     * Sets the value of the vendorCodeSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCodeSubType(String value) {
        this.vendorCodeSubType = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the securityId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurityId() {
        return securityId;
    }

    /**
     * Sets the value of the securityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurityId(String value) {
        this.securityId = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDate(String value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the ccHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcHolderName() {
        return ccHolderName;
    }

    /**
     * Sets the value of the ccHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcHolderName(String value) {
        this.ccHolderName = value;
    }

    /**
     * Gets the value of the issuingBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankName() {
        return issuingBankName;
    }

    /**
     * Sets the value of the issuingBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankName(String value) {
        this.issuingBankName = value;
    }

    /**
     * Gets the value of the cardCountryOfIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCountryOfIssuance() {
        return cardCountryOfIssuance;
    }

    /**
     * Sets the value of the cardCountryOfIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCountryOfIssuance(String value) {
        this.cardCountryOfIssuance = value;
    }

    /**
     * Gets the value of the issueNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIssueNumber() {
        return issueNumber;
    }

    /**
     * Sets the value of the issueNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIssueNumber(BigInteger value) {
        this.issueNumber = value;
    }

    /**
     * Gets the value of the issuingBankLongName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingBankLongName() {
        return issuingBankLongName;
    }

    /**
     * Sets the value of the issuingBankLongName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingBankLongName(String value) {
        this.issuingBankLongName = value;
    }

    /**
     * Gets the value of the track1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack1() {
        return track1;
    }

    /**
     * Sets the value of the track1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack1(String value) {
        this.track1 = value;
    }

    /**
     * Gets the value of the track2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2() {
        return track2;
    }

    /**
     * Sets the value of the track2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2(String value) {
        this.track2 = value;
    }

    /**
     * Gets the value of the track3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack3() {
        return track3;
    }

    /**
     * Sets the value of the track3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack3(String value) {
        this.track3 = value;
    }

    /**
     * Gets the value of the pinCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPinCode() {
        return pinCode;
    }

    /**
     * Sets the value of the pinCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPinCode(String value) {
        this.pinCode = value;
    }

    /**
     * Gets the value of the rawTrackData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawTrackData() {
        return rawTrackData;
    }

    /**
     * Sets the value of the rawTrackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawTrackData(String value) {
        this.rawTrackData = value;
    }

}
