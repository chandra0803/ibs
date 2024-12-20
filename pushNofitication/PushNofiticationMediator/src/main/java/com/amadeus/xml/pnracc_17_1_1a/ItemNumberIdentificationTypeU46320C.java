
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Goods identification for a specified source. Goods identification for a specified source. Goods identification for a specified source. Goods identification for a specified source
 * 
 * <p>Java class for ItemNumberIdentificationTypeU_46320C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberIdentificationTypeU_46320C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemID" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2"/>
 *         &lt;element name="itemIDQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberIdentificationTypeU_46320C", propOrder = {
    "itemID",
    "itemIDQualifier"
})
public class ItemNumberIdentificationTypeU46320C {

    @XmlElement(required = true)
    protected BigInteger itemID;
    @XmlElement(required = true)
    protected String itemIDQualifier;

    /**
     * Gets the value of the itemID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getItemID() {
        return itemID;
    }

    /**
     * Sets the value of the itemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setItemID(BigInteger value) {
        this.itemID = value;
    }

    /**
     * Gets the value of the itemIDQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemIDQualifier() {
        return itemIDQualifier;
    }

    /**
     * Sets the value of the itemIDQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemIDQualifier(String value) {
        this.itemIDQualifier = value;
    }

}
