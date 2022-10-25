
package com.amadeus.xml.pausrq_16_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Code or name to identify a company and any associated companies.
 * 
 * <p>Java class for CompanyIdentificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="otherCompany" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}NumericInteger_Length3To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTypeI", propOrder = {
    "otherCompany"
})
public class CompanyIdentificationTypeI {

    @XmlElement(required = true)
    protected BigInteger otherCompany;

    /**
     * Gets the value of the otherCompany property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOtherCompany() {
        return otherCompany;
    }

    /**
     * Sets the value of the otherCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOtherCompany(BigInteger value) {
        this.otherCompany = value;
    }

}
