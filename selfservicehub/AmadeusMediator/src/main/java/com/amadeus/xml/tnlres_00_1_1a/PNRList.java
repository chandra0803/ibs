
package com.amadeus.xml.tnlres_00_1_1a;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeFormText" type="{http://xml.amadeus.com/TNLRES_00_1_1A}InteractiveFreeTextTypeI" minOccurs="0"/&gt;
 *         &lt;element name="citypair"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="originDestinationMarker" type="{http://xml.amadeus.com/TNLRES_00_1_1A}OriginAndDestinationDetailsTypeI"/&gt;
 *                   &lt;element name="travellerInformationSection" maxOccurs="300"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="travellerInformation" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravellerInformationTypeI"/&gt;
 *                             &lt;element name="relatedProduct" type="{http://xml.amadeus.com/TNLRES_00_1_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="travelProduct" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="reservationInfo" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ReservationControlInformationTypeI"/&gt;
 *                             &lt;element name="productInfo" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ProductInformationTypeI" minOccurs="0"/&gt;
 *                             &lt;element name="messageAction" type="{http://xml.amadeus.com/TNLRES_00_1_1A}MessageActionDetailsTypeI" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="errorInformation" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ApplicationErrorInformationTypeI" minOccurs="0"/&gt;
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
    "freeFormText",
    "citypair",
    "errorInformation"
})
@XmlRootElement(name = "PNR_List")
public class PNRList {

    protected InteractiveFreeTextTypeI freeFormText;
    @XmlElement(required = true)
    protected PNRList.Citypair citypair;
    protected ApplicationErrorInformationTypeI errorInformation;

    /**
     * Gets the value of the freeFormText property.
     * 
     * @return
     *     possible object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public InteractiveFreeTextTypeI getFreeFormText() {
        return freeFormText;
    }

    /**
     * Sets the value of the freeFormText property.
     * 
     * @param value
     *     allowed object is
     *     {@link InteractiveFreeTextTypeI }
     *     
     */
    public void setFreeFormText(InteractiveFreeTextTypeI value) {
        this.freeFormText = value;
    }

    /**
     * Gets the value of the citypair property.
     * 
     * @return
     *     possible object is
     *     {@link PNRList.Citypair }
     *     
     */
    public PNRList.Citypair getCitypair() {
        return citypair;
    }

    /**
     * Sets the value of the citypair property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNRList.Citypair }
     *     
     */
    public void setCitypair(PNRList.Citypair value) {
        this.citypair = value;
    }

