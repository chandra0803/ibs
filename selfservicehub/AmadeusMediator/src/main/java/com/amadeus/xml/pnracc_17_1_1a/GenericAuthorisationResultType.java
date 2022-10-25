
package com.amadeus.xml.pnracc_17_1_1a;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * will convey the approval data of the transaction
 * 
 * <p>Java class for GenericAuthorisationResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericAuthorisationResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="approvalCodeData" type="{http://xml.amadeus.com/PNRACC_17_1_1A}AuthorizationApprovalDataType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericAuthorisationResultType", propOrder = {
    "approvalCodeData"
})
public class GenericAuthorisationResultType {

    @XmlElement(required = true)
    protected AuthorizationApprovalDataType approvalCodeData;

    /**
     * Gets the value of the approvalCodeData property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationApprovalDataType }
     *     
     */
    public AuthorizationApprovalDataType getApprovalCodeData() {
        return approvalCodeData;
    }

    /**
     * Sets the value of the approvalCodeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationApprovalDataType }
     *     
     */
    public void setApprovalCodeData(AuthorizationApprovalDataType value) {
        this.approvalCodeData = value;
    }

}
