
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the selection criteria for a seat map request.
 * 
 * <p>Java class for SeatRequestParametersTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequestParametersTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="genericDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}GenericDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestParametersTypeI", propOrder = {
    "genericDetails"
})
public class SeatRequestParametersTypeI {

    protected GenericDetailsTypeI genericDetails;

    /**
     * Gets the value of the genericDetails property.
     * 
     * @return
     *     possible object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public GenericDetailsTypeI getGenericDetails() {
        return genericDetails;
    }

    /**
     * Sets the value of the genericDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericDetailsTypeI }
     *     
     */
    public void setGenericDetails(GenericDetailsTypeI value) {
        this.genericDetails = value;
    }

}
