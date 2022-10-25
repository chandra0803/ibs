
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersionsType_6550S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType_6550S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iDSection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}UniqueIdDescriptionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType_6550S", propOrder = {
    "idSection"
})
public class ItemReferencesAndVersionsType6550S {

    @XmlElement(name = "iDSection", required = true)
    protected UniqueIdDescriptionType idSection;

    /**
     * Gets the value of the idSection property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public UniqueIdDescriptionType getIDSection() {
        return idSection;
    }

    /**
     * Sets the value of the idSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType }
     *     
     */
    public void setIDSection(UniqueIdDescriptionType value) {
        this.idSection = value;
    }

}
