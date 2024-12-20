
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for CodedAttributeType_127279S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeType_127279S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeInformationType_185753C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeType_127279S", propOrder = {
    "attributeDetails"
})
public class CodedAttributeType127279S {

    @XmlElement(required = true)
    protected CodedAttributeInformationType185753C attributeDetails;

    /**
     * Gets the value of the attributeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeInformationType185753C }
     *     
     */
    public CodedAttributeInformationType185753C getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeInformationType185753C }
     *     
     */
    public void setAttributeDetails(CodedAttributeInformationType185753C value) {
        this.attributeDetails = value;
    }

}
