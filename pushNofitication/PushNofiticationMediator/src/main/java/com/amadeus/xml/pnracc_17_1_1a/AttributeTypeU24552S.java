
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey the Ferry passenger type.
 * 
 * <p>Java class for AttributeTypeU_24552S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeTypeU_24552S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeFunction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeInformationTypeU_45068C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeTypeU_24552S", propOrder = {
    "attributeFunction",
    "attributeDetails"
})
public class AttributeTypeU24552S {

    @XmlElement(required = true)
    protected String attributeFunction;
    @XmlElement(required = true)
    protected AttributeInformationTypeU45068C attributeDetails;

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
     *     {@link AttributeInformationTypeU45068C }
     *     
     */
    public AttributeInformationTypeU45068C getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU45068C }
     *     
     */
    public void setAttributeDetails(AttributeInformationTypeU45068C value) {
        this.attributeDetails = value;
    }

}
