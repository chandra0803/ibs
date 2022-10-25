
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="UTC"/>
 *     &lt;enumeration value="Local"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimeType")
@XmlEnum
public enum TimeType {

    UTC("UTC"),
    @XmlEnumValue("Local")
    LOCAL("Local");
    private final String value;

    TimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimeType fromValue(String v) {
        for (TimeType c: TimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
