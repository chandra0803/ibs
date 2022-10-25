package com.ibsplc.reservation.vo;

import com.ibsplc.framework.vo.AbstractVO;

public class RemarkList extends AbstractVO {
	
	private ExtendedRemark extendedRemark;
	
	private MiscellaneousRemarks miscellaneousRemarks;

	public ExtendedRemark getExtendedRemark() {
		return extendedRemark;
	}

	public void setExtendedRemark(ExtendedRemark extendedRemark) {
		this.extendedRemark = extendedRemark;
	}

	public MiscellaneousRemarks getMiscellaneousRemarks() {
		return miscellaneousRemarks;
	}

	public void setMiscellaneousRemarks(MiscellaneousRemarks miscellaneousRemarks) {
		this.miscellaneousRemarks = miscellaneousRemarks;
	}
	
	
	
}
