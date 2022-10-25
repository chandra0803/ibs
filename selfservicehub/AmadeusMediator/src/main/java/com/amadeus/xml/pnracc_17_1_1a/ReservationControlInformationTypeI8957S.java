
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a reference to a reservation.
 * 
 * <p>Java class for ReservationControlInformationTypeI_8957S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationTypeI_8957S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="reservation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationDetailsTypeI_16352C" maxOccurs="2"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationTypeI_8957S", propOrder = {
    "reservation"
})
public class ReservationControlInformationTypeI8957S {

    @XmlElement(required = true)
    protected List<ReservationControlInformationDetailsTypeI16352C> reservation;

    /**
     * Gets the value of the reservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReservationControlInformationDetailsTypeI16352C }
     * 
     * 
     */
    public List<ReservationControlInformationDetailsTypeI16352C> getReservation() {
        if (reservation == null) {
            reservation = new ArrayList<ReservationControlInformationDetailsTypeI16352C>();
        }
        return this.reservation;
    }

}
