
package com.amadeus.xml.ttstrr_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountAndPenaltyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountAndPenaltyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discountPenaltyDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}DiscountPenaltyMonetaryInformationType" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountAndPenaltyInformationType", propOrder = {
    "discountPenaltyDetails"
})
public class DiscountAndPenaltyInformationType {

    protected List<DiscountPenaltyMonetaryInformationType> discountPenaltyDetails;

    /**
     * Gets the value of the discountPenaltyDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountPenaltyDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountPenaltyDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountPenaltyMonetaryInformationType }
     * 
     * 
     */
    public List<DiscountPenaltyMonetaryInformationType> getDiscountPenaltyDetails() {
        if (discountPenaltyDetails == null) {
            discountPenaltyDetails = new ArrayList<DiscountPenaltyMonetaryInformationType>();
        }
        return this.discountPenaltyDetails;
    }

}
