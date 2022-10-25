
package com.amadeus.xml.apalrr_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing a compensation given to a Customer
 * 
 * <p>Java class for CompensationType_96073S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompensationType_96073S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compensationStatus" type="{http://xml.amadeus.com/APALRR_17_1_1A}AMA_EDICodesetType_Length1to3" minOccurs="0"/>
 *         &lt;element name="compensationAttributes" type="{http://xml.amadeus.com/APALRR_17_1_1A}CodedAttributeInformationType_144135C" maxOccurs="5"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompensationType_96073S", propOrder = {
    "compensationStatus",
    "compensationAttributes"
})
public class CompensationType96073S {

    protected String compensationStatus;
    @XmlElement(required = true)
    protected List<CodedAttributeInformationType144135C> compensationAttributes;

    /**
     * Gets the value of the compensationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompensationStatus() {
        return compensationStatus;
    }

    /**
     * Sets the value of the compensationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompensationStatus(String value) {
        this.compensationStatus = value;
    }

    /**
     * Gets the value of the compensationAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the compensationAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompensationAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodedAttributeInformationType144135C }
     * 
     * 
     */
    public List<CodedAttributeInformationType144135C> getCompensationAttributes() {
        if (compensationAttributes == null) {
            compensationAttributes = new ArrayList<CodedAttributeInformationType144135C>();
        }
        return this.compensationAttributes;
    }

}
