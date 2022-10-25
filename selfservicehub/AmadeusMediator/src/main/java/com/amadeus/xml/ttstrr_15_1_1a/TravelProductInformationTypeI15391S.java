
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI_15391S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI_15391S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="departureCity" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}LocationTypeI_27121C" minOccurs="0"/&gt;
 *         &lt;element name="arrivalCity" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}LocationTypeI_27121C" minOccurs="0"/&gt;
 *         &lt;element name="airlineDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CompanyIdentificationTypeI_27116C" minOccurs="0"/&gt;
 *         &lt;element name="segmentDetail" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ProductIdentificationDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="ticketingStatus" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI_15391S", propOrder = {
    "departureCity",
    "arrivalCity",
    "airlineDetail",
    "segmentDetail",
    "ticketingStatus"
})
public class TravelProductInformationTypeI15391S {

    protected LocationTypeI27121C departureCity;
    protected LocationTypeI27121C arrivalCity;
    protected CompanyIdentificationTypeI27116C airlineDetail;
    protected ProductIdentificationDetailsTypeI segmentDetail;
    protected String ticketingStatus;

    /**
     * Gets the value of the departureCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI27121C }
     *     
     */
    public LocationTypeI27121C getDepartureCity() {
        return departureCity;
    }

    /**
     * Sets the value of the departureCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI27121C }
     *     
     */
    public void setDepartureCity(LocationTypeI27121C value) {
        this.departureCity = value;
    }

    /**
     * Gets the value of the arrivalCity property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI27121C }
     *     
     */
    public LocationTypeI27121C getArrivalCity() {
        return arrivalCity;
    }

    /**
     * Sets the value of the arrivalCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI27121C }
     *     
     */
    public void setArrivalCity(LocationTypeI27121C value) {
        this.arrivalCity = value;
    }

    /**
     * Gets the value of the airlineDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI27116C }
     *     
     */
    public CompanyIdentificationTypeI27116C getAirlineDetail() {
        return airlineDetail;
    }

    /**
     * Sets the value of the airlineDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI27116C }
     *     
     */
    public void setAirlineDetail(CompanyIdentificationTypeI27116C value) {
        this.airlineDetail = value;
    }

    /**
     * Gets the value of the segmentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getSegmentDetail() {
        return segmentDetail;
    }

    /**
     * Sets the value of the segmentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setSegmentDetail(ProductIdentificationDetailsTypeI value) {
        this.segmentDetail = value;
    }

    /**
     * Gets the value of the ticketingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketingStatus() {
        return ticketingStatus;
    }

    /**
     * Sets the value of the ticketingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketingStatus(String value) {
        this.ticketingStatus = value;
    }

}
