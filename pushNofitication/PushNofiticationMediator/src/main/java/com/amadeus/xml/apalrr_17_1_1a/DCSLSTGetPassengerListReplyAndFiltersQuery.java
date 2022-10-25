
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DCSLST_GetPassengerListReply_andFiltersQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DCSLST_GetPassengerListReply_andFiltersQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="passengerListFilterName" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeType_198803S"/>
 *         &lt;element name="filterIndicator" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_145987S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DCSLST_GetPassengerListReply_andFiltersQuery", propOrder = {
    "passengerListFilterName",
    "filterIndicator"
})
public class DCSLSTGetPassengerListReplyAndFiltersQuery {

    @XmlElement(required = true)
    protected CodedAttributeType198803S passengerListFilterName;
    protected StatusType145987S filterIndicator;

    /**
     * Gets the value of the passengerListFilterName property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType198803S }
     *     
     */
    public CodedAttributeType198803S getPassengerListFilterName() {
        return passengerListFilterName;
    }

    /**
     * Sets the value of the passengerListFilterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType198803S }
     *     
     */
    public void setPassengerListFilterName(CodedAttributeType198803S value) {
        this.passengerListFilterName = value;
    }

    /**
     * Gets the value of the filterIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType145987S }
     *     
     */
    public StatusType145987S getFilterIndicator() {
        return filterIndicator;
    }

    /**
     * Sets the value of the filterIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType145987S }
     *     
     */
    public void setFilterIndicator(StatusType145987S value) {
        this.filterIndicator = value;
    }

}
