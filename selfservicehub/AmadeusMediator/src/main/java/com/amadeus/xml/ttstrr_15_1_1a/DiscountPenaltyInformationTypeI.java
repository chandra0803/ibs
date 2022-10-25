
package com.amadeus.xml.ttstrr_15_1_1a;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the discounts and penalties by fare type.
 * 
 * <p>Java class for DiscountPenaltyInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountPenaltyInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="zapOffType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="zapOffAmount" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}NumericDecimal_Length1To11" minOccurs="0"/&gt;
 *         &lt;element name="zapOffPercentage" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}NumericInteger_Length1To8" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountPenaltyInformationTypeI", propOrder = {
    "zapOffType",
    "zapOffAmount",
    "zapOffPercentage"
})
public class DiscountPenaltyInformationTypeI {

    @XmlElement(required = true)
    protected String zapOffType;
    protected BigDecimal zapOffAmount;
    protected BigInteger zapOffPercentage;

    /**
     * Gets the value of the zapOffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZapOffType() {
        return zapOffType;
    }

    /**
     * Sets the value of the zapOffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZapOffType(String value) {
        this.zapOffType = value;
    }

    /**
     * Gets the value of the zapOffAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getZapOffAmount() {
        return zapOffAmount;
    }

    /**
     * Sets the value of the zapOffAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setZapOffAmount(BigDecimal value) {
        this.zapOffAmount = value;
    }

    /**
     * Gets the value of the zapOffPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getZapOffPercentage() {
        return zapOffPercentage;
    }

    /**
     * Sets the value of the zapOffPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setZapOffPercentage(BigInteger value) {
        this.zapOffPercentage = value;
    }

}
