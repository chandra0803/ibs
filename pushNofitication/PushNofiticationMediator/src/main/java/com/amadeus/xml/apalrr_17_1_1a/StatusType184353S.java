
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To advise the requester system the status of the reply
 * 
 * <p>Java class for StatusType_184353S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusType_184353S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusDetailsType_258655C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusType_184353S", propOrder = {
    "statusInformation"
})
public class StatusType184353S {

    @XmlElement(required = true)
    protected StatusDetailsType258655C statusInformation;

    /**
     * Gets the value of the statusInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsType258655C }
     *     
     */
    public StatusDetailsType258655C getStatusInformation() {
        return statusInformation;
    }

    /**
     * Sets the value of the statusInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsType258655C }
     *     
     */
    public void setStatusInformation(StatusDetailsType258655C value) {
        this.statusInformation = value;
    }

}
