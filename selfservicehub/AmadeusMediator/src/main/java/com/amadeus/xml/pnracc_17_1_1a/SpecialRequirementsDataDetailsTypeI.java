
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecialRequirementsDataDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDataDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="data" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="crossRef" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To5" minOccurs="0"/&gt;
 *         &lt;element name="seatType" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To2" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDataDetailsTypeI", propOrder = {
    "data",
    "crossRef",
    "seatType"
})
public class SpecialRequirementsDataDetailsTypeI {

    protected String data;
    protected String crossRef;
    protected List<String> seatType;

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Gets the value of the crossRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossRef() {
        return crossRef;
    }

    /**
     * Sets the value of the crossRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossRef(String value) {
        this.crossRef = value;
    }

    /**
     * Gets the value of the seatType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatType() {
        if (seatType == null) {
            seatType = new ArrayList<String>();
        }
        return this.seatType;
    }

}
