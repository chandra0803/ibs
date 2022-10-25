
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to have tag value without code list for tag
 * 
 * <p>Java class for AttributeType_21097S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttributeType_21097S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteriaDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AttributeInformationTypeU_37514C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttributeType_21097S", propOrder = {
    "criteriaDetails"
})
public class AttributeType21097S {

    @XmlElement(required = true)
    protected AttributeInformationTypeU37514C criteriaDetails;

    /**
     * Gets the value of the criteriaDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AttributeInformationTypeU37514C }
     *     
     */
    public AttributeInformationTypeU37514C getCriteriaDetails() {
        return criteriaDetails;
    }

    /**
     * Sets the value of the criteriaDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributeInformationTypeU37514C }
     *     
     */
    public void setCriteriaDetails(AttributeInformationTypeU37514C value) {
        this.criteriaDetails = value;
    }

}
