
package com.amadeus.xml.apalrr_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Conveys customer data transfer details
 * 
 * <p>Java class for CdtCustomerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CdtCustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cdtStatusCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}BusinessProcessIdType"/>
 *         &lt;element name="customerReference" type="{http://xml.amadeus.com/APALRR_17_1_1A}ItemReferencesAndVersionsType_193012S" minOccurs="0"/>
 *         &lt;element name="customerErrors" type="{http://xml.amadeus.com/APALRR_17_1_1A}ErrorGroupType" maxOccurs="20" minOccurs="0"/>
 *         &lt;element name="journeyDetailsGroup" type="{http://xml.amadeus.com/APALRR_17_1_1A}CdtProductType" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdtCustomerType", propOrder = {
    "cdtStatusCode",
    "customerReference",
    "customerErrors",
    "journeyDetailsGroup"
})
public class CdtCustomerType {

    @XmlElement(required = true)
    protected BusinessProcessIdType cdtStatusCode;
    protected ItemReferencesAndVersionsType193012S customerReference;
    protected List<ErrorGroupType> customerErrors;
    @XmlElement(required = true)
    protected List<CdtProductType> journeyDetailsGroup;

    /**
     * Gets the value of the cdtStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessProcessIdType }
     *     
     */
    public BusinessProcessIdType getCdtStatusCode() {
        return cdtStatusCode;
    }

    /**
     * Sets the value of the cdtStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessProcessIdType }
     *     
     */
    public void setCdtStatusCode(BusinessProcessIdType value) {
        this.cdtStatusCode = value;
    }

    /**
     * Gets the value of the customerReference property.
     * 
     * @return
     *     possible object is
     *     {@link ItemReferencesAndVersionsType193012S }
     *     
     */
    public ItemReferencesAndVersionsType193012S getCustomerReference() {
        return customerReference;
    }

    /**
     * Sets the value of the customerReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemReferencesAndVersionsType193012S }
     *     
     */
    public void setCustomerReference(ItemReferencesAndVersionsType193012S value) {
        this.customerReference = value;
    }

    /**
     * Gets the value of the customerErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorGroupType }
     * 
     * 
     */
    public List<ErrorGroupType> getCustomerErrors() {
        if (customerErrors == null) {
            customerErrors = new ArrayList<ErrorGroupType>();
        }
        return this.customerErrors;
    }

    /**
     * Gets the value of the journeyDetailsGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyDetailsGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyDetailsGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CdtProductType }
     * 
     * 
     */
    public List<CdtProductType> getJourneyDetailsGroup() {
        if (journeyDetailsGroup == null) {
            journeyDetailsGroup = new ArrayList<CdtProductType>();
        }
        return this.journeyDetailsGroup;
    }

}
