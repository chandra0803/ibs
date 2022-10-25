package com.ibsplc.pushNotification.vo;

import java.util.List;

public class LegCabinInformationVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	/**
	 * Cabin And Service Details
	 */
	private CabinAndServiceDetailsVO cabinAndServiceDetails;
	/**
	 * Cabin Figures
	 */
	private List<QuantityDetailsVO> cabinFigures;

	/**
	 * @return the cabinAndServiceDetails
	 */
	public CabinAndServiceDetailsVO getCabinAndServiceDetails() {
		return cabinAndServiceDetails;
	}

	/**
	 * @param cabinAndServiceDetails
	 *            the cabinAndServiceDetails to set
	 */
	public void setCabinAndServiceDetails(CabinAndServiceDetailsVO cabinAndServiceDetails) {
		this.cabinAndServiceDetails = cabinAndServiceDetails;
	}

	/**
	 * @return the cabinFigures
	 */
	public List<QuantityDetailsVO> getCabinFigures() {
		return cabinFigures;
	}

	/**
	 * @param cabinFigures
	 *            the cabinFigures to set
	 */
	public void setCabinFigures(List<QuantityDetailsVO> cabinFigures) {
		this.cabinFigures = cabinFigures;
	}

}
