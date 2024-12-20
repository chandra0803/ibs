
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Complementary data for form of payement information
 * 
 * <p>Java class for MarketSpecificDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketSpecificDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To2"/>
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/>
 *         &lt;element name="newFopsDetails" type="{http://xml.amadeus.com/PNRADD_17_1_1A}MarketSpecificDataDetailsType" minOccurs="0"/>
 *         &lt;element name="extFOP" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ReferencingDetailsTypeI" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketSpecificDataType", propOrder = {
    "fopSequenceNumber",
    "passengerType",
    "newFopsDetails",
    "extFOP"
})
public class MarketSpecificDataType {

    @XmlElement(required = true)
    protected BigInteger fopSequenceNumber;
    protected String passengerType;
    protected MarketSpecificDataDetailsType newFopsDetails;
    protected List<ReferencingDetailsTypeI> extFOP;

    /**
     * Gets the value of the fopSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFopSequenceNumber() {
        return fopSequenceNumber;
    }

    /**
     * Sets the value of the fopSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFopSequenceNumber(BigInteger value) {
        this.fopSequenceNumber = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the newFopsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MarketSpecificDataDetailsType }
     *     
     */
    public MarketSpecificDataDetailsType getNewFopsDetails() {
        return newFopsDetails;
    }

    /**
     * Sets the value of the newFopsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketSpecificDataDetailsType }
     *     
     */
    public void setNewFopsDetails(MarketSpecificDataDetailsType value) {
        this.newFopsDetails = value;
    }

    /**
     * Gets the value of the extFOP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extFOP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtFOP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferencingDetailsTypeI }
     * 
     * 
     */
    public List<ReferencingDetailsTypeI> getExtFOP() {
        if (extFOP == null) {
            extFOP = new ArrayList<ReferencingDetailsTypeI>();
        }
        return this.extFOP;
    }

}
