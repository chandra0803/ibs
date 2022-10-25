
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information
 * 
 * <p>Java class for FrequentTravellerIdentificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="company" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To3"/&gt;
 *         &lt;element name="membershipNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To27"/&gt;
 *         &lt;element name="customerValue" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationTypeI", propOrder = {
    "company",
    "membershipNumber",
    "customerValue"
})
public class FrequentTravellerIdentificationTypeI {

    @XmlElement(required = true)
    protected String company;
    @XmlElement(required = true)
    protected String membershipNumber;
    protected BigInteger customerValue;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the membershipNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipNumber() {
        return membershipNumber;
    }

    /**
     * Sets the value of the membershipNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipNumber(String value) {
        this.membershipNumber = value;
    }

    /**
     * Gets the value of the customerValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerValue() {
        return customerValue;
    }

    /**
     * Sets the value of the customerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerValue(BigInteger value) {
        this.customerValue = value;
    }

}
