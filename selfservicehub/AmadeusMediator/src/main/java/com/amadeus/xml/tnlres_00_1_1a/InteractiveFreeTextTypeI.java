
package com.amadeus.xml.tnlres_00_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide free form or coded text information
 * 
 * <p>Java class for InteractiveFreeTextTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InteractiveFreeTextTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freetextDetail" type="{http://xml.amadeus.com/TNLRES_00_1_1A}FreeTextQualificationTypeI" minOccurs="0"/&gt;
 *         &lt;element name="text" type="{http://xml.amadeus.com/TNLRES_00_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InteractiveFreeTextTypeI", propOrder = {
    "freetextDetail",
    "text"
})
public class InteractiveFreeTextTypeI {

    protected FreeTextQualificationTypeI freetextDetail;
    protected String text;

    /**
     * Gets the value of the freetextDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public FreeTextQualificationTypeI getFreetextDetail() {
        return freetextDetail;
    }

    /**
     * Sets the value of the freetextDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextQualificationTypeI }
     *     
     */
    public void setFreetextDetail(FreeTextQualificationTypeI value) {
        this.freetextDetail = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
