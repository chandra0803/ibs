
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UsageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Planned"/>
 *     &lt;enumeration value="Actual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UsageType")
@XmlEnum
public enum UsageType {

    @XmlEnumValue("Planned")
    PLANNED("Planned"),
    @XmlEnumValue("Actual")
    ACTUAL("Actual");
    private final String value;

    UsageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UsageType fromValue(String v) {
        for (UsageType c: UsageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
