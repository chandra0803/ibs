
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify connection city and airline designator.
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
 *         &lt;element name="connectionDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ConnectionDetailsTypeI"/&gt;
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
    "connectionDetails"
})
public class ConnectionTypeI {

    @XmlElement(required = true)
    protected ConnectionDetailsTypeI connectionDetails;

    /**
     * Gets the value of the connectionDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionDetailsTypeI }
     *     
     */
    public ConnectionDetailsTypeI getConnectionDetails() {
        return connectionDetails;
    }

    /**
     * Sets the value of the connectionDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionDetailsTypeI }
     *     
     */
    public void setConnectionDetails(ConnectionDetailsTypeI value) {
        this.connectionDetails = value;
    }

}
