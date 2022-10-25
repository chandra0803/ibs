
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the physical layout of a cabin class or cabin compartment of an aircraft.
 * 
 * <p>Java class for CabinDetailsType_144371S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDetailsType_144371S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinClassDesignationType_208594C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetailsType_144371S", propOrder = {
    "cabinDetails"
})
public class CabinDetailsType144371S {

    protected CabinClassDesignationType208594C cabinDetails;

    /**
     * Gets the value of the cabinDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassDesignationType208594C }
     *     
     */
    public CabinClassDesignationType208594C getCabinDetails() {
        return cabinDetails;
    }

    /**
     * Sets the value of the cabinDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassDesignationType208594C }
     *     
     */
    public void setCabinDetails(CabinClassDesignationType208594C value) {
        this.cabinDetails = value;
    }

}
