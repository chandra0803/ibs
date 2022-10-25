
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FerryLegDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FerryLegDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sailingDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TravelProductInformationTypeU"/&gt;
 *         &lt;element name="shipDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ShipIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="sailingLegCheckInInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_21109S" minOccurs="0"/&gt;
 *         &lt;element name="passengerAssociation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_25132S" minOccurs="0"/&gt;
 *         &lt;element name="priceInfoGroup" maxOccurs="9" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="routePriceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU"/&gt;
 *                   &lt;element name="passengerCategoryType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeTypeU_24552S"/&gt;
 *                   &lt;element name="numberOfPassengers" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="vehicleInfoGroup" maxOccurs="5" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VehicleTypeU"/&gt;
 *                   &lt;element name="numberOfBicycles" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
 *                   &lt;element name="vehicleRoutePrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="serviceInfoGroup" maxOccurs="18" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="serviceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeTypeU"/&gt;
 *                   &lt;element name="numberOfServices" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
 *                   &lt;element name="serviceRoutePrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="animalInfoGroup" maxOccurs="2" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="animalInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecificDataInformationTypeI"/&gt;
 *                   &lt;element name="animalRoutePrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryLegDescriptionType", propOrder = {
    "sailingDetails",
    "shipDescription",
    "sailingLegCheckInInformation",
    "passengerAssociation",
    "priceInfoGroup",
    "vehicleInfoGroup",
    "serviceInfoGroup",
    "animalInfoGroup"
})
public class FerryLegDescriptionType {

    @XmlElement(required = true)
    protected TravelProductInformationTypeU sailingDetails;
    protected ShipIdentificationType shipDescription;
    protected StructuredDateTimeInformationType21109S sailingLegCheckInInformation;
    protected ReferenceInformationTypeI25132S passengerAssociation;
    protected List<FerryLegDescriptionType.PriceInfoGroup> priceInfoGroup;
    protected List<FerryLegDescriptionType.VehicleInfoGroup> vehicleInfoGroup;
    protected List<FerryLegDescriptionType.ServiceInfoGroup> serviceInfoGroup;
    protected List<FerryLegDescriptionType.AnimalInfoGroup> animalInfoGroup;

    /**
     * Gets the value of the sailingDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TravelProductInformationTypeU }
     *     
     */
    public TravelProductInformationTypeU getSailingDetails() {
        return sailingDetails;
    }

    /**
     * Sets the value of the sailingDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelProductInformationTypeU }
     *     
     */
    public void setSailingDetails(TravelProductInformationTypeU value) {
        this.sailingDetails = value;
    }

    /**
     * Gets the value of the shipDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ShipIdentificationType }
     *     
     */
    public ShipIdentificationType getShipDescription() {
        return shipDescription;
    }

    /**
     * Sets the value of the shipDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipIdentificationType }
     *     
     */
    public void setShipDescription(ShipIdentificationType value) {
        this.shipDescription = value;
    }

    /**
     * Gets the value of the sailingLegCheckInInformation property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType21109S }
     *     
     */
    public StructuredDateTimeInformationType21109S getSailingLegCheckInInformation() {
        return sailingLegCheckInInformation;
    }

    /**
     * Sets the value of the sailingLegCheckInInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType21109S }
     *     
     */
    public void setSailingLegCheckInInformation(StructuredDateTimeInformationType21109S value) {
        this.sailingLegCheckInInformation = value;
    }

    /**
     * Gets the value of the passengerAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI25132S }
     *     
     */
    public ReferenceInformationTypeI25132S getPassengerAssociation() {
        return passengerAssociation;
    }

    /**
     * Sets the value of the passengerAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI25132S }
     *     
     */
    public void setPassengerAssociation(ReferenceInformationTypeI25132S value) {
        this.passengerAssociation = value;
    }

