package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class AirportNotamDetails implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	private String notam_number;
	private String notam_text;
	private String notam_from_date;
	private String notam_to_date;
	private String notam_from_level;
	private String notam_to_level;
	private String notam_fir;
	private String notam_qcode;
	private String notam_ecode;
	private String notam_icao;
	private String notam_uniform_abbreviation;
	private String notam_year;
	public String getNotam_number() {
		return notam_number;
	}
	public void setNotam_number(String notam_number) {
		this.notam_number = notam_number;
	}
	public String getNotam_text() {
		return notam_text;
	}
	public void setNotam_text(String notam_text) {
		this.notam_text = notam_text;
	}
	public String getNotam_from_date() {
		return notam_from_date;
	}
	public void setNotam_from_date(String notam_from_date) {
		this.notam_from_date = notam_from_date;
	}
	public String getNotam_to_date() {
		return notam_to_date;
	}
	public void setNotam_to_date(String notam_to_date) {
		this.notam_to_date = notam_to_date;
	}
	public String getNotam_from_level() {
		return notam_from_level;
	}
	public void setNotam_from_level(String notam_from_level) {
		this.notam_from_level = notam_from_level;
	}
	public String getNotam_to_level() {
		return notam_to_level;
	}
	public void setNotam_to_level(String notam_to_level) {
		this.notam_to_level = notam_to_level;
	}
	public String getNotam_fir() {
		return notam_fir;
	}
	public void setNotam_fir(String notam_fir) {
		this.notam_fir = notam_fir;
	}
	public String getNotam_qcode() {
		return notam_qcode;
	}
	public void setNotam_qcode(String notam_qcode) {
		this.notam_qcode = notam_qcode;
	}
	public String getNotam_ecode() {
		return notam_ecode;
	}
	public void setNotam_ecode(String notam_ecode) {
		this.notam_ecode = notam_ecode;
	}
	public String getNotam_icao() {
		return notam_icao;
	}
	public void setNotam_icao(String notam_icao) {
		this.notam_icao = notam_icao;
	}
	public String getNotam_uniform_abbreviation() {
		return notam_uniform_abbreviation;
	}
	public void setNotam_uniform_abbreviation(String notam_uniform_abbreviation) {
		this.notam_uniform_abbreviation = notam_uniform_abbreviation;
	}
	public String getNotam_year() {
		return notam_year;
	}
	public void setNotam_year(String notam_year) {
		this.notam_year = notam_year;
	}
	@Override
	public String toString() {
		return "AirportNotamDetails [notam_number=" + notam_number + ", notam_text=" + notam_text + ", notam_from_date="
				+ notam_from_date + ", notam_to_date=" + notam_to_date + ", notam_from_level=" + notam_from_level
				+ ", notam_to_level=" + notam_to_level + ", notam_fir=" + notam_fir + ", notam_qcode=" + notam_qcode
				+ ", notam_ecode=" + notam_ecode + ", notam_icao=" + notam_icao + ", notam_uniform_abbreviation="
				+ notam_uniform_abbreviation + ", notam_year=" + notam_year + "]";
	}
	
	
}
