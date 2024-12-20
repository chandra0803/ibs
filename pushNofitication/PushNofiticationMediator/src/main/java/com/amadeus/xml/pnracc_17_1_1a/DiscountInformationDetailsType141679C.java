
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the reason for, amount, the company granting, and a number related to the reason for a discount.
 * 
 * <p>Java class for DiscountInformationDetailsType_141679C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountInformationDetailsType_141679C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To6"/>
 *         &lt;element name="percentage" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To8" minOccurs="0"/>
 *         &lt;element name="beneficiary" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/>
 *         &lt;element name="unitQuantity" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To15" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountInformationDetailsType_141679C", propOrder = {
    "discountCode",
    "percentage",
    "beneficiary",
    "unitQuantity"
})
public class DiscountInformationDetailsType141679C {

    @XmlElement(required = true)
    protected String discountCode;
    protected BigInteger percentage;
    protected String beneficiary;
    protected BigInteger unitQuantity;

    /**
     * Gets the value of the discountCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountCode() {
        return discountCode;
    }

    /**
     * Sets the value of the discountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountCode(String value) {
        this.discountCode = value;
    }

    /**
     * Gets the value of the percentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPercentage(BigInteger value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiary(String value) {
        this.beneficiary = value;
    }

    /**
     * Gets the value of the unitQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUnitQuantity() {
        return unitQuantity;
    }

    /**
     * Sets the value of the unitQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUnitQuantity(BigInteger value) {
        this.unitQuantity = value;
    }

}
