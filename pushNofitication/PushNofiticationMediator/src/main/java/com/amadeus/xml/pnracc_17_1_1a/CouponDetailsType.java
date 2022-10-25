
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CouponDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_145406S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponDetailsType", propOrder = {
    "productId"
})
public class CouponDetailsType {

    @XmlElement(required = true)
    protected ReferenceInfoType145406S productId;

    /**
     * Gets the value of the productId property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType145406S }
     *     
     */
    public ReferenceInfoType145406S getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType145406S }
     *     
     */
    public void setProductId(ReferenceInfoType145406S value) {
        this.productId = value;
    }

}
