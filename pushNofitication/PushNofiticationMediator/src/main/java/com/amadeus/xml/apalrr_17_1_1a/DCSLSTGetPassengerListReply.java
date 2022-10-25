
package com.amadeus.xml.apalrr_17_1_1a;

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
 *         &lt;element name="errors" type="{http://xml.amadeus.com/APALRR_17_1_1A}ErrorGroupType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="querryFollowUp" type="{http://xml.amadeus.com/APALRR_17_1_1A}ActionDetailsTypeI" minOccurs="0"/>
 *         &lt;element name="orFiltersQuery" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dummy" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
 *                   &lt;element name="andFiltersQuery" type="{http://xml.amadeus.com/APALRR_17_1_1A}DCSLST_GetPassengerListReply_andFiltersQuery" maxOccurs="7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flightDetailsGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="legDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FlightDetailsResponseType_91290S"/>
 *                   &lt;element name="aircraftInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}EquipmentInformationType" minOccurs="0"/>
 *                   &lt;element name="flightStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="9"/>
 *                   &lt;element name="timeData" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S" maxOccurs="6" minOccurs="0"/>
 *                   &lt;element name="terminalInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}AirportNodeInformationType_395S" minOccurs="0"/>
 *                   &lt;element name="gate" type="{http://xml.amadeus.com/APALRR_17_1_1A}TerminalLocationType_78190S" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="acLocationTerminalDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}AircraftLocationDetailsType" minOccurs="0"/>
 *                   &lt;element name="flightRelatedComments" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_199155S" maxOccurs="999" minOccurs="0"/>
 *                   &lt;element name="flightMode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType" minOccurs="0"/>
 *                   &lt;element name="weightAllowance" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType" minOccurs="0"/>
 *                   &lt;element name="totalByCabin" maxOccurs="10" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cabin" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType"/>
 *                             &lt;element name="total" type="{http://xml.amadeus.com/APALRR_17_1_1A}NumberOfUnitsType" maxOccurs="2"/>
 *                             &lt;element name="cabinIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2"/>
 *                             &lt;element name="bookingClasses" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductInformationType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="linkElements" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="linkIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S"/>
 *                             &lt;element name="linkType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                             &lt;element name="linkProductIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" maxOccurs="99"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="baggageGroupDetails" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="baggageGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType"/>
 *                             &lt;element name="bagGroupId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
 *                             &lt;element name="groupProductIds" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" maxOccurs="999" minOccurs="0"/>
 *                             &lt;element name="excessBaggageDetails" maxOccurs="999" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="excessBaggageIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_184394S"/>
 *                                       &lt;element name="excessBaggageQuantity" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType_91586S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="baggageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                             &lt;element name="individualBags" maxOccurs="999">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="uniqueBagId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
 *                                       &lt;element name="bagRoutingOnCurrentFlight" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
 *                                       &lt;element name="bagStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="13"/>
 *                                       &lt;element name="securityScreeningInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160335S" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="baggageCheckInLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI_58502S" minOccurs="0"/>
 *                                       &lt;element name="specialBagDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiSpecialBagAttributeType" maxOccurs="30" minOccurs="0"/>
 *                                       &lt;element name="bagInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageInformationTypeI"/>
 *                                       &lt;element name="baggageCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="bagTagIssuanceDay" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_84049S" minOccurs="0"/>
 *                                       &lt;element name="physicalBaggageLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
 *                                       &lt;element name="bagRouting" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
 *                                       &lt;element name="irregularityCategories" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="baggageCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S" maxOccurs="4" minOccurs="0"/>
 *                                       &lt;element name="baggageLoadingDataGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageLoadDataGroupType" minOccurs="0"/>
 *                                       &lt;element name="otherflightInformation" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType_147123S"/>
 *                                                 &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
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
 *                   &lt;element name="customerLevel" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="customerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerInformationType"/>
 *                             &lt;element name="enhancedCustomerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}EnhancedTravellerInformationType" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="customerTitleRelatedData" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_92397S" minOccurs="0"/>
 *                             &lt;element name="fareFamily" type="{http://xml.amadeus.com/APALRR_17_1_1A}FareFamilyType" minOccurs="0"/>
 *                             &lt;element name="groupName" type="{http://xml.amadeus.com/APALRR_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                             &lt;element name="uniqueCustomerId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
 *                             &lt;element name="customerStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_206001S" maxOccurs="60" minOccurs="0"/>
 *                             &lt;element name="locationIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_205384S" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="statusReasonCodes" type="{http://xml.amadeus.com/APALRR_17_1_1A}ActionIdentificationType_125447S" minOccurs="0"/>
 *                             &lt;element name="manualSelecteeComment" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
 *                             &lt;element name="paxDateTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_195472S" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="purposeOfVisit" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecificDataInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="missingRegulatoryInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
 *                             &lt;element name="customerLevelAddresses" maxOccurs="2" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="addressDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}NameAndAddressBatchType"/>
 *                                       &lt;element name="addressQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_205424S"/>
 *                                       &lt;element name="addressDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="regulatoryInfo" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="travelerDocuments" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentMessageTypeU"/>
 *                                       &lt;element name="regLocationIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="regulatoryDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                                       &lt;element name="regDocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
 *                                       &lt;element name="passengerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerInformationType_91760S" minOccurs="0"/>
 *                                       &lt;element name="documentDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}DateTimePeriodType" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="portRegulatoryInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="documentPort" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_145572S"/>
 *                                                 &lt;element name="documentUsageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145573S" minOccurs="0"/>
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
 *                             &lt;element name="emergencyContactDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="contactInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerApiInformationType"/>
 *                                       &lt;element name="emergContactViewPermissions" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
 *                                       &lt;element name="emergencyContactComment" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="additionalPhoneEmail" type="{http://xml.amadeus.com/APALRR_17_1_1A}PhoneAndEmailAddressType" minOccurs="0"/>
 *                             &lt;element name="checkInInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
 *                             &lt;element name="nationality" type="{http://xml.amadeus.com/APALRR_17_1_1A}NationalityTypeU" minOccurs="0"/>
 *                             &lt;element name="productLevel" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="bookingData" type="{http://xml.amadeus.com/APALRR_17_1_1A}RelatedProductInformationTypeI"/>
 *                                       &lt;element name="productIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
 *                                       &lt;element name="compensationInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="compensationInfoViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
 *                                       &lt;element name="sbrRecordLocator" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="flightInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
 *                                       &lt;element name="ticketInformation" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="ticket" type="{http://xml.amadeus.com/APALRR_17_1_1A}TicketNumberType"/>
 *                                                 &lt;element name="eTicketInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}CouponInformationType" minOccurs="0"/>
 *                                                 &lt;element name="pricingInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
 *                                                 &lt;element name="creditCardFraudCheck" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="comments" type="{http://xml.amadeus.com/APALRR_17_1_1A}CommentsType" maxOccurs="99" minOccurs="0"/>
 *                                       &lt;element name="conformanceInfo" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="conformanceCheckLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType"/>
 *                                                 &lt;element name="personalMinuteAdjustment" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_142023S" minOccurs="0"/>
 *                                                 &lt;element name="conformanceCheckTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
 *                                                 &lt;element name="conformanceInfoAndChecks" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="iAppInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiiAppInformationType" maxOccurs="9" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="lastTrackingInformation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="lastTrackedLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}LongTextStringTypeI"/>
 *                                       &lt;element name="lastTrackedTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="secNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S" minOccurs="0"/>
 *                             &lt;element name="seatPreference" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160570S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="otherFlightInformation" maxOccurs="30" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
 *                                       &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                                       &lt;element name="acceptanceStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType" minOccurs="0"/>
 *                                       &lt;element name="operatingDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType" minOccurs="0"/>
 *                                       &lt;element name="cabinData" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType"/>
 *                                       &lt;element name="timeData" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S" maxOccurs="8" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="legCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
 *                             &lt;element name="customerStaffCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerPriorityDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="staffDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}StaffInfoType" minOccurs="0"/>
 *                             &lt;element name="dummy" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="regTravelerNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerApiInformationType_205420S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="bookedCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
 *                             &lt;element name="staffIDType" type="{http://xml.amadeus.com/APALRR_17_1_1A}InteractiveFreeTextTypeI_160341S" minOccurs="0"/>
 *                             &lt;element name="bagGroupId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
 *                             &lt;element name="customerBags" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType_195576S" minOccurs="0"/>
 *                             &lt;element name="finalDestination" type="{http://xml.amadeus.com/APALRR_17_1_1A}AirportNodeInformationType" minOccurs="0"/>
 *                             &lt;element name="ssrDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_195579S" maxOccurs="600" minOccurs="0"/>
 *                             &lt;element name="seatInformation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="seatStatusInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                                       &lt;element name="seatNumberInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_124026S" minOccurs="0"/>
 *                                       &lt;element name="chargeableSeatDelivered" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fqtvDetails" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="fqtvData" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationCodeType"/>
 *                                       &lt;element name="milesInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}MonetaryInformationType" minOccurs="0"/>
 *                                       &lt;element name="ftqvIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="vocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160336S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dummySTX" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="clidData" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationCodeType_176743S" minOccurs="0"/>
 *                             &lt;element name="crewDetailGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_176749S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="tocDetails" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tocConstant" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType"/>
 *                                       &lt;element name="bookingReferenceNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType"/>
 *                                       &lt;element name="tourOperatorCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyInformationType" maxOccurs="2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="trainSeatNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}RailSeatReferenceInformationType" minOccurs="0"/>
 *                             &lt;element name="boardingIneligibilityDetails" maxOccurs="20" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ineligibleBoardingCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="onloadPriority" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityTypeU" minOccurs="0"/>
 *                             &lt;element name="onloadCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
 *                             &lt;element name="dummySegment" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="regradePriority" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityTypeU" minOccurs="0"/>
 *                             &lt;element name="regradeCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
 *                             &lt;element name="staffHiringCompany" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransportIdentifierType" minOccurs="0"/>
 *                             &lt;element name="staffCompanyIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyInformationType_202330S" minOccurs="0"/>
 *                             &lt;element name="jumpSeatRequestStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
 *                             &lt;element name="staffdates" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_144425S" minOccurs="0"/>
 *                             &lt;element name="jssDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="dummy3" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="boardingZone" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType_206185S" minOccurs="0"/>
 *                             &lt;element name="bookedOperatingCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
 *                             &lt;element name="jumpSeatRanking" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityType" minOccurs="0"/>
 *                             &lt;element name="failedLinkRequests" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="failedLinkType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                                       &lt;element name="failedLinkId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S"/>
 *                                       &lt;element name="failureReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
 *                                       &lt;element name="linkRequestText" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="compensationVoucherDetails" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="providerCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransportIdentifierType_96070S"/>
 *                                       &lt;element name="voucherDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType_96073S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="voucherIssueDetails" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="voucherIssueReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_200612S"/>
 *                                       &lt;element name="furtherAuthorisationDetails" maxOccurs="99" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="numberOfVouchers" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_145974S"/>
 *                                                 &lt;element name="authorisingAgent" type="{http://xml.amadeus.com/APALRR_17_1_1A}UserIdentificationType" minOccurs="0"/>
 *                                                 &lt;element name="authorisedDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_145935S" minOccurs="0"/>
 *                                                 &lt;element name="authorisationStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
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
 *                             &lt;element name="cdtDetailsGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}CdtCustomerType" minOccurs="0"/>
 *                             &lt;element name="chargeableServices" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="chargeableSvcInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S"/>
 *                                       &lt;element name="chargeableSvcStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_184353S" maxOccurs="4" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="transferDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransferDetailsType" maxOccurs="20" minOccurs="0"/>
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
    "querryFollowUp",
    "orFiltersQuery",
    "flightDetailsGroup"
})
@XmlRootElement(name = "DCSLST_GetPassengerListReply")
public class DCSLSTGetPassengerListReply {

    protected List<ErrorGroupType> errors;
    protected ActionDetailsTypeI querryFollowUp;
    protected List<DCSLSTGetPassengerListReply.OrFiltersQuery> orFiltersQuery;
    protected DCSLSTGetPassengerListReply.FlightDetailsGroup flightDetailsGroup;

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
     * Gets the value of the querryFollowUp property.
     * 
     * @return
     *     possible object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public ActionDetailsTypeI getQuerryFollowUp() {
        return querryFollowUp;
    }

    /**
     * Sets the value of the querryFollowUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionDetailsTypeI }
     *     
     */
    public void setQuerryFollowUp(ActionDetailsTypeI value) {
        this.querryFollowUp = value;
    }

    /**
     * Gets the value of the orFiltersQuery property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orFiltersQuery property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrFiltersQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DCSLSTGetPassengerListReply.OrFiltersQuery }
     * 
     * 
     */
    public List<DCSLSTGetPassengerListReply.OrFiltersQuery> getOrFiltersQuery() {
        if (orFiltersQuery == null) {
            orFiltersQuery = new ArrayList<DCSLSTGetPassengerListReply.OrFiltersQuery>();
        }
        return this.orFiltersQuery;
    }

    /**
     * Gets the value of the flightDetailsGroup property.
     * 
     * @return
     *     possible object is
     *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup }
     *     
     */
    public DCSLSTGetPassengerListReply.FlightDetailsGroup getFlightDetailsGroup() {
        return flightDetailsGroup;
    }

