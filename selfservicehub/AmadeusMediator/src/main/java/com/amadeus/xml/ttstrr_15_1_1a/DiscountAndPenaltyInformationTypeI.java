
package com.amadeus.xml.ttstrr_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information about discounts and penalties
 * 
 * <p>Java class for DiscountAndPenaltyInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infoQualifier" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="penDisData" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountPenaltyMonetaryInformationTypeI" maxOccurs="9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationTypeI", propOrder = {
    "infoQualifier",
    "penDisData"
})
public class DiscountAndPenaltyInformationTypeI {

    protected String infoQualifier;
    protected List<DiscountPenaltyMonetaryInformationTypeI> penDisData;

    /**
     * Gets the value of the infoQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfoQualifier() {
        return infoQualifier;
    }

    /**
     * Sets the value of the infoQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfoQualifier(String value) {
        this.infoQualifier = value;
    }

    /**
     * Gets the value of the penDisData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penDisData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenDisData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyMonetaryInformationTypeI }
     * 
     * 
     */
    public List<DiscountPenaltyMonetaryInformationTypeI> getPenDisData() {
        if (penDisData == null) {
            penDisData = new ArrayList<DiscountPenaltyMonetaryInformationTypeI>();
        }
        return this.penDisData;
    }

}
