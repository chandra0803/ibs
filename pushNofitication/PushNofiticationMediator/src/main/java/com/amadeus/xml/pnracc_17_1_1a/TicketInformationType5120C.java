
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TicketInformationType_5120C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketInformationType_5120C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queueingOfficeId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To24" minOccurs="0"/>
 *         &lt;element name="location" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length3To3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketInformationType_5120C", propOrder = {
    "queueingOfficeId",
    "location"
})
public class TicketInformationType5120C {

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
