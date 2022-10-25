
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify physical measurements, including dimension tolerances, weights and counts.
 * 
 * <p>Java class for MeasurementsBatchTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementsBatchTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurementQualifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="valueRange" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ValueRangeTypeU"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasurementsBatchTypeU", propOrder = {
    "measurementQualifier",
    "valueRange"
})
public class MeasurementsBatchTypeU {

    @XmlElement(required = true)
    protected String measurementQualifier;
    @XmlElement(required = true)
    protected ValueRangeTypeU valueRange;

    /**
     * Gets the value of the measurementQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasurementQualifier() {
        return measurementQualifier;
    }

    /**
     * Sets the value of the measurementQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasurementQualifier(String value) {
        this.measurementQualifier = value;
    }

    /**
     * Gets the value of the valueRange property.
     * 
     * @return
     *     possible object is
     *     {@link ValueRangeTypeU }
     *     
     */
    public ValueRangeTypeU getValueRange() {
        return valueRange;
    }

    /**
     * Sets the value of the valueRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueRangeTypeU }
     *     
     */
    public void setValueRange(ValueRangeTypeU value) {
        this.valueRange = value;
    }

}
