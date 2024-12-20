
package com.amadeus.xml.pnrret_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Retrieve PNR
 * 
 * <p>Java class for RetrievePNRType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RetrievePNRType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRRET_17_1_1A}NumericInteger_Length1To2"/&gt;
 *         &lt;element name="service" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="tattoo" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="office" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaNumericString_Length9To9" minOccurs="0"/&gt;
 *         &lt;element name="targetSystem" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaNumericString_Length2To2" minOccurs="0"/&gt;
 *         &lt;element name="option1" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="option2" type="{http://xml.amadeus.com/PNRRET_17_1_1A}AlphaString_Length1To1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RetrievePNRType", propOrder = {
    "type",
    "service",
    "tattoo",
    "office",
    "targetSystem",
    "option1",
    "option2"
})
public class RetrievePNRType {

    @XmlElement(required = true)
    protected BigInteger type;
    protected String service;
    protected String tattoo;
    protected String office;
    protected String targetSystem;
    protected String option1;
    protected String option2;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setType(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setService(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the tattoo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTattoo() {
        return tattoo;
    }

    /**
     * Sets the value of the tattoo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTattoo(String value) {
        this.tattoo = value;
    }

    /**
     * Gets the value of the office property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffice() {
        return office;
    }

    /**
     * Sets the value of the office property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffice(String value) {
        this.office = value;
    }

    /**
     * Gets the value of the targetSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetSystem() {
        return targetSystem;
    }

    /**
     * Sets the value of the targetSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetSystem(String value) {
        this.targetSystem = value;
    }

    /**
     * Gets the value of the option1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption1() {
        return option1;
    }

    /**
     * Sets the value of the option1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption1(String value) {
        this.option1 = value;
    }

    /**
     * Gets the value of the option2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOption2() {
        return option2;
    }

    /**
     * Sets the value of the option2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOption2(String value) {
        this.option2 = value;
    }

}
