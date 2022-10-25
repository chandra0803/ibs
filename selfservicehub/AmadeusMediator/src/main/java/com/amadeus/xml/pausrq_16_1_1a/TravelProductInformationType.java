
package com.amadeus.xml.pausrq_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}ProductDateTimeTypeI"/&gt;
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}LocationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}LocationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}CompanyIdentificationTypeI_285927C"/&gt;
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}ProductIdentificationDetailsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationType", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification"
})
public class TravelProductInformationType {

    @XmlElement(required = true)
    protected ProductDateTimeTypeI flightDate;
    protected LocationTypeI boardPointDetails;
    protected LocationTypeI offpointDetails;
    @XmlElement(required = true)
    protected CompanyIdentificationTypeI285927C companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsType flightIdentification;

    /**
     * Gets the value of the flightDate property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public ProductDateTimeTypeI getFlightDate() {
        return flightDate;
    }

    /**
     * Sets the value of the flightDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI }
     *     
     */
    public void setFlightDate(ProductDateTimeTypeI value) {
        this.flightDate = value;
    }

    /**
     * Gets the value of the boardPointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setBoardPointDetails(LocationTypeI value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI }
     *     
     */
    public LocationTypeI getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI }
     *     
     */
    public void setOffpointDetails(LocationTypeI value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI285927C }
     *     
     */
    public CompanyIdentificationTypeI285927C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI285927C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI285927C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsType }
     *     
     */
    public ProductIdentificationDetailsType getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsType }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsType value) {
        this.flightIdentification = value;
    }

}
