
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify ownership and creator of a PNR
 * 
 * <p>Java class for AdditionalBusinessSourceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalBusinessSourceInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceType" type="{http://xml.amadeus.com/APALRR_17_1_1A}SourceTypeDetailsType" minOccurs="0"/>
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}LocationTypeI_228156C" minOccurs="0"/>
 *         &lt;element name="systemCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalBusinessSourceInformationType", propOrder = {
    "sourceType",
    "locationDetails",
    "systemCode"
})
public class AdditionalBusinessSourceInformationType {

    protected SourceTypeDetailsType sourceType;
    protected LocationTypeI228156C locationDetails;
    protected String systemCode;

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link SourceTypeDetailsType }
     *     
     */
    public SourceTypeDetailsType getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceTypeDetailsType }
     *     
     */
    public void setSourceType(SourceTypeDetailsType value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI228156C }
     *     
     */
    public LocationTypeI228156C getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI228156C }
     *     
     */
    public void setLocationDetails(LocationTypeI228156C value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCode(String value) {
        this.systemCode = value;
    }

}
