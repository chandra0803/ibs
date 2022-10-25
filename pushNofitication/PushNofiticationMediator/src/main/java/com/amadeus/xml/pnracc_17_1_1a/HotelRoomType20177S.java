
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the hotel room information
 * 
 * <p>Java class for HotelRoomType_20177S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomType_20177S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="roomTypeOverride" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomType_20177S", propOrder = {
    "roomTypeOverride"
})
public class HotelRoomType20177S {

    @XmlElement(required = true)
    protected String roomTypeOverride;

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
