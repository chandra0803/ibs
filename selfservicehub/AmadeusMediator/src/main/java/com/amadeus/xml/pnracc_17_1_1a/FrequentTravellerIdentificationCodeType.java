
package com.amadeus.xml.pnracc_17_1_1a;

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
 *         &lt;element name="airlineFrequentTraveler" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationType_198190C"/&gt;
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
    "airlineFrequentTraveler"
})
public class FrequentTravellerIdentificationCodeType {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationType198190C airlineFrequentTraveler;

    /**
     * Gets the value of the airlineFrequentTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationType198190C }
     *     
     */
    public FrequentTravellerIdentificationType198190C getAirlineFrequentTraveler() {
        return airlineFrequentTraveler;
    }

    /**
     * Sets the value of the airlineFrequentTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationType198190C }
     *     
     */
    public void setAirlineFrequentTraveler(FrequentTravellerIdentificationType198190C value) {
        this.airlineFrequentTraveler = value;
    }

}
