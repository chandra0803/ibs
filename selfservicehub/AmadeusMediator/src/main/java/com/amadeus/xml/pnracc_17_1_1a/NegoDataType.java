
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Map TST Nego information
 * 
 * <p>Java class for NegoDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NegoDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="schemeIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingTicketingDetailsTypeI_79032S"/&gt;
 *         &lt;element name="negoSellingFare" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S"/&gt;
 *         &lt;element name="negoOtherFares" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="commissionInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CommissionInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="tourInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TourInformationTypeI_79029S" minOccurs="0"/&gt;
 *         &lt;element name="negoReferences" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_79033S" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegoDataType", propOrder = {
    "schemeIndicator",
    "negoSellingFare",
    "negoOtherFares",
    "commissionInformation",
    "tourInformation",
    "negoReferences"
})
public class NegoDataType {

    @XmlElement(required = true)
    protected PricingTicketingDetailsTypeI79032S schemeIndicator;
    @XmlElement(required = true)
    protected MonetaryInformationTypeI79012S negoSellingFare;
    protected List<MonetaryInformationTypeI79012S> negoOtherFares;
    protected CommissionInformationTypeI commissionInformation;
    protected TourInformationTypeI79029S tourInformation;
    protected List<ReferenceInformationTypeI79033S> negoReferences;

    /**
     * Gets the value of the schemeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTicketingDetailsTypeI79032S }
     *     
     */
    public PricingTicketingDetailsTypeI79032S getSchemeIndicator() {
        return schemeIndicator;
    }

    /**
     * Sets the value of the schemeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTicketingDetailsTypeI79032S }
     *     
     */
    public void setSchemeIndicator(PricingTicketingDetailsTypeI79032S value) {
        this.schemeIndicator = value;
    }

    /**
     * Gets the value of the negoSellingFare property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI79012S }
     *     
     */
    public MonetaryInformationTypeI79012S getNegoSellingFare() {
        return negoSellingFare;
    }

    /**
     * Sets the value of the negoSellingFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI79012S }
     *     
     */
    public void setNegoSellingFare(MonetaryInformationTypeI79012S value) {
        this.negoSellingFare = value;
    }

    /**
     * Gets the value of the negoOtherFares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negoOtherFares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegoOtherFares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationTypeI79012S }
     * 
     * 
     */
    public List<MonetaryInformationTypeI79012S> getNegoOtherFares() {
        if (negoOtherFares == null) {
            negoOtherFares = new ArrayList<MonetaryInformationTypeI79012S>();
        }
        return this.negoOtherFares;
    }

    /**
     * Gets the value of the commissionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionInformationTypeI }
     *     
     */
    public CommissionInformationTypeI getCommissionInformation() {
        return commissionInformation;
    }

    /**
     * Sets the value of the commissionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionInformationTypeI }
     *     
     */
    public void setCommissionInformation(CommissionInformationTypeI value) {
        this.commissionInformation = value;
    }

    /**
     * Gets the value of the tourInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TourInformationTypeI79029S }
     *     
     */
    public TourInformationTypeI79029S getTourInformation() {
        return tourInformation;
    }

    /**
     * Sets the value of the tourInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TourInformationTypeI79029S }
     *     
     */
    public void setTourInformation(TourInformationTypeI79029S value) {
        this.tourInformation = value;
    }

    /**
     * Gets the value of the negoReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the negoReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNegoReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationTypeI79033S }
     * 
     * 
     */
    public List<ReferenceInformationTypeI79033S> getNegoReferences() {
        if (negoReferences == null) {
            negoReferences = new ArrayList<ReferenceInformationTypeI79033S>();
        }
        return this.negoReferences;
    }

}
