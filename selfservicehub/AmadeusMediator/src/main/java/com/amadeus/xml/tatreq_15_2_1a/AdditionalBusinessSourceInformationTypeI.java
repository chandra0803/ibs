
package com.amadeus.xml.tatreq_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify additional originator and source information.
 * 
 * <p>Java class for AdditionalBusinessSourceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalBusinessSourceInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceType" type="{http://xml.amadeus.com/TATREQ_15_2_1A}SourceTypeDetailsTypeI"/&gt;
 *         &lt;element name="originatorDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}OriginatorIdentificationDetailsTypeI_83809C" minOccurs="0"/&gt;
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}LocationTypeI_83769C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBusinessSourceInformationTypeI", propOrder = {
    "sourceType",
    "originatorDetails",
    "locationDetails"
})
public class AdditionalBusinessSourceInformationTypeI {

    @XmlElement(required = true)
    protected SourceTypeDetailsTypeI sourceType;
    protected OriginatorIdentificationDetailsTypeI83809C originatorDetails;
    protected LocationTypeI83769C locationDetails;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeDetailsTypeI }
     *     
     */
    public SourceTypeDetailsTypeI getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeDetailsTypeI }
     *     
     */
    public void setSourceType(SourceTypeDetailsTypeI value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the originatorDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI83809C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI83809C getOriginatorDetails() {
        return originatorDetails;
    }

    /**
     * Sets the value of the originatorDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI83809C }
     *     
     */
    public void setOriginatorDetails(OriginatorIdentificationDetailsTypeI83809C value) {
        this.originatorDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI83769C }
     *     
     */
    public LocationTypeI83769C getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI83769C }
     *     
     */
    public void setLocationDetails(LocationTypeI83769C value) {
        this.locationDetails = value;
    }

}
