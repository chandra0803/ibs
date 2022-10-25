
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify one option
 * 
 * <p>Java class for GeneralOptionInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralOptionInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4"/&gt;
 *         &lt;element name="updateIndicator" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="freetext" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To255" maxOccurs="10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralOptionInformationType", propOrder = {
    "type",
    "updateIndicator",
    "freetext"
})
public class GeneralOptionInformationType {

    @XmlElement(required = true)
    protected String type;
    protected String updateIndicator;
    protected List<String> freetext;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the updateIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateIndicator() {
        return updateIndicator;
    }

    /**
     * Sets the value of the updateIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateIndicator(String value) {
        this.updateIndicator = value;
    }

    /**
     * Gets the value of the freetext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freetext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreetext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFreetext() {
        if (freetext == null) {
            freetext = new ArrayList<String>();
        }
        return this.freetext;
    }

}
