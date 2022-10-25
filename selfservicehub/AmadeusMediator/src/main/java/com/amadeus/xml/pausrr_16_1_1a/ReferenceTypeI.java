
package com.amadeus.xml.pausrr_16_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify which number in a sequence of references and/or the reference number.
 * 
 * <p>Java class for ReferenceTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfItems" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="lastItemIdentifier" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceTypeI", propOrder = {
    "numberOfItems",
    "lastItemIdentifier"
})
public class ReferenceTypeI {

    protected String numberOfItems;
    protected String lastItemIdentifier;

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberOfItems(String value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the lastItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastItemIdentifier() {
        return lastItemIdentifier;
    }

    /**
     * Sets the value of the lastItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastItemIdentifier(String value) {
        this.lastItemIdentifier = value;
    }

}
