
package com.amadeus.xml.ttstrq_15_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify which number in a sequence of references and/or the reference number.
 * 
 * <p>Java class for ReferenceTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="remainingInformation" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}NumericInteger_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="remainingReference" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceTypeI", propOrder = {
    "remainingInformation",
    "remainingReference"
})
public class ReferenceTypeI {

    protected BigInteger remainingInformation;
    protected String remainingReference;

    /**
     * Gets the value of the remainingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemainingInformation() {
        return remainingInformation;
    }

    /**
     * Sets the value of the remainingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemainingInformation(BigInteger value) {
        this.remainingInformation = value;
    }

    /**
     * Gets the value of the remainingReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingReference() {
        return remainingReference;
    }

    /**
     * Sets the value of the remainingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingReference(String value) {
        this.remainingReference = value;
    }

}
