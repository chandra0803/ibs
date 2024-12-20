
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * NEW FARE SEACH
 * 
 * <p>Java class for FareFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareFamilyname" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To30" minOccurs="0"/>
 *         &lt;element name="hierarchy" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To4" minOccurs="0"/>
 *         &lt;element name="commercialFamilyDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareFamilyDetailsType" maxOccurs="20" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyType", propOrder = {
    "fareFamilyname",
    "hierarchy",
    "commercialFamilyDetails"
})
public class FareFamilyType {

    protected String fareFamilyname;
    protected BigInteger hierarchy;
    protected List<FareFamilyDetailsType> commercialFamilyDetails;

    /**
     * Gets the value of the fareFamilyname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareFamilyname() {
        return fareFamilyname;
    }

    /**
     * Sets the value of the fareFamilyname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareFamilyname(String value) {
        this.fareFamilyname = value;
    }

    /**
     * Gets the value of the hierarchy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHierarchy() {
        return hierarchy;
    }

    /**
     * Sets the value of the hierarchy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHierarchy(BigInteger value) {
        this.hierarchy = value;
    }

    /**
     * Gets the value of the commercialFamilyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commercialFamilyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommercialFamilyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareFamilyDetailsType }
     * 
     * 
     */
    public List<FareFamilyDetailsType> getCommercialFamilyDetails() {
        if (commercialFamilyDetails == null) {
            commercialFamilyDetails = new ArrayList<FareFamilyDetailsType>();
        }
        return this.commercialFamilyDetails;
    }

}
