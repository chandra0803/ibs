package com.ibsplc.amadeus.vo;

public class AttributeVO  extends AbstractVO {
	
	private String criteriaSetType;
	private CriteriaDetailsVO criteriaDetailsVO;
	
	
	/**
	 * @return the criteriaSetType
	 */
	public String getCriteriaSetType() {
		return criteriaSetType;
	}
	/**
	 * @param criteriaSetType the criteriaSetType to set
	 */
	public void setCriteriaSetType(String criteriaSetType) {
		this.criteriaSetType = criteriaSetType;
	}
	/**
	 * @return the criteriaDetailsVO
	 */
	public CriteriaDetailsVO getCriteriaDetailsVO() {
		return criteriaDetailsVO;
	}
	/**
	 * @param criteriaDetailsVO the criteriaDetailsVO to set
	 */
	public void setCriteriaDetailsVO(CriteriaDetailsVO criteriaDetailsVO) {
		this.criteriaDetailsVO = criteriaDetailsVO;
	}
	
	
	
}
