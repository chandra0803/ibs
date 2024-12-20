
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the diagnosis and its type
 * 
 * <p>Java class for DiagnosisTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosisTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billingDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To25"/>
 *         &lt;element name="billingQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiagnosisTypeU", propOrder = {
    "billingDetails",
    "billingQualifier"
})
public class DiagnosisTypeU {

    @XmlElement(required = true)
    protected String billingDetails;
    @XmlElement(required = true)
    protected String billingQualifier;

    /**
     * Gets the value of the billingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingDetails() {
        return billingDetails;
    }

    /**
     * Sets the value of the billingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingDetails(String value) {
        this.billingDetails = value;
    }

    /**
     * Gets the value of the billingQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingQualifier() {
        return billingQualifier;
    }

    /**
     * Sets the value of the billingQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingQualifier(String value) {
        this.billingQualifier = value;
    }

}
