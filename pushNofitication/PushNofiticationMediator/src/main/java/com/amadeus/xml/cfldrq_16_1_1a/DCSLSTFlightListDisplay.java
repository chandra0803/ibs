
package com.amadeus.xml.cfldrq_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carrier" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}TransportIdentifierType" minOccurs="0"/>
 *         &lt;element name="searchPeriod" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}StructuredPeriodInformationType" minOccurs="0"/>
 *         &lt;element name="portCode" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}AirportNodeInformationType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="terminals" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}TerminalLocationType" minOccurs="0"/>
 *         &lt;element name="displayType" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}StatusType" minOccurs="0"/>
 *         &lt;element name="disruptedFlightsIndicator" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}SelectionDetailsType" minOccurs="0"/>
 *         &lt;element name="rangeOfGates" type="{http://xml.amadeus.com/CFLDRQ_16_1_1A}PlaceLocationIdentificationType" maxOccurs="2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "carrier",
    "searchPeriod",
    "portCode",
    "terminals",
    "displayType",
    "disruptedFlightsIndicator",
    "rangeOfGates"
})
@XmlRootElement(name = "DCSLST_FlightListDisplay")
public class DCSLSTFlightListDisplay {

    protected TransportIdentifierType carrier;
    protected StructuredPeriodInformationType searchPeriod;
    protected List<AirportNodeInformationType> portCode;
    protected TerminalLocationType terminals;
    protected StatusType displayType;
    protected SelectionDetailsType disruptedFlightsIndicator;
    protected List<PlaceLocationIdentificationType> rangeOfGates;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifierType }
     *     
     */
    public TransportIdentifierType getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifierType }
     *     
     */
    public void setCarrier(TransportIdentifierType value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the searchPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredPeriodInformationType }
     *     
     */
    public StructuredPeriodInformationType getSearchPeriod() {
        return searchPeriod;
    }

    /**
     * Sets the value of the searchPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredPeriodInformationType }
     *     
     */
    public void setSearchPeriod(StructuredPeriodInformationType value) {
        this.searchPeriod = value;
    }

    /**
     * Gets the value of the portCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirportNodeInformationType }
     * 
     * 
     */
    public List<AirportNodeInformationType> getPortCode() {
        if (portCode == null) {
            portCode = new ArrayList<AirportNodeInformationType>();
        }
        return this.portCode;
    }

    /**
     * Gets the value of the terminals property.
     * 
     * @return
     *     possible object is
     *     {@link TerminalLocationType }
     *     
     */
    public TerminalLocationType getTerminals() {
        return terminals;
    }

    /**
     * Sets the value of the terminals property.
     * 
     * @param value
     *     allowed object is
     *     {@link TerminalLocationType }
     *     
     */
    public void setTerminals(TerminalLocationType value) {
        this.terminals = value;
    }

    /**
     * Gets the value of the displayType property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getDisplayType() {
        return displayType;
    }

    /**
     * Sets the value of the displayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setDisplayType(StatusType value) {
        this.displayType = value;
    }

    /**
     * Gets the value of the disruptedFlightsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link SelectionDetailsType }
     *     
     */
    public SelectionDetailsType getDisruptedFlightsIndicator() {
        return disruptedFlightsIndicator;
    }

    /**
     * Sets the value of the disruptedFlightsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectionDetailsType }
     *     
     */
    public void setDisruptedFlightsIndicator(SelectionDetailsType value) {
        this.disruptedFlightsIndicator = value;
    }

    /**
     * Gets the value of the rangeOfGates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rangeOfGates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRangeOfGates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceLocationIdentificationType }
     * 
     * 
     */
    public List<PlaceLocationIdentificationType> getRangeOfGates() {
        if (rangeOfGates == null) {
            rangeOfGates = new ArrayList<PlaceLocationIdentificationType>();
        }
        return this.rangeOfGates;
    }

}
