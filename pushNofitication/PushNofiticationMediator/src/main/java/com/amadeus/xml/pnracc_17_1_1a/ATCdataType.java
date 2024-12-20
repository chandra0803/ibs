
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Map TST ATC Data
 * 
 * <p>Java class for ATCdataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ATCdataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="atcTotalAdditionalCollection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S"/>
 *         &lt;element name="otherAtcFares" type="{http://xml.amadeus.com/PNRACC_17_1_1A}MonetaryInformationTypeI_79012S" maxOccurs="30" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATCdataType", propOrder = {
    "atcTotalAdditionalCollection",
    "otherAtcFares"
})
public class ATCdataType {

    @XmlElement(required = true)
    protected MonetaryInformationTypeI79012S atcTotalAdditionalCollection;
    protected List<MonetaryInformationTypeI79012S> otherAtcFares;

    /**
     * Gets the value of the atcTotalAdditionalCollection property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryInformationTypeI79012S }
     *     
     */
    public MonetaryInformationTypeI79012S getAtcTotalAdditionalCollection() {
        return atcTotalAdditionalCollection;
    }

    /**
     * Sets the value of the atcTotalAdditionalCollection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryInformationTypeI79012S }
     *     
     */
    public void setAtcTotalAdditionalCollection(MonetaryInformationTypeI79012S value) {
        this.atcTotalAdditionalCollection = value;
    }

    /**
     * Gets the value of the otherAtcFares property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAtcFares property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAtcFares().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryInformationTypeI79012S }
     * 
     * 
     */
    public List<MonetaryInformationTypeI79012S> getOtherAtcFares() {
        if (otherAtcFares == null) {
            otherAtcFares = new ArrayList<MonetaryInformationTypeI79012S>();
        }
        return this.otherAtcFares;
    }

}
