
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify main information about the discount.
 * 
 * <p>Java class for DiscountInformationType_94068S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountInformationType_94068S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="discountDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DiscountInformationDetailsType_141679C"/>
 *         &lt;element name="otherDiscountDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DiscountInformationDetailsType_141679C" maxOccurs="19" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountInformationType_94068S", propOrder = {
    "discountDetails",
    "otherDiscountDetails"
})
public class DiscountInformationType94068S {

    @XmlElement(required = true)
    protected DiscountInformationDetailsType141679C discountDetails;
    protected List<DiscountInformationDetailsType141679C> otherDiscountDetails;

    /**
     * Gets the value of the discountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link DiscountInformationDetailsType141679C }
     *     
     */
    public DiscountInformationDetailsType141679C getDiscountDetails() {
        return discountDetails;
    }

    /**
     * Sets the value of the discountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscountInformationDetailsType141679C }
     *     
     */
    public void setDiscountDetails(DiscountInformationDetailsType141679C value) {
        this.discountDetails = value;
    }

    /**
     * Gets the value of the otherDiscountDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherDiscountDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherDiscountDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountInformationDetailsType141679C }
     * 
     * 
     */
    public List<DiscountInformationDetailsType141679C> getOtherDiscountDetails() {
        if (otherDiscountDetails == null) {
            otherDiscountDetails = new ArrayList<DiscountInformationDetailsType141679C>();
        }
        return this.otherDiscountDetails;
    }

}
