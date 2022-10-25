
package com.amadeus.xml.acsfrr_16_1_1a;

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
 *         &lt;element name="errors" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ErrorGroupType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="flightDetailsGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightLegInformation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FlightDetailsResponseType"/>
 *                   &lt;element name="versions" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ItemReferencesAndVersionsType" maxOccurs="4" minOccurs="0"/>
 *                   &lt;element name="flightStatus" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="22"/>
 *                   &lt;element name="flightDetails" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="marketingFlightDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CommercialAgreementsTypeI"/>
 *                             &lt;element name="seatingCutOffIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="preDefinedComment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="preDefinedCommentNumber" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType"/>
 *                             &lt;element name="preDefinedCommentText" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FreeTextInformationType_199155S"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="flightRelatedComments" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="commentId" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ItemReferencesAndVersionsType_123290S"/>
 *                             &lt;element name="commentText" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FreeTextInformationType_199155S"/>
 *                             &lt;element name="commentCategory" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="11" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="flightTimings" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="legInformation" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="legRestriction" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}OriginAndDestinationDetailsTypeI"/>
 *                             &lt;element name="inhibitIndicators" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="7"/>
 *                             &lt;element name="legFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="3"/>
 *                             &lt;element name="weightAllowance" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}QuantityType" minOccurs="0"/>
 *                             &lt;element name="marketingCarrierInfo" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codeshareCarrier" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TransportIdentifierType"/>
 *                                       &lt;element name="seatNumCounts" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2"/>
 *                                       &lt;element name="legCabinInfo" maxOccurs="9">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="cabinAndServiceClass" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType_78486S"/>
 *                                                 &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="84"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="bagIndicators" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="4"/>
 *                   &lt;element name="cabinTotalInfo" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cabin" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType"/>
 *                             &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="7"/>
 *                             &lt;element name="voluntaryStatus" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dummySTX" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}DummySegmentTypeI"/>
 *                   &lt;element name="contactDetailsIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType"/>
 *                   &lt;element name="legInformationGroup" maxOccurs="20">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="terminalInfo" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AirportNodeInformationType"/>
 *                             &lt;element name="gate" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TerminalLocationType_13164S" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="aircraftInformation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}EquipmentInformationType" minOccurs="0"/>
 *                             &lt;element name="spurNumber" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType" minOccurs="0"/>
 *                             &lt;element name="dummyEqn" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="legTimings" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="11" minOccurs="0"/>
 *                             &lt;element name="delays" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}QuantityType_138305S" minOccurs="0"/>
 *                             &lt;element name="elapsedPeriods" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="cabinInformation" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="aircraftConfiguration" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}EquipmentInformationTypeI"/>
 *                                       &lt;element name="cabinFigure" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="freeSeatingIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="acLocationTerminalDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="arrivalDepartureOption" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ActionIdentificationType"/>
 *                                       &lt;element name="aircraftLocation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TerminalLocationType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
    "flightDetailsGroup"
})
@XmlRootElement(name = "DCSLST_GetCheckInSummaryFiguresReply")
public class DCSLSTGetCheckInSummaryFiguresReply {

