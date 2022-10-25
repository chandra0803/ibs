
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an Amadeus PNR Ticket element
 * 
 * <p>Java class for TicketElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketElementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="ticket" type="{http://xml.amadeus.com/PNRADD_17_1_1A}TicketInformationType"/&gt;
 *         &lt;element name="printOptions" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To127" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketElementType", propOrder = {
    "passengerType",
    "ticket",
    "printOptions"
})
public class TicketElementType {

    protected String passengerType;
    @XmlElement(required = true)
    protected TicketInformationType ticket;
    protected String printOptions;

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the ticket property.
     * 
     * @return
     *     possible object is
     *     {@link TicketInformationType }
     *     
     */
    public TicketInformationType getTicket() {
        return ticket;
    }

    /**
     * Sets the value of the ticket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketInformationType }
     *     
     */
    public void setTicket(TicketInformationType value) {
        this.ticket = value;
    }

    /**
     * Gets the value of the printOptions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOptions() {
        return printOptions;
    }

    /**
     * Sets the value of the printOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOptions(String value) {
        this.printOptions = value;
    }

}
