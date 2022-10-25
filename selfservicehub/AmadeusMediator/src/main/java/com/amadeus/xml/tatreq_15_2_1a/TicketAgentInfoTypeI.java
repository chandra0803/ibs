
package com.amadeus.xml.tatreq_15_2_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey travel agent and system identification.
 * 
 * <p>Java class for TicketAgentInfoTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketAgentInfoTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyIdNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To15" minOccurs="0"/&gt;
 *         &lt;element name="internalIdDetails" type="{http://xml.amadeus.com/TATREQ_15_2_1A}InternalIDDetailsTypeI" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="bookingIataNumber" type="{http://xml.amadeus.com/TATREQ_15_2_1A}NumericInteger_Length1To9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketAgentInfoTypeI", propOrder = {
    "companyIdNumber",
    "internalIdDetails",
    "bookingIataNumber"
})
public class TicketAgentInfoTypeI {

    protected String companyIdNumber;
    protected List<InternalIDDetailsTypeI> internalIdDetails;
    protected BigInteger bookingIataNumber;

    /**
     * Gets the value of the companyIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyIdNumber() {
        return companyIdNumber;
    }

    /**
     * Sets the value of the companyIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyIdNumber(String value) {
        this.companyIdNumber = value;
    }

    /**
     * Gets the value of the internalIdDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalIdDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalIdDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InternalIDDetailsTypeI }
     * 
     * 
     */
    public List<InternalIDDetailsTypeI> getInternalIdDetails() {
        if (internalIdDetails == null) {
            internalIdDetails = new ArrayList<InternalIDDetailsTypeI>();
        }
        return this.internalIdDetails;
    }

    /**
     * Gets the value of the bookingIataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBookingIataNumber() {
        return bookingIataNumber;
    }

    /**
     * Sets the value of the bookingIataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBookingIataNumber(BigInteger value) {
        this.bookingIataNumber = value;
    }

}
