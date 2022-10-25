
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a status and related information.
 * 
 * <p>Java class for StatusTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTypeI", propOrder = {
    "statusDetails"
})
public class StatusTypeI {

    @XmlElement(required = true)
    protected StatusDetailsTypeI statusDetails;

    /**
     * Gets the value of the statusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsTypeI }
     *     
     */
    public StatusDetailsTypeI getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsTypeI }
     *     
     */
    public void setStatusDetails(StatusDetailsTypeI value) {
        this.statusDetails = value;
    }

}
