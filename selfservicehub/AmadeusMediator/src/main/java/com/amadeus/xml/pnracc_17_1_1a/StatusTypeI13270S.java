
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a status and related information.
 * 
 * <p>Java class for StatusTypeI_13270S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTypeI_13270S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="statusDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusDetailsTypeI_20684C"/&gt;
 *         &lt;element name="otherStatusDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusDetailsTypeI_20684C" maxOccurs="98" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTypeI_13270S", propOrder = {
    "statusDetails",
    "otherStatusDetails"
})
public class StatusTypeI13270S {

    @XmlElement(required = true)
    protected StatusDetailsTypeI20684C statusDetails;
    protected List<StatusDetailsTypeI20684C> otherStatusDetails;

    /**
     * Gets the value of the statusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsTypeI20684C }
     *     
     */
    public StatusDetailsTypeI20684C getStatusDetails() {
        return statusDetails;
    }

    /**
     * Sets the value of the statusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsTypeI20684C }
     *     
     */
    public void setStatusDetails(StatusDetailsTypeI20684C value) {
        this.statusDetails = value;
    }

    /**
     * Gets the value of the otherStatusDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherStatusDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherStatusDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusDetailsTypeI20684C }
     * 
     * 
     */
    public List<StatusDetailsTypeI20684C> getOtherStatusDetails() {
        if (otherStatusDetails == null) {
            otherStatusDetails = new ArrayList<StatusDetailsTypeI20684C>();
        }
        return this.otherStatusDetails;
    }

}
