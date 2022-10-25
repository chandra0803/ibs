
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the transport service(s) which is /are to be updated or cancelled
 * 
 * <p>Java class for TransportIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrierInformation" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}CompanyIdentificationTypeI_27095C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportIdentifierType", propOrder = {
    "carrierInformation"
})
public class TransportIdentifierType {

    @XmlElement(required = true)
    protected CompanyIdentificationTypeI27095C carrierInformation;

    /**
     * Gets the value of the carrierInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI27095C }
     *     
     */
    public CompanyIdentificationTypeI27095C getCarrierInformation() {
        return carrierInformation;
    }

    /**
     * Sets the value of the carrierInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI27095C }
     *     
     */
    public void setCarrierInformation(CompanyIdentificationTypeI27095C value) {
        this.carrierInformation = value;
    }

}
