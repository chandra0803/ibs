
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for AttributeType_206185S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType_206185S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/APALRR_17_1_1A}AttributeInformationTypeU_285604C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType_206185S", propOrder = {
    "criteriaDetails"
})
public class AttributeType206185S {

    @XmlElement(required = true)
    protected AttributeInformationTypeU285604C criteriaDetails;

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeInformationTypeU285604C }
     *     
     */
    public AttributeInformationTypeU285604C getCriteriaDetails() {
        return criteriaDetails;
    }

    /**
     * Sets the value of the criteriaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU285604C }
     *     
     */
    public void setCriteriaDetails(AttributeInformationTypeU285604C value) {
        this.criteriaDetails = value;
    }

}
