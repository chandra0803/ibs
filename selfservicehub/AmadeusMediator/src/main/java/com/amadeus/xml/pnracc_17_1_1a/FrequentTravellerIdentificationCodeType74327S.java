
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify frequent traveler information
 * 
 * <p>Java class for FrequentTravellerIdentificationCodeType_74327S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrequentTravellerIdentificationCodeType_74327S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="frequentTraveler" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FrequentTravellerIdentificationTypeI"/&gt;
 *         &lt;element name="priorityDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PriorityDetailsType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="redemptionInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductAccountDetailsTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrequentTravellerIdentificationCodeType_74327S", propOrder = {
    "frequentTraveler",
    "priorityDetails",
    "redemptionInformation"
})
public class FrequentTravellerIdentificationCodeType74327S {

    @XmlElement(required = true)
    protected FrequentTravellerIdentificationTypeI frequentTraveler;
    protected List<PriorityDetailsType> priorityDetails;
    protected ProductAccountDetailsTypeI redemptionInformation;

    /**
     * Gets the value of the frequentTraveler property.
     * 
     * @return
     *     possible object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public FrequentTravellerIdentificationTypeI getFrequentTraveler() {
        return frequentTraveler;
    }

    /**
     * Sets the value of the frequentTraveler property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequentTravellerIdentificationTypeI }
     *     
     */
    public void setFrequentTraveler(FrequentTravellerIdentificationTypeI value) {
        this.frequentTraveler = value;
    }

    /**
     * Gets the value of the priorityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priorityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriorityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriorityDetailsType }
     * 
     * 
     */
    public List<PriorityDetailsType> getPriorityDetails() {
        if (priorityDetails == null) {
            priorityDetails = new ArrayList<PriorityDetailsType>();
        }
        return this.priorityDetails;
    }

    /**
     * Gets the value of the redemptionInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAccountDetailsTypeI }
     *     
     */
    public ProductAccountDetailsTypeI getRedemptionInformation() {
        return redemptionInformation;
    }

    /**
     * Sets the value of the redemptionInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAccountDetailsTypeI }
     *     
     */
    public void setRedemptionInformation(ProductAccountDetailsTypeI value) {
        this.redemptionInformation = value;
    }

}
