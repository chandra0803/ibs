
package com.amadeus.xml.cfldrr_15_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the type of vehicle being used
 * 
 * <p>Java class for EquipmentIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquipmentIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meanTypeCode" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="identifier" type="{http://xml.amadeus.com/CFLDRR_15_1_1A}AlphaNumericString_Length1To17" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EquipmentIdentificationType", propOrder = {
    "meanTypeCode",
    "identifier"
})
public class EquipmentIdentificationType {

    @XmlElement(required = true)
    protected String meanTypeCode;
    protected String identifier;

    /**
     * Gets the value of the meanTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeanTypeCode() {
        return meanTypeCode;
    }

    /**
     * Sets the value of the meanTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeanTypeCode(String value) {
        this.meanTypeCode = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

}
