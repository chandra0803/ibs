
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemNumberIdentificationTypeU_46320C"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberTypeU", propOrder = {
    "itemIdentification"
})
public class ItemNumberTypeU {

    @XmlElement(required = true)
    protected ItemNumberIdentificationTypeU46320C itemIdentification;

    /**
     * Gets the value of the itemIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberIdentificationTypeU46320C }
     *     
     */
    public ItemNumberIdentificationTypeU46320C getItemIdentification() {
        return itemIdentification;
    }

    /**
     * Sets the value of the itemIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberIdentificationTypeU46320C }
     *     
     */
    public void setItemIdentification(ItemNumberIdentificationTypeU46320C value) {
        this.itemIdentification = value;
    }

}
