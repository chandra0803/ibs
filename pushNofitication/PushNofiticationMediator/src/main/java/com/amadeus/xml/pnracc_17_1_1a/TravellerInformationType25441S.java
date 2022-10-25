
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a traveler and personal details relating to the traveler
 * 
 * <p>Java class for TravellerInformationType_25441S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerInformationType_25441S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="paxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerSurnameInformationType_46353C"/>
 *         &lt;element name="otherPaxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerDetailsTypeI_46354C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerInformationType_25441S", propOrder = {
    "paxDetails",
    "otherPaxDetails"
})
public class TravellerInformationType25441S {

    @XmlElement(required = true)
    protected TravellerSurnameInformationType46353C paxDetails;
    @XmlElement(required = true)
    protected TravellerDetailsTypeI46354C otherPaxDetails;

    /**
     * Gets the value of the paxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerSurnameInformationType46353C }
     *     
     */
    public TravellerSurnameInformationType46353C getPaxDetails() {
        return paxDetails;
    }

    /**
     * Sets the value of the paxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerSurnameInformationType46353C }
     *     
     */
    public void setPaxDetails(TravellerSurnameInformationType46353C value) {
        this.paxDetails = value;
    }

    /**
     * Gets the value of the otherPaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerDetailsTypeI46354C }
     *     
     */
    public TravellerDetailsTypeI46354C getOtherPaxDetails() {
        return otherPaxDetails;
    }

    /**
     * Sets the value of the otherPaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerDetailsTypeI46354C }
     *     
     */
    public void setOtherPaxDetails(TravellerDetailsTypeI46354C value) {
        this.otherPaxDetails = value;
    }

}
