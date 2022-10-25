
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify connection designator.
 * 
 * <p>Java class for ConnectionTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="connecDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}ConnectionDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionTypeI", propOrder = {
    "connecDetails"
})
public class ConnectionTypeI {

    @XmlElement(required = true)
    protected ConnectionDetailsTypeI connecDetails;

    /**
     * Gets the value of the connecDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDetailsTypeI }
     *     
     */
    public ConnectionDetailsTypeI getConnecDetails() {
        return connecDetails;
    }

    /**
     * Sets the value of the connecDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDetailsTypeI }
     *     
     */
    public void setConnecDetails(ConnectionDetailsTypeI value) {
        this.connecDetails = value;
    }

}