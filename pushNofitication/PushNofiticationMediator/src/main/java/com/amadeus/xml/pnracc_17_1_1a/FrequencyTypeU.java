
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a frequency and the time window in which it applies.
 * 
 * <p>Java class for FrequencyTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequencyTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extendedPaymentDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequencyDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequencyTypeU", propOrder = {
    "extendedPaymentDetails"
})
public class FrequencyTypeU {

    @XmlElement(required = true)
    protected FrequencyDetailsTypeU extendedPaymentDetails;

    /**
     * Gets the value of the extendedPaymentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyDetailsTypeU }
     *     
     */
    public FrequencyDetailsTypeU getExtendedPaymentDetails() {
        return extendedPaymentDetails;
    }

    /**
     * Sets the value of the extendedPaymentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyDetailsTypeU }
     *     
     */
    public void setExtendedPaymentDetails(FrequencyDetailsTypeU value) {
        this.extendedPaymentDetails = value;
    }

}
