
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey the service information.
 * 
 * <p>Java class for AttributeTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeFunction" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1"/>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeInformationTypeU_36633C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeTypeU", propOrder = {
    "attributeFunction",
    "attributeDetails"
})
public class AttributeTypeU {

    @XmlElement(required = true)
    protected String attributeFunction;
    @XmlElement(required = true)
    protected AttributeInformationTypeU36633C attributeDetails;

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
     *     {@link AttributeInformationTypeU36633C }
     *     
     */
    public AttributeInformationTypeU36633C getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU36633C }
     *     
     */
    public void setAttributeDetails(AttributeInformationTypeU36633C value) {
        this.attributeDetails = value;
    }

}
