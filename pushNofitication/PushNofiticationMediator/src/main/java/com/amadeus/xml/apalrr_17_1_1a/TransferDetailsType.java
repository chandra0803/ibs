
package com.amadeus.xml.apalrr_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransferDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transferType" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_196552S"/>
 *         &lt;element name="transferReason" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_176881S" minOccurs="0"/>
 *         &lt;element name="fromUCI" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType" minOccurs="0"/>
 *         &lt;element name="extendedTransferStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_197479S" minOccurs="0"/>
 *         &lt;element name="transferStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}ResponseAnalysisDetailsType"/>
 *         &lt;element name="chargeableStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_158920S" minOccurs="0"/>
 *         &lt;element name="transferDetails" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="flightQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_176881S"/>
 *                   &lt;element name="flightProductDetails" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="flightDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FlightDetailsResponseType_176882S"/>
 *                             &lt;element name="status" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="5" minOccurs="0"/>
 *                             &lt;element name="cabinInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType_144371S" minOccurs="0"/>
 *                             &lt;element name="seatInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_124026S" minOccurs="0"/>
 *                             &lt;element name="flightTimeInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_176884S" maxOccurs="3" minOccurs="0"/>
 *                             &lt;element name="boardingGate" type="{http://xml.amadeus.com/APALRR_17_1_1A}TerminalLocationType_176886S" minOccurs="0"/>
 *                             &lt;element name="productReference" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType_193108S" minOccurs="0"/>
 *                             &lt;element name="operatingDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CommercialAgreementsType" minOccurs="0"/>
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
@XmlType(name = "TransferDetailsType", propOrder = {
    "transferType",
    "transferReason",
    "fromUCI",
    "extendedTransferStatus",
    "transferStatus",
    "chargeableStatus",
    "transferDetails"
})
public class TransferDetailsType {

