
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information relating to service times and terminals used by a service.
 * 
 * <p>Java class for TerminalTimeInformationTypeS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalTimeInformationTypeS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LocationIdentificationTypeS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalTimeInformationTypeS", propOrder = {
    "locationDetails"
})
public class TerminalTimeInformationTypeS {

    protected LocationIdentificationTypeS locationDetails;

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationTypeS }
     *     
     */
    public LocationIdentificationTypeS getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationTypeS }
     *     
     */
    public void setLocationDetails(LocationIdentificationTypeS value) {
        this.locationDetails = value;
    }

}
