
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * In Connection With
 * 
 * <p>Java class for InConnectionWithType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InConnectionWithType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="carrier" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TransportIdentifierType_79027S"/&gt;
 *         &lt;element name="identification" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TicketNumberTypeI_79026S"/&gt;
 *         &lt;element name="couponList" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CouponInformationTypeI" maxOccurs="16" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InConnectionWithType", propOrder = {
    "carrier",
    "identification",
    "couponList"
})
public class InConnectionWithType {

    @XmlElement(required = true)
    protected TransportIdentifierType79027S carrier;
    @XmlElement(required = true)
    protected TicketNumberTypeI79026S identification;
    protected List<CouponInformationTypeI> couponList;

    /**
     * Gets the value of the carrier property.
     * 
     * @return
     *     possible object is
     *     {@link TransportIdentifierType79027S }
     *     
     */
    public TransportIdentifierType79027S getCarrier() {
        return carrier;
    }

    /**
     * Sets the value of the carrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportIdentifierType79027S }
     *     
     */
    public void setCarrier(TransportIdentifierType79027S value) {
        this.carrier = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link TicketNumberTypeI79026S }
     *     
     */
    public TicketNumberTypeI79026S getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketNumberTypeI79026S }
     *     
     */
    public void setIdentification(TicketNumberTypeI79026S value) {
        this.identification = value;
    }

    /**
     * Gets the value of the couponList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the couponList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCouponList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponInformationTypeI }
     * 
     * 
     */
    public List<CouponInformationTypeI> getCouponList() {
        if (couponList == null) {
            couponList = new ArrayList<CouponInformationTypeI>();
        }
        return this.couponList;
    }

}
