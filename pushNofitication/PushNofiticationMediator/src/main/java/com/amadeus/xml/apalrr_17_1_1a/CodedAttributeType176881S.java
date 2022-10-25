
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for CodedAttributeType_176881S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeType_176881S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeInformationType_248812C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeType_176881S", propOrder = {
    "attributeDetails"
})
public class CodedAttributeType176881S {

    @XmlElement(required = true)
    protected CodedAttributeInformationType248812C attributeDetails;

    /**
     * Gets the value of the attributeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeInformationType248812C }
     *     
     */
    public CodedAttributeInformationType248812C getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeInformationType248812C }
     *     
     */
    public void setAttributeDetails(CodedAttributeInformationType248812C value) {
        this.attributeDetails = value;
    }

}
