
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for CodedAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeFunction" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeInformationType_208661C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeType", propOrder = {
    "attributeFunction",
    "attributeDetails"
})
public class CodedAttributeType {

    @XmlElement(required = true)
    protected String attributeFunction;
    @XmlElement(required = true)
    protected CodedAttributeInformationType208661C attributeDetails;

    /**
     * Gets the value of the attributeFunction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeFunction() {
        return attributeFunction;
    }

    /**
     * Sets the value of the attributeFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeFunction(String value) {
        this.attributeFunction = value;
    }

    /**
     * Gets the value of the attributeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeInformationType208661C }
     *     
     */
    public CodedAttributeInformationType208661C getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeInformationType208661C }
     *     
     */
    public void setAttributeDetails(CodedAttributeInformationType208661C value) {
        this.attributeDetails = value;
    }

}
