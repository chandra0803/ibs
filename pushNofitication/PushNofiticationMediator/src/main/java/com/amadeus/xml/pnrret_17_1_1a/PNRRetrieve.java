
package com.amadeus.xml.pnrret_17_1_1a;

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
 *         &lt;element name="settings" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="options" type="{http://xml.amadeus.com/PNRRET_17_1_1A}OptionalPNRActionsType"/>
 *                   &lt;element name="printer" type="{http://xml.amadeus.com/PNRRET_17_1_1A}PrinterIdentificationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="retrievalFacts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="retrieve" type="{http://xml.amadeus.com/PNRRET_17_1_1A}RetrievePNRType"/>
 *                   &lt;element name="reservationOrProfileIdentifier" type="{http://xml.amadeus.com/PNRRET_17_1_1A}ReservationControlInformationType" minOccurs="0"/>
 *                   &lt;element name="personalFacts" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TravellerInformationType"/>
 *                             &lt;element name="productInformation" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TravelProductInformationType" minOccurs="0"/>
 *                             &lt;element name="ticket" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TicketNumberType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="frequentFlyer" type="{http://xml.amadeus.com/PNRRET_17_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
 *                   &lt;element name="accounting" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AccountingInformationElementType" minOccurs="0"/>
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
    "settings",
    "retrievalFacts"
})
@XmlRootElement(name = "PNR_Retrieve")
public class PNRRetrieve {

    protected PNRRetrieve.Settings settings;
    @XmlElement(required = true)
    protected PNRRetrieve.RetrievalFacts retrievalFacts;

    /**
     * Gets the value of the settings property.
     * 
     * @return
     *     possible object is
     *     {@link PNRRetrieve.Settings }
     *     
     */
    public PNRRetrieve.Settings getSettings() {
        return settings;
    }

    /**
     * Sets the value of the settings property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRRetrieve.Settings }
     *     
     */
    public void setSettings(PNRRetrieve.Settings value) {
        this.settings = value;
    }

    /**
     * Gets the value of the retrievalFacts property.
     * 
     * @return
     *     possible object is
     *     {@link PNRRetrieve.RetrievalFacts }
     *     
     */
    public PNRRetrieve.RetrievalFacts getRetrievalFacts() {
        return retrievalFacts;
    }

