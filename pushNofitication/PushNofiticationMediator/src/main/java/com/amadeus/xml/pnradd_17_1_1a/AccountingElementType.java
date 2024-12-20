
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ACCOUNTING ELEMENT
 * 
 * <p>Java class for AccountingElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="number" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To10" minOccurs="0"/>
 *         &lt;element name="costNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To60" minOccurs="0"/>
 *         &lt;element name="companyNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To12" minOccurs="0"/>
 *         &lt;element name="clientReference" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To60" minOccurs="0"/>
 *         &lt;element name="gSTTaxDetails" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To109" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingElementType", propOrder = {
    "number",
    "costNumber",
    "companyNumber",
    "clientReference",
    "gstTaxDetails"
})
public class AccountingElementType {

    protected String number;
    protected String costNumber;
    protected String companyNumber;
    protected String clientReference;
    @XmlElement(name = "gSTTaxDetails")
    protected String gstTaxDetails;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the costNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostNumber() {
        return costNumber;
    }

    /**
     * Sets the value of the costNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostNumber(String value) {
        this.costNumber = value;
    }

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the clientReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientReference() {
        return clientReference;
    }

    /**
     * Sets the value of the clientReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientReference(String value) {
        this.clientReference = value;
    }

    /**
     * Gets the value of the gstTaxDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGSTTaxDetails() {
        return gstTaxDetails;
    }

    /**
     * Sets the value of the gstTaxDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGSTTaxDetails(String value) {
        this.gstTaxDetails = value;
    }

}
