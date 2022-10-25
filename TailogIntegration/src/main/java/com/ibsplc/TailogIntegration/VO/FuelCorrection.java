package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class FuelCorrection implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
	
	private List<FuelDetails> fuelDetails;

	public List<FuelDetails> getFuelDetails() {
		return fuelDetails;
	}

	public void setFuelDetails(List<FuelDetails> fuelDetails) {
		this.fuelDetails = fuelDetails;
	}

	@Override
	public String toString() {
		return "FuelCorrection [fuelDetails=" + fuelDetails + "]";
	}
}
