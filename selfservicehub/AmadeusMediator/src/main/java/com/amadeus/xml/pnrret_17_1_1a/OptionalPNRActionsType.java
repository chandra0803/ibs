
package com.amadeus.xml.pnrret_17_1_1a;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * PNR options
 * 
 * <p>Java class for OptionalPNRActionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionalPNRActionsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="optionCode" type="{http://xml.amadeus.com/PNRRET_17_1_1A}NumericInteger_Length1To3" maxOccurs="40"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalPNRActionsType", propOrder = {
    "optionCode"
})
public class OptionalPNRActionsType {

    @XmlElement(required = true)
    protected List<BigInteger> optionCode;

    /**
     * Gets the value of the optionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getOptionCode() {
        if (optionCode == null) {
            optionCode = new ArrayList<BigInteger>();
        }
        return this.optionCode;
    }

}
