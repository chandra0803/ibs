
package com.amadeus.xml.acsfrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersionsType_123290S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType_123290S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idSection" type="{http://xml.amadeus.com/ACSFRR_16_1_1A}UniqueIdDescriptionType_180164C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType_123290S", propOrder = {
    "idSection"
})
public class ItemReferencesAndVersionsType123290S {

    @XmlElement(required = true)
    protected UniqueIdDescriptionType180164C idSection;

    /**
     * Gets the value of the idSection property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType180164C }
     *     
     */
    public UniqueIdDescriptionType180164C getIdSection() {
        return idSection;
    }

    /**
     * Sets the value of the idSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType180164C }
     *     
     */
    public void setIdSection(UniqueIdDescriptionType180164C value) {
        this.idSection = value;
    }

}
