
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about a reservation such as identification, date and time, and reasons of modifications.
 * 
 * <p>Java class for ReservationControlInformationDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationDetailsTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tourOperatorCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="reservationControlNumberQual" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="reservationControlNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To32"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationDetailsTypeU", propOrder = {
    "tourOperatorCode",
    "reservationControlNumberQual",
    "reservationControlNumber"
})
public class ReservationControlInformationDetailsTypeU {

    protected String tourOperatorCode;
    @XmlElement(required = true)
    protected String reservationControlNumberQual;
    @XmlElement(required = true)
    protected String reservationControlNumber;

    /**
     * Gets the value of the tourOperatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourOperatorCode() {
        return tourOperatorCode;
    }

    /**
     * Sets the value of the tourOperatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourOperatorCode(String value) {
        this.tourOperatorCode = value;
    }

    /**
     * Gets the value of the reservationControlNumberQual property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationControlNumberQual() {
        return reservationControlNumberQual;
    }

    /**
     * Sets the value of the reservationControlNumberQual property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationControlNumberQual(String value) {
        this.reservationControlNumberQual = value;
    }

    /**
     * Gets the value of the reservationControlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationControlNumber() {
        return reservationControlNumber;
    }

    /**
     * Sets the value of the reservationControlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationControlNumber(String value) {
        this.reservationControlNumber = value;
    }

}
