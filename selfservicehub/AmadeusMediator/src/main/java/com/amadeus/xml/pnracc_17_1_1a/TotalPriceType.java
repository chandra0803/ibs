
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys TP (Total Price) information
 * 
 * <p>Java class for TotalPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TotalPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providerCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_83550S"/&gt;
 *         &lt;element name="externalRef" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_83551S" minOccurs="0"/&gt;
 *         &lt;element name="methodOfDelivery" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="elementManagement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_83559S"/&gt;
 *                   &lt;element name="deliveryDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PackageDescriptionType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mainPrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationType"/&gt;
 *         &lt;element name="otherPrices" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationType_83558S" maxOccurs="12" minOccurs="0"/&gt;
 *         &lt;element name="productDescription" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="product" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductIdentificationTypeU"/&gt;
 *                   &lt;element name="productRestriction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TrafficRestrictionDetailsType" maxOccurs="10" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionnalChargeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxesType" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="rateCodeInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RateTypesTypeU" minOccurs="0"/&gt;
 *         &lt;element name="optionalBooking" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StructuredDateTimeInformationType_83553S" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalPriceType", propOrder = {
    "providerCode",
    "externalRef",
    "methodOfDelivery",
    "mainPrice",
    "otherPrices",
    "productDescription",
    "additionnalChargeInformation",
    "rateCodeInformation",
    "optionalBooking"
})
public class TotalPriceType {

    @XmlElement(required = true)
    protected CompanyInformationType83550S providerCode;
    protected ReferenceInformationTypeI83551S externalRef;
    protected TotalPriceType.MethodOfDelivery methodOfDelivery;
    @XmlElement(required = true)
    protected TariffInformationType mainPrice;
    protected List<TariffInformationType83558S> otherPrices;
    protected TotalPriceType.ProductDescription productDescription;
    protected List<TaxesType> additionnalChargeInformation;
    protected RateTypesTypeU rateCodeInformation;
    protected StructuredDateTimeInformationType83553S optionalBooking;

    /**
     * Gets the value of the providerCode property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyInformationType83550S }
     *     
     */
    public CompanyInformationType83550S getProviderCode() {
        return providerCode;
    }

    /**
     * Sets the value of the providerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInformationType83550S }
     *     
     */
    public void setProviderCode(CompanyInformationType83550S value) {
        this.providerCode = value;
    }

    /**
     * Gets the value of the externalRef property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationTypeI83551S }
     *     
     */
    public ReferenceInformationTypeI83551S getExternalRef() {
        return externalRef;
    }

    /**
     * Sets the value of the externalRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationTypeI83551S }
     *     
     */
    public void setExternalRef(ReferenceInformationTypeI83551S value) {
        this.externalRef = value;
    }

    /**
     * Gets the value of the methodOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPriceType.MethodOfDelivery }
     *     
     */
    public TotalPriceType.MethodOfDelivery getMethodOfDelivery() {
        return methodOfDelivery;
    }

    /**
     * Sets the value of the methodOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPriceType.MethodOfDelivery }
     *     
     */
    public void setMethodOfDelivery(TotalPriceType.MethodOfDelivery value) {
        this.methodOfDelivery = value;
    }

    /**
     * Gets the value of the mainPrice property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationType }
     *     
     */
    public TariffInformationType getMainPrice() {
        return mainPrice;
    }

    /**
     * Sets the value of the mainPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationType }
     *     
     */
    public void setMainPrice(TariffInformationType value) {
        this.mainPrice = value;
    }

