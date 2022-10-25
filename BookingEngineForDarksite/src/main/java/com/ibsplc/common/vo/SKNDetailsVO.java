package com.ibsplc.common.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class SKNDetailsVO extends AbstractVO implements Serializable {
	
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
	 */
	private boolean isSaaBizBooking;

	/**
	 * This is used to indicate if the booking is a skins booking. This can be
	 * found from the presence of the string
	 * "BOOKING ORIGINATES FROM WW4.FLYSAA.COM USING /SKINSNEW"
	 */
	private boolean isSkinsBooking;
	/**
	 * getSknNumber
	 * 
	 * @return the sknNumber
	 */
	public String getSknNumber() {
		return sknNumber;
	}
	/**
	 * The sknNumber to set
	 * 
	 * @param sknNumber
	 */
	public void setSknNumber(String sknNumber) {
		this.sknNumber = sknNumber;
	}
	/**
	 * isLodgeCardUsed
	 * 
	 * @return the isLodgeCardUsed
	 */
	public boolean isLodgeCardUsed() {
		return isLodgeCardUsed;
	}
	/**
	 * The isLodgeCardUsed to set
	 * 
	 * @param isLodgeCardUsed
	 */
	public void setLodgeCardUsed(boolean isLodgeCardUsed) {
		this.isLodgeCardUsed = isLodgeCardUsed;
	}
	/**
	 * isSaaBizBooking
	 * 
	 * @return the isSaaBizBooking
	 */
	public boolean isSaaBizBooking() {
		return isSaaBizBooking;
	}
	/**
	 * The isSaaBizBooking to set
	 * 
	 * @param isSaaBizBooking
	 */
	public void setSaaBizBooking(boolean isSaaBizBooking) {
		this.isSaaBizBooking = isSaaBizBooking;
	}
	/**
	 * isSkinsBooking
	 * 
	 * @return the isSkinsBooking
	 */
	public boolean isSkinsBooking() {
		return isSkinsBooking;
	}
	/**
	 * The isSkinsBooking to set
	 * 
	 * @param isSkinsBooking
	 */
	public void setSkinsBooking(boolean isSkinsBooking) {
		this.isSkinsBooking = isSkinsBooking;
	}

}
