
package com.amadeus.xml.vlsslq_06_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * to carry binary data within an Edifact segment
 * 
 * <p>Java class for BinaryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BinaryDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataLength" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}NumericInteger_Length1To15"/&gt;
 *         &lt;element name="dataType" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To1"/&gt;
 *         &lt;element name="binaryData" type="{http://xml.amadeus.com/VLSSLQ_06_1_1A}AlphaNumericString_Length1To99999"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BinaryDataType", propOrder = {
    "dataLength",
    "dataType",
    "binaryData"
})
public class BinaryDataType {

    @XmlElement(required = true)
    protected BigInteger dataLength;
    @XmlElement(required = true)
    protected String dataType;
    @XmlElement(required = true)
    protected String binaryData;

    /**
     * Gets the value of the dataLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataLength() {
        return dataLength;
    }

    /**
     * Sets the value of the dataLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataLength(BigInteger value) {
        this.dataLength = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the binaryData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryData() {
        return binaryData;
    }

    /**
     * Sets the value of the binaryData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryData(String value) {
        this.binaryData = value;
    }

}
