
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details of an address.
 * 
 * <p>Java class for AddressDetailsTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressDetailsTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="format" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="line1" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70"/>
 *         &lt;element name="line2" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="line3" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="line4" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="line5" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *         &lt;element name="line6" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To70" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressDetailsTypeU", propOrder = {
    "format",
    "line1",
    "line2",
    "line3",
    "line4",
    "line5",
    "line6"
})
public class AddressDetailsTypeU {

    @XmlElement(required = true)
    protected String format;
    @XmlElement(required = true)
    protected String line1;
    protected String line2;
    protected String line3;
    protected String line4;
    protected String line5;
    protected String line6;

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Gets the value of the line1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine1() {
        return line1;
    }

    /**
     * Sets the value of the line1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine1(String value) {
        this.line1 = value;
    }

    /**
     * Gets the value of the line2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine2() {
        return line2;
    }

    /**
     * Sets the value of the line2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine2(String value) {
        this.line2 = value;
    }

    /**
     * Gets the value of the line3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine3() {
        return line3;
    }

    /**
     * Sets the value of the line3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine3(String value) {
        this.line3 = value;
    }

    /**
     * Gets the value of the line4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine4() {
        return line4;
    }

    /**
     * Sets the value of the line4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine4(String value) {
        this.line4 = value;
    }

    /**
     * Gets the value of the line5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine5() {
        return line5;
    }

    /**
     * Sets the value of the line5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine5(String value) {
        this.line5 = value;
    }

    /**
     * Gets the value of the line6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine6() {
        return line6;
    }

    /**
     * Sets the value of the line6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine6(String value) {
        this.line6 = value;
    }

}
