
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the non-air company information
 * 
 * <p>Java class for CompanyInformationType_8953S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompanyInformationType_8953S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="travelSector" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="companyCodeContext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2"/>
 *         &lt;element name="companyCode" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="companyName" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To35"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyInformationType_8953S", propOrder = {
    "travelSector",
    "companyCodeContext",
    "companyCode",
    "companyName"
})
public class CompanyInformationType8953S {

    @XmlElement(required = true)
    protected String travelSector;
    @XmlElement(required = true)
    protected String companyCodeContext;
    @XmlElement(required = true)
    protected String companyCode;
    @XmlElement(required = true)
    protected String companyName;

    /**
     * Gets the value of the travelSector property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelSector() {
        return travelSector;
    }

    /**
     * Sets the value of the travelSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelSector(String value) {
        this.travelSector = value;
    }

    /**
     * Gets the value of the companyCodeContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCodeContext() {
        return companyCodeContext;
    }

    /**
     * Sets the value of the companyCodeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCodeContext(String value) {
        this.companyCodeContext = value;
    }

    /**
     * Gets the value of the companyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * Sets the value of the companyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyCode(String value) {
        this.companyCode = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
    }

}
