
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an Amadeus PNR History Data
 * 
 * <p>Java class for PnrHistoryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrHistoryDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="previousRecord" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="currentRecord" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="elementType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="elementData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To255"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrHistoryDataType", propOrder = {
    "previousRecord",
    "currentRecord",
    "elementType",
    "elementData"
})
public class PnrHistoryDataType {

    protected BigInteger previousRecord;
    protected BigInteger currentRecord;
    protected String elementType;
    @XmlElement(required = true)
    protected String elementData;

    /**
     * Gets the value of the previousRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPreviousRecord() {
        return previousRecord;
    }

    /**
     * Sets the value of the previousRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPreviousRecord(BigInteger value) {
        this.previousRecord = value;
    }

    /**
     * Gets the value of the currentRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentRecord() {
        return currentRecord;
    }

    /**
     * Sets the value of the currentRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentRecord(BigInteger value) {
        this.currentRecord = value;
    }

    /**
     * Gets the value of the elementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementType() {
        return elementType;
    }

    /**
     * Sets the value of the elementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementType(String value) {
        this.elementType = value;
    }

    /**
     * Gets the value of the elementData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementData() {
        return elementData;
    }

    /**
     * Sets the value of the elementData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementData(String value) {
        this.elementData = value;
    }

}
