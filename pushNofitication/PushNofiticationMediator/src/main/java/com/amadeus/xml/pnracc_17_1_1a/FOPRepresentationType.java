
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * convey FOP data
 * 
 * <p>Java class for FOPRepresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOPRepresentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fopPNRDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketingFormOfPaymentType"/>
 *         &lt;element name="fopSequenceNumber" type="{http://xml.amadeus.com/PNRACC_17_1_1A}SequenceDetailsTypeU_94494S" minOccurs="0"/>
 *         &lt;element name="fopFreeflow" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FreeTextInformationType_94495S" minOccurs="0"/>
 *         &lt;element name="pnrSupplementaryData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PNRSupplementaryDataType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="paymentModule" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PaymentGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOPRepresentationType", propOrder = {
    "fopPNRDetails",
    "fopSequenceNumber",
    "fopFreeflow",
    "pnrSupplementaryData",
    "paymentModule"
})
public class FOPRepresentationType {

    @XmlElement(required = true)
    protected TicketingFormOfPaymentType fopPNRDetails;
    protected SequenceDetailsTypeU94494S fopSequenceNumber;
    protected FreeTextInformationType94495S fopFreeflow;
    protected List<PNRSupplementaryDataType> pnrSupplementaryData;
    protected PaymentGroupType paymentModule;

    /**
     * Gets the value of the fopPNRDetails property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingFormOfPaymentType }
     *     
     */
    public TicketingFormOfPaymentType getFopPNRDetails() {
        return fopPNRDetails;
    }

    /**
     * Sets the value of the fopPNRDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingFormOfPaymentType }
     *     
     */
    public void setFopPNRDetails(TicketingFormOfPaymentType value) {
        this.fopPNRDetails = value;
    }

    /**
     * Gets the value of the fopSequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceDetailsTypeU94494S }
     *     
     */
    public SequenceDetailsTypeU94494S getFopSequenceNumber() {
        return fopSequenceNumber;
    }

    /**
     * Sets the value of the fopSequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceDetailsTypeU94494S }
     *     
     */
    public void setFopSequenceNumber(SequenceDetailsTypeU94494S value) {
        this.fopSequenceNumber = value;
    }

    /**
     * Gets the value of the fopFreeflow property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType94495S }
     *     
     */
    public FreeTextInformationType94495S getFopFreeflow() {
        return fopFreeflow;
    }

    /**
     * Sets the value of the fopFreeflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType94495S }
     *     
     */
    public void setFopFreeflow(FreeTextInformationType94495S value) {
        this.fopFreeflow = value;
    }

    /**
     * Gets the value of the pnrSupplementaryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pnrSupplementaryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPnrSupplementaryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PNRSupplementaryDataType }
     * 
     * 
     */
    public List<PNRSupplementaryDataType> getPnrSupplementaryData() {
        if (pnrSupplementaryData == null) {
            pnrSupplementaryData = new ArrayList<PNRSupplementaryDataType>();
        }
        return this.pnrSupplementaryData;
    }

    /**
     * Gets the value of the paymentModule property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentGroupType }
     *     
     */
    public PaymentGroupType getPaymentModule() {
        return paymentModule;
    }

    /**
     * Sets the value of the paymentModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentGroupType }
     *     
     */
    public void setPaymentModule(PaymentGroupType value) {
        this.paymentModule = value;
    }

}
