
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To describe an item in either an industry or free format.
 * 
 * <p>Java class for ItemDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemCharacteristic" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDescriptionType", propOrder = {
    "itemCharacteristic"
})
public class ItemDescriptionType {

    protected String itemCharacteristic;

    /**
     * Gets the value of the itemCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemCharacteristic() {
        return itemCharacteristic;
    }

    /**
     * Sets the value of the itemCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemCharacteristic(String value) {
        this.itemCharacteristic = value;
    }

}
