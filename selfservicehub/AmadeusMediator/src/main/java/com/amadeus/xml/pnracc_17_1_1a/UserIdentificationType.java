
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to identify a user.
 * 
 * <p>Java class for UserIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginatorIdentificationDetailsTypeI_170735C"/&gt;
 *         &lt;element name="originatorTypeCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentificationType", propOrder = {
    "originIdentification",
    "originatorTypeCode"
})
public class UserIdentificationType {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI170735C originIdentification;
    protected String originatorTypeCode;

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI170735C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI170735C getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI170735C }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI170735C value) {
        this.originIdentification = value;
    }

    /**
     * Gets the value of the originatorTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginatorTypeCode() {
        return originatorTypeCode;
    }

    /**
     * Sets the value of the originatorTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginatorTypeCode(String value) {
        this.originatorTypeCode = value;
    }

}
