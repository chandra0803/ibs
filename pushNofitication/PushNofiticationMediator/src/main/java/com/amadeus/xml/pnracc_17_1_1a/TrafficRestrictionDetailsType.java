
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details which restrict traffic.
 * 
 * <p>Java class for TrafficRestrictionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficRestrictionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="restrictionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TrafficRestrictionDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficRestrictionDetailsType", propOrder = {
    "restrictionDetails"
})
public class TrafficRestrictionDetailsType {

    @XmlElement(required = true)
    protected TrafficRestrictionDetailsTypeU restrictionDetails;

    /**
     * Gets the value of the restrictionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficRestrictionDetailsTypeU }
     *     
     */
    public TrafficRestrictionDetailsTypeU getRestrictionDetails() {
        return restrictionDetails;
    }

    /**
     * Sets the value of the restrictionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficRestrictionDetailsTypeU }
     *     
     */
    public void setRestrictionDetails(TrafficRestrictionDetailsTypeU value) {
        this.restrictionDetails = value;
    }

}
