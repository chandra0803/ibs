package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WSO2Response implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;

    @JsonProperty(required = true)
	private String status;
	private String code;
	private List<WSO2FlightObject> result;
	private Stats stats;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public List<WSO2FlightObject> getResult() {
		return result;
	}
	public void setResult(List<WSO2FlightObject> result) {
		this.result = result;
	}
	public Stats getStats() {
		return stats;
	}
	public void setStats(Stats stats) {
		this.stats = stats;
	}
	@Override
	public String toString() {
		return "TailogResponse [status=" + status + ", code=" + code + ", result=" + result + ", stats=" + stats + "]";
	}
}

