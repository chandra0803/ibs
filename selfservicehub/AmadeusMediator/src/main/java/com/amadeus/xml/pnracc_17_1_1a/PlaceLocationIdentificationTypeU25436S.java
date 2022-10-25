
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a place or a location and/or related locations.
 * 
 * <p>Java class for PlaceLocationIdentificationTypeU_25436S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceLocationIdentificationTypeU_25436S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="locationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="locationDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LocationIdentificationBatchTypeU_46344C"/&gt;
 *         &lt;element name="firstLocationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RelatedLocationOneIdentificationTypeU_46345C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceLocationIdentificationTypeU_25436S", propOrder = {
    "locationType",
    "locationDescription",
    "firstLocationDetails"
})
public class PlaceLocationIdentificationTypeU25436S {

    @XmlElement(required = true)
    protected String locationType;
    @XmlElement(required = true)
    protected LocationIdentificationBatchTypeU46344C locationDescription;
    protected RelatedLocationOneIdentificationTypeU46345C firstLocationDetails;

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
     *     {@link LocationIdentificationBatchTypeU46344C }
     *     
     */
    public LocationIdentificationBatchTypeU46344C getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationIdentificationBatchTypeU46344C }
     *     
     */
    public void setLocationDescription(LocationIdentificationBatchTypeU46344C value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the firstLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLocationOneIdentificationTypeU46345C }
     *     
     */
    public RelatedLocationOneIdentificationTypeU46345C getFirstLocationDetails() {
        return firstLocationDetails;
    }

    /**
     * Sets the value of the firstLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLocationOneIdentificationTypeU46345C }
     *     
     */
    public void setFirstLocationDetails(RelatedLocationOneIdentificationTypeU46345C value) {
        this.firstLocationDetails = value;
    }

}
