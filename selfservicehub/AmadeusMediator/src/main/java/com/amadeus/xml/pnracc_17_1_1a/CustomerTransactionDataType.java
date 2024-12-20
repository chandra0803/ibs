
package com.amadeus.xml.pnracc_17_1_1a;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * specify operating flight additional information
 * 
 * <p>Java class for CustomerTransactionDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerTransactionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pos" type="{http://xml.amadeus.com/PNRACC_17_1_1A}PointOfSaleDataTypeI"/&gt;
 *         &lt;element name="flight" type="{http://xml.amadeus.com/PNRACC_17_1_1A}OtherSegmentDataTypeI"/&gt;
 *         &lt;element name="connection" type="{http://xml.amadeus.com/PNRACC_17_1_1A}NumericInteger_Length1To2" minOccurs="0"/&gt;
 *         &lt;element name="codeShare" type="{http://xml.amadeus.com/PNRACC_17_1_1A}CodeshareFlightDataTypeI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerTransactionDataType", propOrder = {
    "pos",
    "flight",
    "connection",
    "codeShare"
})
public class CustomerTransactionDataType {

    @XmlElement(required = true)
    protected PointOfSaleDataTypeI pos;
    @XmlElement(required = true)
    protected OtherSegmentDataTypeI flight;
    protected BigInteger connection;
    protected CodeshareFlightDataTypeI codeShare;

    /**
     * Gets the value of the pos property.
     * 
     * @return
     *     possible object is
     *     {@link PointOfSaleDataTypeI }
     *     
     */
    public PointOfSaleDataTypeI getPos() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointOfSaleDataTypeI }
     *     
     */
    public void setPos(PointOfSaleDataTypeI value) {
        this.pos = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link OtherSegmentDataTypeI }
     *     
     */
    public OtherSegmentDataTypeI getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherSegmentDataTypeI }
     *     
     */
    public void setFlight(OtherSegmentDataTypeI value) {
        this.flight = value;
    }

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConnection(BigInteger value) {
        this.connection = value;
    }

    /**
     * Gets the value of the codeShare property.
     * 
     * @return
     *     possible object is
     *     {@link CodeshareFlightDataTypeI }
     *     
     */
    public CodeshareFlightDataTypeI getCodeShare() {
        return codeShare;
    }

    /**
     * Sets the value of the codeShare property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeshareFlightDataTypeI }
     *     
     */
    public void setCodeShare(CodeshareFlightDataTypeI value) {
        this.codeShare = value;
    }

}
