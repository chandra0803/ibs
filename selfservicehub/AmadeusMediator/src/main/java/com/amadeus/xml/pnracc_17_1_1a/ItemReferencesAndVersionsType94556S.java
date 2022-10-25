
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Payment record unique identifier
 * 
 * <p>Java class for ItemReferencesAndVersionsType_94556S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType_94556S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/&gt;
 *         &lt;element name="uniqueReference" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType_94556S", propOrder = {
    "referenceType",
    "uniqueReference"
})
public class ItemReferencesAndVersionsType94556S {

    @XmlElement(required = true)
    protected String referenceType;
    @XmlElement(required = true)
    protected String uniqueReference;

    /**
     * Gets the value of the referenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * Sets the value of the referenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceType(String value) {
        this.referenceType = value;
    }

    /**
     * Gets the value of the uniqueReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueReference() {
        return uniqueReference;
    }

    /**
     * Sets the value of the uniqueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueReference(String value) {
        this.uniqueReference = value;
    }

}
