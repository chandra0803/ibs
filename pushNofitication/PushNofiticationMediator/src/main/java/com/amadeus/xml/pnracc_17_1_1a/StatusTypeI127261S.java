
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
 * <p>Java class for StatusTypeI_127261S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusTypeI_127261S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}StatusDetailsTypeI_185722C" maxOccurs="9"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusTypeI_127261S", propOrder = {
    "statusDetails"
})
public class StatusTypeI127261S {

    @XmlElement(required = true)
    protected List<StatusDetailsTypeI185722C> statusDetails;

    /**
     * Gets the value of the statusDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusDetailsTypeI185722C }
     * 
     * 
     */
    public List<StatusDetailsTypeI185722C> getStatusDetails() {
        if (statusDetails == null) {
            statusDetails = new ArrayList<StatusDetailsTypeI185722C>();
        }
        return this.statusDetails;
    }

}
