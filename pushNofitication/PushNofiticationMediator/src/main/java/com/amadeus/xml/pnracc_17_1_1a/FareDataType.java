
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describe fare data
 * 
 * <p>Java class for FareDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issueIdentifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="monetaryInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationDetailsTypeI_8308C" maxOccurs="3"/>
 *         &lt;element name="taxFields" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxFieldsType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareDataType", propOrder = {
    "issueIdentifier",
    "monetaryInfo",
    "taxFields"
})
public class FareDataType {

    @XmlElement(required = true)
    protected String issueIdentifier;
    @XmlElement(required = true)
    protected List<MonetaryInformationDetailsTypeI8308C> monetaryInfo;
    protected List<TaxFieldsType> taxFields;

    /**
     * Gets the value of the issueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueIdentifier() {
        return issueIdentifier;
    }

    /**
     * Sets the value of the issueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueIdentifier(String value) {
        this.issueIdentifier = value;
    }

    /**
     * Gets the value of the monetaryInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationDetailsTypeI8308C }
     * 
     * 
     */
    public List<MonetaryInformationDetailsTypeI8308C> getMonetaryInfo() {
        if (monetaryInfo == null) {
            monetaryInfo = new ArrayList<MonetaryInformationDetailsTypeI8308C>();
        }
        return this.monetaryInfo;
    }

    /**
     * Gets the value of the taxFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxFieldsType }
     * 
     * 
     */
    public List<TaxFieldsType> getTaxFields() {
        if (taxFields == null) {
            taxFields = new ArrayList<TaxFieldsType>();
        }
        return this.taxFields;
    }

}
