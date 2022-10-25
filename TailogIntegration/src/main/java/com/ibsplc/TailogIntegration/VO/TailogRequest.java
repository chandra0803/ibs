package com.ibsplc.TailogIntegration.VO;

public class TailogRequest {

	private String std_from_date;
	private String std_to_date;
	private String aircraft_reg;
	private String dep_dest;
	private String flight_name;
	private String crew;
	
	public String getStd_from_date() {
		return std_from_date;
	}
	public void setStd_from_date(String std_from_date) {
		this.std_from_date = std_from_date;
	}
	public String getStd_to_date() {
		return std_to_date;
	}
	public void setStd_to_date(String std_to_date) {
		this.std_to_date = std_to_date;
	}
	public String getAircraft_reg() {
		return aircraft_reg;
	}
	public void setAircraft_reg(String aircraft_reg) {
		this.aircraft_reg = aircraft_reg;
	}
	public String getDep_dest() {
		return dep_dest;
	}
	public void setDep_dest(String dep_dest) {
		this.dep_dest = dep_dest;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getCrew() {
		return crew;
	}
	public void setCrew(String crew) {
		this.crew = crew;
	}
	@Override
	public String toString() {
		return "TailogRequest [std_from_date=" + std_from_date + ", std_to_date=" + std_to_date + ", aircraft_reg="
				+ aircraft_reg + ", dep_dest=" + dep_dest + ", flight_name=" + flight_name + ", crew=" + crew + "]";
	}
	
	
}
