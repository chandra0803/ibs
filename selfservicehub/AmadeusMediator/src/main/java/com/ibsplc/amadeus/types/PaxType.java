package com.ibsplc.amadeus.types;

public enum PaxType {

	/**
	 * Adult pax type.
	 */
	ADT("Adult"),
	/**
	 * Youth pax type.
	 */
	B15("Youth"),
	/**
	 * Child pax type.
	 */
	CHD("Child"),
	/**
	 * Child pax type.
	 */
	CNN("Child"),
	/**
	 * Infant pax type.
	 */
	INF("Infant");

	/**
	 * Pax type description.
	 */
	private final String description;

	/**
	 * Constructs a pax type.
	 *
	 * @param description
	 *            pax type description..
	 */
	PaxType(final String description) {
		this.description = description;
	}

	/**
	 * Gets the pax type description.
	 *
	 * @return pax type description.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the corresponding pax type for the given value. If this does not
	 * exist, the provided pax type is returned.
	 *
	 * @param paxType
	 *            pax type to map.
	 * @return mapped pax type.
	 */
	/*
	 * public static String getMappedPaxType(final String paxType) { Properties
	 * paxTypeMapping = FileReader.getProperties("paxtype.properties"); String
	 * mappedPaxType = paxTypeMapping.getProperty(paxType); return mappedPaxType
	 * == null ? paxType : mappedPaxType; }
	 */
}