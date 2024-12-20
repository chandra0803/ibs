
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This segment is used to convey the free text
 * 
 * <p>Java class for FreeTextInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreeTextInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="freeTextDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextDetailsType"/&gt;
 *         &lt;element name="freeText" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To320" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreeTextInformationType", propOrder = {
    "freeTextDetails",
    "freeText"
})
public class FreeTextInformationType {

    @XmlElement(required = true)
    protected FreeTextDetailsType freeTextDetails;
    @XmlElement(required = true)
    protected List<String> freeText;

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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFreeText() {
        if (freeText == null) {
            freeText = new ArrayList<String>();
        }
        return this.freeText;
    }

}
