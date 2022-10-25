
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information relating to a passenger's baggage.
 * 
 * <p>Java class for PassengerBaggageInformationType_91586S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PassengerBaggageInformationType_91586S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="checkedBaggageDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CheckedBaggageDetailsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PassengerBaggageInformationType_91586S", propOrder = {
    "checkedBaggageDetails"
})
public class PassengerBaggageInformationType91586S {

    @XmlElement(required = true)
    protected CheckedBaggageDetailsType checkedBaggageDetails;

    /**
     * Gets the value of the checkedBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CheckedBaggageDetailsType }
     *     
     */
    public CheckedBaggageDetailsType getCheckedBaggageDetails() {
        return checkedBaggageDetails;
    }

    /**
     * Sets the value of the checkedBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckedBaggageDetailsType }
     *     
     */
    public void setCheckedBaggageDetails(CheckedBaggageDetailsType value) {
        this.checkedBaggageDetails = value;
    }

}
