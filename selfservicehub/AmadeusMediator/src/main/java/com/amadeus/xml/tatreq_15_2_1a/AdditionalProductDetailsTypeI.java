
package com.amadeus.xml.tatreq_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information concerning an airline flight.
 * 
 * <p>Java class for AdditionalProductDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AdditionalProductTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalProductDetailsTypeI", propOrder = {
    "legDetails"
})
public class AdditionalProductDetailsTypeI {

    protected AdditionalProductTypeI legDetails;

    /**
     * Gets the value of the legDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public AdditionalProductTypeI getLegDetails() {
        return legDetails;
    }

    /**
     * Sets the value of the legDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductTypeI }
     *     
     */
    public void setLegDetails(AdditionalProductTypeI value) {
        this.legDetails = value;
    }

}
