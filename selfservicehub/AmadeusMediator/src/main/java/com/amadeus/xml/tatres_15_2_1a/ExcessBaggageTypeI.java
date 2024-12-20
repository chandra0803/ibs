
package com.amadeus.xml.tatres_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information concerning excess baggage charges and the associated baggage details.
 * 
 * <p>Java class for ExcessBaggageTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExcessBaggageTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="excessBaggageDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}ExcessBaggageDetailsTypeI" minOccurs="0"/&gt;
 *         &lt;element name="baggageDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}BaggageDetailsTypeI" maxOccurs="3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExcessBaggageTypeI", propOrder = {
    "excessBaggageDetails",
    "baggageDetails"
})
public class ExcessBaggageTypeI {

    protected ExcessBaggageDetailsTypeI excessBaggageDetails;
    protected List<BaggageDetailsTypeI> baggageDetails;

    /**
     * Gets the value of the excessBaggageDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessBaggageDetailsTypeI }
     *     
     */
    public ExcessBaggageDetailsTypeI getExcessBaggageDetails() {
        return excessBaggageDetails;
    }

    /**
     * Sets the value of the excessBaggageDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessBaggageDetailsTypeI }
     *     
     */
    public void setExcessBaggageDetails(ExcessBaggageDetailsTypeI value) {
        this.excessBaggageDetails = value;
    }

    /**
     * Gets the value of the baggageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageDetailsTypeI }
     * 
     * 
     */
    public List<BaggageDetailsTypeI> getBaggageDetails() {
        if (baggageDetails == null) {
            baggageDetails = new ArrayList<BaggageDetailsTypeI>();
        }
        return this.baggageDetails;
    }

}
