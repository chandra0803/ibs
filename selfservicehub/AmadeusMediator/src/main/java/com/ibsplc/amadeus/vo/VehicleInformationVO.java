package com.ibsplc.amadeus.vo;

public class VehicleInformationVO extends AbstractVO {
	private VehicleCharacteristicVO vehicleCharacteristicVO;
	private FreeTextDetailsVO freeTextDetails;
	private String carModel;
	
  
	/**
	 * @return the vehicleCharacteristicVO
	 */
	public VehicleCharacteristicVO getVehicleCharacteristicVO() {
		return vehicleCharacteristicVO;
	}

	/**
	 * @param vehicleCharacteristicVO the vehicleCharacteristicVO to set
	 */
	public void setVehicleCharacteristicVO(VehicleCharacteristicVO vehicleCharacteristicVO) {
		this.vehicleCharacteristicVO = vehicleCharacteristicVO;
	}
 

	/**
	 * @return the freeTextDetails
	 */
	public FreeTextDetailsVO getFreeTextDetails() {
		return freeTextDetails;
	}

	/**
	 * @param freeTextDetails the freeTextDetails to set
	 */
	public void setFreeTextDetails(FreeTextDetailsVO freeTextDetails) {
		this.freeTextDetails = freeTextDetails;
	}

	/**
	 * @return the carModel
	 */
	public String getCarModel() {
		return carModel;
	}

	/**
	 * @param carModel the carModel to set
	 */
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	
	

}
