
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The segment is used to communicate priority and ranking information.
 * 
 * <p>Java class for PriorityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priorityQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}AMA_EDICodesetType_Length1to3"/>
 *         &lt;element name="priorityDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityType", propOrder = {
    "priorityQualifier",
    "priorityDetails"
})
public class PriorityType {

    @XmlElement(required = true)
    protected String priorityQualifier;
    protected PriorityDetailsType priorityDetails;

    /**
     * Gets the value of the priorityQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityQualifier() {
        return priorityQualifier;
    }

    /**
     * Sets the value of the priorityQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityQualifier(String value) {
        this.priorityQualifier = value;
    }

    /**
     * Gets the value of the priorityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityDetailsType }
     *     
     */
    public PriorityDetailsType getPriorityDetails() {
        return priorityDetails;
    }

    /**
     * Sets the value of the priorityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityDetailsType }
     *     
     */
    public void setPriorityDetails(PriorityDetailsType value) {
        this.priorityDetails = value;
    }

}