    /**
     * Sets the value of the retrievalFacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRRetrieve.RetrievalFacts }
     *     
     */
    public void setRetrievalFacts(PNRRetrieve.RetrievalFacts value) {
        this.retrievalFacts = value;
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
     *         &lt;element name="retrieve" type="{http://xml.amadeus.com/PNRRET_17_1_1A}RetrievePNRType"/>
     *         &lt;element name="reservationOrProfileIdentifier" type="{http://xml.amadeus.com/PNRRET_17_1_1A}ReservationControlInformationType" minOccurs="0"/>
     *         &lt;element name="personalFacts" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TravellerInformationType"/>
     *                   &lt;element name="productInformation" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TravelProductInformationType" minOccurs="0"/>
     *                   &lt;element name="ticket" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TicketNumberType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="frequentFlyer" type="{http://xml.amadeus.com/PNRRET_17_1_1A}FrequentTravellerIdentificationCodeType" minOccurs="0"/>
     *         &lt;element name="accounting" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AccountingInformationElementType" minOccurs="0"/>
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
        "retrieve",
        "reservationOrProfileIdentifier",
        "personalFacts",
        "frequentFlyer",
        "accounting"
    })
    public static class RetrievalFacts {

        @XmlElement(required = true)
        protected RetrievePNRType retrieve;
        protected ReservationControlInformationType reservationOrProfileIdentifier;
        protected PNRRetrieve.RetrievalFacts.PersonalFacts personalFacts;
        protected FrequentTravellerIdentificationCodeType frequentFlyer;
        protected AccountingInformationElementType accounting;

        /**
         * Gets the value of the retrieve property.
         * 
         * @return
         *     possible object is
         *     {@link RetrievePNRType }
         *     
         */
        public RetrievePNRType getRetrieve() {
            return retrieve;
        }

        /**
         * Sets the value of the retrieve property.
         * 
         * @param value
         *     allowed object is
         *     {@link RetrievePNRType }
         *     
         */
        public void setRetrieve(RetrievePNRType value) {
            this.retrieve = value;
        }

        /**
         * Gets the value of the reservationOrProfileIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link ReservationControlInformationType }
         *     
         */
        public ReservationControlInformationType getReservationOrProfileIdentifier() {
            return reservationOrProfileIdentifier;
        }

        /**
         * Sets the value of the reservationOrProfileIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReservationControlInformationType }
         *     
         */
        public void setReservationOrProfileIdentifier(ReservationControlInformationType value) {
            this.reservationOrProfileIdentifier = value;
        }

        /**
         * Gets the value of the personalFacts property.
         * 
         * @return
         *     possible object is
         *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts }
         *     
         */
        public PNRRetrieve.RetrievalFacts.PersonalFacts getPersonalFacts() {
            return personalFacts;
        }

        /**
         * Sets the value of the personalFacts property.
         * 
         * @param value
         *     allowed object is
         *     {@link PNRRetrieve.RetrievalFacts.PersonalFacts }
         *     
         */
        public void setPersonalFacts(PNRRetrieve.RetrievalFacts.PersonalFacts value) {
            this.personalFacts = value;
        }

        /**
         * Gets the value of the frequentFlyer property.
         * 
         * @return
         *     possible object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public FrequentTravellerIdentificationCodeType getFrequentFlyer() {
            return frequentFlyer;
        }

        /**
         * Sets the value of the frequentFlyer property.
         * 
         * @param value
         *     allowed object is
         *     {@link FrequentTravellerIdentificationCodeType }
         *     
         */
        public void setFrequentFlyer(FrequentTravellerIdentificationCodeType value) {
            this.frequentFlyer = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="travellerInformation" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TravellerInformationType"/>
         *         &lt;element name="productInformation" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TravelProductInformationType" minOccurs="0"/>
         *         &lt;element name="ticket" type="{http://xml.amadeus.com/PNRRET_17_1_1A}TicketNumberType" minOccurs="0"/>
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
            "productInformation",
            "ticket"
        })
        public static class PersonalFacts {

            @XmlElement(required = true)
            protected TravellerInformationType travellerInformation;
            protected TravelProductInformationType productInformation;
            protected TicketNumberType ticket;

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformationType }
             *     
             */
            public TravellerInformationType getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformationType }
             *     
             */
            public void setTravellerInformation(TravellerInformationType value) {
                this.travellerInformation = value;
            }

            /**
             * Gets the value of the productInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationType }
             *     
             */
            public TravelProductInformationType getProductInformation() {
                return productInformation;
            }

            /**
             * Sets the value of the productInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationType }
             *     
             */
            public void setProductInformation(TravelProductInformationType value) {
                this.productInformation = value;
            }

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
     *         &lt;element name="options" type="{http://xml.amadeus.com/PNRRET_17_1_1A}OptionalPNRActionsType"/>
     *         &lt;element name="printer" type="{http://xml.amadeus.com/PNRRET_17_1_1A}PrinterIdentificationType" minOccurs="0"/>
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
        "options",
        "printer"
    })
    public static class Settings {

        @XmlElement(required = true)
        protected OptionalPNRActionsType options;
        protected PrinterIdentificationType printer;

        /**
         * Gets the value of the options property.
         * 
         * @return
         *     possible object is
         *     {@link OptionalPNRActionsType }
         *     
         */
        public OptionalPNRActionsType getOptions() {
            return options;
        }

        /**
         * Sets the value of the options property.
         * 
         * @param value
         *     allowed object is
         *     {@link OptionalPNRActionsType }
         *     
         */
        public void setOptions(OptionalPNRActionsType value) {
            this.options = value;
        }

        /**
         * Gets the value of the printer property.
         * 
         * @return
         *     possible object is
         *     {@link PrinterIdentificationType }
         *     
         */
        public PrinterIdentificationType getPrinter() {
            return printer;
        }

        /**
         * Sets the value of the printer property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrinterIdentificationType }
         *     
         */
        public void setPrinter(PrinterIdentificationType value) {
            this.printer = value;
        }

    }

}
