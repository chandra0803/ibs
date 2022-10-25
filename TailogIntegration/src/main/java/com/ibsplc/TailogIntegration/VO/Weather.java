package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class Weather implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	private String icao;
	private String name;
	private String name_short;
	private String atis_string;
	private String atis_json;
	private String metar;
	private String taf_type;
	private String taf_text;
	
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName_short() {
		return name_short;
	}
	public void setName_short(String name_short) {
		this.name_short = name_short;
	}
	public String getMetar() {
		return metar;
	}
	public void setMetar(String metar) {
		this.metar = metar;
	}
	public String getTaf_type() {
		return taf_type;
	}
	public void setTaf_type(String taf_type) {
		this.taf_type = taf_type;
	}
	public String getTaf_text() {
		return taf_text;
	}
	public void setTaf_text(String taf_text) {
		this.taf_text = taf_text;
	}
	public String getAtis_string() {
		return atis_string;
	}
	public void setAtis_string(String atis_string) {
		this.atis_string = atis_string;
	}
	public String getAtis_json() {
		return atis_json;
	}
	public void setAtis_json(String atis_json) {
		this.atis_json = atis_json;
	}
	@Override
	public String toString() {
		return "Weather [icao=" + icao + ", name=" + name + ", name_short=" + name_short + ", atis_string="
				+ atis_string + ", atis_json=" + atis_json + ", metar=" + metar + ", taf_type=" + taf_type
				+ ", taf_text=" + taf_text + "]";
	}
	
	
}
