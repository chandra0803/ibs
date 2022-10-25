
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey monetary amounts, rates and percentages.
 * 
 * <p>Java class for MonetaryInformationTypeI_53012S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryInformationTypeI_53012S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="monetaryDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationDetailsTypeI_86190C"/&gt;
 *         &lt;element name="otherMonetaryDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationDetailsTypeI_86190C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryInformationTypeI_53012S", propOrder = {
    "monetaryDetails",
    "otherMonetaryDetails"
})
public class MonetaryInformationTypeI53012S {

    @XmlElement(required = true)
    protected MonetaryInformationDetailsTypeI86190C monetaryDetails;
    @XmlElement(required = true)
    protected MonetaryInformationDetailsTypeI86190C otherMonetaryDetails;

    /**
     * Gets the value of the monetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI86190C }
     *     
     */
    public MonetaryInformationDetailsTypeI86190C getMonetaryDetails() {
        return monetaryDetails;
    }

    /**
     * Sets the value of the monetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI86190C }
     *     
     */
    public void setMonetaryDetails(MonetaryInformationDetailsTypeI86190C value) {
        this.monetaryDetails = value;
    }

    /**
     * Gets the value of the otherMonetaryDetails property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationDetailsTypeI86190C }
     *     
     */
    public MonetaryInformationDetailsTypeI86190C getOtherMonetaryDetails() {
        return otherMonetaryDetails;
    }

    /**
     * Sets the value of the otherMonetaryDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationDetailsTypeI86190C }
     *     
     */
    public void setOtherMonetaryDetails(MonetaryInformationDetailsTypeI86190C value) {
        this.otherMonetaryDetails = value;
    }

}
