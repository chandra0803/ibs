
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify a queue, that is: an office, a queue number, a category number and a date range number or a date. This segment can also be used in an output message.
 * 
 * <p>Java class for QueueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="queueDetail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QueueDetailsType" minOccurs="0"/>
 *         &lt;element name="categoryDetail" type="{http://xml.amadeus.com/PNRACC_17_1_1A}GategoryType" minOccurs="0"/>
 *         &lt;element name="dateRange" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DateRangeType" minOccurs="0"/>
 *         &lt;element name="informations" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OtherInformationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueType", propOrder = {
    "queueDetail",
    "categoryDetail",
    "dateRange",
    "informations"
})
public class QueueType {

    protected QueueDetailsType queueDetail;
    protected GategoryType categoryDetail;
    protected DateRangeType dateRange;
    protected OtherInformationType informations;

    /**
     * Gets the value of the queueDetail property.
     * 
     * @return
     *     possible object is
     *     {@link QueueDetailsType }
     *     
     */
    public QueueDetailsType getQueueDetail() {
        return queueDetail;
    }

    /**
     * Sets the value of the queueDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueueDetailsType }
     *     
     */
    public void setQueueDetail(QueueDetailsType value) {
        this.queueDetail = value;
    }

    /**
     * Gets the value of the categoryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link GategoryType }
     *     
     */
    public GategoryType getCategoryDetail() {
        return categoryDetail;
    }

    /**
     * Sets the value of the categoryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link GategoryType }
     *     
     */
    public void setCategoryDetail(GategoryType value) {
        this.categoryDetail = value;
    }

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRangeType }
     *     
     */
    public DateRangeType getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRangeType }
     *     
     */
    public void setDateRange(DateRangeType value) {
        this.dateRange = value;
    }

    /**
     * Gets the value of the informations property.
     * 
     * @return
     *     possible object is
     *     {@link OtherInformationType }
     *     
     */
    public OtherInformationType getInformations() {
        return informations;
    }

    /**
     * Sets the value of the informations property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherInformationType }
     *     
     */
    public void setInformations(OtherInformationType value) {
        this.informations = value;
    }

}
