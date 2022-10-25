package com.ibsplc.reservation.selfservice.service;

import com.ibsplc.framework.exception.model.SystemException;
import com.ibsplc.reservation.vo.CheckInRequestVO;

public interface RetrieveSelfServicePNRService {
	
	//public  BookingSelfServiceVO getBookingDetailsSelfServcie(LoginRequestSelfServiceVo loginvo) throws SystemException ;
	
	//public  ManageBookingSelfServiceVO createManageBookingVO(LoginRequestSelfServiceVo loginRequestVO) ;
	
	public String getCheckInResponseURLSelfService(CheckInRequestVO checkInRequestVO) throws SystemException;
}



