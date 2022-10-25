
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AircraftLocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftLocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arrivalDepartureOption" type="{http://xml.amadeus.com/APALRR_17_1_1A}ActionIdentificationType"/>
 *         &lt;element name="aircraftLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}TerminalLocationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftLocationDetailsType", propOrder = {
    "arrivalDepartureOption",
    "aircraftLocation"
})
public class AircraftLocationDetailsType {

    @XmlElement(required = true)
    protected ActionIdentificationType arrivalDepartureOption;
    @XmlElement(required = true)
    protected TerminalLocationType aircraftLocation;

    /**
     * Gets the value of the arrivalDepartureOption property.
     * 
     * @return
     *     possible object is
     *     {@link ActionIdentificationType }
     *     
     */
    public ActionIdentificationType getArrivalDepartureOption() {
        return arrivalDepartureOption;
    }

    /**
     * Sets the value of the arrivalDepartureOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionIdentificationType }
     *     
     */
    public void setArrivalDepartureOption(ActionIdentificationType value) {
        this.arrivalDepartureOption = value;
    }

    /**
     * Gets the value of the aircraftLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalLocationType }
     *     
     */
    public TerminalLocationType getAircraftLocation() {
        return aircraftLocation;
    }

    /**
     * Sets the value of the aircraftLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalLocationType }
     *     
     */
    public void setAircraftLocation(TerminalLocationType value) {
        this.aircraftLocation = value;
    }

}
