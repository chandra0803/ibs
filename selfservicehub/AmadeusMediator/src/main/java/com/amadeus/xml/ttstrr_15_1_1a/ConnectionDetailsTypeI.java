
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the location, product supplier and time for a connection with the next means of transport.
 * 
 * <p>Java class for ConnectionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="routingInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="connexType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionDetailsTypeI", propOrder = {
    "routingInformation",
    "connexType"
})
public class ConnectionDetailsTypeI {

    protected String routingInformation;
    protected String connexType;

    /**
     * Gets the value of the routingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoutingInformation() {
        return routingInformation;
    }

    /**
     * Sets the value of the routingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoutingInformation(String value) {
        this.routingInformation = value;
    }

    /**
     * Gets the value of the connexType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnexType() {
        return connexType;
    }

    /**
     * Sets the value of the connexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnexType(String value) {
        this.connexType = value;
    }

}
