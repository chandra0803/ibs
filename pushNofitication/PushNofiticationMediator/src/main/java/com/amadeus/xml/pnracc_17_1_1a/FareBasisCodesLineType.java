
package com.amadeus.xml.pnracc_17_1_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provide fare basis information from TST
 * 
 * <p>Java class for FareBasisCodesLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareBasisCodesLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fareElement" type="{http://xml.amadeus.com/PNRACC_17_1_1A}FareElementType" maxOccurs="28"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareBasisCodesLineType", propOrder = {
    "fareElement"
})
public class FareBasisCodesLineType {

    @XmlElement(required = true)
    protected List<FareElementType> fareElement;

    /**
     * Gets the value of the fareElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareElementType }
     * 
     * 
     */
    public List<FareElementType> getFareElement() {
        if (fareElement == null) {
            fareElement = new ArrayList<FareElementType>();
        }
        return this.fareElement;
    }

}
