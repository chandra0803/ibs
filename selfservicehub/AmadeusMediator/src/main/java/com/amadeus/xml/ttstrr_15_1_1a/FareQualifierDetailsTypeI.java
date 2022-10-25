
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the fare basis information
 * 
 * <p>Java class for FareQualifierDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareQualifierDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="movementType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="fareDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}FareDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AdditionalFareQualifierDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="zapOffDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountPenaltyInformationTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareQualifierDetailsTypeI", propOrder = {
    "movementType",
    "fareDetails",
    "fareBasisDetails",
    "zapOffDetails"
})
public class FareQualifierDetailsTypeI {

    protected String movementType;
    protected FareDetailsTypeI fareDetails;
    protected AdditionalFareQualifierDetailsTypeI fareBasisDetails;
    protected DiscountPenaltyInformationTypeI zapOffDetails;

    /**
     * Gets the value of the movementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovementType() {
        return movementType;
    }

    /**
     * Sets the value of the movementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovementType(String value) {
        this.movementType = value;
    }

    /**
     * Gets the value of the fareDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public FareDetailsTypeI getFareDetails() {
        return fareDetails;
    }

    /**
     * Sets the value of the fareDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailsTypeI }
     *     
     */
    public void setFareDetails(FareDetailsTypeI value) {
        this.fareDetails = value;
    }

    /**
     * Gets the value of the fareBasisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public AdditionalFareQualifierDetailsTypeI getFareBasisDetails() {
        return fareBasisDetails;
    }

    /**
     * Sets the value of the fareBasisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalFareQualifierDetailsTypeI }
     *     
     */
    public void setFareBasisDetails(AdditionalFareQualifierDetailsTypeI value) {
        this.fareBasisDetails = value;
    }

    /**
     * Gets the value of the zapOffDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountPenaltyInformationTypeI }
     *     
     */
    public DiscountPenaltyInformationTypeI getZapOffDetails() {
        return zapOffDetails;
    }

    /**
     * Sets the value of the zapOffDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountPenaltyInformationTypeI }
     *     
     */
    public void setZapOffDetails(DiscountPenaltyInformationTypeI value) {
        this.zapOffDetails = value;
    }

}
