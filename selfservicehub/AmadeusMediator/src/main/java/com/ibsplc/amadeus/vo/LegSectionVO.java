package com.ibsplc.amadeus.vo;

import java.util.List;

public class LegSectionVO extends AbstractVO {
	
	private List<ElementManagementStructDataVO> elementManagementStructDataVO;
	private List<ReferenceForStructDataElementVO> referenceForStructDataElementVO;
	private List<DcsLegInfoVO> dcsLegInfoVO;
	
	/**
	 * @return the elementManagementStructDataVO
	 */
	public List<ElementManagementStructDataVO> getElementManagementStructDataVO() {
		return elementManagementStructDataVO;
	}
	/**
	 * @param elementManagementStructDataVO the elementManagementStructDataVO to set
	 */
	public void setElementManagementStructDataVO(List<ElementManagementStructDataVO> elementManagementStructDataVO) {
		this.elementManagementStructDataVO = elementManagementStructDataVO;
	}
	/**
	 * @return the referenceForStructDataElementVO
	 */
	public List<ReferenceForStructDataElementVO> getReferenceForStructDataElementVO() {
		return referenceForStructDataElementVO;
	}
	/**
	 * @param referenceForStructDataElementVO the referenceForStructDataElementVO to set
	 */
	public void setReferenceForStructDataElementVO(List<ReferenceForStructDataElementVO> referenceForStructDataElementVO) {
		this.referenceForStructDataElementVO = referenceForStructDataElementVO;
	}
	/**
	 * @return the dcsLegInfoVO
	 */
	public List<DcsLegInfoVO> getDcsLegInfoVO() {
		return dcsLegInfoVO;
	}
	/**
	 * @param dcsLegInfoVO the dcsLegInfoVO to set
	 */
	public void setDcsLegInfoVO(List<DcsLegInfoVO> dcsLegInfoVO) {
		this.dcsLegInfoVO = dcsLegInfoVO;
	}

	
}
