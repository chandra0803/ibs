
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Option element information
 * 
 * <p>Java class for OptionElementInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionElementInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="officeId" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length9To9" minOccurs="0"/>
 *         &lt;element name="date" type="{http://xml.amadeus.com/PNRADD_17_1_1A}Date_DDMMYY" minOccurs="0"/>
 *         &lt;element name="queue" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="category" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/>
 *         &lt;element name="freetext" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To200" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionElementInformationType", propOrder = {
    "officeId",
    "date",
    "queue",
    "category",
    "freetext"
})
public class OptionElementInformationType {

    protected String officeId;
    protected String date;
    protected BigInteger queue;
    protected BigInteger category;
    protected String freetext;

    /**
     * Gets the value of the officeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * Sets the value of the officeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeId(String value) {
        this.officeId = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the queue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQueue() {
        return queue;
    }

    /**
     * Sets the value of the queue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQueue(BigInteger value) {
        this.queue = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCategory(BigInteger value) {
        this.category = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreetext() {
        return freetext;
    }

    /**
     * Sets the value of the freetext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreetext(String value) {
        this.freetext = value;
    }

}
