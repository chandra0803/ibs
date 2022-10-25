
package com.amadeus.xml.ttstrr_15_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify a status and related information.
 * 
 * <p>Java class for StatusTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="firstStatusDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StatusDetailsTypeI"/&gt;
 *         &lt;element name="otherStatusDetails" type="{http://xml.amadeus.com/TTSTRR_15_1_1A}StatusDetailsTypeI" maxOccurs="20" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTypeI", propOrder = {
    "firstStatusDetails",
    "otherStatusDetails"
})
public class StatusTypeI {

    @XmlElement(required = true)
    protected StatusDetailsTypeI firstStatusDetails;
    protected List<StatusDetailsTypeI> otherStatusDetails;

    /**
     * Gets the value of the firstStatusDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetailsTypeI }
     *     
     */
    public StatusDetailsTypeI getFirstStatusDetails() {
        return firstStatusDetails;
    }

    /**
     * Sets the value of the firstStatusDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetailsTypeI }
     *     
     */
    public void setFirstStatusDetails(StatusDetailsTypeI value) {
        this.firstStatusDetails = value;
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
     * {@link StatusDetailsTypeI }
     * 
     * 
     */
    public List<StatusDetailsTypeI> getOtherStatusDetails() {
        if (otherStatusDetails == null) {
            otherStatusDetails = new ArrayList<StatusDetailsTypeI>();
        }
        return this.otherStatusDetails;
    }

}
