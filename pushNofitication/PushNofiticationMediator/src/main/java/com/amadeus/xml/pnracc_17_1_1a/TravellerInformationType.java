
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler and personal details relating to the traveler
 * 
 * <p>Java class for TravellerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerSurnameInformationType_858C" minOccurs="0"/>
 *         &lt;element name="otherPaxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerDetailsTypeI_18004C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType", propOrder = {
    "paxDetails",
    "otherPaxDetails"
})
public class TravellerInformationType {

    protected TravellerSurnameInformationType858C paxDetails;
    protected TravellerDetailsTypeI18004C otherPaxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationType858C }
     *     
     */
    public TravellerSurnameInformationType858C getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationType858C }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationType858C value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the otherPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI18004C }
     *     
     */
    public TravellerDetailsTypeI18004C getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /**
     * Sets the value of the otherPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI18004C }
     *     
     */
    public void setOtherPaxDetails(TravellerDetailsTypeI18004C value) {
        this.otherPaxDetails = value;
    }

}
