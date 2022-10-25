
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate quantity and action required in relation to a product.
 * 
 * <p>Java class for QuantityAndActionTypeU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityAndActionTypeU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="quantityActionDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityAndActionDetailsTypeU" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndActionTypeU", propOrder = {
    "quantityActionDetails"
})
public class QuantityAndActionTypeU {

    @XmlElement(required = true)
    protected List<QuantityAndActionDetailsTypeU> quantityActionDetails;

    /**
     * Gets the value of the quantityActionDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityActionDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityActionDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuantityAndActionDetailsTypeU }
     * 
     * 
     */
    public List<QuantityAndActionDetailsTypeU> getQuantityActionDetails() {
        if (quantityActionDetails == null) {
            quantityActionDetails = new ArrayList<QuantityAndActionDetailsTypeU>();
        }
        return this.quantityActionDetails;
    }

}
