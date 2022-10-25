
package com.amadeus.xml.cfldrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify traveler and personal details relating to one traveler having rich name and/or multiple names
 * 
 * <p>Java class for EnhancedTravellerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhancedTravellerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="otherPaxNamesDetails" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}TravellerNameDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhancedTravellerInformationType", propOrder = {
    "otherPaxNamesDetails"
})
public class EnhancedTravellerInformationType {

    @XmlElement(required = true)
    protected TravellerNameDetailsType otherPaxNamesDetails;

    /**
     * Gets the value of the otherPaxNamesDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerNameDetailsType }
     *     
     */
    public TravellerNameDetailsType getOtherPaxNamesDetails() {
        return otherPaxNamesDetails;
    }

    /**
     * Sets the value of the otherPaxNamesDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerNameDetailsType }
     *     
     */
    public void setOtherPaxNamesDetails(TravellerNameDetailsType value) {
        this.otherPaxNamesDetails = value;
    }

}
