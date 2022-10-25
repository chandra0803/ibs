
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsType_160570S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsType_160570S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialRequirementsInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsTypeDetailsType_228085C"/>
 *         &lt;element name="seatDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDataDetailsType_228084C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsType_160570S", propOrder = {
    "specialRequirementsInfo",
    "seatDetails"
})
public class SpecialRequirementsDetailsType160570S {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsType228085C specialRequirementsInfo;
    @XmlElement(required = true)
    protected SpecialRequirementsDataDetailsType228084C seatDetails;

    /**
     * Gets the value of the specialRequirementsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsType228085C }
     *     
     */
    public SpecialRequirementsTypeDetailsType228085C getSpecialRequirementsInfo() {
        return specialRequirementsInfo;
    }

    /**
     * Sets the value of the specialRequirementsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsType228085C }
     *     
     */
    public void setSpecialRequirementsInfo(SpecialRequirementsTypeDetailsType228085C value) {
        this.specialRequirementsInfo = value;
    }

    /**
     * Gets the value of the seatDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDataDetailsType228084C }
     *     
     */
    public SpecialRequirementsDataDetailsType228084C getSeatDetails() {
        return seatDetails;
    }

    /**
     * Sets the value of the seatDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDataDetailsType228084C }
     *     
     */
    public void setSeatDetails(SpecialRequirementsDataDetailsType228084C value) {
        this.seatDetails = value;
    }

}
