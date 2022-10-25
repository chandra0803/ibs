package com.ibsplc.amadeus.vo;

import java.math.BigInteger;

public class ChargeDetailsVO  extends AbstractVO {
	
	private String type;
	private String comment;
	private BigInteger numberInParty;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the numberInParty
	 */
	public BigInteger getNumberInParty() {
		return numberInParty;
	}
	/**
	 * @param numberInParty the numberInParty to set
	 */
	public void setNumberInParty(BigInteger numberInParty) {
		this.numberInParty = numberInParty;
	}
	 

}
