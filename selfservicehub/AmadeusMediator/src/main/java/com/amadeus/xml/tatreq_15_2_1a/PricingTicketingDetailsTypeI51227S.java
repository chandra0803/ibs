
package com.amadeus.xml.tatreq_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsTypeI_51227S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsTypeI_51227S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceTicketDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}PricingTicketingInformationTypeI_83775C" minOccurs="0"/&gt;
 *         &lt;element name="priceTariffType" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="productDateTimeDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}ProductDateTimeTypeI_83774C" minOccurs="0"/&gt;
 *         &lt;element name="companyDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}CompanyIdentificationTypeI_83773C" minOccurs="0"/&gt;
 *         &lt;element name="locationDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}LocationDetailsTypeI_83777C" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="idNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsTypeI_51227S", propOrder = {
    "priceTicketDetails",
    "priceTariffType",
    "productDateTimeDetails",
    "companyDetails",
    "locationDetails",
    "idNumber"
})
public class PricingTicketingDetailsTypeI51227S {

    protected PricingTicketingInformationTypeI83775C priceTicketDetails;
    protected String priceTariffType;
    protected ProductDateTimeTypeI83774C productDateTimeDetails;
    protected CompanyIdentificationTypeI83773C companyDetails;
    protected List<LocationDetailsTypeI83777C> locationDetails;
    protected String idNumber;

    /**
     * Gets the value of the priceTicketDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationTypeI83775C }
     *     
     */
    public PricingTicketingInformationTypeI83775C getPriceTicketDetails() {
        return priceTicketDetails;
    }

    /**
     * Sets the value of the priceTicketDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationTypeI83775C }
     *     
     */
    public void setPriceTicketDetails(PricingTicketingInformationTypeI83775C value) {
        this.priceTicketDetails = value;
    }

    /**
     * Gets the value of the priceTariffType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceTariffType() {
        return priceTariffType;
    }

    /**
     * Sets the value of the priceTariffType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceTariffType(String value) {
        this.priceTariffType = value;
    }

    /**
     * Gets the value of the productDateTimeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDateTimeTypeI83774C }
     *     
     */
    public ProductDateTimeTypeI83774C getProductDateTimeDetails() {
        return productDateTimeDetails;
    }

    /**
     * Sets the value of the productDateTimeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDateTimeTypeI83774C }
     *     
     */
    public void setProductDateTimeDetails(ProductDateTimeTypeI83774C value) {
        this.productDateTimeDetails = value;
    }

    /**
     * Gets the value of the companyDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationTypeI83773C }
     *     
     */
    public CompanyIdentificationTypeI83773C getCompanyDetails() {
        return companyDetails;
    }

    /**
     * Sets the value of the companyDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationTypeI83773C }
     *     
     */
    public void setCompanyDetails(CompanyIdentificationTypeI83773C value) {
        this.companyDetails = value;
    }

    /**
     * Gets the value of the locationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationDetailsTypeI83777C }
     * 
     * 
     */
    public List<LocationDetailsTypeI83777C> getLocationDetails() {
        if (locationDetails == null) {
            locationDetails = new ArrayList<LocationDetailsTypeI83777C>();
        }
        return this.locationDetails;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdNumber(String value) {
        this.idNumber = value;
    }

}
