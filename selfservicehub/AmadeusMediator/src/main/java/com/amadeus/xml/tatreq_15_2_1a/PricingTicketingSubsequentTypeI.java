
package com.amadeus.xml.tatreq_15_2_1a;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey additional information related to a ticket.
 * 
 * <p>Java class for PricingTicketingSubsequentTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingTicketingSubsequentTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="fareBasisDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}RateTariffClassInformationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="fareValue" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericDecimal_Length1To18" minOccurs="0"/&gt;
 *         &lt;element name="priceType" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="specialCondition" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="otherSpecialCondition" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="additionalSpecialCondition" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="taxCategory" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingTicketingSubsequentTypeI", propOrder = {
    "itemNumber",
    "fareBasisDetails",
    "fareValue",
    "priceType",
    "specialCondition",
    "otherSpecialCondition",
    "additionalSpecialCondition",
    "taxCategory"
})
public class PricingTicketingSubsequentTypeI {

    protected String itemNumber;
    protected RateTariffClassInformationTypeI fareBasisDetails;
    protected BigDecimal fareValue;
    protected String priceType;
    protected String specialCondition;
    protected String otherSpecialCondition;
    protected String additionalSpecialCondition;
    protected List<String> taxCategory;

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the fareBasisDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RateTariffClassInformationTypeI }
     *     
     */
    public RateTariffClassInformationTypeI getFareBasisDetails() {
        return fareBasisDetails;
    }

    /**
     * Sets the value of the fareBasisDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateTariffClassInformationTypeI }
     *     
     */
    public void setFareBasisDetails(RateTariffClassInformationTypeI value) {
        this.fareBasisDetails = value;
    }

    /**
     * Gets the value of the fareValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFareValue() {
        return fareValue;
    }

    /**
     * Sets the value of the fareValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFareValue(BigDecimal value) {
        this.fareValue = value;
    }

    /**
     * Gets the value of the priceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * Sets the value of the priceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

    /**
     * Gets the value of the specialCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialCondition() {
        return specialCondition;
    }

    /**
     * Sets the value of the specialCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialCondition(String value) {
        this.specialCondition = value;
    }

    /**
     * Gets the value of the otherSpecialCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherSpecialCondition() {
        return otherSpecialCondition;
    }

    /**
     * Sets the value of the otherSpecialCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherSpecialCondition(String value) {
        this.otherSpecialCondition = value;
    }

    /**
     * Gets the value of the additionalSpecialCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalSpecialCondition() {
        return additionalSpecialCondition;
    }

    /**
     * Sets the value of the additionalSpecialCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalSpecialCondition(String value) {
        this.additionalSpecialCondition = value;
    }

    /**
     * Gets the value of the taxCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxCategory() {
        if (taxCategory == null) {
            taxCategory = new ArrayList<String>();
        }
        return this.taxCategory;
    }

}
