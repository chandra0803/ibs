
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare print override
 * 
 * <p>Java class for FarePrintOverrideDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FarePrintOverrideDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseFare" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To11"/&gt;
 *         &lt;element name="totalFare" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To11" minOccurs="0"/&gt;
 *         &lt;element name="equivalentFare" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To11" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To11" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePrintOverrideDetailsType", propOrder = {
    "baseFare",
    "totalFare",
    "equivalentFare",
    "taxAmount"
})
public class FarePrintOverrideDetailsType {

    @XmlElement(required = true)
    protected String baseFare;
    protected String totalFare;
    protected String equivalentFare;
    protected List<String> taxAmount;

    /**
     * Gets the value of the baseFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseFare() {
        return baseFare;
    }

    /**
     * Sets the value of the baseFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseFare(String value) {
        this.baseFare = value;
    }

    /**
     * Gets the value of the totalFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFare() {
        return totalFare;
    }

    /**
     * Sets the value of the totalFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFare(String value) {
        this.totalFare = value;
    }

    /**
     * Gets the value of the equivalentFare property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquivalentFare() {
        return equivalentFare;
    }

    /**
     * Sets the value of the equivalentFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquivalentFare(String value) {
        this.equivalentFare = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTaxAmount() {
        if (taxAmount == null) {
            taxAmount = new ArrayList<String>();
        }
        return this.taxAmount;
    }

}
