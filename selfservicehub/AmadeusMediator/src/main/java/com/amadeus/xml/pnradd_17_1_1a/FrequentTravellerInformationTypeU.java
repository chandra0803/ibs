
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey frequent traveler program information relating to a specific traveller or group.
 * 
 * <p>Java class for FrequentTravellerInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerInformationTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequentTraveller" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FrequentTravellerIdentificationTypeU"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerInformationTypeU", propOrder = {
    "frequentTraveller"
})
public class FrequentTravellerInformationTypeU {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationTypeU frequentTraveller;

    /**
     * Gets the value of the frequentTraveller property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationTypeU }
     *     
     */
    public FrequentTravellerIdentificationTypeU getFrequentTraveller() {
        return frequentTraveller;
    }

    /**
     * Sets the value of the frequentTraveller property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationTypeU }
     *     
     */
    public void setFrequentTraveller(FrequentTravellerIdentificationTypeU value) {
        this.frequentTraveller = value;
    }

}
