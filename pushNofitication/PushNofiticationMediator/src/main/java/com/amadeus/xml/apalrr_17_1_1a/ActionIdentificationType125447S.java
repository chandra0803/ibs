
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To provide details of action required or taken, the flights to which this action refers, and reasons for action taken.
 * 
 * <p>Java class for ActionIdentificationType_125447S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActionIdentificationType_125447S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actionRequestCode" type="{http://xml.amadeus.com/APALRR_17_1_1A}AlphaNumericString_Length1To3"/>
 *         &lt;element name="reasonInformation" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReasonInformationTypeI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActionIdentificationType_125447S", propOrder = {
    "actionRequestCode",
    "reasonInformation"
})
public class ActionIdentificationType125447S {

    @XmlElement(required = true)
    protected String actionRequestCode;
    protected ReasonInformationTypeI reasonInformation;

    /**
     * Gets the value of the actionRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionRequestCode() {
        return actionRequestCode;
    }

    /**
     * Sets the value of the actionRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionRequestCode(String value) {
        this.actionRequestCode = value;
    }

    /**
     * Gets the value of the reasonInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReasonInformationTypeI }
     *     
     */
    public ReasonInformationTypeI getReasonInformation() {
        return reasonInformation;
    }

    /**
     * Sets the value of the reasonInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReasonInformationTypeI }
     *     
     */
    public void setReasonInformation(ReasonInformationTypeI value) {
        this.reasonInformation = value;
    }

}
