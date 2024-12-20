
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment
 * 
 * <p>Java class for FormOfPaymentTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fop" type="{http://xml.amadeus.com/PNRADD_17_1_1A}FormOfPaymentDetailsTypeI" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentTypeI", propOrder = {
    "fop"
})
public class FormOfPaymentTypeI {

    @XmlElement(required = true)
    protected List<FormOfPaymentDetailsTypeI> fop;

    /**
     * Gets the value of the fop property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fop property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFop().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentDetailsTypeI }
     * 
     * 
     */
    public List<FormOfPaymentDetailsTypeI> getFop() {
        if (fop == null) {
            fop = new ArrayList<FormOfPaymentDetailsTypeI>();
        }
        return this.fop;
    }

}
