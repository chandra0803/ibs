
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * SPECIAL REQUIREMENTS TYPE DETAILS
 * 
 * <p>Java class for SpecialRequirementsTypeDetailsType_285904C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsTypeDetailsType_285904C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ssrCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To4"/>
 *         &lt;element name="actionCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="serviceType" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="boardPoint" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="offPoint" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="serviceFreeText" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsTypeDetailsType_285904C", propOrder = {
    "ssrCode",
    "actionCode",
    "serviceType",
    "boardPoint",
    "offPoint",
    "serviceFreeText"
})
public class SpecialRequirementsTypeDetailsType285904C {

    @XmlElement(required = true)
    protected String ssrCode;
    protected String actionCode;
    protected String serviceType;
    protected String boardPoint;
    protected String offPoint;
    protected String serviceFreeText;

    /**
     * Gets the value of the ssrCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsrCode() {
        return ssrCode;
    }

    /**
     * Sets the value of the ssrCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsrCode(String value) {
        this.ssrCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionCode(String value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the serviceFreeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFreeText() {
        return serviceFreeText;
    }

    /**
     * Sets the value of the serviceFreeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFreeText(String value) {
        this.serviceFreeText = value;
    }

}
