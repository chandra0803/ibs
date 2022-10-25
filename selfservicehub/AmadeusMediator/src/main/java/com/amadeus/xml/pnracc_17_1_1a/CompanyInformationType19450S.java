
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the company information
 * 
 * <p>Java class for CompanyInformationType_19450S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInformationType_19450S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To3"/&gt;
 *         &lt;element name="companyNumericCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length2To4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInformationType_19450S", propOrder = {
    "companyCode",
    "companyNumericCode"
})
public class CompanyInformationType19450S {

    @XmlElement(required = true)
    protected String companyCode;
    protected BigInteger companyNumericCode;

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
     * Gets the value of the companyNumericCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompanyNumericCode() {
        return companyNumericCode;
    }

    /**
     * Sets the value of the companyNumericCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompanyNumericCode(BigInteger value) {
        this.companyNumericCode = value;
    }

}
