
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify tariff details relating to a service or product.
 * 
 * <p>Java class for TariffInformationTypeU_25419S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationTypeU_25419S">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tariffInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationDetailsTypeU_46314C" maxOccurs="3"/>
 *         &lt;element name="associatedChargesInformation" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AssociatedChargesInformationTypeU" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationTypeU_25419S", propOrder = {
    "tariffInformation",
    "associatedChargesInformation"
})
public class TariffInformationTypeU25419S {

    @XmlElement(required = true)
    protected List<TariffInformationDetailsTypeU46314C> tariffInformation;
    protected AssociatedChargesInformationTypeU associatedChargesInformation;

    /**
     * Gets the value of the tariffInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tariffInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTariffInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TariffInformationDetailsTypeU46314C }
     * 
     * 
     */
    public List<TariffInformationDetailsTypeU46314C> getTariffInformation() {
        if (tariffInformation == null) {
            tariffInformation = new ArrayList<TariffInformationDetailsTypeU46314C>();
        }
        return this.tariffInformation;
    }

    /**
     * Gets the value of the associatedChargesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AssociatedChargesInformationTypeU }
     *     
     */
    public AssociatedChargesInformationTypeU getAssociatedChargesInformation() {
        return associatedChargesInformation;
    }

    /**
     * Sets the value of the associatedChargesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedChargesInformationTypeU }
     *     
     */
    public void setAssociatedChargesInformation(AssociatedChargesInformationTypeU value) {
        this.associatedChargesInformation = value;
    }

}
