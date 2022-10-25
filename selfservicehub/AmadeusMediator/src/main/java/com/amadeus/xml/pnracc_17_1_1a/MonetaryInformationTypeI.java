
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationDetailsTypeI_17849C"/&gt;
 *         &lt;element name="otherMonetaryDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationDetailsTypeI_17849C" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationTypeI", propOrder = {
    "monetaryDetails",
    "otherMonetaryDetails"
})
public class MonetaryInformationTypeI {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsTypeI17849C monetaryDetails;
    protected MonetaryInformationDetailsTypeI17849C otherMonetaryDetails;

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI17849C }
     *     
     */
    public MonetaryInformationDetailsTypeI17849C getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI17849C }
     *     
     */
    public void setMonetaryDetails(MonetaryInformationDetailsTypeI17849C value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the otherMonetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI17849C }
     *     
     */
    public MonetaryInformationDetailsTypeI17849C getOtherMonetaryDetails() {
        return otherMonetaryDetails;
    }

    /**
     * Sets the value of the otherMonetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI17849C }
     *     
     */
    public void setOtherMonetaryDetails(MonetaryInformationDetailsTypeI17849C value) {
        this.otherMonetaryDetails = value;
    }

}
