
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for a hotel transaction
 * 
 * <p>Java class for HotelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelProductInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="property" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PropertyHeaderDetailsType" minOccurs="0"/>
 *         &lt;element name="hotelRoom" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RoomDetailsType" minOccurs="0"/>
 *         &lt;element name="negotiated" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RateCodeRestrictedType" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="otherHotelInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OtherHotelInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelProductInformationType", propOrder = {
    "property",
    "hotelRoom",
    "negotiated",
    "otherHotelInfo"
})
public class HotelProductInformationType {

    protected PropertyHeaderDetailsType property;
    protected RoomDetailsType hotelRoom;
    protected List<RateCodeRestrictedType> negotiated;
    protected OtherHotelInformationType otherHotelInfo;

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyHeaderDetailsType }
     *     
     */
    public PropertyHeaderDetailsType getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyHeaderDetailsType }
     *     
     */
    public void setProperty(PropertyHeaderDetailsType value) {
        this.property = value;
    }

    /**
     * Gets the value of the hotelRoom property.
     * 
     * @return
     *     possible object is
     *     {@link RoomDetailsType }
     *     
     */
    public RoomDetailsType getHotelRoom() {
        return hotelRoom;
    }

    /**
     * Sets the value of the hotelRoom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomDetailsType }
     *     
     */
    public void setHotelRoom(RoomDetailsType value) {
        this.hotelRoom = value;
    }

    /**
     * Gets the value of the negotiated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negotiated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegotiated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RateCodeRestrictedType }
     * 
     * 
     */
    public List<RateCodeRestrictedType> getNegotiated() {
        if (negotiated == null) {
            negotiated = new ArrayList<RateCodeRestrictedType>();
        }
        return this.negotiated;
    }

    /**
     * Gets the value of the otherHotelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OtherHotelInformationType }
     *     
     */
    public OtherHotelInformationType getOtherHotelInfo() {
        return otherHotelInfo;
    }

    /**
     * Sets the value of the otherHotelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherHotelInformationType }
     *     
     */
    public void setOtherHotelInfo(OtherHotelInformationType value) {
        this.otherHotelInfo = value;
    }

}
