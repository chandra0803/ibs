
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType_25889S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType_25889S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ProductDateTimeTypeI_47017C" minOccurs="0"/&gt;
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}LocationTypeI_47019C" minOccurs="0"/&gt;
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}LocationTypeI_47019C" minOccurs="0"/&gt;
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}CompanyIdentificationTypeI_47014C"/&gt;
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ProductIdentificationDetailsTypeI_47015C"/&gt;
 *         &lt;element name="flightTypeDetails" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}ProductTypeDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType_25889S", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification",
    "flightTypeDetails"
})
public class TravelProductInformationType25889S {

    protected ProductDateTimeTypeI47017C flightDate;
    protected LocationTypeI47019C boardPointDetails;
    protected LocationTypeI47019C offpointDetails;
    @XmlElement(required = true)
    protected CompanyIdentificationTypeI47014C companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsTypeI47015C flightIdentification;
    protected ProductTypeDetailsTypeI flightTypeDetails;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI47017C }
     *     
     */
    public ProductDateTimeTypeI47017C getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI47017C }
     *     
     */
    public void setFlightDate(ProductDateTimeTypeI47017C value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI47019C }
     *     
     */
    public LocationTypeI47019C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI47019C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI47019C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI47019C }
     *     
     */
    public LocationTypeI47019C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI47019C }
     *     
     */
    public void setOffpointDetails(LocationTypeI47019C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI47014C }
     *     
     */
    public CompanyIdentificationTypeI47014C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI47014C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI47014C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI47015C }
     *     
     */
    public ProductIdentificationDetailsTypeI47015C getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI47015C }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsTypeI47015C value) {
        this.flightIdentification = value;
    }

    /**
     * Gets the value of the flightTypeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public ProductTypeDetailsTypeI getFlightTypeDetails() {
        return flightTypeDetails;
    }

    /**
     * Sets the value of the flightTypeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeDetailsTypeI }
     *     
     */
    public void setFlightTypeDetails(ProductTypeDetailsTypeI value) {
        this.flightTypeDetails = value;
    }

}
