
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * RESPONSE IDENTIFICATION
 * 
 * <p>Java class for ResponseIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transacIdentifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *         &lt;element name="validationCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/>
 *         &lt;element name="banknetRefNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length6To9" minOccurs="0"/>
 *         &lt;element name="banknetDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length4To4" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseIdentificationType", propOrder = {
    "transacIdentifier",
    "validationCode",
    "banknetRefNumber",
    "banknetDate"
})
public class ResponseIdentificationType {

    protected String transacIdentifier;
    protected String validationCode;
    protected String banknetRefNumber;
    protected String banknetDate;

    /**
     * Gets the value of the transacIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransacIdentifier() {
        return transacIdentifier;
    }

    /**
     * Sets the value of the transacIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransacIdentifier(String value) {
        this.transacIdentifier = value;
    }

    /**
     * Gets the value of the validationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidationCode() {
        return validationCode;
    }

    /**
     * Sets the value of the validationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidationCode(String value) {
        this.validationCode = value;
    }

    /**
     * Gets the value of the banknetRefNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanknetRefNumber() {
        return banknetRefNumber;
    }

    /**
     * Sets the value of the banknetRefNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanknetRefNumber(String value) {
        this.banknetRefNumber = value;
    }

    /**
     * Gets the value of the banknetDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBanknetDate() {
        return banknetDate;
    }

    /**
     * Sets the value of the banknetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBanknetDate(String value) {
        this.banknetDate = value;
    }

}
