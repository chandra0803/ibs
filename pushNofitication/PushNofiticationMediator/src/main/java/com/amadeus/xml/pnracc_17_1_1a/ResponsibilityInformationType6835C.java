
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponsibilityInformationType_6835C complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponsibilityInformationType_6835C">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="typeOfPnrElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length2To2"/>
 *         &lt;element name="agentId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length4To4" minOccurs="0"/>
 *         &lt;element name="officeId" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To9" minOccurs="0"/>
 *         &lt;element name="iataCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To9" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponsibilityInformationType_6835C", propOrder = {
    "typeOfPnrElement",
    "agentId",
    "officeId",
    "iataCode"
})
public class ResponsibilityInformationType6835C {

    @XmlElement(required = true)
    protected String typeOfPnrElement;
    protected String agentId;
    protected String officeId;
    protected BigInteger iataCode;

    /**
     * Gets the value of the typeOfPnrElement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfPnrElement() {
        return typeOfPnrElement;
    }

    /**
     * Sets the value of the typeOfPnrElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfPnrElement(String value) {
        this.typeOfPnrElement = value;
    }

    /**
     * Gets the value of the agentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * Sets the value of the agentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentId(String value) {
        this.agentId = value;
    }

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
     * Gets the value of the iataCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIataCode() {
        return iataCode;
    }

    /**
     * Sets the value of the iataCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIataCode(BigInteger value) {
        this.iataCode = value;
    }

}
