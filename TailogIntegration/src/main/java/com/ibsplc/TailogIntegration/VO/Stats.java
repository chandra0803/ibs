package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class Stats implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;

	private double ts;
	private double et;
	public double getTs() {
		return ts;
	}
	public void setTs(double ts) {
		this.ts = ts;
	}
	public double getEt() {
		return et;
	}
	public void setEt(double et) {
		this.et = et;
	}
	@Override
	public String toString() {
		return "Stats [ts=" + ts + ", et=" + et + "]";
	}

}
