
package com.amadeus.xml.pnracc_17_1_1a;

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
 *         &lt;element name="generalErrorInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_212789G" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="pnrHeader" maxOccurs="198" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationType"/>
 *                   &lt;element name="referenceForRecordLocator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationSecurityInformationType_204487S" minOccurs="0"/>
 *         &lt;element name="queueInformations" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QueueType" minOccurs="0"/>
 *         &lt;element name="numberOfUnits" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsTypeI" minOccurs="0"/>
 *         &lt;element name="pnrType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType" minOccurs="0"/>
 *         &lt;element name="freetextData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="pnrHeaderTag" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType_186270S" minOccurs="0"/>
 *         &lt;element name="freeFormText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_136698S" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="historyData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PnrHistoryDataType" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="sbrPOSDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}POSGroupType"/>
 *         &lt;element name="sbrCreationPosDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}POSGroupType"/>
 *         &lt;element name="sbrUpdatorPosDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}POSGroupType"/>
 *         &lt;element name="technicalData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enveloppeNumberData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU"/>
 *                   &lt;element name="lastTransmittedEnvelopeNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PnrHistoryDataType_27157S" minOccurs="0"/>
 *                   &lt;element name="purgeDateData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_27086S" minOccurs="0"/>
 *                   &lt;element name="generalPNRInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_32775S" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="travellerInfo" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
 *                   &lt;element name="passengerData" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationType_185946S"/>
 *                             &lt;element name="groupCounters" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType_76106S" minOccurs="0"/>
 *                             &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType_32722S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="enhancedPassengerData" maxOccurs="2" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}EnhancedTravellerInformationType"/>
 *                             &lt;element name="groupCountersInEnhancedPaxData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType_76106S" minOccurs="0"/>
 *                             &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType_32722S" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="nameError" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="originDestinationDetails" maxOccurs="50" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI_3061S"/>
 *                   &lt;element name="itineraryInfo" maxOccurs="99" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
 *                             &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193100S" minOccurs="0"/>
 *                             &lt;element name="itineraryMessageAction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MessageActionDetailsType" minOccurs="0"/>
 *                             &lt;element name="itineraryReservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" minOccurs="0"/>
 *                             &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RelatedProductInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType" minOccurs="0"/>
 *                             &lt;element name="reasonForIssuanceCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
 *                             &lt;element name="flightDetail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CabinDetailsType" minOccurs="0"/>
 *                             &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI_201122S" minOccurs="0"/>
 *                             &lt;element name="segmentAttribute" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_213992S" minOccurs="0"/>
 *                             &lt;element name="carbonDioxydeInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="carbonDioxydeAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityType"/>
 *                                       &lt;element name="carbonDioxydeInfoSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="itineraryfreeFormText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextType" maxOccurs="9" minOccurs="0"/>
 *                             &lt;element name="itineraryFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" minOccurs="0"/>
 *                             &lt;element name="distributionMethod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MethodType" minOccurs="0"/>
 *                             &lt;element name="hotelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelProductInformationType" minOccurs="0"/>
 *                             &lt;element name="rateInformations" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RateInformationType" minOccurs="0"/>
 *                             &lt;element name="generalOption" type="{http://xml.amadeus.com/PNRACC_17_1_1A}GeneralOptionType" maxOccurs="199" minOccurs="0"/>
 *                             &lt;element name="country" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CountryCodeListType" minOccurs="0"/>
 *                             &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxTypeI" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="customerTransactionData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CustomerTransactionDataType" minOccurs="0"/>
 *                             &lt;element name="yieldGroup" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ODKeyPerformanceDataType"/>
 *                                       &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ONDType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="legInfo" maxOccurs="99" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FlightSegmentDetailsTypeI"/>
 *                                       &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_99362S"/>
 *                                       &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_99363S" maxOccurs="2" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="flixInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FLIXType" maxOccurs="4" minOccurs="0"/>
 *                             &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType" minOccurs="0"/>
 *                             &lt;element name="lccTypicalData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_28460S"/>
 *                                       &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType_6550S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="insuranceInformation" maxOccurs="198" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceNameType"/>
 *                                       &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
 *                                       &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInsuranceInformationType" minOccurs="0"/>
 *                                       &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerDocumentInformationTypeU" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="insuranceDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceBusinessDataType" minOccurs="0"/>
 *                             &lt;element name="hotelReservationInfo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelPropertyType"/>
 *                                       &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
 *                                       &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207579S"/>
 *                                       &lt;element name="roomRateDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomType"/>
 *                                                 &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
 *                                                 &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI"/>
 *                                                 &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="3"/>
 *                                       &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemNumberTypeU_33258S" minOccurs="0"/>
 *                                       &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_215330S"/>
 *                                       &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
 *                                       &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType_38226S" minOccurs="0"/>
 *                                       &lt;element name="guaranteeOrDeposit" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentInformationTypeI"/>
 *                                                 &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI_29553S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_664S" maxOccurs="5" minOccurs="0"/>
 *                                       &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
 *                                       &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ContactInformationTypeU" minOccurs="0"/>
 *                                       &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameAndAddressBatchTypeU" minOccurs="0"/>
 *                                       &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DocumentInformationDetailsTypeI_207581S" minOccurs="0"/>
 *                                       &lt;element name="arrivalFlightDetails" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193102S"/>
 *                                                 &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalTransportDetailsTypeU"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType_99582S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typicalCarData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VehicleInformationType"/>
 *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
 *                                       &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_136704S" minOccurs="0"/>
 *                                       &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
 *                                       &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="6"/>
 *                                       &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136710S"/>
 *                                                 &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S"/>
 *                                       &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="rateCodeGroup" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareQualifierDetailsTypeI"/>
 *                                                 &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
 *                                       &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136706S" maxOccurs="10" minOccurs="0"/>
 *                                       &lt;element name="errorWarning" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationErrorInformationType"/>
 *                                                 &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="rulesPoliciesGroup" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
 *                                                 &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/>
 *                                                 &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
 *                                                 &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S"/>
 *                                                           &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
 *                                                           &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
 *                                                                     &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136719S"/>
 *                                                                     &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU_136720S"/>
 *                                                           &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S" maxOccurs="2" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_136722S"/>
 *                                                           &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136721S" minOccurs="0"/>
 *                                                           &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_136724S" maxOccurs="10" minOccurs="0"/>
 *                                                           &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_136723S" maxOccurs="2" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
 *                                                           &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
 *                                                                     &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                           &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136715S" minOccurs="0"/>
 *                                                           &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S" maxOccurs="6"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI" minOccurs="0"/>
 *                                       &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
 *                                       &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
 *                                       &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationTypeI" minOccurs="0"/>
 *                                       &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_136698S" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_136700S" maxOccurs="6" minOccurs="0"/>
 *                                       &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityTypeI" maxOccurs="2" minOccurs="0"/>
 *                                       &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameTypeU_136701S" minOccurs="0"/>
 *                                       &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AgreementIdentificationTypeU" minOccurs="0"/>
 *                                       &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketNumberTypeI" minOccurs="0"/>
 *                                       &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommunicationContactTypeU" minOccurs="0"/>
 *                                       &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="typicalCruiseData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CruiseBusinessDataType" minOccurs="0"/>
 *                             &lt;element name="railInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TrainInformationType" minOccurs="0"/>
 *                             &lt;element name="markerRailTour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
 *                             &lt;element name="tourInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationType" minOccurs="0"/>
 *                             &lt;element name="ferryLegInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FerryBookingDescriptionType" minOccurs="0"/>
 *                             &lt;element name="errorInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
 *                             &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
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
 *         &lt;element name="segmentGroupingInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SegmentGroupingInformationType" maxOccurs="50" minOccurs="0"/>
 *         &lt;element name="dataElementsMaster" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="marker2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
 *                   &lt;element name="dataElementsIndiv" maxOccurs="999" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
 *                             &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRACC_17_1_1A}IndividualPnrSecurityInformationType" minOccurs="0"/>
 *                             &lt;element name="accounting" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AccountingInformationElementType" minOccurs="0"/>
 *                             &lt;element name="miscellaneousRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_211S" minOccurs="0"/>
 *                             &lt;element name="extendedRemark" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExtendedRemarkType" minOccurs="0"/>
 *                             &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsTypeI" minOccurs="0"/>
 *                             &lt;element name="seatPaxInfo" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SeatRequestParametersTypeI"/>
 *                                       &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" minOccurs="0"/>
 *                                       &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_6074S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="reasonForIssuanceCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType_195222S" minOccurs="0"/>
 *                             &lt;element name="railSeatPreferences" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatPreferencesType" minOccurs="0"/>
 *                             &lt;element name="cityPair" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
 *                                       &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="railSeatDetails" maxOccurs="9" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatReferenceInformationType"/>
 *                                       &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_29860S" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
 *                             &lt;element name="frequentFlyerInformationGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentFlyerInformationGroupType" minOccurs="0"/>
 *                             &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketElementType" minOccurs="0"/>
 *                             &lt;element name="referencedRecord" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S"/>
 *                                       &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationSecurityInformationType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OptionElementType" minOccurs="0"/>
 *                             &lt;element name="otherDataFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredAddressType" minOccurs="0"/>
 *                             &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" maxOccurs="2" minOccurs="0"/>
 *                             &lt;element name="elementErrorInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
 *                             &lt;element name="mcoRecord" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousChargeOrderType"/>
 *                                       &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
 *                                       &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU"/>
 *                                                 &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
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
 *                             &lt;element name="totalPrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TotalPriceType" minOccurs="0"/>
 *                             &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="eltPosDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}POSGroupType_150634G" minOccurs="0"/>
 *                             &lt;element name="accessLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExtendedOwnershipSecurityDetailsType" maxOccurs="4" minOccurs="0"/>
 *                             &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
 *                             &lt;element name="structuredFop" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FOPRepresentationType" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="ssrPackageInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SSRPackInformation" maxOccurs="50" minOccurs="0"/>
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
 *         &lt;element name="tstData" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tstGeneralInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TstGeneralInformationType"/>
 *                   &lt;element name="tstFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" maxOccurs="2" minOccurs="0"/>
 *                   &lt;element name="fareBasisInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareBasisCodesLineType" minOccurs="0"/>
 *                   &lt;element name="fareData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareDataType" minOccurs="0"/>
 *                   &lt;element name="segmentAssociation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI_201122S" minOccurs="0"/>
 *                   &lt;element name="referenceForTstData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pricingRecordGroup" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pricingRecordData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingTicketingDetailsType"/>
 *                   &lt;element name="productPricingQuotationRecord" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PPQRdataType" maxOccurs="99" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dcsData" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="markerPax" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerFlightDetailsTypeI"/>
 *                   &lt;element name="markerSegment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerFlightDetailsTypeI"/>
 *                   &lt;element name="segmentSection" maxOccurs="19602" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elementManagementStructData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_127983S"/>
 *                             &lt;element name="referenceForStructDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
 *                             &lt;element name="dcsSegmentInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="booking" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI"/>
 *                                       &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
 *                                       &lt;element name="typeOfCOP" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127282S" minOccurs="0"/>
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
 *                   &lt;element name="markerLeg" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerFlightDetailsTypeI"/>
 *                   &lt;element name="legSection" maxOccurs="176418" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elementManagementStructData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_127983S"/>
 *                             &lt;element name="referenceForStructDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
 *                             &lt;element name="dcsLegInfo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="legPosition" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelItineraryInformationTypeI"/>
 *                                       &lt;element name="leg" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI"/>
 *                                       &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
 *                                       &lt;element name="seatDelivery" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
 *                                       &lt;element name="paxStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_127261S" minOccurs="0"/>
 *                                       &lt;element name="accregReason" maxOccurs="2" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="reasons" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127279S"/>
 *                                                 &lt;element name="deliveryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="regradeCabin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SegmentCabinIdentificationType" minOccurs="0"/>
 *                                       &lt;element name="acceptanceChannel" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="acceptanceOrigin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_127265S"/>
 *                                                 &lt;element name="applicationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationType"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="compensationData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompensationType" minOccurs="0"/>
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
    "generalErrorInfo",
    "pnrHeader",
    "securityInformation",
    "queueInformations",
    "numberOfUnits",
    "pnrType",
    "freetextData",
    "pnrHeaderTag",
    "freeFormText",
    "historyData",
    "sbrPOSDetails",
    "sbrCreationPosDetails",
    "sbrUpdatorPosDetails",
    "technicalData",
    "travellerInfo",
    "originDestinationDetails",
    "segmentGroupingInfo",
    "dataElementsMaster",
    "tstData",
    "pricingRecordGroup",
    "dcsData"
})
@XmlRootElement(name = "PNR_Reply")
public class PNRReply {

    protected List<ErrorGroupType212789G> generalErrorInfo;
    protected List<PNRReply.PnrHeader> pnrHeader;
    protected ReservationSecurityInformationType204487S securityInformation;
    protected QueueType queueInformations;
    protected NumberOfUnitsTypeI numberOfUnits;
    protected CodedAttributeType pnrType;
    protected List<LongFreeTextType> freetextData;
    protected StatusType186270S pnrHeaderTag;
    protected List<InteractiveFreeTextTypeI136698S> freeFormText;
    protected List<PnrHistoryDataType> historyData;
    @XmlElement(required = true)
    protected POSGroupType sbrPOSDetails;
    @XmlElement(required = true)
    protected POSGroupType sbrCreationPosDetails;
    @XmlElement(required = true)
    protected POSGroupType sbrUpdatorPosDetails;
    protected PNRReply.TechnicalData technicalData;
    protected List<PNRReply.TravellerInfo> travellerInfo;
    protected List<PNRReply.OriginDestinationDetails> originDestinationDetails;
    protected List<SegmentGroupingInformationType> segmentGroupingInfo;
    protected PNRReply.DataElementsMaster dataElementsMaster;
    protected List<PNRReply.TstData> tstData;
    protected PNRReply.PricingRecordGroup pricingRecordGroup;
    protected PNRReply.DcsData dcsData;

    /**
     * Gets the value of the generalErrorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalErrorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralErrorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType212789G }
     * 
     * 
     */
    public List<ErrorGroupType212789G> getGeneralErrorInfo() {
        if (generalErrorInfo == null) {
            generalErrorInfo = new ArrayList<ErrorGroupType212789G>();
        }
        return this.generalErrorInfo;
    }

    /**
     * Gets the value of the pnrHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.PnrHeader }
     * 
     * 
     */
    public List<PNRReply.PnrHeader> getPnrHeader() {
        if (pnrHeader == null) {
            pnrHeader = new ArrayList<PNRReply.PnrHeader>();
        }
        return this.pnrHeader;
    }

    /**
     * Gets the value of the securityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReservationSecurityInformationType204487S }
     *     
     */
    public ReservationSecurityInformationType204487S getSecurityInformation() {
        return securityInformation;
    }

    /**
     * Sets the value of the securityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReservationSecurityInformationType204487S }
     *     
     */
    public void setSecurityInformation(ReservationSecurityInformationType204487S value) {
        this.securityInformation = value;
    }

    /**
     * Gets the value of the queueInformations property.
     * 
     * @return
     *     possible object is
     *     {@link QueueType }
     *     
     */
    public QueueType getQueueInformations() {
        return queueInformations;
    }

    /**
     * Sets the value of the queueInformations property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueType }
     *     
     */
    public void setQueueInformations(QueueType value) {
        this.queueInformations = value;
    }

    /**
     * Gets the value of the numberOfUnits property.
     * 
     * @return
     *     possible object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public NumberOfUnitsTypeI getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Sets the value of the numberOfUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumberOfUnitsTypeI }
     *     
     */
    public void setNumberOfUnits(NumberOfUnitsTypeI value) {
        this.numberOfUnits = value;
    }

    /**
     * Gets the value of the pnrType property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType }
     *     
     */
    public CodedAttributeType getPnrType() {
        return pnrType;
    }

    /**
     * Sets the value of the pnrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType }
     *     
     */
    public void setPnrType(CodedAttributeType value) {
        this.pnrType = value;
    }

    /**
     * Gets the value of the freetextData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freetextData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreetextData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LongFreeTextType }
     * 
     * 
     */
    public List<LongFreeTextType> getFreetextData() {
        if (freetextData == null) {
            freetextData = new ArrayList<LongFreeTextType>();
        }
        return this.freetextData;
    }

    /**
     * Gets the value of the pnrHeaderTag property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType186270S }
     *     
     */
    public StatusType186270S getPnrHeaderTag() {
        return pnrHeaderTag;
    }

    /**
     * Sets the value of the pnrHeaderTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType186270S }
     *     
     */
    public void setPnrHeaderTag(StatusType186270S value) {
        this.pnrHeaderTag = value;
    }

    /**
     * Gets the value of the freeFormText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeFormText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeFormText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractiveFreeTextTypeI136698S }
     * 
     * 
     */
    public List<InteractiveFreeTextTypeI136698S> getFreeFormText() {
        if (freeFormText == null) {
            freeFormText = new ArrayList<InteractiveFreeTextTypeI136698S>();
        }
        return this.freeFormText;
    }

    /**
     * Gets the value of the historyData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PnrHistoryDataType }
     * 
     * 
     */
    public List<PnrHistoryDataType> getHistoryData() {
        if (historyData == null) {
            historyData = new ArrayList<PnrHistoryDataType>();
        }
        return this.historyData;
    }

    /**
     * Gets the value of the sbrPOSDetails property.
     * 
     * @return
     *     possible object is
     *     {@link POSGroupType }
     *     
     */
    public POSGroupType getSbrPOSDetails() {
        return sbrPOSDetails;
    }

    /**
     * Sets the value of the sbrPOSDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSGroupType }
     *     
     */
    public void setSbrPOSDetails(POSGroupType value) {
        this.sbrPOSDetails = value;
    }

    /**
     * Gets the value of the sbrCreationPosDetails property.
     * 
     * @return
     *     possible object is
     *     {@link POSGroupType }
     *     
     */
    public POSGroupType getSbrCreationPosDetails() {
        return sbrCreationPosDetails;
    }

    /**
     * Sets the value of the sbrCreationPosDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSGroupType }
     *     
     */
    public void setSbrCreationPosDetails(POSGroupType value) {
        this.sbrCreationPosDetails = value;
    }

    /**
     * Gets the value of the sbrUpdatorPosDetails property.
     * 
     * @return
     *     possible object is
     *     {@link POSGroupType }
     *     
     */
    public POSGroupType getSbrUpdatorPosDetails() {
        return sbrUpdatorPosDetails;
    }

    /**
     * Sets the value of the sbrUpdatorPosDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link POSGroupType }
     *     
     */
    public void setSbrUpdatorPosDetails(POSGroupType value) {
        this.sbrUpdatorPosDetails = value;
    }

    /**
     * Gets the value of the technicalData property.
     * 
     * @return
     *     possible object is
     *     {@link PNRReply.TechnicalData }
     *     
     */
    public PNRReply.TechnicalData getTechnicalData() {
        return technicalData;
    }

    /**
     * Sets the value of the technicalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRReply.TechnicalData }
     *     
     */
    public void setTechnicalData(PNRReply.TechnicalData value) {
        this.technicalData = value;
    }

    /**
     * Gets the value of the travellerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travellerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravellerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.TravellerInfo }
     * 
     * 
     */
    public List<PNRReply.TravellerInfo> getTravellerInfo() {
        if (travellerInfo == null) {
            travellerInfo = new ArrayList<PNRReply.TravellerInfo>();
        }
        return this.travellerInfo;
    }

    /**
     * Gets the value of the originDestinationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.OriginDestinationDetails }
     * 
     * 
     */
    public List<PNRReply.OriginDestinationDetails> getOriginDestinationDetails() {
        if (originDestinationDetails == null) {
            originDestinationDetails = new ArrayList<PNRReply.OriginDestinationDetails>();
        }
        return this.originDestinationDetails;
    }

    /**
     * Gets the value of the segmentGroupingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentGroupingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentGroupingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentGroupingInformationType }
     * 
     * 
     */
    public List<SegmentGroupingInformationType> getSegmentGroupingInfo() {
        if (segmentGroupingInfo == null) {
            segmentGroupingInfo = new ArrayList<SegmentGroupingInformationType>();
        }
        return this.segmentGroupingInfo;
    }

    /**
     * Gets the value of the dataElementsMaster property.
     * 
     * @return
     *     possible object is
     *     {@link PNRReply.DataElementsMaster }
     *     
     */
    public PNRReply.DataElementsMaster getDataElementsMaster() {
        return dataElementsMaster;
    }

    /**
     * Sets the value of the dataElementsMaster property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRReply.DataElementsMaster }
     *     
     */
    public void setDataElementsMaster(PNRReply.DataElementsMaster value) {
        this.dataElementsMaster = value;
    }

    /**
     * Gets the value of the tstData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tstData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTstData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRReply.TstData }
     * 
     * 
     */
    public List<PNRReply.TstData> getTstData() {
        if (tstData == null) {
            tstData = new ArrayList<PNRReply.TstData>();
        }
        return this.tstData;
    }

    /**
     * Gets the value of the pricingRecordGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PNRReply.PricingRecordGroup }
     *     
     */
    public PNRReply.PricingRecordGroup getPricingRecordGroup() {
        return pricingRecordGroup;
    }

    /**
     * Sets the value of the pricingRecordGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRReply.PricingRecordGroup }
     *     
     */
    public void setPricingRecordGroup(PNRReply.PricingRecordGroup value) {
        this.pricingRecordGroup = value;
    }

    /**
     * Gets the value of the dcsData property.
     * 
     * @return
     *     possible object is
     *     {@link PNRReply.DcsData }
     *     
     */
    public PNRReply.DcsData getDcsData() {
        return dcsData;
    }

