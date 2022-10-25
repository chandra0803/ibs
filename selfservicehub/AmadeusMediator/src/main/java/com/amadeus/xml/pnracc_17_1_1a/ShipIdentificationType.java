
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details on the sailing ship
 * 
 * <p>Java class for ShipIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="shipDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ShipIdentificationDetailsType_45069C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipIdentificationType", propOrder = {
    "shipDetails"
})
public class ShipIdentificationType {

    @XmlElement(required = true)
    protected ShipIdentificationDetailsType45069C shipDetails;

    /**
     * Gets the value of the shipDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentificationDetailsType45069C }
     *     
     */
    public ShipIdentificationDetailsType45069C getShipDetails() {
        return shipDetails;
    }

    /**
     * Sets the value of the shipDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentificationDetailsType45069C }
     *     
     */
    public void setShipDetails(ShipIdentificationDetailsType45069C value) {
        this.shipDetails = value;
    }

}
