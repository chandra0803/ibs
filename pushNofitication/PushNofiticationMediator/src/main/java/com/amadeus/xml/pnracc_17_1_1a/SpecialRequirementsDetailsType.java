
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDataDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType", propOrder = {
    "seatDetails"
})
public class SpecialRequirementsDetailsType {

    @XmlElement(required = true)
    protected SpecialRequirementsDataDetailsType seatDetails;

    /**
     * Gets the value of the seatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDataDetailsType }
     *     
     */
    public SpecialRequirementsDataDetailsType getSeatDetails() {
        return seatDetails;
    }

    /**
     * Sets the value of the seatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDataDetailsType }
     *     
     */
    public void setSeatDetails(SpecialRequirementsDataDetailsType value) {
        this.seatDetails = value;
    }

}
