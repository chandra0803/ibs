
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to define the types of transportation offered.
 * 
 * <p>Java class for TransportationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transportations" type="{http://www.opentravel.org/OTA/2003/05/OTA2010B}TransportationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportationsType", propOrder = {
    "transportations"
})
@XmlSeeAlso({
    RelativePositionType.class
})
public class TransportationsType {

    @XmlElement(name = "Transportations")
    protected TransportationType transportations;

    /**
     * Gets the value of the transportations property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationType }
     *     
     */
    public TransportationType getTransportations() {
        return transportations;
    }

    /**
     * Sets the value of the transportations property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationType }
     *     
     */
    public void setTransportations(TransportationType value) {
        this.transportations = value;
    }

}
