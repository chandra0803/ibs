
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the free text
 * 
 * <p>Java class for FreeTextInformationType_94495S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextInformationType_94495S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeTextDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextDetailsType"/&gt;
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To199"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextInformationType_94495S", propOrder = {
    "freeTextDetails",
    "freeText"
})
public class FreeTextInformationType94495S {

    @XmlElement(required = true)
    protected FreeTextDetailsType freeTextDetails;
    @XmlElement(required = true)
    protected String freeText;

    /**
     * Gets the value of the freeTextDetails property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextDetailsType }
     *     
     */
    public FreeTextDetailsType getFreeTextDetails() {
        return freeTextDetails;
    }

    /**
     * Sets the value of the freeTextDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextDetailsType }
     *     
     */
    public void setFreeTextDetails(FreeTextDetailsType value) {
        this.freeTextDetails = value;
    }

    /**
     * Gets the value of the freeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreeText() {
        return freeText;
    }

    /**
     * Sets the value of the freeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreeText(String value) {
        this.freeText = value;
    }

}
