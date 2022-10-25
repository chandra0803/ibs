
package com.amadeus.xml.cfldrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify outbound and inbound flight information.
 * 
 * <p>Java class for FlightDetailsQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightDetailsQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="inboundCarrierDetails" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}InboundCarrierDetailsTypeI"/>
 *         &lt;element name="inboundFlightDetails" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}InboundFlightNumberDetailsTypeI"/>
 *         &lt;element name="inboundDepartureDate" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}Date_YYYYMMDD"/>
 *         &lt;element name="inboundBoardPoint" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AlphaString_Length1To3"/>
 *         &lt;element name="inboundOffPoint" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AlphaString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailsQueryType", propOrder = {
    "inboundCarrierDetails",
    "inboundFlightDetails",
    "inboundDepartureDate",
    "inboundBoardPoint",
    "inboundOffPoint"
})
public class FlightDetailsQueryType {

    @XmlElement(required = true)
    protected InboundCarrierDetailsTypeI inboundCarrierDetails;
    @XmlElement(required = true)
    protected InboundFlightNumberDetailsTypeI inboundFlightDetails;
    @XmlElement(required = true)
    protected String inboundDepartureDate;
    @XmlElement(required = true)
    protected String inboundBoardPoint;
    @XmlElement(required = true)
    protected String inboundOffPoint;

    /**
     * Gets the value of the inboundCarrierDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InboundCarrierDetailsTypeI }
     *     
     */
    public InboundCarrierDetailsTypeI getInboundCarrierDetails() {
        return inboundCarrierDetails;
    }

    /**
     * Sets the value of the inboundCarrierDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundCarrierDetailsTypeI }
     *     
     */
    public void setInboundCarrierDetails(InboundCarrierDetailsTypeI value) {
        this.inboundCarrierDetails = value;
    }

    /**
     * Gets the value of the inboundFlightDetails property.
     * 
     * @return
     *     possible object is
     *     {@link InboundFlightNumberDetailsTypeI }
     *     
     */
    public InboundFlightNumberDetailsTypeI getInboundFlightDetails() {
        return inboundFlightDetails;
    }

    /**
     * Sets the value of the inboundFlightDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link InboundFlightNumberDetailsTypeI }
     *     
     */
    public void setInboundFlightDetails(InboundFlightNumberDetailsTypeI value) {
        this.inboundFlightDetails = value;
    }

    /**
     * Gets the value of the inboundDepartureDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundDepartureDate() {
        return inboundDepartureDate;
    }

    /**
     * Sets the value of the inboundDepartureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundDepartureDate(String value) {
        this.inboundDepartureDate = value;
    }

    /**
     * Gets the value of the inboundBoardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundBoardPoint() {
        return inboundBoardPoint;
    }

    /**
     * Sets the value of the inboundBoardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundBoardPoint(String value) {
        this.inboundBoardPoint = value;
    }

    /**
     * Gets the value of the inboundOffPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInboundOffPoint() {
        return inboundOffPoint;
    }

    /**
     * Sets the value of the inboundOffPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInboundOffPoint(String value) {
        this.inboundOffPoint = value;
    }

}
