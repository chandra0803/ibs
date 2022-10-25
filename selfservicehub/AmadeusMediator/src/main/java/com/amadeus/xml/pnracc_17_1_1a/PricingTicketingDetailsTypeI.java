
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey pricing and date information related to a ticket.
 * 
 * <p>Java class for PricingTicketingDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priceTicketDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingTicketingInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="priceTariffType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingDetailsTypeI", propOrder = {
    "priceTicketDetails",
    "priceTariffType"
})
public class PricingTicketingDetailsTypeI {

    protected PricingTicketingInformationTypeI priceTicketDetails;
    @XmlElement(required = true)
    protected String priceTariffType;

    /**
     * Gets the value of the priceTicketDetails property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingInformationTypeI }
     *     
     */
    public PricingTicketingInformationTypeI getPriceTicketDetails() {
        return priceTicketDetails;
    }

    /**
     * Sets the value of the priceTicketDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingInformationTypeI }
     *     
     */
    public void setPriceTicketDetails(PricingTicketingInformationTypeI value) {
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

}
