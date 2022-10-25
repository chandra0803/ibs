
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional characteristics of a product or service.
 * 
 * <p>Java class for ProductTypeDetailsTypeI_46337C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductTypeDetailsTypeI_46337C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductTypeDetailsTypeI_46337C", propOrder = {
    "flightIndicator"
})
public class ProductTypeDetailsTypeI46337C {

    @XmlElement(required = true)
    protected String flightIndicator;

    /**
     * Gets the value of the flightIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightIndicator() {
        return flightIndicator;
    }

    /**
     * Sets the value of the flightIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightIndicator(String value) {
        this.flightIndicator = value;
    }

}
