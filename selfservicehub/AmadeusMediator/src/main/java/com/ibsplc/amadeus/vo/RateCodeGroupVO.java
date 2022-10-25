package com.ibsplc.amadeus.vo;

public class RateCodeGroupVO extends AbstractVO {
	
	private RateCodeInfoVO  rateCodeInfoVO;
	private AdditionalInfoVO  additionalInfoVO;
	

	/**
	 * @return the rateCodeInfoVO
	 */
	public RateCodeInfoVO getRateCodeInfoVO() {
		return rateCodeInfoVO;
	}

	/**
	 * @param rateCodeInfoVO the rateCodeInfoVO to set
	 */
	public void setRateCodeInfoVO(RateCodeInfoVO rateCodeInfoVO) {
		this.rateCodeInfoVO = rateCodeInfoVO;
	}

	/**
	 * @return the additionalInfoVO
	 */
	public AdditionalInfoVO getAdditionalInfoVO() {
		return additionalInfoVO;
	}

	/**
	 * @param additionalInfoVO the additionalInfoVO to set
	 */
	public void setAdditionalInfoVO(AdditionalInfoVO additionalInfoVO) {
		this.additionalInfoVO = additionalInfoVO;
	}
	
	
}
