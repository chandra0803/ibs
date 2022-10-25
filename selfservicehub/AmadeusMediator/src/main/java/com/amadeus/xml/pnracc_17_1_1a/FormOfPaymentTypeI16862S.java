
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To convey details describing the form of payment.
 * 
 * <p>Java class for FormOfPaymentTypeI_16862S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FormOfPaymentTypeI_16862S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="formOfPayment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentDetailsTypeI_20667C" minOccurs="0"/&gt;
 *         &lt;element name="otherFormOfPayment" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FormOfPaymentDetailsTypeI_20667C" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormOfPaymentTypeI_16862S", propOrder = {
    "formOfPayment",
    "otherFormOfPayment"
})
public class FormOfPaymentTypeI16862S {

    protected FormOfPaymentDetailsTypeI20667C formOfPayment;
    protected List<FormOfPaymentDetailsTypeI20667C> otherFormOfPayment;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * @return
     *     possible object is
     *     {@link FormOfPaymentDetailsTypeI20667C }
     *     
     */
    public FormOfPaymentDetailsTypeI20667C getFormOfPayment() {
        return formOfPayment;
    }

    /**
     * Sets the value of the formOfPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link FormOfPaymentDetailsTypeI20667C }
     *     
     */
    public void setFormOfPayment(FormOfPaymentDetailsTypeI20667C value) {
        this.formOfPayment = value;
    }

    /**
     * Gets the value of the otherFormOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherFormOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormOfPaymentDetailsTypeI20667C }
     * 
     * 
     */
    public List<FormOfPaymentDetailsTypeI20667C> getOtherFormOfPayment() {
        if (otherFormOfPayment == null) {
            otherFormOfPayment = new ArrayList<FormOfPaymentDetailsTypeI20667C>();
        }
        return this.otherFormOfPayment;
    }

}
