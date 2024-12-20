
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Chidren group
 * 
 * <p>Java class for ChildrenGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChildrenGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="age" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityTypeI_65488S"/>
 *         &lt;element name="referenceForPassenger" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ReferenceInformationType_65487S" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChildrenGroupType", propOrder = {
    "age",
    "referenceForPassenger"
})
public class ChildrenGroupType {

    @XmlElement(required = true)
    protected QuantityTypeI65488S age;
    protected ReferenceInformationType65487S referenceForPassenger;

    /**
     * Gets the value of the age property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityTypeI65488S }
     *     
     */
    public QuantityTypeI65488S getAge() {
        return age;
    }

    /**
     * Sets the value of the age property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityTypeI65488S }
     *     
     */
    public void setAge(QuantityTypeI65488S value) {
        this.age = value;
    }

    /**
     * Gets the value of the referenceForPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInformationType65487S }
     *     
     */
    public ReferenceInformationType65487S getReferenceForPassenger() {
        return referenceForPassenger;
    }

    /**
     * Sets the value of the referenceForPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInformationType65487S }
     *     
     */
    public void setReferenceForPassenger(ReferenceInformationType65487S value) {
        this.referenceForPassenger = value;
    }

}
