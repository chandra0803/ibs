
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="excessBaggageDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExcessBaggageDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="baggageDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BaggageDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "excessBaggageDetails",
    "baggageDetails"
})
public class ExcessBaggageTypeI {

    protected ExcessBaggageDetailsTypeI excessBaggageDetails;
    protected BaggageDetailsTypeI baggageDetails;

    /**
     * Gets the value of the excessBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessBaggageDetailsTypeI }
     *     
     */
    public ExcessBaggageDetailsTypeI getExcessBaggageDetails() {
        return excessBaggageDetails;
    }

    /**
     * Sets the value of the excessBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessBaggageDetailsTypeI }
     *     
     */
    public void setExcessBaggageDetails(ExcessBaggageDetailsTypeI value) {
        this.excessBaggageDetails = value;
    }

    /**
     * Gets the value of the baggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public BaggageDetailsTypeI getBaggageDetails() {
        return baggageDetails;
    }

    /**
     * Sets the value of the baggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDetailsTypeI }
     *     
     */
    public void setBaggageDetails(BaggageDetailsTypeI value) {
        this.baggageDetails = value;
    }

}
