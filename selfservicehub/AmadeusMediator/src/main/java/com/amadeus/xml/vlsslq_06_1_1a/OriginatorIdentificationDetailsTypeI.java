
package com.amadeus.xml.vlsslq_06_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the originator of the travel request.
 * 
 * <p>Java class for OriginatorIdentificationDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceOffice" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To9"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsTypeI", propOrder = {
    "sourceOffice"
})
public class OriginatorIdentificationDetailsTypeI {

    @XmlElement(required = true)
    protected String sourceOffice;

    /**
     * Gets the value of the sourceOffice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceOffice() {
        return sourceOffice;
    }

    /**
     * Sets the value of the sourceOffice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceOffice(String value) {
        this.sourceOffice = value;
    }

}
