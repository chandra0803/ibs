package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class Airports implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	private String airport_id;
	private String icao;
	private String iata;
	private String fir;
	private double latitude;
	private double longitude;
	private String name;
	private String country;
	private double var;
	private double elev;
	private double rwyl;
	private List<Runways> runways;
	
	public String getAirport_id() {
		return airport_id;
	}
	public void setAirport_id(String airport_id) {
		this.airport_id = airport_id;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getFir() {
		return fir;
	}
	public void setFir(String fir) {
		this.fir = fir;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getVar() {
		return var;
	}
	public void setVar(double var) {
		this.var = var;
	}
	public double getElev() {
		return elev;
	}
	public void setElev(double elev) {
		this.elev = elev;
	}
	public double getRwyl() {
		return rwyl;
	}
	public void setRwyl(double rwyl) {
		this.rwyl = rwyl;
	}
	public List<Runways> getRunways() {
		return runways;
	}
	public void setRunways(List<Runways> runways) {
		this.runways = runways;
	}
	@Override
	public String toString() {
		return "Airports [airport_id=" + airport_id + ", icao=" + icao + ", iata=" + iata + ", fir=" + fir
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", name=" + name + ", country=" + country
				+ ", var=" + var + ", elev=" + elev + ", rwyl=" + rwyl + ", runways=" + runways + "]";
	}
	
	
	
}
