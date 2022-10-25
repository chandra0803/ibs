
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Group to Store the Canada iApp information
 * 
 * <p>Java class for EdiiAppInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EdiiAppInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CountryInformationTypeU"/>
 *         &lt;element name="iAppStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_199035S"/>
 *         &lt;element name="specialInstruction" type="{http://xml.amadeus.com/APALRR_17_1_1A}InteractiveFreeTextTypeI_196874S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EdiiAppInformationType", propOrder = {
    "countryCode",
    "iAppStatus",
    "specialInstruction"
})
public class EdiiAppInformationType {

    @XmlElement(required = true)
    protected CountryInformationTypeU countryCode;
    @XmlElement(required = true)
    protected StatusType199035S iAppStatus;
    protected InteractiveFreeTextTypeI196874S specialInstruction;

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryInformationTypeU }
     *     
     */
    public CountryInformationTypeU getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryInformationTypeU }
     *     
     */
    public void setCountryCode(CountryInformationTypeU value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the iAppStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType199035S }
     *     
     */
    public StatusType199035S getIAppStatus() {
        return iAppStatus;
    }

    /**
     * Sets the value of the iAppStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType199035S }
     *     
     */
    public void setIAppStatus(StatusType199035S value) {
        this.iAppStatus = value;
    }

    /**
     * Gets the value of the specialInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextTypeI196874S }
     *     
     */
    public InteractiveFreeTextTypeI196874S getSpecialInstruction() {
        return specialInstruction;
    }

    /**
     * Sets the value of the specialInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextTypeI196874S }
     *     
     */
    public void setSpecialInstruction(InteractiveFreeTextTypeI196874S value) {
        this.specialInstruction = value;
    }

}
