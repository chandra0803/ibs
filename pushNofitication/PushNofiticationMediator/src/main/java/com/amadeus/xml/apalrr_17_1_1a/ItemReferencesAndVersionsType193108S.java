
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersionsType_193108S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType_193108S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSection" type="{http://xml.amadeus.com/APALRR_17_1_1A}UniqueIdDescriptionType_270062C" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType_193108S", propOrder = {
    "idSection"
})
public class ItemReferencesAndVersionsType193108S {

    protected UniqueIdDescriptionType270062C idSection;

    /**
     * Gets the value of the idSection property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType270062C }
     *     
     */
    public UniqueIdDescriptionType270062C getIdSection() {
        return idSection;
    }

    /**
     * Sets the value of the idSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType270062C }
     *     
     */
    public void setIdSection(UniqueIdDescriptionType270062C value) {
        this.idSection = value;
    }

}
