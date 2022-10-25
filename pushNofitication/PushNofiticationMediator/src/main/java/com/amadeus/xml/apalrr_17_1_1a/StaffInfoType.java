
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to convey staff information
 * 
 * <p>Java class for StaffInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staffIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}StaffIdentificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffInfoType", propOrder = {
    "staffIdentification"
})
public class StaffInfoType {

    @XmlElement(required = true)
    protected StaffIdentificationType staffIdentification;

    /**
     * Gets the value of the staffIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link StaffIdentificationType }
     *     
     */
    public StaffIdentificationType getStaffIdentification() {
        return staffIdentification;
    }

    /**
     * Sets the value of the staffIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffIdentificationType }
     *     
     */
    public void setStaffIdentification(StaffIdentificationType value) {
        this.staffIdentification = value;
    }

}
