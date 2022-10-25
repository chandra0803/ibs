
package com.amadeus.xml.vlsslq_06_1_1a;

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
 *         &lt;element name="workstationId" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="organizationDetails" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}SystemDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="idQualifier" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
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
    "organizationDetails",
    "idQualifier"
})
public class SystemDetailsInfoType {

    protected String workstationId;
    protected SystemDetailsTypeI organizationDetails;
    protected String idQualifier;

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
     * Gets the value of the organizationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI }
     *     
     */
    public SystemDetailsTypeI getOrganizationDetails() {
        return organizationDetails;
    }

    /**
     * Sets the value of the organizationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI }
     *     
     */
    public void setOrganizationDetails(SystemDetailsTypeI value) {
        this.organizationDetails = value;
    }

    /**
     * Gets the value of the idQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdQualifier() {
        return idQualifier;
    }

    /**
     * Sets the value of the idQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdQualifier(String value) {
        this.idQualifier = value;
    }

}
