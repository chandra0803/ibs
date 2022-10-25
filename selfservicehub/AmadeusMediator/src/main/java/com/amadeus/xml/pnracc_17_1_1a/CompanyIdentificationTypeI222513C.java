
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Code or name to identify a company and any associated companies.
 * 
 * <p>Java class for CompanyIdentificationTypeI_222513C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTypeI_222513C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="otherCompany" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTypeI_222513C", propOrder = {
    "otherCompany"
})
public class CompanyIdentificationTypeI222513C {

    protected String otherCompany;

    /**
     * Gets the value of the otherCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherCompany() {
        return otherCompany;
    }

    /**
     * Sets the value of the otherCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherCompany(String value) {
        this.otherCompany = value;
    }

}
