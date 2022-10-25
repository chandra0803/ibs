
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Company identification
 * 
 * <p>Java class for CompanyIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="partnerCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="otherPartnerCode" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationType", propOrder = {
    "code",
    "partnerCode",
    "otherPartnerCode"
})
public class CompanyIdentificationType {

    @XmlElement(required = true)
    protected String code;
    protected String partnerCode;
    protected String otherPartnerCode;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the partnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerCode() {
        return partnerCode;
    }

    /**
     * Sets the value of the partnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerCode(String value) {
        this.partnerCode = value;
    }

    /**
     * Gets the value of the otherPartnerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPartnerCode() {
        return otherPartnerCode;
    }

    /**
     * Sets the value of the otherPartnerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPartnerCode(String value) {
        this.otherPartnerCode = value;
    }

}
