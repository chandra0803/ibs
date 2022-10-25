
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OBfeesGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OBfeesGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrierFee" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SpecificDataInformationTypeI_79035S"/&gt;
 *         &lt;element name="feeDescription" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodedAttributeType_79464S" minOccurs="0"/&gt;
 *         &lt;element name="feeAmount" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S"/&gt;
 *         &lt;element name="feeTax" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TaxTypeI_79038S" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="vatPropertiesGroup" type="{http://xml.amadeus.com/PNRACC_17_1_1A}VatPropertiesGroupType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OBfeesGroupType", propOrder = {
    "carrierFee",
    "feeDescription",
    "feeAmount",
    "feeTax",
    "vatPropertiesGroup"
})
public class OBfeesGroupType {

    @XmlElement(required = true)
    protected SpecificDataInformationTypeI79035S carrierFee;
    protected CodedAttributeType79464S feeDescription;
    @XmlElement(required = true)
    protected MonetaryInformationTypeI79012S feeAmount;
    protected List<TaxTypeI79038S> feeTax;
    protected VatPropertiesGroupType vatPropertiesGroup;

    /**
     * Gets the value of the carrierFee property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificDataInformationTypeI79035S }
     *     
     */
    public SpecificDataInformationTypeI79035S getCarrierFee() {
        return carrierFee;
    }

    /**
     * Sets the value of the carrierFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificDataInformationTypeI79035S }
     *     
     */
    public void setCarrierFee(SpecificDataInformationTypeI79035S value) {
        this.carrierFee = value;
    }

    /**
     * Gets the value of the feeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CodedAttributeType79464S }
     *     
     */
    public CodedAttributeType79464S getFeeDescription() {
        return feeDescription;
    }

    /**
     * Sets the value of the feeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedAttributeType79464S }
     *     
     */
    public void setFeeDescription(CodedAttributeType79464S value) {
        this.feeDescription = value;
    }

    /**
     * Gets the value of the feeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI79012S }
     *     
     */
    public MonetaryInformationTypeI79012S getFeeAmount() {
        return feeAmount;
    }

    /**
     * Sets the value of the feeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI79012S }
     *     
     */
    public void setFeeAmount(MonetaryInformationTypeI79012S value) {
        this.feeAmount = value;
    }

    /**
     * Gets the value of the feeTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxTypeI79038S }
     * 
     * 
     */
    public List<TaxTypeI79038S> getFeeTax() {
        if (feeTax == null) {
            feeTax = new ArrayList<TaxTypeI79038S>();
        }
        return this.feeTax;
    }

    /**
     * Gets the value of the vatPropertiesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link VatPropertiesGroupType }
     *     
     */
    public VatPropertiesGroupType getVatPropertiesGroup() {
        return vatPropertiesGroup;
    }

    /**
     * Sets the value of the vatPropertiesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatPropertiesGroupType }
     *     
     */
    public void setVatPropertiesGroup(VatPropertiesGroupType value) {
        this.vatPropertiesGroup = value;
    }

}