    /**
     * Gets the value of the errorInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public ApplicationErrorInformationTypeI getErrorInformation() {
        return errorInformation;
    }

    /**
     * Sets the value of the errorInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationErrorInformationTypeI }
     *     
     */
    public void setErrorInformation(ApplicationErrorInformationTypeI value) {
        this.errorInformation = value;
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
     *         &lt;element name="originDestinationMarker" type="{http://xml.amadeus.com/TNLRES_00_1_1A}OriginAndDestinationDetailsTypeI"/&gt;
     *         &lt;element name="travellerInformationSection" maxOccurs="300"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="travellerInformation" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravellerInformationTypeI"/&gt;
     *                   &lt;element name="relatedProduct" type="{http://xml.amadeus.com/TNLRES_00_1_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="travelProduct" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="reservationInfo" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ReservationControlInformationTypeI"/&gt;
     *                   &lt;element name="productInfo" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ProductInformationTypeI" minOccurs="0"/&gt;
     *                   &lt;element name="messageAction" type="{http://xml.amadeus.com/TNLRES_00_1_1A}MessageActionDetailsTypeI" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "originDestinationMarker",
        "travellerInformationSection"
    })
    public static class Citypair {

        @XmlElement(required = true)
        protected OriginAndDestinationDetailsTypeI originDestinationMarker;
        @XmlElement(required = true)
        protected List<PNRList.Citypair.TravellerInformationSection> travellerInformationSection;

        /**
         * Gets the value of the originDestinationMarker property.
         * 
         * @return
         *     possible object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public OriginAndDestinationDetailsTypeI getOriginDestinationMarker() {
            return originDestinationMarker;
        }

        /**
         * Sets the value of the originDestinationMarker property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginAndDestinationDetailsTypeI }
         *     
         */
        public void setOriginDestinationMarker(OriginAndDestinationDetailsTypeI value) {
            this.originDestinationMarker = value;
        }

        /**
         * Gets the value of the travellerInformationSection property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travellerInformationSection property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravellerInformationSection().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PNRList.Citypair.TravellerInformationSection }
         * 
         * 
         */
        public List<PNRList.Citypair.TravellerInformationSection> getTravellerInformationSection() {
            if (travellerInformationSection == null) {
                travellerInformationSection = new ArrayList<PNRList.Citypair.TravellerInformationSection>();
            }
            return this.travellerInformationSection;
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
         *         &lt;element name="travellerInformation" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravellerInformationTypeI"/&gt;
         *         &lt;element name="relatedProduct" type="{http://xml.amadeus.com/TNLRES_00_1_1A}RelatedProductInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="travelProduct" type="{http://xml.amadeus.com/TNLRES_00_1_1A}TravelProductInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="reservationInfo" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ReservationControlInformationTypeI"/&gt;
         *         &lt;element name="productInfo" type="{http://xml.amadeus.com/TNLRES_00_1_1A}ProductInformationTypeI" minOccurs="0"/&gt;
         *         &lt;element name="messageAction" type="{http://xml.amadeus.com/TNLRES_00_1_1A}MessageActionDetailsTypeI" minOccurs="0"/&gt;
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
            "travellerInformation",
            "relatedProduct",
            "travelProduct",
            "reservationInfo",
            "productInfo",
            "messageAction"
        })
        public static class TravellerInformationSection {

            @XmlElement(required = true)
            protected TravellerInformationTypeI travellerInformation;
            protected RelatedProductInformationTypeI relatedProduct;
            protected TravelProductInformationTypeI travelProduct;
            @XmlElement(required = true)
            protected ReservationControlInformationTypeI reservationInfo;
            protected ProductInformationTypeI productInfo;
            protected MessageActionDetailsTypeI messageAction;

            /**
             * Gets the value of the travellerInformation property.
             * 
             * @return
             *     possible object is
             *     {@link TravellerInformationTypeI }
             *     
             */
            public TravellerInformationTypeI getTravellerInformation() {
                return travellerInformation;
            }

            /**
             * Sets the value of the travellerInformation property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravellerInformationTypeI }
             *     
             */
            public void setTravellerInformation(TravellerInformationTypeI value) {
                this.travellerInformation = value;
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
             * Gets the value of the travelProduct property.
             * 
             * @return
             *     possible object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public TravelProductInformationTypeI getTravelProduct() {
                return travelProduct;
            }

            /**
             * Sets the value of the travelProduct property.
             * 
             * @param value
             *     allowed object is
             *     {@link TravelProductInformationTypeI }
             *     
             */
            public void setTravelProduct(TravelProductInformationTypeI value) {
                this.travelProduct = value;
            }

            /**
             * Gets the value of the reservationInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ReservationControlInformationTypeI }
             *     
             */
            public ReservationControlInformationTypeI getReservationInfo() {
                return reservationInfo;
            }

            /**
             * Sets the value of the reservationInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ReservationControlInformationTypeI }
             *     
             */
            public void setReservationInfo(ReservationControlInformationTypeI value) {
                this.reservationInfo = value;
            }

            /**
             * Gets the value of the productInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ProductInformationTypeI }
             *     
             */
            public ProductInformationTypeI getProductInfo() {
                return productInfo;
            }

            /**
             * Sets the value of the productInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ProductInformationTypeI }
             *     
             */
            public void setProductInfo(ProductInformationTypeI value) {
                this.productInfo = value;
            }

            /**
             * Gets the value of the messageAction property.
             * 
             * @return
             *     possible object is
             *     {@link MessageActionDetailsTypeI }
             *     
             */
            public MessageActionDetailsTypeI getMessageAction() {
                return messageAction;
            }

            /**
             * Sets the value of the messageAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link MessageActionDetailsTypeI }
             *     
             */
            public void setMessageAction(MessageActionDetailsTypeI value) {
                this.messageAction = value;
            }

        }

    }

}
