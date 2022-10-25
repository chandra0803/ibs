package com.ibsplc.amadeus.types;

public enum PaxSegmentQualifierType {

	/**
	 * Passenger
	 */
	P(null),
	/**
	 * Passenger Adult
	 */
	PA("ADT"),
	/**
	 * Passenger Infant
	 */
	PI("INF"),
	/**
	 * Passenger Ticketed
	 */
	PT(null),
	/**
	 * Segment
	 */
	S(null);

	/**
	 * Pax type associated with this pax segment type.
	 */
	private final String paxType;

	PaxSegmentQualifierType(final String paxType) {
		this.paxType = paxType;
	}

	/**
	 * Gets the pax type associated with this pax segment type.
	 *
	 * @return pax type.
	 */
	public String getPaxType() {
		return paxType;
	}

}
