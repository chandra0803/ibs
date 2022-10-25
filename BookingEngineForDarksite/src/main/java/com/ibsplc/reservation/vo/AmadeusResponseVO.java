package com.ibsplc.reservation.vo;

import java.io.Serializable;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * @author a-5316
 *
 */
public class AmadeusResponseVO extends AbstractVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String resultCode;

	private String resultMessage;

	private String sessionId;

	private String sequenceNumber;

	private String securityToken;

	private PnrDetailsVO pnrDetails = new PnrDetailsVO();

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public PnrDetailsVO getPnrDetails() {
		return pnrDetails;
	}

	public void setPnrDetails(PnrDetailsVO pnrDetails) {
		this.pnrDetails = pnrDetails;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getSecurityToken() {
		return securityToken;
	}

	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
	}

	@Override
	public String toString() {
		return "AmadeusResponseVO [resultCode=" + resultCode + ", resultMessage=" + resultMessage + ", sessionId="
				+ sessionId + ", sequenceNumber=" + sequenceNumber + ", securityToken=" + securityToken
				+ ", pnrDetails=" + pnrDetails + "]";
	}

	
}
