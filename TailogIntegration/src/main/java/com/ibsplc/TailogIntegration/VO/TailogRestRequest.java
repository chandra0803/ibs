package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

import com.ibsplc.TailogIntegration.VO.AbstractVO;

public class TailogRestRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fromDate;
	private String toDate;
	private String updateDate;
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "TailogRestRequest [fromDate=" + fromDate + ", toDate=" + toDate + ", updateDate=" + updateDate + "]";
	}
	
}
