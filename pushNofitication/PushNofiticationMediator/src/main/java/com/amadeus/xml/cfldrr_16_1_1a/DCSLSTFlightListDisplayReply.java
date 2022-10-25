
package com.amadeus.xml.cfldrr_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="errors" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}ErrorGroupType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="searchCriteria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="carrier" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}TransportIdentifierType"/>
 *                   &lt;element name="searchPeriod" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredPeriodInformationType"/>
 *                   &lt;element name="portCode" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AirportNodeInformationType" maxOccurs="2"/>
 *                   &lt;element name="terminals" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}TerminalLocationType" minOccurs="0"/>
 *                   &lt;element name="displayType" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StatusType_192182S" minOccurs="0"/>
 *                   &lt;element name="disruptedFlightsIndicator" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}SelectionDetailsType" minOccurs="0"/>
 *                   &lt;element name="rangeOfGates" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}PlaceLocationIdentificationType" maxOccurs="2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flights" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightId" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}FlightDetailsResponseType"/>
 *                   &lt;element name="dcsLegStatus" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StatusType" maxOccurs="11"/>
 *                   &lt;element name="flightCounters" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}NumberOfUnitsType" maxOccurs="40" minOccurs="0"/>
 *                   &lt;element name="flightTimes" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="9" minOccurs="0"/>
 *                   &lt;element name="fullRouting" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}RoutingInformationTypeI" minOccurs="0"/>
 *                   &lt;element name="terminalInfo" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AirportNodeInformationType_156405S" maxOccurs="99" minOccurs="0"/>
 *                   &lt;element name="gateLocation" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}TerminalLocationType_156410S" minOccurs="0"/>
 *                   &lt;element name="aircraftInformation" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}EquipmentInformationType" minOccurs="0"/>
 *                   &lt;element name="delayCode" maxOccurs="4" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CodedAttributeType"/>
 *                             &lt;element name="time" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType_156418S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="inboundFlightInformation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="inboundFlight" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}FlightDetailsQueryType"/>
 *                             &lt;element name="inboundFlightTimes" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="4"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="cabinFigures" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cabinCode" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CabinDetailsType"/>
 *                             &lt;element name="figuresPerCabin" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}NumberOfUnitsType_192168S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="flightContacts" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="contactRole" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}RoleType"/>
 *                             &lt;element name="contactName" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}EnhancedTravellerInformationType"/>
 *                             &lt;element name="contactPhone" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}PhoneAndEmailAddressType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="marketingFlightDetails" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CommercialAgreementsType" maxOccurs="99" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "errors",
    "searchCriteria",
    "flights"
})
@XmlRootElement(name = "DCSLST_FlightListDisplayReply")
public class DCSLSTFlightListDisplayReply {

    protected List<ErrorGroupType> errors;
    protected DCSLSTFlightListDisplayReply.SearchCriteria searchCriteria;
    protected List<DCSLSTFlightListDisplayReply.Flights> flights;

    /**
     * Gets the value of the errors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the errors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType }
     * 
     * 
     */
    public List<ErrorGroupType> getErrors() {
        if (errors == null) {
            errors = new ArrayList<ErrorGroupType>();
        }
        return this.errors;
    }

