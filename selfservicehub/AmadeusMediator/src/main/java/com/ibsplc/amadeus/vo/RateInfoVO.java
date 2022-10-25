package com.ibsplc.amadeus.vo;

public class RateInfoVO  extends AbstractVO {
	
	private TariffInfoVO tariffInfo;
	private RateInformationVO rateInformation;
	private ChargeDetailsVO  chargeDetails;
	
	/**
	 * @return the tariffInfo
	 */
	public TariffInfoVO getTariffInfo() {
		return tariffInfo;
	}
	/**
	 * @param tariffInfo the tariffInfo to set
	 */
	public void setTariffInfo(TariffInfoVO tariffInfo) {
		this.tariffInfo = tariffInfo;
	}
	/**
	 * @return the rateInformation
	 */
	public RateInformationVO getRateInformation() {
		return rateInformation;
	}
	/**
	 * @param rateInformation the rateInformation to set
	 */
	public void setRateInformation(RateInformationVO rateInformation) {
		this.rateInformation = rateInformation;
	}
	/**
	 * @return the chargeDetails
	 */
	public ChargeDetailsVO getChargeDetails() {
		return chargeDetails;
	}
	/**
	 * @param chargeDetails the chargeDetails to set
	 */
	public void setChargeDetails(ChargeDetailsVO chargeDetails) {
		this.chargeDetails = chargeDetails;
	} 
	
}
