
package com.amadeus.xml.tatres_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an item number
 * 
 * <p>Java class for ItemNumberTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemNumberTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="itemNumberDetails" type="{http://xml.amadeus.com/TATRES_15_2_1A}ItemNumberIdentificationTypeI" maxOccurs="99"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemNumberTypeI", propOrder = {
    "itemNumberDetails"
})
public class ItemNumberTypeI {

    @XmlElement(required = true)
    protected List<ItemNumberIdentificationTypeI> itemNumberDetails;

    /**
     * Gets the value of the itemNumberDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemNumberDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemNumberDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItemNumberIdentificationTypeI }
     * 
     * 
     */
    public List<ItemNumberIdentificationTypeI> getItemNumberDetails() {
        if (itemNumberDetails == null) {
            itemNumberDetails = new ArrayList<ItemNumberIdentificationTypeI>();
        }
        return this.itemNumberDetails;
    }

}
