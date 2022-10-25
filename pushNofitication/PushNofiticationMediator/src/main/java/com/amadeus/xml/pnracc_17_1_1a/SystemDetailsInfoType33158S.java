
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify a system
 * 
 * <p>Java class for SystemDetailsInfoType_33158S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemDetailsInfoType_33158S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deliveringSystem" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SystemDetailsTypeI_57708C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemDetailsInfoType_33158S", propOrder = {
    "deliveringSystem"
})
public class SystemDetailsInfoType33158S {

    @XmlElement(required = true)
    protected SystemDetailsTypeI57708C deliveringSystem;

    /**
     * Gets the value of the deliveringSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI57708C }
     *     
     */
    public SystemDetailsTypeI57708C getDeliveringSystem() {
        return deliveringSystem;
    }

    /**
     * Sets the value of the deliveringSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI57708C }
     *     
     */
    public void setDeliveringSystem(SystemDetailsTypeI57708C value) {
        this.deliveringSystem = value;
    }

}
