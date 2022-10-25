package com.ibsplc.amadeus.vo;

import com.ibsplc.amadeus.vo.AbstractVO;

public class SKNDetailsVO extends AbstractVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This field represents the SKN number of the booking. It is present in the
	 * booking as a line "OSI YY SKN1004"
	 */
	private String sknNumber;

	/**
	 * To indicate whether the booking was paid using lodge cards. For this
	 * purpose, we check if the PNR has the OSI string
	 * "AUTHENTICATION DONE - DO ID/PASSPORT VALIDATION" If this value is false,
	 * it means that the booking was paid with credit card
	 */
	private boolean isLodgeCardUsed;

	/**
	 * This is used to indicate if the booking is a saabiz booking. This can be
	 * found from the presence of the string
	 * "BOOKING ORIGINATES FROM WW4.FLYSAA.COM USING /BOOK  ONBIZ"
	 */
	private boolean isSaaBizBooking;

	/**
	 * This is used to indicate if the booking is a skins booking. This can be
	 * found from the presence of the string
	 * "BOOKING ORIGINATES FROM WW4.FLYSAA.COM USING /SKINSNEW"
	 */
	private boolean isSkinsBooking;

	/**
	 * Return the isLodgeCardUsed
	 * 
	 * @return isLodgeCardUsed.
	 */
	public boolean isLodgeCardUsed() {
		return isLodgeCardUsed;
	}

	/**
	 * The isLodgeCardUsed to set.
	 * 
	 * @param isLodgeCardUsed
	 */
	public void setLodgeCardUsed(boolean hasLodgeCardUsed) {
		this.isLodgeCardUsed = hasLodgeCardUsed;
	}

	/**
	 * Return the isSaaBizBooking
	 * 
	 * @return isSaaBizBooking.
	 */
	public boolean isSaaBizBooking() {
		return isSaaBizBooking;
	}

	/**
	 * The isSaaBizBooking to set.
	 * 
	 * @param isSaaBizBooking
	 */
	public void setSaaBizBooking(boolean isASaaBizBooking) {
		this.isSaaBizBooking = isASaaBizBooking;
	}

	/**
	 * Return the sknNumber
	 * 
	 * @return sknNumber.
	 */
	public String getSknNumber() {
		return sknNumber;
	}

	/**
	 * The sknNumber to set.
	 * 
	 * @param sknNumber
	 */
	public void setSknNumber(String sknNumber) {
		this.sknNumber = sknNumber;
	}

	/**
	 * Return the isSkinsBooking
	 * 
	 * @return isSkinsBooking.
	 */
	public boolean isSkinsBooking() {
		return isSkinsBooking;
	}

	/**
	 * The isSkinsBooking to set.
	 * 
	 * @param isSkinsBooking
	 */
	public void setSkinsBooking(boolean isASkinsBooking) {
		this.isSkinsBooking = isASkinsBooking;
	}

}