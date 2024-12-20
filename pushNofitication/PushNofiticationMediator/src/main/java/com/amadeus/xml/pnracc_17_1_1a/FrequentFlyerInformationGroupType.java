
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Content of SSR FQT elements
 * 
 * <p>Java class for FrequentFlyerInformationGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentFlyerInformationGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frequentTravellerInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationCodeType_74327S"/>
 *         &lt;element name="discountInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DiscountInformationType" minOccurs="0"/>
 *         &lt;element name="bookingClassInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentFlyerInformationGroupType", propOrder = {
    "frequentTravellerInfo",
    "discountInformation",
    "bookingClassInformation"
})
public class FrequentFlyerInformationGroupType {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationCodeType74327S frequentTravellerInfo;
    protected DiscountInformationType discountInformation;
    protected ProductInformationType bookingClassInformation;

    /**
     * Gets the value of the frequentTravellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationCodeType74327S }
     *     
     */
    public FrequentTravellerIdentificationCodeType74327S getFrequentTravellerInfo() {
        return frequentTravellerInfo;
    }

    /**
     * Sets the value of the frequentTravellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationCodeType74327S }
     *     
     */
    public void setFrequentTravellerInfo(FrequentTravellerIdentificationCodeType74327S value) {
        this.frequentTravellerInfo = value;
    }

    /**
     * Gets the value of the discountInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountInformationType }
     *     
     */
    public DiscountInformationType getDiscountInformation() {
        return discountInformation;
    }

    /**
     * Sets the value of the discountInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountInformationType }
     *     
     */
    public void setDiscountInformation(DiscountInformationType value) {
        this.discountInformation = value;
    }

    /**
     * Gets the value of the bookingClassInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType }
     *     
     */
    public ProductInformationType getBookingClassInformation() {
        return bookingClassInformation;
    }

    /**
     * Sets the value of the bookingClassInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType }
     *     
     */
    public void setBookingClassInformation(ProductInformationType value) {
        this.bookingClassInformation = value;
    }

}
