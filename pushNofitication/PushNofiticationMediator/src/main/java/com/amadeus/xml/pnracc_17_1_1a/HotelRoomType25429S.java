
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the hotel room information
 * 
 * <p>Java class for HotelRoomType_25429S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomType_25429S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomRateIdentifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomRateInformationType_46329C"/>
 *         &lt;element name="bookingCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="guestCountDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitDetailsTypeI_46330C" minOccurs="0"/>
 *         &lt;element name="roomTypeOverride" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To16" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomType_25429S", propOrder = {
    "roomRateIdentifier",
    "bookingCode",
    "guestCountDetails",
    "roomTypeOverride"
})
public class HotelRoomType25429S {

    @XmlElement(required = true)
    protected HotelRoomRateInformationType46329C roomRateIdentifier;
    protected String bookingCode;
    protected NumberOfUnitDetailsTypeI46330C guestCountDetails;
    protected String roomTypeOverride;

    /**
     * Gets the value of the roomRateIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRoomRateInformationType46329C }
     *     
     */
    public HotelRoomRateInformationType46329C getRoomRateIdentifier() {
        return roomRateIdentifier;
    }

    /**
     * Sets the value of the roomRateIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRoomRateInformationType46329C }
     *     
     */
    public void setRoomRateIdentifier(HotelRoomRateInformationType46329C value) {
        this.roomRateIdentifier = value;
    }

    /**
     * Gets the value of the bookingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingCode() {
        return bookingCode;
    }

    /**
     * Sets the value of the bookingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingCode(String value) {
        this.bookingCode = value;
    }

    /**
     * Gets the value of the guestCountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitDetailsTypeI46330C }
     *     
     */
    public NumberOfUnitDetailsTypeI46330C getGuestCountDetails() {
        return guestCountDetails;
    }

    /**
     * Sets the value of the guestCountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitDetailsTypeI46330C }
     *     
     */
    public void setGuestCountDetails(NumberOfUnitDetailsTypeI46330C value) {
        this.guestCountDetails = value;
    }

    /**
     * Gets the value of the roomTypeOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomTypeOverride() {
        return roomTypeOverride;
    }

    /**
     * Sets the value of the roomTypeOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomTypeOverride(String value) {
        this.roomTypeOverride = value;
    }

}
