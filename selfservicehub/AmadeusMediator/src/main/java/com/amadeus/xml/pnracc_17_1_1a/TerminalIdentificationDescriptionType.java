
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * To specify information related to agent terminal
 * 
 * <p>Java class for TerminalIdentificationDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TerminalIdentificationDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="terminalID" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AlphaNumericString_Length8To8" minOccurs="0"/&gt;
 *         &lt;element name="distributionChannel" type="{http://xml.amadeus.com/PNRACC_17_1_1A}DistributionChannelType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminalIdentificationDescriptionType", propOrder = {
    "terminalID",
    "distributionChannel"
})
public class TerminalIdentificationDescriptionType {

    protected String terminalID;
    @XmlElement(required = true)
    protected DistributionChannelType distributionChannel;

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the distributionChannel property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionChannelType }
     *     
     */
    public DistributionChannelType getDistributionChannel() {
        return distributionChannel;
    }

    /**
     * Sets the value of the distributionChannel property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionChannelType }
     *     
     */
    public void setDistributionChannel(DistributionChannelType value) {
        this.distributionChannel = value;
    }

}