    protected List<ErrorGroupType> errors;
    protected DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup flightDetailsGroup;

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
     * Gets the value of the flightDetailsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup }
     *     
     */
    public DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup getFlightDetailsGroup() {
        return flightDetailsGroup;
    }

    /**
     * Sets the value of the flightDetailsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup }
     *     
     */
    public void setFlightDetailsGroup(DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup value) {
        this.flightDetailsGroup = value;
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
     *         &lt;element name="flightLegInformation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FlightDetailsResponseType"/>
     *         &lt;element name="versions" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ItemReferencesAndVersionsType" maxOccurs="4" minOccurs="0"/>
     *         &lt;element name="flightStatus" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="22"/>
     *         &lt;element name="flightDetails" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="marketingFlightDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CommercialAgreementsTypeI"/>
     *                   &lt;element name="seatingCutOffIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="preDefinedComment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="preDefinedCommentNumber" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType"/>
     *                   &lt;element name="preDefinedCommentText" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FreeTextInformationType_199155S"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="flightRelatedComments" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="commentId" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ItemReferencesAndVersionsType_123290S"/>
     *                   &lt;element name="commentText" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FreeTextInformationType_199155S"/>
     *                   &lt;element name="commentCategory" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="11" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="flightTimings" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="legInformation" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="legRestriction" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}OriginAndDestinationDetailsTypeI"/>
     *                   &lt;element name="inhibitIndicators" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="7"/>
     *                   &lt;element name="legFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="3"/>
     *                   &lt;element name="weightAllowance" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}QuantityType" minOccurs="0"/>
     *                   &lt;element name="marketingCarrierInfo" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codeshareCarrier" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TransportIdentifierType"/>
     *                             &lt;element name="seatNumCounts" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2"/>
     *                             &lt;element name="legCabinInfo" maxOccurs="9">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="cabinAndServiceClass" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType_78486S"/>
     *                                       &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="84"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="bagIndicators" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="4"/>
     *         &lt;element name="cabinTotalInfo" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cabin" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType"/>
     *                   &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="7"/>
     *                   &lt;element name="voluntaryStatus" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="2"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dummySTX" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}DummySegmentTypeI"/>
     *         &lt;element name="contactDetailsIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType"/>
     *         &lt;element name="legInformationGroup" maxOccurs="20">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="terminalInfo" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AirportNodeInformationType"/>
     *                   &lt;element name="gate" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TerminalLocationType_13164S" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="aircraftInformation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}EquipmentInformationType" minOccurs="0"/>
     *                   &lt;element name="spurNumber" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType" minOccurs="0"/>
     *                   &lt;element name="dummyEqn" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="legTimings" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="11" minOccurs="0"/>
     *                   &lt;element name="delays" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}QuantityType_138305S" minOccurs="0"/>
     *                   &lt;element name="elapsedPeriods" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="cabinInformation" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="aircraftConfiguration" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}EquipmentInformationTypeI"/>
     *                             &lt;element name="cabinFigure" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="freeSeatingIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="acLocationTerminalDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="arrivalDepartureOption" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ActionIdentificationType"/>
     *                             &lt;element name="aircraftLocation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TerminalLocationType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
        "flightLegInformation",
        "versions",
        "flightStatus",
        "flightDetails",
        "preDefinedComment",
        "flightRelatedComments",
        "flightTimings",
        "legInformation",
        "bagIndicators",
        "cabinTotalInfo",
        "dummySTX",
        "contactDetailsIndicator",
        "legInformationGroup"
    })
    public static class FlightDetailsGroup {

        @XmlElement(required = true)
        protected FlightDetailsResponseType flightLegInformation;
        protected List<ItemReferencesAndVersionsType> versions;
        @XmlElement(required = true)
        protected List<StatusType> flightStatus;
        protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightDetails> flightDetails;
        protected DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.PreDefinedComment preDefinedComment;
        protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightRelatedComments> flightRelatedComments;
        protected List<StructuredDateTimeInformationType> flightTimings;
        @XmlElement(required = true)
        protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation> legInformation;
        @XmlElement(required = true)
        protected List<StatusType> bagIndicators;
        @XmlElement(required = true)
        protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.CabinTotalInfo> cabinTotalInfo;
        @XmlElement(required = true)
        protected DummySegmentTypeI dummySTX;
        @XmlElement(required = true)
        protected StatusType contactDetailsIndicator;
        @XmlElement(required = true)
        protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup> legInformationGroup;

        /**
         * Gets the value of the flightLegInformation property.
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsResponseType }
         *     
         */
        public FlightDetailsResponseType getFlightLegInformation() {
            return flightLegInformation;
        }

        /**
         * Sets the value of the flightLegInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsResponseType }
         *     
         */
        public void setFlightLegInformation(FlightDetailsResponseType value) {
            this.flightLegInformation = value;
        }

        /**
         * Gets the value of the versions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the versions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVersions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ItemReferencesAndVersionsType }
         * 
         * 
         */
        public List<ItemReferencesAndVersionsType> getVersions() {
            if (versions == null) {
                versions = new ArrayList<ItemReferencesAndVersionsType>();
            }
            return this.versions;
        }

        /**
         * Gets the value of the flightStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusType }
         * 
         * 
         */
        public List<StatusType> getFlightStatus() {
            if (flightStatus == null) {
                flightStatus = new ArrayList<StatusType>();
            }
            return this.flightStatus;
        }

        /**
         * Gets the value of the flightDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightDetails }
         * 
         * 
         */
        public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightDetails> getFlightDetails() {
            if (flightDetails == null) {
                flightDetails = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightDetails>();
            }
            return this.flightDetails;
        }

        /**
         * Gets the value of the preDefinedComment property.
         * 
         * @return
         *     possible object is
         *     {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.PreDefinedComment }
         *     
         */
        public DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.PreDefinedComment getPreDefinedComment() {
            return preDefinedComment;
        }

        /**
         * Sets the value of the preDefinedComment property.
         * 
         * @param value
         *     allowed object is
         *     {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.PreDefinedComment }
         *     
         */
        public void setPreDefinedComment(DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.PreDefinedComment value) {
            this.preDefinedComment = value;
        }

        /**
         * Gets the value of the flightRelatedComments property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightRelatedComments property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightRelatedComments().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightRelatedComments }
         * 
         * 
         */
        public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightRelatedComments> getFlightRelatedComments() {
            if (flightRelatedComments == null) {
                flightRelatedComments = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.FlightRelatedComments>();
            }
            return this.flightRelatedComments;
        }

        /**
         * Gets the value of the flightTimings property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightTimings property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightTimings().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType> getFlightTimings() {
            if (flightTimings == null) {
                flightTimings = new ArrayList<StructuredDateTimeInformationType>();
            }
            return this.flightTimings;
        }

        /**
         * Gets the value of the legInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation }
         * 
         * 
         */
        public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation> getLegInformation() {
            if (legInformation == null) {
                legInformation = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation>();
            }
            return this.legInformation;
        }

        /**
         * Gets the value of the bagIndicators property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bagIndicators property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBagIndicators().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StatusType }
         * 
         * 
         */
        public List<StatusType> getBagIndicators() {
            if (bagIndicators == null) {
                bagIndicators = new ArrayList<StatusType>();
            }
            return this.bagIndicators;
        }

        /**
         * Gets the value of the cabinTotalInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabinTotalInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabinTotalInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.CabinTotalInfo }
         * 
         * 
         */
        public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.CabinTotalInfo> getCabinTotalInfo() {
            if (cabinTotalInfo == null) {
                cabinTotalInfo = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.CabinTotalInfo>();
            }
            return this.cabinTotalInfo;
        }

        /**
         * Gets the value of the dummySTX property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getDummySTX() {
            return dummySTX;
        }

        /**
         * Sets the value of the dummySTX property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setDummySTX(DummySegmentTypeI value) {
            this.dummySTX = value;
        }

        /**
         * Gets the value of the contactDetailsIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getContactDetailsIndicator() {
            return contactDetailsIndicator;
        }

        /**
         * Sets the value of the contactDetailsIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setContactDetailsIndicator(StatusType value) {
            this.contactDetailsIndicator = value;
        }

        /**
         * Gets the value of the legInformationGroup property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legInformationGroup property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegInformationGroup().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup }
         * 
         * 
         */
        public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup> getLegInformationGroup() {
            if (legInformationGroup == null) {
                legInformationGroup = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup>();
            }
            return this.legInformationGroup;
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
         *         &lt;element name="cabin" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType"/>
         *         &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="7"/>
         *         &lt;element name="voluntaryStatus" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="2"/>
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
            "cabin",
            "cabinFigures",
            "voluntaryStatus"
        })
        public static class CabinTotalInfo {

            @XmlElement(required = true)
            protected CabinDetailsType cabin;
            @XmlElement(required = true)
            protected List<NumberOfUnitsType122540S> cabinFigures;
            @XmlElement(required = true)
            protected List<StatusType> voluntaryStatus;

            /**
             * Gets the value of the cabin property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getCabin() {
                return cabin;
            }

            /**
             * Sets the value of the cabin property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setCabin(CabinDetailsType value) {
                this.cabin = value;
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
             * {@link NumberOfUnitsType122540S }
             * 
             * 
             */
            public List<NumberOfUnitsType122540S> getCabinFigures() {
                if (cabinFigures == null) {
                    cabinFigures = new ArrayList<NumberOfUnitsType122540S>();
                }
                return this.cabinFigures;
            }

            /**
             * Gets the value of the voluntaryStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the voluntaryStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVoluntaryStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusType }
             * 
             * 
             */
            public List<StatusType> getVoluntaryStatus() {
                if (voluntaryStatus == null) {
                    voluntaryStatus = new ArrayList<StatusType>();
                }
                return this.voluntaryStatus;
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
         *         &lt;element name="marketingFlightDetails" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CommercialAgreementsTypeI"/>
         *         &lt;element name="seatingCutOffIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" minOccurs="0"/>
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
            "marketingFlightDetails",
            "seatingCutOffIndicator"
        })
        public static class FlightDetails {

            @XmlElement(required = true)
            protected CommercialAgreementsTypeI marketingFlightDetails;
            protected StatusType seatingCutOffIndicator;

            /**
             * Gets the value of the marketingFlightDetails property.
             * 
             * @return
             *     possible object is
             *     {@link CommercialAgreementsTypeI }
             *     
             */
            public CommercialAgreementsTypeI getMarketingFlightDetails() {
                return marketingFlightDetails;
            }

            /**
             * Sets the value of the marketingFlightDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommercialAgreementsTypeI }
             *     
             */
            public void setMarketingFlightDetails(CommercialAgreementsTypeI value) {
                this.marketingFlightDetails = value;
            }

            /**
             * Gets the value of the seatingCutOffIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType }
             *     
             */
            public StatusType getSeatingCutOffIndicator() {
                return seatingCutOffIndicator;
            }

            /**
             * Sets the value of the seatingCutOffIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType }
             *     
             */
            public void setSeatingCutOffIndicator(StatusType value) {
                this.seatingCutOffIndicator = value;
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
         *         &lt;element name="commentId" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ItemReferencesAndVersionsType_123290S"/>
         *         &lt;element name="commentText" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FreeTextInformationType_199155S"/>
         *         &lt;element name="commentCategory" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="11" minOccurs="0"/>
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
            "commentId",
            "commentText",
            "commentCategory"
        })
        public static class FlightRelatedComments {

            @XmlElement(required = true)
            protected ItemReferencesAndVersionsType123290S commentId;
            @XmlElement(required = true)
            protected FreeTextInformationType199155S commentText;
            protected List<StatusType> commentCategory;

            /**
             * Gets the value of the commentId property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType123290S }
             *     
             */
            public ItemReferencesAndVersionsType123290S getCommentId() {
                return commentId;
            }

            /**
             * Sets the value of the commentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType123290S }
             *     
             */
            public void setCommentId(ItemReferencesAndVersionsType123290S value) {
                this.commentId = value;
            }

            /**
             * Gets the value of the commentText property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType199155S }
             *     
             */
            public FreeTextInformationType199155S getCommentText() {
                return commentText;
            }

            /**
             * Sets the value of the commentText property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType199155S }
             *     
             */
            public void setCommentText(FreeTextInformationType199155S value) {
                this.commentText = value;
            }

            /**
             * Gets the value of the commentCategory property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the commentCategory property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCommentCategory().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusType }
             * 
             * 
             */
            public List<StatusType> getCommentCategory() {
                if (commentCategory == null) {
                    commentCategory = new ArrayList<StatusType>();
                }
                return this.commentCategory;
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
         *         &lt;element name="legRestriction" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}OriginAndDestinationDetailsTypeI"/>
         *         &lt;element name="inhibitIndicators" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" maxOccurs="7"/>
         *         &lt;element name="legFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="3"/>
         *         &lt;element name="weightAllowance" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}QuantityType" minOccurs="0"/>
         *         &lt;element name="marketingCarrierInfo" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codeshareCarrier" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TransportIdentifierType"/>
         *                   &lt;element name="seatNumCounts" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2"/>
         *                   &lt;element name="legCabinInfo" maxOccurs="9">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cabinAndServiceClass" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType_78486S"/>
         *                             &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="84"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
            "legRestriction",
            "inhibitIndicators",
            "legFigures",
            "weightAllowance",
            "marketingCarrierInfo"
        })
        public static class LegInformation {

            @XmlElement(required = true)
            protected OriginAndDestinationDetailsTypeI legRestriction;
            @XmlElement(required = true)
            protected List<StatusType> inhibitIndicators;
            @XmlElement(required = true)
            protected List<NumberOfUnitsType122540S> legFigures;
            protected QuantityType weightAllowance;
            @XmlElement(required = true)
            protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo> marketingCarrierInfo;

            /**
             * Gets the value of the legRestriction property.
             * 
             * @return
             *     possible object is
             *     {@link OriginAndDestinationDetailsTypeI }
             *     
             */
            public OriginAndDestinationDetailsTypeI getLegRestriction() {
                return legRestriction;
            }

            /**
             * Sets the value of the legRestriction property.
             * 
             * @param value
             *     allowed object is
             *     {@link OriginAndDestinationDetailsTypeI }
             *     
             */
            public void setLegRestriction(OriginAndDestinationDetailsTypeI value) {
                this.legRestriction = value;
            }

            /**
             * Gets the value of the inhibitIndicators property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the inhibitIndicators property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInhibitIndicators().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusType }
             * 
             * 
             */
            public List<StatusType> getInhibitIndicators() {
                if (inhibitIndicators == null) {
                    inhibitIndicators = new ArrayList<StatusType>();
                }
                return this.inhibitIndicators;
            }

            /**
             * Gets the value of the legFigures property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the legFigures property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLegFigures().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NumberOfUnitsType122540S }
             * 
             * 
             */
            public List<NumberOfUnitsType122540S> getLegFigures() {
                if (legFigures == null) {
                    legFigures = new ArrayList<NumberOfUnitsType122540S>();
                }
                return this.legFigures;
            }

            /**
             * Gets the value of the weightAllowance property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityType }
             *     
             */
            public QuantityType getWeightAllowance() {
                return weightAllowance;
            }

            /**
             * Sets the value of the weightAllowance property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityType }
             *     
             */
            public void setWeightAllowance(QuantityType value) {
                this.weightAllowance = value;
            }

            /**
             * Gets the value of the marketingCarrierInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the marketingCarrierInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMarketingCarrierInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo }
             * 
             * 
             */
            public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo> getMarketingCarrierInfo() {
                if (marketingCarrierInfo == null) {
                    marketingCarrierInfo = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo>();
                }
                return this.marketingCarrierInfo;
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
             *         &lt;element name="codeshareCarrier" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TransportIdentifierType"/>
             *         &lt;element name="seatNumCounts" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2"/>
             *         &lt;element name="legCabinInfo" maxOccurs="9">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cabinAndServiceClass" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType_78486S"/>
             *                   &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="84"/>
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
                "codeshareCarrier",
                "seatNumCounts",
                "legCabinInfo"
            })
            public static class MarketingCarrierInfo {

                @XmlElement(required = true)
                protected TransportIdentifierType codeshareCarrier;
                @XmlElement(required = true)
                protected List<NumberOfUnitsType122540S> seatNumCounts;
                @XmlElement(required = true)
                protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo.LegCabinInfo> legCabinInfo;

                /**
                 * Gets the value of the codeshareCarrier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransportIdentifierType }
                 *     
                 */
                public TransportIdentifierType getCodeshareCarrier() {
                    return codeshareCarrier;
                }

                /**
                 * Sets the value of the codeshareCarrier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransportIdentifierType }
                 *     
                 */
                public void setCodeshareCarrier(TransportIdentifierType value) {
                    this.codeshareCarrier = value;
                }

                /**
                 * Gets the value of the seatNumCounts property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the seatNumCounts property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSeatNumCounts().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NumberOfUnitsType122540S }
                 * 
                 * 
                 */
                public List<NumberOfUnitsType122540S> getSeatNumCounts() {
                    if (seatNumCounts == null) {
                        seatNumCounts = new ArrayList<NumberOfUnitsType122540S>();
                    }
                    return this.seatNumCounts;
                }

                /**
                 * Gets the value of the legCabinInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the legCabinInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLegCabinInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo.LegCabinInfo }
                 * 
                 * 
                 */
                public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo.LegCabinInfo> getLegCabinInfo() {
                    if (legCabinInfo == null) {
                        legCabinInfo = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformation.MarketingCarrierInfo.LegCabinInfo>();
                    }
                    return this.legCabinInfo;
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
                 *         &lt;element name="cabinAndServiceClass" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}CabinDetailsType_78486S"/>
                 *         &lt;element name="cabinFigures" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="84"/>
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
                    "cabinAndServiceClass",
                    "cabinFigures"
                })
                public static class LegCabinInfo {

                    @XmlElement(required = true)
                    protected CabinDetailsType78486S cabinAndServiceClass;
                    @XmlElement(required = true)
                    protected List<NumberOfUnitsType122569S> cabinFigures;

                    /**
                     * Gets the value of the cabinAndServiceClass property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CabinDetailsType78486S }
                     *     
                     */
                    public CabinDetailsType78486S getCabinAndServiceClass() {
                        return cabinAndServiceClass;
                    }

                    /**
                     * Sets the value of the cabinAndServiceClass property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CabinDetailsType78486S }
                     *     
                     */
                    public void setCabinAndServiceClass(CabinDetailsType78486S value) {
                        this.cabinAndServiceClass = value;
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
                     * {@link NumberOfUnitsType122569S }
                     * 
                     * 
                     */
                    public List<NumberOfUnitsType122569S> getCabinFigures() {
                        if (cabinFigures == null) {
                            cabinFigures = new ArrayList<NumberOfUnitsType122569S>();
                        }
                        return this.cabinFigures;
                    }

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
         *         &lt;element name="terminalInfo" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}AirportNodeInformationType"/>
         *         &lt;element name="gate" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TerminalLocationType_13164S" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="aircraftInformation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}EquipmentInformationType" minOccurs="0"/>
         *         &lt;element name="spurNumber" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType" minOccurs="0"/>
         *         &lt;element name="dummyEqn" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="legTimings" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StructuredDateTimeInformationType" maxOccurs="11" minOccurs="0"/>
         *         &lt;element name="delays" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}QuantityType_138305S" minOccurs="0"/>
         *         &lt;element name="elapsedPeriods" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122569S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="cabinInformation" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="aircraftConfiguration" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}EquipmentInformationTypeI"/>
         *                   &lt;element name="cabinFigure" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="freeSeatingIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="acLocationTerminalDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="arrivalDepartureOption" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ActionIdentificationType"/>
         *                   &lt;element name="aircraftLocation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TerminalLocationType"/>
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
            "terminalInfo",
            "gate",
            "aircraftInformation",
            "spurNumber",
            "dummyEqn",
            "legTimings",
            "delays",
            "elapsedPeriods",
            "cabinInformation",
            "acLocationTerminalDetails"
        })
        public static class LegInformationGroup {

            @XmlElement(required = true)
            protected AirportNodeInformationType terminalInfo;
            protected List<TerminalLocationType13164S> gate;
            protected EquipmentInformationType aircraftInformation;
            protected NumberOfUnitsType spurNumber;
            @XmlElement(required = true)
            protected DummySegmentTypeI dummyEqn;
            protected List<StructuredDateTimeInformationType> legTimings;
            protected QuantityType138305S delays;
            protected List<NumberOfUnitsType122569S> elapsedPeriods;
            protected List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.CabinInformation> cabinInformation;
            protected DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.AcLocationTerminalDetails acLocationTerminalDetails;

            /**
             * Gets the value of the terminalInfo property.
             * 
             * @return
             *     possible object is
             *     {@link AirportNodeInformationType }
             *     
             */
            public AirportNodeInformationType getTerminalInfo() {
                return terminalInfo;
            }

            /**
             * Sets the value of the terminalInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirportNodeInformationType }
             *     
             */
            public void setTerminalInfo(AirportNodeInformationType value) {
                this.terminalInfo = value;
            }

            /**
             * Gets the value of the gate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the gate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TerminalLocationType13164S }
             * 
             * 
             */
            public List<TerminalLocationType13164S> getGate() {
                if (gate == null) {
                    gate = new ArrayList<TerminalLocationType13164S>();
                }
                return this.gate;
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
             * Gets the value of the spurNumber property.
             * 
             * @return
             *     possible object is
             *     {@link NumberOfUnitsType }
             *     
             */
            public NumberOfUnitsType getSpurNumber() {
                return spurNumber;
            }

            /**
             * Sets the value of the spurNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumberOfUnitsType }
             *     
             */
            public void setSpurNumber(NumberOfUnitsType value) {
                this.spurNumber = value;
            }

            /**
             * Gets the value of the dummyEqn property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getDummyEqn() {
                return dummyEqn;
            }

            /**
             * Sets the value of the dummyEqn property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setDummyEqn(DummySegmentTypeI value) {
                this.dummyEqn = value;
            }

            /**
             * Gets the value of the legTimings property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the legTimings property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLegTimings().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StructuredDateTimeInformationType }
             * 
             * 
             */
            public List<StructuredDateTimeInformationType> getLegTimings() {
                if (legTimings == null) {
                    legTimings = new ArrayList<StructuredDateTimeInformationType>();
                }
                return this.legTimings;
            }

            /**
             * Gets the value of the delays property.
             * 
             * @return
             *     possible object is
             *     {@link QuantityType138305S }
             *     
             */
            public QuantityType138305S getDelays() {
                return delays;
            }

            /**
             * Sets the value of the delays property.
             * 
             * @param value
             *     allowed object is
             *     {@link QuantityType138305S }
             *     
             */
            public void setDelays(QuantityType138305S value) {
                this.delays = value;
            }

            /**
             * Gets the value of the elapsedPeriods property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the elapsedPeriods property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getElapsedPeriods().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NumberOfUnitsType122569S }
             * 
             * 
             */
            public List<NumberOfUnitsType122569S> getElapsedPeriods() {
                if (elapsedPeriods == null) {
                    elapsedPeriods = new ArrayList<NumberOfUnitsType122569S>();
                }
                return this.elapsedPeriods;
            }

            /**
             * Gets the value of the cabinInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.CabinInformation }
             * 
             * 
             */
            public List<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.CabinInformation> getCabinInformation() {
                if (cabinInformation == null) {
                    cabinInformation = new ArrayList<DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.CabinInformation>();
                }
                return this.cabinInformation;
            }

            /**
             * Gets the value of the acLocationTerminalDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.AcLocationTerminalDetails }
             *     
             */
            public DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.AcLocationTerminalDetails getAcLocationTerminalDetails() {
                return acLocationTerminalDetails;
            }

            /**
             * Sets the value of the acLocationTerminalDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.AcLocationTerminalDetails }
             *     
             */
            public void setAcLocationTerminalDetails(DCSLSTGetCheckInSummaryFiguresReply.FlightDetailsGroup.LegInformationGroup.AcLocationTerminalDetails value) {
                this.acLocationTerminalDetails = value;
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
             *         &lt;element name="arrivalDepartureOption" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}ActionIdentificationType"/>
             *         &lt;element name="aircraftLocation" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}TerminalLocationType"/>
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
                "arrivalDepartureOption",
                "aircraftLocation"
            })
            public static class AcLocationTerminalDetails {

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
             *         &lt;element name="aircraftConfiguration" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}EquipmentInformationTypeI"/>
             *         &lt;element name="cabinFigure" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType_122540S" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="freeSeatingIndicator" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}StatusType" minOccurs="0"/>
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
                "aircraftConfiguration",
                "cabinFigure",
                "freeSeatingIndicator"
            })
            public static class CabinInformation {

                @XmlElement(required = true)
                protected EquipmentInformationTypeI aircraftConfiguration;
                protected List<NumberOfUnitsType122540S> cabinFigure;
                protected StatusType freeSeatingIndicator;

                /**
                 * Gets the value of the aircraftConfiguration property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EquipmentInformationTypeI }
                 *     
                 */
                public EquipmentInformationTypeI getAircraftConfiguration() {
                    return aircraftConfiguration;
                }

                /**
                 * Sets the value of the aircraftConfiguration property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EquipmentInformationTypeI }
                 *     
                 */
                public void setAircraftConfiguration(EquipmentInformationTypeI value) {
                    this.aircraftConfiguration = value;
                }

                /**
                 * Gets the value of the cabinFigure property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cabinFigure property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCabinFigure().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link NumberOfUnitsType122540S }
                 * 
                 * 
                 */
                public List<NumberOfUnitsType122540S> getCabinFigure() {
                    if (cabinFigure == null) {
                        cabinFigure = new ArrayList<NumberOfUnitsType122540S>();
                    }
                    return this.cabinFigure;
                }

                /**
                 * Gets the value of the freeSeatingIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType }
                 *     
                 */
                public StatusType getFreeSeatingIndicator() {
                    return freeSeatingIndicator;
                }

                /**
                 * Sets the value of the freeSeatingIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType }
                 *     
                 */
                public void setFreeSeatingIndicator(StatusType value) {
                    this.freeSeatingIndicator = value;
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
         *         &lt;element name="preDefinedCommentNumber" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}NumberOfUnitsType"/>
         *         &lt;element name="preDefinedCommentText" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}FreeTextInformationType_199155S"/>
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
            "preDefinedCommentNumber",
            "preDefinedCommentText"
        })
        public static class PreDefinedComment {

            @XmlElement(required = true)
            protected NumberOfUnitsType preDefinedCommentNumber;
            @XmlElement(required = true)
            protected FreeTextInformationType199155S preDefinedCommentText;

            /**
             * Gets the value of the preDefinedCommentNumber property.
             * 
             * @return
             *     possible object is
             *     {@link NumberOfUnitsType }
             *     
             */
            public NumberOfUnitsType getPreDefinedCommentNumber() {
                return preDefinedCommentNumber;
            }

            /**
             * Sets the value of the preDefinedCommentNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumberOfUnitsType }
             *     
             */
            public void setPreDefinedCommentNumber(NumberOfUnitsType value) {
                this.preDefinedCommentNumber = value;
            }

            /**
             * Gets the value of the preDefinedCommentText property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType199155S }
             *     
             */
            public FreeTextInformationType199155S getPreDefinedCommentText() {
                return preDefinedCommentText;
            }

            /**
             * Sets the value of the preDefinedCommentText property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType199155S }
             *     
             */
            public void setPreDefinedCommentText(FreeTextInformationType199155S value) {
                this.preDefinedCommentText = value;
            }

        }

    }

}
