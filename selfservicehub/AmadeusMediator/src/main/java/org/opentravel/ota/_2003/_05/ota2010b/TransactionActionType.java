
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionActionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Book"/&gt;
 *     &lt;enumeration value="Quote"/&gt;
 *     &lt;enumeration value="Hold"/&gt;
 *     &lt;enumeration value="Initiate"/&gt;
 *     &lt;enumeration value="Ignore"/&gt;
 *     &lt;enumeration value="Modify"/&gt;
 *     &lt;enumeration value="Commit"/&gt;
 *     &lt;enumeration value="Cancel"/&gt;
 *     &lt;enumeration value="CommitOverrideEdits"/&gt;
 *     &lt;enumeration value="VerifyPrice"/&gt;
 *     &lt;enumeration value="Ticket"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TransactionActionType")
@XmlEnum
public enum TransactionActionType {

    @XmlEnumValue("Book")
    BOOK("Book"),
    @XmlEnumValue("Quote")
    QUOTE("Quote"),
    @XmlEnumValue("Hold")
    HOLD("Hold"),
    @XmlEnumValue("Initiate")
    INITIATE("Initiate"),
    @XmlEnumValue("Ignore")
    IGNORE("Ignore"),
    @XmlEnumValue("Modify")
    MODIFY("Modify"),
    @XmlEnumValue("Commit")
    COMMIT("Commit"),
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * Commit the transaction and override the end transaction edits.
     * 
     */
    @XmlEnumValue("CommitOverrideEdits")
    COMMIT_OVERRIDE_EDITS("CommitOverrideEdits"),

    /**
     * Perform a price verification.
     * 
     */
    @XmlEnumValue("VerifyPrice")
    VERIFY_PRICE("VerifyPrice"),

    /**
     * A ticket for an event, such as a show or theme park.
     * 
     */
    @XmlEnumValue("Ticket")
    TICKET("Ticket");
    private final String value;

    TransactionActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionActionType fromValue(String v) {
        for (TransactionActionType c: TransactionActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
