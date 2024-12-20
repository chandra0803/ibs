
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Traveller insurance information
 * 
 * <p>Java class for TravellerInsuranceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInsuranceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="supplementaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="sexCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="creditCardDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CreditCardType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="totalPremiumCurrency" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="totalPremium" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="futureCurrency" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="futureAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericDecimal_Length1To18" minOccurs="0"/>
 *         &lt;element name="fareType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="travelerName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInsuranceInformationType", propOrder = {
    "currency",
    "amount",
    "supplementaryInformation",
    "sexCode",
    "creditCardDetails",
    "totalPremiumCurrency",
    "totalPremium",
    "futureCurrency",
    "futureAmount",
    "fareType",
    "travelerName"
})
public class TravellerInsuranceInformationType {

    protected String currency;
    protected BigDecimal amount;
    protected String supplementaryInformation;
    protected String sexCode;
    protected List<CreditCardType> creditCardDetails;
    protected String totalPremiumCurrency;
    protected BigDecimal totalPremium;
    protected String futureCurrency;
    protected BigDecimal futureAmount;
    protected String fareType;
    protected String travelerName;

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

    /**
     * Gets the value of the supplementaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplementaryInformation() {
        return supplementaryInformation;
    }

    /**
     * Sets the value of the supplementaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplementaryInformation(String value) {
        this.supplementaryInformation = value;
    }

    /**
     * Gets the value of the sexCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * Sets the value of the sexCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexCode(String value) {
        this.sexCode = value;
    }

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditCardDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditCardDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreditCardType }
     * 
     * 
     */
    public List<CreditCardType> getCreditCardDetails() {
        if (creditCardDetails == null) {
            creditCardDetails = new ArrayList<CreditCardType>();
        }
        return this.creditCardDetails;
    }

    /**
     * Gets the value of the totalPremiumCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPremiumCurrency() {
        return totalPremiumCurrency;
    }

    /**
     * Sets the value of the totalPremiumCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPremiumCurrency(String value) {
        this.totalPremiumCurrency = value;
    }

    /**
     * Gets the value of the totalPremium property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPremium() {
        return totalPremium;
    }

    /**
     * Sets the value of the totalPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPremium(BigDecimal value) {
        this.totalPremium = value;
    }

    /**
     * Gets the value of the futureCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureCurrency() {
        return futureCurrency;
    }

    /**
     * Sets the value of the futureCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureCurrency(String value) {
        this.futureCurrency = value;
    }

    /**
     * Gets the value of the futureAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFutureAmount() {
        return futureAmount;
    }

    /**
     * Sets the value of the futureAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFutureAmount(BigDecimal value) {
        this.futureAmount = value;
    }

    /**
     * Gets the value of the fareType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareType() {
        return fareType;
    }

    /**
     * Sets the value of the fareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareType(String value) {
        this.fareType = value;
    }

    /**
     * Gets the value of the travelerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelerName() {
        return travelerName;
    }

    /**
     * Sets the value of the travelerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelerName(String value) {
        this.travelerName = value;
    }

}
