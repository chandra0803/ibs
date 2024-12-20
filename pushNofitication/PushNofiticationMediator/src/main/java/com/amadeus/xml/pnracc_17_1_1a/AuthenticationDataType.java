
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys CC authentication data
 * 
 * <p>Java class for AuthenticationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthenticationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="veres" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="pares" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1" minOccurs="0"/>
 *         &lt;element name="creditCardCompany" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length4To4"/>
 *         &lt;element name="authenticationIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/>
 *         &lt;element name="caavAlgorithm" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthenticationDataType", propOrder = {
    "veres",
    "pares",
    "creditCardCompany",
    "authenticationIndicator",
    "caavAlgorithm"
})
public class AuthenticationDataType {

    protected String veres;
    protected String pares;
    @XmlElement(required = true)
    protected String creditCardCompany;
    protected String authenticationIndicator;
    protected BigInteger caavAlgorithm;

    /**
     * Gets the value of the veres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVeres() {
        return veres;
    }

    /**
     * Sets the value of the veres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVeres(String value) {
        this.veres = value;
    }

    /**
     * Gets the value of the pares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPares() {
        return pares;
    }

    /**
     * Sets the value of the pares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPares(String value) {
        this.pares = value;
    }

    /**
     * Gets the value of the creditCardCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardCompany() {
        return creditCardCompany;
    }

    /**
     * Sets the value of the creditCardCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardCompany(String value) {
        this.creditCardCompany = value;
    }

    /**
     * Gets the value of the authenticationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationIndicator() {
        return authenticationIndicator;
    }

    /**
     * Sets the value of the authenticationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationIndicator(String value) {
        this.authenticationIndicator = value;
    }

    /**
     * Gets the value of the caavAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCaavAlgorithm() {
        return caavAlgorithm;
    }

    /**
     * Sets the value of the caavAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCaavAlgorithm(BigInteger value) {
        this.caavAlgorithm = value;
    }

}
