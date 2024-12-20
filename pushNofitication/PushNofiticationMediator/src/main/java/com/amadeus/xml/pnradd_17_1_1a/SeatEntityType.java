
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatEntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatEntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatRequest" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SeatRequestType"/>
 *         &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRADD_17_1_1A}RailSeatReferenceInformationType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="railSeatPreferences" type="{http://xml.amadeus.com/PNRADD_17_1_1A}RailSeatPreferencesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatEntityType", propOrder = {
    "seatRequest",
    "railSeatReferenceInformation",
    "railSeatPreferences"
})
public class SeatEntityType {

    @XmlElement(required = true)
    protected SeatRequestType seatRequest;
    protected List<RailSeatReferenceInformationType> railSeatReferenceInformation;
    protected RailSeatPreferencesType railSeatPreferences;

    /**
     * Gets the value of the seatRequest property.
     * 
     * @return
     *     possible object is
     *     {@link SeatRequestType }
     *     
     */
    public SeatRequestType getSeatRequest() {
        return seatRequest;
    }

    /**
     * Sets the value of the seatRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatRequestType }
     *     
     */
    public void setSeatRequest(SeatRequestType value) {
        this.seatRequest = value;
    }

    /**
     * Gets the value of the railSeatReferenceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the railSeatReferenceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRailSeatReferenceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailSeatReferenceInformationType }
     * 
     * 
     */
    public List<RailSeatReferenceInformationType> getRailSeatReferenceInformation() {
        if (railSeatReferenceInformation == null) {
            railSeatReferenceInformation = new ArrayList<RailSeatReferenceInformationType>();
        }
        return this.railSeatReferenceInformation;
    }

    /**
     * Gets the value of the railSeatPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link RailSeatPreferencesType }
     *     
     */
    public RailSeatPreferencesType getRailSeatPreferences() {
        return railSeatPreferences;
    }

    /**
     * Sets the value of the railSeatPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSeatPreferencesType }
     *     
     */
    public void setRailSeatPreferences(RailSeatPreferencesType value) {
        this.railSeatPreferences = value;
    }

}
