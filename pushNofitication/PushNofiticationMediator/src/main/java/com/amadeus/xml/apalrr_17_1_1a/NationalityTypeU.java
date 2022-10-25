
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a nationality.
 * 
 * <p>Java class for NationalityTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalityTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeQualifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="nationalityDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}NationalityDetailsTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalityTypeU", propOrder = {
    "codeQualifier",
    "nationalityDetails"
})
public class NationalityTypeU {

    @XmlElement(required = true)
    protected String codeQualifier;
    protected NationalityDetailsTypeU nationalityDetails;

    /**
     * Gets the value of the codeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeQualifier() {
        return codeQualifier;
    }

    /**
     * Sets the value of the codeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeQualifier(String value) {
        this.codeQualifier = value;
    }

    /**
     * Gets the value of the nationalityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link NationalityDetailsTypeU }
     *     
     */
    public NationalityDetailsTypeU getNationalityDetails() {
        return nationalityDetails;
    }

    /**
     * Sets the value of the nationalityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalityDetailsTypeU }
     *     
     */
    public void setNationalityDetails(NationalityDetailsTypeU value) {
        this.nationalityDetails = value;
    }

}
