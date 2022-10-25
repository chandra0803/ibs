
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the dates and times associated with a product.
 * 
 * <p>Java class for ProductDateTimeTypeI_270056C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDateTimeTypeI_270056C"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="depDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Date_DDMMYY" minOccurs="0"/&gt;
 *         &lt;element name="depTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Time24_HHMM" minOccurs="0"/&gt;
 *         &lt;element name="arrDate" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Date_DDMMYY" minOccurs="0"/&gt;
 *         &lt;element name="arrTime" type="{http://xml.amadeus.com/PNRACC_17_1_1A}Time24Extended_HHMM"/&gt;
 *         &lt;element name="dayChangeIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDateTimeTypeI_270056C", propOrder = {
    "depDate",
    "depTime",
    "arrDate",
    "arrTime",
    "dayChangeIndicator"
})
public class ProductDateTimeTypeI270056C {

    protected String depDate;
    protected String depTime;
    protected String arrDate;
    @XmlElement(required = true)
    protected String arrTime;
    protected BigInteger dayChangeIndicator;

    /**
     * Gets the value of the depDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepDate() {
        return depDate;
    }

    /**
     * Sets the value of the depDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepDate(String value) {
        this.depDate = value;
    }

    /**
     * Gets the value of the depTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepTime() {
        return depTime;
    }

    /**
     * Sets the value of the depTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepTime(String value) {
        this.depTime = value;
    }

    /**
     * Gets the value of the arrDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrDate() {
        return arrDate;
    }

    /**
     * Sets the value of the arrDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrDate(String value) {
        this.arrDate = value;
    }

    /**
     * Gets the value of the arrTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrTime() {
        return arrTime;
    }

    /**
     * Sets the value of the arrTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrTime(String value) {
        this.arrTime = value;
    }

    /**
     * Gets the value of the dayChangeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDayChangeIndicator() {
        return dayChangeIndicator;
    }

    /**
     * Sets the value of the dayChangeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDayChangeIndicator(BigInteger value) {
        this.dayChangeIndicator = value;
    }

}
