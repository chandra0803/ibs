
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the type, purpose, and language of free text and whether any action is required.
 * 
 * <p>Java class for FreeTextQualificationTypeI_148295C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextQualificationTypeI_148295C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textSubjectQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="informationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="language" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextQualificationTypeI_148295C", propOrder = {
    "textSubjectQualifier",
    "informationType",
    "language"
})
public class FreeTextQualificationTypeI148295C {

    @XmlElement(required = true)
    protected String textSubjectQualifier;
    protected String informationType;
    protected String language;

    /**
     * Gets the value of the textSubjectQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextSubjectQualifier() {
        return textSubjectQualifier;
    }

    /**
     * Sets the value of the textSubjectQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextSubjectQualifier(String value) {
        this.textSubjectQualifier = value;
    }

    /**
     * Gets the value of the informationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformationType() {
        return informationType;
    }

    /**
     * Sets the value of the informationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformationType(String value) {
        this.informationType = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
