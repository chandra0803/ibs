package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

public class WayPointList implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;

	private List<WayPoint> waypoints;

	public List<WayPoint> getWaypoints() {
		return waypoints;
	}

	public void setWaypoints(List<WayPoint> waypoints) {
		this.waypoints = waypoints;
	}
	
	
}
