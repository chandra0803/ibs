
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify fare details.
 * 
 * <p>Java class for FareInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueQualifier" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="fareTypeGrouping" type="{http://xml.amadeus.com/TATRES_15_2_1A}FareTypeGroupingInformationTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareInformationTypeI", propOrder = {
    "valueQualifier",
    "fareTypeGrouping"
})
public class FareInformationTypeI {

    protected String valueQualifier;
    protected FareTypeGroupingInformationTypeI fareTypeGrouping;

    /**
     * Gets the value of the valueQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueQualifier() {
        return valueQualifier;
    }

    /**
     * Sets the value of the valueQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueQualifier(String value) {
        this.valueQualifier = value;
    }

    /**
     * Gets the value of the fareTypeGrouping property.
     * 
     * @return
     *     possible object is
     *     {@link FareTypeGroupingInformationTypeI }
     *     
     */
    public FareTypeGroupingInformationTypeI getFareTypeGrouping() {
        return fareTypeGrouping;
    }

    /**
     * Sets the value of the fareTypeGrouping property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareTypeGroupingInformationTypeI }
     *     
     */
    public void setFareTypeGrouping(FareTypeGroupingInformationTypeI value) {
        this.fareTypeGrouping = value;
    }

}
