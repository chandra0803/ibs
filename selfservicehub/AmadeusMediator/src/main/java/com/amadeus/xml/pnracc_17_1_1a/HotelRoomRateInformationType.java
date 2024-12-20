
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRoomRateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRoomRateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="roomType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="ratePlanCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="rateCategoryCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="rateQualifiedIndic" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRoomRateInformationType", propOrder = {
    "roomType",
    "ratePlanCode",
    "rateCategoryCode",
    "rateQualifiedIndic"
})
public class HotelRoomRateInformationType {

    protected String roomType;
    protected String ratePlanCode;
    protected String rateCategoryCode;
    protected String rateQualifiedIndic;

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the ratePlanCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * Sets the value of the ratePlanCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * Gets the value of the rateCategoryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCategoryCode() {
        return rateCategoryCode;
    }

    /**
     * Sets the value of the rateCategoryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCategoryCode(String value) {
        this.rateCategoryCode = value;
    }

    /**
     * Gets the value of the rateQualifiedIndic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateQualifiedIndic() {
        return rateQualifiedIndic;
    }

    /**
     * Sets the value of the rateQualifiedIndic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateQualifiedIndic(String value) {
        this.rateQualifiedIndic = value;
    }

}
