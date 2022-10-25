
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free text information.
 * 
 * <p>Java class for InteractiveFreeTextTypeI_160341S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeTextTypeI_160341S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freeTextQualification" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextQualificationTypeI_227761C"/>
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeTextTypeI_160341S", propOrder = {
    "freeTextQualification",
    "freeText"
})
public class InteractiveFreeTextTypeI160341S {

    @XmlElement(required = true)
    protected FreeTextQualificationTypeI227761C freeTextQualification;
    @XmlElement(required = true)
    protected String freeText;

    /**
     * Gets the value of the freeTextQualification property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationTypeI227761C }
     *     
     */
    public FreeTextQualificationTypeI227761C getFreeTextQualification() {
        return freeTextQualification;
    }

    /**
     * Sets the value of the freeTextQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationTypeI227761C }
     *     
     */
    public void setFreeTextQualification(FreeTextQualificationTypeI227761C value) {
        this.freeTextQualification = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

}
