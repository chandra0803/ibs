
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the fare basis and ticket designator codes.
 * 
 * <p>Java class for AdditionalFareQualifierDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalFareQualifierDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rateClass" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="commodityCategory" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To18" minOccurs="0"/&gt;
 *         &lt;element name="pricingGroup" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalFareQualifierDetailsType", propOrder = {
    "rateClass",
    "commodityCategory",
    "pricingGroup"
})
public class AdditionalFareQualifierDetailsType {

    protected String rateClass;
    protected String commodityCategory;
    protected String pricingGroup;

    /**
     * Gets the value of the rateClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateClass() {
        return rateClass;
    }

    /**
     * Sets the value of the rateClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateClass(String value) {
        this.rateClass = value;
    }

    /**
     * Gets the value of the commodityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityCategory() {
        return commodityCategory;
    }

    /**
     * Sets the value of the commodityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityCategory(String value) {
        this.commodityCategory = value;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingGroup() {
        return pricingGroup;
    }

    /**
     * Sets the value of the pricingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingGroup(String value) {
        this.pricingGroup = value;
    }

}
