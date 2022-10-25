package com.ibsplc.reservation.vo;

import java.util.List;

import com.ibsplc.common.vo.FareInfoVO;
import com.ibsplc.common.vo.TaxVO;
import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class TicketProcessVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	/**
	 * This is the tax associated with the Ticket/EMD
	 */
	private List<TaxVO> taxDetails;
	/**
	 * This is the tax associated with the Ticket/EMD
	 */
	private List<FareInfoVO> fareInfoDetails;
	/**
	 * Sequence Number
	 */
	private String sequenceNumber;
	/**
	 * Session ID
	 */
	private String serviceSessionId;
	/**
	 * Security Token
	 */
	private String securityToken;

	public List<TaxVO> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<TaxVO> taxDetails) {
		this.taxDetails = taxDetails;
	}

	public List<FareInfoVO> getFareInfoDetails() {
		return fareInfoDetails;
	}

	public void setFareInfoDetails(List<FareInfoVO> fareInfoDetails) {
		this.fareInfoDetails = fareInfoDetails;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getServiceSessionId() {
		return serviceSessionId;
	}

	public void setServiceSessionId(String serviceSessionId) {
		this.serviceSessionId = serviceSessionId;
	}

	public String getSecurityToken() {
		return securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}

}
