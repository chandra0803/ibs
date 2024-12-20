
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To transport Tour account details
 * 
 * <p>Java class for TourAccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TourAccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tourTotalPrices" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU_25419S" maxOccurs="20"/>
 *         &lt;element name="remainingAmountsDetails" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="providerCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_25420S"/>
 *                   &lt;element name="remainingAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU_25419S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tourDetailedPriceInfo" maxOccurs="101" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="markerSpecificRead" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
 *                   &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_25422S" minOccurs="0"/>
 *                   &lt;element name="productPrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU_25419S"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="paymentInformation" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentInformationTypeU"/>
 *                   &lt;element name="operatorCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_25420S" minOccurs="0"/>
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
@XmlType(name = "TourAccountDetailsType", propOrder = {
    "tourTotalPrices",
    "remainingAmountsDetails",
    "tourDetailedPriceInfo",
    "paymentInformation"
})
public class TourAccountDetailsType {

    @XmlElement(required = true)
    protected List<TariffInformationTypeU25419S> tourTotalPrices;
    protected List<TourAccountDetailsType.RemainingAmountsDetails> remainingAmountsDetails;
    protected List<TourAccountDetailsType.TourDetailedPriceInfo> tourDetailedPriceInfo;
    protected List<TourAccountDetailsType.PaymentInformation> paymentInformation;

    /**
     * Gets the value of the tourTotalPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourTotalPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourTotalPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffInformationTypeU25419S }
     * 
     * 
     */
    public List<TariffInformationTypeU25419S> getTourTotalPrices() {
        if (tourTotalPrices == null) {
            tourTotalPrices = new ArrayList<TariffInformationTypeU25419S>();
        }
        return this.tourTotalPrices;
    }

    /**
     * Gets the value of the remainingAmountsDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remainingAmountsDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemainingAmountsDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourAccountDetailsType.RemainingAmountsDetails }
     * 
     * 
     */
    public List<TourAccountDetailsType.RemainingAmountsDetails> getRemainingAmountsDetails() {
        if (remainingAmountsDetails == null) {
            remainingAmountsDetails = new ArrayList<TourAccountDetailsType.RemainingAmountsDetails>();
        }
        return this.remainingAmountsDetails;
    }

    /**
     * Gets the value of the tourDetailedPriceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tourDetailedPriceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTourDetailedPriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourAccountDetailsType.TourDetailedPriceInfo }
     * 
     * 
     */
    public List<TourAccountDetailsType.TourDetailedPriceInfo> getTourDetailedPriceInfo() {
        if (tourDetailedPriceInfo == null) {
            tourDetailedPriceInfo = new ArrayList<TourAccountDetailsType.TourDetailedPriceInfo>();
        }
        return this.tourDetailedPriceInfo;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TourAccountDetailsType.PaymentInformation }
     * 
     * 
     */
    public List<TourAccountDetailsType.PaymentInformation> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<TourAccountDetailsType.PaymentInformation>();
        }
        return this.paymentInformation;
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
     *         &lt;element name="payment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentInformationTypeU"/>
     *         &lt;element name="operatorCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_25420S" minOccurs="0"/>
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
        "payment",
        "operatorCode"
    })
    public static class PaymentInformation {

        @XmlElement(required = true)
        protected PaymentInformationTypeU payment;
        protected CompanyInformationType25420S operatorCode;

        /**
         * Gets the value of the payment property.
         * 
         * @return
         *     possible object is
         *     {@link PaymentInformationTypeU }
         *     
         */
        public PaymentInformationTypeU getPayment() {
            return payment;
        }

        /**
         * Sets the value of the payment property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentInformationTypeU }
         *     
         */
        public void setPayment(PaymentInformationTypeU value) {
            this.payment = value;
        }

        /**
         * Gets the value of the operatorCode property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyInformationType25420S }
         *     
         */
        public CompanyInformationType25420S getOperatorCode() {
            return operatorCode;
        }

        /**
         * Sets the value of the operatorCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyInformationType25420S }
         *     
         */
        public void setOperatorCode(CompanyInformationType25420S value) {
            this.operatorCode = value;
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
     *         &lt;element name="providerCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CompanyInformationType_25420S"/>
     *         &lt;element name="remainingAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU_25419S"/>
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
        "remainingAmount"
    })
    public static class RemainingAmountsDetails {

        @XmlElement(required = true)
        protected CompanyInformationType25420S providerCode;
        @XmlElement(required = true)
        protected TariffInformationTypeU25419S remainingAmount;

        /**
         * Gets the value of the providerCode property.
         * 
         * @return
         *     possible object is
         *     {@link CompanyInformationType25420S }
         *     
         */
        public CompanyInformationType25420S getProviderCode() {
            return providerCode;
        }

        /**
         * Sets the value of the providerCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyInformationType25420S }
         *     
         */
        public void setProviderCode(CompanyInformationType25420S value) {
            this.providerCode = value;
        }

        /**
         * Gets the value of the remainingAmount property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU25419S }
         *     
         */
        public TariffInformationTypeU25419S getRemainingAmount() {
            return remainingAmount;
        }

        /**
         * Sets the value of the remainingAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU25419S }
         *     
         */
        public void setRemainingAmount(TariffInformationTypeU25419S value) {
            this.remainingAmount = value;
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
     *         &lt;element name="markerSpecificRead" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DummySegmentTypeI"/>
     *         &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_25422S" minOccurs="0"/>
     *         &lt;element name="productPrice" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationTypeU_25419S"/>
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
        "markerSpecificRead",
        "productId",
        "productPrice"
    })
    public static class TourDetailedPriceInfo {

        @XmlElement(required = true)
        protected DummySegmentTypeI markerSpecificRead;
        protected ReferenceInfoType25422S productId;
        @XmlElement(required = true)
        protected TariffInformationTypeU25419S productPrice;

        /**
         * Gets the value of the markerSpecificRead property.
         * 
         * @return
         *     possible object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public DummySegmentTypeI getMarkerSpecificRead() {
            return markerSpecificRead;
        }

        /**
         * Sets the value of the markerSpecificRead property.
         * 
         * @param value
         *     allowed object is
         *     {@link DummySegmentTypeI }
         *     
         */
        public void setMarkerSpecificRead(DummySegmentTypeI value) {
            this.markerSpecificRead = value;
        }

        /**
         * Gets the value of the productId property.
         * 
         * @return
         *     possible object is
         *     {@link ReferenceInfoType25422S }
         *     
         */
        public ReferenceInfoType25422S getProductId() {
            return productId;
        }

        /**
         * Sets the value of the productId property.
         * 
         * @param value
         *     allowed object is
         *     {@link ReferenceInfoType25422S }
         *     
         */
        public void setProductId(ReferenceInfoType25422S value) {
            this.productId = value;
        }

        /**
         * Gets the value of the productPrice property.
         * 
         * @return
         *     possible object is
         *     {@link TariffInformationTypeU25419S }
         *     
         */
        public TariffInformationTypeU25419S getProductPrice() {
            return productPrice;
        }

        /**
         * Sets the value of the productPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link TariffInformationTypeU25419S }
         *     
         */
        public void setProductPrice(TariffInformationTypeU25419S value) {
            this.productPrice = value;
        }

    }

}
