
package com.amadeus.xml.acsfrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate commercial agreements related to the service being provided.
 * 
 * <p>Java class for CompanyRoleIdentificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyRoleIdentificationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transportStageQualifier" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="airlineDesignator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="flightNumber" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="operationalSuffix" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyRoleIdentificationTypeI", propOrder = {
    "transportStageQualifier",
    "airlineDesignator",
    "flightNumber",
    "operationalSuffix"
})
public class CompanyRoleIdentificationTypeI {

    @XmlElement(required = true)
    protected String transportStageQualifier;
    @XmlElement(required = true)
    protected String airlineDesignator;
    @XmlElement(required = true)
    protected String flightNumber;
    protected String operationalSuffix;

    /**
     * Gets the value of the transportStageQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportStageQualifier() {
        return transportStageQualifier;
    }

    /**
     * Sets the value of the transportStageQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportStageQualifier(String value) {
        this.transportStageQualifier = value;
    }

    /**
     * Gets the value of the airlineDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesignator() {
        return airlineDesignator;
    }

    /**
     * Sets the value of the airlineDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesignator(String value) {
        this.airlineDesignator = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the operationalSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalSuffix() {
        return operationalSuffix;
    }

    /**
     * Sets the value of the operationalSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalSuffix(String value) {
        this.operationalSuffix = value;
    }

}
