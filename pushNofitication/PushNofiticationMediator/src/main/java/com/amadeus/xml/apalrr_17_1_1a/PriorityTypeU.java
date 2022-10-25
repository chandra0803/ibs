
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The segment is used to communicate priority information.
 * 
 * <p>Java class for PriorityTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriorityTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="priorityQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="priorityDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityDetailsTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriorityTypeU", propOrder = {
    "priorityQualifier",
    "priorityDetails"
})
public class PriorityTypeU {

    @XmlElement(required = true)
    protected String priorityQualifier;
    @XmlElement(required = true)
    protected PriorityDetailsTypeU priorityDetails;

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
     *     {@link PriorityDetailsTypeU }
     *     
     */
    public PriorityDetailsTypeU getPriorityDetails() {
        return priorityDetails;
    }

    /**
     * Sets the value of the priorityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityDetailsTypeU }
     *     
     */
    public void setPriorityDetails(PriorityDetailsTypeU value) {
        this.priorityDetails = value;
    }

}
