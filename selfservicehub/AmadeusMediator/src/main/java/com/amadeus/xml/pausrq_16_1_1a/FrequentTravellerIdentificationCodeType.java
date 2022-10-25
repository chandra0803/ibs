
package com.amadeus.xml.pausrq_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information
 * 
 * <p>Java class for FrequentTravellerIdentificationCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequentTravellerDetails" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}FrequentTravellerIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCodeType", propOrder = {
    "frequentTravellerDetails"
})
public class FrequentTravellerIdentificationCodeType {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationType frequentTravellerDetails;

    /**
     * Gets the value of the frequentTravellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public FrequentTravellerIdentificationType getFrequentTravellerDetails() {
        return frequentTravellerDetails;
    }

    /**
     * Sets the value of the frequentTravellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationType }
     *     
     */
    public void setFrequentTravellerDetails(FrequentTravellerIdentificationType value) {
        this.frequentTravellerDetails = value;
    }

}
