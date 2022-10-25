
package com.amadeus.xml.acsfrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To designate a flight for a given date in a reply.
 * 
 * <p>Java class for FlightDetailsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}OutboundCarrierDetailsTypeI"/>
 *         &lt;element name="flightDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}OutboundFlightNumberDetailstypeI"/>
 *         &lt;element name="departureDate" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}Date_YYYYMMDD"/>
 *         &lt;element name="boardPoint" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaString_Length1To5"/>
 *         &lt;element name="offPoint" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaString_Length1To5"/>
 *         &lt;element name="arrivalDate" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}Date_YYYYMMDD"/>
 *         &lt;element name="dateAndTimeRange" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ProductDateTimeTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailsResponseType", propOrder = {
    "carrierDetails",
    "flightDetails",
    "departureDate",
    "boardPoint",
    "offPoint",
    "arrivalDate",
    "dateAndTimeRange"
})
public class FlightDetailsResponseType {

    @XmlElement(required = true)
    protected OutboundCarrierDetailsTypeI carrierDetails;
    @XmlElement(required = true)
    protected OutboundFlightNumberDetailstypeI flightDetails;
    @XmlElement(required = true)
    protected String departureDate;
    @XmlElement(required = true)
    protected String boardPoint;
    @XmlElement(required = true)
    protected String offPoint;
    @XmlElement(required = true)
    protected String arrivalDate;
    @XmlElement(required = true)
    protected ProductDateTimeTypeI dateAndTimeRange;

    /**
     * Gets the value of the carrierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundCarrierDetailsTypeI }
     *     
     */
    public OutboundCarrierDetailsTypeI getCarrierDetails() {
        return carrierDetails;
    }

    /**
     * Sets the value of the carrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundCarrierDetailsTypeI }
     *     
     */
    public void setCarrierDetails(OutboundCarrierDetailsTypeI value) {
        this.carrierDetails = value;
    }

    /**
     * Gets the value of the flightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OutboundFlightNumberDetailstypeI }
     *     
     */
    public OutboundFlightNumberDetailstypeI getFlightDetails() {
        return flightDetails;
    }

    /**
     * Sets the value of the flightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutboundFlightNumberDetailstypeI }
     *     
     */
    public void setFlightDetails(OutboundFlightNumberDetailstypeI value) {
        this.flightDetails = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the arrivalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalDate() {
        return arrivalDate;
    }

    /**
     * Sets the value of the arrivalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalDate(String value) {
        this.arrivalDate = value;
    }

    /**
     * Gets the value of the dateAndTimeRange property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getDateAndTimeRange() {
        return dateAndTimeRange;
    }

    /**
     * Sets the value of the dateAndTimeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setDateAndTimeRange(ProductDateTimeTypeI value) {
        this.dateAndTimeRange = value;
    }

}
