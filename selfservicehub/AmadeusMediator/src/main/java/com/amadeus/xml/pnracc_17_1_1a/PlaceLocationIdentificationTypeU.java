
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a place or a location and/or related locations.
 * 
 * <p>Java class for PlaceLocationIdentificationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceLocationIdentificationTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="locationDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LocationIdentificationBatchTypeU"/&gt;
 *         &lt;element name="firstLocationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RelatedLocationOneIdentificationTypeU_198193C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLocationIdentificationTypeU", propOrder = {
    "locationType",
    "locationDescription",
    "firstLocationDetails"
})
public class PlaceLocationIdentificationTypeU {

    @XmlElement(required = true)
    protected String locationType;
    @XmlElement(required = true)
    protected LocationIdentificationBatchTypeU locationDescription;
    protected RelatedLocationOneIdentificationTypeU198193C firstLocationDetails;

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LocationIdentificationBatchTypeU }
     *     
     */
    public LocationIdentificationBatchTypeU getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationBatchTypeU }
     *     
     */
    public void setLocationDescription(LocationIdentificationBatchTypeU value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the firstLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationOneIdentificationTypeU198193C }
     *     
     */
    public RelatedLocationOneIdentificationTypeU198193C getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /**
     * Sets the value of the firstLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationOneIdentificationTypeU198193C }
     *     
     */
    public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU198193C value) {
        this.firstLocationDetails = value;
    }

}
