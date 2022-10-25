
package com.amadeus.xml.pausrq_16_1_1a;

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
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/PAUSRQ_16_1_1A}OriginatorIdentificationDetailsType"/&gt;
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
    "originIdentification"
})
public class UserIdentificationType {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsType originIdentification;

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsType }
     *     
     */
    public OriginatorIdentificationDetailsType getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsType }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsType value) {
        this.originIdentification = value;
    }

}
