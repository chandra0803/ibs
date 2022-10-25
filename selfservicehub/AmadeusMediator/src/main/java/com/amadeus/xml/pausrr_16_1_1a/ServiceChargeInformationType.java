
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey informations regarding service charge
 * 
 * <p>Java class for ServiceChargeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceChargeInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="serviceChargeDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ServiceChargeDetailsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceChargeInformationType", propOrder = {
    "serviceChargeDetails"
})
public class ServiceChargeInformationType {

    protected ServiceChargeDetailsType serviceChargeDetails;

    /**
     * Gets the value of the serviceChargeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceChargeDetailsType }
     *     
     */
    public ServiceChargeDetailsType getServiceChargeDetails() {
        return serviceChargeDetails;
    }

    /**
     * Sets the value of the serviceChargeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceChargeDetailsType }
     *     
     */
    public void setServiceChargeDetails(ServiceChargeDetailsType value) {
        this.serviceChargeDetails = value;
    }

}
