
package org.opentravel.ota._2003._05.ota2010b;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RateIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateIndicatorType"&gt;
 *   &lt;restriction base="{http://www.opentravel.org/OTA/2003/05/OTA2010B}StringLength1to32"&gt;
 *     &lt;enumeration value="ChangeDuringStay"/&gt;
 *     &lt;enumeration value="MultipleNights"/&gt;
 *     &lt;enumeration value="Exclusive"/&gt;
 *     &lt;enumeration value="OnRequest"/&gt;
 *     &lt;enumeration value="LimitedAvailability"/&gt;
 *     &lt;enumeration value="AvailableForSale"/&gt;
 *     &lt;enumeration value="ClosedOut"/&gt;
 *     &lt;enumeration value="OtherAvailable"/&gt;
 *     &lt;enumeration value="UnableToProcess"/&gt;
 *     &lt;enumeration value="NoAvailability"/&gt;
 *     &lt;enumeration value="RoomTypeClosed"/&gt;
 *     &lt;enumeration value="RatePlanClosed"/&gt;
 *     &lt;enumeration value="LOS_Restricted"/&gt;
 *     &lt;enumeration value="Restricted"/&gt;
 *     &lt;enumeration value="DoesNotExist"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateIndicatorType")
@XmlEnum
public enum RateIndicatorType {

    @XmlEnumValue("ChangeDuringStay")
    CHANGE_DURING_STAY("ChangeDuringStay"),
    @XmlEnumValue("MultipleNights")
    MULTIPLE_NIGHTS("MultipleNights"),

    /**
     * Availability is limited based on guest qualification criteria e.g. AAA member or Government Employee
     * 
     */
    @XmlEnumValue("Exclusive")
    EXCLUSIVE("Exclusive"),
    @XmlEnumValue("OnRequest")
    ON_REQUEST("OnRequest"),
    @XmlEnumValue("LimitedAvailability")
    LIMITED_AVAILABILITY("LimitedAvailability"),
    @XmlEnumValue("AvailableForSale")
    AVAILABLE_FOR_SALE("AvailableForSale"),
    @XmlEnumValue("ClosedOut")
    CLOSED_OUT("ClosedOut"),
    @XmlEnumValue("OtherAvailable")
    OTHER_AVAILABLE("OtherAvailable"),

    /**
     * Indicates an issue that precluded the ability to provide the information.
     * 
     */
    @XmlEnumValue("UnableToProcess")
    UNABLE_TO_PROCESS("UnableToProcess"),
    @XmlEnumValue("NoAvailability")
    NO_AVAILABILITY("NoAvailability"),
    @XmlEnumValue("RoomTypeClosed")
    ROOM_TYPE_CLOSED("RoomTypeClosed"),
    @XmlEnumValue("RatePlanClosed")
    RATE_PLAN_CLOSED("RatePlanClosed"),
    @XmlEnumValue("LOS_Restricted")
    LOS_RESTRICTED("LOS_Restricted"),

    /**
     * Availability is limited based on distribution channel qualification criteria (e.g., Expedia or Sabre).
     * 
     */
    @XmlEnumValue("Restricted")
    RESTRICTED("Restricted"),

    /**
     * The rate plan does not exist.
     * 
     */
    @XmlEnumValue("DoesNotExist")
    DOES_NOT_EXIST("DoesNotExist");
    private final String value;

    RateIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateIndicatorType fromValue(String v) {
        for (RateIndicatorType c: RateIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
