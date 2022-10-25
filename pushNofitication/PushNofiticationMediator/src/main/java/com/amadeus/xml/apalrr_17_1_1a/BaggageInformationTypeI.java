
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide information concerning bagtag printers and bagtag details.
 * 
 * <p>Java class for BaggageInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="baggageDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageStatusDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="bagTagDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}BagtagDetailsTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageInformationTypeI", propOrder = {
    "baggageDetails",
    "bagTagDetails"
})
public class BaggageInformationTypeI {

    protected BaggageStatusDetailsTypeI baggageDetails;
    protected BagtagDetailsTypeI bagTagDetails;

    /**
     * Gets the value of the baggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageStatusDetailsTypeI }
     *     
     */
    public BaggageStatusDetailsTypeI getBaggageDetails() {
        return baggageDetails;
    }

    /**
     * Sets the value of the baggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageStatusDetailsTypeI }
     *     
     */
    public void setBaggageDetails(BaggageStatusDetailsTypeI value) {
        this.baggageDetails = value;
    }

    /**
     * Gets the value of the bagTagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BagtagDetailsTypeI }
     *     
     */
    public BagtagDetailsTypeI getBagTagDetails() {
        return bagTagDetails;
    }

    /**
     * Sets the value of the bagTagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagtagDetailsTypeI }
     *     
     */
    public void setBagTagDetails(BagtagDetailsTypeI value) {
        this.bagTagDetails = value;
    }

}
