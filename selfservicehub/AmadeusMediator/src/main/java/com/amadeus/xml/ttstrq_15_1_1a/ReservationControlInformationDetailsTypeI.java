
package com.amadeus.xml.ttstrq_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the information required to identify a reservation.
 * 
 * <p>Java class for ReservationControlInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlNumber" type="{http://xml.amadeus.com/TTSTRQ_15_1_1A}AlphaNumericString_Length1To20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationDetailsTypeI", propOrder = {
    "controlNumber"
})
public class ReservationControlInformationDetailsTypeI {

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