    /**
     * Sets the value of the flightDetailsGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup }
     *     
     */
    public void setFlightDetailsGroup(DCSLSTGetPassengerListReply.FlightDetailsGroup value) {
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
     *         &lt;element name="legDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FlightDetailsResponseType_91290S"/>
     *         &lt;element name="aircraftInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}EquipmentInformationType" minOccurs="0"/>
     *         &lt;element name="flightStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="9"/>
     *         &lt;element name="timeData" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S" maxOccurs="6" minOccurs="0"/>
     *         &lt;element name="terminalInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}AirportNodeInformationType_395S" minOccurs="0"/>
     *         &lt;element name="gate" type="{http://xml.amadeus.com/APALRR_17_1_1A}TerminalLocationType_78190S" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="acLocationTerminalDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}AircraftLocationDetailsType" minOccurs="0"/>
     *         &lt;element name="flightRelatedComments" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_199155S" maxOccurs="999" minOccurs="0"/>
     *         &lt;element name="flightMode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType" minOccurs="0"/>
     *         &lt;element name="weightAllowance" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType" minOccurs="0"/>
     *         &lt;element name="totalByCabin" maxOccurs="10" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cabin" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType"/>
     *                   &lt;element name="total" type="{http://xml.amadeus.com/APALRR_17_1_1A}NumberOfUnitsType" maxOccurs="2"/>
     *                   &lt;element name="cabinIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2"/>
     *                   &lt;element name="bookingClasses" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductInformationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="linkElements" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="linkIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S"/>
     *                   &lt;element name="linkType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                   &lt;element name="linkProductIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="baggageGroupDetails" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="baggageGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType"/>
     *                   &lt;element name="bagGroupId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
     *                   &lt;element name="groupProductIds" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" maxOccurs="999" minOccurs="0"/>
     *                   &lt;element name="excessBaggageDetails" maxOccurs="999" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="excessBaggageIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_184394S"/>
     *                             &lt;element name="excessBaggageQuantity" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType_91586S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="baggageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                   &lt;element name="individualBags" maxOccurs="999">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="uniqueBagId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
     *                             &lt;element name="bagRoutingOnCurrentFlight" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
     *                             &lt;element name="bagStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="13"/>
     *                             &lt;element name="securityScreeningInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160335S" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="baggageCheckInLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI_58502S" minOccurs="0"/>
     *                             &lt;element name="specialBagDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiSpecialBagAttributeType" maxOccurs="30" minOccurs="0"/>
     *                             &lt;element name="bagInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageInformationTypeI"/>
     *                             &lt;element name="baggageCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="bagTagIssuanceDay" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_84049S" minOccurs="0"/>
     *                             &lt;element name="physicalBaggageLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
     *                             &lt;element name="bagRouting" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
     *                             &lt;element name="irregularityCategories" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="baggageCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S" maxOccurs="4" minOccurs="0"/>
     *                             &lt;element name="baggageLoadingDataGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageLoadDataGroupType" minOccurs="0"/>
     *                             &lt;element name="otherflightInformation" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType_147123S"/>
     *                                       &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
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
     *         &lt;element name="customerLevel" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="customerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerInformationType"/>
     *                   &lt;element name="enhancedCustomerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}EnhancedTravellerInformationType" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="customerTitleRelatedData" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_92397S" minOccurs="0"/>
     *                   &lt;element name="fareFamily" type="{http://xml.amadeus.com/APALRR_17_1_1A}FareFamilyType" minOccurs="0"/>
     *                   &lt;element name="groupName" type="{http://xml.amadeus.com/APALRR_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                   &lt;element name="uniqueCustomerId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
     *                   &lt;element name="customerStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_206001S" maxOccurs="60" minOccurs="0"/>
     *                   &lt;element name="locationIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_205384S" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="statusReasonCodes" type="{http://xml.amadeus.com/APALRR_17_1_1A}ActionIdentificationType_125447S" minOccurs="0"/>
     *                   &lt;element name="manualSelecteeComment" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
     *                   &lt;element name="paxDateTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_195472S" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="purposeOfVisit" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecificDataInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="missingRegulatoryInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
     *                   &lt;element name="customerLevelAddresses" maxOccurs="2" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="addressDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}NameAndAddressBatchType"/>
     *                             &lt;element name="addressQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_205424S"/>
     *                             &lt;element name="addressDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="regulatoryInfo" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="travelerDocuments" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentMessageTypeU"/>
     *                             &lt;element name="regLocationIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="regulatoryDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                             &lt;element name="regDocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
     *                             &lt;element name="passengerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerInformationType_91760S" minOccurs="0"/>
     *                             &lt;element name="documentDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}DateTimePeriodType" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="portRegulatoryInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="documentPort" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_145572S"/>
     *                                       &lt;element name="documentUsageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145573S" minOccurs="0"/>
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
     *                   &lt;element name="emergencyContactDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="contactInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerApiInformationType"/>
     *                             &lt;element name="emergContactViewPermissions" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
     *                             &lt;element name="emergencyContactComment" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="additionalPhoneEmail" type="{http://xml.amadeus.com/APALRR_17_1_1A}PhoneAndEmailAddressType" minOccurs="0"/>
     *                   &lt;element name="checkInInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
     *                   &lt;element name="nationality" type="{http://xml.amadeus.com/APALRR_17_1_1A}NationalityTypeU" minOccurs="0"/>
     *                   &lt;element name="productLevel" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="bookingData" type="{http://xml.amadeus.com/APALRR_17_1_1A}RelatedProductInformationTypeI"/>
     *                             &lt;element name="productIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
     *                             &lt;element name="compensationInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="compensationInfoViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
     *                             &lt;element name="sbrRecordLocator" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="flightInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
     *                             &lt;element name="ticketInformation" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="ticket" type="{http://xml.amadeus.com/APALRR_17_1_1A}TicketNumberType"/>
     *                                       &lt;element name="eTicketInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}CouponInformationType" minOccurs="0"/>
     *                                       &lt;element name="pricingInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
     *                                       &lt;element name="creditCardFraudCheck" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="comments" type="{http://xml.amadeus.com/APALRR_17_1_1A}CommentsType" maxOccurs="99" minOccurs="0"/>
     *                             &lt;element name="conformanceInfo" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="conformanceCheckLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType"/>
     *                                       &lt;element name="personalMinuteAdjustment" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_142023S" minOccurs="0"/>
     *                                       &lt;element name="conformanceCheckTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
     *                                       &lt;element name="conformanceInfoAndChecks" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="iAppInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiiAppInformationType" maxOccurs="9" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="lastTrackingInformation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="lastTrackedLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}LongTextStringTypeI"/>
     *                             &lt;element name="lastTrackedTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="secNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S" minOccurs="0"/>
     *                   &lt;element name="seatPreference" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160570S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="otherFlightInformation" maxOccurs="30" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
     *                             &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                             &lt;element name="acceptanceStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType" minOccurs="0"/>
     *                             &lt;element name="operatingDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType" minOccurs="0"/>
     *                             &lt;element name="cabinData" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType"/>
     *                             &lt;element name="timeData" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S" maxOccurs="8" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="legCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
     *                   &lt;element name="customerStaffCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerPriorityDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="staffDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}StaffInfoType" minOccurs="0"/>
     *                   &lt;element name="dummy" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="regTravelerNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerApiInformationType_205420S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="bookedCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
     *                   &lt;element name="staffIDType" type="{http://xml.amadeus.com/APALRR_17_1_1A}InteractiveFreeTextTypeI_160341S" minOccurs="0"/>
     *                   &lt;element name="bagGroupId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
     *                   &lt;element name="customerBags" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType_195576S" minOccurs="0"/>
     *                   &lt;element name="finalDestination" type="{http://xml.amadeus.com/APALRR_17_1_1A}AirportNodeInformationType" minOccurs="0"/>
     *                   &lt;element name="ssrDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_195579S" maxOccurs="600" minOccurs="0"/>
     *                   &lt;element name="seatInformation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="seatStatusInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                             &lt;element name="seatNumberInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_124026S" minOccurs="0"/>
     *                             &lt;element name="chargeableSeatDelivered" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fqtvDetails" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="fqtvData" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationCodeType"/>
     *                             &lt;element name="milesInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}MonetaryInformationType" minOccurs="0"/>
     *                             &lt;element name="ftqvIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="vocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160336S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dummySTX" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="clidData" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationCodeType_176743S" minOccurs="0"/>
     *                   &lt;element name="crewDetailGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_176749S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="tocDetails" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tocConstant" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType"/>
     *                             &lt;element name="bookingReferenceNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType"/>
     *                             &lt;element name="tourOperatorCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyInformationType" maxOccurs="2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="trainSeatNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}RailSeatReferenceInformationType" minOccurs="0"/>
     *                   &lt;element name="boardingIneligibilityDetails" maxOccurs="20" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ineligibleBoardingCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="onloadPriority" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityTypeU" minOccurs="0"/>
     *                   &lt;element name="onloadCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
     *                   &lt;element name="dummySegment" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="regradePriority" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityTypeU" minOccurs="0"/>
     *                   &lt;element name="regradeCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
     *                   &lt;element name="staffHiringCompany" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransportIdentifierType" minOccurs="0"/>
     *                   &lt;element name="staffCompanyIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyInformationType_202330S" minOccurs="0"/>
     *                   &lt;element name="jumpSeatRequestStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
     *                   &lt;element name="staffdates" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_144425S" minOccurs="0"/>
     *                   &lt;element name="jssDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="dummy3" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="boardingZone" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType_206185S" minOccurs="0"/>
     *                   &lt;element name="bookedOperatingCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
     *                   &lt;element name="jumpSeatRanking" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityType" minOccurs="0"/>
     *                   &lt;element name="failedLinkRequests" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="failedLinkType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                             &lt;element name="failedLinkId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S"/>
     *                             &lt;element name="failureReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
     *                             &lt;element name="linkRequestText" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="compensationVoucherDetails" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="providerCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransportIdentifierType_96070S"/>
     *                             &lt;element name="voucherDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType_96073S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="voucherIssueDetails" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="voucherIssueReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_200612S"/>
     *                             &lt;element name="furtherAuthorisationDetails" maxOccurs="99" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="numberOfVouchers" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_145974S"/>
     *                                       &lt;element name="authorisingAgent" type="{http://xml.amadeus.com/APALRR_17_1_1A}UserIdentificationType" minOccurs="0"/>
     *                                       &lt;element name="authorisedDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_145935S" minOccurs="0"/>
     *                                       &lt;element name="authorisationStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
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
     *                   &lt;element name="cdtDetailsGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}CdtCustomerType" minOccurs="0"/>
     *                   &lt;element name="chargeableServices" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="chargeableSvcInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S"/>
     *                             &lt;element name="chargeableSvcStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_184353S" maxOccurs="4" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="transferDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransferDetailsType" maxOccurs="20" minOccurs="0"/>
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
        "legDetails",
        "aircraftInformation",
        "flightStatus",
        "timeData",
        "terminalInfo",
        "gate",
        "acLocationTerminalDetails",
        "flightRelatedComments",
        "flightMode",
        "weightAllowance",
        "totalByCabin",
        "linkElements",
        "baggageGroupDetails",
        "customerLevel"
    })
    public static class FlightDetailsGroup {

        @XmlElement(required = true)
        protected FlightDetailsResponseType91290S legDetails;
        protected EquipmentInformationType aircraftInformation;
        @XmlElement(required = true)
        protected List<StatusType129946S> flightStatus;
        protected List<StructuredDateTimeInformationType78177S> timeData;
        protected AirportNodeInformationType395S terminalInfo;
        protected List<TerminalLocationType78190S> gate;
        protected AircraftLocationDetailsType acLocationTerminalDetails;
        protected List<FreeTextInformationType199155S> flightRelatedComments;
        protected CodedAttributeType flightMode;
        protected QuantityType weightAllowance;
        protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.TotalByCabin> totalByCabin;
        protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.LinkElements> linkElements;
        protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails> baggageGroupDetails;
        protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel> customerLevel;

        /**
         * Gets the value of the legDetails property.
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsResponseType91290S }
         *     
         */
        public FlightDetailsResponseType91290S getLegDetails() {
            return legDetails;
        }

        /**
         * Sets the value of the legDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsResponseType91290S }
         *     
         */
        public void setLegDetails(FlightDetailsResponseType91290S value) {
            this.legDetails = value;
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
         * {@link StatusType129946S }
         * 
         * 
         */
        public List<StatusType129946S> getFlightStatus() {
            if (flightStatus == null) {
                flightStatus = new ArrayList<StatusType129946S>();
            }
            return this.flightStatus;
        }

        /**
         * Gets the value of the timeData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the timeData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTimeData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StructuredDateTimeInformationType78177S }
         * 
         * 
         */
        public List<StructuredDateTimeInformationType78177S> getTimeData() {
            if (timeData == null) {
                timeData = new ArrayList<StructuredDateTimeInformationType78177S>();
            }
            return this.timeData;
        }

        /**
         * Gets the value of the terminalInfo property.
         * 
         * @return
         *     possible object is
         *     {@link AirportNodeInformationType395S }
         *     
         */
        public AirportNodeInformationType395S getTerminalInfo() {
            return terminalInfo;
        }

        /**
         * Sets the value of the terminalInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirportNodeInformationType395S }
         *     
         */
        public void setTerminalInfo(AirportNodeInformationType395S value) {
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
         * {@link TerminalLocationType78190S }
         * 
         * 
         */
        public List<TerminalLocationType78190S> getGate() {
            if (gate == null) {
                gate = new ArrayList<TerminalLocationType78190S>();
            }
            return this.gate;
        }

        /**
         * Gets the value of the acLocationTerminalDetails property.
         * 
         * @return
         *     possible object is
         *     {@link AircraftLocationDetailsType }
         *     
         */
        public AircraftLocationDetailsType getAcLocationTerminalDetails() {
            return acLocationTerminalDetails;
        }

        /**
         * Sets the value of the acLocationTerminalDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link AircraftLocationDetailsType }
         *     
         */
        public void setAcLocationTerminalDetails(AircraftLocationDetailsType value) {
            this.acLocationTerminalDetails = value;
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
         * {@link FreeTextInformationType199155S }
         * 
         * 
         */
        public List<FreeTextInformationType199155S> getFlightRelatedComments() {
            if (flightRelatedComments == null) {
                flightRelatedComments = new ArrayList<FreeTextInformationType199155S>();
            }
            return this.flightRelatedComments;
        }

        /**
         * Gets the value of the flightMode property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType }
         *     
         */
        public CodedAttributeType getFlightMode() {
            return flightMode;
        }

        /**
         * Sets the value of the flightMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType }
         *     
         */
        public void setFlightMode(CodedAttributeType value) {
            this.flightMode = value;
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
         * Gets the value of the totalByCabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the totalByCabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTotalByCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.TotalByCabin }
         * 
         * 
         */
        public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.TotalByCabin> getTotalByCabin() {
            if (totalByCabin == null) {
                totalByCabin = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.TotalByCabin>();
            }
            return this.totalByCabin;
        }

        /**
         * Gets the value of the linkElements property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the linkElements property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLinkElements().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.LinkElements }
         * 
         * 
         */
        public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.LinkElements> getLinkElements() {
            if (linkElements == null) {
                linkElements = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.LinkElements>();
            }
            return this.linkElements;
        }

        /**
         * Gets the value of the baggageGroupDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageGroupDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageGroupDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails }
         * 
         * 
         */
        public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails> getBaggageGroupDetails() {
            if (baggageGroupDetails == null) {
                baggageGroupDetails = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails>();
            }
            return this.baggageGroupDetails;
        }

        /**
         * Gets the value of the customerLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customerLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomerLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel }
         * 
         * 
         */
        public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel> getCustomerLevel() {
            if (customerLevel == null) {
                customerLevel = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel>();
            }
            return this.customerLevel;
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
         *         &lt;element name="baggageGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType"/>
         *         &lt;element name="bagGroupId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
         *         &lt;element name="groupProductIds" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" maxOccurs="999" minOccurs="0"/>
         *         &lt;element name="excessBaggageDetails" maxOccurs="999" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="excessBaggageIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_184394S"/>
         *                   &lt;element name="excessBaggageQuantity" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType_91586S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="baggageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *         &lt;element name="individualBags" maxOccurs="999">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="uniqueBagId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
         *                   &lt;element name="bagRoutingOnCurrentFlight" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
         *                   &lt;element name="bagStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="13"/>
         *                   &lt;element name="securityScreeningInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160335S" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="baggageCheckInLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI_58502S" minOccurs="0"/>
         *                   &lt;element name="specialBagDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiSpecialBagAttributeType" maxOccurs="30" minOccurs="0"/>
         *                   &lt;element name="bagInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageInformationTypeI"/>
         *                   &lt;element name="baggageCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="bagTagIssuanceDay" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_84049S" minOccurs="0"/>
         *                   &lt;element name="physicalBaggageLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
         *                   &lt;element name="bagRouting" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
         *                   &lt;element name="irregularityCategories" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="baggageCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S" maxOccurs="4" minOccurs="0"/>
         *                   &lt;element name="baggageLoadingDataGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageLoadDataGroupType" minOccurs="0"/>
         *                   &lt;element name="otherflightInformation" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType_147123S"/>
         *                             &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
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
            "baggageGroup",
            "bagGroupId",
            "groupProductIds",
            "excessBaggageDetails",
            "baggageType",
            "individualBags"
        })
        public static class BaggageGroupDetails {

            @XmlElement(required = true)
            protected PassengerBaggageInformationType baggageGroup;
            @XmlElement(required = true)
            protected ItemReferencesAndVersionsType bagGroupId;
            protected List<ItemReferencesAndVersionsType> groupProductIds;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.ExcessBaggageDetails> excessBaggageDetails;
            @XmlElement(required = true)
            protected StatusType129946S baggageType;
            @XmlElement(required = true)
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags> individualBags;

            /**
             * Gets the value of the baggageGroup property.
             * 
             * @return
             *     possible object is
             *     {@link PassengerBaggageInformationType }
             *     
             */
            public PassengerBaggageInformationType getBaggageGroup() {
                return baggageGroup;
            }

            /**
             * Sets the value of the baggageGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link PassengerBaggageInformationType }
             *     
             */
            public void setBaggageGroup(PassengerBaggageInformationType value) {
                this.baggageGroup = value;
            }

            /**
             * Gets the value of the bagGroupId property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public ItemReferencesAndVersionsType getBagGroupId() {
                return bagGroupId;
            }

            /**
             * Sets the value of the bagGroupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public void setBagGroupId(ItemReferencesAndVersionsType value) {
                this.bagGroupId = value;
            }

            /**
             * Gets the value of the groupProductIds property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the groupProductIds property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGroupProductIds().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemReferencesAndVersionsType }
             * 
             * 
             */
            public List<ItemReferencesAndVersionsType> getGroupProductIds() {
                if (groupProductIds == null) {
                    groupProductIds = new ArrayList<ItemReferencesAndVersionsType>();
                }
                return this.groupProductIds;
            }

            /**
             * Gets the value of the excessBaggageDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the excessBaggageDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getExcessBaggageDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.ExcessBaggageDetails }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.ExcessBaggageDetails> getExcessBaggageDetails() {
                if (excessBaggageDetails == null) {
                    excessBaggageDetails = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.ExcessBaggageDetails>();
                }
                return this.excessBaggageDetails;
            }

            /**
             * Gets the value of the baggageType property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType129946S }
             *     
             */
            public StatusType129946S getBaggageType() {
                return baggageType;
            }

            /**
             * Sets the value of the baggageType property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType129946S }
             *     
             */
            public void setBaggageType(StatusType129946S value) {
                this.baggageType = value;
            }

            /**
             * Gets the value of the individualBags property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the individualBags property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIndividualBags().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags> getIndividualBags() {
                if (individualBags == null) {
                    individualBags = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags>();
                }
                return this.individualBags;
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
             *         &lt;element name="excessBaggageIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_184394S"/>
             *         &lt;element name="excessBaggageQuantity" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType_91586S" minOccurs="0"/>
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
                "excessBaggageIndicator",
                "excessBaggageQuantity"
            })
            public static class ExcessBaggageDetails {

                @XmlElement(required = true)
                protected CodedAttributeType184394S excessBaggageIndicator;
                protected PassengerBaggageInformationType91586S excessBaggageQuantity;

                /**
                 * Gets the value of the excessBaggageIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodedAttributeType184394S }
                 *     
                 */
                public CodedAttributeType184394S getExcessBaggageIndicator() {
                    return excessBaggageIndicator;
                }

                /**
                 * Sets the value of the excessBaggageIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodedAttributeType184394S }
                 *     
                 */
                public void setExcessBaggageIndicator(CodedAttributeType184394S value) {
                    this.excessBaggageIndicator = value;
                }

                /**
                 * Gets the value of the excessBaggageQuantity property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PassengerBaggageInformationType91586S }
                 *     
                 */
                public PassengerBaggageInformationType91586S getExcessBaggageQuantity() {
                    return excessBaggageQuantity;
                }

                /**
                 * Sets the value of the excessBaggageQuantity property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PassengerBaggageInformationType91586S }
                 *     
                 */
                public void setExcessBaggageQuantity(PassengerBaggageInformationType91586S value) {
                    this.excessBaggageQuantity = value;
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
             *         &lt;element name="uniqueBagId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
             *         &lt;element name="bagRoutingOnCurrentFlight" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
             *         &lt;element name="bagStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="13"/>
             *         &lt;element name="securityScreeningInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160335S" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="baggageCheckInLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI_58502S" minOccurs="0"/>
             *         &lt;element name="specialBagDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiSpecialBagAttributeType" maxOccurs="30" minOccurs="0"/>
             *         &lt;element name="bagInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageInformationTypeI"/>
             *         &lt;element name="baggageCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInformationTypeI" minOccurs="0"/>
             *         &lt;element name="bagTagIssuanceDay" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_84049S" minOccurs="0"/>
             *         &lt;element name="physicalBaggageLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
             *         &lt;element name="bagRouting" type="{http://xml.amadeus.com/APALRR_17_1_1A}OriginAndDestinationDetailsTypeI" minOccurs="0"/>
             *         &lt;element name="irregularityCategories" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="baggageCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S" maxOccurs="4" minOccurs="0"/>
             *         &lt;element name="baggageLoadingDataGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}BaggageLoadDataGroupType" minOccurs="0"/>
             *         &lt;element name="otherflightInformation" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType_147123S"/>
             *                   &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
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
                "uniqueBagId",
                "bagRoutingOnCurrentFlight",
                "bagStatus",
                "securityScreeningInfo",
                "baggageCheckInLocation",
                "specialBagDetails",
                "bagInformation",
                "baggageCategory",
                "bagTagIssuanceDay",
                "physicalBaggageLocation",
                "bagRouting",
                "irregularityCategories",
                "baggageCode",
                "baggageLoadingDataGroup",
                "otherflightInformation"
            })
            public static class IndividualBags {

                @XmlElement(required = true)
                protected ItemReferencesAndVersionsType uniqueBagId;
                protected OriginAndDestinationDetailsTypeI bagRoutingOnCurrentFlight;
                @XmlElement(required = true)
                protected List<StatusType129946S> bagStatus;
                protected List<FreeTextInformationType160335S> securityScreeningInfo;
                protected OriginAndDestinationDetailsTypeI58502S baggageCheckInLocation;
                protected List<EdiSpecialBagAttributeType> specialBagDetails;
                @XmlElement(required = true)
                protected BaggageInformationTypeI bagInformation;
                protected ReferenceInformationTypeI baggageCategory;
                protected QuantityType84049S bagTagIssuanceDay;
                protected FreeTextInformationType160568S physicalBaggageLocation;
                protected OriginAndDestinationDetailsTypeI bagRouting;
                protected List<StatusType129946S> irregularityCategories;
                protected List<SpecialRequirementsDetailsType160611S> baggageCode;
                protected BaggageLoadDataGroupType baggageLoadingDataGroup;
                protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags.OtherflightInformation> otherflightInformation;

                /**
                 * Gets the value of the uniqueBagId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemReferencesAndVersionsType }
                 *     
                 */
                public ItemReferencesAndVersionsType getUniqueBagId() {
                    return uniqueBagId;
                }

                /**
                 * Sets the value of the uniqueBagId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemReferencesAndVersionsType }
                 *     
                 */
                public void setUniqueBagId(ItemReferencesAndVersionsType value) {
                    this.uniqueBagId = value;
                }

                /**
                 * Gets the value of the bagRoutingOnCurrentFlight property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginAndDestinationDetailsTypeI }
                 *     
                 */
                public OriginAndDestinationDetailsTypeI getBagRoutingOnCurrentFlight() {
                    return bagRoutingOnCurrentFlight;
                }

                /**
                 * Sets the value of the bagRoutingOnCurrentFlight property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginAndDestinationDetailsTypeI }
                 *     
                 */
                public void setBagRoutingOnCurrentFlight(OriginAndDestinationDetailsTypeI value) {
                    this.bagRoutingOnCurrentFlight = value;
                }

                /**
                 * Gets the value of the bagStatus property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the bagStatus property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBagStatus().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StatusType129946S }
                 * 
                 * 
                 */
                public List<StatusType129946S> getBagStatus() {
                    if (bagStatus == null) {
                        bagStatus = new ArrayList<StatusType129946S>();
                    }
                    return this.bagStatus;
                }

                /**
                 * Gets the value of the securityScreeningInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the securityScreeningInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSecurityScreeningInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FreeTextInformationType160335S }
                 * 
                 * 
                 */
                public List<FreeTextInformationType160335S> getSecurityScreeningInfo() {
                    if (securityScreeningInfo == null) {
                        securityScreeningInfo = new ArrayList<FreeTextInformationType160335S>();
                    }
                    return this.securityScreeningInfo;
                }

                /**
                 * Gets the value of the baggageCheckInLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginAndDestinationDetailsTypeI58502S }
                 *     
                 */
                public OriginAndDestinationDetailsTypeI58502S getBaggageCheckInLocation() {
                    return baggageCheckInLocation;
                }

                /**
                 * Sets the value of the baggageCheckInLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginAndDestinationDetailsTypeI58502S }
                 *     
                 */
                public void setBaggageCheckInLocation(OriginAndDestinationDetailsTypeI58502S value) {
                    this.baggageCheckInLocation = value;
                }

                /**
                 * Gets the value of the specialBagDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the specialBagDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSpecialBagDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EdiSpecialBagAttributeType }
                 * 
                 * 
                 */
                public List<EdiSpecialBagAttributeType> getSpecialBagDetails() {
                    if (specialBagDetails == null) {
                        specialBagDetails = new ArrayList<EdiSpecialBagAttributeType>();
                    }
                    return this.specialBagDetails;
                }

                /**
                 * Gets the value of the bagInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaggageInformationTypeI }
                 *     
                 */
                public BaggageInformationTypeI getBagInformation() {
                    return bagInformation;
                }

                /**
                 * Sets the value of the bagInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaggageInformationTypeI }
                 *     
                 */
                public void setBagInformation(BaggageInformationTypeI value) {
                    this.bagInformation = value;
                }

                /**
                 * Gets the value of the baggageCategory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInformationTypeI }
                 *     
                 */
                public ReferenceInformationTypeI getBaggageCategory() {
                    return baggageCategory;
                }

                /**
                 * Sets the value of the baggageCategory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInformationTypeI }
                 *     
                 */
                public void setBaggageCategory(ReferenceInformationTypeI value) {
                    this.baggageCategory = value;
                }

                /**
                 * Gets the value of the bagTagIssuanceDay property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuantityType84049S }
                 *     
                 */
                public QuantityType84049S getBagTagIssuanceDay() {
                    return bagTagIssuanceDay;
                }

                /**
                 * Sets the value of the bagTagIssuanceDay property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuantityType84049S }
                 *     
                 */
                public void setBagTagIssuanceDay(QuantityType84049S value) {
                    this.bagTagIssuanceDay = value;
                }

                /**
                 * Gets the value of the physicalBaggageLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType160568S }
                 *     
                 */
                public FreeTextInformationType160568S getPhysicalBaggageLocation() {
                    return physicalBaggageLocation;
                }

                /**
                 * Sets the value of the physicalBaggageLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType160568S }
                 *     
                 */
                public void setPhysicalBaggageLocation(FreeTextInformationType160568S value) {
                    this.physicalBaggageLocation = value;
                }

                /**
                 * Gets the value of the bagRouting property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginAndDestinationDetailsTypeI }
                 *     
                 */
                public OriginAndDestinationDetailsTypeI getBagRouting() {
                    return bagRouting;
                }

                /**
                 * Sets the value of the bagRouting property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginAndDestinationDetailsTypeI }
                 *     
                 */
                public void setBagRouting(OriginAndDestinationDetailsTypeI value) {
                    this.bagRouting = value;
                }

                /**
                 * Gets the value of the irregularityCategories property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the irregularityCategories property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIrregularityCategories().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StatusType129946S }
                 * 
                 * 
                 */
                public List<StatusType129946S> getIrregularityCategories() {
                    if (irregularityCategories == null) {
                        irregularityCategories = new ArrayList<StatusType129946S>();
                    }
                    return this.irregularityCategories;
                }

                /**
                 * Gets the value of the baggageCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the baggageCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBaggageCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SpecialRequirementsDetailsType160611S }
                 * 
                 * 
                 */
                public List<SpecialRequirementsDetailsType160611S> getBaggageCode() {
                    if (baggageCode == null) {
                        baggageCode = new ArrayList<SpecialRequirementsDetailsType160611S>();
                    }
                    return this.baggageCode;
                }

                /**
                 * Gets the value of the baggageLoadingDataGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BaggageLoadDataGroupType }
                 *     
                 */
                public BaggageLoadDataGroupType getBaggageLoadingDataGroup() {
                    return baggageLoadingDataGroup;
                }

                /**
                 * Sets the value of the baggageLoadingDataGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BaggageLoadDataGroupType }
                 *     
                 */
                public void setBaggageLoadingDataGroup(BaggageLoadDataGroupType value) {
                    this.baggageLoadingDataGroup = value;
                }

                /**
                 * Gets the value of the otherflightInformation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the otherflightInformation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getOtherflightInformation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags.OtherflightInformation }
                 * 
                 * 
                 */
                public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags.OtherflightInformation> getOtherflightInformation() {
                    if (otherflightInformation == null) {
                        otherflightInformation = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.BaggageGroupDetails.IndividualBags.OtherflightInformation>();
                    }
                    return this.otherflightInformation;
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
                 *         &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType_147123S"/>
                 *         &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
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
                    "otherFlightData",
                    "flightTypeIndicator"
                })
                public static class OtherflightInformation {

                    @XmlElement(required = true)
                    protected TravelProductInformationType147123S otherFlightData;
                    @XmlElement(required = true)
                    protected StatusType129946S flightTypeIndicator;

                    /**
                     * Gets the value of the otherFlightData property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TravelProductInformationType147123S }
                     *     
                     */
                    public TravelProductInformationType147123S getOtherFlightData() {
                        return otherFlightData;
                    }

                    /**
                     * Sets the value of the otherFlightData property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TravelProductInformationType147123S }
                     *     
                     */
                    public void setOtherFlightData(TravelProductInformationType147123S value) {
                        this.otherFlightData = value;
                    }

                    /**
                     * Gets the value of the flightTypeIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StatusType129946S }
                     *     
                     */
                    public StatusType129946S getFlightTypeIndicator() {
                        return flightTypeIndicator;
                    }

                    /**
                     * Sets the value of the flightTypeIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StatusType129946S }
                     *     
                     */
                    public void setFlightTypeIndicator(StatusType129946S value) {
                        this.flightTypeIndicator = value;
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
         *         &lt;element name="customerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerInformationType"/>
         *         &lt;element name="enhancedCustomerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}EnhancedTravellerInformationType" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="customerTitleRelatedData" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_92397S" minOccurs="0"/>
         *         &lt;element name="fareFamily" type="{http://xml.amadeus.com/APALRR_17_1_1A}FareFamilyType" minOccurs="0"/>
         *         &lt;element name="groupName" type="{http://xml.amadeus.com/APALRR_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
         *         &lt;element name="uniqueCustomerId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
         *         &lt;element name="customerStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_206001S" maxOccurs="60" minOccurs="0"/>
         *         &lt;element name="locationIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_205384S" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="statusReasonCodes" type="{http://xml.amadeus.com/APALRR_17_1_1A}ActionIdentificationType_125447S" minOccurs="0"/>
         *         &lt;element name="manualSelecteeComment" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
         *         &lt;element name="paxDateTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_195472S" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="purposeOfVisit" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecificDataInformationTypeI" minOccurs="0"/>
         *         &lt;element name="missingRegulatoryInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInformationType" maxOccurs="99" minOccurs="0"/>
         *         &lt;element name="customerLevelAddresses" maxOccurs="2" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="addressDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}NameAndAddressBatchType"/>
         *                   &lt;element name="addressQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_205424S"/>
         *                   &lt;element name="addressDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="regulatoryInfo" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="travelerDocuments" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentMessageTypeU"/>
         *                   &lt;element name="regLocationIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="regulatoryDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *                   &lt;element name="regDocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
         *                   &lt;element name="passengerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerInformationType_91760S" minOccurs="0"/>
         *                   &lt;element name="documentDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}DateTimePeriodType" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="portRegulatoryInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="documentPort" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_145572S"/>
         *                             &lt;element name="documentUsageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145573S" minOccurs="0"/>
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
         *         &lt;element name="emergencyContactDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="contactInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerApiInformationType"/>
         *                   &lt;element name="emergContactViewPermissions" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
         *                   &lt;element name="emergencyContactComment" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="additionalPhoneEmail" type="{http://xml.amadeus.com/APALRR_17_1_1A}PhoneAndEmailAddressType" minOccurs="0"/>
         *         &lt;element name="checkInInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
         *         &lt;element name="nationality" type="{http://xml.amadeus.com/APALRR_17_1_1A}NationalityTypeU" minOccurs="0"/>
         *         &lt;element name="productLevel" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="bookingData" type="{http://xml.amadeus.com/APALRR_17_1_1A}RelatedProductInformationTypeI"/>
         *                   &lt;element name="productIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
         *                   &lt;element name="compensationInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="compensationInfoViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
         *                   &lt;element name="sbrRecordLocator" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="flightInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
         *                   &lt;element name="ticketInformation" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="ticket" type="{http://xml.amadeus.com/APALRR_17_1_1A}TicketNumberType"/>
         *                             &lt;element name="eTicketInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}CouponInformationType" minOccurs="0"/>
         *                             &lt;element name="pricingInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
         *                             &lt;element name="creditCardFraudCheck" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="comments" type="{http://xml.amadeus.com/APALRR_17_1_1A}CommentsType" maxOccurs="99" minOccurs="0"/>
         *                   &lt;element name="conformanceInfo" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="conformanceCheckLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType"/>
         *                             &lt;element name="personalMinuteAdjustment" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_142023S" minOccurs="0"/>
         *                             &lt;element name="conformanceCheckTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
         *                             &lt;element name="conformanceInfoAndChecks" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="iAppInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiiAppInformationType" maxOccurs="9" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="lastTrackingInformation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="lastTrackedLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}LongTextStringTypeI"/>
         *                   &lt;element name="lastTrackedTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="secNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S" minOccurs="0"/>
         *         &lt;element name="seatPreference" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160570S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="otherFlightInformation" maxOccurs="30" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
         *                   &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *                   &lt;element name="acceptanceStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType" minOccurs="0"/>
         *                   &lt;element name="operatingDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType" minOccurs="0"/>
         *                   &lt;element name="cabinData" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType"/>
         *                   &lt;element name="timeData" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S" maxOccurs="8" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="legCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
         *         &lt;element name="customerStaffCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerPriorityDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="staffDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}StaffInfoType" minOccurs="0"/>
         *         &lt;element name="dummy" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="regTravelerNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerApiInformationType_205420S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="bookedCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
         *         &lt;element name="staffIDType" type="{http://xml.amadeus.com/APALRR_17_1_1A}InteractiveFreeTextTypeI_160341S" minOccurs="0"/>
         *         &lt;element name="bagGroupId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
         *         &lt;element name="customerBags" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerBaggageInformationType_195576S" minOccurs="0"/>
         *         &lt;element name="finalDestination" type="{http://xml.amadeus.com/APALRR_17_1_1A}AirportNodeInformationType" minOccurs="0"/>
         *         &lt;element name="ssrDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_195579S" maxOccurs="600" minOccurs="0"/>
         *         &lt;element name="seatInformation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="seatStatusInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *                   &lt;element name="seatNumberInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_124026S" minOccurs="0"/>
         *                   &lt;element name="chargeableSeatDelivered" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fqtvDetails" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fqtvData" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationCodeType"/>
         *                   &lt;element name="milesInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}MonetaryInformationType" minOccurs="0"/>
         *                   &lt;element name="ftqvIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="vocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160336S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dummySTX" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="clidData" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationCodeType_176743S" minOccurs="0"/>
         *         &lt;element name="crewDetailGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_176749S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="tocDetails" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tocConstant" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType"/>
         *                   &lt;element name="bookingReferenceNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType"/>
         *                   &lt;element name="tourOperatorCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyInformationType" maxOccurs="2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="trainSeatNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}RailSeatReferenceInformationType" minOccurs="0"/>
         *         &lt;element name="boardingIneligibilityDetails" maxOccurs="20" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ineligibleBoardingCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="onloadPriority" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityTypeU" minOccurs="0"/>
         *         &lt;element name="onloadCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
         *         &lt;element name="dummySegment" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="regradePriority" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityTypeU" minOccurs="0"/>
         *         &lt;element name="regradeCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
         *         &lt;element name="staffHiringCompany" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransportIdentifierType" minOccurs="0"/>
         *         &lt;element name="staffCompanyIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyInformationType_202330S" minOccurs="0"/>
         *         &lt;element name="jumpSeatRequestStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
         *         &lt;element name="staffdates" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_144425S" minOccurs="0"/>
         *         &lt;element name="jssDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="dummy3" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="boardingZone" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType_206185S" minOccurs="0"/>
         *         &lt;element name="bookedOperatingCabinCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType" minOccurs="0"/>
         *         &lt;element name="jumpSeatRanking" type="{http://xml.amadeus.com/APALRR_17_1_1A}PriorityType" minOccurs="0"/>
         *         &lt;element name="failedLinkRequests" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="failedLinkType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *                   &lt;element name="failedLinkId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S"/>
         *                   &lt;element name="failureReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *                   &lt;element name="linkRequestText" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="compensationVoucherDetails" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="providerCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransportIdentifierType_96070S"/>
         *                   &lt;element name="voucherDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType_96073S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="voucherIssueDetails" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="voucherIssueReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_200612S"/>
         *                   &lt;element name="furtherAuthorisationDetails" maxOccurs="99" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="numberOfVouchers" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_145974S"/>
         *                             &lt;element name="authorisingAgent" type="{http://xml.amadeus.com/APALRR_17_1_1A}UserIdentificationType" minOccurs="0"/>
         *                             &lt;element name="authorisedDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_145935S" minOccurs="0"/>
         *                             &lt;element name="authorisationStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
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
         *         &lt;element name="cdtDetailsGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}CdtCustomerType" minOccurs="0"/>
         *         &lt;element name="chargeableServices" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="chargeableSvcInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S"/>
         *                   &lt;element name="chargeableSvcStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_184353S" maxOccurs="4" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="transferDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransferDetailsType" maxOccurs="20" minOccurs="0"/>
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
            "customerData",
            "enhancedCustomerData",
            "customerTitleRelatedData",
            "fareFamily",
            "groupName",
            "uniqueCustomerId",
            "customerStatus",
            "locationIndicator",
            "statusReasonCodes",
            "manualSelecteeComment",
            "paxDateTime",
            "purposeOfVisit",
            "missingRegulatoryInfo",
            "customerLevelAddresses",
            "regulatoryInfo",
            "emergencyContactDetails",
            "additionalPhoneEmail",
            "checkInInformation",
            "nationality",
            "productLevel",
            "lastTrackingInformation",
            "secNumber",
            "seatPreference",
            "otherFlightInformation",
            "legCabinCode",
            "customerStaffCategory",
            "staffDetails",
            "dummy",
            "regTravelerNumber",
            "bookedCabinCode",
            "staffIDType",
            "bagGroupId",
            "customerBags",
            "finalDestination",
            "ssrDetails",
            "seatInformation",
            "fqtvDetails",
            "dummySTX",
            "clidData",
            "crewDetailGroup",
            "tocDetails",
            "trainSeatNumber",
            "boardingIneligibilityDetails",
            "onloadPriority",
            "onloadCabinCode",
            "dummySegment",
            "regradePriority",
            "regradeCabinCode",
            "staffHiringCompany",
            "staffCompanyIdentification",
            "jumpSeatRequestStatus",
            "staffdates",
            "jssDetails",
            "dummy3",
            "boardingZone",
            "bookedOperatingCabinCode",
            "jumpSeatRanking",
            "failedLinkRequests",
            "compensationVoucherDetails",
            "voucherIssueDetails",
            "cdtDetailsGroup",
            "chargeableServices",
            "transferDetails"
        })
        public static class CustomerLevel {

            @XmlElement(required = true)
            protected TravellerInformationType customerData;
            protected List<EnhancedTravellerInformationType> enhancedCustomerData;
            protected CodedAttributeType92397S customerTitleRelatedData;
            protected FareFamilyType fareFamily;
            protected InteractiveFreeTextTypeI groupName;
            protected ItemReferencesAndVersionsType uniqueCustomerId;
            protected List<StatusType206001S> customerStatus;
            protected List<PlaceLocationIdentificationType205384S> locationIndicator;
            protected ActionIdentificationType125447S statusReasonCodes;
            protected FreeTextInformationType160568S manualSelecteeComment;
            protected List<StructuredDateTimeInformationType195472S> paxDateTime;
            protected SpecificDataInformationTypeI purposeOfVisit;
            protected List<ReferenceInformationType> missingRegulatoryInfo;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CustomerLevelAddresses> customerLevelAddresses;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo> regulatoryInfo;
            protected DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.EmergencyContactDetails emergencyContactDetails;
            protected PhoneAndEmailAddressType additionalPhoneEmail;
            protected AdditionalBusinessSourceInformationType checkInInformation;
            protected NationalityTypeU nationality;
            protected DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel productLevel;
            protected DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.LastTrackingInformation lastTrackingInformation;
            protected ReferenceInfoType160432S secNumber;
            protected List<SpecialRequirementsDetailsType160570S> seatPreference;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.OtherFlightInformation> otherFlightInformation;
            protected CabinDetailsType legCabinCode;
            protected TravellerPriorityDetailsTypeI customerStaffCategory;
            protected StaffInfoType staffDetails;
            @XmlElement(required = true)
            protected DummySegmentTypeI dummy;
            protected List<PassengerApiInformationType205420S> regTravelerNumber;
            protected CabinDetailsType bookedCabinCode;
            protected InteractiveFreeTextTypeI160341S staffIDType;
            protected ItemReferencesAndVersionsType bagGroupId;
            protected PassengerBaggageInformationType195576S customerBags;
            protected AirportNodeInformationType finalDestination;
            protected List<SpecialRequirementsDetailsType195579S> ssrDetails;
            protected DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.SeatInformation seatInformation;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FqtvDetails> fqtvDetails;
            @XmlElement(required = true)
            protected DummySegmentTypeI dummySTX;
            protected FrequentTravellerIdentificationCodeType176743S clidData;
            protected List<FreeTextInformationType176749S> crewDetailGroup;
            protected DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.TocDetails tocDetails;
            protected RailSeatReferenceInformationType trainSeatNumber;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.BoardingIneligibilityDetails> boardingIneligibilityDetails;
            protected PriorityTypeU onloadPriority;
            protected CabinDetailsType onloadCabinCode;
            @XmlElement(required = true)
            protected DummySegmentTypeI dummySegment;
            protected PriorityTypeU regradePriority;
            protected CabinDetailsType regradeCabinCode;
            protected TransportIdentifierType staffHiringCompany;
            protected CompanyInformationType202330S staffCompanyIdentification;
            protected StatusType145987S jumpSeatRequestStatus;
            protected StructuredDateTimeInformationType144425S staffdates;
            protected List<FreeTextInformationType160568S> jssDetails;
            @XmlElement(required = true)
            protected DummySegmentTypeI dummy3;
            protected AttributeType206185S boardingZone;
            protected CabinDetailsType bookedOperatingCabinCode;
            protected PriorityType jumpSeatRanking;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FailedLinkRequests> failedLinkRequests;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CompensationVoucherDetails> compensationVoucherDetails;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails> voucherIssueDetails;
            protected CdtCustomerType cdtDetailsGroup;
            protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ChargeableServices> chargeableServices;
            protected List<TransferDetailsType> transferDetails;

            /**
             * Gets the value of the customerData property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformationType }
             *     
             */
            public TravellerInformationType getCustomerData() {
                return customerData;
            }

            /**
             * Sets the value of the customerData property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformationType }
             *     
             */
            public void setCustomerData(TravellerInformationType value) {
                this.customerData = value;
            }

            /**
             * Gets the value of the enhancedCustomerData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the enhancedCustomerData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEnhancedCustomerData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EnhancedTravellerInformationType }
             * 
             * 
             */
            public List<EnhancedTravellerInformationType> getEnhancedCustomerData() {
                if (enhancedCustomerData == null) {
                    enhancedCustomerData = new ArrayList<EnhancedTravellerInformationType>();
                }
                return this.enhancedCustomerData;
            }

            /**
             * Gets the value of the customerTitleRelatedData property.
             * 
             * @return
             *     possible object is
             *     {@link CodedAttributeType92397S }
             *     
             */
            public CodedAttributeType92397S getCustomerTitleRelatedData() {
                return customerTitleRelatedData;
            }

            /**
             * Sets the value of the customerTitleRelatedData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedAttributeType92397S }
             *     
             */
            public void setCustomerTitleRelatedData(CodedAttributeType92397S value) {
                this.customerTitleRelatedData = value;
            }

            /**
             * Gets the value of the fareFamily property.
             * 
             * @return
             *     possible object is
             *     {@link FareFamilyType }
             *     
             */
            public FareFamilyType getFareFamily() {
                return fareFamily;
            }

            /**
             * Sets the value of the fareFamily property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFamilyType }
             *     
             */
            public void setFareFamily(FareFamilyType value) {
                this.fareFamily = value;
            }

            /**
             * Gets the value of the groupName property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public InteractiveFreeTextTypeI getGroupName() {
                return groupName;
            }

            /**
             * Sets the value of the groupName property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI }
             *     
             */
            public void setGroupName(InteractiveFreeTextTypeI value) {
                this.groupName = value;
            }

            /**
             * Gets the value of the uniqueCustomerId property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public ItemReferencesAndVersionsType getUniqueCustomerId() {
                return uniqueCustomerId;
            }

            /**
             * Sets the value of the uniqueCustomerId property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public void setUniqueCustomerId(ItemReferencesAndVersionsType value) {
                this.uniqueCustomerId = value;
            }

            /**
             * Gets the value of the customerStatus property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customerStatus property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomerStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusType206001S }
             * 
             * 
             */
            public List<StatusType206001S> getCustomerStatus() {
                if (customerStatus == null) {
                    customerStatus = new ArrayList<StatusType206001S>();
                }
                return this.customerStatus;
            }

            /**
             * Gets the value of the locationIndicator property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the locationIndicator property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocationIndicator().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PlaceLocationIdentificationType205384S }
             * 
             * 
             */
            public List<PlaceLocationIdentificationType205384S> getLocationIndicator() {
                if (locationIndicator == null) {
                    locationIndicator = new ArrayList<PlaceLocationIdentificationType205384S>();
                }
                return this.locationIndicator;
            }

            /**
             * Gets the value of the statusReasonCodes property.
             * 
             * @return
             *     possible object is
             *     {@link ActionIdentificationType125447S }
             *     
             */
            public ActionIdentificationType125447S getStatusReasonCodes() {
                return statusReasonCodes;
            }

            /**
             * Sets the value of the statusReasonCodes property.
             * 
             * @param value
             *     allowed object is
             *     {@link ActionIdentificationType125447S }
             *     
             */
            public void setStatusReasonCodes(ActionIdentificationType125447S value) {
                this.statusReasonCodes = value;
            }

            /**
             * Gets the value of the manualSelecteeComment property.
             * 
             * @return
             *     possible object is
             *     {@link FreeTextInformationType160568S }
             *     
             */
            public FreeTextInformationType160568S getManualSelecteeComment() {
                return manualSelecteeComment;
            }

            /**
             * Sets the value of the manualSelecteeComment property.
             * 
             * @param value
             *     allowed object is
             *     {@link FreeTextInformationType160568S }
             *     
             */
            public void setManualSelecteeComment(FreeTextInformationType160568S value) {
                this.manualSelecteeComment = value;
            }

            /**
             * Gets the value of the paxDateTime property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the paxDateTime property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPaxDateTime().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StructuredDateTimeInformationType195472S }
             * 
             * 
             */
            public List<StructuredDateTimeInformationType195472S> getPaxDateTime() {
                if (paxDateTime == null) {
                    paxDateTime = new ArrayList<StructuredDateTimeInformationType195472S>();
                }
                return this.paxDateTime;
            }

            /**
             * Gets the value of the purposeOfVisit property.
             * 
             * @return
             *     possible object is
             *     {@link SpecificDataInformationTypeI }
             *     
             */
            public SpecificDataInformationTypeI getPurposeOfVisit() {
                return purposeOfVisit;
            }

            /**
             * Sets the value of the purposeOfVisit property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecificDataInformationTypeI }
             *     
             */
            public void setPurposeOfVisit(SpecificDataInformationTypeI value) {
                this.purposeOfVisit = value;
            }

            /**
             * Gets the value of the missingRegulatoryInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the missingRegulatoryInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMissingRegulatoryInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ReferenceInformationType }
             * 
             * 
             */
            public List<ReferenceInformationType> getMissingRegulatoryInfo() {
                if (missingRegulatoryInfo == null) {
                    missingRegulatoryInfo = new ArrayList<ReferenceInformationType>();
                }
                return this.missingRegulatoryInfo;
            }

            /**
             * Gets the value of the customerLevelAddresses property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the customerLevelAddresses property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCustomerLevelAddresses().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CustomerLevelAddresses }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CustomerLevelAddresses> getCustomerLevelAddresses() {
                if (customerLevelAddresses == null) {
                    customerLevelAddresses = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CustomerLevelAddresses>();
                }
                return this.customerLevelAddresses;
            }

            /**
             * Gets the value of the regulatoryInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the regulatoryInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegulatoryInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo> getRegulatoryInfo() {
                if (regulatoryInfo == null) {
                    regulatoryInfo = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo>();
                }
                return this.regulatoryInfo;
            }

            /**
             * Gets the value of the emergencyContactDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.EmergencyContactDetails }
             *     
             */
            public DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.EmergencyContactDetails getEmergencyContactDetails() {
                return emergencyContactDetails;
            }

            /**
             * Sets the value of the emergencyContactDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.EmergencyContactDetails }
             *     
             */
            public void setEmergencyContactDetails(DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.EmergencyContactDetails value) {
                this.emergencyContactDetails = value;
            }

            /**
             * Gets the value of the additionalPhoneEmail property.
             * 
             * @return
             *     possible object is
             *     {@link PhoneAndEmailAddressType }
             *     
             */
            public PhoneAndEmailAddressType getAdditionalPhoneEmail() {
                return additionalPhoneEmail;
            }

            /**
             * Sets the value of the additionalPhoneEmail property.
             * 
             * @param value
             *     allowed object is
             *     {@link PhoneAndEmailAddressType }
             *     
             */
            public void setAdditionalPhoneEmail(PhoneAndEmailAddressType value) {
                this.additionalPhoneEmail = value;
            }

            /**
             * Gets the value of the checkInInformation property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalBusinessSourceInformationType }
             *     
             */
            public AdditionalBusinessSourceInformationType getCheckInInformation() {
                return checkInInformation;
            }

            /**
             * Sets the value of the checkInInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalBusinessSourceInformationType }
             *     
             */
            public void setCheckInInformation(AdditionalBusinessSourceInformationType value) {
                this.checkInInformation = value;
            }

            /**
             * Gets the value of the nationality property.
             * 
             * @return
             *     possible object is
             *     {@link NationalityTypeU }
             *     
             */
            public NationalityTypeU getNationality() {
                return nationality;
            }

            /**
             * Sets the value of the nationality property.
             * 
             * @param value
             *     allowed object is
             *     {@link NationalityTypeU }
             *     
             */
            public void setNationality(NationalityTypeU value) {
                this.nationality = value;
            }

            /**
             * Gets the value of the productLevel property.
             * 
             * @return
             *     possible object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel }
             *     
             */
            public DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel getProductLevel() {
                return productLevel;
            }

            /**
             * Sets the value of the productLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel }
             *     
             */
            public void setProductLevel(DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel value) {
                this.productLevel = value;
            }

            /**
             * Gets the value of the lastTrackingInformation property.
             * 
             * @return
             *     possible object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.LastTrackingInformation }
             *     
             */
            public DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.LastTrackingInformation getLastTrackingInformation() {
                return lastTrackingInformation;
            }

            /**
             * Sets the value of the lastTrackingInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.LastTrackingInformation }
             *     
             */
            public void setLastTrackingInformation(DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.LastTrackingInformation value) {
                this.lastTrackingInformation = value;
            }

            /**
             * Gets the value of the secNumber property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType160432S }
             *     
             */
            public ReferenceInfoType160432S getSecNumber() {
                return secNumber;
            }

            /**
             * Sets the value of the secNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType160432S }
             *     
             */
            public void setSecNumber(ReferenceInfoType160432S value) {
                this.secNumber = value;
            }

            /**
             * Gets the value of the seatPreference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatPreference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatPreference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SpecialRequirementsDetailsType160570S }
             * 
             * 
             */
            public List<SpecialRequirementsDetailsType160570S> getSeatPreference() {
                if (seatPreference == null) {
                    seatPreference = new ArrayList<SpecialRequirementsDetailsType160570S>();
                }
                return this.seatPreference;
            }

            /**
             * Gets the value of the otherFlightInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherFlightInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherFlightInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.OtherFlightInformation }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.OtherFlightInformation> getOtherFlightInformation() {
                if (otherFlightInformation == null) {
                    otherFlightInformation = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.OtherFlightInformation>();
                }
                return this.otherFlightInformation;
            }

            /**
             * Gets the value of the legCabinCode property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getLegCabinCode() {
                return legCabinCode;
            }

            /**
             * Sets the value of the legCabinCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setLegCabinCode(CabinDetailsType value) {
                this.legCabinCode = value;
            }

            /**
             * Gets the value of the customerStaffCategory property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerPriorityDetailsTypeI }
             *     
             */
            public TravellerPriorityDetailsTypeI getCustomerStaffCategory() {
                return customerStaffCategory;
            }

            /**
             * Sets the value of the customerStaffCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerPriorityDetailsTypeI }
             *     
             */
            public void setCustomerStaffCategory(TravellerPriorityDetailsTypeI value) {
                this.customerStaffCategory = value;
            }

            /**
             * Gets the value of the staffDetails property.
             * 
             * @return
             *     possible object is
             *     {@link StaffInfoType }
             *     
             */
            public StaffInfoType getStaffDetails() {
                return staffDetails;
            }

            /**
             * Sets the value of the staffDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link StaffInfoType }
             *     
             */
            public void setStaffDetails(StaffInfoType value) {
                this.staffDetails = value;
            }

            /**
             * Gets the value of the dummy property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getDummy() {
                return dummy;
            }

            /**
             * Sets the value of the dummy property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setDummy(DummySegmentTypeI value) {
                this.dummy = value;
            }

            /**
             * Gets the value of the regTravelerNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the regTravelerNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRegTravelerNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PassengerApiInformationType205420S }
             * 
             * 
             */
            public List<PassengerApiInformationType205420S> getRegTravelerNumber() {
                if (regTravelerNumber == null) {
                    regTravelerNumber = new ArrayList<PassengerApiInformationType205420S>();
                }
                return this.regTravelerNumber;
            }

            /**
             * Gets the value of the bookedCabinCode property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getBookedCabinCode() {
                return bookedCabinCode;
            }

            /**
             * Sets the value of the bookedCabinCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setBookedCabinCode(CabinDetailsType value) {
                this.bookedCabinCode = value;
            }

            /**
             * Gets the value of the staffIDType property.
             * 
             * @return
             *     possible object is
             *     {@link InteractiveFreeTextTypeI160341S }
             *     
             */
            public InteractiveFreeTextTypeI160341S getStaffIDType() {
                return staffIDType;
            }

            /**
             * Sets the value of the staffIDType property.
             * 
             * @param value
             *     allowed object is
             *     {@link InteractiveFreeTextTypeI160341S }
             *     
             */
            public void setStaffIDType(InteractiveFreeTextTypeI160341S value) {
                this.staffIDType = value;
            }

            /**
             * Gets the value of the bagGroupId property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public ItemReferencesAndVersionsType getBagGroupId() {
                return bagGroupId;
            }

            /**
             * Sets the value of the bagGroupId property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType }
             *     
             */
            public void setBagGroupId(ItemReferencesAndVersionsType value) {
                this.bagGroupId = value;
            }

            /**
             * Gets the value of the customerBags property.
             * 
             * @return
             *     possible object is
             *     {@link PassengerBaggageInformationType195576S }
             *     
             */
            public PassengerBaggageInformationType195576S getCustomerBags() {
                return customerBags;
            }

            /**
             * Sets the value of the customerBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link PassengerBaggageInformationType195576S }
             *     
             */
            public void setCustomerBags(PassengerBaggageInformationType195576S value) {
                this.customerBags = value;
            }

            /**
             * Gets the value of the finalDestination property.
             * 
             * @return
             *     possible object is
             *     {@link AirportNodeInformationType }
             *     
             */
            public AirportNodeInformationType getFinalDestination() {
                return finalDestination;
            }

            /**
             * Sets the value of the finalDestination property.
             * 
             * @param value
             *     allowed object is
             *     {@link AirportNodeInformationType }
             *     
             */
            public void setFinalDestination(AirportNodeInformationType value) {
                this.finalDestination = value;
            }

            /**
             * Gets the value of the ssrDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ssrDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSsrDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SpecialRequirementsDetailsType195579S }
             * 
             * 
             */
            public List<SpecialRequirementsDetailsType195579S> getSsrDetails() {
                if (ssrDetails == null) {
                    ssrDetails = new ArrayList<SpecialRequirementsDetailsType195579S>();
                }
                return this.ssrDetails;
            }

            /**
             * Gets the value of the seatInformation property.
             * 
             * @return
             *     possible object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.SeatInformation }
             *     
             */
            public DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.SeatInformation getSeatInformation() {
                return seatInformation;
            }

            /**
             * Sets the value of the seatInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.SeatInformation }
             *     
             */
            public void setSeatInformation(DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.SeatInformation value) {
                this.seatInformation = value;
            }

            /**
             * Gets the value of the fqtvDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the fqtvDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFqtvDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FqtvDetails }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FqtvDetails> getFqtvDetails() {
                if (fqtvDetails == null) {
                    fqtvDetails = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FqtvDetails>();
                }
                return this.fqtvDetails;
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
             * Gets the value of the clidData property.
             * 
             * @return
             *     possible object is
             *     {@link FrequentTravellerIdentificationCodeType176743S }
             *     
             */
            public FrequentTravellerIdentificationCodeType176743S getClidData() {
                return clidData;
            }

            /**
             * Sets the value of the clidData property.
             * 
             * @param value
             *     allowed object is
             *     {@link FrequentTravellerIdentificationCodeType176743S }
             *     
             */
            public void setClidData(FrequentTravellerIdentificationCodeType176743S value) {
                this.clidData = value;
            }

            /**
             * Gets the value of the crewDetailGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the crewDetailGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCrewDetailGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FreeTextInformationType176749S }
             * 
             * 
             */
            public List<FreeTextInformationType176749S> getCrewDetailGroup() {
                if (crewDetailGroup == null) {
                    crewDetailGroup = new ArrayList<FreeTextInformationType176749S>();
                }
                return this.crewDetailGroup;
            }

            /**
             * Gets the value of the tocDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.TocDetails }
             *     
             */
            public DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.TocDetails getTocDetails() {
                return tocDetails;
            }

            /**
             * Sets the value of the tocDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.TocDetails }
             *     
             */
            public void setTocDetails(DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.TocDetails value) {
                this.tocDetails = value;
            }

            /**
             * Gets the value of the trainSeatNumber property.
             * 
             * @return
             *     possible object is
             *     {@link RailSeatReferenceInformationType }
             *     
             */
            public RailSeatReferenceInformationType getTrainSeatNumber() {
                return trainSeatNumber;
            }

            /**
             * Sets the value of the trainSeatNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link RailSeatReferenceInformationType }
             *     
             */
            public void setTrainSeatNumber(RailSeatReferenceInformationType value) {
                this.trainSeatNumber = value;
            }

            /**
             * Gets the value of the boardingIneligibilityDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the boardingIneligibilityDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBoardingIneligibilityDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.BoardingIneligibilityDetails }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.BoardingIneligibilityDetails> getBoardingIneligibilityDetails() {
                if (boardingIneligibilityDetails == null) {
                    boardingIneligibilityDetails = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.BoardingIneligibilityDetails>();
                }
                return this.boardingIneligibilityDetails;
            }

            /**
             * Gets the value of the onloadPriority property.
             * 
             * @return
             *     possible object is
             *     {@link PriorityTypeU }
             *     
             */
            public PriorityTypeU getOnloadPriority() {
                return onloadPriority;
            }

            /**
             * Sets the value of the onloadPriority property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriorityTypeU }
             *     
             */
            public void setOnloadPriority(PriorityTypeU value) {
                this.onloadPriority = value;
            }

            /**
             * Gets the value of the onloadCabinCode property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getOnloadCabinCode() {
                return onloadCabinCode;
            }

            /**
             * Sets the value of the onloadCabinCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setOnloadCabinCode(CabinDetailsType value) {
                this.onloadCabinCode = value;
            }

            /**
             * Gets the value of the dummySegment property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getDummySegment() {
                return dummySegment;
            }

            /**
             * Sets the value of the dummySegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setDummySegment(DummySegmentTypeI value) {
                this.dummySegment = value;
            }

            /**
             * Gets the value of the regradePriority property.
             * 
             * @return
             *     possible object is
             *     {@link PriorityTypeU }
             *     
             */
            public PriorityTypeU getRegradePriority() {
                return regradePriority;
            }

            /**
             * Sets the value of the regradePriority property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriorityTypeU }
             *     
             */
            public void setRegradePriority(PriorityTypeU value) {
                this.regradePriority = value;
            }

            /**
             * Gets the value of the regradeCabinCode property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getRegradeCabinCode() {
                return regradeCabinCode;
            }

            /**
             * Sets the value of the regradeCabinCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setRegradeCabinCode(CabinDetailsType value) {
                this.regradeCabinCode = value;
            }

            /**
             * Gets the value of the staffHiringCompany property.
             * 
             * @return
             *     possible object is
             *     {@link TransportIdentifierType }
             *     
             */
            public TransportIdentifierType getStaffHiringCompany() {
                return staffHiringCompany;
            }

            /**
             * Sets the value of the staffHiringCompany property.
             * 
             * @param value
             *     allowed object is
             *     {@link TransportIdentifierType }
             *     
             */
            public void setStaffHiringCompany(TransportIdentifierType value) {
                this.staffHiringCompany = value;
            }

            /**
             * Gets the value of the staffCompanyIdentification property.
             * 
             * @return
             *     possible object is
             *     {@link CompanyInformationType202330S }
             *     
             */
            public CompanyInformationType202330S getStaffCompanyIdentification() {
                return staffCompanyIdentification;
            }

            /**
             * Sets the value of the staffCompanyIdentification property.
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyInformationType202330S }
             *     
             */
            public void setStaffCompanyIdentification(CompanyInformationType202330S value) {
                this.staffCompanyIdentification = value;
            }

            /**
             * Gets the value of the jumpSeatRequestStatus property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType145987S }
             *     
             */
            public StatusType145987S getJumpSeatRequestStatus() {
                return jumpSeatRequestStatus;
            }

            /**
             * Sets the value of the jumpSeatRequestStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType145987S }
             *     
             */
            public void setJumpSeatRequestStatus(StatusType145987S value) {
                this.jumpSeatRequestStatus = value;
            }

            /**
             * Gets the value of the staffdates property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredDateTimeInformationType144425S }
             *     
             */
            public StructuredDateTimeInformationType144425S getStaffdates() {
                return staffdates;
            }

            /**
             * Sets the value of the staffdates property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredDateTimeInformationType144425S }
             *     
             */
            public void setStaffdates(StructuredDateTimeInformationType144425S value) {
                this.staffdates = value;
            }

            /**
             * Gets the value of the jssDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the jssDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getJssDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FreeTextInformationType160568S }
             * 
             * 
             */
            public List<FreeTextInformationType160568S> getJssDetails() {
                if (jssDetails == null) {
                    jssDetails = new ArrayList<FreeTextInformationType160568S>();
                }
                return this.jssDetails;
            }

            /**
             * Gets the value of the dummy3 property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getDummy3() {
                return dummy3;
            }

            /**
             * Sets the value of the dummy3 property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setDummy3(DummySegmentTypeI value) {
                this.dummy3 = value;
            }

            /**
             * Gets the value of the boardingZone property.
             * 
             * @return
             *     possible object is
             *     {@link AttributeType206185S }
             *     
             */
            public AttributeType206185S getBoardingZone() {
                return boardingZone;
            }

            /**
             * Sets the value of the boardingZone property.
             * 
             * @param value
             *     allowed object is
             *     {@link AttributeType206185S }
             *     
             */
            public void setBoardingZone(AttributeType206185S value) {
                this.boardingZone = value;
            }

            /**
             * Gets the value of the bookedOperatingCabinCode property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getBookedOperatingCabinCode() {
                return bookedOperatingCabinCode;
            }

            /**
             * Sets the value of the bookedOperatingCabinCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setBookedOperatingCabinCode(CabinDetailsType value) {
                this.bookedOperatingCabinCode = value;
            }

            /**
             * Gets the value of the jumpSeatRanking property.
             * 
             * @return
             *     possible object is
             *     {@link PriorityType }
             *     
             */
            public PriorityType getJumpSeatRanking() {
                return jumpSeatRanking;
            }

            /**
             * Sets the value of the jumpSeatRanking property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriorityType }
             *     
             */
            public void setJumpSeatRanking(PriorityType value) {
                this.jumpSeatRanking = value;
            }

            /**
             * Gets the value of the failedLinkRequests property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the failedLinkRequests property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFailedLinkRequests().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FailedLinkRequests }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FailedLinkRequests> getFailedLinkRequests() {
                if (failedLinkRequests == null) {
                    failedLinkRequests = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.FailedLinkRequests>();
                }
                return this.failedLinkRequests;
            }

            /**
             * Gets the value of the compensationVoucherDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the compensationVoucherDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCompensationVoucherDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CompensationVoucherDetails }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CompensationVoucherDetails> getCompensationVoucherDetails() {
                if (compensationVoucherDetails == null) {
                    compensationVoucherDetails = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.CompensationVoucherDetails>();
                }
                return this.compensationVoucherDetails;
            }

            /**
             * Gets the value of the voucherIssueDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the voucherIssueDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVoucherIssueDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails> getVoucherIssueDetails() {
                if (voucherIssueDetails == null) {
                    voucherIssueDetails = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails>();
                }
                return this.voucherIssueDetails;
            }

            /**
             * Gets the value of the cdtDetailsGroup property.
             * 
             * @return
             *     possible object is
             *     {@link CdtCustomerType }
             *     
             */
            public CdtCustomerType getCdtDetailsGroup() {
                return cdtDetailsGroup;
            }

            /**
             * Sets the value of the cdtDetailsGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link CdtCustomerType }
             *     
             */
            public void setCdtDetailsGroup(CdtCustomerType value) {
                this.cdtDetailsGroup = value;
            }

            /**
             * Gets the value of the chargeableServices property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the chargeableServices property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChargeableServices().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ChargeableServices }
             * 
             * 
             */
            public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ChargeableServices> getChargeableServices() {
                if (chargeableServices == null) {
                    chargeableServices = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ChargeableServices>();
                }
                return this.chargeableServices;
            }

            /**
             * Gets the value of the transferDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the transferDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTransferDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TransferDetailsType }
             * 
             * 
             */
            public List<TransferDetailsType> getTransferDetails() {
                if (transferDetails == null) {
                    transferDetails = new ArrayList<TransferDetailsType>();
                }
                return this.transferDetails;
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
             *         &lt;element name="ineligibleBoardingCategory" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
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
                "ineligibleBoardingCategory"
            })
            public static class BoardingIneligibilityDetails {

                @XmlElement(required = true)
                protected StatusType129946S ineligibleBoardingCategory;

                /**
                 * Gets the value of the ineligibleBoardingCategory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getIneligibleBoardingCategory() {
                    return ineligibleBoardingCategory;
                }

                /**
                 * Sets the value of the ineligibleBoardingCategory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setIneligibleBoardingCategory(StatusType129946S value) {
                    this.ineligibleBoardingCategory = value;
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
             *         &lt;element name="chargeableSvcInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_160611S"/>
             *         &lt;element name="chargeableSvcStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_184353S" maxOccurs="4" minOccurs="0"/>
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
                "chargeableSvcInfo",
                "chargeableSvcStatus"
            })
            public static class ChargeableServices {

                @XmlElement(required = true)
                protected SpecialRequirementsDetailsType160611S chargeableSvcInfo;
                protected List<StatusType184353S> chargeableSvcStatus;

                /**
                 * Gets the value of the chargeableSvcInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecialRequirementsDetailsType160611S }
                 *     
                 */
                public SpecialRequirementsDetailsType160611S getChargeableSvcInfo() {
                    return chargeableSvcInfo;
                }

                /**
                 * Sets the value of the chargeableSvcInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecialRequirementsDetailsType160611S }
                 *     
                 */
                public void setChargeableSvcInfo(SpecialRequirementsDetailsType160611S value) {
                    this.chargeableSvcInfo = value;
                }

                /**
                 * Gets the value of the chargeableSvcStatus property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the chargeableSvcStatus property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChargeableSvcStatus().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StatusType184353S }
                 * 
                 * 
                 */
                public List<StatusType184353S> getChargeableSvcStatus() {
                    if (chargeableSvcStatus == null) {
                        chargeableSvcStatus = new ArrayList<StatusType184353S>();
                    }
                    return this.chargeableSvcStatus;
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
             *         &lt;element name="providerCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}TransportIdentifierType_96070S"/>
             *         &lt;element name="voucherDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType_96073S"/>
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
                "providerCode",
                "voucherDetails"
            })
            public static class CompensationVoucherDetails {

                @XmlElement(required = true)
                protected TransportIdentifierType96070S providerCode;
                @XmlElement(required = true)
                protected CompensationType96073S voucherDetails;

                /**
                 * Gets the value of the providerCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TransportIdentifierType96070S }
                 *     
                 */
                public TransportIdentifierType96070S getProviderCode() {
                    return providerCode;
                }

                /**
                 * Sets the value of the providerCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TransportIdentifierType96070S }
                 *     
                 */
                public void setProviderCode(TransportIdentifierType96070S value) {
                    this.providerCode = value;
                }

                /**
                 * Gets the value of the voucherDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CompensationType96073S }
                 *     
                 */
                public CompensationType96073S getVoucherDetails() {
                    return voucherDetails;
                }

                /**
                 * Sets the value of the voucherDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CompensationType96073S }
                 *     
                 */
                public void setVoucherDetails(CompensationType96073S value) {
                    this.voucherDetails = value;
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
             *         &lt;element name="addressDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}NameAndAddressBatchType"/>
             *         &lt;element name="addressQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_205424S"/>
             *         &lt;element name="addressDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
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
                "addressDetails",
                "addressQualifier",
                "addressDataViewPermission"
            })
            public static class CustomerLevelAddresses {

                @XmlElement(required = true)
                protected NameAndAddressBatchType addressDetails;
                @XmlElement(required = true)
                protected PlaceLocationIdentificationType205424S addressQualifier;
                @XmlElement(required = true)
                protected StatusType129946S addressDataViewPermission;

                /**
                 * Gets the value of the addressDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameAndAddressBatchType }
                 *     
                 */
                public NameAndAddressBatchType getAddressDetails() {
                    return addressDetails;
                }

                /**
                 * Sets the value of the addressDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameAndAddressBatchType }
                 *     
                 */
                public void setAddressDetails(NameAndAddressBatchType value) {
                    this.addressDetails = value;
                }

                /**
                 * Gets the value of the addressQualifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PlaceLocationIdentificationType205424S }
                 *     
                 */
                public PlaceLocationIdentificationType205424S getAddressQualifier() {
                    return addressQualifier;
                }

                /**
                 * Sets the value of the addressQualifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PlaceLocationIdentificationType205424S }
                 *     
                 */
                public void setAddressQualifier(PlaceLocationIdentificationType205424S value) {
                    this.addressQualifier = value;
                }

                /**
                 * Gets the value of the addressDataViewPermission property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getAddressDataViewPermission() {
                    return addressDataViewPermission;
                }

                /**
                 * Sets the value of the addressDataViewPermission property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setAddressDataViewPermission(StatusType129946S value) {
                    this.addressDataViewPermission = value;
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
             *         &lt;element name="contactInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PassengerApiInformationType"/>
             *         &lt;element name="emergContactViewPermissions" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
             *         &lt;element name="emergencyContactComment" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S" minOccurs="0"/>
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
                "contactInfo",
                "emergContactViewPermissions",
                "emergencyContactComment"
            })
            public static class EmergencyContactDetails {

                @XmlElement(required = true)
                protected PassengerApiInformationType contactInfo;
                protected StatusType129946S emergContactViewPermissions;
                protected FreeTextInformationType160568S emergencyContactComment;

                /**
                 * Gets the value of the contactInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PassengerApiInformationType }
                 *     
                 */
                public PassengerApiInformationType getContactInfo() {
                    return contactInfo;
                }

                /**
                 * Sets the value of the contactInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PassengerApiInformationType }
                 *     
                 */
                public void setContactInfo(PassengerApiInformationType value) {
                    this.contactInfo = value;
                }

                /**
                 * Gets the value of the emergContactViewPermissions property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getEmergContactViewPermissions() {
                    return emergContactViewPermissions;
                }

                /**
                 * Sets the value of the emergContactViewPermissions property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setEmergContactViewPermissions(StatusType129946S value) {
                    this.emergContactViewPermissions = value;
                }

                /**
                 * Gets the value of the emergencyContactComment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType160568S }
                 *     
                 */
                public FreeTextInformationType160568S getEmergencyContactComment() {
                    return emergencyContactComment;
                }

                /**
                 * Sets the value of the emergencyContactComment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType160568S }
                 *     
                 */
                public void setEmergencyContactComment(FreeTextInformationType160568S value) {
                    this.emergencyContactComment = value;
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
             *         &lt;element name="failedLinkType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
             *         &lt;element name="failedLinkId" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S"/>
             *         &lt;element name="failureReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
             *         &lt;element name="linkRequestText" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160568S"/>
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
                "failedLinkType",
                "failedLinkId",
                "failureReason",
                "linkRequestText"
            })
            public static class FailedLinkRequests {

                @XmlElement(required = true)
                protected StatusType129946S failedLinkType;
                @XmlElement(required = true)
                protected ReferenceInfoType160432S failedLinkId;
                @XmlElement(required = true)
                protected StatusType129946S failureReason;
                @XmlElement(required = true)
                protected FreeTextInformationType160568S linkRequestText;

                /**
                 * Gets the value of the failedLinkType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getFailedLinkType() {
                    return failedLinkType;
                }

                /**
                 * Sets the value of the failedLinkType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setFailedLinkType(StatusType129946S value) {
                    this.failedLinkType = value;
                }

                /**
                 * Gets the value of the failedLinkId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType160432S }
                 *     
                 */
                public ReferenceInfoType160432S getFailedLinkId() {
                    return failedLinkId;
                }

                /**
                 * Sets the value of the failedLinkId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType160432S }
                 *     
                 */
                public void setFailedLinkId(ReferenceInfoType160432S value) {
                    this.failedLinkId = value;
                }

                /**
                 * Gets the value of the failureReason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getFailureReason() {
                    return failureReason;
                }

                /**
                 * Sets the value of the failureReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setFailureReason(StatusType129946S value) {
                    this.failureReason = value;
                }

                /**
                 * Gets the value of the linkRequestText property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType160568S }
                 *     
                 */
                public FreeTextInformationType160568S getLinkRequestText() {
                    return linkRequestText;
                }

                /**
                 * Sets the value of the linkRequestText property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType160568S }
                 *     
                 */
                public void setLinkRequestText(FreeTextInformationType160568S value) {
                    this.linkRequestText = value;
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
             *         &lt;element name="fqtvData" type="{http://xml.amadeus.com/APALRR_17_1_1A}FrequentTravellerIdentificationCodeType"/>
             *         &lt;element name="milesInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}MonetaryInformationType" minOccurs="0"/>
             *         &lt;element name="ftqvIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="vocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160336S" minOccurs="0"/>
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
                "fqtvData",
                "milesInformation",
                "ftqvIndicators",
                "vocIndicator"
            })
            public static class FqtvDetails {

                @XmlElement(required = true)
                protected FrequentTravellerIdentificationCodeType fqtvData;
                protected MonetaryInformationType milesInformation;
                protected List<StatusType129946S> ftqvIndicators;
                protected FreeTextInformationType160336S vocIndicator;

                /**
                 * Gets the value of the fqtvData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FrequentTravellerIdentificationCodeType }
                 *     
                 */
                public FrequentTravellerIdentificationCodeType getFqtvData() {
                    return fqtvData;
                }

                /**
                 * Sets the value of the fqtvData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FrequentTravellerIdentificationCodeType }
                 *     
                 */
                public void setFqtvData(FrequentTravellerIdentificationCodeType value) {
                    this.fqtvData = value;
                }

                /**
                 * Gets the value of the milesInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public MonetaryInformationType getMilesInformation() {
                    return milesInformation;
                }

                /**
                 * Sets the value of the milesInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationType }
                 *     
                 */
                public void setMilesInformation(MonetaryInformationType value) {
                    this.milesInformation = value;
                }

                /**
                 * Gets the value of the ftqvIndicators property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ftqvIndicators property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFtqvIndicators().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StatusType129946S }
                 * 
                 * 
                 */
                public List<StatusType129946S> getFtqvIndicators() {
                    if (ftqvIndicators == null) {
                        ftqvIndicators = new ArrayList<StatusType129946S>();
                    }
                    return this.ftqvIndicators;
                }

                /**
                 * Gets the value of the vocIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType160336S }
                 *     
                 */
                public FreeTextInformationType160336S getVocIndicator() {
                    return vocIndicator;
                }

                /**
                 * Sets the value of the vocIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType160336S }
                 *     
                 */
                public void setVocIndicator(FreeTextInformationType160336S value) {
                    this.vocIndicator = value;
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
             *         &lt;element name="lastTrackedLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}LongTextStringTypeI"/>
             *         &lt;element name="lastTrackedTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S"/>
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
                "lastTrackedLocation",
                "lastTrackedTime"
            })
            public static class LastTrackingInformation {

                @XmlElement(required = true)
                protected LongTextStringTypeI lastTrackedLocation;
                @XmlElement(required = true)
                protected StructuredDateTimeInformationType78177S lastTrackedTime;

                /**
                 * Gets the value of the lastTrackedLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link LongTextStringTypeI }
                 *     
                 */
                public LongTextStringTypeI getLastTrackedLocation() {
                    return lastTrackedLocation;
                }

                /**
                 * Sets the value of the lastTrackedLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LongTextStringTypeI }
                 *     
                 */
                public void setLastTrackedLocation(LongTextStringTypeI value) {
                    this.lastTrackedLocation = value;
                }

                /**
                 * Gets the value of the lastTrackedTime property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredDateTimeInformationType78177S }
                 *     
                 */
                public StructuredDateTimeInformationType78177S getLastTrackedTime() {
                    return lastTrackedTime;
                }

                /**
                 * Sets the value of the lastTrackedTime property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredDateTimeInformationType78177S }
                 *     
                 */
                public void setLastTrackedTime(StructuredDateTimeInformationType78177S value) {
                    this.lastTrackedTime = value;
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
             *         &lt;element name="otherFlightData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
             *         &lt;element name="flightTypeIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
             *         &lt;element name="acceptanceStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType" minOccurs="0"/>
             *         &lt;element name="operatingDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationType" minOccurs="0"/>
             *         &lt;element name="cabinData" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType"/>
             *         &lt;element name="timeData" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_78177S" maxOccurs="8" minOccurs="0"/>
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
                "otherFlightData",
                "flightTypeIndicator",
                "acceptanceStatus",
                "operatingDetails",
                "cabinData",
                "timeData"
            })
            public static class OtherFlightInformation {

                @XmlElement(required = true)
                protected TravelProductInformationTypeI otherFlightData;
                @XmlElement(required = true)
                protected StatusType129946S flightTypeIndicator;
                protected StatusType acceptanceStatus;
                protected TravelProductInformationType operatingDetails;
                @XmlElement(required = true)
                protected CabinDetailsType cabinData;
                protected List<StructuredDateTimeInformationType78177S> timeData;

                /**
                 * Gets the value of the otherFlightData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public TravelProductInformationTypeI getOtherFlightData() {
                    return otherFlightData;
                }

                /**
                 * Sets the value of the otherFlightData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public void setOtherFlightData(TravelProductInformationTypeI value) {
                    this.otherFlightData = value;
                }

                /**
                 * Gets the value of the flightTypeIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getFlightTypeIndicator() {
                    return flightTypeIndicator;
                }

                /**
                 * Sets the value of the flightTypeIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setFlightTypeIndicator(StatusType129946S value) {
                    this.flightTypeIndicator = value;
                }

                /**
                 * Gets the value of the acceptanceStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType }
                 *     
                 */
                public StatusType getAcceptanceStatus() {
                    return acceptanceStatus;
                }

                /**
                 * Sets the value of the acceptanceStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType }
                 *     
                 */
                public void setAcceptanceStatus(StatusType value) {
                    this.acceptanceStatus = value;
                }

                /**
                 * Gets the value of the operatingDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationType }
                 *     
                 */
                public TravelProductInformationType getOperatingDetails() {
                    return operatingDetails;
                }

                /**
                 * Sets the value of the operatingDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationType }
                 *     
                 */
                public void setOperatingDetails(TravelProductInformationType value) {
                    this.operatingDetails = value;
                }

                /**
                 * Gets the value of the cabinData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CabinDetailsType }
                 *     
                 */
                public CabinDetailsType getCabinData() {
                    return cabinData;
                }

                /**
                 * Sets the value of the cabinData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CabinDetailsType }
                 *     
                 */
                public void setCabinData(CabinDetailsType value) {
                    this.cabinData = value;
                }

                /**
                 * Gets the value of the timeData property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the timeData property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTimeData().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link StructuredDateTimeInformationType78177S }
                 * 
                 * 
                 */
                public List<StructuredDateTimeInformationType78177S> getTimeData() {
                    if (timeData == null) {
                        timeData = new ArrayList<StructuredDateTimeInformationType78177S>();
                    }
                    return this.timeData;
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
             *         &lt;element name="bookingData" type="{http://xml.amadeus.com/APALRR_17_1_1A}RelatedProductInformationTypeI"/>
             *         &lt;element name="productIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType"/>
             *         &lt;element name="compensationInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompensationType" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="compensationInfoViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
             *         &lt;element name="sbrRecordLocator" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReservationControlInformationTypeI" minOccurs="0"/>
             *         &lt;element name="flightInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravelProductInformationTypeI"/>
             *         &lt;element name="ticketInformation" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="ticket" type="{http://xml.amadeus.com/APALRR_17_1_1A}TicketNumberType"/>
             *                   &lt;element name="eTicketInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}CouponInformationType" minOccurs="0"/>
             *                   &lt;element name="pricingInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
             *                   &lt;element name="creditCardFraudCheck" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="comments" type="{http://xml.amadeus.com/APALRR_17_1_1A}CommentsType" maxOccurs="99" minOccurs="0"/>
             *         &lt;element name="conformanceInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="conformanceCheckLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType"/>
             *                   &lt;element name="personalMinuteAdjustment" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_142023S" minOccurs="0"/>
             *                   &lt;element name="conformanceCheckTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
             *                   &lt;element name="conformanceInfoAndChecks" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="iAppInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}EdiiAppInformationType" maxOccurs="9" minOccurs="0"/>
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
                "bookingData",
                "productIdentifier",
                "compensationInfo",
                "compensationInfoViewPermission",
                "sbrRecordLocator",
                "flightInformation",
                "ticketInformation",
                "comments",
                "conformanceInfo",
                "iAppInformation"
            })
            public static class ProductLevel {

                @XmlElement(required = true)
                protected RelatedProductInformationTypeI bookingData;
                @XmlElement(required = true)
                protected ItemReferencesAndVersionsType productIdentifier;
                protected List<CompensationType> compensationInfo;
                protected StatusType129946S compensationInfoViewPermission;
                protected ReservationControlInformationTypeI sbrRecordLocator;
                @XmlElement(required = true)
                protected TravelProductInformationTypeI flightInformation;
                protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.TicketInformation> ticketInformation;
                protected List<CommentsType> comments;
                protected DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.ConformanceInfo conformanceInfo;
                protected List<EdiiAppInformationType> iAppInformation;

                /**
                 * Gets the value of the bookingData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RelatedProductInformationTypeI }
                 *     
                 */
                public RelatedProductInformationTypeI getBookingData() {
                    return bookingData;
                }

                /**
                 * Sets the value of the bookingData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RelatedProductInformationTypeI }
                 *     
                 */
                public void setBookingData(RelatedProductInformationTypeI value) {
                    this.bookingData = value;
                }

                /**
                 * Gets the value of the productIdentifier property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemReferencesAndVersionsType }
                 *     
                 */
                public ItemReferencesAndVersionsType getProductIdentifier() {
                    return productIdentifier;
                }

                /**
                 * Sets the value of the productIdentifier property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemReferencesAndVersionsType }
                 *     
                 */
                public void setProductIdentifier(ItemReferencesAndVersionsType value) {
                    this.productIdentifier = value;
                }

                /**
                 * Gets the value of the compensationInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the compensationInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCompensationInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CompensationType }
                 * 
                 * 
                 */
                public List<CompensationType> getCompensationInfo() {
                    if (compensationInfo == null) {
                        compensationInfo = new ArrayList<CompensationType>();
                    }
                    return this.compensationInfo;
                }

                /**
                 * Gets the value of the compensationInfoViewPermission property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getCompensationInfoViewPermission() {
                    return compensationInfoViewPermission;
                }

                /**
                 * Sets the value of the compensationInfoViewPermission property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setCompensationInfoViewPermission(StatusType129946S value) {
                    this.compensationInfoViewPermission = value;
                }

                /**
                 * Gets the value of the sbrRecordLocator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public ReservationControlInformationTypeI getSbrRecordLocator() {
                    return sbrRecordLocator;
                }

                /**
                 * Sets the value of the sbrRecordLocator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationControlInformationTypeI }
                 *     
                 */
                public void setSbrRecordLocator(ReservationControlInformationTypeI value) {
                    this.sbrRecordLocator = value;
                }

                /**
                 * Gets the value of the flightInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public TravelProductInformationTypeI getFlightInformation() {
                    return flightInformation;
                }

                /**
                 * Sets the value of the flightInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public void setFlightInformation(TravelProductInformationTypeI value) {
                    this.flightInformation = value;
                }

                /**
                 * Gets the value of the ticketInformation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the ticketInformation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTicketInformation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.TicketInformation }
                 * 
                 * 
                 */
                public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.TicketInformation> getTicketInformation() {
                    if (ticketInformation == null) {
                        ticketInformation = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.TicketInformation>();
                    }
                    return this.ticketInformation;
                }

                /**
                 * Gets the value of the comments property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the comments property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getComments().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CommentsType }
                 * 
                 * 
                 */
                public List<CommentsType> getComments() {
                    if (comments == null) {
                        comments = new ArrayList<CommentsType>();
                    }
                    return this.comments;
                }

                /**
                 * Gets the value of the conformanceInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.ConformanceInfo }
                 *     
                 */
                public DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.ConformanceInfo getConformanceInfo() {
                    return conformanceInfo;
                }

                /**
                 * Sets the value of the conformanceInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.ConformanceInfo }
                 *     
                 */
                public void setConformanceInfo(DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.ProductLevel.ConformanceInfo value) {
                    this.conformanceInfo = value;
                }

                /**
                 * Gets the value of the iAppInformation property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the iAppInformation property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIAppInformation().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EdiiAppInformationType }
                 * 
                 * 
                 */
                public List<EdiiAppInformationType> getIAppInformation() {
                    if (iAppInformation == null) {
                        iAppInformation = new ArrayList<EdiiAppInformationType>();
                    }
                    return this.iAppInformation;
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
                 *         &lt;element name="conformanceCheckLocation" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType"/>
                 *         &lt;element name="personalMinuteAdjustment" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_142023S" minOccurs="0"/>
                 *         &lt;element name="conformanceCheckTime" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType" maxOccurs="2" minOccurs="0"/>
                 *         &lt;element name="conformanceInfoAndChecks" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeType" minOccurs="0"/>
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
                    "conformanceCheckLocation",
                    "personalMinuteAdjustment",
                    "conformanceCheckTime",
                    "conformanceInfoAndChecks"
                })
                public static class ConformanceInfo {

                    @XmlElement(required = true)
                    protected PlaceLocationIdentificationType conformanceCheckLocation;
                    protected QuantityType142023S personalMinuteAdjustment;
                    protected List<StructuredDateTimeInformationType> conformanceCheckTime;
                    protected AttributeType conformanceInfoAndChecks;

                    /**
                     * Gets the value of the conformanceCheckLocation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PlaceLocationIdentificationType }
                     *     
                     */
                    public PlaceLocationIdentificationType getConformanceCheckLocation() {
                        return conformanceCheckLocation;
                    }

                    /**
                     * Sets the value of the conformanceCheckLocation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PlaceLocationIdentificationType }
                     *     
                     */
                    public void setConformanceCheckLocation(PlaceLocationIdentificationType value) {
                        this.conformanceCheckLocation = value;
                    }

                    /**
                     * Gets the value of the personalMinuteAdjustment property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link QuantityType142023S }
                     *     
                     */
                    public QuantityType142023S getPersonalMinuteAdjustment() {
                        return personalMinuteAdjustment;
                    }

                    /**
                     * Sets the value of the personalMinuteAdjustment property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link QuantityType142023S }
                     *     
                     */
                    public void setPersonalMinuteAdjustment(QuantityType142023S value) {
                        this.personalMinuteAdjustment = value;
                    }

                    /**
                     * Gets the value of the conformanceCheckTime property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the conformanceCheckTime property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getConformanceCheckTime().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link StructuredDateTimeInformationType }
                     * 
                     * 
                     */
                    public List<StructuredDateTimeInformationType> getConformanceCheckTime() {
                        if (conformanceCheckTime == null) {
                            conformanceCheckTime = new ArrayList<StructuredDateTimeInformationType>();
                        }
                        return this.conformanceCheckTime;
                    }

                    /**
                     * Gets the value of the conformanceInfoAndChecks property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AttributeType }
                     *     
                     */
                    public AttributeType getConformanceInfoAndChecks() {
                        return conformanceInfoAndChecks;
                    }

                    /**
                     * Sets the value of the conformanceInfoAndChecks property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AttributeType }
                     *     
                     */
                    public void setConformanceInfoAndChecks(AttributeType value) {
                        this.conformanceInfoAndChecks = value;
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
                 *         &lt;element name="ticket" type="{http://xml.amadeus.com/APALRR_17_1_1A}TicketNumberType"/>
                 *         &lt;element name="eTicketInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}CouponInformationType" minOccurs="0"/>
                 *         &lt;element name="pricingInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
                 *         &lt;element name="creditCardFraudCheck" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
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
                    "ticket",
                    "eTicketInformation",
                    "pricingInfo",
                    "creditCardFraudCheck"
                })
                public static class TicketInformation {

                    @XmlElement(required = true)
                    protected TicketNumberType ticket;
                    protected CouponInformationType eTicketInformation;
                    protected PricingOrTicketingSubsequentType pricingInfo;
                    protected StatusType129946S creditCardFraudCheck;

                    /**
                     * Gets the value of the ticket property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TicketNumberType }
                     *     
                     */
                    public TicketNumberType getTicket() {
                        return ticket;
                    }

                    /**
                     * Sets the value of the ticket property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TicketNumberType }
                     *     
                     */
                    public void setTicket(TicketNumberType value) {
                        this.ticket = value;
                    }

                    /**
                     * Gets the value of the eTicketInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CouponInformationType }
                     *     
                     */
                    public CouponInformationType getETicketInformation() {
                        return eTicketInformation;
                    }

                    /**
                     * Sets the value of the eTicketInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CouponInformationType }
                     *     
                     */
                    public void setETicketInformation(CouponInformationType value) {
                        this.eTicketInformation = value;
                    }

                    /**
                     * Gets the value of the pricingInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PricingOrTicketingSubsequentType }
                     *     
                     */
                    public PricingOrTicketingSubsequentType getPricingInfo() {
                        return pricingInfo;
                    }

                    /**
                     * Sets the value of the pricingInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PricingOrTicketingSubsequentType }
                     *     
                     */
                    public void setPricingInfo(PricingOrTicketingSubsequentType value) {
                        this.pricingInfo = value;
                    }

                    /**
                     * Gets the value of the creditCardFraudCheck property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StatusType129946S }
                     *     
                     */
                    public StatusType129946S getCreditCardFraudCheck() {
                        return creditCardFraudCheck;
                    }

                    /**
                     * Sets the value of the creditCardFraudCheck property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StatusType129946S }
                     *     
                     */
                    public void setCreditCardFraudCheck(StatusType129946S value) {
                        this.creditCardFraudCheck = value;
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
             *         &lt;element name="travelerDocuments" type="{http://xml.amadeus.com/APALRR_17_1_1A}DocumentMessageTypeU"/>
             *         &lt;element name="regLocationIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="regulatoryDataViewPermission" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
             *         &lt;element name="regDocIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
             *         &lt;element name="passengerData" type="{http://xml.amadeus.com/APALRR_17_1_1A}TravellerInformationType_91760S" minOccurs="0"/>
             *         &lt;element name="documentDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}DateTimePeriodType" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="portRegulatoryInfo" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="documentPort" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_145572S"/>
             *                   &lt;element name="documentUsageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145573S" minOccurs="0"/>
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
                "travelerDocuments",
                "regLocationIdentifier",
                "regulatoryDataViewPermission",
                "regDocIndicator",
                "passengerData",
                "documentDate",
                "portRegulatoryInfo"
            })
            public static class RegulatoryInfo {

                @XmlElement(required = true)
                protected DocumentMessageTypeU travelerDocuments;
                protected List<PlaceLocationIdentificationTypeU> regLocationIdentifier;
                @XmlElement(required = true)
                protected StatusType129946S regulatoryDataViewPermission;
                protected StatusType129946S regDocIndicator;
                protected TravellerInformationType91760S passengerData;
                protected List<DateTimePeriodType> documentDate;
                protected DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo.PortRegulatoryInfo portRegulatoryInfo;

                /**
                 * Gets the value of the travelerDocuments property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DocumentMessageTypeU }
                 *     
                 */
                public DocumentMessageTypeU getTravelerDocuments() {
                    return travelerDocuments;
                }

                /**
                 * Sets the value of the travelerDocuments property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DocumentMessageTypeU }
                 *     
                 */
                public void setTravelerDocuments(DocumentMessageTypeU value) {
                    this.travelerDocuments = value;
                }

                /**
                 * Gets the value of the regLocationIdentifier property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the regLocationIdentifier property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRegLocationIdentifier().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PlaceLocationIdentificationTypeU }
                 * 
                 * 
                 */
                public List<PlaceLocationIdentificationTypeU> getRegLocationIdentifier() {
                    if (regLocationIdentifier == null) {
                        regLocationIdentifier = new ArrayList<PlaceLocationIdentificationTypeU>();
                    }
                    return this.regLocationIdentifier;
                }

                /**
                 * Gets the value of the regulatoryDataViewPermission property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getRegulatoryDataViewPermission() {
                    return regulatoryDataViewPermission;
                }

                /**
                 * Sets the value of the regulatoryDataViewPermission property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setRegulatoryDataViewPermission(StatusType129946S value) {
                    this.regulatoryDataViewPermission = value;
                }

                /**
                 * Gets the value of the regDocIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getRegDocIndicator() {
                    return regDocIndicator;
                }

                /**
                 * Sets the value of the regDocIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setRegDocIndicator(StatusType129946S value) {
                    this.regDocIndicator = value;
                }

                /**
                 * Gets the value of the passengerData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravellerInformationType91760S }
                 *     
                 */
                public TravellerInformationType91760S getPassengerData() {
                    return passengerData;
                }

                /**
                 * Sets the value of the passengerData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravellerInformationType91760S }
                 *     
                 */
                public void setPassengerData(TravellerInformationType91760S value) {
                    this.passengerData = value;
                }

                /**
                 * Gets the value of the documentDate property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the documentDate property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDocumentDate().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DateTimePeriodType }
                 * 
                 * 
                 */
                public List<DateTimePeriodType> getDocumentDate() {
                    if (documentDate == null) {
                        documentDate = new ArrayList<DateTimePeriodType>();
                    }
                    return this.documentDate;
                }

                /**
                 * Gets the value of the portRegulatoryInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo.PortRegulatoryInfo }
                 *     
                 */
                public DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo.PortRegulatoryInfo getPortRegulatoryInfo() {
                    return portRegulatoryInfo;
                }

                /**
                 * Sets the value of the portRegulatoryInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo.PortRegulatoryInfo }
                 *     
                 */
                public void setPortRegulatoryInfo(DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.RegulatoryInfo.PortRegulatoryInfo value) {
                    this.portRegulatoryInfo = value;
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
                 *         &lt;element name="documentPort" type="{http://xml.amadeus.com/APALRR_17_1_1A}PlaceLocationIdentificationType_145572S"/>
                 *         &lt;element name="documentUsageType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145573S" minOccurs="0"/>
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
                    "documentPort",
                    "documentUsageType"
                })
                public static class PortRegulatoryInfo {

                    @XmlElement(required = true)
                    protected PlaceLocationIdentificationType145572S documentPort;
                    protected StatusType145573S documentUsageType;

                    /**
                     * Gets the value of the documentPort property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PlaceLocationIdentificationType145572S }
                     *     
                     */
                    public PlaceLocationIdentificationType145572S getDocumentPort() {
                        return documentPort;
                    }

                    /**
                     * Sets the value of the documentPort property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PlaceLocationIdentificationType145572S }
                     *     
                     */
                    public void setDocumentPort(PlaceLocationIdentificationType145572S value) {
                        this.documentPort = value;
                    }

                    /**
                     * Gets the value of the documentUsageType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StatusType145573S }
                     *     
                     */
                    public StatusType145573S getDocumentUsageType() {
                        return documentUsageType;
                    }

                    /**
                     * Sets the value of the documentUsageType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StatusType145573S }
                     *     
                     */
                    public void setDocumentUsageType(StatusType145573S value) {
                        this.documentUsageType = value;
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
             *         &lt;element name="seatStatusInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
             *         &lt;element name="seatNumberInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_124026S" minOccurs="0"/>
             *         &lt;element name="chargeableSeatDelivered" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
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
                "seatStatusInfo",
                "seatNumberInfo",
                "chargeableSeatDelivered"
            })
            public static class SeatInformation {

                @XmlElement(required = true)
                protected StatusType129946S seatStatusInfo;
                protected SpecialRequirementsDetailsType124026S seatNumberInfo;
                protected StatusType129946S chargeableSeatDelivered;

                /**
                 * Gets the value of the seatStatusInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getSeatStatusInfo() {
                    return seatStatusInfo;
                }

                /**
                 * Sets the value of the seatStatusInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setSeatStatusInfo(StatusType129946S value) {
                    this.seatStatusInfo = value;
                }

                /**
                 * Gets the value of the seatNumberInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecialRequirementsDetailsType124026S }
                 *     
                 */
                public SpecialRequirementsDetailsType124026S getSeatNumberInfo() {
                    return seatNumberInfo;
                }

                /**
                 * Sets the value of the seatNumberInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecialRequirementsDetailsType124026S }
                 *     
                 */
                public void setSeatNumberInfo(SpecialRequirementsDetailsType124026S value) {
                    this.seatNumberInfo = value;
                }

                /**
                 * Gets the value of the chargeableSeatDelivered property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public StatusType129946S getChargeableSeatDelivered() {
                    return chargeableSeatDelivered;
                }

                /**
                 * Sets the value of the chargeableSeatDelivered property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType129946S }
                 *     
                 */
                public void setChargeableSeatDelivered(StatusType129946S value) {
                    this.chargeableSeatDelivered = value;
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
             *         &lt;element name="tocConstant" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType"/>
             *         &lt;element name="bookingReferenceNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType"/>
             *         &lt;element name="tourOperatorCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyInformationType" maxOccurs="2"/>
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
                "tocConstant",
                "bookingReferenceNumber",
                "tourOperatorCode"
            })
            public static class TocDetails {

                @XmlElement(required = true)
                protected SpecialRequirementsDetailsType tocConstant;
                @XmlElement(required = true)
                protected ReferenceInfoType bookingReferenceNumber;
                @XmlElement(required = true)
                protected List<CompanyInformationType> tourOperatorCode;

                /**
                 * Gets the value of the tocConstant property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public SpecialRequirementsDetailsType getTocConstant() {
                    return tocConstant;
                }

                /**
                 * Sets the value of the tocConstant property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public void setTocConstant(SpecialRequirementsDetailsType value) {
                    this.tocConstant = value;
                }

                /**
                 * Gets the value of the bookingReferenceNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType }
                 *     
                 */
                public ReferenceInfoType getBookingReferenceNumber() {
                    return bookingReferenceNumber;
                }

                /**
                 * Sets the value of the bookingReferenceNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType }
                 *     
                 */
                public void setBookingReferenceNumber(ReferenceInfoType value) {
                    this.bookingReferenceNumber = value;
                }

                /**
                 * Gets the value of the tourOperatorCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tourOperatorCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTourOperatorCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CompanyInformationType }
                 * 
                 * 
                 */
                public List<CompanyInformationType> getTourOperatorCode() {
                    if (tourOperatorCode == null) {
                        tourOperatorCode = new ArrayList<CompanyInformationType>();
                    }
                    return this.tourOperatorCode;
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
             *         &lt;element name="voucherIssueReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_200612S"/>
             *         &lt;element name="furtherAuthorisationDetails" maxOccurs="99" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="numberOfVouchers" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_145974S"/>
             *                   &lt;element name="authorisingAgent" type="{http://xml.amadeus.com/APALRR_17_1_1A}UserIdentificationType" minOccurs="0"/>
             *                   &lt;element name="authorisedDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_145935S" minOccurs="0"/>
             *                   &lt;element name="authorisationStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
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
                "voucherIssueReason",
                "furtherAuthorisationDetails"
            })
            public static class VoucherIssueDetails {

                @XmlElement(required = true)
                protected CodedAttributeType200612S voucherIssueReason;
                protected List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails.FurtherAuthorisationDetails> furtherAuthorisationDetails;

                /**
                 * Gets the value of the voucherIssueReason property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodedAttributeType200612S }
                 *     
                 */
                public CodedAttributeType200612S getVoucherIssueReason() {
                    return voucherIssueReason;
                }

                /**
                 * Sets the value of the voucherIssueReason property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodedAttributeType200612S }
                 *     
                 */
                public void setVoucherIssueReason(CodedAttributeType200612S value) {
                    this.voucherIssueReason = value;
                }

                /**
                 * Gets the value of the furtherAuthorisationDetails property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the furtherAuthorisationDetails property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFurtherAuthorisationDetails().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails.FurtherAuthorisationDetails }
                 * 
                 * 
                 */
                public List<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails.FurtherAuthorisationDetails> getFurtherAuthorisationDetails() {
                    if (furtherAuthorisationDetails == null) {
                        furtherAuthorisationDetails = new ArrayList<DCSLSTGetPassengerListReply.FlightDetailsGroup.CustomerLevel.VoucherIssueDetails.FurtherAuthorisationDetails>();
                    }
                    return this.furtherAuthorisationDetails;
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
                 *         &lt;element name="numberOfVouchers" type="{http://xml.amadeus.com/APALRR_17_1_1A}QuantityType_145974S"/>
                 *         &lt;element name="authorisingAgent" type="{http://xml.amadeus.com/APALRR_17_1_1A}UserIdentificationType" minOccurs="0"/>
                 *         &lt;element name="authorisedDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_145935S" minOccurs="0"/>
                 *         &lt;element name="authorisationStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
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
                    "numberOfVouchers",
                    "authorisingAgent",
                    "authorisedDate",
                    "authorisationStatus"
                })
                public static class FurtherAuthorisationDetails {

                    @XmlElement(required = true)
                    protected QuantityType145974S numberOfVouchers;
                    protected UserIdentificationType authorisingAgent;
                    protected StructuredDateTimeInformationType145935S authorisedDate;
                    protected StatusType145987S authorisationStatus;

                    /**
                     * Gets the value of the numberOfVouchers property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link QuantityType145974S }
                     *     
                     */
                    public QuantityType145974S getNumberOfVouchers() {
                        return numberOfVouchers;
                    }

                    /**
                     * Sets the value of the numberOfVouchers property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link QuantityType145974S }
                     *     
                     */
                    public void setNumberOfVouchers(QuantityType145974S value) {
                        this.numberOfVouchers = value;
                    }

                    /**
                     * Gets the value of the authorisingAgent property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link UserIdentificationType }
                     *     
                     */
                    public UserIdentificationType getAuthorisingAgent() {
                        return authorisingAgent;
                    }

                    /**
                     * Sets the value of the authorisingAgent property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UserIdentificationType }
                     *     
                     */
                    public void setAuthorisingAgent(UserIdentificationType value) {
                        this.authorisingAgent = value;
                    }

                    /**
                     * Gets the value of the authorisedDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StructuredDateTimeInformationType145935S }
                     *     
                     */
                    public StructuredDateTimeInformationType145935S getAuthorisedDate() {
                        return authorisedDate;
                    }

                    /**
                     * Sets the value of the authorisedDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StructuredDateTimeInformationType145935S }
                     *     
                     */
                    public void setAuthorisedDate(StructuredDateTimeInformationType145935S value) {
                        this.authorisedDate = value;
                    }

                    /**
                     * Gets the value of the authorisationStatus property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link StatusType145987S }
                     *     
                     */
                    public StatusType145987S getAuthorisationStatus() {
                        return authorisationStatus;
                    }

                    /**
                     * Sets the value of the authorisationStatus property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link StatusType145987S }
                     *     
                     */
                    public void setAuthorisationStatus(StatusType145987S value) {
                        this.authorisationStatus = value;
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
         *         &lt;element name="linkIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_160432S"/>
         *         &lt;element name="linkType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S"/>
         *         &lt;element name="linkProductIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" maxOccurs="99"/>
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
            "linkIdentifier",
            "linkType",
            "linkProductIdentifier"
        })
        public static class LinkElements {

            @XmlElement(required = true)
            protected ReferenceInfoType160432S linkIdentifier;
            @XmlElement(required = true)
            protected StatusType129946S linkType;
            @XmlElement(required = true)
            protected List<ItemReferencesAndVersionsType> linkProductIdentifier;

            /**
             * Gets the value of the linkIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType160432S }
             *     
             */
            public ReferenceInfoType160432S getLinkIdentifier() {
                return linkIdentifier;
            }

            /**
             * Sets the value of the linkIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType160432S }
             *     
             */
            public void setLinkIdentifier(ReferenceInfoType160432S value) {
                this.linkIdentifier = value;
            }

            /**
             * Gets the value of the linkType property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType129946S }
             *     
             */
            public StatusType129946S getLinkType() {
                return linkType;
            }

            /**
             * Sets the value of the linkType property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType129946S }
             *     
             */
            public void setLinkType(StatusType129946S value) {
                this.linkType = value;
            }

            /**
             * Gets the value of the linkProductIdentifier property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the linkProductIdentifier property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLinkProductIdentifier().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ItemReferencesAndVersionsType }
             * 
             * 
             */
            public List<ItemReferencesAndVersionsType> getLinkProductIdentifier() {
                if (linkProductIdentifier == null) {
                    linkProductIdentifier = new ArrayList<ItemReferencesAndVersionsType>();
                }
                return this.linkProductIdentifier;
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
         *         &lt;element name="cabin" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType"/>
         *         &lt;element name="total" type="{http://xml.amadeus.com/APALRR_17_1_1A}NumberOfUnitsType" maxOccurs="2"/>
         *         &lt;element name="cabinIndicators" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="2"/>
         *         &lt;element name="bookingClasses" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductInformationType" minOccurs="0"/>
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
            "total",
            "cabinIndicators",
            "bookingClasses"
        })
        public static class TotalByCabin {

            @XmlElement(required = true)
            protected CabinDetailsType cabin;
            @XmlElement(required = true)
            protected List<NumberOfUnitsType> total;
            @XmlElement(required = true)
            protected List<StatusType129946S> cabinIndicators;
            protected ProductInformationType bookingClasses;

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
             * Gets the value of the total property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the total property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTotal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link NumberOfUnitsType }
             * 
             * 
             */
            public List<NumberOfUnitsType> getTotal() {
                if (total == null) {
                    total = new ArrayList<NumberOfUnitsType>();
                }
                return this.total;
            }

            /**
             * Gets the value of the cabinIndicators property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinIndicators property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinIndicators().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusType129946S }
             * 
             * 
             */
            public List<StatusType129946S> getCabinIndicators() {
                if (cabinIndicators == null) {
                    cabinIndicators = new ArrayList<StatusType129946S>();
                }
                return this.cabinIndicators;
            }

            /**
             * Gets the value of the bookingClasses property.
             * 
             * @return
             *     possible object is
             *     {@link ProductInformationType }
             *     
             */
            public ProductInformationType getBookingClasses() {
                return bookingClasses;
            }

            /**
             * Sets the value of the bookingClasses property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProductInformationType }
             *     
             */
            public void setBookingClasses(ProductInformationType value) {
                this.bookingClasses = value;
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
     *         &lt;element name="dummy" type="{http://xml.amadeus.com/APALRR_17_1_1A}DummySegmentTypeI"/>
     *         &lt;element name="andFiltersQuery" type="{http://xml.amadeus.com/APALRR_17_1_1A}DCSLST_GetPassengerListReply_andFiltersQuery" maxOccurs="7"/>
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
        "dummy",
        "andFiltersQuery"
    })
    public static class OrFiltersQuery {

        @XmlElement(required = true)
        protected DummySegmentTypeI dummy;
        @XmlElement(required = true)
        protected List<DCSLSTGetPassengerListReplyAndFiltersQuery> andFiltersQuery;

        /**
         * Gets the value of the dummy property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getDummy() {
            return dummy;
        }

        /**
         * Sets the value of the dummy property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setDummy(DummySegmentTypeI value) {
            this.dummy = value;
        }

        /**
         * Gets the value of the andFiltersQuery property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the andFiltersQuery property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAndFiltersQuery().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DCSLSTGetPassengerListReplyAndFiltersQuery }
         * 
         * 
         */
        public List<DCSLSTGetPassengerListReplyAndFiltersQuery> getAndFiltersQuery() {
            if (andFiltersQuery == null) {
                andFiltersQuery = new ArrayList<DCSLSTGetPassengerListReplyAndFiltersQuery>();
            }
            return this.andFiltersQuery;
        }

    }

}
