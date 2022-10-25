
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the originator of the travel request.
 * 
 * <p>Java class for OriginatorIdentificationDetailsTypeI_198179C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatorIdentificationDetailsTypeI_198179C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originatorId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length8To8"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatorIdentificationDetailsTypeI_198179C", propOrder = {
    "originatorId"
})
public class OriginatorIdentificationDetailsTypeI198179C {

    @XmlElement(required = true)
    protected String originatorId;

    /**
     * Gets the value of the originatorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorId() {
        return originatorId;
    }

    /**
     * Sets the value of the originatorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorId(String value) {
        this.originatorId = value;
    }

}
