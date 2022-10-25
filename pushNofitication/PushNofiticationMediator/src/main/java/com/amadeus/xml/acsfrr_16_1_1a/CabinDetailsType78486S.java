
package com.amadeus.xml.acsfrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the physical layout of a cabin class or cabin compartment of an aircraft.
 * 
 * <p>Java class for CabinDetailsType_78486S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinDetailsType_78486S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabinDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinClassDesignationType"/>
 *         &lt;element name="serviceClass" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinDetailsType_78486S", propOrder = {
    "cabinDetails",
    "serviceClass"
})
public class CabinDetailsType78486S {

    @XmlElement(required = true)
    protected CabinClassDesignationType cabinDetails;
    protected String serviceClass;

    /**
     * Gets the value of the cabinDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CabinClassDesignationType }
     *     
     */
    public CabinClassDesignationType getCabinDetails() {
        return cabinDetails;
    }

    /**
     * Sets the value of the cabinDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinClassDesignationType }
     *     
     */
    public void setCabinDetails(CabinClassDesignationType value) {
        this.cabinDetails = value;
    }

    /**
     * Gets the value of the serviceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceClass() {
        return serviceClass;
    }

    /**
     * Sets the value of the serviceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceClass(String value) {
        this.serviceClass = value;
    }

}
