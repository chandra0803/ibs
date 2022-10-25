
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler verification.
 * 
 * <p>Java class for FrequentTravellerVerificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerVerificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="actionRequest" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="company" type="{http://xml.amadeus.com/PNRADD_17_1_1A}CompanyIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="account" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ProductAccountDetailsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerVerificationType", propOrder = {
    "actionRequest",
    "company",
    "account"
})
public class FrequentTravellerVerificationType {

    @XmlElement(required = true)
    protected String actionRequest;
    protected CompanyIdentificationType company;
    @XmlElement(required = true)
    protected ProductAccountDetailsType account;

    /**
     * Gets the value of the actionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequest() {
        return actionRequest;
    }

    /**
     * Sets the value of the actionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequest(String value) {
        this.actionRequest = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public CompanyIdentificationType getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyIdentificationType }
     *     
     */
    public void setCompany(CompanyIdentificationType value) {
        this.company = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAccountDetailsType }
     *     
     */
    public ProductAccountDetailsType getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAccountDetailsType }
     *     
     */
    public void setAccount(ProductAccountDetailsType value) {
        this.account = value;
    }

}
