
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UniqueIdDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UniqueIdDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="iDSequenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To5"/>
 *         &lt;element name="iDQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniqueIdDescriptionType", propOrder = {
    "idSequenceNumber",
    "idQualifier"
})
public class UniqueIdDescriptionType {

    @XmlElement(name = "iDSequenceNumber", required = true)
    protected BigInteger idSequenceNumber;
    @XmlElement(name = "iDQualifier", required = true)
    protected String idQualifier;

    /**
     * Gets the value of the idSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIDSequenceNumber() {
        return idSequenceNumber;
    }

    /**
     * Sets the value of the idSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIDSequenceNumber(BigInteger value) {
        this.idSequenceNumber = value;
    }

    /**
     * Gets the value of the idQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDQualifier() {
        return idQualifier;
    }

    /**
     * Sets the value of the idQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDQualifier(String value) {
        this.idQualifier = value;
    }

}
