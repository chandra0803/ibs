
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify more than one identification number.
 * 
 * <p>Java class for MultipleIdentificationNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleIdentificationNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="firstNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To8" minOccurs="0"/>
 *         &lt;element name="secondNumber" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length9To9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleIdentificationNumbersType", propOrder = {
    "firstNumber",
    "secondNumber"
})
public class MultipleIdentificationNumbersType {

    protected String firstNumber;
    protected String secondNumber;

    /**
     * Gets the value of the firstNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNumber() {
        return firstNumber;
    }

    /**
     * Sets the value of the firstNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNumber(String value) {
        this.firstNumber = value;
    }

    /**
     * Gets the value of the secondNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondNumber() {
        return secondNumber;
    }

    /**
     * Sets the value of the secondNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondNumber(String value) {
        this.secondNumber = value;
    }

}
