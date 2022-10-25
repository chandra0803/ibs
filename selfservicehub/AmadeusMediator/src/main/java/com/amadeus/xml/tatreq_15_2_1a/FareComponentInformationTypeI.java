
package com.amadeus.xml.tatreq_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify fare component data.
 * 
 * <p>Java class for FareComponentInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fareComponentDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}FareComponentDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentInformationTypeI", propOrder = {
    "fareComponentDetails",
    "ticketNumber"
})
public class FareComponentInformationTypeI {

    protected FareComponentDetailsTypeI fareComponentDetails;
    protected String ticketNumber;

    /**
     * Gets the value of the fareComponentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareComponentDetailsTypeI }
     *     
     */
    public FareComponentDetailsTypeI getFareComponentDetails() {
        return fareComponentDetails;
    }

    /**
     * Sets the value of the fareComponentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareComponentDetailsTypeI }
     *     
     */
    public void setFareComponentDetails(FareComponentDetailsTypeI value) {
        this.fareComponentDetails = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketNumber(String value) {
        this.ticketNumber = value;
    }

}
