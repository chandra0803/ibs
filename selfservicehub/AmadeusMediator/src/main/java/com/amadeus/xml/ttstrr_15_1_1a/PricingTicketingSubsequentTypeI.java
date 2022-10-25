
package com.amadeus.xml.ttstrr_15_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify pricing indicator information.
 * 
 * <p>Java class for PricingTicketingSubsequentTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tstInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}RateTariffClassInformationTypeI"/&gt;
 *         &lt;element name="fcmi" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To1"/&gt;
 *         &lt;element name="reportedFcmi" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}NumericInteger_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentTypeI", propOrder = {
    "tstInformation",
    "fcmi",
    "reportedFcmi"
})
public class PricingTicketingSubsequentTypeI {

    @XmlElement(required = true)
    protected RateTariffClassInformationTypeI tstInformation;
    @XmlElement(required = true)
    protected String fcmi;
    protected BigInteger reportedFcmi;

    /**
     * Gets the value of the tstInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RateTariffClassInformationTypeI }
     *     
     */
    public RateTariffClassInformationTypeI getTstInformation() {
        return tstInformation;
    }

    /**
     * Sets the value of the tstInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTariffClassInformationTypeI }
     *     
     */
    public void setTstInformation(RateTariffClassInformationTypeI value) {
        this.tstInformation = value;
    }

    /**
     * Gets the value of the fcmi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFcmi() {
        return fcmi;
    }

    /**
     * Sets the value of the fcmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFcmi(String value) {
        this.fcmi = value;
    }

    /**
     * Gets the value of the reportedFcmi property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReportedFcmi() {
        return reportedFcmi;
    }

    /**
     * Sets the value of the reportedFcmi property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReportedFcmi(BigInteger value) {
        this.reportedFcmi = value;
    }

}
