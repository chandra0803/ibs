
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInformationType", propOrder = {
    "fareDetails"
})
public class FareInformationType {

    protected FareDetailsType fareDetails;

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsType }
     *     
     */
    public FareDetailsType getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsType }
     *     
     */
    public void setFareDetails(FareDetailsType value) {
        this.fareDetails = value;
    }

}
