
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Identification of consumer references by type, company, number and reference to a traveller.
 * 
 * <p>Java class for ConsumerReferenceIdentificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerReferenceIdentificationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceQualifier" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="referenceNumber" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="referencePartyName" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerReferenceIdentificationTypeI", propOrder = {
    "referenceQualifier",
    "referenceNumber",
    "referencePartyName"
})
public class ConsumerReferenceIdentificationTypeI {

    @XmlElement(required = true)
    protected String referenceQualifier;
    protected String referenceNumber;
    protected String referencePartyName;

    /**
     * Gets the value of the referenceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceQualifier() {
        return referenceQualifier;
    }

    /**
     * Sets the value of the referenceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceQualifier(String value) {
        this.referenceQualifier = value;
    }

    /**
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
    }

    /**
     * Gets the value of the referencePartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencePartyName() {
        return referencePartyName;
    }

    /**
     * Sets the value of the referencePartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencePartyName(String value) {
        this.referencePartyName = value;
    }

}
