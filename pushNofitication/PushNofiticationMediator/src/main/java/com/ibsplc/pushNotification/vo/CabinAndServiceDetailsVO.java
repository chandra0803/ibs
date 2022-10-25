package com.ibsplc.pushNotification.vo;

public class CabinAndServiceDetailsVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	/**
	 * Cabin Details
	 */
	private CabinDetailsVO cabinDetails;
	/**
	 * Service class
	 */
	private String serviceClass;

	/**
	 * @return the cabinDetails
	 */
	public CabinDetailsVO getCabinDetails() {
		return cabinDetails;
	}

	/**
	 * @param cabinDetails
	 *            the cabinDetails to set
	 */
	public void setCabinDetails(CabinDetailsVO cabinDetails) {
		this.cabinDetails = cabinDetails;
	}

	/**
	 * @return the serviceClass
	 */
	public String getServiceClass() {
		return serviceClass;
	}

	/**
	 * @param serviceClass
	 *            the serviceClass to set
	 */
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}

}
