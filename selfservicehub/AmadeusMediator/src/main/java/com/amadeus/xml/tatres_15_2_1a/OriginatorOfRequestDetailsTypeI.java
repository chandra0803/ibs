
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the point of sale details.
 * 
 * <p>Java class for OriginatorOfRequestDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorOfRequestDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="deliveringSystem" type="{http://xml.amadeus.com/TATRES_15_2_1A}SystemDetailsTypeI"/&gt;
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorIdentificationDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}LocationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="cascadingSystem" type="{http://xml.amadeus.com/TATRES_15_2_1A}SystemDetailsTypeI_83771C" minOccurs="0"/&gt;
 *         &lt;element name="originatorTypeCode" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="originDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}OriginatorDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorOfRequestDetailsTypeI", propOrder = {
    "deliveringSystem",
    "originIdentification",
    "locationDetails",
    "cascadingSystem",
    "originatorTypeCode",
    "originDetails",
    "originator"
})
public class OriginatorOfRequestDetailsTypeI {

    @XmlElement(required = true)
    protected SystemDetailsTypeI deliveringSystem;
    protected OriginatorIdentificationDetailsTypeI originIdentification;
    protected LocationTypeI locationDetails;
    protected SystemDetailsTypeI83771C cascadingSystem;
    protected String originatorTypeCode;
    protected OriginatorDetailsTypeI originDetails;
    @XmlElement(required = true)
    protected String originator;

    /**
     * Gets the value of the deliveringSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI }
     *     
     */
    public SystemDetailsTypeI getDeliveringSystem() {
        return deliveringSystem;
    }

    /**
     * Sets the value of the deliveringSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI }
     *     
     */
    public void setDeliveringSystem(SystemDetailsTypeI value) {
        this.deliveringSystem = value;
    }

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public OriginatorIdentificationDetailsTypeI getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI value) {
        this.originIdentification = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getLocationDetails() {
        return locationDetails;
    }

    /**
     * Sets the value of the locationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setLocationDetails(LocationTypeI value) {
        this.locationDetails = value;
    }

    /**
     * Gets the value of the cascadingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsTypeI83771C }
     *     
     */
    public SystemDetailsTypeI83771C getCascadingSystem() {
        return cascadingSystem;
    }

    /**
     * Sets the value of the cascadingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsTypeI83771C }
     *     
     */
    public void setCascadingSystem(SystemDetailsTypeI83771C value) {
        this.cascadingSystem = value;
    }

    /**
     * Gets the value of the originatorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorTypeCode() {
        return originatorTypeCode;
    }

    /**
     * Sets the value of the originatorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorTypeCode(String value) {
        this.originatorTypeCode = value;
    }

    /**
     * Gets the value of the originDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorDetailsTypeI }
     *     
     */
    public OriginatorDetailsTypeI getOriginDetails() {
        return originDetails;
    }

    /**
     * Sets the value of the originDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorDetailsTypeI }
     *     
     */
    public void setOriginDetails(OriginatorDetailsTypeI value) {
        this.originDetails = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

}
