
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the rate or tariff categories and rate or tariff ranges.
 * 
 * <p>Java class for RateInformationTypeI_50732C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateInformationTypeI_50732C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateInformationTypeI_50732C", propOrder = {
    "fareGroup"
})
public class RateInformationTypeI50732C {

    protected String fareGroup;

    /**
     * Gets the value of the fareGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareGroup() {
        return fareGroup;
    }

    /**
     * Sets the value of the fareGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareGroup(String value) {
        this.fareGroup = value;
    }

}
