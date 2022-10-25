
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SeatType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Window"/&gt;
 *     &lt;enumeration value="Aisle"/&gt;
 *     &lt;enumeration value="Table"/&gt;
 *     &lt;enumeration value="Middle"/&gt;
 *     &lt;enumeration value="Individual"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SeatType")
@XmlEnum
public enum SeatType {

    @XmlEnumValue("Window")
    WINDOW("Window"),
    @XmlEnumValue("Aisle")
    AISLE("Aisle"),
    @XmlEnumValue("Table")
    TABLE("Table"),
    @XmlEnumValue("Middle")
    MIDDLE("Middle"),
    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual");
    private final String value;

    SeatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SeatType fromValue(String v) {
        for (SeatType c: SeatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
