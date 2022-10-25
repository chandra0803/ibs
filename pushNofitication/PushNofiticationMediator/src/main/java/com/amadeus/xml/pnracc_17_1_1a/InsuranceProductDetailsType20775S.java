
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Product Details
 * 
 * <p>Java class for InsuranceProductDetailsType_20775S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceProductDetailsType_20775S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffCodeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffcodeType" maxOccurs="48" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceProductDetailsType_20775S", propOrder = {
    "tariffCodeDetails"
})
public class InsuranceProductDetailsType20775S {

    protected List<TariffcodeType> tariffCodeDetails;

    /**
     * Gets the value of the tariffCodeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffCodeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffCodeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffcodeType }
     * 
     * 
     */
    public List<TariffcodeType> getTariffCodeDetails() {
        if (tariffCodeDetails == null) {
            tariffCodeDetails = new ArrayList<TariffcodeType>();
        }
        return this.tariffCodeDetails;
    }

}
