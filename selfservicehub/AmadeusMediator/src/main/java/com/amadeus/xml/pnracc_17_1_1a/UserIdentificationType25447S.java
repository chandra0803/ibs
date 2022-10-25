
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to identify a user.
 * 
 * <p>Java class for UserIdentificationType_25447S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentificationType_25447S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginatorIdentificationDetailsTypeI_46358C" minOccurs="0"/&gt;
 *         &lt;element name="originator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To11"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentificationType_25447S", propOrder = {
    "originIdentification",
    "originator"
})
public class UserIdentificationType25447S {

    protected OriginatorIdentificationDetailsTypeI46358C originIdentification;
    @XmlElement(required = true)
    protected String originator;

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI46358C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI46358C getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI46358C }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI46358C value) {
        this.originIdentification = value;
    }

    /**
     * Gets the value of the originator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginator() {
        return originator;
    }

    /**
     * Sets the value of the originator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginator(String value) {
        this.originator = value;
    }

}
