
package com.amadeus.xml.pausrr_16_1_1a;

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
 *         &lt;element name="mdCarrier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To3"/&gt;
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
    "mdCarrier"
})
public class CompanyIdentificationTypeI {

    @XmlElement(required = true)
    protected String mdCarrier;

    /**
     * Gets the value of the mdCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMdCarrier() {
        return mdCarrier;
    }

    /**
     * Sets the value of the mdCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMdCarrier(String value) {
        this.mdCarrier = value;
    }

}
