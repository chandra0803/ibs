
package com.amadeus.xml.pnradd_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify the Amadeus PNR Fare elements FE, FK, FS, FZ
 * 
 * <p>Java class for FareElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareElementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="generalIndicator" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To1" minOccurs="0"/&gt;
 *         &lt;element name="passengerType" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="officeId" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length9To9" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="freetextLong" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To150" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareElementsType", propOrder = {
    "generalIndicator",
    "passengerType",
    "officeId",
    "freetextLong"
})
public class FareElementsType {

    protected String generalIndicator;
    protected String passengerType;
    protected List<String> officeId;
    protected String freetextLong;

    /**
     * Gets the value of the generalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralIndicator() {
        return generalIndicator;
    }

    /**
     * Sets the value of the generalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralIndicator(String value) {
        this.generalIndicator = value;
    }

    /**
     * Gets the value of the passengerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerType() {
        return passengerType;
    }

    /**
     * Sets the value of the passengerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerType(String value) {
        this.passengerType = value;
    }

    /**
     * Gets the value of the officeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the officeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfficeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfficeId() {
        if (officeId == null) {
            officeId = new ArrayList<String>();
        }
        return this.officeId;
    }

    /**
     * Gets the value of the freetextLong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreetextLong() {
        return freetextLong;
    }

    /**
     * Sets the value of the freetextLong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreetextLong(String value) {
        this.freetextLong = value;
    }

}
