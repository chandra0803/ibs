package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

public class RegionVO implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	private String regionCode;
	
	private String regionDesc;

	/**
	 * @return the regionCode
	 */
	public String getRegionCode() {
		return regionCode;
	}

	/**
	 * @param regionCode the regionCode to set
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	/**
	 * @return the regionDesc
	 */
	public String getRegionDesc() {
		return regionDesc;
	}

	/**
	 * @param regionDesc the regionDesc to set
	 */
	public void setRegionDesc(String regionDesc) {
		this.regionDesc = regionDesc;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RegionVO [regionCode=" + regionCode + ", regionDesc=" + regionDesc + "]";
	}

	
}
