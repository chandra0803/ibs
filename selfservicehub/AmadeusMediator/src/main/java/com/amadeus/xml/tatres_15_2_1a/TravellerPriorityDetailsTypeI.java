
package com.amadeus.xml.tatres_15_2_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate the details associated with a travellers status.
 * 
 * <p>Java class for TravellerPriorityDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerPriorityDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="company" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="dateOfJoining" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To35" minOccurs="0"/&gt;
 *         &lt;element name="travellerReference" type="{http://xml.amadeus.com/TATRES_15_2_1A}AlphaNumericString_Length1To10" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerPriorityDetailsTypeI", propOrder = {
    "company",
    "dateOfJoining",
    "travellerReference"
})
public class TravellerPriorityDetailsTypeI {

    protected String company;
    protected String dateOfJoining;
    protected String travellerReference;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the dateOfJoining property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateOfJoining() {
        return dateOfJoining;
    }

    /**
     * Sets the value of the dateOfJoining property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfJoining(String value) {
        this.dateOfJoining = value;
    }

    /**
     * Gets the value of the travellerReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravellerReference() {
        return travellerReference;
    }

    /**
     * Sets the value of the travellerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravellerReference(String value) {
        this.travellerReference = value;
    }

}
