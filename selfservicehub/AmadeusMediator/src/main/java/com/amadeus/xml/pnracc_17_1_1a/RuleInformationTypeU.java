
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify rule information and rule status.
 * 
 * <p>Java class for RuleInformationTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleInformationTypeU"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ruleDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleDetailsTypeU"/&gt;
 *         &lt;element name="ruleStatusDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}RuleStatusTypeU" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RuleInformationTypeU", propOrder = {
    "ruleDetails",
    "ruleStatusDetails"
})
public class RuleInformationTypeU {

    @XmlElement(required = true)
    protected RuleDetailsTypeU ruleDetails;
    protected RuleStatusTypeU ruleStatusDetails;

    /**
     * Gets the value of the ruleDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleDetailsTypeU }
     *     
     */
    public RuleDetailsTypeU getRuleDetails() {
        return ruleDetails;
    }

    /**
     * Sets the value of the ruleDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleDetailsTypeU }
     *     
     */
    public void setRuleDetails(RuleDetailsTypeU value) {
        this.ruleDetails = value;
    }

    /**
     * Gets the value of the ruleStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link RuleStatusTypeU }
     *     
     */
    public RuleStatusTypeU getRuleStatusDetails() {
        return ruleStatusDetails;
    }

    /**
     * Sets the value of the ruleStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleStatusTypeU }
     *     
     */
    public void setRuleStatusDetails(RuleStatusTypeU value) {
        this.ruleStatusDetails = value;
    }

}
