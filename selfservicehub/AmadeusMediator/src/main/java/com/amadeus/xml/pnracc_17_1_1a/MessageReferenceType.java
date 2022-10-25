
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * INFORMATION SPECIFIC TO VISA
 * 
 * <p>Java class for MessageReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="retrievalReferenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To12" minOccurs="0"/&gt;
 *         &lt;element name="authorCharacteristicIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="authorResponseCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/&gt;
 *         &lt;element name="cardLevelResult" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/&gt;
 *         &lt;element name="terminalType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageReferenceType", propOrder = {
    "retrievalReferenceNumber",
    "authorCharacteristicIndicator",
    "authorResponseCode",
    "cardLevelResult",
    "terminalType"
})
public class MessageReferenceType {

    protected String retrievalReferenceNumber;
    protected String authorCharacteristicIndicator;
    protected String authorResponseCode;
    protected String cardLevelResult;
    protected String terminalType;

    /**
     * Gets the value of the retrievalReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetrievalReferenceNumber() {
        return retrievalReferenceNumber;
    }

    /**
     * Sets the value of the retrievalReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetrievalReferenceNumber(String value) {
        this.retrievalReferenceNumber = value;
    }

    /**
     * Gets the value of the authorCharacteristicIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorCharacteristicIndicator() {
        return authorCharacteristicIndicator;
    }

    /**
     * Sets the value of the authorCharacteristicIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorCharacteristicIndicator(String value) {
        this.authorCharacteristicIndicator = value;
    }

    /**
     * Gets the value of the authorResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorResponseCode() {
        return authorResponseCode;
    }

    /**
     * Sets the value of the authorResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorResponseCode(String value) {
        this.authorResponseCode = value;
    }

    /**
     * Gets the value of the cardLevelResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardLevelResult() {
        return cardLevelResult;
    }

    /**
     * Sets the value of the cardLevelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardLevelResult(String value) {
        this.cardLevelResult = value;
    }

    /**
     * Gets the value of the terminalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalType() {
        return terminalType;
    }

    /**
     * Sets the value of the terminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalType(String value) {
        this.terminalType = value;
    }

}
