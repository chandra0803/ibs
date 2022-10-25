
package com.amadeus.xml.acsfrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations about functional and physical locations in a terminal
 * 
 * <p>Java class for TerminalLocationType_13164S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalLocationType_13164S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facilityDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FacilityInformationType_20761C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalLocationType_13164S", propOrder = {
    "facilityDetails"
})
public class TerminalLocationType13164S {

    @XmlElement(required = true)
    protected FacilityInformationType20761C facilityDetails;

    /**
     * Gets the value of the facilityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityInformationType20761C }
     *     
     */
    public FacilityInformationType20761C getFacilityDetails() {
        return facilityDetails;
    }

    /**
     * Sets the value of the facilityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInformationType20761C }
     *     
     */
    public void setFacilityDetails(FacilityInformationType20761C value) {
        this.facilityDetails = value;
    }

}
