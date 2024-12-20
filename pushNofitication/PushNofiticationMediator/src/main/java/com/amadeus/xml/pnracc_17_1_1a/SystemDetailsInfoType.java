
package com.amadeus.xml.pnracc_17_1_1a;

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
 * &lt;complexType name="SystemDetailsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="workstationId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To50" minOccurs="0"/>
 *         &lt;element name="deliveringSystem" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SystemDetailsTypeI_192689C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
    protected SystemDetailsTypeI192689C deliveringSystem;

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
     *     {@link SystemDetailsTypeI192689C }
     *     
     */
    public SystemDetailsTypeI192689C getDeliveringSystem() {
        return deliveringSystem;
    }

    /**
     * Sets the value of the deliveringSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI192689C }
     *     
     */
    public void setDeliveringSystem(SystemDetailsTypeI192689C value) {
        this.deliveringSystem = value;
    }

}
