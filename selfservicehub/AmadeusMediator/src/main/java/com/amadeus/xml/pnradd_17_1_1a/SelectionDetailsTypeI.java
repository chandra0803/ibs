
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the details for making a selection
 * 
 * <p>Java class for SelectionDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectionDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="selection" type="{http://xml.amadeus.com/PNRADD_17_1_1A}SelectionDetailsInformationTypeI" maxOccurs="10"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectionDetailsTypeI", propOrder = {
    "selection"
})
public class SelectionDetailsTypeI {

    @XmlElement(required = true)
    protected List<SelectionDetailsInformationTypeI> selection;

    /**
     * Gets the value of the selection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectionDetailsInformationTypeI }
     * 
     * 
     */
    public List<SelectionDetailsInformationTypeI> getSelection() {
        if (selection == null) {
            selection = new ArrayList<SelectionDetailsInformationTypeI>();
        }
        return this.selection;
    }

}
