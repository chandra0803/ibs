
package com.amadeus.xml.vlsslq_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations about functional and physical locations in a terminal
 * 
 * <p>Java class for TerminalLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="facilityDetails" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}FacilityInformationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalLocationType", propOrder = {
    "facilityDetails"
})
public class TerminalLocationType {

    @XmlElement(required = true)
    protected FacilityInformationType facilityDetails;

    /**
     * Gets the value of the facilityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityInformationType }
     *     
     */
    public FacilityInformationType getFacilityDetails() {
        return facilityDetails;
    }

    /**
     * Sets the value of the facilityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInformationType }
     *     
     */
    public void setFacilityDetails(FacilityInformationType value) {
        this.facilityDetails = value;
    }

}
