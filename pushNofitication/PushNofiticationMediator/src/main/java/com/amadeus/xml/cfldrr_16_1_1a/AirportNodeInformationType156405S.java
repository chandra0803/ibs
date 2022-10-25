
package com.amadeus.xml.cfldrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey information linked to a specific Airport and one or more terminals.
 * 
 * <p>Java class for AirportNodeInformationType_156405S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirportNodeInformationType_156405S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="airportCode" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="terminalInformation" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}TerminalInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirportNodeInformationType_156405S", propOrder = {
    "airportCode",
    "terminalInformation"
})
public class AirportNodeInformationType156405S {

    @XmlElement(required = true)
    protected String airportCode;
    protected TerminalInformationTypeI terminalInformation;

    /**
     * Gets the value of the airportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportCode() {
        return airportCode;
    }

    /**
     * Sets the value of the airportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportCode(String value) {
        this.airportCode = value;
    }

    /**
     * Gets the value of the terminalInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalInformationTypeI }
     *     
     */
    public TerminalInformationTypeI getTerminalInformation() {
        return terminalInformation;
    }

    /**
     * Sets the value of the terminalInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalInformationTypeI }
     *     
     */
    public void setTerminalInformation(TerminalInformationTypeI value) {
        this.terminalInformation = value;
    }

}
