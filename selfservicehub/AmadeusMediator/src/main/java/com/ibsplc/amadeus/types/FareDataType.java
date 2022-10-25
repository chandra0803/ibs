package com.ibsplc.amadeus.types;

public enum FareDataType {
	/**
	 * ATAF fare
	 */
	A,
	/**
	 * Negotiated fare manually updated
	 */
	B,
	/**
	 * Negotiated fare (airline responsibility)
	 */
	F,
	/**
	 * Negotiated fare (agent responsibility)
	 */
	G,
	/**
	 * IATA fare
	 */
	I,
	/**
	 * Manual fare
	 */
	M,
	/**
	 * Fare basis not validated
	 */
	N,
	/**
	 * RBD override
	 */
	O,
	/**
	 * Inclusive tour
	 */
	T,
	/**
	 * Ignore itinerary at ticket issuance
	 */
	W
}
