
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the action that should be taken on a selected reference number.
 * 
 * <p>Java class for ActionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfItemsDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProcessingInformationTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionDetailsTypeI", propOrder = {
    "numberOfItemsDetails"
})
public class ActionDetailsTypeI {

    protected ProcessingInformationTypeI numberOfItemsDetails;

    /**
     * Gets the value of the numberOfItemsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingInformationTypeI }
     *     
     */
    public ProcessingInformationTypeI getNumberOfItemsDetails() {
        return numberOfItemsDetails;
    }

    /**
     * Sets the value of the numberOfItemsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingInformationTypeI }
     *     
     */
    public void setNumberOfItemsDetails(ProcessingInformationTypeI value) {
        this.numberOfItemsDetails = value;
    }

}
