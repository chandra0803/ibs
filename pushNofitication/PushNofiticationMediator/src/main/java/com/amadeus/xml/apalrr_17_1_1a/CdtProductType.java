
package com.amadeus.xml.apalrr_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys FROM and TO transfer journey of PAX
 * 
 * <p>Java class for CdtProductType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdtProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S"/>
 *         &lt;element name="productDetailsGroup" maxOccurs="5">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="transferFlightDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FlightDetailsResponseType"/>
 *                   &lt;element name="customerAcceptanceStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType" minOccurs="0"/>
 *                   &lt;element name="productReference" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType_193012S"/>
 *                   &lt;element name="productErrors" type="{http://xml.amadeus.com/APALRR_17_1_1A}ErrorGroupType" maxOccurs="20" minOccurs="0"/>
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
@XmlType(name = "CdtProductType", propOrder = {
    "flightQualifier",
    "productDetailsGroup"
})
public class CdtProductType {

    @XmlElement(required = true)
    protected StatusType145987S flightQualifier;
    @XmlElement(required = true)
    protected List<CdtProductType.ProductDetailsGroup> productDetailsGroup;

    /**
     * Gets the value of the flightQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType145987S }
     *     
     */
    public StatusType145987S getFlightQualifier() {
        return flightQualifier;
    }

    /**
     * Sets the value of the flightQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType145987S }
     *     
     */
    public void setFlightQualifier(StatusType145987S value) {
        this.flightQualifier = value;
    }

    /**
     * Gets the value of the productDetailsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productDetailsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductDetailsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CdtProductType.ProductDetailsGroup }
     * 
     * 
     */
    public List<CdtProductType.ProductDetailsGroup> getProductDetailsGroup() {
        if (productDetailsGroup == null) {
            productDetailsGroup = new ArrayList<CdtProductType.ProductDetailsGroup>();
        }
        return this.productDetailsGroup;
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
     *         &lt;element name="transferFlightDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}FlightDetailsResponseType"/>
     *         &lt;element name="customerAcceptanceStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType" minOccurs="0"/>
     *         &lt;element name="productReference" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType_193012S"/>
     *         &lt;element name="productErrors" type="{http://xml.amadeus.com/APALRR_17_1_1A}ErrorGroupType" maxOccurs="20" minOccurs="0"/>
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
        "transferFlightDetails",
        "customerAcceptanceStatus",
        "productReference",
        "productErrors"
    })
    public static class ProductDetailsGroup {

        @XmlElement(required = true)
        protected FlightDetailsResponseType transferFlightDetails;
        protected StatusType customerAcceptanceStatus;
        @XmlElement(required = true)
        protected ItemReferencesAndVersionsType193012S productReference;
        protected List<ErrorGroupType> productErrors;

        /**
         * Gets the value of the transferFlightDetails property.
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsResponseType }
         *     
         */
        public FlightDetailsResponseType getTransferFlightDetails() {
            return transferFlightDetails;
        }

        /**
         * Sets the value of the transferFlightDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsResponseType }
         *     
         */
        public void setTransferFlightDetails(FlightDetailsResponseType value) {
            this.transferFlightDetails = value;
        }

        /**
         * Gets the value of the customerAcceptanceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link StatusType }
         *     
         */
        public StatusType getCustomerAcceptanceStatus() {
            return customerAcceptanceStatus;
        }

        /**
         * Sets the value of the customerAcceptanceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link StatusType }
         *     
         */
        public void setCustomerAcceptanceStatus(StatusType value) {
            this.customerAcceptanceStatus = value;
        }

        /**
         * Gets the value of the productReference property.
         * 
         * @return
         *     possible object is
         *     {@link ItemReferencesAndVersionsType193012S }
         *     
         */
        public ItemReferencesAndVersionsType193012S getProductReference() {
            return productReference;
        }

        /**
         * Sets the value of the productReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link ItemReferencesAndVersionsType193012S }
         *     
         */
        public void setProductReference(ItemReferencesAndVersionsType193012S value) {
            this.productReference = value;
        }

        /**
         * Gets the value of the productErrors property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productErrors property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductErrors().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ErrorGroupType }
         * 
         * 
         */
        public List<ErrorGroupType> getProductErrors() {
            if (productErrors == null) {
                productErrors = new ArrayList<ErrorGroupType>();
            }
            return this.productErrors;
        }

    }

}
