
package com.amadeus.xml.vlsslr_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This Segment is used to specify Organization Details
 * 
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organizationDetails" type="{http://xml.amadeus.com/VLSSLR_06_1_1A}OrganizationIdentificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
    "organizationDetails"
})
public class OrganizationType {

    @XmlElement(required = true)
    protected OrganizationIdentificationType organizationDetails;

    /**
     * Gets the value of the organizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationIdentificationType }
     *     
     */
    public OrganizationIdentificationType getOrganizationDetails() {
        return organizationDetails;
    }

    /**
     * Sets the value of the organizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationIdentificationType }
     *     
     */
    public void setOrganizationDetails(OrganizationIdentificationType value) {
        this.organizationDetails = value;
    }

}
