
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify security between offices
 * 
 * <p>Java class for ExtendedOwnershipSecurityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedOwnershipSecurityDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="securityDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExtendedSecurityDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedOwnershipSecurityDetailsType", propOrder = {
    "securityDetails"
})
public class ExtendedOwnershipSecurityDetailsType {

    protected ExtendedSecurityDetailsType securityDetails;

    /**
     * Gets the value of the securityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendedSecurityDetailsType }
     *     
     */
    public ExtendedSecurityDetailsType getSecurityDetails() {
        return securityDetails;
    }

    /**
     * Sets the value of the securityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendedSecurityDetailsType }
     *     
     */
    public void setSecurityDetails(ExtendedSecurityDetailsType value) {
        this.securityDetails = value;
    }

}
