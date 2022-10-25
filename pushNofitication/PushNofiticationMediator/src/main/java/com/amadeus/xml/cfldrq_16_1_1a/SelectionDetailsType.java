
package com.amadeus.xml.cfldrq_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for making a selection.
 * 
 * <p>Java class for SelectionDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}SelectionDetailsInformationTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsType", propOrder = {
    "selectionDetails"
})
public class SelectionDetailsType {

    @XmlElement(required = true)
    protected SelectionDetailsInformationTypeU selectionDetails;

    /**
     * Gets the value of the selectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsInformationTypeU }
     *     
     */
    public SelectionDetailsInformationTypeU getSelectionDetails() {
        return selectionDetails;
    }

    /**
     * Sets the value of the selectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsInformationTypeU }
     *     
     */
    public void setSelectionDetails(SelectionDetailsInformationTypeU value) {
        this.selectionDetails = value;
    }

}
