
package com.amadeus.xml.apalrr_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Convey the Memo References
 * 
 * <p>Java class for CommentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="remark" type="{http://xml.amadeus.com/APALRR_17_1_1A}MiscellaneousRemarksType"/>
 *         &lt;element name="nonDeliveryReasonForMemo" type="{http://xml.amadeus.com/APALRR_17_1_1A}FreeTextInformationType_160491S" minOccurs="0"/>
 *         &lt;element name="deliveryRequiredType" type="{http://xml.amadeus.com/APALRR_17_1_1A}StatusType_129946S" minOccurs="0"/>
 *         &lt;element name="uniqueCommentIdentifier" type="{http://xml.amadeus.com/APALRR_17_1_1A}ReferenceInfoType_208474S"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentsType", propOrder = {
    "remark",
    "nonDeliveryReasonForMemo",
    "deliveryRequiredType",
    "uniqueCommentIdentifier"
})
public class CommentsType {

    @XmlElement(required = true)
    protected MiscellaneousRemarksType remark;
    protected FreeTextInformationType160491S nonDeliveryReasonForMemo;
    protected StatusType129946S deliveryRequiredType;
    @XmlElement(required = true)
    protected ReferenceInfoType208474S uniqueCommentIdentifier;

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link MiscellaneousRemarksType }
     *     
     */
    public MiscellaneousRemarksType getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscellaneousRemarksType }
     *     
     */
    public void setRemark(MiscellaneousRemarksType value) {
        this.remark = value;
    }

    /**
     * Gets the value of the nonDeliveryReasonForMemo property.
     * 
     * @return
     *     possible object is
     *     {@link FreeTextInformationType160491S }
     *     
     */
    public FreeTextInformationType160491S getNonDeliveryReasonForMemo() {
        return nonDeliveryReasonForMemo;
    }

    /**
     * Sets the value of the nonDeliveryReasonForMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextInformationType160491S }
     *     
     */
    public void setNonDeliveryReasonForMemo(FreeTextInformationType160491S value) {
        this.nonDeliveryReasonForMemo = value;
    }

    /**
     * Gets the value of the deliveryRequiredType property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType129946S }
     *     
     */
    public StatusType129946S getDeliveryRequiredType() {
        return deliveryRequiredType;
    }

    /**
     * Sets the value of the deliveryRequiredType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType129946S }
     *     
     */
    public void setDeliveryRequiredType(StatusType129946S value) {
        this.deliveryRequiredType = value;
    }

    /**
     * Gets the value of the uniqueCommentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceInfoType208474S }
     *     
     */
    public ReferenceInfoType208474S getUniqueCommentIdentifier() {
        return uniqueCommentIdentifier;
    }

    /**
     * Sets the value of the uniqueCommentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceInfoType208474S }
     *     
     */
    public void setUniqueCommentIdentifier(ReferenceInfoType208474S value) {
        this.uniqueCommentIdentifier = value;
    }

}
