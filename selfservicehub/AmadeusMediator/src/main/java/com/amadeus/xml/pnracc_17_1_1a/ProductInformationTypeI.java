
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify details related to availability status or cabin configuration for a product.
 * 
 * <p>Java class for ProductInformationTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookingClassDetails" type="{http://xml.amadeus.com/PNRACC_17_1_1A}ProductDetailsTypeI_36664C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationTypeI", propOrder = {
    "bookingClassDetails"
})
public class ProductInformationTypeI {

    @XmlElement(required = true)
    protected ProductDetailsTypeI36664C bookingClassDetails;

    /**
     * Gets the value of the bookingClassDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetailsTypeI36664C }
     *     
     */
    public ProductDetailsTypeI36664C getBookingClassDetails() {
        return bookingClassDetails;
    }

    /**
     * Sets the value of the bookingClassDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetailsTypeI36664C }
     *     
     */
    public void setBookingClassDetails(ProductDetailsTypeI36664C value) {
        this.bookingClassDetails = value;
    }

}
