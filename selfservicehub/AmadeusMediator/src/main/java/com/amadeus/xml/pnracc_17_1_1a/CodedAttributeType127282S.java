
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for CodedAttributeType_127282S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedAttributeType_127282S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attributeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeInformationType_142108C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedAttributeType_127282S", propOrder = {
    "attributeDetails"
})
public class CodedAttributeType127282S {

    @XmlElement(required = true)
    protected CodedAttributeInformationType142108C attributeDetails;

    /**
     * Gets the value of the attributeDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeInformationType142108C }
     *     
     */
    public CodedAttributeInformationType142108C getAttributeDetails() {
        return attributeDetails;
    }

    /**
     * Sets the value of the attributeDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeInformationType142108C }
     *     
     */
    public void setAttributeDetails(CodedAttributeInformationType142108C value) {
        this.attributeDetails = value;
    }

}
