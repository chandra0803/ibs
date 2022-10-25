package com.ibsplc.amadeus.types;

public enum MonetaryAmountType {

	/**
	 * Total fare, taxes and fees
	 */
	_712,
	/**
	 * Total taxes to be paid in cash
	 */
	ACC,
	/**
	 * Base fare
	 */
	B,
	/**
	 * Balance Fare Converted in Points
	 */
	BBP,
	/**
	 * BT first issue
	 */
	BT,
	/**
	 * Balance total taxes in cash
	 */
	BTT,
	/**
	 * Balance discount
	 */
	DB,

	/**
	 * Discount
	 */
	DC,

	/**
	 * Equivalent fare
	 */
	E,
	/**
	 * Estimated Point to be accrued
	 */
	EPT,
	/**
	 * Equivalent published amount
	 */
	EPU,
	/**
	 * First issue
	 */
	F,
	/**
	 * Net fare amount
	 */
	H,
	/**
	 * IT first issue
	 */
	IT,
	/**
	 * Fare Amount Converted to Miles
	 */
	MIL,
	/**
	 * Manual net fare
	 */
	MNT,
	/**
	 * Publish in Filing Currency
	 */
	PF,
	/**
	 * Fare Amount Converted in Point (Miles & Cash)
	 */
	PTS,
	/**
	 * Published amount
	 */
	PU,
	/**
	 * Reissue or exchange
	 */
	R,
	/**
	 * Remained cash to paid without taxes
	 */
	RCP,
	/**
	 * Total Additional collection in points
	 */
	TAP,
	/**
	 * Total Additional Collection of the remaining amount in cash
	 */
	TAR,
	/**
	 * Ticket Difference of the remaining amount in cash
	 */
	TDR,
	/**
	 * Total fare
	 */
	TFT,
	/**
	 * Tax Advantage - Geldwerter Vorteil
	 */
	TGV,
	/**
	 * Total fees amount
	 */
	TOF,
	/**
	 * Tax Advantage - Produktflug
	 */
	TPF,
	/**
	 * Total amount remains to be paid in cash
	 */
	TRC,
	/**
	 * Total taxes to be paid in cash
	 */
	TTC,
	/**
	 * BT reissue or exchange
	 */
	W,
	/**
	 * IT reissue or exchange
	 */
	Y;

	public static final String TOTAL_FARE = "712";
}
