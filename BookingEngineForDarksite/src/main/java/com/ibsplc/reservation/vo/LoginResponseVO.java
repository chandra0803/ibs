package com.ibsplc.reservation.vo;

import com.ibsplc.framework.vo.CommonResponseVO;

public class LoginResponseVO extends CommonResponseVO {

	private static final long serialVersionUID = 1L;
	
	private String LoginRedirectUrl;
	private String isRedirectedToSAA;

	public String getLoginRedirectUrl() {
		return LoginRedirectUrl;
	}

	public void setLoginRedirectUrl(String loginRedirectUrl) {
		LoginRedirectUrl = loginRedirectUrl;
	}

	public String getIsRedirectedToSAA() {
		return isRedirectedToSAA;
	}

	public void setIsRedirectedToSAA(String isRedirectedToSAA) {
		this.isRedirectedToSAA = isRedirectedToSAA;
	}

	@Override
	public String toString() {
		return "LoginResponseVO [LoginRedirectUrl=" + LoginRedirectUrl + ", isRedirectedToSAA=" + isRedirectedToSAA
				+ "]";
	}

}
