
package com.amadeus.xml.tatreq_15_2_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify details concerning the marriage status of travel product.
 * 
 * <p>Java class for MarriageControlDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarriageControlDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relation" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="marriageIdentifier" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericInteger_Length1To10" minOccurs="0"/&gt;
 *         &lt;element name="lineNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericInteger_Length1To6" minOccurs="0"/&gt;
 *         &lt;element name="otherRelation" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="carrierCode" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarriageControlDetailsTypeI", propOrder = {
    "relation",
    "marriageIdentifier",
    "lineNumber",
    "otherRelation",
    "carrierCode"
})
public class MarriageControlDetailsTypeI {

    protected String relation;
    protected BigInteger marriageIdentifier;
    protected BigInteger lineNumber;
    protected String otherRelation;
    protected String carrierCode;

    /**
     * Gets the value of the relation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelation() {
        return relation;
    }

    /**
     * Sets the value of the relation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelation(String value) {
        this.relation = value;
    }

    /**
     * Gets the value of the marriageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarriageIdentifier() {
        return marriageIdentifier;
    }

    /**
     * Sets the value of the marriageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarriageIdentifier(BigInteger value) {
        this.marriageIdentifier = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the otherRelation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherRelation() {
        return otherRelation;
    }

    /**
     * Sets the value of the otherRelation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherRelation(String value) {
        this.otherRelation = value;
    }

    /**
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierCode(String value) {
        this.carrierCode = value;
    }

}
