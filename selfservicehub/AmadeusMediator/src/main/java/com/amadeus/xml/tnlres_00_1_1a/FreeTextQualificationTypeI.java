
package com.amadeus.xml.tnlres_00_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreeTextQualificationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextQualificationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subjectQualifier" type="{http://xml.amadeus.com/TNLRES_00_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/TNLRES_00_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextQualificationTypeI", propOrder = {
    "subjectQualifier",
    "type"
})
public class FreeTextQualificationTypeI {

    @XmlElement(required = true)
    protected String subjectQualifier;
    protected String type;

    /**
     * Gets the value of the subjectQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectQualifier() {
        return subjectQualifier;
    }

    /**
     * Sets the value of the subjectQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectQualifier(String value) {
        this.subjectQualifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
