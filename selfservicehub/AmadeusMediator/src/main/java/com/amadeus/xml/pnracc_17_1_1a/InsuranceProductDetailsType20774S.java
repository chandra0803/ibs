
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product Details
 * 
 * <p>Java class for InsuranceProductDetailsType_20774S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceProductDetailsType_20774S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="countryCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="productDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProviderInformationType" minOccurs="0"/&gt;
 *         &lt;element name="extensionIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProviderInformationType" maxOccurs="7" minOccurs="0"/&gt;
 *         &lt;element name="tariffCodeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffcodeType" maxOccurs="48" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceProductDetailsType_20774S", propOrder = {
    "companyCode",
    "countryCode",
    "productDetails",
    "extensionIdentification",
    "tariffCodeDetails"
})
public class InsuranceProductDetailsType20774S {

    protected String companyCode;
    protected String countryCode;
    protected ProviderInformationType productDetails;
    protected List<ProviderInformationType> extensionIdentification;
    protected List<TariffcodeType> tariffCodeDetails;

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the productDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderInformationType }
     *     
     */
    public ProviderInformationType getProductDetails() {
        return productDetails;
    }

    /**
     * Sets the value of the productDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderInformationType }
     *     
     */
    public void setProductDetails(ProviderInformationType value) {
        this.productDetails = value;
    }

    /**
     * Gets the value of the extensionIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderInformationType }
     * 
     * 
     */
    public List<ProviderInformationType> getExtensionIdentification() {
        if (extensionIdentification == null) {
            extensionIdentification = new ArrayList<ProviderInformationType>();
        }
        return this.extensionIdentification;
    }

    /**
     * Gets the value of the tariffCodeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffCodeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffCodeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffcodeType }
     * 
     * 
     */
    public List<TariffcodeType> getTariffCodeDetails() {
        if (tariffCodeDetails == null) {
            tariffCodeDetails = new ArrayList<TariffcodeType>();
        }
        return this.tariffCodeDetails;
    }

}
