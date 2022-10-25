
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="queueingOfficeId" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To69" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaString_Length3To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketInformationType", propOrder = {
    "queueingOfficeId",
    "location"
})
public class TicketInformationType {

    protected String queueingOfficeId;
    protected String location;

    /**
     * Gets the value of the queueingOfficeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueueingOfficeId() {
        return queueingOfficeId;
    }

    /**
     * Sets the value of the queueingOfficeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueueingOfficeId(String value) {
        this.queueingOfficeId = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
