
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeTextDetailsType_142141C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextDetailsType_142141C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="textSubjectQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="informationType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4"/&gt;
 *         &lt;element name="source" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="encoding" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextDetailsType_142141C", propOrder = {
    "textSubjectQualifier",
    "informationType",
    "source",
    "encoding"
})
public class FreeTextDetailsType142141C {

    @XmlElement(required = true)
    protected String textSubjectQualifier;
    @XmlElement(required = true)
    protected String informationType;
    @XmlElement(required = true)
    protected String source;
    @XmlElement(required = true)
    protected String encoding;

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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEncoding(String value) {
        this.encoding = value;
    }

}
