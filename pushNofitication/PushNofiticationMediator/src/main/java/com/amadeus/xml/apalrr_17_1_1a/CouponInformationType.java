
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify data specific to a value (flight or EMD) coupon.
 * 
 * <p>Java class for CouponInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="couponDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CouponInformationDetailsType"/>
 *         &lt;element name="otherCouponDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CouponInformationDetailsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationType", propOrder = {
    "couponDetails",
    "otherCouponDetails"
})
public class CouponInformationType {

    @XmlElement(required = true)
    protected CouponInformationDetailsType couponDetails;
    protected CouponInformationDetailsType otherCouponDetails;

    /**
     * Gets the value of the couponDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationDetailsType }
     *     
     */
    public CouponInformationDetailsType getCouponDetails() {
        return couponDetails;
    }

    /**
     * Sets the value of the couponDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationDetailsType }
     *     
     */
    public void setCouponDetails(CouponInformationDetailsType value) {
        this.couponDetails = value;
    }

    /**
     * Gets the value of the otherCouponDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationDetailsType }
     *     
     */
    public CouponInformationDetailsType getOtherCouponDetails() {
        return otherCouponDetails;
    }

    /**
     * Sets the value of the otherCouponDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationDetailsType }
     *     
     */
    public void setOtherCouponDetails(CouponInformationDetailsType value) {
        this.otherCouponDetails = value;
    }

}
