
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify consumer reference information.
 * 
 * <p>Java class for ConsumerReferenceInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsumerReferenceInformationTypeI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="customerReferences" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ConsumerReferenceIdentificationTypeI" maxOccurs="3"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsumerReferenceInformationTypeI", propOrder = {
    "customerReferences"
})
public class ConsumerReferenceInformationTypeI {

    @XmlElement(required = true)
    protected List<ConsumerReferenceIdentificationTypeI> customerReferences;

    /**
     * Gets the value of the customerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConsumerReferenceIdentificationTypeI }
     * 
     * 
     */
    public List<ConsumerReferenceIdentificationTypeI> getCustomerReferences() {
        if (customerReferences == null) {
            customerReferences = new ArrayList<ConsumerReferenceIdentificationTypeI>();
        }
        return this.customerReferences;
    }

}
