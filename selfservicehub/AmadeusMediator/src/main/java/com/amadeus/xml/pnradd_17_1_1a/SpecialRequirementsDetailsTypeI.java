
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify special requests or service s information relating to a traveller
 * 
 * <p>Java class for SpecialRequirementsDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ssr" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SpecialRequirementsTypeDetailsTypeI"/&gt;
 *         &lt;element name="ssrb" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SpecialRequirementsDataDetailsTypeI" maxOccurs="9" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsDetailsTypeI", propOrder = {
    "ssr",
    "ssrb"
})
public class SpecialRequirementsDetailsTypeI {

    @XmlElement(required = true)
    protected SpecialRequirementsTypeDetailsTypeI ssr;
    protected List<SpecialRequirementsDataDetailsTypeI> ssrb;

    /**
     * Gets the value of the ssr property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequirementsTypeDetailsTypeI }
     *     
     */
    public SpecialRequirementsTypeDetailsTypeI getSsr() {
        return ssr;
    }

    /**
     * Sets the value of the ssr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequirementsTypeDetailsTypeI }
     *     
     */
    public void setSsr(SpecialRequirementsTypeDetailsTypeI value) {
        this.ssr = value;
    }

    /**
     * Gets the value of the ssrb property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrb property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSsrb().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialRequirementsDataDetailsTypeI }
     * 
     * 
     */
    public List<SpecialRequirementsDataDetailsTypeI> getSsrb() {
        if (ssrb == null) {
            ssrb = new ArrayList<SpecialRequirementsDataDetailsTypeI>();
        }
        return this.ssrb;
    }

}
