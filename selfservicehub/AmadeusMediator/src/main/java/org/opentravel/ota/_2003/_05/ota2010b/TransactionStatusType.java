
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Pending"/&gt;
 *     &lt;enumeration value="Cancelled"/&gt;
 *     &lt;enumeration value="Modified"/&gt;
 *     &lt;enumeration value="Committed"/&gt;
 *     &lt;enumeration value="Ignored"/&gt;
 *     &lt;enumeration value="On Hold"/&gt;
 *     &lt;enumeration value="Unsuccessful"/&gt;
 *     &lt;enumeration value="PendingCancellation"/&gt;
 *     &lt;enumeration value="PendingPurchase"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *     &lt;enumeration value="Reserved"/&gt;
 *     &lt;enumeration value="Unchanged"/&gt;
 *     &lt;enumeration value="RequestDenied"/&gt;
 *     &lt;enumeration value="Ticketed"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionStatusType")
@XmlEnum
public enum TransactionStatusType {

    @XmlEnumValue("Pending")
    PENDING("Pending"),
    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Modified")
    MODIFIED("Modified"),
    @XmlEnumValue("Committed")
    COMMITTED("Committed"),
    @XmlEnumValue("Ignored")
    IGNORED("Ignored"),
    @XmlEnumValue("On Hold")
    ON_HOLD("On Hold"),
    @XmlEnumValue("Unsuccessful")
    UNSUCCESSFUL("Unsuccessful"),

    /**
     * The item that is pending cancellation.
     * 
     */
    @XmlEnumValue("PendingCancellation")
    PENDING_CANCELLATION("PendingCancellation"),

    /**
     * Purchase of the item is pending.
     * 
     */
    @XmlEnumValue("PendingPurchase")
    PENDING_PURCHASE("PendingPurchase"),

    /**
     * The item has been requested.
     * 
     */
    @XmlEnumValue("Requested")
    REQUESTED("Requested"),

    /**
     * The item is reserved.
     * 
     */
    @XmlEnumValue("Reserved")
    RESERVED("Reserved"),

    /**
     * The item is not changed due to the most recent action.
     * 
     */
    @XmlEnumValue("Unchanged")
    UNCHANGED("Unchanged"),

    /**
     * Request denied.
     * 
     */
    @XmlEnumValue("RequestDenied")
    REQUEST_DENIED("RequestDenied"),

    /**
     * The item has been ticketed.
     * 
     */
    @XmlEnumValue("Ticketed")
    TICKETED("Ticketed");
    private final String value;

    TransactionStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatusType fromValue(String v) {
        for (TransactionStatusType c: TransactionStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
