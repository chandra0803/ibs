
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details on the sailing ship
 * 
 * <p>Java class for ShipIdentificationType_8952S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipIdentificationType_8952S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ShipIdentificationDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipIdentificationType_8952S", propOrder = {
    "shipDetails"
})
public class ShipIdentificationType8952S {

    @XmlElement(required = true)
    protected ShipIdentificationDetailsType shipDetails;

    /**
     * Gets the value of the shipDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentificationDetailsType }
     *     
     */
    public ShipIdentificationDetailsType getShipDetails() {
        return shipDetails;
    }

    /**
     * Sets the value of the shipDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentificationDetailsType }
     *     
     */
    public void setShipDetails(ShipIdentificationDetailsType value) {
        this.shipDetails = value;
    }

}
