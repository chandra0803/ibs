
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information
 * 
 * <p>Java class for FrequentTravellerIdentificationCodeType_176743S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCodeType_176743S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationType_248801C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCodeType_176743S", propOrder = {
    "frequentTravellerDetails"
})
public class FrequentTravellerIdentificationCodeType176743S {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationType248801C frequentTravellerDetails;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationType248801C }
     *     
     */
    public FrequentTravellerIdentificationType248801C getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /**
     * Sets the value of the frequentTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationType248801C }
     *     
     */
    public void setFrequentTravellerDetails(FrequentTravellerIdentificationType248801C value) {
        this.frequentTravellerDetails = value;
    }

}
