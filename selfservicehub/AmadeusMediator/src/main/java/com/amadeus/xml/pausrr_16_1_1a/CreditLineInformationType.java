
package com.amadeus.xml.pausrr_16_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes an end of transaction and transmits information of  credit line of the history
 * 
 * <p>Java class for CreditLineInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditLineInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="officeData" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}TransactionOriginatorInformationType" maxOccurs="2"/&gt;
 *         &lt;element name="receiveFrom" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To127" minOccurs="0"/&gt;
 *         &lt;element name="pointOfSale" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To60" minOccurs="0"/&gt;
 *         &lt;element name="tripChoice" type="{http://xml.amadeus.com/PAUSRR_16_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditLineInformationType", propOrder = {
    "officeData",
    "receiveFrom",
    "pointOfSale",
    "tripChoice"
})
public class CreditLineInformationType {

    @XmlElement(required = true)
    protected List<TransactionOriginatorInformationType> officeData;
    protected String receiveFrom;
    protected String pointOfSale;
    protected String tripChoice;

    /**
     * Gets the value of the officeData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officeData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficeData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransactionOriginatorInformationType }
     * 
     * 
     */
    public List<TransactionOriginatorInformationType> getOfficeData() {
        if (officeData == null) {
            officeData = new ArrayList<TransactionOriginatorInformationType>();
        }
        return this.officeData;
    }

    /**
     * Gets the value of the receiveFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiveFrom() {
        return receiveFrom;
    }

    /**
     * Sets the value of the receiveFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiveFrom(String value) {
        this.receiveFrom = value;
    }

    /**
     * Gets the value of the pointOfSale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPointOfSale() {
        return pointOfSale;
    }

    /**
     * Sets the value of the pointOfSale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPointOfSale(String value) {
        this.pointOfSale = value;
    }

    /**
     * Gets the value of the tripChoice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripChoice() {
        return tripChoice;
    }

    /**
     * Sets the value of the tripChoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripChoice(String value) {
        this.tripChoice = value;
    }

}
