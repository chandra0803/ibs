
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the coupon number, status, value, and other related information.
 * 
 * <p>Java class for CouponInformationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInformationDetailsTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cpnNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInformationDetailsTypeI", propOrder = {
    "cpnNumber"
})
public class CouponInformationDetailsTypeI {

    @XmlElement(required = true)
    protected String cpnNumber;

    /**
     * Gets the value of the cpnNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpnNumber() {
        return cpnNumber;
    }

    /**
     * Sets the value of the cpnNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpnNumber(String value) {
        this.cpnNumber = value;
    }

}
