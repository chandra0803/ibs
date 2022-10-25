
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information relating to a passenger's baggage.
 * 
 * <p>Java class for PassengerBaggageInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerBaggageInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkedBaggageDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CheckedBaggageDetailsType_228151C" minOccurs="0"/>
 *         &lt;element name="baggageRefDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageReferenceDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerBaggageInformationType", propOrder = {
    "checkedBaggageDetails",
    "baggageRefDetails"
})
public class PassengerBaggageInformationType {

    protected CheckedBaggageDetailsType228151C checkedBaggageDetails;
    protected BaggageReferenceDetailsTypeI baggageRefDetails;

    /**
     * Gets the value of the checkedBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CheckedBaggageDetailsType228151C }
     *     
     */
    public CheckedBaggageDetailsType228151C getCheckedBaggageDetails() {
        return checkedBaggageDetails;
    }

    /**
     * Sets the value of the checkedBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckedBaggageDetailsType228151C }
     *     
     */
    public void setCheckedBaggageDetails(CheckedBaggageDetailsType228151C value) {
        this.checkedBaggageDetails = value;
    }

    /**
     * Gets the value of the baggageRefDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageReferenceDetailsTypeI }
     *     
     */
    public BaggageReferenceDetailsTypeI getBaggageRefDetails() {
        return baggageRefDetails;
    }

    /**
     * Sets the value of the baggageRefDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageReferenceDetailsTypeI }
     *     
     */
    public void setBaggageRefDetails(BaggageReferenceDetailsTypeI value) {
        this.baggageRefDetails = value;
    }

}
