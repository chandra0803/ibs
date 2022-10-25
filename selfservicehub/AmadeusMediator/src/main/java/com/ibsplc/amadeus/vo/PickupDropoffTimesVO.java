package com.ibsplc.amadeus.vo;

public class PickupDropoffTimesVO extends AbstractVO {
  private BeginDateTimeVO beginDateTimeVO;
  private EndDateTimeVO endDateTimeVO;
  
  
/**
 * @return the beginDateTimeVO
 */
public BeginDateTimeVO getBeginDateTimeVO() {
	return beginDateTimeVO;
}
/**
 * @param beginDateTimeVO the beginDateTimeVO to set
 */
public void setBeginDateTimeVO(BeginDateTimeVO beginDateTimeVO) {
	this.beginDateTimeVO = beginDateTimeVO;
}
/**
 * @return the endDateTimeVO
 */
public EndDateTimeVO getEndDateTimeVO() {
	return endDateTimeVO;
}
/**
 * @param endDateTimeVO the endDateTimeVO to set
 */
public void setEndDateTimeVO(EndDateTimeVO endDateTimeVO) {
	this.endDateTimeVO = endDateTimeVO;
}
  
   
}