    /**
     * Gets the value of the priceInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.PriceInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.PriceInfoGroup> getPriceInfoGroup() {
        if (priceInfoGroup == null) {
            priceInfoGroup = new ArrayList<FerryLegDescriptionType.PriceInfoGroup>();
        }
        return this.priceInfoGroup;
    }

    /**
     * Gets the value of the vehicleInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.VehicleInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.VehicleInfoGroup> getVehicleInfoGroup() {
        if (vehicleInfoGroup == null) {
            vehicleInfoGroup = new ArrayList<FerryLegDescriptionType.VehicleInfoGroup>();
        }
        return this.vehicleInfoGroup;
    }

    /**
     * Gets the value of the serviceInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.ServiceInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.ServiceInfoGroup> getServiceInfoGroup() {
        if (serviceInfoGroup == null) {
            serviceInfoGroup = new ArrayList<FerryLegDescriptionType.ServiceInfoGroup>();
        }
        return this.serviceInfoGroup;
    }

    /**
     * Gets the value of the animalInfoGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the animalInfoGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnimalInfoGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FerryLegDescriptionType.AnimalInfoGroup }
     * 
     * 
     */
    public List<FerryLegDescriptionType.AnimalInfoGroup> getAnimalInfoGroup() {
        if (animalInfoGroup == null) {
            animalInfoGroup = new ArrayList<FerryLegDescriptionType.AnimalInfoGroup>();
        }
        return this.animalInfoGroup;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="animalInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecificDataInformationTypeI"/&gt;
     *         &lt;element name="animalRoutePrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "animalInformation",
        "animalRoutePrice"
    })
    public static class AnimalInfoGroup {

        @XmlElement(required = true)
        protected SpecificDataInformationTypeI animalInformation;
        protected TariffInformationTypeU animalRoutePrice;

        /**
         * Gets the value of the animalInformation property.
         * 
         * @return
         *     possible object is
         *     {@link SpecificDataInformationTypeI }
         *     
         */
        public SpecificDataInformationTypeI getAnimalInformation() {
            return animalInformation;
        }

        /**
         * Sets the value of the animalInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link SpecificDataInformationTypeI }
         *     
         */
        public void setAnimalInformation(SpecificDataInformationTypeI value) {
            this.animalInformation = value;
        }

        /**
         * Gets the value of the animalRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public TariffInformationTypeU getAnimalRoutePrice() {
            return animalRoutePrice;
        }

        /**
         * Sets the value of the animalRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public void setAnimalRoutePrice(TariffInformationTypeU value) {
            this.animalRoutePrice = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="routePriceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU"/&gt;
     *         &lt;element name="passengerCategoryType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeTypeU_24552S"/&gt;
     *         &lt;element name="numberOfPassengers" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "routePriceInformation",
        "passengerCategoryType",
        "numberOfPassengers"
    })
    public static class PriceInfoGroup {

        @XmlElement(required = true)
        protected TariffInformationTypeU routePriceInformation;
        @XmlElement(required = true)
        protected AttributeTypeU24552S passengerCategoryType;
        @XmlElement(required = true)
        protected NumberOfUnitsType numberOfPassengers;

        /**
         * Gets the value of the routePriceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public TariffInformationTypeU getRoutePriceInformation() {
            return routePriceInformation;
        }

        /**
         * Sets the value of the routePriceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public void setRoutePriceInformation(TariffInformationTypeU value) {
            this.routePriceInformation = value;
        }

        /**
         * Gets the value of the passengerCategoryType property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeTypeU24552S }
         *     
         */
        public AttributeTypeU24552S getPassengerCategoryType() {
            return passengerCategoryType;
        }

        /**
         * Sets the value of the passengerCategoryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeTypeU24552S }
         *     
         */
        public void setPassengerCategoryType(AttributeTypeU24552S value) {
            this.passengerCategoryType = value;
        }

        /**
         * Gets the value of the numberOfPassengers property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getNumberOfPassengers() {
            return numberOfPassengers;
        }

        /**
         * Sets the value of the numberOfPassengers property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setNumberOfPassengers(NumberOfUnitsType value) {
            this.numberOfPassengers = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="serviceInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeTypeU"/&gt;
     *         &lt;element name="numberOfServices" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
     *         &lt;element name="serviceRoutePrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "serviceInformation",
        "numberOfServices",
        "serviceRoutePrice"
    })
    public static class ServiceInfoGroup {

        @XmlElement(required = true)
        protected AttributeTypeU serviceInformation;
        protected NumberOfUnitsType numberOfServices;
        protected TariffInformationTypeU serviceRoutePrice;

        /**
         * Gets the value of the serviceInformation property.
         * 
         * @return
         *     possible object is
         *     {@link AttributeTypeU }
         *     
         */
        public AttributeTypeU getServiceInformation() {
            return serviceInformation;
        }

        /**
         * Sets the value of the serviceInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributeTypeU }
         *     
         */
        public void setServiceInformation(AttributeTypeU value) {
            this.serviceInformation = value;
        }

        /**
         * Gets the value of the numberOfServices property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getNumberOfServices() {
            return numberOfServices;
        }

        /**
         * Sets the value of the numberOfServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setNumberOfServices(NumberOfUnitsType value) {
            this.numberOfServices = value;
        }

        /**
         * Gets the value of the serviceRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public TariffInformationTypeU getServiceRoutePrice() {
            return serviceRoutePrice;
        }

        /**
         * Sets the value of the serviceRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public void setServiceRoutePrice(TariffInformationTypeU value) {
            this.serviceRoutePrice = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="vehicleInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VehicleTypeU"/&gt;
     *         &lt;element name="numberOfBicycles" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumberOfUnitsType" minOccurs="0"/&gt;
     *         &lt;element name="vehicleRoutePrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehicleInformation",
        "numberOfBicycles",
        "vehicleRoutePrice"
    })
    public static class VehicleInfoGroup {

        @XmlElement(required = true)
        protected VehicleTypeU vehicleInformation;
        protected NumberOfUnitsType numberOfBicycles;
        protected TariffInformationTypeU vehicleRoutePrice;

        /**
         * Gets the value of the vehicleInformation property.
         * 
         * @return
         *     possible object is
         *     {@link VehicleTypeU }
         *     
         */
        public VehicleTypeU getVehicleInformation() {
            return vehicleInformation;
        }

        /**
         * Sets the value of the vehicleInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleTypeU }
         *     
         */
        public void setVehicleInformation(VehicleTypeU value) {
            this.vehicleInformation = value;
        }

        /**
         * Gets the value of the numberOfBicycles property.
         * 
         * @return
         *     possible object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public NumberOfUnitsType getNumberOfBicycles() {
            return numberOfBicycles;
        }

        /**
         * Sets the value of the numberOfBicycles property.
         * 
         * @param value
         *     allowed object is
         *     {@link NumberOfUnitsType }
         *     
         */
        public void setNumberOfBicycles(NumberOfUnitsType value) {
            this.numberOfBicycles = value;
        }

        /**
         * Gets the value of the vehicleRoutePrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public TariffInformationTypeU getVehicleRoutePrice() {
            return vehicleRoutePrice;
        }

        /**
         * Sets the value of the vehicleRoutePrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU }
         *     
         */
        public void setVehicleRoutePrice(TariffInformationTypeU value) {
            this.vehicleRoutePrice = value;
        }

    }

}
