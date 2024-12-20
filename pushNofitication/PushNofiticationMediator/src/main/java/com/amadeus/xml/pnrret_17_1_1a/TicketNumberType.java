
package com.amadeus.xml.pnrret_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * TICKET NUMBER
 * 
 * <p>Java class for TicketNumberType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketNumberType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airline" type="{http://xml.amadeus.com/PNRRET_17_1_1A}NumericInteger_Length3To3"/>
 *         &lt;element name="ticketNumber" type="{http://xml.amadeus.com/PNRRET_17_1_1A}NumericInteger_Length10To10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketNumberType", propOrder = {
    "airline",
    "ticketNumber"
})
public class TicketNumberType {

    @XmlElement(required = true)
    protected BigInteger airline;
    @XmlElement(required = true)
    protected BigInteger ticketNumber;

    /**
     * Gets the value of the airline property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAirline() {
        return airline;
    }

    /**
     * Sets the value of the airline property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAirline(BigInteger value) {
        this.airline = value;
    }

    /**
     * Gets the value of the ticketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTicketNumber() {
        return ticketNumber;
    }

    /**
     * Sets the value of the ticketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTicketNumber(BigInteger value) {
        this.ticketNumber = value;
    }

}
