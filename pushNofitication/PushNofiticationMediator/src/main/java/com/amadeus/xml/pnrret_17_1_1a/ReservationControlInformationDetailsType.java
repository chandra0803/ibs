
package com.amadeus.xml.pnrret_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the information required to identify a reservation.
 * 
 * <p>Java class for ReservationControlInformationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationControlInformationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="controlNumber" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaNumericString_Length1To20"/>
 *         &lt;element name="controlType" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AMA_EDICodesetType_Length1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationControlInformationDetailsType", propOrder = {
    "companyId",
    "controlNumber",
    "controlType"
})
public class ReservationControlInformationDetailsType {

    protected String companyId;
    @XmlElement(required = true)
    protected String controlNumber;
    protected String controlType;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the controlNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlNumber() {
        return controlNumber;
    }

    /**
     * Sets the value of the controlNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlNumber(String value) {
        this.controlNumber = value;
    }

    /**
     * Gets the value of the controlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlType() {
        return controlType;
    }

    /**
     * Sets the value of the controlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlType(String value) {
        this.controlType = value;
    }

}
