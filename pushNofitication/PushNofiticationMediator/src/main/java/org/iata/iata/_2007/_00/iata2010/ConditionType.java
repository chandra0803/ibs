
package org.iata.iata._2007._00.iata2010;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConditionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ConditionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="RampTaxi"/>
 *     &lt;enumeration value="TakeOff"/>
 *     &lt;enumeration value="ZeroFuel"/>
 *     &lt;enumeration value="Landing"/>
 *     &lt;enumeration value="Inflight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConditionType")
@XmlEnum
public enum ConditionType {

    @XmlEnumValue("RampTaxi")
    RAMP_TAXI("RampTaxi"),
    @XmlEnumValue("TakeOff")
    TAKE_OFF("TakeOff"),
    @XmlEnumValue("ZeroFuel")
    ZERO_FUEL("ZeroFuel"),
    @XmlEnumValue("Landing")
    LANDING("Landing"),
    @XmlEnumValue("Inflight")
    INFLIGHT("Inflight");
    private final String value;

    ConditionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConditionType fromValue(String v) {
        for (ConditionType c: ConditionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
