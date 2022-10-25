
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to identify a user.
 * 
 * <p>Java class for UserIdentificationType_215330S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserIdentificationType_215330S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="originIdentification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OriginatorIdentificationDetailsTypeI_297346C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserIdentificationType_215330S", propOrder = {
    "originIdentification"
})
public class UserIdentificationType215330S {

    @XmlElement(required = true)
    protected OriginatorIdentificationDetailsTypeI297346C originIdentification;

    /**
     * Gets the value of the originIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatorIdentificationDetailsTypeI297346C }
     *     
     */
    public OriginatorIdentificationDetailsTypeI297346C getOriginIdentification() {
        return originIdentification;
    }

    /**
     * Sets the value of the originIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatorIdentificationDetailsTypeI297346C }
     *     
     */
    public void setOriginIdentification(OriginatorIdentificationDetailsTypeI297346C value) {
        this.originIdentification = value;
    }

}
