package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class RunwayList implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
	
	public List<Runways> runways;

	public List<Runways> getRunways() {
		return runways;
	}

	public void setRunways(List<Runways> runways) {
		this.runways = runways;
	}
	

}
