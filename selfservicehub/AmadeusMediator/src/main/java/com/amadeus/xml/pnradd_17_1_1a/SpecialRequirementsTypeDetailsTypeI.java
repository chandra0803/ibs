
package com.amadeus.xml.pnradd_17_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Special  requirements type details
 * 
 * <p>Java class for SpecialRequirementsTypeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialRequirementsTypeDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To4" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="quantity" type="{http://xml.amadeus.com/PNRADD_17_1_1A}NumericInteger_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="companyId" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="indicator" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To3" minOccurs="0"/&gt;
 *         &lt;element name="boardpoint" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="offpoint" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaString_Length3To3" minOccurs="0"/&gt;
 *         &lt;element name="freetext" type="{http://xml.amadeus.com/PNRADD_17_1_1A}AlphaNumericString_Length1To70" maxOccurs="2" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecialRequirementsTypeDetailsTypeI", propOrder = {
    "type",
    "status",
    "quantity",
    "companyId",
    "indicator",
    "boardpoint",
    "offpoint",
    "freetext"
})
public class SpecialRequirementsTypeDetailsTypeI {

    protected String type;
    protected String status;
    protected BigInteger quantity;
    protected String companyId;
    protected String indicator;
    protected String boardpoint;
    protected String offpoint;
    protected List<String> freetext;

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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyId(String value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the indicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Sets the value of the indicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
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

    /**
     * Gets the value of the freetext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freetext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreetext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFreetext() {
        if (freetext == null) {
            freetext = new ArrayList<String>();
        }
        return this.freetext;
    }

}
