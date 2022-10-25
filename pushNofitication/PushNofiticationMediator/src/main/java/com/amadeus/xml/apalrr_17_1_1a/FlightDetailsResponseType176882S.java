
package com.amadeus.xml.apalrr_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To designate a flight for a given date in a reply.
 * 
 * <p>Java class for FlightDetailsResponseType_176882S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailsResponseType_176882S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrierDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}OutboundCarrierDetailsTypeI"/>
 *         &lt;element name="flightDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}OutboundFlightNumberDetailstypeI"/>
 *         &lt;element name="departureDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}Date_YYYYMMDD"/>
 *         &lt;element name="boardPoint" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaString_Length1To5" minOccurs="0"/>
 *         &lt;element name="offPoint" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaString_Length1To5" minOccurs="0"/>
 *         &lt;element name="arrivalDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}Date_YYYYMMDD" minOccurs="0"/>
 *         &lt;element name="dateAndTimeRange" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductDateTimeTypeI_248816C" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailsResponseType_176882S", propOrder = {
    "carrierDetails",
    "flightDetails",
    "departureDate",
    "boardPoint",
    "offPoint",
    "arrivalDate",
    "dateAndTimeRange"
})
public class FlightDetailsResponseType176882S {

    @XmlElement(required = true)
    protected OutboundCarrierDetailsTypeI carrierDetails;
    @XmlElement(required = true)
    protected OutboundFlightNumberDetailstypeI flightDetails;
    @XmlElement(required = true)
    protected String departureDate;
    protected String boardPoint;
    protected String offPoint;
    protected String arrivalDate;
    protected List<ProductDateTimeTypeI248816C> dateAndTimeRange;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateAndTimeRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateAndTimeRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductDateTimeTypeI248816C }
     * 
     * 
     */
    public List<ProductDateTimeTypeI248816C> getDateAndTimeRange() {
        if (dateAndTimeRange == null) {
            dateAndTimeRange = new ArrayList<ProductDateTimeTypeI248816C>();
        }
        return this.dateAndTimeRange;
    }

}
