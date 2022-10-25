
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Record Locator Security Information for RR, SP elements and PNR Header or RP line
 * 
 * <p>Java class for ReservationSecurityInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationSecurityInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="responsibilityInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ResponsibilityInformationType_6835C" minOccurs="0"/&gt;
 *         &lt;element name="queueingInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketInformationType_5120C" minOccurs="0"/&gt;
 *         &lt;element name="cityCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="secondRpInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SecondRpLineInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationSecurityInformationType", propOrder = {
    "responsibilityInformation",
    "queueingInformation",
    "cityCode",
    "secondRpInformation"
})
public class ReservationSecurityInformationType {

    protected ResponsibilityInformationType6835C responsibilityInformation;
    protected TicketInformationType5120C queueingInformation;
    protected String cityCode;
    protected SecondRpLineInformationType secondRpInformation;

    /**
     * Gets the value of the responsibilityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsibilityInformationType6835C }
     *     
     */
    public ResponsibilityInformationType6835C getResponsibilityInformation() {
        return responsibilityInformation;
    }

    /**
     * Sets the value of the responsibilityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsibilityInformationType6835C }
     *     
     */
    public void setResponsibilityInformation(ResponsibilityInformationType6835C value) {
        this.responsibilityInformation = value;
    }

    /**
     * Gets the value of the queueingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TicketInformationType5120C }
     *     
     */
    public TicketInformationType5120C getQueueingInformation() {
        return queueingInformation;
    }

    /**
     * Sets the value of the queueingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketInformationType5120C }
     *     
     */
    public void setQueueingInformation(TicketInformationType5120C value) {
        this.queueingInformation = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the secondRpInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SecondRpLineInformationType }
     *     
     */
    public SecondRpLineInformationType getSecondRpInformation() {
        return secondRpInformation;
    }

    /**
     * Sets the value of the secondRpInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondRpLineInformationType }
     *     
     */
    public void setSecondRpInformation(SecondRpLineInformationType value) {
        this.secondRpInformation = value;
    }

}