    /**
     * Sets the value of the dcsData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRReply.DcsData }
     *     
     */
    public void setDcsData(PNRReply.DcsData value) {
        this.dcsData = value;
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
     *         &lt;element name="marker2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
     *         &lt;element name="dataElementsIndiv" maxOccurs="999" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
     *                   &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRACC_17_1_1A}IndividualPnrSecurityInformationType" minOccurs="0"/>
     *                   &lt;element name="accounting" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AccountingInformationElementType" minOccurs="0"/>
     *                   &lt;element name="miscellaneousRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_211S" minOccurs="0"/>
     *                   &lt;element name="extendedRemark" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExtendedRemarkType" minOccurs="0"/>
     *                   &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="seatPaxInfo" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SeatRequestParametersTypeI"/>
     *                             &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" minOccurs="0"/>
     *                             &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_6074S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="reasonForIssuanceCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType_195222S" minOccurs="0"/>
     *                   &lt;element name="railSeatPreferences" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatPreferencesType" minOccurs="0"/>
     *                   &lt;element name="cityPair" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
     *                             &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="railSeatDetails" maxOccurs="9" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatReferenceInformationType"/>
     *                             &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_29860S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="frequentFlyerInformationGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentFlyerInformationGroupType" minOccurs="0"/>
     *                   &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketElementType" minOccurs="0"/>
     *                   &lt;element name="referencedRecord" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S"/>
     *                             &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationSecurityInformationType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OptionElementType" minOccurs="0"/>
     *                   &lt;element name="otherDataFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredAddressType" minOccurs="0"/>
     *                   &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" maxOccurs="2" minOccurs="0"/>
     *                   &lt;element name="elementErrorInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
     *                   &lt;element name="mcoRecord" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousChargeOrderType"/>
     *                             &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
     *                             &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU"/>
     *                                       &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
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
     *                   &lt;element name="totalPrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TotalPriceType" minOccurs="0"/>
     *                   &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="eltPosDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}POSGroupType_150634G" minOccurs="0"/>
     *                   &lt;element name="accessLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExtendedOwnershipSecurityDetailsType" maxOccurs="4" minOccurs="0"/>
     *                   &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
     *                   &lt;element name="structuredFop" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FOPRepresentationType" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="ssrPackageInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SSRPackInformation" maxOccurs="50" minOccurs="0"/>
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
        "marker2",
        "dataElementsIndiv"
    })
    public static class DataElementsMaster {

        @XmlElement(required = true)
        protected DummySegmentTypeI marker2;
        protected List<PNRReply.DataElementsMaster.DataElementsIndiv> dataElementsIndiv;

        /**
         * Gets the value of the marker2 property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getMarker2() {
            return marker2;
        }

        /**
         * Sets the value of the marker2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setMarker2(DummySegmentTypeI value) {
            this.marker2 = value;
        }

        /**
         * Gets the value of the dataElementsIndiv property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dataElementsIndiv property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDataElementsIndiv().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.DataElementsMaster.DataElementsIndiv }
         * 
         * 
         */
        public List<PNRReply.DataElementsMaster.DataElementsIndiv> getDataElementsIndiv() {
            if (dataElementsIndiv == null) {
                dataElementsIndiv = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv>();
            }
            return this.dataElementsIndiv;
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
         *         &lt;element name="elementManagementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
         *         &lt;element name="pnrSecurity" type="{http://xml.amadeus.com/PNRACC_17_1_1A}IndividualPnrSecurityInformationType" minOccurs="0"/>
         *         &lt;element name="accounting" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AccountingInformationElementType" minOccurs="0"/>
         *         &lt;element name="miscellaneousRemarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_211S" minOccurs="0"/>
         *         &lt;element name="extendedRemark" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExtendedRemarkType" minOccurs="0"/>
         *         &lt;element name="serviceRequest" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="seatPaxInfo" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SeatRequestParametersTypeI"/>
         *                   &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" minOccurs="0"/>
         *                   &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_6074S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="reasonForIssuanceCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType_195222S" minOccurs="0"/>
         *         &lt;element name="railSeatPreferences" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatPreferencesType" minOccurs="0"/>
         *         &lt;element name="cityPair" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
         *                   &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="railSeatDetails" maxOccurs="9" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatReferenceInformationType"/>
         *                   &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_29860S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="dateAndTimeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationTypeI" minOccurs="0"/>
         *         &lt;element name="frequentFlyerInformationGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentFlyerInformationGroupType" minOccurs="0"/>
         *         &lt;element name="ticketElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketElementType" minOccurs="0"/>
         *         &lt;element name="referencedRecord" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S"/>
         *                   &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationSecurityInformationType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="optionElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OptionElementType" minOccurs="0"/>
         *         &lt;element name="otherDataFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="structuredAddress" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredAddressType" minOccurs="0"/>
         *         &lt;element name="monetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" maxOccurs="2" minOccurs="0"/>
         *         &lt;element name="elementErrorInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
         *         &lt;element name="mcoRecord" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousChargeOrderType"/>
         *                   &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
         *                   &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU"/>
         *                             &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
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
         *         &lt;element name="totalPrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TotalPriceType" minOccurs="0"/>
         *         &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="eltPosDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}POSGroupType_150634G" minOccurs="0"/>
         *         &lt;element name="accessLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ExtendedOwnershipSecurityDetailsType" maxOccurs="4" minOccurs="0"/>
         *         &lt;element name="referenceForDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
         *         &lt;element name="structuredFop" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FOPRepresentationType" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="ssrPackageInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SSRPackInformation" maxOccurs="50" minOccurs="0"/>
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
            "elementManagementData",
            "pnrSecurity",
            "accounting",
            "miscellaneousRemarks",
            "extendedRemark",
            "serviceRequest",
            "seatPaxInfo",
            "reasonForIssuanceCode",
            "railSeatPreferences",
            "cityPair",
            "railSeatDetails",
            "dateAndTimeInformation",
            "frequentFlyerInformationGroup",
            "ticketElement",
            "referencedRecord",
            "optionElement",
            "otherDataFreetext",
            "structuredAddress",
            "monetaryInformation",
            "elementErrorInformation",
            "mcoRecord",
            "totalPrice",
            "elementsIndicators",
            "eltPosDetails",
            "accessLevel",
            "referenceForDataElement",
            "structuredFop",
            "ssrPackageInformation"
        })
        public static class DataElementsIndiv {

            @XmlElement(required = true)
            protected ElementManagementSegmentType elementManagementData;
            protected IndividualPnrSecurityInformationType pnrSecurity;
            protected AccountingInformationElementType accounting;
            protected MiscellaneousRemarksType211S miscellaneousRemarks;
            protected ExtendedRemarkType extendedRemark;
            protected SpecialRequirementsDetailsTypeI serviceRequest;
            protected List<PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo> seatPaxInfo;
            protected PricingOrTicketingSubsequentType195222S reasonForIssuanceCode;
            protected RailSeatPreferencesType railSeatPreferences;
            protected PNRReply.DataElementsMaster.DataElementsIndiv.CityPair cityPair;
            protected List<PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails> railSeatDetails;
            protected DateAndTimeInformationTypeI dateAndTimeInformation;
            protected FrequentFlyerInformationGroupType frequentFlyerInformationGroup;
            protected TicketElementType ticketElement;
            protected PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord referencedRecord;
            protected OptionElementType optionElement;
            protected List<LongFreeTextType> otherDataFreetext;
            protected StructuredAddressType structuredAddress;
            protected List<MonetaryInformationTypeI1689S> monetaryInformation;
            protected ErrorGroupType223552G elementErrorInformation;
            protected PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord mcoRecord;
            protected TotalPriceType totalPrice;
            protected List<StatusTypeI196879S> elementsIndicators;
            protected POSGroupType150634G eltPosDetails;
            protected List<ExtendedOwnershipSecurityDetailsType> accessLevel;
            protected ReferenceInfoType referenceForDataElement;
            protected List<FOPRepresentationType> structuredFop;
            protected List<SSRPackInformation> ssrPackageInformation;

            /**
             * Gets the value of the elementManagementData property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public ElementManagementSegmentType getElementManagementData() {
                return elementManagementData;
            }

            /**
             * Sets the value of the elementManagementData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public void setElementManagementData(ElementManagementSegmentType value) {
                this.elementManagementData = value;
            }

            /**
             * Gets the value of the pnrSecurity property.
             * 
             * @return
             *     possible object is
             *     {@link IndividualPnrSecurityInformationType }
             *     
             */
            public IndividualPnrSecurityInformationType getPnrSecurity() {
                return pnrSecurity;
            }

            /**
             * Sets the value of the pnrSecurity property.
             * 
             * @param value
             *     allowed object is
             *     {@link IndividualPnrSecurityInformationType }
             *     
             */
            public void setPnrSecurity(IndividualPnrSecurityInformationType value) {
                this.pnrSecurity = value;
            }

            /**
             * Gets the value of the accounting property.
             * 
             * @return
             *     possible object is
             *     {@link AccountingInformationElementType }
             *     
             */
            public AccountingInformationElementType getAccounting() {
                return accounting;
            }

            /**
             * Sets the value of the accounting property.
             * 
             * @param value
             *     allowed object is
             *     {@link AccountingInformationElementType }
             *     
             */
            public void setAccounting(AccountingInformationElementType value) {
                this.accounting = value;
            }

            /**
             * Gets the value of the miscellaneousRemarks property.
             * 
             * @return
             *     possible object is
             *     {@link MiscellaneousRemarksType211S }
             *     
             */
            public MiscellaneousRemarksType211S getMiscellaneousRemarks() {
                return miscellaneousRemarks;
            }

            /**
             * Sets the value of the miscellaneousRemarks property.
             * 
             * @param value
             *     allowed object is
             *     {@link MiscellaneousRemarksType211S }
             *     
             */
            public void setMiscellaneousRemarks(MiscellaneousRemarksType211S value) {
                this.miscellaneousRemarks = value;
            }

            /**
             * Gets the value of the extendedRemark property.
             * 
             * @return
             *     possible object is
             *     {@link ExtendedRemarkType }
             *     
             */
            public ExtendedRemarkType getExtendedRemark() {
                return extendedRemark;
            }

            /**
             * Sets the value of the extendedRemark property.
             * 
             * @param value
             *     allowed object is
             *     {@link ExtendedRemarkType }
             *     
             */
            public void setExtendedRemark(ExtendedRemarkType value) {
                this.extendedRemark = value;
            }

            /**
             * Gets the value of the serviceRequest property.
             * 
             * @return
             *     possible object is
             *     {@link SpecialRequirementsDetailsTypeI }
             *     
             */
            public SpecialRequirementsDetailsTypeI getServiceRequest() {
                return serviceRequest;
            }

            /**
             * Sets the value of the serviceRequest property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecialRequirementsDetailsTypeI }
             *     
             */
            public void setServiceRequest(SpecialRequirementsDetailsTypeI value) {
                this.serviceRequest = value;
            }

            /**
             * Gets the value of the seatPaxInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatPaxInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatPaxInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo }
             * 
             * 
             */
            public List<PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo> getSeatPaxInfo() {
                if (seatPaxInfo == null) {
                    seatPaxInfo = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv.SeatPaxInfo>();
                }
                return this.seatPaxInfo;
            }

            /**
             * Gets the value of the reasonForIssuanceCode property.
             * 
             * @return
             *     possible object is
             *     {@link PricingOrTicketingSubsequentType195222S }
             *     
             */
            public PricingOrTicketingSubsequentType195222S getReasonForIssuanceCode() {
                return reasonForIssuanceCode;
            }

            /**
             * Sets the value of the reasonForIssuanceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingOrTicketingSubsequentType195222S }
             *     
             */
            public void setReasonForIssuanceCode(PricingOrTicketingSubsequentType195222S value) {
                this.reasonForIssuanceCode = value;
            }

            /**
             * Gets the value of the railSeatPreferences property.
             * 
             * @return
             *     possible object is
             *     {@link RailSeatPreferencesType }
             *     
             */
            public RailSeatPreferencesType getRailSeatPreferences() {
                return railSeatPreferences;
            }

            /**
             * Sets the value of the railSeatPreferences property.
             * 
             * @param value
             *     allowed object is
             *     {@link RailSeatPreferencesType }
             *     
             */
            public void setRailSeatPreferences(RailSeatPreferencesType value) {
                this.railSeatPreferences = value;
            }

            /**
             * Gets the value of the cityPair property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.CityPair }
             *     
             */
            public PNRReply.DataElementsMaster.DataElementsIndiv.CityPair getCityPair() {
                return cityPair;
            }

            /**
             * Sets the value of the cityPair property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.CityPair }
             *     
             */
            public void setCityPair(PNRReply.DataElementsMaster.DataElementsIndiv.CityPair value) {
                this.cityPair = value;
            }

            /**
             * Gets the value of the railSeatDetails property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the railSeatDetails property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRailSeatDetails().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails }
             * 
             * 
             */
            public List<PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails> getRailSeatDetails() {
                if (railSeatDetails == null) {
                    railSeatDetails = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv.RailSeatDetails>();
                }
                return this.railSeatDetails;
            }

            /**
             * Gets the value of the dateAndTimeInformation property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public DateAndTimeInformationTypeI getDateAndTimeInformation() {
                return dateAndTimeInformation;
            }

            /**
             * Sets the value of the dateAndTimeInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationTypeI }
             *     
             */
            public void setDateAndTimeInformation(DateAndTimeInformationTypeI value) {
                this.dateAndTimeInformation = value;
            }

            /**
             * Gets the value of the frequentFlyerInformationGroup property.
             * 
             * @return
             *     possible object is
             *     {@link FrequentFlyerInformationGroupType }
             *     
             */
            public FrequentFlyerInformationGroupType getFrequentFlyerInformationGroup() {
                return frequentFlyerInformationGroup;
            }

            /**
             * Sets the value of the frequentFlyerInformationGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link FrequentFlyerInformationGroupType }
             *     
             */
            public void setFrequentFlyerInformationGroup(FrequentFlyerInformationGroupType value) {
                this.frequentFlyerInformationGroup = value;
            }

            /**
             * Gets the value of the ticketElement property.
             * 
             * @return
             *     possible object is
             *     {@link TicketElementType }
             *     
             */
            public TicketElementType getTicketElement() {
                return ticketElement;
            }

            /**
             * Sets the value of the ticketElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketElementType }
             *     
             */
            public void setTicketElement(TicketElementType value) {
                this.ticketElement = value;
            }

            /**
             * Gets the value of the referencedRecord property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord }
             *     
             */
            public PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord getReferencedRecord() {
                return referencedRecord;
            }

            /**
             * Sets the value of the referencedRecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord }
             *     
             */
            public void setReferencedRecord(PNRReply.DataElementsMaster.DataElementsIndiv.ReferencedRecord value) {
                this.referencedRecord = value;
            }

            /**
             * Gets the value of the optionElement property.
             * 
             * @return
             *     possible object is
             *     {@link OptionElementType }
             *     
             */
            public OptionElementType getOptionElement() {
                return optionElement;
            }

            /**
             * Sets the value of the optionElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link OptionElementType }
             *     
             */
            public void setOptionElement(OptionElementType value) {
                this.optionElement = value;
            }

            /**
             * Gets the value of the otherDataFreetext property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherDataFreetext property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherDataFreetext().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link LongFreeTextType }
             * 
             * 
             */
            public List<LongFreeTextType> getOtherDataFreetext() {
                if (otherDataFreetext == null) {
                    otherDataFreetext = new ArrayList<LongFreeTextType>();
                }
                return this.otherDataFreetext;
            }

            /**
             * Gets the value of the structuredAddress property.
             * 
             * @return
             *     possible object is
             *     {@link StructuredAddressType }
             *     
             */
            public StructuredAddressType getStructuredAddress() {
                return structuredAddress;
            }

            /**
             * Sets the value of the structuredAddress property.
             * 
             * @param value
             *     allowed object is
             *     {@link StructuredAddressType }
             *     
             */
            public void setStructuredAddress(StructuredAddressType value) {
                this.structuredAddress = value;
            }

            /**
             * Gets the value of the monetaryInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the monetaryInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMonetaryInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link MonetaryInformationTypeI1689S }
             * 
             * 
             */
            public List<MonetaryInformationTypeI1689S> getMonetaryInformation() {
                if (monetaryInformation == null) {
                    monetaryInformation = new ArrayList<MonetaryInformationTypeI1689S>();
                }
                return this.monetaryInformation;
            }

            /**
             * Gets the value of the elementErrorInformation property.
             * 
             * @return
             *     possible object is
             *     {@link ErrorGroupType223552G }
             *     
             */
            public ErrorGroupType223552G getElementErrorInformation() {
                return elementErrorInformation;
            }

            /**
             * Sets the value of the elementErrorInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link ErrorGroupType223552G }
             *     
             */
            public void setElementErrorInformation(ErrorGroupType223552G value) {
                this.elementErrorInformation = value;
            }

            /**
             * Gets the value of the mcoRecord property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord }
             *     
             */
            public PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord getMcoRecord() {
                return mcoRecord;
            }

            /**
             * Sets the value of the mcoRecord property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord }
             *     
             */
            public void setMcoRecord(PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord value) {
                this.mcoRecord = value;
            }

            /**
             * Gets the value of the totalPrice property.
             * 
             * @return
             *     possible object is
             *     {@link TotalPriceType }
             *     
             */
            public TotalPriceType getTotalPrice() {
                return totalPrice;
            }

            /**
             * Sets the value of the totalPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalPriceType }
             *     
             */
            public void setTotalPrice(TotalPriceType value) {
                this.totalPrice = value;
            }

            /**
             * Gets the value of the elementsIndicators property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the elementsIndicators property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getElementsIndicators().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusTypeI196879S }
             * 
             * 
             */
            public List<StatusTypeI196879S> getElementsIndicators() {
                if (elementsIndicators == null) {
                    elementsIndicators = new ArrayList<StatusTypeI196879S>();
                }
                return this.elementsIndicators;
            }

            /**
             * Gets the value of the eltPosDetails property.
             * 
             * @return
             *     possible object is
             *     {@link POSGroupType150634G }
             *     
             */
            public POSGroupType150634G getEltPosDetails() {
                return eltPosDetails;
            }

            /**
             * Sets the value of the eltPosDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link POSGroupType150634G }
             *     
             */
            public void setEltPosDetails(POSGroupType150634G value) {
                this.eltPosDetails = value;
            }

            /**
             * Gets the value of the accessLevel property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the accessLevel property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAccessLevel().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ExtendedOwnershipSecurityDetailsType }
             * 
             * 
             */
            public List<ExtendedOwnershipSecurityDetailsType> getAccessLevel() {
                if (accessLevel == null) {
                    accessLevel = new ArrayList<ExtendedOwnershipSecurityDetailsType>();
                }
                return this.accessLevel;
            }

            /**
             * Gets the value of the referenceForDataElement property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceForDataElement() {
                return referenceForDataElement;
            }

            /**
             * Sets the value of the referenceForDataElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceForDataElement(ReferenceInfoType value) {
                this.referenceForDataElement = value;
            }

            /**
             * Gets the value of the structuredFop property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the structuredFop property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStructuredFop().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FOPRepresentationType }
             * 
             * 
             */
            public List<FOPRepresentationType> getStructuredFop() {
                if (structuredFop == null) {
                    structuredFop = new ArrayList<FOPRepresentationType>();
                }
                return this.structuredFop;
            }

            /**
             * Gets the value of the ssrPackageInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the ssrPackageInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSsrPackageInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SSRPackInformation }
             * 
             * 
             */
            public List<SSRPackInformation> getSsrPackageInformation() {
                if (ssrPackageInformation == null) {
                    ssrPackageInformation = new ArrayList<SSRPackInformation>();
                }
                return this.ssrPackageInformation;
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
             *         &lt;element name="depLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
             *         &lt;element name="arrLocation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_35293S"/>
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
                "depLocation",
                "arrLocation"
            })
            public static class CityPair {

                @XmlElement(required = true)
                protected PlaceLocationIdentificationTypeU35293S depLocation;
                @XmlElement(required = true)
                protected PlaceLocationIdentificationTypeU35293S arrLocation;

                /**
                 * Gets the value of the depLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PlaceLocationIdentificationTypeU35293S }
                 *     
                 */
                public PlaceLocationIdentificationTypeU35293S getDepLocation() {
                    return depLocation;
                }

                /**
                 * Sets the value of the depLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PlaceLocationIdentificationTypeU35293S }
                 *     
                 */
                public void setDepLocation(PlaceLocationIdentificationTypeU35293S value) {
                    this.depLocation = value;
                }

                /**
                 * Gets the value of the arrLocation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PlaceLocationIdentificationTypeU35293S }
                 *     
                 */
                public PlaceLocationIdentificationTypeU35293S getArrLocation() {
                    return arrLocation;
                }

                /**
                 * Sets the value of the arrLocation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PlaceLocationIdentificationTypeU35293S }
                 *     
                 */
                public void setArrLocation(PlaceLocationIdentificationTypeU35293S value) {
                    this.arrLocation = value;
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
             *         &lt;element name="mcoType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousChargeOrderType"/>
             *         &lt;element name="mcoInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
             *         &lt;element name="groupOfFareElements" maxOccurs="20" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU"/>
             *                   &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
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
                "mcoType",
                "mcoInformation",
                "groupOfFareElements"
            })
            public static class McoRecord {

                @XmlElement(required = true)
                protected MiscellaneousChargeOrderType mcoType;
                @XmlElement(required = true)
                protected FreeTextInformationType9865S mcoInformation;
                protected List<PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements> groupOfFareElements;

                /**
                 * Gets the value of the mcoType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MiscellaneousChargeOrderType }
                 *     
                 */
                public MiscellaneousChargeOrderType getMcoType() {
                    return mcoType;
                }

                /**
                 * Sets the value of the mcoType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MiscellaneousChargeOrderType }
                 *     
                 */
                public void setMcoType(MiscellaneousChargeOrderType value) {
                    this.mcoType = value;
                }

                /**
                 * Gets the value of the mcoInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType9865S }
                 *     
                 */
                public FreeTextInformationType9865S getMcoInformation() {
                    return mcoInformation;
                }

                /**
                 * Sets the value of the mcoInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType9865S }
                 *     
                 */
                public void setMcoInformation(FreeTextInformationType9865S value) {
                    this.mcoInformation = value;
                }

                /**
                 * Gets the value of the groupOfFareElements property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the groupOfFareElements property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getGroupOfFareElements().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements }
                 * 
                 * 
                 */
                public List<PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements> getGroupOfFareElements() {
                    if (groupOfFareElements == null) {
                        groupOfFareElements = new ArrayList<PNRReply.DataElementsMaster.DataElementsIndiv.McoRecord.GroupOfFareElements>();
                    }
                    return this.groupOfFareElements;
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
                 *         &lt;element name="sequenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU"/>
                 *         &lt;element name="fareElementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_9865S"/>
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
                    "sequenceNumber",
                    "fareElementData"
                })
                public static class GroupOfFareElements {

                    @XmlElement(required = true)
                    protected SequenceDetailsTypeU sequenceNumber;
                    @XmlElement(required = true)
                    protected FreeTextInformationType9865S fareElementData;

                    /**
                     * Gets the value of the sequenceNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SequenceDetailsTypeU }
                     *     
                     */
                    public SequenceDetailsTypeU getSequenceNumber() {
                        return sequenceNumber;
                    }

                    /**
                     * Sets the value of the sequenceNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SequenceDetailsTypeU }
                     *     
                     */
                    public void setSequenceNumber(SequenceDetailsTypeU value) {
                        this.sequenceNumber = value;
                    }

                    /**
                     * Gets the value of the fareElementData property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformationType9865S }
                     *     
                     */
                    public FreeTextInformationType9865S getFareElementData() {
                        return fareElementData;
                    }

                    /**
                     * Sets the value of the fareElementData property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformationType9865S }
                     *     
                     */
                    public void setFareElementData(FreeTextInformationType9865S value) {
                        this.fareElementData = value;
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
             *         &lt;element name="railSeatReferenceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RailSeatReferenceInformationType"/>
             *         &lt;element name="railSeatDenomination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_29860S" minOccurs="0"/>
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
                "railSeatReferenceInformation",
                "railSeatDenomination"
            })
            public static class RailSeatDetails {

                @XmlElement(required = true)
                protected RailSeatReferenceInformationType railSeatReferenceInformation;
                protected FreeTextInformationType29860S railSeatDenomination;

                /**
                 * Gets the value of the railSeatReferenceInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link RailSeatReferenceInformationType }
                 *     
                 */
                public RailSeatReferenceInformationType getRailSeatReferenceInformation() {
                    return railSeatReferenceInformation;
                }

                /**
                 * Sets the value of the railSeatReferenceInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link RailSeatReferenceInformationType }
                 *     
                 */
                public void setRailSeatReferenceInformation(RailSeatReferenceInformationType value) {
                    this.railSeatReferenceInformation = value;
                }

                /**
                 * Gets the value of the railSeatDenomination property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType29860S }
                 *     
                 */
                public FreeTextInformationType29860S getRailSeatDenomination() {
                    return railSeatDenomination;
                }

                /**
                 * Sets the value of the railSeatDenomination property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType29860S }
                 *     
                 */
                public void setRailSeatDenomination(FreeTextInformationType29860S value) {
                    this.railSeatDenomination = value;
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
             *         &lt;element name="referencedReservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S"/>
             *         &lt;element name="securityInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationSecurityInformationType"/>
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
                "referencedReservationInfo",
                "securityInformation"
            })
            public static class ReferencedRecord {

                @XmlElement(required = true)
                protected ReservationControlInformationTypeI196503S referencedReservationInfo;
                @XmlElement(required = true)
                protected ReservationSecurityInformationType securityInformation;

                /**
                 * Gets the value of the referencedReservationInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationControlInformationTypeI196503S }
                 *     
                 */
                public ReservationControlInformationTypeI196503S getReferencedReservationInfo() {
                    return referencedReservationInfo;
                }

                /**
                 * Sets the value of the referencedReservationInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationControlInformationTypeI196503S }
                 *     
                 */
                public void setReferencedReservationInfo(ReservationControlInformationTypeI196503S value) {
                    this.referencedReservationInfo = value;
                }

                /**
                 * Gets the value of the securityInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReservationSecurityInformationType }
                 *     
                 */
                public ReservationSecurityInformationType getSecurityInformation() {
                    return securityInformation;
                }

                /**
                 * Sets the value of the securityInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReservationSecurityInformationType }
                 *     
                 */
                public void setSecurityInformation(ReservationSecurityInformationType value) {
                    this.securityInformation = value;
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
             *         &lt;element name="seatPaxDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SeatRequestParametersTypeI"/>
             *         &lt;element name="seatPaxIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_196879S" minOccurs="0"/>
             *         &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_6074S"/>
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
                "seatPaxDetails",
                "seatPaxIndicator",
                "crossRef"
            })
            public static class SeatPaxInfo {

                @XmlElement(required = true)
                protected SeatRequestParametersTypeI seatPaxDetails;
                protected StatusTypeI196879S seatPaxIndicator;
                @XmlElement(required = true)
                protected ReferenceInfoType6074S crossRef;

                /**
                 * Gets the value of the seatPaxDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SeatRequestParametersTypeI }
                 *     
                 */
                public SeatRequestParametersTypeI getSeatPaxDetails() {
                    return seatPaxDetails;
                }

                /**
                 * Sets the value of the seatPaxDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SeatRequestParametersTypeI }
                 *     
                 */
                public void setSeatPaxDetails(SeatRequestParametersTypeI value) {
                    this.seatPaxDetails = value;
                }

                /**
                 * Gets the value of the seatPaxIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusTypeI196879S }
                 *     
                 */
                public StatusTypeI196879S getSeatPaxIndicator() {
                    return seatPaxIndicator;
                }

                /**
                 * Sets the value of the seatPaxIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusTypeI196879S }
                 *     
                 */
                public void setSeatPaxIndicator(StatusTypeI196879S value) {
                    this.seatPaxIndicator = value;
                }

                /**
                 * Gets the value of the crossRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInfoType6074S }
                 *     
                 */
                public ReferenceInfoType6074S getCrossRef() {
                    return crossRef;
                }

                /**
                 * Sets the value of the crossRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInfoType6074S }
                 *     
                 */
                public void setCrossRef(ReferenceInfoType6074S value) {
                    this.crossRef = value;
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
     *         &lt;element name="markerPax" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerFlightDetailsTypeI"/>
     *         &lt;element name="markerSegment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerFlightDetailsTypeI"/>
     *         &lt;element name="segmentSection" maxOccurs="19602" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="elementManagementStructData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_127983S"/>
     *                   &lt;element name="referenceForStructDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
     *                   &lt;element name="dcsSegmentInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="booking" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI"/>
     *                             &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
     *                             &lt;element name="typeOfCOP" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127282S" minOccurs="0"/>
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
     *         &lt;element name="markerLeg" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PassengerFlightDetailsTypeI"/>
     *         &lt;element name="legSection" maxOccurs="176418" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="elementManagementStructData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_127983S"/>
     *                   &lt;element name="referenceForStructDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
     *                   &lt;element name="dcsLegInfo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="legPosition" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelItineraryInformationTypeI"/>
     *                             &lt;element name="leg" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI"/>
     *                             &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
     *                             &lt;element name="seatDelivery" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
     *                             &lt;element name="paxStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_127261S" minOccurs="0"/>
     *                             &lt;element name="accregReason" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="reasons" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127279S"/>
     *                                       &lt;element name="deliveryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="regradeCabin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SegmentCabinIdentificationType" minOccurs="0"/>
     *                             &lt;element name="acceptanceChannel" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="acceptanceOrigin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_127265S"/>
     *                                       &lt;element name="applicationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="compensationData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompensationType" minOccurs="0"/>
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
        "markerPax",
        "markerSegment",
        "segmentSection",
        "markerLeg",
        "legSection"
    })
    public static class DcsData {

        @XmlElement(required = true)
        protected PassengerFlightDetailsTypeI markerPax;
        @XmlElement(required = true)
        protected PassengerFlightDetailsTypeI markerSegment;
        protected List<PNRReply.DcsData.SegmentSection> segmentSection;
        @XmlElement(required = true)
        protected PassengerFlightDetailsTypeI markerLeg;
        protected List<PNRReply.DcsData.LegSection> legSection;

        /**
         * Gets the value of the markerPax property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightDetailsTypeI }
         *     
         */
        public PassengerFlightDetailsTypeI getMarkerPax() {
            return markerPax;
        }

        /**
         * Sets the value of the markerPax property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightDetailsTypeI }
         *     
         */
        public void setMarkerPax(PassengerFlightDetailsTypeI value) {
            this.markerPax = value;
        }

        /**
         * Gets the value of the markerSegment property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightDetailsTypeI }
         *     
         */
        public PassengerFlightDetailsTypeI getMarkerSegment() {
            return markerSegment;
        }

        /**
         * Sets the value of the markerSegment property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightDetailsTypeI }
         *     
         */
        public void setMarkerSegment(PassengerFlightDetailsTypeI value) {
            this.markerSegment = value;
        }

        /**
         * Gets the value of the segmentSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.DcsData.SegmentSection }
         * 
         * 
         */
        public List<PNRReply.DcsData.SegmentSection> getSegmentSection() {
            if (segmentSection == null) {
                segmentSection = new ArrayList<PNRReply.DcsData.SegmentSection>();
            }
            return this.segmentSection;
        }

        /**
         * Gets the value of the markerLeg property.
         * 
         * @return
         *     possible object is
         *     {@link PassengerFlightDetailsTypeI }
         *     
         */
        public PassengerFlightDetailsTypeI getMarkerLeg() {
            return markerLeg;
        }

        /**
         * Sets the value of the markerLeg property.
         * 
         * @param value
         *     allowed object is
         *     {@link PassengerFlightDetailsTypeI }
         *     
         */
        public void setMarkerLeg(PassengerFlightDetailsTypeI value) {
            this.markerLeg = value;
        }

        /**
         * Gets the value of the legSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the legSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLegSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.DcsData.LegSection }
         * 
         * 
         */
        public List<PNRReply.DcsData.LegSection> getLegSection() {
            if (legSection == null) {
                legSection = new ArrayList<PNRReply.DcsData.LegSection>();
            }
            return this.legSection;
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
         *         &lt;element name="elementManagementStructData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_127983S"/>
         *         &lt;element name="referenceForStructDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
         *         &lt;element name="dcsLegInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="legPosition" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelItineraryInformationTypeI"/>
         *                   &lt;element name="leg" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI"/>
         *                   &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
         *                   &lt;element name="seatDelivery" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
         *                   &lt;element name="paxStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_127261S" minOccurs="0"/>
         *                   &lt;element name="accregReason" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="reasons" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127279S"/>
         *                             &lt;element name="deliveryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="regradeCabin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SegmentCabinIdentificationType" minOccurs="0"/>
         *                   &lt;element name="acceptanceChannel" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="acceptanceOrigin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_127265S"/>
         *                             &lt;element name="applicationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="compensationData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompensationType" minOccurs="0"/>
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
            "elementManagementStructData",
            "referenceForStructDataElement",
            "dcsLegInfo"
        })
        public static class LegSection {

            @XmlElement(required = true)
            protected ElementManagementSegmentType127983S elementManagementStructData;
            protected ReferenceInfoType referenceForStructDataElement;
            @XmlElement(required = true)
            protected PNRReply.DcsData.LegSection.DcsLegInfo dcsLegInfo;

            /**
             * Gets the value of the elementManagementStructData property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegmentType127983S }
             *     
             */
            public ElementManagementSegmentType127983S getElementManagementStructData() {
                return elementManagementStructData;
            }

            /**
             * Sets the value of the elementManagementStructData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegmentType127983S }
             *     
             */
            public void setElementManagementStructData(ElementManagementSegmentType127983S value) {
                this.elementManagementStructData = value;
            }

            /**
             * Gets the value of the referenceForStructDataElement property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceForStructDataElement() {
                return referenceForStructDataElement;
            }

            /**
             * Sets the value of the referenceForStructDataElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceForStructDataElement(ReferenceInfoType value) {
                this.referenceForStructDataElement = value;
            }

            /**
             * Gets the value of the dcsLegInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DcsData.LegSection.DcsLegInfo }
             *     
             */
            public PNRReply.DcsData.LegSection.DcsLegInfo getDcsLegInfo() {
                return dcsLegInfo;
            }

            /**
             * Sets the value of the dcsLegInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DcsData.LegSection.DcsLegInfo }
             *     
             */
            public void setDcsLegInfo(PNRReply.DcsData.LegSection.DcsLegInfo value) {
                this.dcsLegInfo = value;
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
             *         &lt;element name="legPosition" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelItineraryInformationTypeI"/>
             *         &lt;element name="leg" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI"/>
             *         &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
             *         &lt;element name="seatDelivery" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsType" minOccurs="0"/>
             *         &lt;element name="paxStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_127261S" minOccurs="0"/>
             *         &lt;element name="accregReason" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="reasons" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127279S"/>
             *                   &lt;element name="deliveryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="regradeCabin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SegmentCabinIdentificationType" minOccurs="0"/>
             *         &lt;element name="acceptanceChannel" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="acceptanceOrigin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_127265S"/>
             *                   &lt;element name="applicationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="compensationData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompensationType" minOccurs="0"/>
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
                "legPosition",
                "leg",
                "paxType",
                "seatDelivery",
                "paxStatus",
                "accregReason",
                "regradeCabin",
                "acceptanceChannel",
                "compensationData"
            })
            public static class DcsLegInfo {

                @XmlElement(required = true)
                protected TravelItineraryInformationTypeI legPosition;
                @XmlElement(required = true)
                protected OriginAndDestinationDetailsTypeI leg;
                @XmlElement(required = true)
                protected ReferenceInformationTypeI paxType;
                protected SpecialRequirementsDetailsType seatDelivery;
                protected StatusTypeI127261S paxStatus;
                protected List<PNRReply.DcsData.LegSection.DcsLegInfo.AccregReason> accregReason;
                protected SegmentCabinIdentificationType regradeCabin;
                protected PNRReply.DcsData.LegSection.DcsLegInfo.AcceptanceChannel acceptanceChannel;
                protected CompensationType compensationData;

                /**
                 * Gets the value of the legPosition property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelItineraryInformationTypeI }
                 *     
                 */
                public TravelItineraryInformationTypeI getLegPosition() {
                    return legPosition;
                }

                /**
                 * Sets the value of the legPosition property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelItineraryInformationTypeI }
                 *     
                 */
                public void setLegPosition(TravelItineraryInformationTypeI value) {
                    this.legPosition = value;
                }

                /**
                 * Gets the value of the leg property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link OriginAndDestinationDetailsTypeI }
                 *     
                 */
                public OriginAndDestinationDetailsTypeI getLeg() {
                    return leg;
                }

                /**
                 * Sets the value of the leg property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link OriginAndDestinationDetailsTypeI }
                 *     
                 */
                public void setLeg(OriginAndDestinationDetailsTypeI value) {
                    this.leg = value;
                }

                /**
                 * Gets the value of the paxType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInformationTypeI }
                 *     
                 */
                public ReferenceInformationTypeI getPaxType() {
                    return paxType;
                }

                /**
                 * Sets the value of the paxType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInformationTypeI }
                 *     
                 */
                public void setPaxType(ReferenceInformationTypeI value) {
                    this.paxType = value;
                }

                /**
                 * Gets the value of the seatDelivery property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public SpecialRequirementsDetailsType getSeatDelivery() {
                    return seatDelivery;
                }

                /**
                 * Sets the value of the seatDelivery property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SpecialRequirementsDetailsType }
                 *     
                 */
                public void setSeatDelivery(SpecialRequirementsDetailsType value) {
                    this.seatDelivery = value;
                }

                /**
                 * Gets the value of the paxStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusTypeI127261S }
                 *     
                 */
                public StatusTypeI127261S getPaxStatus() {
                    return paxStatus;
                }

                /**
                 * Sets the value of the paxStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusTypeI127261S }
                 *     
                 */
                public void setPaxStatus(StatusTypeI127261S value) {
                    this.paxStatus = value;
                }

                /**
                 * Gets the value of the accregReason property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the accregReason property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAccregReason().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRReply.DcsData.LegSection.DcsLegInfo.AccregReason }
                 * 
                 * 
                 */
                public List<PNRReply.DcsData.LegSection.DcsLegInfo.AccregReason> getAccregReason() {
                    if (accregReason == null) {
                        accregReason = new ArrayList<PNRReply.DcsData.LegSection.DcsLegInfo.AccregReason>();
                    }
                    return this.accregReason;
                }

                /**
                 * Gets the value of the regradeCabin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SegmentCabinIdentificationType }
                 *     
                 */
                public SegmentCabinIdentificationType getRegradeCabin() {
                    return regradeCabin;
                }

                /**
                 * Sets the value of the regradeCabin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SegmentCabinIdentificationType }
                 *     
                 */
                public void setRegradeCabin(SegmentCabinIdentificationType value) {
                    this.regradeCabin = value;
                }

                /**
                 * Gets the value of the acceptanceChannel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.DcsData.LegSection.DcsLegInfo.AcceptanceChannel }
                 *     
                 */
                public PNRReply.DcsData.LegSection.DcsLegInfo.AcceptanceChannel getAcceptanceChannel() {
                    return acceptanceChannel;
                }

                /**
                 * Sets the value of the acceptanceChannel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.DcsData.LegSection.DcsLegInfo.AcceptanceChannel }
                 *     
                 */
                public void setAcceptanceChannel(PNRReply.DcsData.LegSection.DcsLegInfo.AcceptanceChannel value) {
                    this.acceptanceChannel = value;
                }

                /**
                 * Gets the value of the compensationData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CompensationType }
                 *     
                 */
                public CompensationType getCompensationData() {
                    return compensationData;
                }

                /**
                 * Sets the value of the compensationData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CompensationType }
                 *     
                 */
                public void setCompensationData(CompensationType value) {
                    this.compensationData = value;
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
                 *         &lt;element name="acceptanceOrigin" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_127265S"/>
                 *         &lt;element name="applicationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationType"/>
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
                    "acceptanceOrigin",
                    "applicationType"
                })
                public static class AcceptanceChannel {

                    @XmlElement(required = true)
                    protected UserIdentificationType127265S acceptanceOrigin;
                    @XmlElement(required = true)
                    protected ApplicationType applicationType;

                    /**
                     * Gets the value of the acceptanceOrigin property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link UserIdentificationType127265S }
                     *     
                     */
                    public UserIdentificationType127265S getAcceptanceOrigin() {
                        return acceptanceOrigin;
                    }

                    /**
                     * Sets the value of the acceptanceOrigin property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UserIdentificationType127265S }
                     *     
                     */
                    public void setAcceptanceOrigin(UserIdentificationType127265S value) {
                        this.acceptanceOrigin = value;
                    }

                    /**
                     * Gets the value of the applicationType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ApplicationType }
                     *     
                     */
                    public ApplicationType getApplicationType() {
                        return applicationType;
                    }

                    /**
                     * Sets the value of the applicationType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ApplicationType }
                     *     
                     */
                    public void setApplicationType(ApplicationType value) {
                        this.applicationType = value;
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
                 *         &lt;element name="reasons" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127279S"/>
                 *         &lt;element name="deliveryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/>
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
                    "reasons",
                    "deliveryInformation"
                })
                public static class AccregReason {

                    @XmlElement(required = true)
                    protected CodedAttributeType127279S reasons;
                    protected InteractiveFreeTextTypeI deliveryInformation;

                    /**
                     * Gets the value of the reasons property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CodedAttributeType127279S }
                     *     
                     */
                    public CodedAttributeType127279S getReasons() {
                        return reasons;
                    }

                    /**
                     * Sets the value of the reasons property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CodedAttributeType127279S }
                     *     
                     */
                    public void setReasons(CodedAttributeType127279S value) {
                        this.reasons = value;
                    }

                    /**
                     * Gets the value of the deliveryInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link InteractiveFreeTextTypeI }
                     *     
                     */
                    public InteractiveFreeTextTypeI getDeliveryInformation() {
                        return deliveryInformation;
                    }

                    /**
                     * Sets the value of the deliveryInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link InteractiveFreeTextTypeI }
                     *     
                     */
                    public void setDeliveryInformation(InteractiveFreeTextTypeI value) {
                        this.deliveryInformation = value;
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
         *         &lt;element name="elementManagementStructData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_127983S"/>
         *         &lt;element name="referenceForStructDataElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
         *         &lt;element name="dcsSegmentInfo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="booking" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI"/>
         *                   &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
         *                   &lt;element name="typeOfCOP" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127282S" minOccurs="0"/>
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
            "elementManagementStructData",
            "referenceForStructDataElement",
            "dcsSegmentInfo"
        })
        public static class SegmentSection {

            @XmlElement(required = true)
            protected ElementManagementSegmentType127983S elementManagementStructData;
            protected ReferenceInfoType referenceForStructDataElement;
            @XmlElement(required = true)
            protected PNRReply.DcsData.SegmentSection.DcsSegmentInfo dcsSegmentInfo;

            /**
             * Gets the value of the elementManagementStructData property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegmentType127983S }
             *     
             */
            public ElementManagementSegmentType127983S getElementManagementStructData() {
                return elementManagementStructData;
            }

            /**
             * Sets the value of the elementManagementStructData property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegmentType127983S }
             *     
             */
            public void setElementManagementStructData(ElementManagementSegmentType127983S value) {
                this.elementManagementStructData = value;
            }

            /**
             * Gets the value of the referenceForStructDataElement property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceForStructDataElement() {
                return referenceForStructDataElement;
            }

            /**
             * Sets the value of the referenceForStructDataElement property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceForStructDataElement(ReferenceInfoType value) {
                this.referenceForStructDataElement = value;
            }

            /**
             * Gets the value of the dcsSegmentInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.DcsData.SegmentSection.DcsSegmentInfo }
             *     
             */
            public PNRReply.DcsData.SegmentSection.DcsSegmentInfo getDcsSegmentInfo() {
                return dcsSegmentInfo;
            }

            /**
             * Sets the value of the dcsSegmentInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.DcsData.SegmentSection.DcsSegmentInfo }
             *     
             */
            public void setDcsSegmentInfo(PNRReply.DcsData.SegmentSection.DcsSegmentInfo value) {
                this.dcsSegmentInfo = value;
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
             *         &lt;element name="booking" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI"/>
             *         &lt;element name="paxType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI"/>
             *         &lt;element name="typeOfCOP" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_127282S" minOccurs="0"/>
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
                "booking",
                "paxType",
                "typeOfCOP"
            })
            public static class DcsSegmentInfo {

                @XmlElement(required = true)
                protected TravelProductInformationTypeI booking;
                @XmlElement(required = true)
                protected ReferenceInformationTypeI paxType;
                protected CodedAttributeType127282S typeOfCOP;

                /**
                 * Gets the value of the booking property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public TravelProductInformationTypeI getBooking() {
                    return booking;
                }

                /**
                 * Sets the value of the booking property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationTypeI }
                 *     
                 */
                public void setBooking(TravelProductInformationTypeI value) {
                    this.booking = value;
                }

                /**
                 * Gets the value of the paxType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInformationTypeI }
                 *     
                 */
                public ReferenceInformationTypeI getPaxType() {
                    return paxType;
                }

                /**
                 * Sets the value of the paxType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInformationTypeI }
                 *     
                 */
                public void setPaxType(ReferenceInformationTypeI value) {
                    this.paxType = value;
                }

                /**
                 * Gets the value of the typeOfCOP property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CodedAttributeType127282S }
                 *     
                 */
                public CodedAttributeType127282S getTypeOfCOP() {
                    return typeOfCOP;
                }

                /**
                 * Sets the value of the typeOfCOP property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CodedAttributeType127282S }
                 *     
                 */
                public void setTypeOfCOP(CodedAttributeType127282S value) {
                    this.typeOfCOP = value;
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
     *         &lt;element name="originDestination" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginAndDestinationDetailsTypeI_3061S"/>
     *         &lt;element name="itineraryInfo" maxOccurs="99" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
     *                   &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193100S" minOccurs="0"/>
     *                   &lt;element name="itineraryMessageAction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MessageActionDetailsType" minOccurs="0"/>
     *                   &lt;element name="itineraryReservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" minOccurs="0"/>
     *                   &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RelatedProductInformationTypeI" minOccurs="0"/>
     *                   &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType" minOccurs="0"/>
     *                   &lt;element name="reasonForIssuanceCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
     *                   &lt;element name="flightDetail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
     *                   &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CabinDetailsType" minOccurs="0"/>
     *                   &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI_201122S" minOccurs="0"/>
     *                   &lt;element name="segmentAttribute" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_213992S" minOccurs="0"/>
     *                   &lt;element name="carbonDioxydeInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="carbonDioxydeAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityType"/>
     *                             &lt;element name="carbonDioxydeInfoSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="itineraryfreeFormText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextType" maxOccurs="9" minOccurs="0"/>
     *                   &lt;element name="itineraryFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" minOccurs="0"/>
     *                   &lt;element name="distributionMethod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MethodType" minOccurs="0"/>
     *                   &lt;element name="hotelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelProductInformationType" minOccurs="0"/>
     *                   &lt;element name="rateInformations" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RateInformationType" minOccurs="0"/>
     *                   &lt;element name="generalOption" type="{http://xml.amadeus.com/PNRACC_17_1_1A}GeneralOptionType" maxOccurs="199" minOccurs="0"/>
     *                   &lt;element name="country" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CountryCodeListType" minOccurs="0"/>
     *                   &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxTypeI" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="customerTransactionData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CustomerTransactionDataType" minOccurs="0"/>
     *                   &lt;element name="yieldGroup" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ODKeyPerformanceDataType"/>
     *                             &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ONDType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="legInfo" maxOccurs="99" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FlightSegmentDetailsTypeI"/>
     *                             &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_99362S"/>
     *                             &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_99363S" maxOccurs="2" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="flixInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FLIXType" maxOccurs="4" minOccurs="0"/>
     *                   &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType" minOccurs="0"/>
     *                   &lt;element name="lccTypicalData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_28460S"/>
     *                             &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType_6550S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="insuranceInformation" maxOccurs="198" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceNameType"/>
     *                             &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
     *                             &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInsuranceInformationType" minOccurs="0"/>
     *                             &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerDocumentInformationTypeU" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="insuranceDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceBusinessDataType" minOccurs="0"/>
     *                   &lt;element name="hotelReservationInfo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelPropertyType"/>
     *                             &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
     *                             &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207579S"/>
     *                             &lt;element name="roomRateDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomType"/>
     *                                       &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
     *                                       &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI"/>
     *                                       &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="3"/>
     *                             &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemNumberTypeU_33258S" minOccurs="0"/>
     *                             &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_215330S"/>
     *                             &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
     *                             &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType_38226S" minOccurs="0"/>
     *                             &lt;element name="guaranteeOrDeposit" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentInformationTypeI"/>
     *                                       &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI_29553S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_664S" maxOccurs="5" minOccurs="0"/>
     *                             &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
     *                             &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ContactInformationTypeU" minOccurs="0"/>
     *                             &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameAndAddressBatchTypeU" minOccurs="0"/>
     *                             &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DocumentInformationDetailsTypeI_207581S" minOccurs="0"/>
     *                             &lt;element name="arrivalFlightDetails" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193102S"/>
     *                                       &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalTransportDetailsTypeU"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType_99582S" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typicalCarData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VehicleInformationType"/>
     *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
     *                             &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_136704S" minOccurs="0"/>
     *                             &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
     *                             &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="6"/>
     *                             &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136710S"/>
     *                                       &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S"/>
     *                             &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="rateCodeGroup" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareQualifierDetailsTypeI"/>
     *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
     *                             &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136706S" maxOccurs="10" minOccurs="0"/>
     *                             &lt;element name="errorWarning" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationErrorInformationType"/>
     *                                       &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="rulesPoliciesGroup" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
     *                                       &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/>
     *                                       &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
     *                                       &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S"/>
     *                                                 &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
     *                                                 &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
     *                                                           &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136719S"/>
     *                                                           &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU_136720S"/>
     *                                                 &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S" maxOccurs="2" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_136722S"/>
     *                                                 &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136721S" minOccurs="0"/>
     *                                                 &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_136724S" maxOccurs="10" minOccurs="0"/>
     *                                                 &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_136723S" maxOccurs="2" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
     *                                                 &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
     *                                                           &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                                 &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136715S" minOccurs="0"/>
     *                                                 &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S" maxOccurs="6"/>
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
     *                             &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI" minOccurs="0"/>
     *                             &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
     *                             &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
     *                             &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationTypeI" minOccurs="0"/>
     *                             &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_136698S" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_136700S" maxOccurs="6" minOccurs="0"/>
     *                             &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityTypeI" maxOccurs="2" minOccurs="0"/>
     *                             &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameTypeU_136701S" minOccurs="0"/>
     *                             &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AgreementIdentificationTypeU" minOccurs="0"/>
     *                             &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketNumberTypeI" minOccurs="0"/>
     *                             &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommunicationContactTypeU" minOccurs="0"/>
     *                             &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="typicalCruiseData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CruiseBusinessDataType" minOccurs="0"/>
     *                   &lt;element name="railInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TrainInformationType" minOccurs="0"/>
     *                   &lt;element name="markerRailTour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
     *                   &lt;element name="tourInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationType" minOccurs="0"/>
     *                   &lt;element name="ferryLegInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FerryBookingDescriptionType" minOccurs="0"/>
     *                   &lt;element name="errorInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
     *                   &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
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
        "originDestination",
        "itineraryInfo"
    })
    public static class OriginDestinationDetails {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI3061S originDestination;
        protected List<PNRReply.OriginDestinationDetails.ItineraryInfo> itineraryInfo;

        /**
         * Gets the value of the originDestination property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI3061S }
         *     
         */
        public OriginAndDestinationDetailsTypeI3061S getOriginDestination() {
            return originDestination;
        }

        /**
         * Sets the value of the originDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI3061S }
         *     
         */
        public void setOriginDestination(OriginAndDestinationDetailsTypeI3061S value) {
            this.originDestination = value;
        }

        /**
         * Gets the value of the itineraryInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itineraryInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItineraryInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.OriginDestinationDetails.ItineraryInfo }
         * 
         * 
         */
        public List<PNRReply.OriginDestinationDetails.ItineraryInfo> getItineraryInfo() {
            if (itineraryInfo == null) {
                itineraryInfo = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo>();
            }
            return this.itineraryInfo;
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
         *         &lt;element name="elementManagementItinerary" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
         *         &lt;element name="travelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193100S" minOccurs="0"/>
         *         &lt;element name="itineraryMessageAction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MessageActionDetailsType" minOccurs="0"/>
         *         &lt;element name="itineraryReservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" minOccurs="0"/>
         *         &lt;element name="relatedProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RelatedProductInformationTypeI" minOccurs="0"/>
         *         &lt;element name="elementsIndicators" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType" minOccurs="0"/>
         *         &lt;element name="reasonForIssuanceCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType" minOccurs="0"/>
         *         &lt;element name="flightDetail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalProductDetailsTypeI" minOccurs="0"/>
         *         &lt;element name="cabinDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CabinDetailsType" minOccurs="0"/>
         *         &lt;element name="selectionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI_201122S" minOccurs="0"/>
         *         &lt;element name="segmentAttribute" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_213992S" minOccurs="0"/>
         *         &lt;element name="carbonDioxydeInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="carbonDioxydeAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityType"/>
         *                   &lt;element name="carbonDioxydeInfoSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="itineraryfreeFormText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextType" maxOccurs="9" minOccurs="0"/>
         *         &lt;element name="itineraryFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" minOccurs="0"/>
         *         &lt;element name="distributionMethod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MethodType" minOccurs="0"/>
         *         &lt;element name="hotelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelProductInformationType" minOccurs="0"/>
         *         &lt;element name="rateInformations" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RateInformationType" minOccurs="0"/>
         *         &lt;element name="generalOption" type="{http://xml.amadeus.com/PNRACC_17_1_1A}GeneralOptionType" maxOccurs="199" minOccurs="0"/>
         *         &lt;element name="country" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CountryCodeListType" minOccurs="0"/>
         *         &lt;element name="taxInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxTypeI" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="customerTransactionData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CustomerTransactionDataType" minOccurs="0"/>
         *         &lt;element name="yieldGroup" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ODKeyPerformanceDataType"/>
         *                   &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ONDType" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="legInfo" maxOccurs="99" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FlightSegmentDetailsTypeI"/>
         *                   &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_99362S"/>
         *                   &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_99363S" maxOccurs="2" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="flixInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FLIXType" maxOccurs="4" minOccurs="0"/>
         *         &lt;element name="dateTimeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType" minOccurs="0"/>
         *         &lt;element name="lccTypicalData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_28460S"/>
         *                   &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType_6550S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="insuranceInformation" maxOccurs="198" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceNameType"/>
         *                   &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
         *                   &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInsuranceInformationType" minOccurs="0"/>
         *                   &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerDocumentInformationTypeU" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="insuranceDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceBusinessDataType" minOccurs="0"/>
         *         &lt;element name="hotelReservationInfo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelPropertyType"/>
         *                   &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
         *                   &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207579S"/>
         *                   &lt;element name="roomRateDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomType"/>
         *                             &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
         *                             &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI"/>
         *                             &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="3"/>
         *                   &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemNumberTypeU_33258S" minOccurs="0"/>
         *                   &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_215330S"/>
         *                   &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
         *                   &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType_38226S" minOccurs="0"/>
         *                   &lt;element name="guaranteeOrDeposit" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentInformationTypeI"/>
         *                             &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI_29553S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_664S" maxOccurs="5" minOccurs="0"/>
         *                   &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
         *                   &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ContactInformationTypeU" minOccurs="0"/>
         *                   &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameAndAddressBatchTypeU" minOccurs="0"/>
         *                   &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DocumentInformationDetailsTypeI_207581S" minOccurs="0"/>
         *                   &lt;element name="arrivalFlightDetails" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193102S"/>
         *                             &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalTransportDetailsTypeU"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType_99582S" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typicalCarData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VehicleInformationType"/>
         *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
         *                   &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_136704S" minOccurs="0"/>
         *                   &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
         *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="6"/>
         *                   &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136710S"/>
         *                             &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S"/>
         *                   &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="rateCodeGroup" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareQualifierDetailsTypeI"/>
         *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
         *                   &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136706S" maxOccurs="10" minOccurs="0"/>
         *                   &lt;element name="errorWarning" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationErrorInformationType"/>
         *                             &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="rulesPoliciesGroup" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
         *                             &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/>
         *                             &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
         *                             &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S"/>
         *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
         *                                       &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
         *                                                 &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136719S"/>
         *                                                 &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
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
         *                             &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU_136720S"/>
         *                                       &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S" maxOccurs="2" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_136722S"/>
         *                                       &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136721S" minOccurs="0"/>
         *                                       &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_136724S" maxOccurs="10" minOccurs="0"/>
         *                                       &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_136723S" maxOccurs="2" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
         *                                       &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
         *                                                 &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136715S" minOccurs="0"/>
         *                                       &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S" maxOccurs="6"/>
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
         *                   &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI" minOccurs="0"/>
         *                   &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
         *                   &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
         *                   &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationTypeI" minOccurs="0"/>
         *                   &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_136698S" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_136700S" maxOccurs="6" minOccurs="0"/>
         *                   &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityTypeI" maxOccurs="2" minOccurs="0"/>
         *                   &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameTypeU_136701S" minOccurs="0"/>
         *                   &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AgreementIdentificationTypeU" minOccurs="0"/>
         *                   &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketNumberTypeI" minOccurs="0"/>
         *                   &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommunicationContactTypeU" minOccurs="0"/>
         *                   &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="typicalCruiseData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CruiseBusinessDataType" minOccurs="0"/>
         *         &lt;element name="railInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TrainInformationType" minOccurs="0"/>
         *         &lt;element name="markerRailTour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
         *         &lt;element name="tourInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationType" minOccurs="0"/>
         *         &lt;element name="ferryLegInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FerryBookingDescriptionType" minOccurs="0"/>
         *         &lt;element name="errorInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
         *         &lt;element name="referenceForSegment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
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
            "elementManagementItinerary",
            "travelProduct",
            "itineraryMessageAction",
            "itineraryReservationInfo",
            "relatedProduct",
            "elementsIndicators",
            "reasonForIssuanceCode",
            "flightDetail",
            "cabinDetails",
            "selectionDetails",
            "segmentAttribute",
            "carbonDioxydeInfo",
            "itineraryfreeFormText",
            "itineraryFreetext",
            "distributionMethod",
            "hotelProduct",
            "rateInformations",
            "generalOption",
            "country",
            "taxInformation",
            "customerTransactionData",
            "yieldGroup",
            "legInfo",
            "flixInfo",
            "dateTimeDetails",
            "lccTypicalData",
            "insuranceInformation",
            "insuranceDetails",
            "hotelReservationInfo",
            "typicalCarData",
            "typicalCruiseData",
            "railInfo",
            "markerRailTour",
            "tourInfo",
            "ferryLegInformation",
            "errorInfo",
            "referenceForSegment"
        })
        public static class ItineraryInfo {

            @XmlElement(required = true)
            protected ElementManagementSegmentType elementManagementItinerary;
            protected TravelProductInformationTypeI193100S travelProduct;
            protected MessageActionDetailsType itineraryMessageAction;
            protected ReservationControlInformationTypeI196503S itineraryReservationInfo;
            protected RelatedProductInformationTypeI relatedProduct;
            protected StatusType elementsIndicators;
            protected PricingOrTicketingSubsequentType reasonForIssuanceCode;
            protected AdditionalProductDetailsTypeI flightDetail;
            protected CabinDetailsType cabinDetails;
            protected SelectionDetailsTypeI201122S selectionDetails;
            protected CodedAttributeType213992S segmentAttribute;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.CarbonDioxydeInfo carbonDioxydeInfo;
            protected List<InteractiveFreeTextType> itineraryfreeFormText;
            protected LongFreeTextType itineraryFreetext;
            protected MethodType distributionMethod;
            protected HotelProductInformationType hotelProduct;
            protected RateInformationType rateInformations;
            protected List<GeneralOptionType> generalOption;
            protected CountryCodeListType country;
            protected List<TaxTypeI> taxInformation;
            protected CustomerTransactionDataType customerTransactionData;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup yieldGroup;
            protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo> legInfo;
            protected List<FLIXType> flixInfo;
            protected DateAndTimeInformationType dateTimeDetails;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData lccTypicalData;
            protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation> insuranceInformation;
            protected InsuranceBusinessDataType insuranceDetails;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo hotelReservationInfo;
            protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData typicalCarData;
            protected CruiseBusinessDataType typicalCruiseData;
            protected TrainInformationType railInfo;
            @XmlElement(required = true)
            protected DummySegmentTypeI markerRailTour;
            protected TourInformationType tourInfo;
            protected FerryBookingDescriptionType ferryLegInformation;
            protected ErrorGroupType223552G errorInfo;
            protected ReferenceInfoType referenceForSegment;

            /**
             * Gets the value of the elementManagementItinerary property.
             * 
             * @return
             *     possible object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public ElementManagementSegmentType getElementManagementItinerary() {
                return elementManagementItinerary;
            }

            /**
             * Sets the value of the elementManagementItinerary property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElementManagementSegmentType }
             *     
             */
            public void setElementManagementItinerary(ElementManagementSegmentType value) {
                this.elementManagementItinerary = value;
            }

            /**
             * Gets the value of the travelProduct property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI193100S }
             *     
             */
            public TravelProductInformationTypeI193100S getTravelProduct() {
                return travelProduct;
            }

            /**
             * Sets the value of the travelProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI193100S }
             *     
             */
            public void setTravelProduct(TravelProductInformationTypeI193100S value) {
                this.travelProduct = value;
            }

            /**
             * Gets the value of the itineraryMessageAction property.
             * 
             * @return
             *     possible object is
             *     {@link MessageActionDetailsType }
             *     
             */
            public MessageActionDetailsType getItineraryMessageAction() {
                return itineraryMessageAction;
            }

            /**
             * Sets the value of the itineraryMessageAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link MessageActionDetailsType }
             *     
             */
            public void setItineraryMessageAction(MessageActionDetailsType value) {
                this.itineraryMessageAction = value;
            }

            /**
             * Gets the value of the itineraryReservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ReservationControlInformationTypeI196503S }
             *     
             */
            public ReservationControlInformationTypeI196503S getItineraryReservationInfo() {
                return itineraryReservationInfo;
            }

            /**
             * Sets the value of the itineraryReservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReservationControlInformationTypeI196503S }
             *     
             */
            public void setItineraryReservationInfo(ReservationControlInformationTypeI196503S value) {
                this.itineraryReservationInfo = value;
            }

            /**
             * Gets the value of the relatedProduct property.
             * 
             * @return
             *     possible object is
             *     {@link RelatedProductInformationTypeI }
             *     
             */
            public RelatedProductInformationTypeI getRelatedProduct() {
                return relatedProduct;
            }

            /**
             * Sets the value of the relatedProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link RelatedProductInformationTypeI }
             *     
             */
            public void setRelatedProduct(RelatedProductInformationTypeI value) {
                this.relatedProduct = value;
            }

            /**
             * Gets the value of the elementsIndicators property.
             * 
             * @return
             *     possible object is
             *     {@link StatusType }
             *     
             */
            public StatusType getElementsIndicators() {
                return elementsIndicators;
            }

            /**
             * Sets the value of the elementsIndicators property.
             * 
             * @param value
             *     allowed object is
             *     {@link StatusType }
             *     
             */
            public void setElementsIndicators(StatusType value) {
                this.elementsIndicators = value;
            }

            /**
             * Gets the value of the reasonForIssuanceCode property.
             * 
             * @return
             *     possible object is
             *     {@link PricingOrTicketingSubsequentType }
             *     
             */
            public PricingOrTicketingSubsequentType getReasonForIssuanceCode() {
                return reasonForIssuanceCode;
            }

            /**
             * Sets the value of the reasonForIssuanceCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link PricingOrTicketingSubsequentType }
             *     
             */
            public void setReasonForIssuanceCode(PricingOrTicketingSubsequentType value) {
                this.reasonForIssuanceCode = value;
            }

            /**
             * Gets the value of the flightDetail property.
             * 
             * @return
             *     possible object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public AdditionalProductDetailsTypeI getFlightDetail() {
                return flightDetail;
            }

            /**
             * Sets the value of the flightDetail property.
             * 
             * @param value
             *     allowed object is
             *     {@link AdditionalProductDetailsTypeI }
             *     
             */
            public void setFlightDetail(AdditionalProductDetailsTypeI value) {
                this.flightDetail = value;
            }

            /**
             * Gets the value of the cabinDetails property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType }
             *     
             */
            public CabinDetailsType getCabinDetails() {
                return cabinDetails;
            }

            /**
             * Sets the value of the cabinDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType }
             *     
             */
            public void setCabinDetails(CabinDetailsType value) {
                this.cabinDetails = value;
            }

            /**
             * Gets the value of the selectionDetails property.
             * 
             * @return
             *     possible object is
             *     {@link SelectionDetailsTypeI201122S }
             *     
             */
            public SelectionDetailsTypeI201122S getSelectionDetails() {
                return selectionDetails;
            }

            /**
             * Sets the value of the selectionDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link SelectionDetailsTypeI201122S }
             *     
             */
            public void setSelectionDetails(SelectionDetailsTypeI201122S value) {
                this.selectionDetails = value;
            }

            /**
             * Gets the value of the segmentAttribute property.
             * 
             * @return
             *     possible object is
             *     {@link CodedAttributeType213992S }
             *     
             */
            public CodedAttributeType213992S getSegmentAttribute() {
                return segmentAttribute;
            }

            /**
             * Sets the value of the segmentAttribute property.
             * 
             * @param value
             *     allowed object is
             *     {@link CodedAttributeType213992S }
             *     
             */
            public void setSegmentAttribute(CodedAttributeType213992S value) {
                this.segmentAttribute = value;
            }

            /**
             * Gets the value of the carbonDioxydeInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.CarbonDioxydeInfo }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.CarbonDioxydeInfo getCarbonDioxydeInfo() {
                return carbonDioxydeInfo;
            }

            /**
             * Sets the value of the carbonDioxydeInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.CarbonDioxydeInfo }
             *     
             */
            public void setCarbonDioxydeInfo(PNRReply.OriginDestinationDetails.ItineraryInfo.CarbonDioxydeInfo value) {
                this.carbonDioxydeInfo = value;
            }

            /**
             * Gets the value of the itineraryfreeFormText property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itineraryfreeFormText property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItineraryfreeFormText().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link InteractiveFreeTextType }
             * 
             * 
             */
            public List<InteractiveFreeTextType> getItineraryfreeFormText() {
                if (itineraryfreeFormText == null) {
                    itineraryfreeFormText = new ArrayList<InteractiveFreeTextType>();
                }
                return this.itineraryfreeFormText;
            }

            /**
             * Gets the value of the itineraryFreetext property.
             * 
             * @return
             *     possible object is
             *     {@link LongFreeTextType }
             *     
             */
            public LongFreeTextType getItineraryFreetext() {
                return itineraryFreetext;
            }

            /**
             * Sets the value of the itineraryFreetext property.
             * 
             * @param value
             *     allowed object is
             *     {@link LongFreeTextType }
             *     
             */
            public void setItineraryFreetext(LongFreeTextType value) {
                this.itineraryFreetext = value;
            }

            /**
             * Gets the value of the distributionMethod property.
             * 
             * @return
             *     possible object is
             *     {@link MethodType }
             *     
             */
            public MethodType getDistributionMethod() {
                return distributionMethod;
            }

            /**
             * Sets the value of the distributionMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link MethodType }
             *     
             */
            public void setDistributionMethod(MethodType value) {
                this.distributionMethod = value;
            }

            /**
             * Gets the value of the hotelProduct property.
             * 
             * @return
             *     possible object is
             *     {@link HotelProductInformationType }
             *     
             */
            public HotelProductInformationType getHotelProduct() {
                return hotelProduct;
            }

            /**
             * Sets the value of the hotelProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link HotelProductInformationType }
             *     
             */
            public void setHotelProduct(HotelProductInformationType value) {
                this.hotelProduct = value;
            }

            /**
             * Gets the value of the rateInformations property.
             * 
             * @return
             *     possible object is
             *     {@link RateInformationType }
             *     
             */
            public RateInformationType getRateInformations() {
                return rateInformations;
            }

            /**
             * Sets the value of the rateInformations property.
             * 
             * @param value
             *     allowed object is
             *     {@link RateInformationType }
             *     
             */
            public void setRateInformations(RateInformationType value) {
                this.rateInformations = value;
            }

            /**
             * Gets the value of the generalOption property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the generalOption property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGeneralOption().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link GeneralOptionType }
             * 
             * 
             */
            public List<GeneralOptionType> getGeneralOption() {
                if (generalOption == null) {
                    generalOption = new ArrayList<GeneralOptionType>();
                }
                return this.generalOption;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link CountryCodeListType }
             *     
             */
            public CountryCodeListType getCountry() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link CountryCodeListType }
             *     
             */
            public void setCountry(CountryCodeListType value) {
                this.country = value;
            }

            /**
             * Gets the value of the taxInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the taxInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTaxInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TaxTypeI }
             * 
             * 
             */
            public List<TaxTypeI> getTaxInformation() {
                if (taxInformation == null) {
                    taxInformation = new ArrayList<TaxTypeI>();
                }
                return this.taxInformation;
            }

            /**
             * Gets the value of the customerTransactionData property.
             * 
             * @return
             *     possible object is
             *     {@link CustomerTransactionDataType }
             *     
             */
            public CustomerTransactionDataType getCustomerTransactionData() {
                return customerTransactionData;
            }

            /**
             * Sets the value of the customerTransactionData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CustomerTransactionDataType }
             *     
             */
            public void setCustomerTransactionData(CustomerTransactionDataType value) {
                this.customerTransactionData = value;
            }

            /**
             * Gets the value of the yieldGroup property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup getYieldGroup() {
                return yieldGroup;
            }

            /**
             * Sets the value of the yieldGroup property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup }
             *     
             */
            public void setYieldGroup(PNRReply.OriginDestinationDetails.ItineraryInfo.YieldGroup value) {
                this.yieldGroup = value;
            }

            /**
             * Gets the value of the legInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the legInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLegInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo }
             * 
             * 
             */
            public List<PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo> getLegInfo() {
                if (legInfo == null) {
                    legInfo = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.LegInfo>();
                }
                return this.legInfo;
            }

            /**
             * Gets the value of the flixInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flixInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlixInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FLIXType }
             * 
             * 
             */
            public List<FLIXType> getFlixInfo() {
                if (flixInfo == null) {
                    flixInfo = new ArrayList<FLIXType>();
                }
                return this.flixInfo;
            }

            /**
             * Gets the value of the dateTimeDetails property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationType }
             *     
             */
            public DateAndTimeInformationType getDateTimeDetails() {
                return dateTimeDetails;
            }

            /**
             * Sets the value of the dateTimeDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationType }
             *     
             */
            public void setDateTimeDetails(DateAndTimeInformationType value) {
                this.dateTimeDetails = value;
            }

            /**
             * Gets the value of the lccTypicalData property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData getLccTypicalData() {
                return lccTypicalData;
            }

            /**
             * Sets the value of the lccTypicalData property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData }
             *     
             */
            public void setLccTypicalData(PNRReply.OriginDestinationDetails.ItineraryInfo.LccTypicalData value) {
                this.lccTypicalData = value;
            }

            /**
             * Gets the value of the insuranceInformation property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the insuranceInformation property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInsuranceInformation().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation }
             * 
             * 
             */
            public List<PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation> getInsuranceInformation() {
                if (insuranceInformation == null) {
                    insuranceInformation = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.InsuranceInformation>();
                }
                return this.insuranceInformation;
            }

            /**
             * Gets the value of the insuranceDetails property.
             * 
             * @return
             *     possible object is
             *     {@link InsuranceBusinessDataType }
             *     
             */
            public InsuranceBusinessDataType getInsuranceDetails() {
                return insuranceDetails;
            }

            /**
             * Sets the value of the insuranceDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link InsuranceBusinessDataType }
             *     
             */
            public void setInsuranceDetails(InsuranceBusinessDataType value) {
                this.insuranceDetails = value;
            }

            /**
             * Gets the value of the hotelReservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo getHotelReservationInfo() {
                return hotelReservationInfo;
            }

            /**
             * Sets the value of the hotelReservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo }
             *     
             */
            public void setHotelReservationInfo(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo value) {
                this.hotelReservationInfo = value;
            }

            /**
             * Gets the value of the typicalCarData property.
             * 
             * @return
             *     possible object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData }
             *     
             */
            public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData getTypicalCarData() {
                return typicalCarData;
            }

            /**
             * Sets the value of the typicalCarData property.
             * 
             * @param value
             *     allowed object is
             *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData }
             *     
             */
            public void setTypicalCarData(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData value) {
                this.typicalCarData = value;
            }

            /**
             * Gets the value of the typicalCruiseData property.
             * 
             * @return
             *     possible object is
             *     {@link CruiseBusinessDataType }
             *     
             */
            public CruiseBusinessDataType getTypicalCruiseData() {
                return typicalCruiseData;
            }

            /**
             * Sets the value of the typicalCruiseData property.
             * 
             * @param value
             *     allowed object is
             *     {@link CruiseBusinessDataType }
             *     
             */
            public void setTypicalCruiseData(CruiseBusinessDataType value) {
                this.typicalCruiseData = value;
            }

            /**
             * Gets the value of the railInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TrainInformationType }
             *     
             */
            public TrainInformationType getRailInfo() {
                return railInfo;
            }

            /**
             * Sets the value of the railInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TrainInformationType }
             *     
             */
            public void setRailInfo(TrainInformationType value) {
                this.railInfo = value;
            }

            /**
             * Gets the value of the markerRailTour property.
             * 
             * @return
             *     possible object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public DummySegmentTypeI getMarkerRailTour() {
                return markerRailTour;
            }

            /**
             * Sets the value of the markerRailTour property.
             * 
             * @param value
             *     allowed object is
             *     {@link DummySegmentTypeI }
             *     
             */
            public void setMarkerRailTour(DummySegmentTypeI value) {
                this.markerRailTour = value;
            }

            /**
             * Gets the value of the tourInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TourInformationType }
             *     
             */
            public TourInformationType getTourInfo() {
                return tourInfo;
            }

            /**
             * Sets the value of the tourInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TourInformationType }
             *     
             */
            public void setTourInfo(TourInformationType value) {
                this.tourInfo = value;
            }

            /**
             * Gets the value of the ferryLegInformation property.
             * 
             * @return
             *     possible object is
             *     {@link FerryBookingDescriptionType }
             *     
             */
            public FerryBookingDescriptionType getFerryLegInformation() {
                return ferryLegInformation;
            }

            /**
             * Sets the value of the ferryLegInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link FerryBookingDescriptionType }
             *     
             */
            public void setFerryLegInformation(FerryBookingDescriptionType value) {
                this.ferryLegInformation = value;
            }

            /**
             * Gets the value of the errorInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ErrorGroupType223552G }
             *     
             */
            public ErrorGroupType223552G getErrorInfo() {
                return errorInfo;
            }

            /**
             * Sets the value of the errorInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ErrorGroupType223552G }
             *     
             */
            public void setErrorInfo(ErrorGroupType223552G value) {
                this.errorInfo = value;
            }

            /**
             * Gets the value of the referenceForSegment property.
             * 
             * @return
             *     possible object is
             *     {@link ReferenceInfoType }
             *     
             */
            public ReferenceInfoType getReferenceForSegment() {
                return referenceForSegment;
            }

            /**
             * Sets the value of the referenceForSegment property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReferenceInfoType }
             *     
             */
            public void setReferenceForSegment(ReferenceInfoType value) {
                this.referenceForSegment = value;
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
             *         &lt;element name="carbonDioxydeAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityType"/>
             *         &lt;element name="carbonDioxydeInfoSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType" minOccurs="0"/>
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
                "carbonDioxydeAmount",
                "carbonDioxydeInfoSource"
            })
            public static class CarbonDioxydeInfo {

                @XmlElement(required = true)
                protected QuantityType carbonDioxydeAmount;
                protected FreeTextInformationType carbonDioxydeInfoSource;

                /**
                 * Gets the value of the carbonDioxydeAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuantityType }
                 *     
                 */
                public QuantityType getCarbonDioxydeAmount() {
                    return carbonDioxydeAmount;
                }

                /**
                 * Sets the value of the carbonDioxydeAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuantityType }
                 *     
                 */
                public void setCarbonDioxydeAmount(QuantityType value) {
                    this.carbonDioxydeAmount = value;
                }

                /**
                 * Gets the value of the carbonDioxydeInfoSource property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType }
                 *     
                 */
                public FreeTextInformationType getCarbonDioxydeInfoSource() {
                    return carbonDioxydeInfoSource;
                }

                /**
                 * Sets the value of the carbonDioxydeInfoSource property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType }
                 *     
                 */
                public void setCarbonDioxydeInfoSource(FreeTextInformationType value) {
                    this.carbonDioxydeInfoSource = value;
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
             *         &lt;element name="hotelPropertyInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelPropertyType"/>
             *         &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
             *         &lt;element name="requestedDates" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207579S"/>
             *         &lt;element name="roomRateDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomType"/>
             *                   &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
             *                   &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI"/>
             *                   &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="3"/>
             *         &lt;element name="roomstayIndex" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemNumberTypeU_33258S" minOccurs="0"/>
             *         &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UserIdentificationType_215330S"/>
             *         &lt;element name="billableInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
             *         &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
             *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType_38226S" minOccurs="0"/>
             *         &lt;element name="guaranteeOrDeposit" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentInformationTypeI"/>
             *                   &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI_29553S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="textOptions" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_664S" maxOccurs="5" minOccurs="0"/>
             *         &lt;element name="savingAmountInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
             *         &lt;element name="writtenConfirmationContact" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ContactInformationTypeU" minOccurs="0"/>
             *         &lt;element name="writtenConfirmationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameAndAddressBatchTypeU" minOccurs="0"/>
             *         &lt;element name="documentInformationDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DocumentInformationDetailsTypeI_207581S" minOccurs="0"/>
             *         &lt;element name="arrivalFlightDetails" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193102S"/>
             *                   &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalTransportDetailsTypeU"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="bookingIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusType_99582S" minOccurs="0"/>
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
                "hotelPropertyInfo",
                "companyIdentification",
                "requestedDates",
                "roomRateDetails",
                "cancelOrConfirmNbr",
                "roomstayIndex",
                "bookingSource",
                "billableInfo",
                "customerInfo",
                "frequentTravellerInfo",
                "guaranteeOrDeposit",
                "textOptions",
                "savingAmountInfo",
                "writtenConfirmationContact",
                "writtenConfirmationInfo",
                "documentInformationDetails",
                "arrivalFlightDetails",
                "bookingIndicator"
            })
            public static class HotelReservationInfo {

                @XmlElement(required = true)
                protected HotelPropertyType hotelPropertyInfo;
                @XmlElement(required = true)
                protected CompanyInformationType companyIdentification;
                @XmlElement(required = true)
                protected StructuredPeriodInformationType207579S requestedDates;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails roomRateDetails;
                @XmlElement(required = true)
                protected List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr;
                protected ItemNumberTypeU33258S roomstayIndex;
                @XmlElement(required = true)
                protected UserIdentificationType215330S bookingSource;
                protected BillableInformationTypeU billableInfo;
                protected ConsumerReferenceInformationTypeI customerInfo;
                protected FrequentTravellerIdentificationCodeType38226S frequentTravellerInfo;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit guaranteeOrDeposit;
                protected List<MiscellaneousRemarksType664S> textOptions;
                protected MonetaryInformationTypeI1689S savingAmountInfo;
                protected ContactInformationTypeU writtenConfirmationContact;
                protected NameAndAddressBatchTypeU writtenConfirmationInfo;
                protected DocumentInformationDetailsTypeI207581S documentInformationDetails;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails arrivalFlightDetails;
                protected StatusType99582S bookingIndicator;

                /**
                 * Gets the value of the hotelPropertyInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link HotelPropertyType }
                 *     
                 */
                public HotelPropertyType getHotelPropertyInfo() {
                    return hotelPropertyInfo;
                }

                /**
                 * Sets the value of the hotelPropertyInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link HotelPropertyType }
                 *     
                 */
                public void setHotelPropertyInfo(HotelPropertyType value) {
                    this.hotelPropertyInfo = value;
                }

                /**
                 * Gets the value of the companyIdentification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CompanyInformationType }
                 *     
                 */
                public CompanyInformationType getCompanyIdentification() {
                    return companyIdentification;
                }

                /**
                 * Sets the value of the companyIdentification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CompanyInformationType }
                 *     
                 */
                public void setCompanyIdentification(CompanyInformationType value) {
                    this.companyIdentification = value;
                }

                /**
                 * Gets the value of the requestedDates property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredPeriodInformationType207579S }
                 *     
                 */
                public StructuredPeriodInformationType207579S getRequestedDates() {
                    return requestedDates;
                }

                /**
                 * Sets the value of the requestedDates property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredPeriodInformationType207579S }
                 *     
                 */
                public void setRequestedDates(StructuredPeriodInformationType207579S value) {
                    this.requestedDates = value;
                }

                /**
                 * Gets the value of the roomRateDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails getRoomRateDetails() {
                    return roomRateDetails;
                }

                /**
                 * Sets the value of the roomRateDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails }
                 *     
                 */
                public void setRoomRateDetails(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.RoomRateDetails value) {
                    this.roomRateDetails = value;
                }

                /**
                 * Gets the value of the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCancelOrConfirmNbr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReservationControlInformationTypeI196503S }
                 * 
                 * 
                 */
                public List<ReservationControlInformationTypeI196503S> getCancelOrConfirmNbr() {
                    if (cancelOrConfirmNbr == null) {
                        cancelOrConfirmNbr = new ArrayList<ReservationControlInformationTypeI196503S>();
                    }
                    return this.cancelOrConfirmNbr;
                }

                /**
                 * Gets the value of the roomstayIndex property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemNumberTypeU33258S }
                 *     
                 */
                public ItemNumberTypeU33258S getRoomstayIndex() {
                    return roomstayIndex;
                }

                /**
                 * Sets the value of the roomstayIndex property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemNumberTypeU33258S }
                 *     
                 */
                public void setRoomstayIndex(ItemNumberTypeU33258S value) {
                    this.roomstayIndex = value;
                }

                /**
                 * Gets the value of the bookingSource property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserIdentificationType215330S }
                 *     
                 */
                public UserIdentificationType215330S getBookingSource() {
                    return bookingSource;
                }

                /**
                 * Sets the value of the bookingSource property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserIdentificationType215330S }
                 *     
                 */
                public void setBookingSource(UserIdentificationType215330S value) {
                    this.bookingSource = value;
                }

                /**
                 * Gets the value of the billableInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BillableInformationTypeU }
                 *     
                 */
                public BillableInformationTypeU getBillableInfo() {
                    return billableInfo;
                }

                /**
                 * Sets the value of the billableInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BillableInformationTypeU }
                 *     
                 */
                public void setBillableInfo(BillableInformationTypeU value) {
                    this.billableInfo = value;
                }

                /**
                 * Gets the value of the customerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsumerReferenceInformationTypeI }
                 *     
                 */
                public ConsumerReferenceInformationTypeI getCustomerInfo() {
                    return customerInfo;
                }

                /**
                 * Sets the value of the customerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsumerReferenceInformationTypeI }
                 *     
                 */
                public void setCustomerInfo(ConsumerReferenceInformationTypeI value) {
                    this.customerInfo = value;
                }

                /**
                 * Gets the value of the frequentTravellerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FrequentTravellerIdentificationCodeType38226S }
                 *     
                 */
                public FrequentTravellerIdentificationCodeType38226S getFrequentTravellerInfo() {
                    return frequentTravellerInfo;
                }

                /**
                 * Sets the value of the frequentTravellerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FrequentTravellerIdentificationCodeType38226S }
                 *     
                 */
                public void setFrequentTravellerInfo(FrequentTravellerIdentificationCodeType38226S value) {
                    this.frequentTravellerInfo = value;
                }

                /**
                 * Gets the value of the guaranteeOrDeposit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit getGuaranteeOrDeposit() {
                    return guaranteeOrDeposit;
                }

                /**
                 * Sets the value of the guaranteeOrDeposit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit }
                 *     
                 */
                public void setGuaranteeOrDeposit(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.GuaranteeOrDeposit value) {
                    this.guaranteeOrDeposit = value;
                }

                /**
                 * Gets the value of the textOptions property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the textOptions property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTextOptions().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MiscellaneousRemarksType664S }
                 * 
                 * 
                 */
                public List<MiscellaneousRemarksType664S> getTextOptions() {
                    if (textOptions == null) {
                        textOptions = new ArrayList<MiscellaneousRemarksType664S>();
                    }
                    return this.textOptions;
                }

                /**
                 * Gets the value of the savingAmountInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI1689S }
                 *     
                 */
                public MonetaryInformationTypeI1689S getSavingAmountInfo() {
                    return savingAmountInfo;
                }

                /**
                 * Sets the value of the savingAmountInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI1689S }
                 *     
                 */
                public void setSavingAmountInfo(MonetaryInformationTypeI1689S value) {
                    this.savingAmountInfo = value;
                }

                /**
                 * Gets the value of the writtenConfirmationContact property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ContactInformationTypeU }
                 *     
                 */
                public ContactInformationTypeU getWrittenConfirmationContact() {
                    return writtenConfirmationContact;
                }

                /**
                 * Sets the value of the writtenConfirmationContact property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ContactInformationTypeU }
                 *     
                 */
                public void setWrittenConfirmationContact(ContactInformationTypeU value) {
                    this.writtenConfirmationContact = value;
                }

                /**
                 * Gets the value of the writtenConfirmationInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameAndAddressBatchTypeU }
                 *     
                 */
                public NameAndAddressBatchTypeU getWrittenConfirmationInfo() {
                    return writtenConfirmationInfo;
                }

                /**
                 * Sets the value of the writtenConfirmationInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameAndAddressBatchTypeU }
                 *     
                 */
                public void setWrittenConfirmationInfo(NameAndAddressBatchTypeU value) {
                    this.writtenConfirmationInfo = value;
                }

                /**
                 * Gets the value of the documentInformationDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DocumentInformationDetailsTypeI207581S }
                 *     
                 */
                public DocumentInformationDetailsTypeI207581S getDocumentInformationDetails() {
                    return documentInformationDetails;
                }

                /**
                 * Sets the value of the documentInformationDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DocumentInformationDetailsTypeI207581S }
                 *     
                 */
                public void setDocumentInformationDetails(DocumentInformationDetailsTypeI207581S value) {
                    this.documentInformationDetails = value;
                }

                /**
                 * Gets the value of the arrivalFlightDetails property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails getArrivalFlightDetails() {
                    return arrivalFlightDetails;
                }

                /**
                 * Sets the value of the arrivalFlightDetails property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails }
                 *     
                 */
                public void setArrivalFlightDetails(PNRReply.OriginDestinationDetails.ItineraryInfo.HotelReservationInfo.ArrivalFlightDetails value) {
                    this.arrivalFlightDetails = value;
                }

                /**
                 * Gets the value of the bookingIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StatusType99582S }
                 *     
                 */
                public StatusType99582S getBookingIndicator() {
                    return bookingIndicator;
                }

                /**
                 * Sets the value of the bookingIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StatusType99582S }
                 *     
                 */
                public void setBookingIndicator(StatusType99582S value) {
                    this.bookingIndicator = value;
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
                 *         &lt;element name="travelProductInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_193102S"/>
                 *         &lt;element name="additionalTransportDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalTransportDetailsTypeU"/>
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
                    "travelProductInformation",
                    "additionalTransportDetails"
                })
                public static class ArrivalFlightDetails {

                    @XmlElement(required = true)
                    protected TravelProductInformationTypeI193102S travelProductInformation;
                    @XmlElement(required = true)
                    protected AdditionalTransportDetailsTypeU additionalTransportDetails;

                    /**
                     * Gets the value of the travelProductInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TravelProductInformationTypeI193102S }
                     *     
                     */
                    public TravelProductInformationTypeI193102S getTravelProductInformation() {
                        return travelProductInformation;
                    }

                    /**
                     * Sets the value of the travelProductInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TravelProductInformationTypeI193102S }
                     *     
                     */
                    public void setTravelProductInformation(TravelProductInformationTypeI193102S value) {
                        this.travelProductInformation = value;
                    }

                    /**
                     * Gets the value of the additionalTransportDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AdditionalTransportDetailsTypeU }
                     *     
                     */
                    public AdditionalTransportDetailsTypeU getAdditionalTransportDetails() {
                        return additionalTransportDetails;
                    }

                    /**
                     * Sets the value of the additionalTransportDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AdditionalTransportDetailsTypeU }
                     *     
                     */
                    public void setAdditionalTransportDetails(AdditionalTransportDetailsTypeU value) {
                        this.additionalTransportDetails = value;
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
                 *         &lt;element name="paymentInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentInformationTypeI"/>
                 *         &lt;element name="creditCardInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI_29553S" minOccurs="0"/>
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
                    "paymentInfo",
                    "creditCardInfo"
                })
                public static class GuaranteeOrDeposit {

                    @XmlElement(required = true)
                    protected PaymentInformationTypeI paymentInfo;
                    protected FormOfPaymentTypeI29553S creditCardInfo;

                    /**
                     * Gets the value of the paymentInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PaymentInformationTypeI }
                     *     
                     */
                    public PaymentInformationTypeI getPaymentInfo() {
                        return paymentInfo;
                    }

                    /**
                     * Sets the value of the paymentInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PaymentInformationTypeI }
                     *     
                     */
                    public void setPaymentInfo(PaymentInformationTypeI value) {
                        this.paymentInfo = value;
                    }

                    /**
                     * Gets the value of the creditCardInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FormOfPaymentTypeI29553S }
                     *     
                     */
                    public FormOfPaymentTypeI29553S getCreditCardInfo() {
                        return creditCardInfo;
                    }

                    /**
                     * Sets the value of the creditCardInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FormOfPaymentTypeI29553S }
                     *     
                     */
                    public void setCreditCardInfo(FormOfPaymentTypeI29553S value) {
                        this.creditCardInfo = value;
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
                 *         &lt;element name="roomInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}HotelRoomType"/>
                 *         &lt;element name="children" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ChildrenGroupType" maxOccurs="99" minOccurs="0"/>
                 *         &lt;element name="tariffDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI"/>
                 *         &lt;element name="rateCodeIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU" minOccurs="0"/>
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
                    "roomInformation",
                    "children",
                    "tariffDetails",
                    "rateCodeIndicator"
                })
                public static class RoomRateDetails {

                    @XmlElement(required = true)
                    protected HotelRoomType roomInformation;
                    protected List<ChildrenGroupType> children;
                    @XmlElement(required = true)
                    protected TariffInformationTypeI tariffDetails;
                    protected RuleInformationTypeU rateCodeIndicator;

                    /**
                     * Gets the value of the roomInformation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link HotelRoomType }
                     *     
                     */
                    public HotelRoomType getRoomInformation() {
                        return roomInformation;
                    }

                    /**
                     * Sets the value of the roomInformation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link HotelRoomType }
                     *     
                     */
                    public void setRoomInformation(HotelRoomType value) {
                        this.roomInformation = value;
                    }

                    /**
                     * Gets the value of the children property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the children property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getChildren().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ChildrenGroupType }
                     * 
                     * 
                     */
                    public List<ChildrenGroupType> getChildren() {
                        if (children == null) {
                            children = new ArrayList<ChildrenGroupType>();
                        }
                        return this.children;
                    }

                    /**
                     * Gets the value of the tariffDetails property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TariffInformationTypeI }
                     *     
                     */
                    public TariffInformationTypeI getTariffDetails() {
                        return tariffDetails;
                    }

                    /**
                     * Sets the value of the tariffDetails property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TariffInformationTypeI }
                     *     
                     */
                    public void setTariffDetails(TariffInformationTypeI value) {
                        this.tariffDetails = value;
                    }

                    /**
                     * Gets the value of the rateCodeIndicator property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link RuleInformationTypeU }
                     *     
                     */
                    public RuleInformationTypeU getRateCodeIndicator() {
                        return rateCodeIndicator;
                    }

                    /**
                     * Sets the value of the rateCodeIndicator property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link RuleInformationTypeU }
                     *     
                     */
                    public void setRateCodeIndicator(RuleInformationTypeU value) {
                        this.rateCodeIndicator = value;
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
             *         &lt;element name="insuranceName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InsuranceNameType"/>
             *         &lt;element name="insuranceMonetaryInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_1689S" minOccurs="0"/>
             *         &lt;element name="insurancePremiumInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInsuranceInformationType" minOccurs="0"/>
             *         &lt;element name="insuranceDocInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerDocumentInformationTypeU" minOccurs="0"/>
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
                "insuranceName",
                "insuranceMonetaryInformation",
                "insurancePremiumInfo",
                "insuranceDocInfo"
            })
            public static class InsuranceInformation {

                @XmlElement(required = true)
                protected InsuranceNameType insuranceName;
                protected MonetaryInformationTypeI1689S insuranceMonetaryInformation;
                protected TravellerInsuranceInformationType insurancePremiumInfo;
                protected TravellerDocumentInformationTypeU insuranceDocInfo;

                /**
                 * Gets the value of the insuranceName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link InsuranceNameType }
                 *     
                 */
                public InsuranceNameType getInsuranceName() {
                    return insuranceName;
                }

                /**
                 * Sets the value of the insuranceName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link InsuranceNameType }
                 *     
                 */
                public void setInsuranceName(InsuranceNameType value) {
                    this.insuranceName = value;
                }

                /**
                 * Gets the value of the insuranceMonetaryInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonetaryInformationTypeI1689S }
                 *     
                 */
                public MonetaryInformationTypeI1689S getInsuranceMonetaryInformation() {
                    return insuranceMonetaryInformation;
                }

                /**
                 * Sets the value of the insuranceMonetaryInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonetaryInformationTypeI1689S }
                 *     
                 */
                public void setInsuranceMonetaryInformation(MonetaryInformationTypeI1689S value) {
                    this.insuranceMonetaryInformation = value;
                }

                /**
                 * Gets the value of the insurancePremiumInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravellerInsuranceInformationType }
                 *     
                 */
                public TravellerInsuranceInformationType getInsurancePremiumInfo() {
                    return insurancePremiumInfo;
                }

                /**
                 * Sets the value of the insurancePremiumInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravellerInsuranceInformationType }
                 *     
                 */
                public void setInsurancePremiumInfo(TravellerInsuranceInformationType value) {
                    this.insurancePremiumInfo = value;
                }

                /**
                 * Gets the value of the insuranceDocInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravellerDocumentInformationTypeU }
                 *     
                 */
                public TravellerDocumentInformationTypeU getInsuranceDocInfo() {
                    return insuranceDocInfo;
                }

                /**
                 * Sets the value of the insuranceDocInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravellerDocumentInformationTypeU }
                 *     
                 */
                public void setInsuranceDocInfo(TravellerDocumentInformationTypeU value) {
                    this.insuranceDocInfo = value;
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
             *         &lt;element name="lccFareData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_28460S"/>
             *         &lt;element name="lccConnectionData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemReferencesAndVersionsType_6550S" minOccurs="0"/>
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
                "lccFareData",
                "lccConnectionData"
            })
            public static class LccTypicalData {

                @XmlElement(required = true)
                protected TariffInformationTypeI28460S lccFareData;
                protected ItemReferencesAndVersionsType6550S lccConnectionData;

                /**
                 * Gets the value of the lccFareData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TariffInformationTypeI28460S }
                 *     
                 */
                public TariffInformationTypeI28460S getLccFareData() {
                    return lccFareData;
                }

                /**
                 * Sets the value of the lccFareData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TariffInformationTypeI28460S }
                 *     
                 */
                public void setLccFareData(TariffInformationTypeI28460S value) {
                    this.lccFareData = value;
                }

                /**
                 * Gets the value of the lccConnectionData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ItemReferencesAndVersionsType6550S }
                 *     
                 */
                public ItemReferencesAndVersionsType6550S getLccConnectionData() {
                    return lccConnectionData;
                }

                /**
                 * Sets the value of the lccConnectionData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ItemReferencesAndVersionsType6550S }
                 *     
                 */
                public void setLccConnectionData(ItemReferencesAndVersionsType6550S value) {
                    this.lccConnectionData = value;
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
             *         &lt;element name="markerLegInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FlightSegmentDetailsTypeI"/>
             *         &lt;element name="legTravelProduct" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeI_99362S"/>
             *         &lt;element name="interactiveFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_99363S" maxOccurs="2" minOccurs="0"/>
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
                "markerLegInfo",
                "legTravelProduct",
                "interactiveFreeText"
            })
            public static class LegInfo {

                @XmlElement(required = true)
                protected FlightSegmentDetailsTypeI markerLegInfo;
                @XmlElement(required = true)
                protected TravelProductInformationTypeI99362S legTravelProduct;
                protected List<InteractiveFreeTextTypeI99363S> interactiveFreeText;

                /**
                 * Gets the value of the markerLegInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightSegmentDetailsTypeI }
                 *     
                 */
                public FlightSegmentDetailsTypeI getMarkerLegInfo() {
                    return markerLegInfo;
                }

                /**
                 * Sets the value of the markerLegInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightSegmentDetailsTypeI }
                 *     
                 */
                public void setMarkerLegInfo(FlightSegmentDetailsTypeI value) {
                    this.markerLegInfo = value;
                }

                /**
                 * Gets the value of the legTravelProduct property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TravelProductInformationTypeI99362S }
                 *     
                 */
                public TravelProductInformationTypeI99362S getLegTravelProduct() {
                    return legTravelProduct;
                }

                /**
                 * Sets the value of the legTravelProduct property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TravelProductInformationTypeI99362S }
                 *     
                 */
                public void setLegTravelProduct(TravelProductInformationTypeI99362S value) {
                    this.legTravelProduct = value;
                }

                /**
                 * Gets the value of the interactiveFreeText property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the interactiveFreeText property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInteractiveFreeText().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InteractiveFreeTextTypeI99363S }
                 * 
                 * 
                 */
                public List<InteractiveFreeTextTypeI99363S> getInteractiveFreeText() {
                    if (interactiveFreeText == null) {
                        interactiveFreeText = new ArrayList<InteractiveFreeTextTypeI99363S>();
                    }
                    return this.interactiveFreeText;
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
             *         &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VehicleInformationType"/>
             *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
             *         &lt;element name="voucherPrintAck" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_136704S" minOccurs="0"/>
             *         &lt;element name="companyIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType"/>
             *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU" maxOccurs="6"/>
             *         &lt;element name="deliveryAndCollection" maxOccurs="2" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136710S"/>
             *                   &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="pickupDropoffTimes" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S"/>
             *         &lt;element name="cancelOrConfirmNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationTypeI_196503S" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="rateCodeGroup" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareQualifierDetailsTypeI"/>
             *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="fFlyerNbr" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
             *         &lt;element name="customerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceInformationTypeI" minOccurs="0"/>
             *         &lt;element name="rateInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136706S" maxOccurs="10" minOccurs="0"/>
             *         &lt;element name="errorWarning" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationErrorInformationType"/>
             *                   &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="rulesPoliciesGroup" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
             *                   &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/>
             *                   &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
             *                   &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S"/>
             *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
             *                             &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
             *                                       &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136719S"/>
             *                                       &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
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
             *                   &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU_136720S"/>
             *                             &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S" maxOccurs="2" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_136722S"/>
             *                             &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136721S" minOccurs="0"/>
             *                             &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_136724S" maxOccurs="10" minOccurs="0"/>
             *                             &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_136723S" maxOccurs="2" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
             *                             &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
             *                                       &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136715S" minOccurs="0"/>
             *                             &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S" maxOccurs="6"/>
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
             *         &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentTypeI" minOccurs="0"/>
             *         &lt;element name="billingData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}BillableInformationTypeU" minOccurs="0"/>
             *         &lt;element name="bookingSource" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AdditionalBusinessSourceInformationType" minOccurs="0"/>
             *         &lt;element name="inclusiveTour" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationTypeI" minOccurs="0"/>
             *         &lt;element name="marketingInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InteractiveFreeTextTypeI_136698S" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="supleInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MiscellaneousRemarksType_136700S" maxOccurs="6" minOccurs="0"/>
             *         &lt;element name="estimatedDistance" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityTypeI" maxOccurs="2" minOccurs="0"/>
             *         &lt;element name="agentInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NameTypeU_136701S" minOccurs="0"/>
             *         &lt;element name="trackingOpt" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AgreementIdentificationTypeU" minOccurs="0"/>
             *         &lt;element name="electronicVoucherNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketNumberTypeI" minOccurs="0"/>
             *         &lt;element name="customerEmail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommunicationContactTypeU" minOccurs="0"/>
             *         &lt;element name="attribute" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType"/>
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
                "vehicleInformation",
                "additionalInfo",
                "voucherPrintAck",
                "companyIdentification",
                "locationInfo",
                "deliveryAndCollection",
                "pickupDropoffTimes",
                "cancelOrConfirmNbr",
                "rateCodeGroup",
                "fFlyerNbr",
                "customerInfo",
                "rateInfo",
                "errorWarning",
                "rulesPoliciesGroup",
                "payment",
                "billingData",
                "bookingSource",
                "inclusiveTour",
                "marketingInfo",
                "supleInfo",
                "estimatedDistance",
                "agentInformation",
                "trackingOpt",
                "electronicVoucherNumber",
                "customerEmail",
                "attribute"
            })
            public static class TypicalCarData {

                @XmlElement(required = true)
                protected VehicleInformationType vehicleInformation;
                protected FreeTextInformationType136708S additionalInfo;
                protected ReferenceInformationTypeI136704S voucherPrintAck;
                @XmlElement(required = true)
                protected CompanyInformationType companyIdentification;
                @XmlElement(required = true)
                protected List<PlaceLocationIdentificationTypeU> locationInfo;
                protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection> deliveryAndCollection;
                @XmlElement(required = true)
                protected StructuredPeriodInformationType207595S pickupDropoffTimes;
                protected List<ReservationControlInformationTypeI196503S> cancelOrConfirmNbr;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup rateCodeGroup;
                protected FrequentTravellerIdentificationCodeType fFlyerNbr;
                protected ConsumerReferenceInformationTypeI customerInfo;
                protected List<TariffInformationTypeI136706S> rateInfo;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning errorWarning;
                protected PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup rulesPoliciesGroup;
                protected FormOfPaymentTypeI payment;
                protected BillableInformationTypeU billingData;
                protected AdditionalBusinessSourceInformationType bookingSource;
                protected TourInformationTypeI inclusiveTour;
                protected List<InteractiveFreeTextTypeI136698S> marketingInfo;
                protected List<MiscellaneousRemarksType136700S> supleInfo;
                protected List<QuantityTypeI> estimatedDistance;
                protected NameTypeU136701S agentInformation;
                protected AgreementIdentificationTypeU trackingOpt;
                protected TicketNumberTypeI electronicVoucherNumber;
                protected CommunicationContactTypeU customerEmail;
                @XmlElement(required = true)
                protected AttributeType attribute;

                /**
                 * Gets the value of the vehicleInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link VehicleInformationType }
                 *     
                 */
                public VehicleInformationType getVehicleInformation() {
                    return vehicleInformation;
                }

                /**
                 * Sets the value of the vehicleInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link VehicleInformationType }
                 *     
                 */
                public void setVehicleInformation(VehicleInformationType value) {
                    this.vehicleInformation = value;
                }

                /**
                 * Gets the value of the additionalInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FreeTextInformationType136708S }
                 *     
                 */
                public FreeTextInformationType136708S getAdditionalInfo() {
                    return additionalInfo;
                }

                /**
                 * Sets the value of the additionalInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FreeTextInformationType136708S }
                 *     
                 */
                public void setAdditionalInfo(FreeTextInformationType136708S value) {
                    this.additionalInfo = value;
                }

                /**
                 * Gets the value of the voucherPrintAck property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ReferenceInformationTypeI136704S }
                 *     
                 */
                public ReferenceInformationTypeI136704S getVoucherPrintAck() {
                    return voucherPrintAck;
                }

                /**
                 * Sets the value of the voucherPrintAck property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ReferenceInformationTypeI136704S }
                 *     
                 */
                public void setVoucherPrintAck(ReferenceInformationTypeI136704S value) {
                    this.voucherPrintAck = value;
                }

                /**
                 * Gets the value of the companyIdentification property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CompanyInformationType }
                 *     
                 */
                public CompanyInformationType getCompanyIdentification() {
                    return companyIdentification;
                }

                /**
                 * Sets the value of the companyIdentification property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CompanyInformationType }
                 *     
                 */
                public void setCompanyIdentification(CompanyInformationType value) {
                    this.companyIdentification = value;
                }

                /**
                 * Gets the value of the locationInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the locationInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLocationInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PlaceLocationIdentificationTypeU }
                 * 
                 * 
                 */
                public List<PlaceLocationIdentificationTypeU> getLocationInfo() {
                    if (locationInfo == null) {
                        locationInfo = new ArrayList<PlaceLocationIdentificationTypeU>();
                    }
                    return this.locationInfo;
                }

                /**
                 * Gets the value of the deliveryAndCollection property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the deliveryAndCollection property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDeliveryAndCollection().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection }
                 * 
                 * 
                 */
                public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection> getDeliveryAndCollection() {
                    if (deliveryAndCollection == null) {
                        deliveryAndCollection = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.DeliveryAndCollection>();
                    }
                    return this.deliveryAndCollection;
                }

                /**
                 * Gets the value of the pickupDropoffTimes property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link StructuredPeriodInformationType207595S }
                 *     
                 */
                public StructuredPeriodInformationType207595S getPickupDropoffTimes() {
                    return pickupDropoffTimes;
                }

                /**
                 * Sets the value of the pickupDropoffTimes property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link StructuredPeriodInformationType207595S }
                 *     
                 */
                public void setPickupDropoffTimes(StructuredPeriodInformationType207595S value) {
                    this.pickupDropoffTimes = value;
                }

                /**
                 * Gets the value of the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cancelOrConfirmNbr property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCancelOrConfirmNbr().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ReservationControlInformationTypeI196503S }
                 * 
                 * 
                 */
                public List<ReservationControlInformationTypeI196503S> getCancelOrConfirmNbr() {
                    if (cancelOrConfirmNbr == null) {
                        cancelOrConfirmNbr = new ArrayList<ReservationControlInformationTypeI196503S>();
                    }
                    return this.cancelOrConfirmNbr;
                }

                /**
                 * Gets the value of the rateCodeGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup getRateCodeGroup() {
                    return rateCodeGroup;
                }

                /**
                 * Sets the value of the rateCodeGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup }
                 *     
                 */
                public void setRateCodeGroup(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RateCodeGroup value) {
                    this.rateCodeGroup = value;
                }

                /**
                 * Gets the value of the fFlyerNbr property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FrequentTravellerIdentificationCodeType }
                 *     
                 */
                public FrequentTravellerIdentificationCodeType getFFlyerNbr() {
                    return fFlyerNbr;
                }

                /**
                 * Sets the value of the fFlyerNbr property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FrequentTravellerIdentificationCodeType }
                 *     
                 */
                public void setFFlyerNbr(FrequentTravellerIdentificationCodeType value) {
                    this.fFlyerNbr = value;
                }

                /**
                 * Gets the value of the customerInfo property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ConsumerReferenceInformationTypeI }
                 *     
                 */
                public ConsumerReferenceInformationTypeI getCustomerInfo() {
                    return customerInfo;
                }

                /**
                 * Sets the value of the customerInfo property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ConsumerReferenceInformationTypeI }
                 *     
                 */
                public void setCustomerInfo(ConsumerReferenceInformationTypeI value) {
                    this.customerInfo = value;
                }

                /**
                 * Gets the value of the rateInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the rateInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRateInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TariffInformationTypeI136706S }
                 * 
                 * 
                 */
                public List<TariffInformationTypeI136706S> getRateInfo() {
                    if (rateInfo == null) {
                        rateInfo = new ArrayList<TariffInformationTypeI136706S>();
                    }
                    return this.rateInfo;
                }

                /**
                 * Gets the value of the errorWarning property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning getErrorWarning() {
                    return errorWarning;
                }

                /**
                 * Sets the value of the errorWarning property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning }
                 *     
                 */
                public void setErrorWarning(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.ErrorWarning value) {
                    this.errorWarning = value;
                }

                /**
                 * Gets the value of the rulesPoliciesGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup }
                 *     
                 */
                public PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup getRulesPoliciesGroup() {
                    return rulesPoliciesGroup;
                }

                /**
                 * Sets the value of the rulesPoliciesGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup }
                 *     
                 */
                public void setRulesPoliciesGroup(PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup value) {
                    this.rulesPoliciesGroup = value;
                }

                /**
                 * Gets the value of the payment property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FormOfPaymentTypeI }
                 *     
                 */
                public FormOfPaymentTypeI getPayment() {
                    return payment;
                }

                /**
                 * Sets the value of the payment property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FormOfPaymentTypeI }
                 *     
                 */
                public void setPayment(FormOfPaymentTypeI value) {
                    this.payment = value;
                }

                /**
                 * Gets the value of the billingData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BillableInformationTypeU }
                 *     
                 */
                public BillableInformationTypeU getBillingData() {
                    return billingData;
                }

                /**
                 * Sets the value of the billingData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BillableInformationTypeU }
                 *     
                 */
                public void setBillingData(BillableInformationTypeU value) {
                    this.billingData = value;
                }

                /**
                 * Gets the value of the bookingSource property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdditionalBusinessSourceInformationType }
                 *     
                 */
                public AdditionalBusinessSourceInformationType getBookingSource() {
                    return bookingSource;
                }

                /**
                 * Sets the value of the bookingSource property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdditionalBusinessSourceInformationType }
                 *     
                 */
                public void setBookingSource(AdditionalBusinessSourceInformationType value) {
                    this.bookingSource = value;
                }

                /**
                 * Gets the value of the inclusiveTour property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TourInformationTypeI }
                 *     
                 */
                public TourInformationTypeI getInclusiveTour() {
                    return inclusiveTour;
                }

                /**
                 * Sets the value of the inclusiveTour property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TourInformationTypeI }
                 *     
                 */
                public void setInclusiveTour(TourInformationTypeI value) {
                    this.inclusiveTour = value;
                }

                /**
                 * Gets the value of the marketingInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the marketingInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMarketingInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link InteractiveFreeTextTypeI136698S }
                 * 
                 * 
                 */
                public List<InteractiveFreeTextTypeI136698S> getMarketingInfo() {
                    if (marketingInfo == null) {
                        marketingInfo = new ArrayList<InteractiveFreeTextTypeI136698S>();
                    }
                    return this.marketingInfo;
                }

                /**
                 * Gets the value of the supleInfo property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the supleInfo property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSupleInfo().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link MiscellaneousRemarksType136700S }
                 * 
                 * 
                 */
                public List<MiscellaneousRemarksType136700S> getSupleInfo() {
                    if (supleInfo == null) {
                        supleInfo = new ArrayList<MiscellaneousRemarksType136700S>();
                    }
                    return this.supleInfo;
                }

                /**
                 * Gets the value of the estimatedDistance property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the estimatedDistance property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEstimatedDistance().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link QuantityTypeI }
                 * 
                 * 
                 */
                public List<QuantityTypeI> getEstimatedDistance() {
                    if (estimatedDistance == null) {
                        estimatedDistance = new ArrayList<QuantityTypeI>();
                    }
                    return this.estimatedDistance;
                }

                /**
                 * Gets the value of the agentInformation property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link NameTypeU136701S }
                 *     
                 */
                public NameTypeU136701S getAgentInformation() {
                    return agentInformation;
                }

                /**
                 * Sets the value of the agentInformation property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link NameTypeU136701S }
                 *     
                 */
                public void setAgentInformation(NameTypeU136701S value) {
                    this.agentInformation = value;
                }

                /**
                 * Gets the value of the trackingOpt property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AgreementIdentificationTypeU }
                 *     
                 */
                public AgreementIdentificationTypeU getTrackingOpt() {
                    return trackingOpt;
                }

                /**
                 * Sets the value of the trackingOpt property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AgreementIdentificationTypeU }
                 *     
                 */
                public void setTrackingOpt(AgreementIdentificationTypeU value) {
                    this.trackingOpt = value;
                }

                /**
                 * Gets the value of the electronicVoucherNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public TicketNumberTypeI getElectronicVoucherNumber() {
                    return electronicVoucherNumber;
                }

                /**
                 * Sets the value of the electronicVoucherNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TicketNumberTypeI }
                 *     
                 */
                public void setElectronicVoucherNumber(TicketNumberTypeI value) {
                    this.electronicVoucherNumber = value;
                }

                /**
                 * Gets the value of the customerEmail property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CommunicationContactTypeU }
                 *     
                 */
                public CommunicationContactTypeU getCustomerEmail() {
                    return customerEmail;
                }

                /**
                 * Sets the value of the customerEmail property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CommunicationContactTypeU }
                 *     
                 */
                public void setCustomerEmail(CommunicationContactTypeU value) {
                    this.customerEmail = value;
                }

                /**
                 * Gets the value of the attribute property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AttributeType }
                 *     
                 */
                public AttributeType getAttribute() {
                    return attribute;
                }

                /**
                 * Sets the value of the attribute property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AttributeType }
                 *     
                 */
                public void setAttribute(AttributeType value) {
                    this.attribute = value;
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
                 *         &lt;element name="addressDeliveryCollection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136710S"/>
                 *         &lt;element name="phoneNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType"/>
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
                    "addressDeliveryCollection",
                    "phoneNumber"
                })
                public static class DeliveryAndCollection {

                    @XmlElement(required = true)
                    protected AddressTypeU136710S addressDeliveryCollection;
                    @XmlElement(required = true)
                    protected PhoneAndEmailAddressType phoneNumber;

                    /**
                     * Gets the value of the addressDeliveryCollection property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link AddressTypeU136710S }
                     *     
                     */
                    public AddressTypeU136710S getAddressDeliveryCollection() {
                        return addressDeliveryCollection;
                    }

                    /**
                     * Sets the value of the addressDeliveryCollection property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AddressTypeU136710S }
                     *     
                     */
                    public void setAddressDeliveryCollection(AddressTypeU136710S value) {
                        this.addressDeliveryCollection = value;
                    }

                    /**
                     * Gets the value of the phoneNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link PhoneAndEmailAddressType }
                     *     
                     */
                    public PhoneAndEmailAddressType getPhoneNumber() {
                        return phoneNumber;
                    }

                    /**
                     * Sets the value of the phoneNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link PhoneAndEmailAddressType }
                     *     
                     */
                    public void setPhoneNumber(PhoneAndEmailAddressType value) {
                        this.phoneNumber = value;
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
                 *         &lt;element name="applicationError" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ApplicationErrorInformationType"/>
                 *         &lt;element name="errorFreeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
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
                    "applicationError",
                    "errorFreeText"
                })
                public static class ErrorWarning {

                    @XmlElement(required = true)
                    protected ApplicationErrorInformationType applicationError;
                    protected FreeTextInformationType136708S errorFreeText;

                    /**
                     * Gets the value of the applicationError property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ApplicationErrorInformationType }
                     *     
                     */
                    public ApplicationErrorInformationType getApplicationError() {
                        return applicationError;
                    }

                    /**
                     * Sets the value of the applicationError property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ApplicationErrorInformationType }
                     *     
                     */
                    public void setApplicationError(ApplicationErrorInformationType value) {
                        this.applicationError = value;
                    }

                    /**
                     * Gets the value of the errorFreeText property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformationType136708S }
                     *     
                     */
                    public FreeTextInformationType136708S getErrorFreeText() {
                        return errorFreeText;
                    }

                    /**
                     * Sets the value of the errorFreeText property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformationType136708S }
                     *     
                     */
                    public void setErrorFreeText(FreeTextInformationType136708S value) {
                        this.errorFreeText = value;
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
                 *         &lt;element name="rateCodeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareQualifierDetailsTypeI"/>
                 *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
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
                    "rateCodeInfo",
                    "additionalInfo"
                })
                public static class RateCodeGroup {

                    @XmlElement(required = true)
                    protected FareQualifierDetailsTypeI rateCodeInfo;
                    protected FreeTextInformationType136708S additionalInfo;

                    /**
                     * Gets the value of the rateCodeInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FareQualifierDetailsTypeI }
                     *     
                     */
                    public FareQualifierDetailsTypeI getRateCodeInfo() {
                        return rateCodeInfo;
                    }

                    /**
                     * Sets the value of the rateCodeInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FareQualifierDetailsTypeI }
                     *     
                     */
                    public void setRateCodeInfo(FareQualifierDetailsTypeI value) {
                        this.rateCodeInfo = value;
                    }

                    /**
                     * Gets the value of the additionalInfo property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformationType136708S }
                     *     
                     */
                    public FreeTextInformationType136708S getAdditionalInfo() {
                        return additionalInfo;
                    }

                    /**
                     * Sets the value of the additionalInfo property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformationType136708S }
                     *     
                     */
                    public void setAdditionalInfo(FreeTextInformationType136708S value) {
                        this.additionalInfo = value;
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
                 *         &lt;element name="dummy1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
                 *         &lt;element name="sourceLevel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI" minOccurs="0"/>
                 *         &lt;element name="remarks" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
                 *         &lt;element name="taxCovSurchargeGroup" maxOccurs="98" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S"/>
                 *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
                 *                   &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
                 *                             &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136719S"/>
                 *                             &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
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
                 *         &lt;element name="otherRulesGroup" maxOccurs="13" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU_136720S"/>
                 *                   &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S" maxOccurs="2" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="pickupDropoffLocation" maxOccurs="2" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_136722S"/>
                 *                   &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136721S" minOccurs="0"/>
                 *                   &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_136724S" maxOccurs="10" minOccurs="0"/>
                 *                   &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_136723S" maxOccurs="2" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="specialEquipmentDetails" maxOccurs="5" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
                 *                   &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
                 *                             &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136715S" minOccurs="0"/>
                 *                   &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S" maxOccurs="6"/>
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
                    "dummy1",
                    "sourceLevel",
                    "remarks",
                    "taxCovSurchargeGroup",
                    "otherRulesGroup",
                    "pickupDropoffLocation",
                    "specialEquipmentDetails"
                })
                public static class RulesPoliciesGroup {

                    @XmlElement(required = true)
                    protected DummySegmentTypeI dummy1;
                    protected SelectionDetailsTypeI sourceLevel;
                    protected FreeTextInformationType136708S remarks;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup> taxCovSurchargeGroup;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup> otherRulesGroup;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation> pickupDropoffLocation;
                    protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails> specialEquipmentDetails;

                    /**
                     * Gets the value of the dummy1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DummySegmentTypeI }
                     *     
                     */
                    public DummySegmentTypeI getDummy1() {
                        return dummy1;
                    }

                    /**
                     * Sets the value of the dummy1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DummySegmentTypeI }
                     *     
                     */
                    public void setDummy1(DummySegmentTypeI value) {
                        this.dummy1 = value;
                    }

                    /**
                     * Gets the value of the sourceLevel property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link SelectionDetailsTypeI }
                     *     
                     */
                    public SelectionDetailsTypeI getSourceLevel() {
                        return sourceLevel;
                    }

                    /**
                     * Sets the value of the sourceLevel property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SelectionDetailsTypeI }
                     *     
                     */
                    public void setSourceLevel(SelectionDetailsTypeI value) {
                        this.sourceLevel = value;
                    }

                    /**
                     * Gets the value of the remarks property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link FreeTextInformationType136708S }
                     *     
                     */
                    public FreeTextInformationType136708S getRemarks() {
                        return remarks;
                    }

                    /**
                     * Sets the value of the remarks property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FreeTextInformationType136708S }
                     *     
                     */
                    public void setRemarks(FreeTextInformationType136708S value) {
                        this.remarks = value;
                    }

                    /**
                     * Gets the value of the taxCovSurchargeGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the taxCovSurchargeGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getTaxCovSurchargeGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup> getTaxCovSurchargeGroup() {
                        if (taxCovSurchargeGroup == null) {
                            taxCovSurchargeGroup = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup>();
                        }
                        return this.taxCovSurchargeGroup;
                    }

                    /**
                     * Gets the value of the otherRulesGroup property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the otherRulesGroup property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getOtherRulesGroup().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup> getOtherRulesGroup() {
                        if (otherRulesGroup == null) {
                            otherRulesGroup = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.OtherRulesGroup>();
                        }
                        return this.otherRulesGroup;
                    }

                    /**
                     * Gets the value of the pickupDropoffLocation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the pickupDropoffLocation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPickupDropoffLocation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation> getPickupDropoffLocation() {
                        if (pickupDropoffLocation == null) {
                            pickupDropoffLocation = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.PickupDropoffLocation>();
                        }
                        return this.pickupDropoffLocation;
                    }

                    /**
                     * Gets the value of the specialEquipmentDetails property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specialEquipmentDetails property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecialEquipmentDetails().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails }
                     * 
                     * 
                     */
                    public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails> getSpecialEquipmentDetails() {
                        if (specialEquipmentDetails == null) {
                            specialEquipmentDetails = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails>();
                        }
                        return this.specialEquipmentDetails;
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
                     *         &lt;element name="otherRules" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleInformationTypeU_136720S"/>
                     *         &lt;element name="dateTimeInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_207595S" maxOccurs="2" minOccurs="0"/>
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
                        "otherRules",
                        "dateTimeInfo"
                    })
                    public static class OtherRulesGroup {

                        @XmlElement(required = true)
                        protected RuleInformationTypeU136720S otherRules;
                        protected List<StructuredPeriodInformationType207595S> dateTimeInfo;

                        /**
                         * Gets the value of the otherRules property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link RuleInformationTypeU136720S }
                         *     
                         */
                        public RuleInformationTypeU136720S getOtherRules() {
                            return otherRules;
                        }

                        /**
                         * Sets the value of the otherRules property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link RuleInformationTypeU136720S }
                         *     
                         */
                        public void setOtherRules(RuleInformationTypeU136720S value) {
                            this.otherRules = value;
                        }

                        /**
                         * Gets the value of the dateTimeInfo property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the dateTimeInfo property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getDateTimeInfo().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link StructuredPeriodInformationType207595S }
                         * 
                         * 
                         */
                        public List<StructuredPeriodInformationType207595S> getDateTimeInfo() {
                            if (dateTimeInfo == null) {
                                dateTimeInfo = new ArrayList<StructuredPeriodInformationType207595S>();
                            }
                            return this.dateTimeInfo;
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
                     *         &lt;element name="locationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PlaceLocationIdentificationTypeU_136722S"/>
                     *         &lt;element name="address" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressTypeU_136721S" minOccurs="0"/>
                     *         &lt;element name="openingHours" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredPeriodInformationType_136724S" maxOccurs="10" minOccurs="0"/>
                     *         &lt;element name="phone" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PhoneAndEmailAddressType_136723S" maxOccurs="2" minOccurs="0"/>
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
                        "locationInfo",
                        "address",
                        "openingHours",
                        "phone"
                    })
                    public static class PickupDropoffLocation {

                        @XmlElement(required = true)
                        protected PlaceLocationIdentificationTypeU136722S locationInfo;
                        protected AddressTypeU136721S address;
                        protected List<StructuredPeriodInformationType136724S> openingHours;
                        protected List<PhoneAndEmailAddressType136723S> phone;

                        /**
                         * Gets the value of the locationInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link PlaceLocationIdentificationTypeU136722S }
                         *     
                         */
                        public PlaceLocationIdentificationTypeU136722S getLocationInfo() {
                            return locationInfo;
                        }

                        /**
                         * Sets the value of the locationInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link PlaceLocationIdentificationTypeU136722S }
                         *     
                         */
                        public void setLocationInfo(PlaceLocationIdentificationTypeU136722S value) {
                            this.locationInfo = value;
                        }

                        /**
                         * Gets the value of the address property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link AddressTypeU136721S }
                         *     
                         */
                        public AddressTypeU136721S getAddress() {
                            return address;
                        }

                        /**
                         * Sets the value of the address property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link AddressTypeU136721S }
                         *     
                         */
                        public void setAddress(AddressTypeU136721S value) {
                            this.address = value;
                        }

                        /**
                         * Gets the value of the openingHours property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the openingHours property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getOpeningHours().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link StructuredPeriodInformationType136724S }
                         * 
                         * 
                         */
                        public List<StructuredPeriodInformationType136724S> getOpeningHours() {
                            if (openingHours == null) {
                                openingHours = new ArrayList<StructuredPeriodInformationType136724S>();
                            }
                            return this.openingHours;
                        }

                        /**
                         * Gets the value of the phone property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the phone property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getPhone().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PhoneAndEmailAddressType136723S }
                         * 
                         * 
                         */
                        public List<PhoneAndEmailAddressType136723S> getPhone() {
                            if (phone == null) {
                                phone = new ArrayList<PhoneAndEmailAddressType136723S>();
                            }
                            return this.phone;
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
                     *         &lt;element name="dummy2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
                     *         &lt;element name="rangePeriod" maxOccurs="5" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
                     *                   &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136715S" minOccurs="0"/>
                     *         &lt;element name="specialEquipmentTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S" maxOccurs="6"/>
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
                        "dummy2",
                        "rangePeriod",
                        "additionalInfo",
                        "specialEquipmentTariff"
                    })
                    public static class SpecialEquipmentDetails {

                        @XmlElement(required = true)
                        protected DummySegmentTypeI dummy2;
                        protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod> rangePeriod;
                        protected FreeTextInformationType136715S additionalInfo;
                        @XmlElement(required = true)
                        protected List<TariffInformationTypeI136714S> specialEquipmentTariff;

                        /**
                         * Gets the value of the dummy2 property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DummySegmentTypeI }
                         *     
                         */
                        public DummySegmentTypeI getDummy2() {
                            return dummy2;
                        }

                        /**
                         * Sets the value of the dummy2 property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DummySegmentTypeI }
                         *     
                         */
                        public void setDummy2(DummySegmentTypeI value) {
                            this.dummy2 = value;
                        }

                        /**
                         * Gets the value of the rangePeriod property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the rangePeriod property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRangePeriod().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod }
                         * 
                         * 
                         */
                        public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod> getRangePeriod() {
                            if (rangePeriod == null) {
                                rangePeriod = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.SpecialEquipmentDetails.RangePeriod>();
                            }
                            return this.rangePeriod;
                        }

                        /**
                         * Gets the value of the additionalInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FreeTextInformationType136715S }
                         *     
                         */
                        public FreeTextInformationType136715S getAdditionalInfo() {
                            return additionalInfo;
                        }

                        /**
                         * Sets the value of the additionalInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FreeTextInformationType136715S }
                         *     
                         */
                        public void setAdditionalInfo(FreeTextInformationType136715S value) {
                            this.additionalInfo = value;
                        }

                        /**
                         * Gets the value of the specialEquipmentTariff property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the specialEquipmentTariff property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSpecialEquipmentTariff().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TariffInformationTypeI136714S }
                         * 
                         * 
                         */
                        public List<TariffInformationTypeI136714S> getSpecialEquipmentTariff() {
                            if (specialEquipmentTariff == null) {
                                specialEquipmentTariff = new ArrayList<TariffInformationTypeI136714S>();
                            }
                            return this.specialEquipmentTariff;
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
                         *         &lt;element name="agePeriod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
                         *         &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
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
                            "agePeriod",
                            "maximumUnitQualifier"
                        })
                        public static class RangePeriod {

                            @XmlElement(required = true)
                            protected RangeDetailsTypeI agePeriod;
                            protected MeasurementsBatchTypeU maximumUnitQualifier;

                            /**
                             * Gets the value of the agePeriod property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link RangeDetailsTypeI }
                             *     
                             */
                            public RangeDetailsTypeI getAgePeriod() {
                                return agePeriod;
                            }

                            /**
                             * Sets the value of the agePeriod property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link RangeDetailsTypeI }
                             *     
                             */
                            public void setAgePeriod(RangeDetailsTypeI value) {
                                this.agePeriod = value;
                            }

                            /**
                             * Gets the value of the maximumUnitQualifier property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link MeasurementsBatchTypeU }
                             *     
                             */
                            public MeasurementsBatchTypeU getMaximumUnitQualifier() {
                                return maximumUnitQualifier;
                            }

                            /**
                             * Sets the value of the maximumUnitQualifier property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link MeasurementsBatchTypeU }
                             *     
                             */
                            public void setMaximumUnitQualifier(MeasurementsBatchTypeU value) {
                                this.maximumUnitQualifier = value;
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
                     *         &lt;element name="taxSurchargeCoverageInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136714S"/>
                     *         &lt;element name="additionalInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_136708S" minOccurs="0"/>
                     *         &lt;element name="surchargePeriods" maxOccurs="10" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
                     *                   &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136719S"/>
                     *                   &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
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
                        "taxSurchargeCoverageInfo",
                        "additionalInfo",
                        "surchargePeriods"
                    })
                    public static class TaxCovSurchargeGroup {

                        @XmlElement(required = true)
                        protected TariffInformationTypeI136714S taxSurchargeCoverageInfo;
                        protected FreeTextInformationType136708S additionalInfo;
                        protected List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods> surchargePeriods;

                        /**
                         * Gets the value of the taxSurchargeCoverageInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link TariffInformationTypeI136714S }
                         *     
                         */
                        public TariffInformationTypeI136714S getTaxSurchargeCoverageInfo() {
                            return taxSurchargeCoverageInfo;
                        }

                        /**
                         * Sets the value of the taxSurchargeCoverageInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TariffInformationTypeI136714S }
                         *     
                         */
                        public void setTaxSurchargeCoverageInfo(TariffInformationTypeI136714S value) {
                            this.taxSurchargeCoverageInfo = value;
                        }

                        /**
                         * Gets the value of the additionalInfo property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FreeTextInformationType136708S }
                         *     
                         */
                        public FreeTextInformationType136708S getAdditionalInfo() {
                            return additionalInfo;
                        }

                        /**
                         * Sets the value of the additionalInfo property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FreeTextInformationType136708S }
                         *     
                         */
                        public void setAdditionalInfo(FreeTextInformationType136708S value) {
                            this.additionalInfo = value;
                        }

                        /**
                         * Gets the value of the surchargePeriods property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the surchargePeriods property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getSurchargePeriods().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods }
                         * 
                         * 
                         */
                        public List<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods> getSurchargePeriods() {
                            if (surchargePeriods == null) {
                                surchargePeriods = new ArrayList<PNRReply.OriginDestinationDetails.ItineraryInfo.TypicalCarData.RulesPoliciesGroup.TaxCovSurchargeGroup.SurchargePeriods>();
                            }
                            return this.surchargePeriods;
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
                         *         &lt;element name="period" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RangeDetailsTypeI"/>
                         *         &lt;element name="surchargePeriodTariff" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeI_136719S"/>
                         *         &lt;element name="maximumUnitQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MeasurementsBatchTypeU" minOccurs="0"/>
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
                            "period",
                            "surchargePeriodTariff",
                            "maximumUnitQualifier"
                        })
                        public static class SurchargePeriods {

                            @XmlElement(required = true)
                            protected RangeDetailsTypeI period;
                            @XmlElement(required = true)
                            protected TariffInformationTypeI136719S surchargePeriodTariff;
                            protected MeasurementsBatchTypeU maximumUnitQualifier;

                            /**
                             * Gets the value of the period property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link RangeDetailsTypeI }
                             *     
                             */
                            public RangeDetailsTypeI getPeriod() {
                                return period;
                            }

                            /**
                             * Sets the value of the period property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link RangeDetailsTypeI }
                             *     
                             */
                            public void setPeriod(RangeDetailsTypeI value) {
                                this.period = value;
                            }

                            /**
                             * Gets the value of the surchargePeriodTariff property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link TariffInformationTypeI136719S }
                             *     
                             */
                            public TariffInformationTypeI136719S getSurchargePeriodTariff() {
                                return surchargePeriodTariff;
                            }

                            /**
                             * Sets the value of the surchargePeriodTariff property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link TariffInformationTypeI136719S }
                             *     
                             */
                            public void setSurchargePeriodTariff(TariffInformationTypeI136719S value) {
                                this.surchargePeriodTariff = value;
                            }

                            /**
                             * Gets the value of the maximumUnitQualifier property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link MeasurementsBatchTypeU }
                             *     
                             */
                            public MeasurementsBatchTypeU getMaximumUnitQualifier() {
                                return maximumUnitQualifier;
                            }

                            /**
                             * Sets the value of the maximumUnitQualifier property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link MeasurementsBatchTypeU }
                             *     
                             */
                            public void setMaximumUnitQualifier(MeasurementsBatchTypeU value) {
                                this.maximumUnitQualifier = value;
                            }

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
             *         &lt;element name="yieldData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ODKeyPerformanceDataType"/>
             *         &lt;element name="yieldDataGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ONDType" minOccurs="0"/>
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
                "yieldData",
                "yieldDataGroup"
            })
            public static class YieldGroup {

                @XmlElement(required = true)
                protected ODKeyPerformanceDataType yieldData;
                protected ONDType yieldDataGroup;

                /**
                 * Gets the value of the yieldData property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ODKeyPerformanceDataType }
                 *     
                 */
                public ODKeyPerformanceDataType getYieldData() {
                    return yieldData;
                }

                /**
                 * Sets the value of the yieldData property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ODKeyPerformanceDataType }
                 *     
                 */
                public void setYieldData(ODKeyPerformanceDataType value) {
                    this.yieldData = value;
                }

                /**
                 * Gets the value of the yieldDataGroup property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ONDType }
                 *     
                 */
                public ONDType getYieldDataGroup() {
                    return yieldDataGroup;
                }

                /**
                 * Sets the value of the yieldDataGroup property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ONDType }
                 *     
                 */
                public void setYieldDataGroup(ONDType value) {
                    this.yieldDataGroup = value;
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
     *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReservationControlInformationType"/>
     *         &lt;element name="referenceForRecordLocator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
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
        "reservationInfo",
        "referenceForRecordLocator"
    })
    public static class PnrHeader {

        @XmlElement(required = true)
        protected ReservationControlInformationType reservationInfo;
        protected ReferenceInfoType referenceForRecordLocator;

        /**
         * Gets the value of the reservationInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationType }
         *     
         */
        public ReservationControlInformationType getReservationInfo() {
            return reservationInfo;
        }

        /**
         * Sets the value of the reservationInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationType }
         *     
         */
        public void setReservationInfo(ReservationControlInformationType value) {
            this.reservationInfo = value;
        }

        /**
         * Gets the value of the referenceForRecordLocator property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getReferenceForRecordLocator() {
            return referenceForRecordLocator;
        }

        /**
         * Sets the value of the referenceForRecordLocator property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setReferenceForRecordLocator(ReferenceInfoType value) {
            this.referenceForRecordLocator = value;
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
     *         &lt;element name="pricingRecordData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingTicketingDetailsType"/>
     *         &lt;element name="productPricingQuotationRecord" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PPQRdataType" maxOccurs="99" minOccurs="0"/>
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
        "pricingRecordData",
        "productPricingQuotationRecord"
    })
    public static class PricingRecordGroup {

        @XmlElement(required = true)
        protected PricingTicketingDetailsType pricingRecordData;
        protected List<PPQRdataType> productPricingQuotationRecord;

        /**
         * Gets the value of the pricingRecordData property.
         * 
         * @return
         *     possible object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public PricingTicketingDetailsType getPricingRecordData() {
            return pricingRecordData;
        }

        /**
         * Sets the value of the pricingRecordData property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingTicketingDetailsType }
         *     
         */
        public void setPricingRecordData(PricingTicketingDetailsType value) {
            this.pricingRecordData = value;
        }

        /**
         * Gets the value of the productPricingQuotationRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productPricingQuotationRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductPricingQuotationRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PPQRdataType }
         * 
         * 
         */
        public List<PPQRdataType> getProductPricingQuotationRecord() {
            if (productPricingQuotationRecord == null) {
                productPricingQuotationRecord = new ArrayList<PPQRdataType>();
            }
            return this.productPricingQuotationRecord;
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
     *         &lt;element name="enveloppeNumberData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU"/>
     *         &lt;element name="lastTransmittedEnvelopeNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PnrHistoryDataType_27157S" minOccurs="0"/>
     *         &lt;element name="purgeDateData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_27086S" minOccurs="0"/>
     *         &lt;element name="generalPNRInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusTypeI_32775S" minOccurs="0"/>
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
        "enveloppeNumberData",
        "lastTransmittedEnvelopeNumber",
        "purgeDateData",
        "generalPNRInformation"
    })
    public static class TechnicalData {

        @XmlElement(required = true)
        protected SequenceDetailsTypeU enveloppeNumberData;
        protected PnrHistoryDataType27157S lastTransmittedEnvelopeNumber;
        protected StructuredDateTimeInformationType27086S purgeDateData;
        protected StatusTypeI32775S generalPNRInformation;

        /**
         * Gets the value of the enveloppeNumberData property.
         * 
         * @return
         *     possible object is
         *     {@link SequenceDetailsTypeU }
         *     
         */
        public SequenceDetailsTypeU getEnveloppeNumberData() {
            return enveloppeNumberData;
        }

        /**
         * Sets the value of the enveloppeNumberData property.
         * 
         * @param value
         *     allowed object is
         *     {@link SequenceDetailsTypeU }
         *     
         */
        public void setEnveloppeNumberData(SequenceDetailsTypeU value) {
            this.enveloppeNumberData = value;
        }

        /**
         * Gets the value of the lastTransmittedEnvelopeNumber property.
         * 
         * @return
         *     possible object is
         *     {@link PnrHistoryDataType27157S }
         *     
         */
        public PnrHistoryDataType27157S getLastTransmittedEnvelopeNumber() {
            return lastTransmittedEnvelopeNumber;
        }

        /**
         * Sets the value of the lastTransmittedEnvelopeNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link PnrHistoryDataType27157S }
         *     
         */
        public void setLastTransmittedEnvelopeNumber(PnrHistoryDataType27157S value) {
            this.lastTransmittedEnvelopeNumber = value;
        }

        /**
         * Gets the value of the purgeDateData property.
         * 
         * @return
         *     possible object is
         *     {@link StructuredDateTimeInformationType27086S }
         *     
         */
        public StructuredDateTimeInformationType27086S getPurgeDateData() {
            return purgeDateData;
        }

        /**
         * Sets the value of the purgeDateData property.
         * 
         * @param value
         *     allowed object is
         *     {@link StructuredDateTimeInformationType27086S }
         *     
         */
        public void setPurgeDateData(StructuredDateTimeInformationType27086S value) {
            this.purgeDateData = value;
        }

        /**
         * Gets the value of the generalPNRInformation property.
         * 
         * @return
         *     possible object is
         *     {@link StatusTypeI32775S }
         *     
         */
        public StatusTypeI32775S getGeneralPNRInformation() {
            return generalPNRInformation;
        }

        /**
         * Sets the value of the generalPNRInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusTypeI32775S }
         *     
         */
        public void setGeneralPNRInformation(StatusTypeI32775S value) {
            this.generalPNRInformation = value;
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
     *         &lt;element name="elementManagementPassenger" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType"/>
     *         &lt;element name="passengerData" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationType_185946S"/>
     *                   &lt;element name="groupCounters" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType_76106S" minOccurs="0"/>
     *                   &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType_32722S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="enhancedPassengerData" maxOccurs="2" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}EnhancedTravellerInformationType"/>
     *                   &lt;element name="groupCountersInEnhancedPaxData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType_76106S" minOccurs="0"/>
     *                   &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType_32722S" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="nameError" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ErrorGroupType_223552G" minOccurs="0"/>
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
        "elementManagementPassenger",
        "passengerData",
        "enhancedPassengerData",
        "nameError"
    })
    public static class TravellerInfo {

        @XmlElement(required = true)
        protected ElementManagementSegmentType elementManagementPassenger;
        protected List<PNRReply.TravellerInfo.PassengerData> passengerData;
        protected List<PNRReply.TravellerInfo.EnhancedPassengerData> enhancedPassengerData;
        protected ErrorGroupType223552G nameError;

        /**
         * Gets the value of the elementManagementPassenger property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public ElementManagementSegmentType getElementManagementPassenger() {
            return elementManagementPassenger;
        }

        /**
         * Sets the value of the elementManagementPassenger property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegmentType }
         *     
         */
        public void setElementManagementPassenger(ElementManagementSegmentType value) {
            this.elementManagementPassenger = value;
        }

        /**
         * Gets the value of the passengerData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.TravellerInfo.PassengerData }
         * 
         * 
         */
        public List<PNRReply.TravellerInfo.PassengerData> getPassengerData() {
            if (passengerData == null) {
                passengerData = new ArrayList<PNRReply.TravellerInfo.PassengerData>();
            }
            return this.passengerData;
        }

        /**
         * Gets the value of the enhancedPassengerData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enhancedPassengerData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnhancedPassengerData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRReply.TravellerInfo.EnhancedPassengerData }
         * 
         * 
         */
        public List<PNRReply.TravellerInfo.EnhancedPassengerData> getEnhancedPassengerData() {
            if (enhancedPassengerData == null) {
                enhancedPassengerData = new ArrayList<PNRReply.TravellerInfo.EnhancedPassengerData>();
            }
            return this.enhancedPassengerData;
        }

        /**
         * Gets the value of the nameError property.
         * 
         * @return
         *     possible object is
         *     {@link ErrorGroupType223552G }
         *     
         */
        public ErrorGroupType223552G getNameError() {
            return nameError;
        }

        /**
         * Sets the value of the nameError property.
         * 
         * @param value
         *     allowed object is
         *     {@link ErrorGroupType223552G }
         *     
         */
        public void setNameError(ErrorGroupType223552G value) {
            this.nameError = value;
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
         *         &lt;element name="enhancedTravellerInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}EnhancedTravellerInformationType"/>
         *         &lt;element name="groupCountersInEnhancedPaxData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType_76106S" minOccurs="0"/>
         *         &lt;element name="dateOfBirthInEnhancedPaxData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType_32722S" minOccurs="0"/>
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
            "enhancedTravellerInformation",
            "groupCountersInEnhancedPaxData",
            "dateOfBirthInEnhancedPaxData"
        })
        public static class EnhancedPassengerData {

            @XmlElement(required = true)
            protected EnhancedTravellerInformationType enhancedTravellerInformation;
            protected NumberOfUnitsType76106S groupCountersInEnhancedPaxData;
            protected DateAndTimeInformationType32722S dateOfBirthInEnhancedPaxData;

            /**
             * Gets the value of the enhancedTravellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link EnhancedTravellerInformationType }
             *     
             */
            public EnhancedTravellerInformationType getEnhancedTravellerInformation() {
                return enhancedTravellerInformation;
            }

            /**
             * Sets the value of the enhancedTravellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link EnhancedTravellerInformationType }
             *     
             */
            public void setEnhancedTravellerInformation(EnhancedTravellerInformationType value) {
                this.enhancedTravellerInformation = value;
            }

            /**
             * Gets the value of the groupCountersInEnhancedPaxData property.
             * 
             * @return
             *     possible object is
             *     {@link NumberOfUnitsType76106S }
             *     
             */
            public NumberOfUnitsType76106S getGroupCountersInEnhancedPaxData() {
                return groupCountersInEnhancedPaxData;
            }

            /**
             * Sets the value of the groupCountersInEnhancedPaxData property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumberOfUnitsType76106S }
             *     
             */
            public void setGroupCountersInEnhancedPaxData(NumberOfUnitsType76106S value) {
                this.groupCountersInEnhancedPaxData = value;
            }

            /**
             * Gets the value of the dateOfBirthInEnhancedPaxData property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationType32722S }
             *     
             */
            public DateAndTimeInformationType32722S getDateOfBirthInEnhancedPaxData() {
                return dateOfBirthInEnhancedPaxData;
            }

            /**
             * Sets the value of the dateOfBirthInEnhancedPaxData property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationType32722S }
             *     
             */
            public void setDateOfBirthInEnhancedPaxData(DateAndTimeInformationType32722S value) {
                this.dateOfBirthInEnhancedPaxData = value;
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
         *         &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravellerInformationType_185946S"/>
         *         &lt;element name="groupCounters" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType_76106S" minOccurs="0"/>
         *         &lt;element name="dateOfBirth" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateAndTimeInformationType_32722S" minOccurs="0"/>
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
            "travellerInformation",
            "groupCounters",
            "dateOfBirth"
        })
        public static class PassengerData {

            @XmlElement(required = true)
            protected TravellerInformationType185946S travellerInformation;
            protected NumberOfUnitsType76106S groupCounters;
            protected DateAndTimeInformationType32722S dateOfBirth;

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformationType185946S }
             *     
             */
            public TravellerInformationType185946S getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformationType185946S }
             *     
             */
            public void setTravellerInformation(TravellerInformationType185946S value) {
                this.travellerInformation = value;
            }

            /**
             * Gets the value of the groupCounters property.
             * 
             * @return
             *     possible object is
             *     {@link NumberOfUnitsType76106S }
             *     
             */
            public NumberOfUnitsType76106S getGroupCounters() {
                return groupCounters;
            }

            /**
             * Sets the value of the groupCounters property.
             * 
             * @param value
             *     allowed object is
             *     {@link NumberOfUnitsType76106S }
             *     
             */
            public void setGroupCounters(NumberOfUnitsType76106S value) {
                this.groupCounters = value;
            }

            /**
             * Gets the value of the dateOfBirth property.
             * 
             * @return
             *     possible object is
             *     {@link DateAndTimeInformationType32722S }
             *     
             */
            public DateAndTimeInformationType32722S getDateOfBirth() {
                return dateOfBirth;
            }

            /**
             * Sets the value of the dateOfBirth property.
             * 
             * @param value
             *     allowed object is
             *     {@link DateAndTimeInformationType32722S }
             *     
             */
            public void setDateOfBirth(DateAndTimeInformationType32722S value) {
                this.dateOfBirth = value;
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
     *         &lt;element name="tstGeneralInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TstGeneralInformationType"/>
     *         &lt;element name="tstFreetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}LongFreeTextType" maxOccurs="2" minOccurs="0"/>
     *         &lt;element name="fareBasisInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareBasisCodesLineType" minOccurs="0"/>
     *         &lt;element name="fareData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareDataType" minOccurs="0"/>
     *         &lt;element name="segmentAssociation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SelectionDetailsTypeI_201122S" minOccurs="0"/>
     *         &lt;element name="referenceForTstData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType" minOccurs="0"/>
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
        "tstGeneralInformation",
        "tstFreetext",
        "fareBasisInfo",
        "fareData",
        "segmentAssociation",
        "referenceForTstData"
    })
    public static class TstData {

        @XmlElement(required = true)
        protected TstGeneralInformationType tstGeneralInformation;
        protected List<LongFreeTextType> tstFreetext;
        protected FareBasisCodesLineType fareBasisInfo;
        protected FareDataType fareData;
        protected SelectionDetailsTypeI201122S segmentAssociation;
        protected ReferenceInfoType referenceForTstData;

        /**
         * Gets the value of the tstGeneralInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TstGeneralInformationType }
         *     
         */
        public TstGeneralInformationType getTstGeneralInformation() {
            return tstGeneralInformation;
        }

        /**
         * Sets the value of the tstGeneralInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TstGeneralInformationType }
         *     
         */
        public void setTstGeneralInformation(TstGeneralInformationType value) {
            this.tstGeneralInformation = value;
        }

        /**
         * Gets the value of the tstFreetext property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tstFreetext property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTstFreetext().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LongFreeTextType }
         * 
         * 
         */
        public List<LongFreeTextType> getTstFreetext() {
            if (tstFreetext == null) {
                tstFreetext = new ArrayList<LongFreeTextType>();
            }
            return this.tstFreetext;
        }

        /**
         * Gets the value of the fareBasisInfo property.
         * 
         * @return
         *     possible object is
         *     {@link FareBasisCodesLineType }
         *     
         */
        public FareBasisCodesLineType getFareBasisInfo() {
            return fareBasisInfo;
        }

        /**
         * Sets the value of the fareBasisInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareBasisCodesLineType }
         *     
         */
        public void setFareBasisInfo(FareBasisCodesLineType value) {
            this.fareBasisInfo = value;
        }

        /**
         * Gets the value of the fareData property.
         * 
         * @return
         *     possible object is
         *     {@link FareDataType }
         *     
         */
        public FareDataType getFareData() {
            return fareData;
        }

        /**
         * Sets the value of the fareData property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareDataType }
         *     
         */
        public void setFareData(FareDataType value) {
            this.fareData = value;
        }

        /**
         * Gets the value of the segmentAssociation property.
         * 
         * @return
         *     possible object is
         *     {@link SelectionDetailsTypeI201122S }
         *     
         */
        public SelectionDetailsTypeI201122S getSegmentAssociation() {
            return segmentAssociation;
        }

        /**
         * Sets the value of the segmentAssociation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SelectionDetailsTypeI201122S }
         *     
         */
        public void setSegmentAssociation(SelectionDetailsTypeI201122S value) {
            this.segmentAssociation = value;
        }

        /**
         * Gets the value of the referenceForTstData property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType }
         *     
         */
        public ReferenceInfoType getReferenceForTstData() {
            return referenceForTstData;
        }

        /**
         * Sets the value of the referenceForTstData property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType }
         *     
         */
        public void setReferenceForTstData(ReferenceInfoType value) {
            this.referenceForTstData = value;
        }

    }

}