    @XmlElement(required = true)
    protected ReferenceInfoType196552S transferType;
    protected CodedAttributeType176881S transferReason;
    protected ItemReferencesAndVersionsType fromUCI;
    protected StatusType197479S extendedTransferStatus;
    @XmlElement(required = true)
    protected ResponseAnalysisDetailsType transferStatus;
    protected StatusType158920S chargeableStatus;
    protected List<TransferDetailsType.TransferDetails> transferDetails;

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType196552S }
     *     
     */
    public ReferenceInfoType196552S getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType196552S }
     *     
     */
    public void setTransferType(ReferenceInfoType196552S value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the transferReason property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType176881S }
     *     
     */
    public CodedAttributeType176881S getTransferReason() {
        return transferReason;
    }

    /**
     * Sets the value of the transferReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType176881S }
     *     
     */
    public void setTransferReason(CodedAttributeType176881S value) {
        this.transferReason = value;
    }

    /**
     * Gets the value of the fromUCI property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public ItemReferencesAndVersionsType getFromUCI() {
        return fromUCI;
    }

    /**
     * Sets the value of the fromUCI property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType }
     *     
     */
    public void setFromUCI(ItemReferencesAndVersionsType value) {
        this.fromUCI = value;
    }

    /**
     * Gets the value of the extendedTransferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType197479S }
     *     
     */
    public StatusType197479S getExtendedTransferStatus() {
        return extendedTransferStatus;
    }

    /**
     * Sets the value of the extendedTransferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType197479S }
     *     
     */
    public void setExtendedTransferStatus(StatusType197479S value) {
        this.extendedTransferStatus = value;
    }

    /**
     * Gets the value of the transferStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseAnalysisDetailsType }
     *     
     */
    public ResponseAnalysisDetailsType getTransferStatus() {
        return transferStatus;
    }

    /**
     * Sets the value of the transferStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseAnalysisDetailsType }
     *     
     */
    public void setTransferStatus(ResponseAnalysisDetailsType value) {
        this.transferStatus = value;
    }

    /**
     * Gets the value of the chargeableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType158920S }
     *     
     */
    public StatusType158920S getChargeableStatus() {
        return chargeableStatus;
    }

    /**
     * Sets the value of the chargeableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType158920S }
     *     
     */
    public void setChargeableStatus(StatusType158920S value) {
        this.chargeableStatus = value;
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
     * {@link TransferDetailsType.TransferDetails }
     * 
     * 
     */
    public List<TransferDetailsType.TransferDetails> getTransferDetails() {
        if (transferDetails == null) {
            transferDetails = new ArrayList<TransferDetailsType.TransferDetails>();
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
     *         &lt;element name="flightQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_176881S"/>
     *         &lt;element name="flightProductDetails" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="flightDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FlightDetailsResponseType_176882S"/>
     *                   &lt;element name="status" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="5" minOccurs="0"/>
     *                   &lt;element name="cabinInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType_144371S" minOccurs="0"/>
     *                   &lt;element name="seatInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_124026S" minOccurs="0"/>
     *                   &lt;element name="flightTimeInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_176884S" maxOccurs="3" minOccurs="0"/>
     *                   &lt;element name="boardingGate" type="{http://xml.amadeus.com/APALRR_17_1_1A}TerminalLocationType_176886S" minOccurs="0"/>
     *                   &lt;element name="productReference" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType_193108S" minOccurs="0"/>
     *                   &lt;element name="operatingDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CommercialAgreementsType" minOccurs="0"/>
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
        "flightQualifier",
        "flightProductDetails"
    })
    public static class TransferDetails {

        @XmlElement(required = true)
        protected CodedAttributeType176881S flightQualifier;
        protected List<TransferDetailsType.TransferDetails.FlightProductDetails> flightProductDetails;

        /**
         * Gets the value of the flightQualifier property.
         * 
         * @return
         *     possible object is
         *     {@link CodedAttributeType176881S }
         *     
         */
        public CodedAttributeType176881S getFlightQualifier() {
            return flightQualifier;
        }

        /**
         * Sets the value of the flightQualifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedAttributeType176881S }
         *     
         */
        public void setFlightQualifier(CodedAttributeType176881S value) {
            this.flightQualifier = value;
        }

        /**
         * Gets the value of the flightProductDetails property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightProductDetails property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightProductDetails().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TransferDetailsType.TransferDetails.FlightProductDetails }
         * 
         * 
         */
        public List<TransferDetailsType.TransferDetails.FlightProductDetails> getFlightProductDetails() {
            if (flightProductDetails == null) {
                flightProductDetails = new ArrayList<TransferDetailsType.TransferDetails.FlightProductDetails>();
            }
            return this.flightProductDetails;
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
         *         &lt;element name="flightDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FlightDetailsResponseType_176882S"/>
         *         &lt;element name="status" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" maxOccurs="5" minOccurs="0"/>
         *         &lt;element name="cabinInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}CabinDetailsType_144371S" minOccurs="0"/>
         *         &lt;element name="seatInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}SpecialRequirementsDetailsType_124026S" minOccurs="0"/>
         *         &lt;element name="flightTimeInfo" type="{http://xml.amadeus.com/APALRR_17_1_1A}StructuredDateTimeInformationType_176884S" maxOccurs="3" minOccurs="0"/>
         *         &lt;element name="boardingGate" type="{http://xml.amadeus.com/APALRR_17_1_1A}TerminalLocationType_176886S" minOccurs="0"/>
         *         &lt;element name="productReference" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType_193108S" minOccurs="0"/>
         *         &lt;element name="operatingDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CommercialAgreementsType" minOccurs="0"/>
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
            "flightDetails",
            "status",
            "cabinInfo",
            "seatInfo",
            "flightTimeInfo",
            "boardingGate",
            "productReference",
            "operatingDetails"
        })
        public static class FlightProductDetails {

            @XmlElement(required = true)
            protected FlightDetailsResponseType176882S flightDetails;
            protected List<StatusType129946S> status;
            protected CabinDetailsType144371S cabinInfo;
            protected SpecialRequirementsDetailsType124026S seatInfo;
            protected List<StructuredDateTimeInformationType176884S> flightTimeInfo;
            protected TerminalLocationType176886S boardingGate;
            protected ItemReferencesAndVersionsType193108S productReference;
            protected CommercialAgreementsType operatingDetails;

            /**
             * Gets the value of the flightDetails property.
             * 
             * @return
             *     possible object is
             *     {@link FlightDetailsResponseType176882S }
             *     
             */
            public FlightDetailsResponseType176882S getFlightDetails() {
                return flightDetails;
            }

            /**
             * Sets the value of the flightDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightDetailsResponseType176882S }
             *     
             */
            public void setFlightDetails(FlightDetailsResponseType176882S value) {
                this.flightDetails = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the status property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StatusType129946S }
             * 
             * 
             */
            public List<StatusType129946S> getStatus() {
                if (status == null) {
                    status = new ArrayList<StatusType129946S>();
                }
                return this.status;
            }

            /**
             * Gets the value of the cabinInfo property.
             * 
             * @return
             *     possible object is
             *     {@link CabinDetailsType144371S }
             *     
             */
            public CabinDetailsType144371S getCabinInfo() {
                return cabinInfo;
            }

            /**
             * Sets the value of the cabinInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link CabinDetailsType144371S }
             *     
             */
            public void setCabinInfo(CabinDetailsType144371S value) {
                this.cabinInfo = value;
            }

            /**
             * Gets the value of the seatInfo property.
             * 
             * @return
             *     possible object is
             *     {@link SpecialRequirementsDetailsType124026S }
             *     
             */
            public SpecialRequirementsDetailsType124026S getSeatInfo() {
                return seatInfo;
            }

            /**
             * Sets the value of the seatInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link SpecialRequirementsDetailsType124026S }
             *     
             */
            public void setSeatInfo(SpecialRequirementsDetailsType124026S value) {
                this.seatInfo = value;
            }

            /**
             * Gets the value of the flightTimeInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightTimeInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightTimeInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link StructuredDateTimeInformationType176884S }
             * 
             * 
             */
            public List<StructuredDateTimeInformationType176884S> getFlightTimeInfo() {
                if (flightTimeInfo == null) {
                    flightTimeInfo = new ArrayList<StructuredDateTimeInformationType176884S>();
                }
                return this.flightTimeInfo;
            }

            /**
             * Gets the value of the boardingGate property.
             * 
             * @return
             *     possible object is
             *     {@link TerminalLocationType176886S }
             *     
             */
            public TerminalLocationType176886S getBoardingGate() {
                return boardingGate;
            }

            /**
             * Sets the value of the boardingGate property.
             * 
             * @param value
             *     allowed object is
             *     {@link TerminalLocationType176886S }
             *     
             */
            public void setBoardingGate(TerminalLocationType176886S value) {
                this.boardingGate = value;
            }

            /**
             * Gets the value of the productReference property.
             * 
             * @return
             *     possible object is
             *     {@link ItemReferencesAndVersionsType193108S }
             *     
             */
            public ItemReferencesAndVersionsType193108S getProductReference() {
                return productReference;
            }

            /**
             * Sets the value of the productReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link ItemReferencesAndVersionsType193108S }
             *     
             */
            public void setProductReference(ItemReferencesAndVersionsType193108S value) {
                this.productReference = value;
            }

            /**
             * Gets the value of the operatingDetails property.
             * 
             * @return
             *     possible object is
             *     {@link CommercialAgreementsType }
             *     
             */
            public CommercialAgreementsType getOperatingDetails() {
                return operatingDetails;
            }

            /**
             * Sets the value of the operatingDetails property.
             * 
             * @param value
             *     allowed object is
             *     {@link CommercialAgreementsType }
             *     
             */
            public void setOperatingDetails(CommercialAgreementsType value) {
                this.operatingDetails = value;
            }

        }

    }

}
