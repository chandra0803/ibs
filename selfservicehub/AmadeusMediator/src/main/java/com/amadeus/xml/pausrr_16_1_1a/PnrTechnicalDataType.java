
package com.amadeus.xml.pausrr_16_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify purge dates of profiles
 * 
 * <p>Java class for PnrTechnicalDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrTechnicalDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pnrPurgeDate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}Date_DDMMYY"/&gt;
 *         &lt;element name="number" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumericInteger_Length1To5"/&gt;
 *         &lt;element name="lastTransmittedEnvelopeNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}NumericInteger_Length1To5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrTechnicalDataType", propOrder = {
    "pnrPurgeDate",
    "number",
    "lastTransmittedEnvelopeNumber"
})
public class PnrTechnicalDataType {

    @XmlElement(required = true)
    protected String pnrPurgeDate;
    @XmlElement(required = true)
    protected BigInteger number;
    protected BigInteger lastTransmittedEnvelopeNumber;

    /**
     * Gets the value of the pnrPurgeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPnrPurgeDate() {
        return pnrPurgeDate;
    }

    /**
     * Sets the value of the pnrPurgeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPnrPurgeDate(String value) {
        this.pnrPurgeDate = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumber(BigInteger value) {
        this.number = value;
    }

    /**
     * Gets the value of the lastTransmittedEnvelopeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLastTransmittedEnvelopeNumber() {
        return lastTransmittedEnvelopeNumber;
    }

    /**
     * Sets the value of the lastTransmittedEnvelopeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLastTransmittedEnvelopeNumber(BigInteger value) {
        this.lastTransmittedEnvelopeNumber = value;
    }

}
