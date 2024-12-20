
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Point of sale information
 * 
 * <p>Java class for PointOfSaleDataTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointOfSaleDataTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="classification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1"/&gt;
 *         &lt;element name="crs" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSaleCountry" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length2To2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointOfSaleDataTypeI", propOrder = {
    "classification",
    "crs",
    "pointOfSaleCountry"
})
public class PointOfSaleDataTypeI {

    @XmlElement(required = true)
    protected String classification;
    protected String crs;
    protected String pointOfSaleCountry;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the crs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrs() {
        return crs;
    }

    /**
     * Sets the value of the crs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrs(String value) {
        this.crs = value;
    }

    /**
     * Gets the value of the pointOfSaleCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSaleCountry() {
        return pointOfSaleCountry;
    }

    /**
     * Sets the value of the pointOfSaleCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSaleCountry(String value) {
        this.pointOfSaleCountry = value;
    }

}
