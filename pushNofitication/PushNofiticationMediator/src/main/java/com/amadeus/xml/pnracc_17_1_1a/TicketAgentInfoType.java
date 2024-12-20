
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey travel agent and system identification.
 * 
 * <p>Java class for TicketAgentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TicketAgentInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyIdNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length1To15" minOccurs="0"/>
 *         &lt;element name="internalIdDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}InternalIDDetailsType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketAgentInfoType", propOrder = {
    "companyIdNumber",
    "internalIdDetails"
})
public class TicketAgentInfoType {

    protected String companyIdNumber;
    protected List<InternalIDDetailsType> internalIdDetails;

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
     * {@link InternalIDDetailsType }
     * 
     * 
     */
    public List<InternalIDDetailsType> getInternalIdDetails() {
        if (internalIdDetails == null) {
            internalIdDetails = new ArrayList<InternalIDDetailsType>();
        }
        return this.internalIdDetails;
    }

}
