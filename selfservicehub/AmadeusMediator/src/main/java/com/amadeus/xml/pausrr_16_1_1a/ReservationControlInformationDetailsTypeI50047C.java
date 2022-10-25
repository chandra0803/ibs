
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the information required to identify a reservation.
 * 
 * <p>Java class for ReservationControlInformationDetailsTypeI_50047C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationDetailsTypeI_50047C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlNumber" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length6To6"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationDetailsTypeI_50047C", propOrder = {
    "controlNumber"
})
public class ReservationControlInformationDetailsTypeI50047C {

    @XmlElement(required = true)
    protected String controlNumber;

    /**
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
    }

}
