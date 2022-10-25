
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey all credit card data needed for payment
 * 
 * <p>Java class for CreditCardDataGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardDataGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creditCardDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CreditCardDataType"/&gt;
 *         &lt;element name="fortknoxIds" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationTypeI_79009S" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="cardHolderAddress" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AddressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreditCardDataGroupType", propOrder = {
    "creditCardDetails",
    "fortknoxIds",
    "cardHolderAddress"
})
public class CreditCardDataGroupType {

    @XmlElement(required = true)
    protected CreditCardDataType creditCardDetails;
    protected List<ReferenceInformationTypeI79009S> fortknoxIds;
    protected AddressType cardHolderAddress;

    /**
     * Gets the value of the creditCardDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardDataType }
     *     
     */
    public CreditCardDataType getCreditCardDetails() {
        return creditCardDetails;
    }

    /**
     * Sets the value of the creditCardDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardDataType }
     *     
     */
    public void setCreditCardDetails(CreditCardDataType value) {
        this.creditCardDetails = value;
    }

    /**
     * Gets the value of the fortknoxIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fortknoxIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFortknoxIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenceInformationTypeI79009S }
     * 
     * 
     */
    public List<ReferenceInformationTypeI79009S> getFortknoxIds() {
        if (fortknoxIds == null) {
            fortknoxIds = new ArrayList<ReferenceInformationTypeI79009S>();
        }
        return this.fortknoxIds;
    }

    /**
     * Gets the value of the cardHolderAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCardHolderAddress() {
        return cardHolderAddress;
    }

    /**
     * Sets the value of the cardHolderAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCardHolderAddress(AddressType value) {
        this.cardHolderAddress = value;
    }

}
