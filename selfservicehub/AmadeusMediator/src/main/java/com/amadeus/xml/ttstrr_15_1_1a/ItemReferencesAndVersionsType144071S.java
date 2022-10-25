
package com.amadeus.xml.ttstrr_15_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Exchange and link unique identifiers
 * 
 * <p>Java class for ItemReferencesAndVersionsType_144071S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemReferencesAndVersionsType_144071S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="referenceType" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="uniqueReference" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}NumericInteger_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="iDDescription" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}UniqueIdDescriptionType_208242C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemReferencesAndVersionsType_144071S", propOrder = {
    "referenceType",
    "uniqueReference",
    "idDescription"
})
public class ItemReferencesAndVersionsType144071S {

    protected String referenceType;
    protected BigInteger uniqueReference;
    @XmlElement(name = "iDDescription")
    protected UniqueIdDescriptionType208242C idDescription;

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
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUniqueReference() {
        return uniqueReference;
    }

    /**
     * Sets the value of the uniqueReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUniqueReference(BigInteger value) {
        this.uniqueReference = value;
    }

    /**
     * Gets the value of the idDescription property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueIdDescriptionType208242C }
     *     
     */
    public UniqueIdDescriptionType208242C getIDDescription() {
        return idDescription;
    }

    /**
     * Sets the value of the idDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIdDescriptionType208242C }
     *     
     */
    public void setIDDescription(UniqueIdDescriptionType208242C value) {
        this.idDescription = value;
    }

}