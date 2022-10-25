
package com.amadeus.xml.vlsslq_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide reference identification.
 * 
 * <p>Java class for ReferencingDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencingDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceQualifier" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="referenceIdentifier" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To35"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencingDetailsTypeI", propOrder = {
    "referenceQualifier",
    "referenceIdentifier"
})
public class ReferencingDetailsTypeI {

    @XmlElement(required = true)
    protected String referenceQualifier;
    @XmlElement(required = true)
    protected String referenceIdentifier;

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
     * Gets the value of the referenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceIdentifier() {
        return referenceIdentifier;
    }

    /**
     * Sets the value of the referenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceIdentifier(String value) {
        this.referenceIdentifier = value;
    }

}
