
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Description of the rail advanced seat request
 * 
 * <p>Java class for RailSeatPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RailSeatPreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="seatRequestFunction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="smokingIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="classDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ClassDetailsType_52782C" minOccurs="0"/>
 *         &lt;element name="seatConfiguration" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatConfigurationType" minOccurs="0"/>
 *         &lt;element name="sleeperDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSleeperDescriptionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailSeatPreferencesType", propOrder = {
    "seatRequestFunction",
    "smokingIndicator",
    "classDetails",
    "seatConfiguration",
    "sleeperDescription"
})
public class RailSeatPreferencesType {

    protected String seatRequestFunction;
    protected String smokingIndicator;
    protected ClassDetailsType52782C classDetails;
    protected RailSeatConfigurationType seatConfiguration;
    protected RailSleeperDescriptionType sleeperDescription;

    /**
     * Gets the value of the seatRequestFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatRequestFunction() {
        return seatRequestFunction;
    }

    /**
     * Sets the value of the seatRequestFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatRequestFunction(String value) {
        this.seatRequestFunction = value;
    }

    /**
     * Gets the value of the smokingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmokingIndicator() {
        return smokingIndicator;
    }

    /**
     * Sets the value of the smokingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmokingIndicator(String value) {
        this.smokingIndicator = value;
    }

    /**
     * Gets the value of the classDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ClassDetailsType52782C }
     *     
     */
    public ClassDetailsType52782C getClassDetails() {
        return classDetails;
    }

    /**
     * Sets the value of the classDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassDetailsType52782C }
     *     
     */
    public void setClassDetails(ClassDetailsType52782C value) {
        this.classDetails = value;
    }

    /**
     * Gets the value of the seatConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link RailSeatConfigurationType }
     *     
     */
    public RailSeatConfigurationType getSeatConfiguration() {
        return seatConfiguration;
    }

    /**
     * Sets the value of the seatConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSeatConfigurationType }
     *     
     */
    public void setSeatConfiguration(RailSeatConfigurationType value) {
        this.seatConfiguration = value;
    }

    /**
     * Gets the value of the sleeperDescription property.
     * 
     * @return
     *     possible object is
     *     {@link RailSleeperDescriptionType }
     *     
     */
    public RailSleeperDescriptionType getSleeperDescription() {
        return sleeperDescription;
    }

    /**
     * Sets the value of the sleeperDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link RailSleeperDescriptionType }
     *     
     */
    public void setSleeperDescription(RailSleeperDescriptionType value) {
        this.sleeperDescription = value;
    }

}
