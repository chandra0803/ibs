
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning baggage allowance details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bagAllowanceDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}BaggageDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "bagAllowanceDetails"
})
public class ExcessBaggageTypeI {

    @XmlElement(required = true)
    protected BaggageDetailsTypeI bagAllowanceDetails;

    /**
     * Gets the value of the bagAllowanceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getBagAllowanceDetails() {
        return bagAllowanceDetails;
    }

    /**
     * Sets the value of the bagAllowanceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setBagAllowanceDetails(BaggageDetailsTypeI value) {
        this.bagAllowanceDetails = value;
    }

}
