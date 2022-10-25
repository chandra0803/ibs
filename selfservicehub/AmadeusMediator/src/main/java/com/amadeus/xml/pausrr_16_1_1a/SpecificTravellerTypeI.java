
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional details about a particular traveller.
 * 
 * <p>Java class for SpecificTravellerTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificTravellerTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="travellerDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}SpecificTravellerDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificTravellerTypeI", propOrder = {
    "travellerDetails"
})
public class SpecificTravellerTypeI {

    @XmlElement(required = true)
    protected SpecificTravellerDetailsTypeI travellerDetails;

    /**
     * Gets the value of the travellerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificTravellerDetailsTypeI }
     *     
     */
    public SpecificTravellerDetailsTypeI getTravellerDetails() {
        return travellerDetails;
    }

    /**
     * Sets the value of the travellerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificTravellerDetailsTypeI }
     *     
     */
    public void setTravellerDetails(SpecificTravellerDetailsTypeI value) {
        this.travellerDetails = value;
    }

}
