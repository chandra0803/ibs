
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation.
 * 
 * <p>Java class for ReservationControlInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservationControlId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationDetailsTypeU"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeU", propOrder = {
    "reservationControlId"
})
public class ReservationControlInformationTypeU {

    @XmlElement(required = true)
    protected ReservationControlInformationDetailsTypeU reservationControlId;

    /**
     * Gets the value of the reservationControlId property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationControlInformationDetailsTypeU }
     *     
     */
    public ReservationControlInformationDetailsTypeU getReservationControlId() {
        return reservationControlId;
    }

    /**
     * Sets the value of the reservationControlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationControlInformationDetailsTypeU }
     *     
     */
    public void setReservationControlId(ReservationControlInformationDetailsTypeU value) {
        this.reservationControlId = value;
    }

}
