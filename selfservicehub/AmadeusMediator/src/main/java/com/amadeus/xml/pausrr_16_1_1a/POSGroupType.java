
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to convey the pnr point of sell
 * 
 * <p>Java class for POSGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="POSGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pointOfSaleInformationType" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}PointOfSaleInformationType"/&gt;
 *         &lt;element name="sbrUserIdentification" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}UserIdentificationType_85800S"/&gt;
 *         &lt;element name="sbrSystemDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}SystemDetailsInfoType" minOccurs="0"/&gt;
 *         &lt;element name="sbrPreferences" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}UserPreferencesType" minOccurs="0"/&gt;
 *         &lt;element name="agentId" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TicketAgentInfoType" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleDate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}StructuredDateTimeInformationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POSGroupType", propOrder = {
    "pointOfSaleInformationType",
    "sbrUserIdentification",
    "sbrSystemDetails",
    "sbrPreferences",
    "agentId",
    "pointOfSaleDate"
})
public class POSGroupType {

    @XmlElement(required = true)
    protected PointOfSaleInformationType pointOfSaleInformationType;
    @XmlElement(required = true)
    protected UserIdentificationType85800S sbrUserIdentification;
    protected SystemDetailsInfoType sbrSystemDetails;
    protected UserPreferencesType sbrPreferences;
    protected TicketAgentInfoType agentId;
    protected StructuredDateTimeInformationType pointOfSaleDate;

    /**
     * Gets the value of the pointOfSaleInformationType property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleInformationType }
     *     
     */
    public PointOfSaleInformationType getPointOfSaleInformationType() {
        return pointOfSaleInformationType;
    }

    /**
     * Sets the value of the pointOfSaleInformationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleInformationType }
     *     
     */
    public void setPointOfSaleInformationType(PointOfSaleInformationType value) {
        this.pointOfSaleInformationType = value;
    }

    /**
     * Gets the value of the sbrUserIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link UserIdentificationType85800S }
     *     
     */
    public UserIdentificationType85800S getSbrUserIdentification() {
        return sbrUserIdentification;
    }

    /**
     * Sets the value of the sbrUserIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserIdentificationType85800S }
     *     
     */
    public void setSbrUserIdentification(UserIdentificationType85800S value) {
        this.sbrUserIdentification = value;
    }

    /**
     * Gets the value of the sbrSystemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public SystemDetailsInfoType getSbrSystemDetails() {
        return sbrSystemDetails;
    }

    /**
     * Sets the value of the sbrSystemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemDetailsInfoType }
     *     
     */
    public void setSbrSystemDetails(SystemDetailsInfoType value) {
        this.sbrSystemDetails = value;
    }

    /**
     * Gets the value of the sbrPreferences property.
     * 
     * @return
     *     possible object is
     *     {@link UserPreferencesType }
     *     
     */
    public UserPreferencesType getSbrPreferences() {
        return sbrPreferences;
    }

    /**
     * Sets the value of the sbrPreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserPreferencesType }
     *     
     */
    public void setSbrPreferences(UserPreferencesType value) {
        this.sbrPreferences = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link TicketAgentInfoType }
     *     
     */
    public TicketAgentInfoType getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAgentInfoType }
     *     
     */
    public void setAgentId(TicketAgentInfoType value) {
        this.agentId = value;
    }

    /**
     * Gets the value of the pointOfSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public StructuredDateTimeInformationType getPointOfSaleDate() {
        return pointOfSaleDate;
    }

    /**
     * Sets the value of the pointOfSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link StructuredDateTimeInformationType }
     *     
     */
    public void setPointOfSaleDate(StructuredDateTimeInformationType value) {
        this.pointOfSaleDate = value;
    }

}
