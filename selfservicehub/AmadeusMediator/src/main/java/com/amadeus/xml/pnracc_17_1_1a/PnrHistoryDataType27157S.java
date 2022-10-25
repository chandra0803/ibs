
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify an Amadeus PNR History Data
 * 
 * <p>Java class for PnrHistoryDataType_27157S complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PnrHistoryDataType_27157S"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentRecord" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To5" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PnrHistoryDataType_27157S", propOrder = {
    "currentRecord"
})
public class PnrHistoryDataType27157S {

    protected BigInteger currentRecord;

    /**
     * Gets the value of the currentRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCurrentRecord() {
        return currentRecord;
    }

    /**
     * Sets the value of the currentRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCurrentRecord(BigInteger value) {
        this.currentRecord = value;
    }

}
