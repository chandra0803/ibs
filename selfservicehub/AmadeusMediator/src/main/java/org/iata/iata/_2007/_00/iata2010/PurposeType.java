
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurposeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PurposeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="Sell"/&gt;
 *     &lt;enumeration value="Net"/&gt;
 *     &lt;enumeration value="Base"/&gt;
 *     &lt;enumeration value="Refund"/&gt;
 *     &lt;enumeration value="Additional"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurposeType")
@XmlEnum
public enum PurposeType {

    @XmlEnumValue("Sell")
    SELL("Sell"),
    @XmlEnumValue("Net")
    NET("Net"),
    @XmlEnumValue("Base")
    BASE("Base"),
    @XmlEnumValue("Refund")
    REFUND("Refund"),
    @XmlEnumValue("Additional")
    ADDITIONAL("Additional");
    private final String value;

    PurposeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PurposeType fromValue(String v) {
        for (PurposeType c: PurposeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
