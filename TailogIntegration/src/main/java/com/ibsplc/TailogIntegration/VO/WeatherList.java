package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class WeatherList implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;

	private List<Weather>  weatherlist;

	public List<Weather> getWeatherlist() {
		return weatherlist;
	}

	public void setWeatherlist(List<Weather> weatherlist) {
		this.weatherlist = weatherlist;
	}
	
	
}
