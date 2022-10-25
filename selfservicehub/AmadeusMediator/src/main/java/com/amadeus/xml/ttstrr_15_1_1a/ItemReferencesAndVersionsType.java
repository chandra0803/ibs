
package com.amadeus.xml.ttstrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sequenceSection" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}UniqueIdDescriptionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType", propOrder = {
    "sequenceSection"
})
public class ItemReferencesAndVersionsType {

    protected UniqueIdDescriptionType sequenceSection;

    /**
     * Gets the value of the sequenceSection property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public UniqueIdDescriptionType getSequenceSection() {
        return sequenceSection;
    }

    /**
     * Sets the value of the sequenceSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public void setSequenceSection(UniqueIdDescriptionType value) {
        this.sequenceSection = value;
    }

}
