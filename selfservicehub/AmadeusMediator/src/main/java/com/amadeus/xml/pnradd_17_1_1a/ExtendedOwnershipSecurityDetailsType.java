
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify security between offices
 * 
 * <p>Java class for ExtendedOwnershipSecurityDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedOwnershipSecurityDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="securityDetails" type="{http://xml.amadeus.com/PNRADD_17_1_1A}ExtendedSecurityDetailsType" maxOccurs="5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedOwnershipSecurityDetailsType", propOrder = {
    "securityDetails"
})
public class ExtendedOwnershipSecurityDetailsType {

    protected List<ExtendedSecurityDetailsType> securityDetails;

    /**
     * Gets the value of the securityDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the securityDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecurityDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtendedSecurityDetailsType }
     * 
     * 
     */
    public List<ExtendedSecurityDetailsType> getSecurityDetails() {
        if (securityDetails == null) {
            securityDetails = new ArrayList<ExtendedSecurityDetailsType>();
        }
        return this.securityDetails;
    }

}
