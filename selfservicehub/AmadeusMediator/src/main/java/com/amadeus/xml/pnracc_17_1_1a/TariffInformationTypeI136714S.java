
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
 * <p>Java class for TariffInformationTypeI_136714S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TariffInformationTypeI_136714S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tariffInfo" type="{http://xml.amadeus.com/PNRACC_17_1_1A}TariffInformationDetailsTypeI_198216C" minOccurs="0"/&gt;
 *         &lt;element name="chargeDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AssociatedChargesInformationTypeI_198218C" maxOccurs="16"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TariffInformationTypeI_136714S", propOrder = {
    "tariffInfo",
    "chargeDetails"
})
public class TariffInformationTypeI136714S {

    protected TariffInformationDetailsTypeI198216C tariffInfo;
    @XmlElement(required = true)
    protected List<AssociatedChargesInformationTypeI198218C> chargeDetails;

    /**
     * Gets the value of the tariffInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TariffInformationDetailsTypeI198216C }
     *     
     */
    public TariffInformationDetailsTypeI198216C getTariffInfo() {
        return tariffInfo;
    }

    /**
     * Sets the value of the tariffInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TariffInformationDetailsTypeI198216C }
     *     
     */
    public void setTariffInfo(TariffInformationDetailsTypeI198216C value) {
        this.tariffInfo = value;
    }

    /**
     * Gets the value of the chargeDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargeDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargeDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedChargesInformationTypeI198218C }
     * 
     * 
     */
    public List<AssociatedChargesInformationTypeI198218C> getChargeDetails() {
        if (chargeDetails == null) {
            chargeDetails = new ArrayList<AssociatedChargesInformationTypeI198218C>();
        }
        return this.chargeDetails;
    }

}
