
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code or name to identify a company and any associated companies.
 * 
 * <p>Java class for CompanyIdentificationTypeI_83773C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTypeI_83773C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pricingSystemCode" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTypeI_83773C", propOrder = {
    "pricingSystemCode"
})
public class CompanyIdentificationTypeI83773C {

    protected String pricingSystemCode;

    /**
     * Gets the value of the pricingSystemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingSystemCode() {
        return pricingSystemCode;
    }

    /**
     * Sets the value of the pricingSystemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingSystemCode(String value) {
        this.pricingSystemCode = value;
    }

}
