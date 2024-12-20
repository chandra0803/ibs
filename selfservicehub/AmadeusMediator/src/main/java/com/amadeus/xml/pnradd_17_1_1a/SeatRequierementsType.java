
package com.amadeus.xml.pnradd_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat requirements type details
 * 
 * <p>Java class for SeatRequierementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRequierementsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="qualifier" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="boardpoint" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="offpoint" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length3To3" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequierementsType", propOrder = {
    "qualifier",
    "type",
    "boardpoint",
    "offpoint"
})
public class SeatRequierementsType {

    protected String qualifier;
    protected String type;
    protected String boardpoint;
    protected String offpoint;

    /**
     * Gets the value of the qualifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * Sets the value of the qualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifier(String value) {
        this.qualifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the boardpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardpoint() {
        return boardpoint;
    }

    /**
     * Sets the value of the boardpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardpoint(String value) {
        this.boardpoint = value;
    }

    /**
     * Gets the value of the offpoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffpoint() {
        return offpoint;
    }

    /**
     * Sets the value of the offpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffpoint(String value) {
        this.offpoint = value;
    }

}
