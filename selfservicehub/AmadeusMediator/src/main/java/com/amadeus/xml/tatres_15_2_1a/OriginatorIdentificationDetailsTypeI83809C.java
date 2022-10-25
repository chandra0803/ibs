
package com.amadeus.xml.tatres_15_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the originator of the travel request.
 * 
 * <p>Java class for OriginatorIdentificationDetailsTypeI_83809C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsTypeI_83809C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originatorId" type="{http://xml.amadeus.com/TATRES_15_2_1A}NumericInteger_Length1To9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsTypeI_83809C", propOrder = {
    "originatorId"
})
public class OriginatorIdentificationDetailsTypeI83809C {

    protected BigInteger originatorId;

    /**
     * Gets the value of the originatorId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOriginatorId() {
        return originatorId;
    }

    /**
     * Sets the value of the originatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOriginatorId(BigInteger value) {
        this.originatorId = value;
    }

}
