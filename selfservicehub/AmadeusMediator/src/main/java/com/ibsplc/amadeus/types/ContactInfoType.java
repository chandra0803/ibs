package com.ibsplc.amadeus.types;

public enum ContactInfoType {

    /**
     * Represents the phone details element.
     */
    PHONE_DETAILS("AP"),
    /**
     * Represents the email details element.
     */
    EMAIL_DETAILS("APE"),
    /**
     * Represents the emergency contact element.
     */
    EMERGENCY_CONTACT("AE"),
    /**
     * Represents a contact number element.
     */
    CONTACT_NUMBER("5"),
    /**
     * Represents a mobile number element.
     */
    MOBILE_PHONE("M"),
    /**
     * Represents a home phone element.
     */
    HOME_PHONE("H"),
    /**
     * Represents the emergency phone number element.
     */
    EMERGENCY_PHONE("S"),
    /**
     * Represents the email address element.
     */
    EMAIL_ADDRESS("P02");

    /**
     * The element representation string.
     */
    private final String type;

    ContactInfoType(final String type) {
        this.type = type;
    }

    /**
     * The contact information type.
     *
     * @return contact info type.
     */
    public String getType() {
        return type;
    }
}
