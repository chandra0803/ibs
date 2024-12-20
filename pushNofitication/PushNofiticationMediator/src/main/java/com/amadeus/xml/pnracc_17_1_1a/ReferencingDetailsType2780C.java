
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReferencingDetailsType_2780C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferencingDetailsType_2780C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="marriageQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="tatooNum" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferencingDetailsType_2780C", propOrder = {
    "marriageQualifier",
    "tatooNum"
})
public class ReferencingDetailsType2780C {

    protected String marriageQualifier;
    @XmlElement(required = true)
    protected String tatooNum;

    /**
     * Gets the value of the marriageQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageQualifier() {
        return marriageQualifier;
    }

    /**
     * Sets the value of the marriageQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageQualifier(String value) {
        this.marriageQualifier = value;
    }

    /**
     * Gets the value of the tatooNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTatooNum() {
        return tatooNum;
    }

    /**
     * Sets the value of the tatooNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTatooNum(String value) {
        this.tatooNum = value;
    }

}
