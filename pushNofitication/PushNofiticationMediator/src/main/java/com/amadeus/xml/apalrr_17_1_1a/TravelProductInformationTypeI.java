
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to a product.
 * 
 * <p>Java class for TravelProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelProductInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="flightDate" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductDateTimeTypeI"/>
 *         &lt;element name="boardPointDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}LocationTypeI_23542C"/>
 *         &lt;element name="offpointDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}LocationTypeI_23542C"/>
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CompanyIdentificationTypeI_23543C"/>
 *         &lt;element name="flightIdentification" type="{http://xml.amadeus.com/APALRR_17_1_1A}ProductIdentificationDetailsTypeI"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelProductInformationTypeI", propOrder = {
    "flightDate",
    "boardPointDetails",
    "offpointDetails",
    "companyDetails",
    "flightIdentification"
})
public class TravelProductInformationTypeI {

    @XmlElement(required = true)
    protected ProductDateTimeTypeI flightDate;
    @XmlElement(required = true)
    protected LocationTypeI23542C boardPointDetails;
    @XmlElement(required = true)
    protected LocationTypeI23542C offpointDetails;
    @XmlElement(required = true)
    protected CompanyIdentificationTypeI23543C companyDetails;
    @XmlElement(required = true)
    protected ProductIdentificationDetailsTypeI flightIdentification;

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
     *     {@link LocationTypeI23542C }
     *     
     */
    public LocationTypeI23542C getBoardPointDetails() {
        return boardPointDetails;
    }

    /**
     * Sets the value of the boardPointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI23542C }
     *     
     */
    public void setBoardPointDetails(LocationTypeI23542C value) {
        this.boardPointDetails = value;
    }

    /**
     * Gets the value of the offpointDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeI23542C }
     *     
     */
    public LocationTypeI23542C getOffpointDetails() {
        return offpointDetails;
    }

    /**
     * Sets the value of the offpointDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeI23542C }
     *     
     */
    public void setOffpointDetails(LocationTypeI23542C value) {
        this.offpointDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI23543C }
     *     
     */
    public CompanyIdentificationTypeI23543C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI23543C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI23543C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the flightIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public ProductIdentificationDetailsTypeI getFlightIdentification() {
        return flightIdentification;
    }

    /**
     * Sets the value of the flightIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationDetailsTypeI }
     *     
     */
    public void setFlightIdentification(ProductIdentificationDetailsTypeI value) {
        this.flightIdentification = value;
    }

}
