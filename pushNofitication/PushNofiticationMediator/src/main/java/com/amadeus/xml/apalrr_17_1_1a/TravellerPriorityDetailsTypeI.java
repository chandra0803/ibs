
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the details associated with a travellers status.
 * 
 * <p>Java class for TravellerPriorityDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerPriorityDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerIndicatorsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerPriorityDetailsTypeI", propOrder = {
    "indicators"
})
public class TravellerPriorityDetailsTypeI {

    @XmlElement(required = true)
    protected TravellerIndicatorsTypeI indicators;

    /**
     * Gets the value of the indicators property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerIndicatorsTypeI }
     *     
     */
    public TravellerIndicatorsTypeI getIndicators() {
        return indicators;
    }

    /**
     * Sets the value of the indicators property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerIndicatorsTypeI }
     *     
     */
    public void setIndicators(TravellerIndicatorsTypeI value) {
        this.indicators = value;
    }

}
