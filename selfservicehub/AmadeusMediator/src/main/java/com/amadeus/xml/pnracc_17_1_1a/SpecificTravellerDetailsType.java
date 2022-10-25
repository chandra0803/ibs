
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * this is used to transmit the data concerning each of the passengers.
 * 
 * <p>Java class for SpecificTravellerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificTravellerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="travellerSurname" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To60" minOccurs="0"/&gt;
 *         &lt;element name="travellerGivenName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To60" minOccurs="0"/&gt;
 *         &lt;element name="travellerReferenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/&gt;
 *         &lt;element name="passengerBirthdate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificTravellerDetailsType", propOrder = {
    "passengerType",
    "travellerSurname",
    "travellerGivenName",
    "travellerReferenceNumber",
    "passengerBirthdate"
})
public class SpecificTravellerDetailsType {

    @XmlElement(required = true)
    protected String passengerType;
    protected String travellerSurname;
    protected String travellerGivenName;
    protected String travellerReferenceNumber;
    protected String passengerBirthdate;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the travellerSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerSurname() {
        return travellerSurname;
    }

    /**
     * Sets the value of the travellerSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerSurname(String value) {
        this.travellerSurname = value;
    }

    /**
     * Gets the value of the travellerGivenName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerGivenName() {
        return travellerGivenName;
    }

    /**
     * Sets the value of the travellerGivenName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerGivenName(String value) {
        this.travellerGivenName = value;
    }

    /**
     * Gets the value of the travellerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerReferenceNumber() {
        return travellerReferenceNumber;
    }

    /**
     * Sets the value of the travellerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerReferenceNumber(String value) {
        this.travellerReferenceNumber = value;
    }

    /**
     * Gets the value of the passengerBirthdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerBirthdate() {
        return passengerBirthdate;
    }

    /**
     * Sets the value of the passengerBirthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerBirthdate(String value) {
        this.passengerBirthdate = value;
    }

}
