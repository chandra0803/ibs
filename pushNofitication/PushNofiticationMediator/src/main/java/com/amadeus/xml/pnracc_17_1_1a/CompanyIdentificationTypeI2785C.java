
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompanyIdentificationTypeI_2785C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyIdentificationTypeI_2785C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="secondIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="sourceCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyIdentificationTypeI_2785C", propOrder = {
    "identification",
    "secondIdentification",
    "sourceCode"
})
public class CompanyIdentificationTypeI2785C {

    @XmlElement(required = true)
    protected String identification;
    protected String secondIdentification;
    protected String sourceCode;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentification(String value) {
        this.identification = value;
    }

    /**
     * Gets the value of the secondIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondIdentification() {
        return secondIdentification;
    }

    /**
     * Sets the value of the secondIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondIdentification(String value) {
        this.secondIdentification = value;
    }

    /**
     * Gets the value of the sourceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCode() {
        return sourceCode;
    }

    /**
     * Sets the value of the sourceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCode(String value) {
        this.sourceCode = value;
    }

}
