
package org.opentravel.ota._2003._05.ota2010b;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The RateQualifierType complex type describes fully rate information associated with a specific rate quotation, including the description of any promotions that may apply.
 * 
 * <p>Java class for RateQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateQualifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromoDesc" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32" minOccurs="0"/&gt;
 *         &lt;element name="RateComments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="RateComment" maxOccurs="15"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;FormattedTextTextType"&gt;
 *                           &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05/OTA2010B}RateQualifierCoreGroup"/&gt;
 *       &lt;attribute name="ArriveByFlight" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RateAuthorizationCode" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32" /&gt;
 *       &lt;attribute name="VendorRateID" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RateQualifierType", propOrder = {
    "promoDesc",
    "rateComments"
})
public class RateQualifierType {

    @XmlElement(name = "PromoDesc")
    protected String promoDesc;
    @XmlElement(name = "RateComments")
    protected RateQualifierType.RateComments rateComments;
    @XmlAttribute(name = "ArriveByFlight")
    protected Boolean arriveByFlight;
    @XmlAttribute(name = "RateAuthorizationCode")
    protected String rateAuthorizationCode;
    @XmlAttribute(name = "VendorRateID")
    protected String vendorRateID;
    @XmlAttribute(name = "TravelPurpose")
    protected String travelPurpose;
    @XmlAttribute(name = "RateCategory")
    protected String rateCategory;
    @XmlAttribute(name = "CorpDiscountNmbr")
    protected String corpDiscountNmbr;
    @XmlAttribute(name = "RateQualifier")
    protected String rateQualifier;
    @XmlAttribute(name = "RatePeriod")
    protected RatePeriodSimpleType ratePeriod;
    @XmlAttribute(name = "GuaranteedInd")
    protected Boolean guaranteedInd;
    @XmlAttribute(name = "PromotionCode")
    protected String promotionCode;
    @XmlAttribute(name = "PromotionVendorCode")
    protected List<String> promotionVendorCode;

    /**
     * Gets the value of the promoDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoDesc() {
        return promoDesc;
    }

    /**
     * Sets the value of the promoDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoDesc(String value) {
        this.promoDesc = value;
    }

    /**
     * Gets the value of the rateComments property.
     * 
     * @return
     *     possible object is
     *     {@link RateQualifierType.RateComments }
     *     
     */
    public RateQualifierType.RateComments getRateComments() {
        return rateComments;
    }

    /**
     * Sets the value of the rateComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateQualifierType.RateComments }
     *     
     */
    public void setRateComments(RateQualifierType.RateComments value) {
        this.rateComments = value;
    }

    /**
     * Gets the value of the arriveByFlight property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isArriveByFlight() {
        return arriveByFlight;
    }

    /**
     * Sets the value of the arriveByFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArriveByFlight(Boolean value) {
        this.arriveByFlight = value;
    }

    /**
     * Gets the value of the rateAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateAuthorizationCode() {
        return rateAuthorizationCode;
    }

    /**
     * Sets the value of the rateAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateAuthorizationCode(String value) {
        this.rateAuthorizationCode = value;
    }

    /**
     * Gets the value of the vendorRateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorRateID() {
        return vendorRateID;
    }

    /**
     * Sets the value of the vendorRateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorRateID(String value) {
        this.vendorRateID = value;
    }

    /**
     * Gets the value of the travelPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelPurpose() {
        return travelPurpose;
    }

    /**
     * Sets the value of the travelPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelPurpose(String value) {
        this.travelPurpose = value;
    }

    /**
     * Gets the value of the rateCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCategory() {
        return rateCategory;
    }

    /**
     * Sets the value of the rateCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCategory(String value) {
        this.rateCategory = value;
    }

    /**
     * Gets the value of the corpDiscountNmbr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorpDiscountNmbr() {
        return corpDiscountNmbr;
    }

    /**
     * Sets the value of the corpDiscountNmbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorpDiscountNmbr(String value) {
        this.corpDiscountNmbr = value;
    }

    /**
     * Gets the value of the rateQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateQualifier() {
        return rateQualifier;
    }

    /**
     * Sets the value of the rateQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateQualifier(String value) {
        this.rateQualifier = value;
    }

    /**
     * Gets the value of the ratePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RatePeriodSimpleType }
     *     
     */
    public RatePeriodSimpleType getRatePeriod() {
        return ratePeriod;
    }

    /**
     * Sets the value of the ratePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RatePeriodSimpleType }
     *     
     */
    public void setRatePeriod(RatePeriodSimpleType value) {
        this.ratePeriod = value;
    }

    /**
     * Gets the value of the guaranteedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGuaranteedInd() {
        return guaranteedInd;
    }

    /**
     * Sets the value of the guaranteedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGuaranteedInd(Boolean value) {
        this.guaranteedInd = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the promotionVendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotionVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPromotionVendorCode() {
        if (promotionVendorCode == null) {
            promotionVendorCode = new ArrayList<String>();
        }
        return this.promotionVendorCode;
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
     *         &lt;element name="RateComment" maxOccurs="15"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;FormattedTextTextType"&gt;
     *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "rateComment"
    })
    public static class RateComments {

        @XmlElement(name = "RateComment", required = true)
        protected List<RateQualifierType.RateComments.RateComment> rateComment;

        /**
         * Gets the value of the rateComment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateComment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RateQualifierType.RateComments.RateComment }
         * 
         * 
         */
        public List<RateQualifierType.RateComments.RateComment> getRateComment() {
            if (rateComment == null) {
                rateComment = new ArrayList<RateQualifierType.RateComments.RateComment>();
            }
            return this.rateComment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05/OTA2010B&gt;FormattedTextTextType"&gt;
         *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to64" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RateComment
            extends FormattedTextTextType
        {

            @XmlAttribute(name = "Name")
            protected String name;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}
