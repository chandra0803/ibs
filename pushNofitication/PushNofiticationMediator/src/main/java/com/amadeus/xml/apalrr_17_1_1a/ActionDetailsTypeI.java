
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the action that should be taken on a selected reference number.
 * 
 * <p>Java class for ActionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lastItemsDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDetailsTypeI", propOrder = {
    "lastItemsDetails"
})
public class ActionDetailsTypeI {

    @XmlElement(required = true)
    protected ReferenceTypeI lastItemsDetails;

    /**
     * Gets the value of the lastItemsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceTypeI }
     *     
     */
    public ReferenceTypeI getLastItemsDetails() {
        return lastItemsDetails;
    }

    /**
     * Sets the value of the lastItemsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceTypeI }
     *     
     */
    public void setLastItemsDetails(ReferenceTypeI value) {
        this.lastItemsDetails = value;
    }

}
