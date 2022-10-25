
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SSRPackInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SSRPackInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elementCounter" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ItemNumberType_195219S"/>
 *         &lt;element name="bookingMethod" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ActionIdentificationType"/>
 *         &lt;element name="pricingInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PricingOrTicketingSubsequentType_195222S" minOccurs="0"/>
 *         &lt;element name="serviceIdentifier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecialRequirementsDetailsType_195223S" minOccurs="0"/>
 *         &lt;element name="tableValues" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AttributeType_195221S" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="elementReference" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInfoType_195220S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSRPackInformation", propOrder = {
    "elementCounter",
    "bookingMethod",
    "pricingInformation",
    "serviceIdentifier",
    "tableValues",
    "elementReference"
})
public class SSRPackInformation {

    @XmlElement(required = true)
    protected ItemNumberType195219S elementCounter;
    @XmlElement(required = true)
    protected ActionIdentificationType bookingMethod;
    protected PricingOrTicketingSubsequentType195222S pricingInformation;
    protected SpecialRequirementsDetailsType195223S serviceIdentifier;
    protected List<AttributeType195221S> tableValues;
    protected ReferenceInfoType195220S elementReference;

    /**
     * Gets the value of the elementCounter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemNumberType195219S }
     *     
     */
    public ItemNumberType195219S getElementCounter() {
        return elementCounter;
    }

    /**
     * Sets the value of the elementCounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemNumberType195219S }
     *     
     */
    public void setElementCounter(ItemNumberType195219S value) {
        this.elementCounter = value;
    }

    /**
     * Gets the value of the bookingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ActionIdentificationType }
     *     
     */
    public ActionIdentificationType getBookingMethod() {
        return bookingMethod;
    }

    /**
     * Sets the value of the bookingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionIdentificationType }
     *     
     */
    public void setBookingMethod(ActionIdentificationType value) {
        this.bookingMethod = value;
    }

    /**
     * Gets the value of the pricingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PricingOrTicketingSubsequentType195222S }
     *     
     */
    public PricingOrTicketingSubsequentType195222S getPricingInformation() {
        return pricingInformation;
    }

    /**
     * Sets the value of the pricingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingOrTicketingSubsequentType195222S }
     *     
     */
    public void setPricingInformation(PricingOrTicketingSubsequentType195222S value) {
        this.pricingInformation = value;
    }

    /**
     * Gets the value of the serviceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsDetailsType195223S }
     *     
     */
    public SpecialRequirementsDetailsType195223S getServiceIdentifier() {
        return serviceIdentifier;
    }

    /**
     * Sets the value of the serviceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsDetailsType195223S }
     *     
     */
    public void setServiceIdentifier(SpecialRequirementsDetailsType195223S value) {
        this.serviceIdentifier = value;
    }

    /**
     * Gets the value of the tableValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tableValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTableValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeType195221S }
     * 
     * 
     */
    public List<AttributeType195221S> getTableValues() {
        if (tableValues == null) {
            tableValues = new ArrayList<AttributeType195221S>();
        }
        return this.tableValues;
    }

    /**
     * Gets the value of the elementReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType195220S }
     *     
     */
    public ReferenceInfoType195220S getElementReference() {
        return elementReference;
    }

    /**
     * Sets the value of the elementReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType195220S }
     *     
     */
    public void setElementReference(ReferenceInfoType195220S value) {
        this.elementReference = value;
    }

}
