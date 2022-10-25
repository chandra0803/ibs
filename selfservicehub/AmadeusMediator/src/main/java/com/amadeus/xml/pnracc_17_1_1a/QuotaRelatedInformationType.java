
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to convey quota information.
 * 
 * <p>Java class for QuotaRelatedInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuotaRelatedInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="quotaCounterName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="maxQuantity" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To15" minOccurs="0"/&gt;
 *         &lt;element name="availability" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To15" minOccurs="0"/&gt;
 *         &lt;element name="quotaReachedReplyStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="quotaReachedMsgNb" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="quotaNotReachedMsgNb" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="counter" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To15" minOccurs="0"/&gt;
 *         &lt;element name="quotaType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="quotaGrade" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuotaRelatedInformationType", propOrder = {
    "quotaCounterName",
    "maxQuantity",
    "availability",
    "quotaReachedReplyStatus",
    "quotaReachedMsgNb",
    "quotaNotReachedMsgNb",
    "counter",
    "quotaType",
    "quotaGrade"
})
public class QuotaRelatedInformationType {

    protected String quotaCounterName;
    protected BigInteger maxQuantity;
    protected BigInteger availability;
    protected String quotaReachedReplyStatus;
    protected String quotaReachedMsgNb;
    protected String quotaNotReachedMsgNb;
    protected BigInteger counter;
    protected String quotaType;
    protected String quotaGrade;

    /**
     * Gets the value of the quotaCounterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaCounterName() {
        return quotaCounterName;
    }

    /**
     * Sets the value of the quotaCounterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaCounterName(String value) {
        this.quotaCounterName = value;
    }

    /**
     * Gets the value of the maxQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * Sets the value of the maxQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxQuantity(BigInteger value) {
        this.maxQuantity = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailability(BigInteger value) {
        this.availability = value;
    }

    /**
     * Gets the value of the quotaReachedReplyStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaReachedReplyStatus() {
        return quotaReachedReplyStatus;
    }

    /**
     * Sets the value of the quotaReachedReplyStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaReachedReplyStatus(String value) {
        this.quotaReachedReplyStatus = value;
    }

    /**
     * Gets the value of the quotaReachedMsgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaReachedMsgNb() {
        return quotaReachedMsgNb;
    }

    /**
     * Sets the value of the quotaReachedMsgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaReachedMsgNb(String value) {
        this.quotaReachedMsgNb = value;
    }

    /**
     * Gets the value of the quotaNotReachedMsgNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaNotReachedMsgNb() {
        return quotaNotReachedMsgNb;
    }

    /**
     * Sets the value of the quotaNotReachedMsgNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaNotReachedMsgNb(String value) {
        this.quotaNotReachedMsgNb = value;
    }

    /**
     * Gets the value of the counter property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCounter() {
        return counter;
    }

    /**
     * Sets the value of the counter property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCounter(BigInteger value) {
        this.counter = value;
    }

    /**
     * Gets the value of the quotaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaType() {
        return quotaType;
    }

    /**
     * Sets the value of the quotaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaType(String value) {
        this.quotaType = value;
    }

    /**
     * Gets the value of the quotaGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuotaGrade() {
        return quotaGrade;
    }

    /**
     * Sets the value of the quotaGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuotaGrade(String value) {
        this.quotaGrade = value;
    }

}
