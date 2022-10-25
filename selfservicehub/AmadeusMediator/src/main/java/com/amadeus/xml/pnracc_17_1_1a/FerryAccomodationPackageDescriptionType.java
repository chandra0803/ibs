
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FerryAccomodationPackageDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryAccomodationPackageDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductInformationTypeI"/&gt;
 *         &lt;element name="hotelInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelPropertyType_26378S" minOccurs="0"/&gt;
 *         &lt;element name="hotelCheckInInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_207596S" minOccurs="0"/&gt;
 *         &lt;element name="areaCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_24573S" minOccurs="0"/&gt;
 *         &lt;element name="numberOfNights" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
 *         &lt;element name="hotelItemPrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU" minOccurs="0"/&gt;
 *         &lt;element name="roomInfoGroup" maxOccurs="9" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="roomDetailsInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomType_20177S"/&gt;
 *                   &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryAccomodationPackageDescriptionType", propOrder = {
    "packageCode",
    "hotelInformation",
    "hotelCheckInInformation",
    "areaCodeInfo",
    "numberOfNights",
    "hotelItemPrice",
    "roomInfoGroup"
})
public class FerryAccomodationPackageDescriptionType {

    @XmlElement(required = true)
    protected ProductInformationTypeI packageCode;
    protected HotelPropertyType26378S hotelInformation;
    protected StructuredDateTimeInformationType207596S hotelCheckInInformation;
    protected PlaceLocationIdentificationTypeU24573S areaCodeInfo;
    protected NumberOfUnitsType numberOfNights;
    protected TariffInformationTypeU hotelItemPrice;
    protected List<FerryAccomodationPackageDescriptionType.RoomInfoGroup> roomInfoGroup;

    /**
     * Gets the value of the packageCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationTypeI }
     *     
     */
    public ProductInformationTypeI getPackageCode() {
        return packageCode;
    }

    /**
     * Sets the value of the packageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationTypeI }
     *     
     */
    public void setPackageCode(ProductInformationTypeI value) {
        this.packageCode = value;
    }

    /**
     * Gets the value of the hotelInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HotelPropertyType26378S }
     *     
     */
    public HotelPropertyType26378S getHotelInformation() {
        return hotelInformation;
    }

    /**
     * Sets the value of the hotelInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelPropertyType26378S }
     *     
     */
    public void setHotelInformation(HotelPropertyType26378S value) {
        this.hotelInformation = value;
    }

    /**
     * Gets the value of the hotelCheckInInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType207596S }
     *     
     */
    public StructuredDateTimeInformationType207596S getHotelCheckInInformation() {
        return hotelCheckInInformation;
    }

    /**
     * Sets the value of the hotelCheckInInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType207596S }
     *     
     */
    public void setHotelCheckInInformation(StructuredDateTimeInformationType207596S value) {
        this.hotelCheckInInformation = value;
    }

    /**
     * Gets the value of the areaCodeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceLocationIdentificationTypeU24573S }
     *     
     */
    public PlaceLocationIdentificationTypeU24573S getAreaCodeInfo() {
        return areaCodeInfo;
    }

    /**
     * Sets the value of the areaCodeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceLocationIdentificationTypeU24573S }
     *     
     */
    public void setAreaCodeInfo(PlaceLocationIdentificationTypeU24573S value) {
        this.areaCodeInfo = value;
    }

    /**
     * Gets the value of the numberOfNights property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public NumberOfUnitsType getNumberOfNights() {
        return numberOfNights;
    }

    /**
     * Sets the value of the numberOfNights property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsType }
     *     
     */
    public void setNumberOfNights(NumberOfUnitsType value) {
        this.numberOfNights = value;
    }

    /**
     * Gets the value of the hotelItemPrice property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationTypeU }
     *     
     */
    public TariffInformationTypeU getHotelItemPrice() {
        return hotelItemPrice;
    }

    /**
     * Sets the value of the hotelItemPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationTypeU }
     *     
     */
    public void setHotelItemPrice(TariffInformationTypeU value) {
        this.hotelItemPrice = value;
    }

    /**
     * Gets the value of the roomInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryAccomodationPackageDescriptionType.RoomInfoGroup }
     * 
     * 
     */
    public List<FerryAccomodationPackageDescriptionType.RoomInfoGroup> getRoomInfoGroup() {
        if (roomInfoGroup == null) {
            roomInfoGroup = new ArrayList<FerryAccomodationPackageDescriptionType.RoomInfoGroup>();
        }
        return this.roomInfoGroup;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="roomDetailsInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomType_20177S"/&gt;
     *         &lt;element name="numberOfRooms" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "roomDetailsInformation",
        "numberOfRooms"
    })
    public static class RoomInfoGroup {

        @XmlElement(required = true)
        protected HotelRoomType20177S roomDetailsInformation;
        protected NumberOfUnitsType numberOfRooms;

        /**
         * Gets the value of the roomDetailsInformation property.
         * 
         * @return
         *     possible object is
         *     {@link HotelRoomType20177S }
         *     
         */
        public HotelRoomType20177S getRoomDetailsInformation() {
            return roomDetailsInformation;
        }

        /**
         * Sets the value of the roomDetailsInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link HotelRoomType20177S }
         *     
         */
        public void setRoomDetailsInformation(HotelRoomType20177S value) {
            this.roomDetailsInformation = value;
        }

        /**
         * Gets the value of the numberOfRooms property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getNumberOfRooms() {
            return numberOfRooms;
        }

        /**
         * Sets the value of the numberOfRooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setNumberOfRooms(NumberOfUnitsType value) {
            this.numberOfRooms = value;
        }

    }

}