    /**
     * Gets the value of the otherPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffInformationType83558S }
     * 
     * 
     */
    public List<TariffInformationType83558S> getOtherPrices() {
        if (otherPrices == null) {
            otherPrices = new ArrayList<TariffInformationType83558S>();
        }
        return this.otherPrices;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TotalPriceType.ProductDescription }
     *     
     */
    public TotalPriceType.ProductDescription getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TotalPriceType.ProductDescription }
     *     
     */
    public void setProductDescription(TotalPriceType.ProductDescription value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the additionnalChargeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionnalChargeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionnalChargeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxesType }
     * 
     * 
     */
    public List<TaxesType> getAdditionnalChargeInformation() {
        if (additionnalChargeInformation == null) {
            additionnalChargeInformation = new ArrayList<TaxesType>();
        }
        return this.additionnalChargeInformation;
    }

    /**
     * Gets the value of the rateCodeInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RateTypesTypeU }
     *     
     */
    public RateTypesTypeU getRateCodeInformation() {
        return rateCodeInformation;
    }

    /**
     * Sets the value of the rateCodeInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTypesTypeU }
     *     
     */
    public void setRateCodeInformation(RateTypesTypeU value) {
        this.rateCodeInformation = value;
    }

    /**
     * Gets the value of the optionalBooking property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType83553S }
     *     
     */
    public StructuredDateTimeInformationType83553S getOptionalBooking() {
        return optionalBooking;
    }

    /**
     * Sets the value of the optionalBooking property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType83553S }
     *     
     */
    public void setOptionalBooking(StructuredDateTimeInformationType83553S value) {
        this.optionalBooking = value;
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
     *         &lt;element name="elementManagement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ElementManagementSegmentType_83559S"/&gt;
     *         &lt;element name="deliveryDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PackageDescriptionType"/&gt;
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
        "elementManagement",
        "deliveryDetails"
    })
    public static class MethodOfDelivery {

        @XmlElement(required = true)
        protected ElementManagementSegmentType83559S elementManagement;
        @XmlElement(required = true)
        protected PackageDescriptionType deliveryDetails;

        /**
         * Gets the value of the elementManagement property.
         * 
         * @return
         *     possible object is
         *     {@link ElementManagementSegmentType83559S }
         *     
         */
        public ElementManagementSegmentType83559S getElementManagement() {
            return elementManagement;
        }

        /**
         * Sets the value of the elementManagement property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElementManagementSegmentType83559S }
         *     
         */
        public void setElementManagement(ElementManagementSegmentType83559S value) {
            this.elementManagement = value;
        }

        /**
         * Gets the value of the deliveryDetails property.
         * 
         * @return
         *     possible object is
         *     {@link PackageDescriptionType }
         *     
         */
        public PackageDescriptionType getDeliveryDetails() {
            return deliveryDetails;
        }

        /**
         * Sets the value of the deliveryDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link PackageDescriptionType }
         *     
         */
        public void setDeliveryDetails(PackageDescriptionType value) {
            this.deliveryDetails = value;
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
     *         &lt;element name="product" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductIdentificationTypeU"/&gt;
     *         &lt;element name="productRestriction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TrafficRestrictionDetailsType" maxOccurs="10" minOccurs="0"/&gt;
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
        "product",
        "productRestriction"
    })
    public static class ProductDescription {

        @XmlElement(required = true)
        protected ProductIdentificationTypeU product;
        protected List<TrafficRestrictionDetailsType> productRestriction;

        /**
         * Gets the value of the product property.
         * 
         * @return
         *     possible object is
         *     {@link ProductIdentificationTypeU }
         *     
         */
        public ProductIdentificationTypeU getProduct() {
            return product;
        }

        /**
         * Sets the value of the product property.
         * 
         * @param value
         *     allowed object is
         *     {@link ProductIdentificationTypeU }
         *     
         */
        public void setProduct(ProductIdentificationTypeU value) {
            this.product = value;
        }

        /**
         * Gets the value of the productRestriction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the productRestriction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProductRestriction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TrafficRestrictionDetailsType }
         * 
         * 
         */
        public List<TrafficRestrictionDetailsType> getProductRestriction() {
            if (productRestriction == null) {
                productRestriction = new ArrayList<TrafficRestrictionDetailsType>();
            }
            return this.productRestriction;
        }

    }

}
