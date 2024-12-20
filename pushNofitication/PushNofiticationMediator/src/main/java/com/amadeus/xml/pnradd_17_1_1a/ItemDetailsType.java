
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To describe an item (id card, discount...)
 * 
 * <p>Java class for ItemDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length2To2" minOccurs="0"/>
 *         &lt;element name="cardType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To13" minOccurs="0"/>
 *         &lt;element name="cardCheck" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/>
 *         &lt;element name="owner" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length2To2" minOccurs="0"/>
 *         &lt;element name="version" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemDetailsType", propOrder = {
    "companyId",
    "cardType",
    "cardNumber",
    "cardCheck",
    "owner",
    "version"
})
public class ItemDetailsType {

    protected String companyId;
    protected BigInteger cardType;
    protected BigInteger cardNumber;
    protected String cardCheck;
    protected BigInteger owner;
    protected BigInteger version;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardType(BigInteger value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardNumber(BigInteger value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the cardCheck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCheck() {
        return cardCheck;
    }

    /**
     * Sets the value of the cardCheck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCheck(String value) {
        this.cardCheck = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOwner(BigInteger value) {
        this.owner = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
    }

}
