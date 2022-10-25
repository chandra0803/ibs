
package com.amadeus.xml.tatreq_15_2_1a;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To identify the type of source.
 * 
 * <p>Java class for SourceTypeDetailsTypeI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceTypeDetailsTypeI"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceQualifier1" type="{http://xml.amadeus.com/TATREQ_15_2_1A}AlphaNumericString_Length1To3" maxOccurs="3"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SourceTypeDetailsTypeI", propOrder = {
    "sourceQualifier1"
})
public class SourceTypeDetailsTypeI {

    @XmlElement(required = true)
    protected List<String> sourceQualifier1;

    /**
     * Gets the value of the sourceQualifier1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceQualifier1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceQualifier1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSourceQualifier1() {
        if (sourceQualifier1 == null) {
            sourceQualifier1 = new ArrayList<String>();
        }
        return this.sourceQualifier1;
    }

}
