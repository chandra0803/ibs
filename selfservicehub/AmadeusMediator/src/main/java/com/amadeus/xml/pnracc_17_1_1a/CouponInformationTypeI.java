
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify data specific to a value (flight) coupon.
 * 
 * <p>Java class for CouponInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="couponDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CouponInformationDetailsTypeI"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationTypeI", propOrder = {
    "couponDetails"
})
public class CouponInformationTypeI {

    @XmlElement(required = true)
    protected CouponInformationDetailsTypeI couponDetails;

    /**
     * Gets the value of the couponDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInformationDetailsTypeI }
     *     
     */
    public CouponInformationDetailsTypeI getCouponDetails() {
        return couponDetails;
    }

    /**
     * Sets the value of the couponDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInformationDetailsTypeI }
     *     
     */
    public void setCouponDetails(CouponInformationDetailsTypeI value) {
        this.couponDetails = value;
    }

}
