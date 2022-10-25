
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to specify a system
 * 
 * <p>Java class for SystemDetailsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemDetailsInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="workstationId" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To50" minOccurs="0"/&gt;
 *         &lt;element name="deliveringSystem" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}SystemDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemDetailsInfoType", propOrder = {
    "workstationId",
    "deliveringSystem"
})
public class SystemDetailsInfoType {

    protected String workstationId;
    protected SystemDetailsTypeI deliveringSystem;

    /**
     * Gets the value of the workstationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkstationId() {
        return workstationId;
    }

    /**
     * Sets the value of the workstationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkstationId(String value) {
        this.workstationId = value;
    }

    /**
     * Gets the value of the deliveringSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI }
     *     
     */
    public SystemDetailsTypeI getDeliveringSystem() {
        return deliveringSystem;
    }

    /**
     * Sets the value of the deliveringSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI }
     *     
     */
    public void setDeliveringSystem(SystemDetailsTypeI value) {
        this.deliveringSystem = value;
    }

}