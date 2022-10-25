package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class WayPoint implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;

	private String wp_id;
	private String status;
	private String leg_name;
	private String leg_type;
	private String fir_1;
	private String fir_2;
	private String airway;
	private String variation;
	private String magnetic_track;
	private String true_track;
	private String distance;
	private String distance_acc;
	private String distance_remaining;
	private String pos_ident_1;
	private String pos_ident_2;
	private String pos_type;
	private String pos_frequency;
	private String time_leg;
	private String time_acc;
	private String time_remaining;
	private String eto;
	private String reto;
	private String ato;
	private String fl;
	private String mora;
	private String tas;
	private String gs;
	private String wv_w;
	private String wv_v;
	private String wv_wc_dir;
	private String wv_wc_qty;
	private String wv_cat;
	private String sat;
	private String isa;
	private String temp;
	private String fuel_flow;
	private String fuel_flow_eng;
	private String fuel_used;
	private String fuel_rem;
	private String fuel_rem_ind;
	private String fuel_rem_calc;
	private String fuel_req;
	private String opt_fl;
	private String opt_fuel;
	private String opt_fl_gs;
	private String opt_gs;
	private String lat;
	private String lon;
	private String leg_route;
	private String fuel;
	private String meta;
	private String waypoint_remarks;
	public String getWp_id() {
		return wp_id;
	}
	public void setWp_id(String wp_id) {
		this.wp_id = wp_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getLeg_name() {
		return leg_name;
	}
	public void setLeg_name(String leg_name) {
		this.leg_name = leg_name;
	}
	public String getLeg_type() {
		return leg_type;
	}
	public void setLeg_type(String leg_type) {
		this.leg_type = leg_type;
	}
	public String getFir_1() {
		return fir_1;
	}
	public void setFir_1(String fir_1) {
		this.fir_1 = fir_1;
	}
	public String getFir_2() {
		return fir_2;
	}
	public void setFir_2(String fir_2) {
		this.fir_2 = fir_2;
	}
	public String getAirway() {
		return airway;
	}
	public void setAirway(String airway) {
		this.airway = airway;
	}
	public String getTrue_track() {
		return true_track;
	}
	public void setTrue_track(String true_track) {
		this.true_track = true_track;
	}
	public String getDistance() {
		return distance;
	}
	public void setDistance(String distance) {
		this.distance = distance;
	}
	public String getDistance_acc() {
		return distance_acc;
	}
	public void setDistance_acc(String distance_acc) {
		this.distance_acc = distance_acc;
	}
	public String getDistance_remaining() {
		return distance_remaining;
	}
	public void setDistance_remaining(String distance_remaining) {
		this.distance_remaining = distance_remaining;
	}
	public String getPos_ident_1() {
		return pos_ident_1;
	}
	public void setPos_ident_1(String pos_ident_1) {
		this.pos_ident_1 = pos_ident_1;
	}
	public String getPos_ident_2() {
		return pos_ident_2;
	}
	public void setPos_ident_2(String pos_ident_2) {
		this.pos_ident_2 = pos_ident_2;
	}
	public String getPos_type() {
		return pos_type;
	}
	public void setPos_type(String pos_type) {
		this.pos_type = pos_type;
	}
	public String getPos_frequency() {
		return pos_frequency;
	}
	public void setPos_frequency(String pos_frequency) {
		this.pos_frequency = pos_frequency;
	}
	public String getEto() {
		return eto;
	}
	public void setEto(String eto) {
		this.eto = eto;
	}
	public String getReto() {
		return reto;
	}
	public void setReto(String reto) {
		this.reto = reto;
	}
	public String getAto() {
		return ato;
	}
	public void setAto(String ato) {
		this.ato = ato;
	}
	public String getFl() {
		return fl;
	}
	public void setFl(String fl) {
		this.fl = fl;
	}
	public String getMora() {
		return mora;
	}
	public void setMora(String mora) {
		this.mora = mora;
	}
	public String getTas() {
		return tas;
	}
	public void setTas(String tas) {
		this.tas = tas;
	}
	public String getGs() {
		return gs;
	}
	public void setGs(String gs) {
		this.gs = gs;
	}
	public String getWv_w() {
		return wv_w;
	}
	public void setWv_w(String wv_w) {
		this.wv_w = wv_w;
	}
	public String getWv_v() {
		return wv_v;
	}
	public void setWv_v(String wv_v) {
		this.wv_v = wv_v;
	}
	public String getWv_wc_dir() {
		return wv_wc_dir;
	}
	public void setWv_wc_dir(String wv_wc_dir) {
		this.wv_wc_dir = wv_wc_dir;
	}
	public String getWv_wc_qty() {
		return wv_wc_qty;
	}
	public void setWv_wc_qty(String wv_wc_qty) {
		this.wv_wc_qty = wv_wc_qty;
	}
	public String getWv_cat() {
		return wv_cat;
	}
	public void setWv_cat(String wv_cat) {
		this.wv_cat = wv_cat;
	}
	public String getSat() {
		return sat;
	}
	public void setSat(String sat) {
		this.sat = sat;
	}
	public String getIsa() {
		return isa;
	}
	public void setIsa(String isa) {
		this.isa = isa;
	}
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getFuel_flow() {
		return fuel_flow;
	}
	public void setFuel_flow(String fuel_flow) {
		this.fuel_flow = fuel_flow;
	}
	public String getFuel_flow_eng() {
		return fuel_flow_eng;
	}
	public void setFuel_flow_eng(String fuel_flow_eng) {
		this.fuel_flow_eng = fuel_flow_eng;
	}
	public String getFuel_used() {
		return fuel_used;
	}
	public void setFuel_used(String fuel_used) {
		this.fuel_used = fuel_used;
	}
	public String getFuel_rem() {
		return fuel_rem;
	}
	public void setFuel_rem(String fuel_rem) {
		this.fuel_rem = fuel_rem;
	}
	public String getFuel_rem_ind() {
		return fuel_rem_ind;
	}
	public void setFuel_rem_ind(String fuel_rem_ind) {
		this.fuel_rem_ind = fuel_rem_ind;
	}
	public String getFuel_rem_calc() {
		return fuel_rem_calc;
	}
	public void setFuel_rem_calc(String fuel_rem_calc) {
		this.fuel_rem_calc = fuel_rem_calc;
	}
	public String getFuel_req() {
		return fuel_req;
	}
	public void setFuel_req(String fuel_req) {
		this.fuel_req = fuel_req;
	}
	public String getOpt_fl() {
		return opt_fl;
	}
	public void setOpt_fl(String opt_fl) {
		this.opt_fl = opt_fl;
	}
	public String getOpt_fuel() {
		return opt_fuel;
	}
	public void setOpt_fuel(String opt_fuel) {
		this.opt_fuel = opt_fuel;
	}
	public String getOpt_fl_gs() {
		return opt_fl_gs;
	}
	public void setOpt_fl_gs(String opt_fl_gs) {
		this.opt_fl_gs = opt_fl_gs;
	}
	public String getOpt_gs() {
		return opt_gs;
	}
	public void setOpt_gs(String opt_gs) {
		this.opt_gs = opt_gs;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLon() {
		return lon;
	}
	public void setLon(String lon) {
		this.lon = lon;
	}
	public String getLeg_route() {
		return leg_route;
	}
	public void setLeg_route(String leg_route) {
		this.leg_route = leg_route;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getMeta() {
		return meta;
	}
	public void setMeta(String meta) {
		this.meta = meta;
	}
	public String getVariation() {
		return variation;
	}
	public void setVariation(String variation) {
		this.variation = variation;
	}
	public String getMagnetic_track() {
		return magnetic_track;
	}
	public void setMagnetic_track(String magnetic_track) {
		this.magnetic_track = magnetic_track;
	}
	public String getTime_leg() {
		return time_leg;
	}
	public void setTime_leg(String time_leg) {
		this.time_leg = time_leg;
	}
	public String getTime_acc() {
		return time_acc;
	}
	public void setTime_acc(String time_acc) {
		this.time_acc = time_acc;
	}
	public String getTime_remaining() {
		return time_remaining;
	}
	public void setTime_remaining(String time_remaining) {
		this.time_remaining = time_remaining;
	}
	public String getWaypoint_remarks() {
		return waypoint_remarks;
	}
	public void setWaypoint_remarks(String waypoint_remarks) {
		this.waypoint_remarks = waypoint_remarks;
	}
	@Override
	public String toString() {
		return "WayPoint [wp_id=" + wp_id + ", status=" + status + ", leg_name=" + leg_name + ", leg_type=" + leg_type
				+ ", fir_1=" + fir_1 + ", fir_2=" + fir_2 + ", airway=" + airway + ", variation=" + variation
				+ ", magnetic_track=" + magnetic_track + ", true_track=" + true_track + ", distance=" + distance
				+ ", distance_acc=" + distance_acc + ", distance_remaining=" + distance_remaining + ", pos_ident_1="
				+ pos_ident_1 + ", pos_ident_2=" + pos_ident_2 + ", pos_type=" + pos_type + ", pos_frequency="
				+ pos_frequency + ", time_leg=" + time_leg + ", time_acc=" + time_acc + ", time_remaining="
				+ time_remaining + ", eto=" + eto + ", reto=" + reto + ", ato=" + ato + ", fl=" + fl + ", mora=" + mora
				+ ", tas=" + tas + ", gs=" + gs + ", wv_w=" + wv_w + ", wv_v=" + wv_v + ", wv_wc_dir=" + wv_wc_dir
				+ ", wv_wc_qty=" + wv_wc_qty + ", wv_cat=" + wv_cat + ", sat=" + sat + ", isa=" + isa + ", temp=" + temp
				+ ", fuel_flow=" + fuel_flow + ", fuel_flow_eng=" + fuel_flow_eng + ", fuel_used=" + fuel_used
				+ ", fuel_rem=" + fuel_rem + ", fuel_rem_ind=" + fuel_rem_ind + ", fuel_rem_calc=" + fuel_rem_calc
				+ ", fuel_req=" + fuel_req + ", opt_fl=" + opt_fl + ", opt_fuel=" + opt_fuel + ", opt_fl_gs="
				+ opt_fl_gs + ", opt_gs=" + opt_gs + ", lat=" + lat + ", lon=" + lon + ", leg_route=" + leg_route
				+ ", fuel=" + fuel + ", meta=" + meta + ", waypoint_remarks=" + waypoint_remarks + "]";
	}

	
}