    /**
     * Gets the value of the searchCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link DCSLSTFlightListDisplayReply.SearchCriteria }
     *     
     */
    public DCSLSTFlightListDisplayReply.SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCSLSTFlightListDisplayReply.SearchCriteria }
     *     
     */
    public void setSearchCriteria(DCSLSTFlightListDisplayReply.SearchCriteria value) {
        this.searchCriteria = value;
    }

    /**
     * Gets the value of the flights property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flights property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlights().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCSLSTFlightListDisplayReply.Flights }
     * 
     * 
     */
    public List<DCSLSTFlightListDisplayReply.Flights> getFlights() {
        if (flights == null) {
            flights = new ArrayList<DCSLSTFlightListDisplayReply.Flights>();
        }
        return this.flights;
    }


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
     *         &lt;element name="flightId" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}FlightDetailsResponseType"/>
     *         &lt;element name="dcsLegStatus" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StatusType" maxOccurs="11"/>
     *         &lt;element name="flightCounters" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}NumberOfUnitsType" maxOccurs="40" minOccurs="0"/>
     *         &lt;element name="flightTimes" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="9" minOccurs="0"/>
     *         &lt;element name="fullRouting" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}RoutingInformationTypeI" minOccurs="0"/>
     *         &lt;element name="terminalInfo" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AirportNodeInformationType_156405S" maxOccurs="99" minOccurs="0"/>
     *         &lt;element name="gateLocation" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}TerminalLocationType_156410S" minOccurs="0"/>
     *         &lt;element name="aircraftInformation" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}EquipmentInformationType" minOccurs="0"/>
     *         &lt;element name="delayCode" maxOccurs="4" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CodedAttributeType"/>
     *                   &lt;element name="time" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType_156418S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="inboundFlightInformation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="inboundFlight" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}FlightDetailsQueryType"/>
     *                   &lt;element name="inboundFlightTimes" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="4"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="cabinFigures" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cabinCode" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CabinDetailsType"/>
     *                   &lt;element name="figuresPerCabin" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}NumberOfUnitsType_192168S"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="flightContacts" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="contactRole" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}RoleType"/>
     *                   &lt;element name="contactName" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}EnhancedTravellerInformationType"/>
     *                   &lt;element name="contactPhone" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}PhoneAndEmailAddressType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="marketingFlightDetails" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CommercialAgreementsType" maxOccurs="99" minOccurs="0"/>
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
        "flightId",
        "dcsLegStatus",
        "flightCounters",
        "flightTimes",
        "fullRouting",
        "terminalInfo",
        "gateLocation",
        "aircraftInformation",
        "delayCode",
        "inboundFlightInformation",
        "cabinFigures",
        "flightContacts",
        "marketingFlightDetails"
    })
    public static class Flights {

        @XmlElement(required = true)
        protected FlightDetailsResponseType flightId;
        @XmlElement(required = true)
        protected List<StatusType> dcsLegStatus;
        protected List<NumberOfUnitsType> flightCounters;
        protected List<StructuredDateTimeInformationType> flightTimes;
        protected RoutingInformationTypeI fullRouting;
        protected List<AirportNodeInformationType156405S> terminalInfo;
        protected TerminalLocationType156410S gateLocation;
        protected EquipmentInformationType aircraftInformation;
        protected List<DCSLSTFlightListDisplayReply.Flights.DelayCode> delayCode;
        protected DCSLSTFlightListDisplayReply.Flights.InboundFlightInformation inboundFlightInformation;
        protected List<DCSLSTFlightListDisplayReply.Flights.CabinFigures> cabinFigures;
        protected List<DCSLSTFlightListDisplayReply.Flights.FlightContacts> flightContacts;
        protected List<CommercialAgreementsType> marketingFlightDetails;

        /**
         * Gets the value of the flightId property.
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsResponseType }
         *     
         */
        public FlightDetailsResponseType getFlightId() {
            return flightId;
        }

        /**
         * Sets the value of the flightId property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsResponseType }
         *     
         */
        public void setFlightId(FlightDetailsResponseType value) {
            this.flightId = value;
        }

        /**
         * Gets the value of the dcsLegStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dcsLegStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDcsLegStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusType }
         * 
         * 
         */
        public List<StatusType> getDcsLegStatus() {
            if (dcsLegStatus == null) {
                dcsLegStatus = new ArrayList<StatusType>();
            }
            return this.dcsLegStatus;
        }

        /**
         * Gets the value of the flightCounters property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightCounters property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightCounters().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NumberOfUnitsType }
         * 
         * 
         */
        public List<NumberOfUnitsType> getFlightCounters() {
            if (flightCounters == null) {
                flightCounters = new ArrayList<NumberOfUnitsType>();
            }
            return this.flightCounters;
        }

        /**
         * Gets the value of the flightTimes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightTimes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightTimes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getFlightTimes() {
            if (flightTimes == null) {
                flightTimes = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.flightTimes;
        }

        /**
         * Gets the value of the fullRouting property.
         * 
         * @return
         *     possible object is
         *     {@link RoutingInformationTypeI }
         *     
         */
        public RoutingInformationTypeI getFullRouting() {
            return fullRouting;
        }

        /**
         * Sets the value of the fullRouting property.
         * 
         * @param value
         *     allowed object is
         *     {@link RoutingInformationTypeI }
         *     
         */
        public void setFullRouting(RoutingInformationTypeI value) {
            this.fullRouting = value;
        }

        /**
         * Gets the value of the terminalInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the terminalInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTerminalInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirportNodeInformationType156405S }
         * 
         * 
         */
        public List<AirportNodeInformationType156405S> getTerminalInfo() {
            if (terminalInfo == null) {
                terminalInfo = new ArrayList<AirportNodeInformationType156405S>();
            }
            return this.terminalInfo;
        }

        /**
         * Gets the value of the gateLocation property.
         * 
         * @return
         *     possible object is
         *     {@link TerminalLocationType156410S }
         *     
         */
        public TerminalLocationType156410S getGateLocation() {
            return gateLocation;
        }

        /**
         * Sets the value of the gateLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TerminalLocationType156410S }
         *     
         */
        public void setGateLocation(TerminalLocationType156410S value) {
            this.gateLocation = value;
        }

        /**
         * Gets the value of the aircraftInformation property.
         * 
         * @return
         *     possible object is
         *     {@link EquipmentInformationType }
         *     
         */
        public EquipmentInformationType getAircraftInformation() {
            return aircraftInformation;
        }

        /**
         * Sets the value of the aircraftInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link EquipmentInformationType }
         *     
         */
        public void setAircraftInformation(EquipmentInformationType value) {
            this.aircraftInformation = value;
        }

        /**
         * Gets the value of the delayCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the delayCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDelayCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTFlightListDisplayReply.Flights.DelayCode }
         * 
         * 
         */
        public List<DCSLSTFlightListDisplayReply.Flights.DelayCode> getDelayCode() {
            if (delayCode == null) {
                delayCode = new ArrayList<DCSLSTFlightListDisplayReply.Flights.DelayCode>();
            }
            return this.delayCode;
        }

        /**
         * Gets the value of the inboundFlightInformation property.
         * 
         * @return
         *     possible object is
         *     {@link DCSLSTFlightListDisplayReply.Flights.InboundFlightInformation }
         *     
         */
        public DCSLSTFlightListDisplayReply.Flights.InboundFlightInformation getInboundFlightInformation() {
            return inboundFlightInformation;
        }

        /**
         * Sets the value of the inboundFlightInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link DCSLSTFlightListDisplayReply.Flights.InboundFlightInformation }
         *     
         */
        public void setInboundFlightInformation(DCSLSTFlightListDisplayReply.Flights.InboundFlightInformation value) {
            this.inboundFlightInformation = value;
        }

        /**
         * Gets the value of the cabinFigures property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinFigures property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinFigures().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTFlightListDisplayReply.Flights.CabinFigures }
         * 
         * 
         */
        public List<DCSLSTFlightListDisplayReply.Flights.CabinFigures> getCabinFigures() {
            if (cabinFigures == null) {
                cabinFigures = new ArrayList<DCSLSTFlightListDisplayReply.Flights.CabinFigures>();
            }
            return this.cabinFigures;
        }

        /**
         * Gets the value of the flightContacts property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightContacts property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightContacts().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTFlightListDisplayReply.Flights.FlightContacts }
         * 
         * 
         */
        public List<DCSLSTFlightListDisplayReply.Flights.FlightContacts> getFlightContacts() {
            if (flightContacts == null) {
                flightContacts = new ArrayList<DCSLSTFlightListDisplayReply.Flights.FlightContacts>();
            }
            return this.flightContacts;
        }

        /**
         * Gets the value of the marketingFlightDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the marketingFlightDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMarketingFlightDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommercialAgreementsType }
         * 
         * 
         */
        public List<CommercialAgreementsType> getMarketingFlightDetails() {
            if (marketingFlightDetails == null) {
                marketingFlightDetails = new ArrayList<CommercialAgreementsType>();
            }
            return this.marketingFlightDetails;
        }


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
         *         &lt;element name="cabinCode" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CabinDetailsType"/>
         *         &lt;element name="figuresPerCabin" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}NumberOfUnitsType_192168S"/>
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
            "cabinCode",
            "figuresPerCabin"
        })
        public static class CabinFigures {

            @XmlElement(required = true)
            protected CabinDetailsType cabinCode;
            @XmlElement(required = true)
            protected NumberOfUnitsType192168S figuresPerCabin;

            /**
             * Gets the value of the cabinCode property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getCabinCode() {
                return cabinCode;
            }

            /**
             * Sets the value of the cabinCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setCabinCode(CabinDetailsType value) {
                this.cabinCode = value;
            }

            /**
             * Gets the value of the figuresPerCabin property.
             * 
             * @return
             *     possible object is
             *     {@link NumberOfUnitsType192168S }
             *     
             */
            public NumberOfUnitsType192168S getFiguresPerCabin() {
                return figuresPerCabin;
            }

            /**
             * Sets the value of the figuresPerCabin property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumberOfUnitsType192168S }
             *     
             */
            public void setFiguresPerCabin(NumberOfUnitsType192168S value) {
                this.figuresPerCabin = value;
            }

        }


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
         *         &lt;element name="code" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}CodedAttributeType"/>
         *         &lt;element name="time" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType_156418S" minOccurs="0"/>
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
            "code",
            "time"
        })
        public static class DelayCode {

            @XmlElement(required = true)
            protected CodedAttributeType code;
            protected StructuredDateTimeInformationType156418S time;

            /**
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link CodedAttributeType }
             *     
             */
            public CodedAttributeType getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedAttributeType }
             *     
             */
            public void setCode(CodedAttributeType value) {
                this.code = value;
            }

            /**
             * Gets the value of the time property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredDateTimeInformationType156418S }
             *     
             */
            public StructuredDateTimeInformationType156418S getTime() {
                return time;
            }

            /**
             * Sets the value of the time property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredDateTimeInformationType156418S }
             *     
             */
            public void setTime(StructuredDateTimeInformationType156418S value) {
                this.time = value;
            }

        }


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
         *         &lt;element name="contactRole" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}RoleType"/>
         *         &lt;element name="contactName" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}EnhancedTravellerInformationType"/>
         *         &lt;element name="contactPhone" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}PhoneAndEmailAddressType" minOccurs="0"/>
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
            "contactRole",
            "contactName",
            "contactPhone"
        })
        public static class FlightContacts {

            @XmlElement(required = true)
            protected RoleType contactRole;
            @XmlElement(required = true)
            protected EnhancedTravellerInformationType contactName;
            protected PhoneAndEmailAddressType contactPhone;

            /**
             * Gets the value of the contactRole property.
             * 
             * @return
             *     possible object is
             *     {@link RoleType }
             *     
             */
            public RoleType getContactRole() {
                return contactRole;
            }

            /**
             * Sets the value of the contactRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link RoleType }
             *     
             */
            public void setContactRole(RoleType value) {
                this.contactRole = value;
            }

            /**
             * Gets the value of the contactName property.
             * 
             * @return
             *     possible object is
             *     {@link EnhancedTravellerInformationType }
             *     
             */
            public EnhancedTravellerInformationType getContactName() {
                return contactName;
            }

            /**
             * Sets the value of the contactName property.
             * 
             * @param value
             *     allowed object is
             *     {@link EnhancedTravellerInformationType }
             *     
             */
            public void setContactName(EnhancedTravellerInformationType value) {
                this.contactName = value;
            }

            /**
             * Gets the value of the contactPhone property.
             * 
             * @return
             *     possible object is
             *     {@link PhoneAndEmailAddressType }
             *     
             */
            public PhoneAndEmailAddressType getContactPhone() {
                return contactPhone;
            }

            /**
             * Sets the value of the contactPhone property.
             * 
             * @param value
             *     allowed object is
             *     {@link PhoneAndEmailAddressType }
             *     
             */
            public void setContactPhone(PhoneAndEmailAddressType value) {
                this.contactPhone = value;
            }

        }


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
         *         &lt;element name="inboundFlight" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}FlightDetailsQueryType"/>
         *         &lt;element name="inboundFlightTimes" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="4"/>
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
            "inboundFlight",
            "inboundFlightTimes"
        })
        public static class InboundFlightInformation {

            @XmlElement(required = true)
            protected FlightDetailsQueryType inboundFlight;
            @XmlElement(required = true)
            protected List<StructuredDateTimeInformationType> inboundFlightTimes;

            /**
             * Gets the value of the inboundFlight property.
             * 
             * @return
             *     possible object is
             *     {@link FlightDetailsQueryType }
             *     
             */
            public FlightDetailsQueryType getInboundFlight() {
                return inboundFlight;
            }

            /**
             * Sets the value of the inboundFlight property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightDetailsQueryType }
             *     
             */
            public void setInboundFlight(FlightDetailsQueryType value) {
                this.inboundFlight = value;
            }

            /**
             * Gets the value of the inboundFlightTimes property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inboundFlightTimes property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInboundFlightTimes().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StructuredDateTimeInformationType }
             * 
             * 
             */
            public List<StructuredDateTimeInformationType> getInboundFlightTimes() {
                if (inboundFlightTimes == null) {
                    inboundFlightTimes = new ArrayList<StructuredDateTimeInformationType>();
                }
                return this.inboundFlightTimes;
            }

        }

    }


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
     *         &lt;element name="carrier" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}TransportIdentifierType"/>
     *         &lt;element name="searchPeriod" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StructuredPeriodInformationType"/>
     *         &lt;element name="portCode" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}AirportNodeInformationType" maxOccurs="2"/>
     *         &lt;element name="terminals" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}TerminalLocationType" minOccurs="0"/>
     *         &lt;element name="displayType" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}StatusType_192182S" minOccurs="0"/>
     *         &lt;element name="disruptedFlightsIndicator" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}SelectionDetailsType" minOccurs="0"/>
     *         &lt;element name="rangeOfGates" type="{http://xml.amadeus.com/CFLDRR_16_1_1A}PlaceLocationIdentificationType" maxOccurs="2" minOccurs="0"/>
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
    public static class SearchCriteria {

        @XmlElement(required = true)
        protected TransportIdentifierType carrier;
        @XmlElement(required = true)
        protected StructuredPeriodInformationType searchPeriod;
        @XmlElement(required = true)
        protected List<AirportNodeInformationType> portCode;
        protected TerminalLocationType terminals;
        protected StatusType192182S displayType;
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
         *     {@link StatusType192182S }
         *     
         */
        public StatusType192182S getDisplayType() {
            return displayType;
        }

        /**
         * Sets the value of the displayType property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType192182S }
         *     
         */
        public void setDisplayType(StatusType192182S value) {
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

}
