
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To indicate quantity and action required in relation to a product.
 * 
 * <p>Java class for QuantityAndActionTypeU_32609S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityAndActionTypeU_32609S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accoStatus" type="{http://xml.amadeus.com/PNRACC_17_1_1A}QuantityAndActionDetailsTypeU_56796C"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityAndActionTypeU_32609S", propOrder = {
    "accoStatus"
})
public class QuantityAndActionTypeU32609S {

    @XmlElement(required = true)
    protected QuantityAndActionDetailsTypeU56796C accoStatus;

    /**
     * Gets the value of the accoStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityAndActionDetailsTypeU56796C }
     *     
     */
    public QuantityAndActionDetailsTypeU56796C getAccoStatus() {
        return accoStatus;
    }

    /**
     * Sets the value of the accoStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityAndActionDetailsTypeU56796C }
     *     
     */
    public void setAccoStatus(QuantityAndActionDetailsTypeU56796C value) {
        this.accoStatus = value;
    }

}
