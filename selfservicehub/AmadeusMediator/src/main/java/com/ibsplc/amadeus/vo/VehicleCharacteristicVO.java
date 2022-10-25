package com.ibsplc.amadeus.vo;

import java.util.ArrayList;
import java.util.List;

public class VehicleCharacteristicVO extends AbstractVO {
	
 private String vehicleTypeOwner;  
 private List<String> vehicleRentalPrefType = new ArrayList<String>();
 
 
/**
 * @return the vehicleTypeOwner
 */
public String getVehicleTypeOwner() {
	return vehicleTypeOwner;
}
/**
 * @param vehicleTypeOwner the vehicleTypeOwner to set
 */
public void setVehicleTypeOwner(String vehicleTypeOwner) {
	this.vehicleTypeOwner = vehicleTypeOwner;
}
/**
 * @return the vehicleRentalPrefType
 */
public List<String> getVehicleRentalPrefType() {
	return vehicleRentalPrefType;
}
/**
 * @param vehicleRentalPrefType the vehicleRentalPrefType to set
 */
public void setVehicleRentalPrefType(List<String> vehicleRentalPrefType) {
	this.vehicleRentalPrefType = vehicleRentalPrefType;
}
  
 
 
}
