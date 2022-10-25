package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightObject implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	private String fid;
	private String sp_flight_id;
	private String user_id;
	private String service_provider;
	private String flight_log_name;
	private String flight_name;
	private String dep;
	private String dest;
	private String std;
	private String sta;
	private String eta;
	private String last_edit_date;
	private String version;
	private String status;
	private String status_change_date;
	private String sp_pps_account;
	private String atc_id;
	private String atc_time;
	private String atc_ctot;
	private String atc_addr;
	private String atc_dof;
	private String atc_eet;
	private String atc_status;
	private String aircraft_registration;
	private String aircraft_type;
	private String flight_remark;
	private String alt1;
	private String alt2;
	private String crew_cdr;
	private String crew_cop;
	private String crew_acm_1;
	private String crew_acm_2;
	private String crew_ca_1;
	private String crew_ca_2;
	private String crew_ca_3;
	private String crew_ca_4;
	private String crew_ca_5;
	private String times_ctot;
	private String times_off;
	private String times_on;
	private String times_airb;
	private String times_land;
	private String times_blk;
	private String times_flt;
	private String route_desc;
	private String route_fir_trans;
	private String route_climb;
	private String route_cruise;
	private String route_descend;
	private String route_hold;
	private String route_ratio;
	private String route_gcd;
	private String route_fl;
	private String route_fl_max;
	private String route_fl_min;
	private String route_tt_avg;
	private String route_wv_vcomp;
	private String route_dist_total;
	private String route_dist_alt1;
	private String route_dist_alt2;
	private String route_dist_era;
	private String route_dist_toalt;
	private String dep_icao;
	private String dep_iata;
	private String dep_name;
	private String dep_rwyl;
	private String dep_elev;
	private String dep_rwy;
	private String dep_fac;
	private String dep_ceil;
	private String dep_rvr;
	private String dep_lat;
	private String dep_lon;
	private String dest_icao;
	private String dest_iata;
	private String dest_name;
	private String dest_rwyl;
	private String dest_elev;
	private String dest_fac;
	private String dest_rwy;
	private String dest_ceil;
	private String dest_rvr;
	private String dest_lat;
	private String dest_lon;
	private String alt1_icao;
	private String alt1_iata;
	private String alt1_name;
	private String alt1_rwyl;
	private String alt1_elev;
	private String alt1_fac;
	private String alt1_rwy;
	private String alt1_ceil;
	private String alt1_rvr;
	private String alt1_lat;
	private String alt1_lon;
	private String alt2_icao;
	private String alt2_iata;
	private String alt2_name;
	private String alt2_rwyl;
	private String alt2_elev;
	private String alt2_fac;
	private String alt2_rwy;
	private String alt2_ceil;
	private String alt2_rvr;
	private String alt2_lat;
	private String alt2_lon;
	private String era_icao;
	private String era_iata;
	private String era_name;
	private String era_rwyl;
	private String era_elev;
	private String era_fac;
	private String era_rwy;
	private String era_ceil;
	private String era_rvr;
	private String era_lat;
	private String era_lon;
	private String toalt_icao;
	private String toalt_iata;
	private String toalt_name;
	private String toalt_rwyl;
	private String toalt_elev;
	private String toalt_fac;
	private String toalt_rwy;
	private String toalt_ceil;
	private String toalt_rvr;
	private String toalt_lat;
	private String toalt_lon;
	private String rvsm_sel_alt;
	private String rvsm_pri1;
	private String rvsm_pri2;
	private String rvsm_sby_alt;
	private String to_flaps;
	private String to_anti_ice;
	private String to_rwy_cond;
	private String to_v1;
	private String to_vr;
	private String to_v2;
	private String to_vfr;
	private String to_vft;
	private String to_rpm;
	private String to_pitch;
	private String to_dist;
	private String to_elev;
	private String to_wv_w;
	private String to_wv_v;
	private String to_gust;
	private String to_temp;
	private String to_dew;
	private String to_qnh;
	private String to_v_emg;
	private String to_atis;
	private String ld_flaps;
	private String ld_anti_ice;
	private String ld_rwy_cond;
	private String ld_vref;
	private String ld_vapp;
	private String ld_ga_rpm;
	private String ld_dist;
	private String ld_elev;
	private String ld_wv_w;
	private String ld_wv_v;
	private String ld_gust;
	private String ld_temp;
	private String ld_dew;
	private String ld_qnh;
	private String ld_atis;
	private String sign_check1;
	private String sign_check2;
	private String sign_check3;
	private String sign_check4;
	private String user_remark;
	private String sign;
	private String sign_image;
	private String sign_date;
	private String sign_by_pin;
	private String fuel_trip;
	private String fuel_trip_time;
	private String fuel_cont;
	private String fuel_cont_time;
	private String fuel_alt1;
	private String fuel_alt1_time;
	private String fuel_alt2;
	private String fuel_alt2_time;
	private String fuel_hold;
	private String fuel_hold_time;
	private String fuel_comp;
	private String fuel_comp_time;
	private String fuel_min;
	private String fuel_min_time;
	private String fuel_taxi;
	private String fuel_taxi_time;
	private String fuel_ramp_min;
	private String fuel_extra;
	private String fuel_extra_time;
	private String fuel_ramp;
	private String fuel_ramp_time;
	private String fuel_corr;
	private String fuel_corr_time;
	private String fuel_apu;
	private String fuel_act;
	private String fuel_act_time;
	private String fuel_max;
	private String fuel_take_off;
	private String fuel_on_block;
	private String fuel_gain_loss;
	private String uom_weight;
	private String weight_bo;
	private String weight_payload;
	private String weight_zf;
	private String weight_zf_max;
	private String weight_ramp;
	private String weight_to;
	private String weight_to_max;
	private String weight_ld;
	private String weight_ld_max;
	private String weight_ld_fuel;
	private String load_pax_mfci;
	private String load_paxtot_qty;
	private String load_paxtot_weight;
	private String load_bagtot_weight;
	private String load_fueltot_weight;
	private String wb_distribution;
	private String fir_list;
	private String adequate_airport_list;
	private String alternate_airport_list;
	private String delay_codes;
	private String doc_sigmet;
	private String doc_swx;
	private String doc_vertical;
	private String doc_wind;
	private String doc_runway_analysis;
	private String doc_load_manifest;
	private String weather_updated_on;
	private String flight_completed_on;
	private String flight_updated_on;
	private List<WayPoint> waypoint;
	@JsonProperty("flight_meta")
	private FlightMeta flightMeta; 
	private List<Weather> weather;
	@JsonProperty("fir_notam")
	private List<AirportNotamDetails> firNotam;
	@JsonProperty("airport_notam")
	private List<AirportNotamDetails> airportNotam;
	@JsonProperty("fuel_correction")
	private List<FuelDetails> fuelCorrection; 
	@JsonProperty("airports")
	private List<Airports> airports;
	
	public String getFid() {
		return fid;
	}
	public void setFid(String fid) {
		this.fid = fid;
	}
	public String getSp_flight_id() {
		return sp_flight_id;
	}
	public void setSp_flight_id(String sp_flight_id) {
		this.sp_flight_id = sp_flight_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getService_provider() {
		return service_provider;
	}
	public void setService_provider(String service_provider) {
		this.service_provider = service_provider;
	}
	public String getFlight_log_name() {
		return flight_log_name;
	}
	public void setFlight_log_name(String flight_log_name) {
		this.flight_log_name = flight_log_name;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getSta() {
		return sta;
	}
	public void setSta(String sta) {
		this.sta = sta;
	}
	public String getEta() {
		return eta;
	}
	public void setEta(String eta) {
		this.eta = eta;
	}
	public String getLast_edit_date() {
		return last_edit_date;
	}
	public void setLast_edit_date(String last_edit_date) {
		this.last_edit_date = last_edit_date;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus_change_date() {
		return status_change_date;
	}
	public void setStatus_change_date(String status_change_date) {
		this.status_change_date = status_change_date;
	}
	public String getSp_pps_account() {
		return sp_pps_account;
	}
	public void setSp_pps_account(String sp_pps_account) {
		this.sp_pps_account = sp_pps_account;
	}
	public String getAtc_id() {
		return atc_id;
	}
	public void setAtc_id(String atc_id) {
		this.atc_id = atc_id;
	}

	public String getAtc_ctot() {
		return atc_ctot;
	}
	public void setAtc_ctot(String atc_ctot) {
		this.atc_ctot = atc_ctot;
	}
	public String getAtc_addr() {
		return atc_addr;
	}
	public void setAtc_addr(String atc_addr) {
		this.atc_addr = atc_addr;
	}
	public String getAtc_dof() {
		return atc_dof;
	}
	public void setAtc_dof(String atc_dof) {
		this.atc_dof = atc_dof;
	}
	public String getAtc_eet() {
		return atc_eet;
	}
	public void setAtc_eet(String atc_eet) {
		this.atc_eet = atc_eet;
	}
	public String getAtc_status() {
		return atc_status;
	}
	public void setAtc_status(String atc_status) {
		this.atc_status = atc_status;
	}
	public String getAircraft_type() {
		return aircraft_type;
	}
	public void setAircraft_type(String aircraft_type) {
		this.aircraft_type = aircraft_type;
	}
	public String getFlight_remark() {
		return flight_remark;
	}
	public void setFlight_remark(String flight_remark) {
		this.flight_remark = flight_remark;
	}
	public String getAlt1() {
		return alt1;
	}
	public void setAlt1(String alt1) {
		this.alt1 = alt1;
	}
	public String getAlt2() {
		return alt2;
	}
	public void setAlt2(String alt2) {
		this.alt2 = alt2;
	}
	public String getCrew_cdr() {
		return crew_cdr;
	}
	public void setCrew_cdr(String crew_cdr) {
		this.crew_cdr = crew_cdr;
	}
	public String getCrew_cop() {
		return crew_cop;
	}
	public void setCrew_cop(String crew_cop) {
		this.crew_cop = crew_cop;
	}
	public String getCrew_acm_1() {
		return crew_acm_1;
	}
	public void setCrew_acm_1(String crew_acm_1) {
		this.crew_acm_1 = crew_acm_1;
	}
	public String getCrew_acm_2() {
		return crew_acm_2;
	}
	public void setCrew_acm_2(String crew_acm_2) {
		this.crew_acm_2 = crew_acm_2;
	}
	public String getCrew_ca_1() {
		return crew_ca_1;
	}
	public void setCrew_ca_1(String crew_ca_1) {
		this.crew_ca_1 = crew_ca_1;
	}
	public String getCrew_ca_2() {
		return crew_ca_2;
	}
	public void setCrew_ca_2(String crew_ca_2) {
		this.crew_ca_2 = crew_ca_2;
	}
	public String getCrew_ca_3() {
		return crew_ca_3;
	}
	public void setCrew_ca_3(String crew_ca_3) {
		this.crew_ca_3 = crew_ca_3;
	}
	public String getCrew_ca_4() {
		return crew_ca_4;
	}
	public void setCrew_ca_4(String crew_ca_4) {
		this.crew_ca_4 = crew_ca_4;
	}
	public String getCrew_ca_5() {
		return crew_ca_5;
	}
	public void setCrew_ca_5(String crew_ca_5) {
		this.crew_ca_5 = crew_ca_5;
	}
	public String getRoute_desc() {
		return route_desc;
	}
	public void setRoute_desc(String route_desc) {
		this.route_desc = route_desc;
	}
	public String getRoute_fir_trans() {
		return route_fir_trans;
	}
	public void setRoute_fir_trans(String route_fir_trans) {
		this.route_fir_trans = route_fir_trans;
	}
	public String getRoute_climb() {
		return route_climb;
	}
	public void setRoute_climb(String route_climb) {
		this.route_climb = route_climb;
	}
	public String getRoute_cruise() {
		return route_cruise;
	}
	public void setRoute_cruise(String route_cruise) {
		this.route_cruise = route_cruise;
	}
	public String getRoute_descend() {
		return route_descend;
	}
	public void setRoute_descend(String route_descend) {
		this.route_descend = route_descend;
	}
	public String getRoute_hold() {
		return route_hold;
	}
	public void setRoute_hold(String route_hold) {
		this.route_hold = route_hold;
	}
	public String getRoute_gcd() {
		return route_gcd;
	}
	public void setRoute_gcd(String route_gcd) {
		this.route_gcd = route_gcd;
	}
	public String getRoute_fl() {
		return route_fl;
	}
	public void setRoute_fl(String route_fl) {
		this.route_fl = route_fl;
	}
	public String getRoute_fl_max() {
		return route_fl_max;
	}
	public void setRoute_fl_max(String route_fl_max) {
		this.route_fl_max = route_fl_max;
	}
	public String getRoute_fl_min() {
		return route_fl_min;
	}
	public void setRoute_fl_min(String route_fl_min) {
		this.route_fl_min = route_fl_min;
	}
	public String getRoute_wv_vcomp() {
		return route_wv_vcomp;
	}
	public void setRoute_wv_vcomp(String route_wv_vcomp) {
		this.route_wv_vcomp = route_wv_vcomp;
	}
	public String getRoute_dist_total() {
		return route_dist_total;
	}
	public void setRoute_dist_total(String route_dist_total) {
		this.route_dist_total = route_dist_total;
	}
	public String getRoute_dist_alt1() {
		return route_dist_alt1;
	}
	public void setRoute_dist_alt1(String route_dist_alt1) {
		this.route_dist_alt1 = route_dist_alt1;
	}
	public String getRoute_dist_alt2() {
		return route_dist_alt2;
	}
	public void setRoute_dist_alt2(String route_dist_alt2) {
		this.route_dist_alt2 = route_dist_alt2;
	}
	public String getRoute_dist_era() {
		return route_dist_era;
	}
	public void setRoute_dist_era(String route_dist_era) {
		this.route_dist_era = route_dist_era;
	}
	public String getRoute_dist_toalt() {
		return route_dist_toalt;
	}
	public void setRoute_dist_toalt(String route_dist_toalt) {
		this.route_dist_toalt = route_dist_toalt;
	}
	public String getDep_icao() {
		return dep_icao;
	}
	public void setDep_icao(String dep_icao) {
		this.dep_icao = dep_icao;
	}
	public String getDep_iata() {
		return dep_iata;
	}
	public void setDep_iata(String dep_iata) {
		this.dep_iata = dep_iata;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getDep_rwyl() {
		return dep_rwyl;
	}
	public void setDep_rwyl(String dep_rwyl) {
		this.dep_rwyl = dep_rwyl;
	}
	public String getDep_elev() {
		return dep_elev;
	}
	public void setDep_elev(String dep_elev) {
		this.dep_elev = dep_elev;
	}
	public String getDep_rwy() {
		return dep_rwy;
	}
	public void setDep_rwy(String dep_rwy) {
		this.dep_rwy = dep_rwy;
	}
	public String getDep_fac() {
		return dep_fac;
	}
	public void setDep_fac(String dep_fac) {
		this.dep_fac = dep_fac;
	}
	public String getDep_ceil() {
		return dep_ceil;
	}
	public void setDep_ceil(String dep_ceil) {
		this.dep_ceil = dep_ceil;
	}
	public String getDep_rvr() {
		return dep_rvr;
	}
	public void setDep_rvr(String dep_rvr) {
		this.dep_rvr = dep_rvr;
	}
	public String getDep_lat() {
		return dep_lat;
	}
	public void setDep_lat(String dep_lat) {
		this.dep_lat = dep_lat;
	}
	public String getDep_lon() {
		return dep_lon;
	}
	public void setDep_lon(String dep_lon) {
		this.dep_lon = dep_lon;
	}
	public String getDest_icao() {
		return dest_icao;
	}
	public void setDest_icao(String dest_icao) {
		this.dest_icao = dest_icao;
	}
	public String getDest_iata() {
		return dest_iata;
	}
	public void setDest_iata(String dest_iata) {
		this.dest_iata = dest_iata;
	}
	public String getDest_name() {
		return dest_name;
	}
	public void setDest_name(String dest_name) {
		this.dest_name = dest_name;
	}
	public String getDest_rwyl() {
		return dest_rwyl;
	}
	public void setDest_rwyl(String dest_rwyl) {
		this.dest_rwyl = dest_rwyl;
	}
	public String getDest_elev() {
		return dest_elev;
	}
	public void setDest_elev(String dest_elev) {
		this.dest_elev = dest_elev;
	}
	public String getDest_fac() {
		return dest_fac;
	}
	public void setDest_fac(String dest_fac) {
		this.dest_fac = dest_fac;
	}
	public String getDest_rwy() {
		return dest_rwy;
	}
	public void setDest_rwy(String dest_rwy) {
		this.dest_rwy = dest_rwy;
	}
	public String getDest_ceil() {
		return dest_ceil;
	}
	public void setDest_ceil(String dest_ceil) {
		this.dest_ceil = dest_ceil;
	}
	public String getDest_rvr() {
		return dest_rvr;
	}
	public void setDest_rvr(String dest_rvr) {
		this.dest_rvr = dest_rvr;
	}
	public String getDest_lat() {
		return dest_lat;
	}
	public void setDest_lat(String dest_lat) {
		this.dest_lat = dest_lat;
	}
	public String getDest_lon() {
		return dest_lon;
	}
	public void setDest_lon(String dest_lon) {
		this.dest_lon = dest_lon;
	}
	public String getAlt1_icao() {
		return alt1_icao;
	}
	public void setAlt1_icao(String alt1_icao) {
		this.alt1_icao = alt1_icao;
	}
	public String getAlt1_iata() {
		return alt1_iata;
	}
	public void setAlt1_iata(String alt1_iata) {
		this.alt1_iata = alt1_iata;
	}
	public String getAlt1_name() {
		return alt1_name;
	}
	public void setAlt1_name(String alt1_name) {
		this.alt1_name = alt1_name;
	}
	public String getAlt1_rwyl() {
		return alt1_rwyl;
	}
	public void setAlt1_rwyl(String alt1_rwyl) {
		this.alt1_rwyl = alt1_rwyl;
	}
	public String getAlt1_elev() {
		return alt1_elev;
	}
	public void setAlt1_elev(String alt1_elev) {
		this.alt1_elev = alt1_elev;
	}
	public String getAlt1_fac() {
		return alt1_fac;
	}
	public void setAlt1_fac(String alt1_fac) {
		this.alt1_fac = alt1_fac;
	}
	public String getAlt1_rwy() {
		return alt1_rwy;
	}
	public void setAlt1_rwy(String alt1_rwy) {
		this.alt1_rwy = alt1_rwy;
	}
	public String getAlt1_ceil() {
		return alt1_ceil;
	}
	public void setAlt1_ceil(String alt1_ceil) {
		this.alt1_ceil = alt1_ceil;
	}
	public String getAlt1_rvr() {
		return alt1_rvr;
	}
	public void setAlt1_rvr(String alt1_rvr) {
		this.alt1_rvr = alt1_rvr;
	}
	public String getAlt1_lat() {
		return alt1_lat;
	}
	public void setAlt1_lat(String alt1_lat) {
		this.alt1_lat = alt1_lat;
	}
	public String getAlt1_lon() {
		return alt1_lon;
	}
	public void setAlt1_lon(String alt1_lon) {
		this.alt1_lon = alt1_lon;
	}
	public String getAlt2_icao() {
		return alt2_icao;
	}
	public void setAlt2_icao(String alt2_icao) {
		this.alt2_icao = alt2_icao;
	}
	public String getAlt2_iata() {
		return alt2_iata;
	}
	public void setAlt2_iata(String alt2_iata) {
		this.alt2_iata = alt2_iata;
	}
	public String getAlt2_name() {
		return alt2_name;
	}
	public void setAlt2_name(String alt2_name) {
		this.alt2_name = alt2_name;
	}
	public String getAlt2_rwyl() {
		return alt2_rwyl;
	}
	public void setAlt2_rwyl(String alt2_rwyl) {
		this.alt2_rwyl = alt2_rwyl;
	}
	public String getAlt2_elev() {
		return alt2_elev;
	}
	public void setAlt2_elev(String alt2_elev) {
		this.alt2_elev = alt2_elev;
	}
	public String getAlt2_fac() {
		return alt2_fac;
	}
	public void setAlt2_fac(String alt2_fac) {
		this.alt2_fac = alt2_fac;
	}
	public String getAlt2_rwy() {
		return alt2_rwy;
	}
	public void setAlt2_rwy(String alt2_rwy) {
		this.alt2_rwy = alt2_rwy;
	}
	public String getAlt2_ceil() {
		return alt2_ceil;
	}
	public void setAlt2_ceil(String alt2_ceil) {
		this.alt2_ceil = alt2_ceil;
	}
	public String getAlt2_rvr() {
		return alt2_rvr;
	}
	public void setAlt2_rvr(String alt2_rvr) {
		this.alt2_rvr = alt2_rvr;
	}
	public String getAlt2_lat() {
		return alt2_lat;
	}
	public void setAlt2_lat(String alt2_lat) {
		this.alt2_lat = alt2_lat;
	}
	public String getAlt2_lon() {
		return alt2_lon;
	}
	public void setAlt2_lon(String alt2_lon) {
		this.alt2_lon = alt2_lon;
	}
	public String getEra_icao() {
		return era_icao;
	}
	public void setEra_icao(String era_icao) {
		this.era_icao = era_icao;
	}
	public String getEra_iata() {
		return era_iata;
	}
	public void setEra_iata(String era_iata) {
		this.era_iata = era_iata;
	}
	public String getEra_name() {
		return era_name;
	}
	public void setEra_name(String era_name) {
		this.era_name = era_name;
	}
	public String getEra_rwyl() {
		return era_rwyl;
	}
	public void setEra_rwyl(String era_rwyl) {
		this.era_rwyl = era_rwyl;
	}
	public String getEra_elev() {
		return era_elev;
	}
	public void setEra_elev(String era_elev) {
		this.era_elev = era_elev;
	}
	public String getEra_fac() {
		return era_fac;
	}
	public void setEra_fac(String era_fac) {
		this.era_fac = era_fac;
	}
	public String getEra_rwy() {
		return era_rwy;
	}
	public void setEra_rwy(String era_rwy) {
		this.era_rwy = era_rwy;
	}
	public String getEra_ceil() {
		return era_ceil;
	}
	public void setEra_ceil(String era_ceil) {
		this.era_ceil = era_ceil;
	}
	public String getEra_rvr() {
		return era_rvr;
	}
	public void setEra_rvr(String era_rvr) {
		this.era_rvr = era_rvr;
	}
	public String getEra_lat() {
		return era_lat;
	}
	public void setEra_lat(String era_lat) {
		this.era_lat = era_lat;
	}
	public String getEra_lon() {
		return era_lon;
	}
	public void setEra_lon(String era_lon) {
		this.era_lon = era_lon;
	}
	public String getToalt_icao() {
		return toalt_icao;
	}
	public void setToalt_icao(String toalt_icao) {
		this.toalt_icao = toalt_icao;
	}
	public String getToalt_iata() {
		return toalt_iata;
	}
	public void setToalt_iata(String toalt_iata) {
		this.toalt_iata = toalt_iata;
	}
	public String getToalt_name() {
		return toalt_name;
	}
	public void setToalt_name(String toalt_name) {
		this.toalt_name = toalt_name;
	}
	public String getToalt_rwyl() {
		return toalt_rwyl;
	}
	public void setToalt_rwyl(String toalt_rwyl) {
		this.toalt_rwyl = toalt_rwyl;
	}
	public String getToalt_elev() {
		return toalt_elev;
	}
	public void setToalt_elev(String toalt_elev) {
		this.toalt_elev = toalt_elev;
	}
	public String getToalt_fac() {
		return toalt_fac;
	}
	public void setToalt_fac(String toalt_fac) {
		this.toalt_fac = toalt_fac;
	}
	public String getToalt_rwy() {
		return toalt_rwy;
	}
	public void setToalt_rwy(String toalt_rwy) {
		this.toalt_rwy = toalt_rwy;
	}
	public String getToalt_ceil() {
		return toalt_ceil;
	}
	public void setToalt_ceil(String toalt_ceil) {
		this.toalt_ceil = toalt_ceil;
	}
	public String getToalt_rvr() {
		return toalt_rvr;
	}
	public void setToalt_rvr(String toalt_rvr) {
		this.toalt_rvr = toalt_rvr;
	}
	public String getToalt_lat() {
		return toalt_lat;
	}
	public void setToalt_lat(String toalt_lat) {
		this.toalt_lat = toalt_lat;
	}
	public String getToalt_lon() {
		return toalt_lon;
	}
	public void setToalt_lon(String toalt_lon) {
		this.toalt_lon = toalt_lon;
	}
	public String getRvsm_sel_alt() {
		return rvsm_sel_alt;
	}
	public void setRvsm_sel_alt(String rvsm_sel_alt) {
		this.rvsm_sel_alt = rvsm_sel_alt;
	}
	public String getRvsm_pri1() {
		return rvsm_pri1;
	}
	public void setRvsm_pri1(String rvsm_pri1) {
		this.rvsm_pri1 = rvsm_pri1;
	}
	public String getRvsm_pri2() {
		return rvsm_pri2;
	}
	public void setRvsm_pri2(String rvsm_pri2) {
		this.rvsm_pri2 = rvsm_pri2;
	}
	public String getRvsm_sby_alt() {
		return rvsm_sby_alt;
	}
	public void setRvsm_sby_alt(String rvsm_sby_alt) {
		this.rvsm_sby_alt = rvsm_sby_alt;
	}
	public String getTo_flaps() {
		return to_flaps;
	}
	public void setTo_flaps(String to_flaps) {
		this.to_flaps = to_flaps;
	}
	public String getTo_rwy_cond() {
		return to_rwy_cond;
	}
	public void setTo_rwy_cond(String to_rwy_cond) {
		this.to_rwy_cond = to_rwy_cond;
	}
	public String getTo_v1() {
		return to_v1;
	}
	public void setTo_v1(String to_v1) {
		this.to_v1 = to_v1;
	}
	public String getTo_vr() {
		return to_vr;
	}
	public void setTo_vr(String to_vr) {
		this.to_vr = to_vr;
	}
	public String getTo_v2() {
		return to_v2;
	}
	public void setTo_v2(String to_v2) {
		this.to_v2 = to_v2;
	}
	public String getTo_vfr() {
		return to_vfr;
	}
	public void setTo_vfr(String to_vfr) {
		this.to_vfr = to_vfr;
	}
	public String getTo_rpm() {
		return to_rpm;
	}
	public void setTo_rpm(String to_rpm) {
		this.to_rpm = to_rpm;
	}
	public String getTo_pitch() {
		return to_pitch;
	}
	public void setTo_pitch(String to_pitch) {
		this.to_pitch = to_pitch;
	}
	public String getTo_dist() {
		return to_dist;
	}
	public void setTo_dist(String to_dist) {
		this.to_dist = to_dist;
	}
	public String getTo_elev() {
		return to_elev;
	}
	public void setTo_elev(String to_elev) {
		this.to_elev = to_elev;
	}
	public String getTo_wv_w() {
		return to_wv_w;
	}
	public void setTo_wv_w(String to_wv_w) {
		this.to_wv_w = to_wv_w;
	}
	public String getTo_wv_v() {
		return to_wv_v;
	}
	public void setTo_wv_v(String to_wv_v) {
		this.to_wv_v = to_wv_v;
	}
	public String getTo_gust() {
		return to_gust;
	}
	public void setTo_gust(String to_gust) {
		this.to_gust = to_gust;
	}
	public String getTo_temp() {
		return to_temp;
	}
	public void setTo_temp(String to_temp) {
		this.to_temp = to_temp;
	}
	public String getTo_dew() {
		return to_dew;
	}
	public void setTo_dew(String to_dew) {
		this.to_dew = to_dew;
	}
	public String getTo_qnh() {
		return to_qnh;
	}
	public void setTo_qnh(String to_qnh) {
		this.to_qnh = to_qnh;
	}
	public String getTo_v_emg() {
		return to_v_emg;
	}
	public void setTo_v_emg(String to_v_emg) {
		this.to_v_emg = to_v_emg;
	}
	public String getLd_flaps() {
		return ld_flaps;
	}
	public void setLd_flaps(String ld_flaps) {
		this.ld_flaps = ld_flaps;
	}
	public String getLd_rwy_cond() {
		return ld_rwy_cond;
	}
	public void setLd_rwy_cond(String ld_rwy_cond) {
		this.ld_rwy_cond = ld_rwy_cond;
	}
	public String getLd_vref() {
		return ld_vref;
	}
	public void setLd_vref(String ld_vref) {
		this.ld_vref = ld_vref;
	}
	public String getLd_vapp() {
		return ld_vapp;
	}
	public void setLd_vapp(String ld_vapp) {
		this.ld_vapp = ld_vapp;
	}
	public String getLd_ga_rpm() {
		return ld_ga_rpm;
	}
	public void setLd_ga_rpm(String ld_ga_rpm) {
		this.ld_ga_rpm = ld_ga_rpm;
	}
	public String getLd_dist() {
		return ld_dist;
	}
	public void setLd_dist(String ld_dist) {
		this.ld_dist = ld_dist;
	}
	public String getLd_elev() {
		return ld_elev;
	}
	public void setLd_elev(String ld_elev) {
		this.ld_elev = ld_elev;
	}
	public String getLd_wv_w() {
		return ld_wv_w;
	}
	public void setLd_wv_w(String ld_wv_w) {
		this.ld_wv_w = ld_wv_w;
	}
	public String getLd_wv_v() {
		return ld_wv_v;
	}
	public void setLd_wv_v(String ld_wv_v) {
		this.ld_wv_v = ld_wv_v;
	}
	public String getLd_gust() {
		return ld_gust;
	}
	public void setLd_gust(String ld_gust) {
		this.ld_gust = ld_gust;
	}
	public String getLd_temp() {
		return ld_temp;
	}
	public void setLd_temp(String ld_temp) {
		this.ld_temp = ld_temp;
	}
	public String getLd_dew() {
		return ld_dew;
	}
	public void setLd_dew(String ld_dew) {
		this.ld_dew = ld_dew;
	}
	public String getLd_qnh() {
		return ld_qnh;
	}
	public void setLd_qnh(String ld_qnh) {
		this.ld_qnh = ld_qnh;
	}
	public String getSign_check1() {
		return sign_check1;
	}
	public void setSign_check1(String sign_check1) {
		this.sign_check1 = sign_check1;
	}
	public String getSign_check2() {
		return sign_check2;
	}
	public void setSign_check2(String sign_check2) {
		this.sign_check2 = sign_check2;
	}
	public String getSign_check3() {
		return sign_check3;
	}
	public void setSign_check3(String sign_check3) {
		this.sign_check3 = sign_check3;
	}
	public String getSign_check4() {
		return sign_check4;
	}
	public void setSign_check4(String sign_check4) {
		this.sign_check4 = sign_check4;
	}
	public String getUser_remark() {
		return user_remark;
	}
	public void setUser_remark(String user_remark) {
		this.user_remark = user_remark;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getSign_image() {
		return sign_image;
	}
	public void setSign_image(String sign_image) {
		this.sign_image = sign_image;
	}
	public String getSign_date() {
		return sign_date;
	}
	public void setSign_date(String sign_date) {
		this.sign_date = sign_date;
	}
	public String getSign_by_pin() {
		return sign_by_pin;
	}
	public void setSign_by_pin(String sign_by_pin) {
		this.sign_by_pin = sign_by_pin;
	}
	public String getFuel_trip() {
		return fuel_trip;
	}
	public void setFuel_trip(String fuel_trip) {
		this.fuel_trip = fuel_trip;
	}
	public String getFuel_cont() {
		return fuel_cont;
	}
	public void setFuel_cont(String fuel_cont) {
		this.fuel_cont = fuel_cont;
	}
	public String getFuel_alt1() {
		return fuel_alt1;
	}
	public void setFuel_alt1(String fuel_alt1) {
		this.fuel_alt1 = fuel_alt1;
	}
	public String getFuel_alt2() {
		return fuel_alt2;
	}
	public void setFuel_alt2(String fuel_alt2) {
		this.fuel_alt2 = fuel_alt2;
	}
	public String getFuel_hold() {
		return fuel_hold;
	}
	public void setFuel_hold(String fuel_hold) {
		this.fuel_hold = fuel_hold;
	}
	public String getFuel_comp() {
		return fuel_comp;
	}
	public void setFuel_comp(String fuel_comp) {
		this.fuel_comp = fuel_comp;
	}
	public String getFuel_min() {
		return fuel_min;
	}
	public void setFuel_min(String fuel_min) {
		this.fuel_min = fuel_min;
	}
	public String getFuel_taxi() {
		return fuel_taxi;
	}
	public void setFuel_taxi(String fuel_taxi) {
		this.fuel_taxi = fuel_taxi;
	}
	public String getFuel_ramp_min() {
		return fuel_ramp_min;
	}
	public void setFuel_ramp_min(String fuel_ramp_min) {
		this.fuel_ramp_min = fuel_ramp_min;
	}
	public String getFuel_extra() {
		return fuel_extra;
	}
	public void setFuel_extra(String fuel_extra) {
		this.fuel_extra = fuel_extra;
	}
	public String getFuel_ramp() {
		return fuel_ramp;
	}
	public void setFuel_ramp(String fuel_ramp) {
		this.fuel_ramp = fuel_ramp;
	}
	public String getFuel_corr() {
		return fuel_corr;
	}
	public void setFuel_corr(String fuel_corr) {
		this.fuel_corr = fuel_corr;
	}
	public String getFuel_apu() {
		return fuel_apu;
	}
	public void setFuel_apu(String fuel_apu) {
		this.fuel_apu = fuel_apu;
	}
	public String getFuel_act() {
		return fuel_act;
	}
	public void setFuel_act(String fuel_act) {
		this.fuel_act = fuel_act;
	}
	public String getFuel_max() {
		return fuel_max;
	}
	public void setFuel_max(String fuel_max) {
		this.fuel_max = fuel_max;
	}
	public String getFuel_take_off() {
		return fuel_take_off;
	}
	public void setFuel_take_off(String fuel_take_off) {
		this.fuel_take_off = fuel_take_off;
	}
	public String getFuel_on_block() {
		return fuel_on_block;
	}
	public void setFuel_on_block(String fuel_on_block) {
		this.fuel_on_block = fuel_on_block;
	}
	public String getFuel_gain_loss() {
		return fuel_gain_loss;
	}
	public void setFuel_gain_loss(String fuel_gain_loss) {
		this.fuel_gain_loss = fuel_gain_loss;
	}
	public String getUom_weight() {
		return uom_weight;
	}
	public void setUom_weight(String uom_weight) {
		this.uom_weight = uom_weight;
	}
	public String getWeight_bo() {
		return weight_bo;
	}
	public void setWeight_bo(String weight_bo) {
		this.weight_bo = weight_bo;
	}
	public String getWeight_payload() {
		return weight_payload;
	}
	public void setWeight_payload(String weight_payload) {
		this.weight_payload = weight_payload;
	}
	public String getWeight_zf() {
		return weight_zf;
	}
	public void setWeight_zf(String weight_zf) {
		this.weight_zf = weight_zf;
	}
	public String getWeight_zf_max() {
		return weight_zf_max;
	}
	public void setWeight_zf_max(String weight_zf_max) {
		this.weight_zf_max = weight_zf_max;
	}
	public String getWeight_ramp() {
		return weight_ramp;
	}
	public void setWeight_ramp(String weight_ramp) {
		this.weight_ramp = weight_ramp;
	}
	public String getWeight_to() {
		return weight_to;
	}
	public void setWeight_to(String weight_to) {
		this.weight_to = weight_to;
	}
	public String getWeight_to_max() {
		return weight_to_max;
	}
	public void setWeight_to_max(String weight_to_max) {
		this.weight_to_max = weight_to_max;
	}
	public String getWeight_ld() {
		return weight_ld;
	}
	public void setWeight_ld(String weight_ld) {
		this.weight_ld = weight_ld;
	}
	public String getWeight_ld_max() {
		return weight_ld_max;
	}
	public void setWeight_ld_max(String weight_ld_max) {
		this.weight_ld_max = weight_ld_max;
	}
	public String getWeight_ld_fuel() {
		return weight_ld_fuel;
	}
	public void setWeight_ld_fuel(String weight_ld_fuel) {
		this.weight_ld_fuel = weight_ld_fuel;
	}
	public String getLoad_pax_mfci() {
		return load_pax_mfci;
	}
	public void setLoad_pax_mfci(String load_pax_mfci) {
		this.load_pax_mfci = load_pax_mfci;
	}
	public String getLoad_paxtot_qty() {
		return load_paxtot_qty;
	}
	public void setLoad_paxtot_qty(String load_paxtot_qty) {
		this.load_paxtot_qty = load_paxtot_qty;
	}
	public String getLoad_paxtot_weight() {
		return load_paxtot_weight;
	}
	public void setLoad_paxtot_weight(String load_paxtot_weight) {
		this.load_paxtot_weight = load_paxtot_weight;
	}
	public String getLoad_bagtot_weight() {
		return load_bagtot_weight;
	}
	public void setLoad_bagtot_weight(String load_bagtot_weight) {
		this.load_bagtot_weight = load_bagtot_weight;
	}
	public String getLoad_fueltot_weight() {
		return load_fueltot_weight;
	}
	public void setLoad_fueltot_weight(String load_fueltot_weight) {
		this.load_fueltot_weight = load_fueltot_weight;
	}
	public String getFir_list() {
		return fir_list;
	}
	public void setFir_list(String fir_list) {
		this.fir_list = fir_list;
	}
	public String getAdequate_airport_list() {
		return adequate_airport_list;
	}
	public void setAdequate_airport_list(String adequate_airport_list) {
		this.adequate_airport_list = adequate_airport_list;
	}
	public String getAlternate_airport_list() {
		return alternate_airport_list;
	}
	public void setAlternate_airport_list(String alternate_airport_list) {
		this.alternate_airport_list = alternate_airport_list;
	}
	public String getDelay_codes() {
		return delay_codes;
	}
	public void setDelay_codes(String delay_codes) {
		this.delay_codes = delay_codes;
	}
	public String getDoc_sigmet() {
		return doc_sigmet;
	}
	public void setDoc_sigmet(String doc_sigmet) {
		this.doc_sigmet = doc_sigmet;
	}
	public String getDoc_swx() {
		return doc_swx;
	}
	public void setDoc_swx(String doc_swx) {
		this.doc_swx = doc_swx;
	}
	public String getDoc_wind() {
		return doc_wind;
	}
	public void setDoc_wind(String doc_wind) {
		this.doc_wind = doc_wind;
	}
	public String getDoc_runway_analysis() {
		return doc_runway_analysis;
	}
	public void setDoc_runway_analysis(String doc_runway_analysis) {
		this.doc_runway_analysis = doc_runway_analysis;
	}
	public String getDoc_load_manifest() {
		return doc_load_manifest;
	}
	public void setDoc_load_manifest(String doc_load_manifest) {
		this.doc_load_manifest = doc_load_manifest;
	}
	public String getWeather_updated_on() {
		return weather_updated_on;
	}
	public void setWeather_updated_on(String weather_updated_on) {
		this.weather_updated_on = weather_updated_on;
	}
	public String getFlight_completed_on() {
		return flight_completed_on;
	}
	public void setFlight_completed_on(String flight_completed_on) {
		this.flight_completed_on = flight_completed_on;
	}
	public String getFlight_updated_on() {
		return flight_updated_on;
	}
	public void setFlight_updated_on(String flight_updated_on) {
		this.flight_updated_on = flight_updated_on;
	}
	public List<WayPoint> getWaypoint() {
		return waypoint;
	}
	public void setWaypoint(List<WayPoint> waypoint) {
		this.waypoint = waypoint;
	}
	public FlightMeta getFlightMeta() {
		return flightMeta;
	}
	public void setFlightMeta(FlightMeta flightMeta) {
		this.flightMeta = flightMeta;
	}
	
	public List<Weather> getWeather() {
		return weather;
	}
	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}
	public List<AirportNotamDetails> getFirNotam() {
		return firNotam;
	}
	public void setFirNotam(List<AirportNotamDetails> firNotam) {
		this.firNotam = firNotam;
	}
	public List<AirportNotamDetails> getAirportNotam() {
		return airportNotam;
	}
	public void setAirportNotam(List<AirportNotamDetails> airportNotam) {
		this.airportNotam = airportNotam;
	}
	public List<FuelDetails> getFuelCorrection() {
		return fuelCorrection;
	}
	public void setFuelCorrection(List<FuelDetails> fuelCorrection) {
		this.fuelCorrection = fuelCorrection;
	}
	public List<Airports> getAirports() {
		return airports;
	}
	public void setAirports(List<Airports> airports) {
		this.airports = airports;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getAtc_time() {
		return atc_time;
	}
	public void setAtc_time(String atc_time) {
		this.atc_time = atc_time;
	}
	public String getAircraft_registration() {
		return aircraft_registration;
	}
	public void setAircraft_registration(String aircraft_registration) {
		this.aircraft_registration = aircraft_registration;
	}
	public String getTimes_ctot() {
		return times_ctot;
	}
	public void setTimes_ctot(String times_ctot) {
		this.times_ctot = times_ctot;
	}
	public String getTimes_off() {
		return times_off;
	}
	public void setTimes_off(String times_off) {
		this.times_off = times_off;
	}
	public String getTimes_on() {
		return times_on;
	}
	public void setTimes_on(String times_on) {
		this.times_on = times_on;
	}
	public String getTimes_airb() {
		return times_airb;
	}
	public void setTimes_airb(String times_airb) {
		this.times_airb = times_airb;
	}
	public String getTimes_land() {
		return times_land;
	}
	public void setTimes_land(String times_land) {
		this.times_land = times_land;
	}
	public String getTimes_blk() {
		return times_blk;
	}
	public void setTimes_blk(String times_blk) {
		this.times_blk = times_blk;
	}
	public String getTimes_flt() {
		return times_flt;
	}
	public void setTimes_flt(String times_flt) {
		this.times_flt = times_flt;
	}
	public String getRoute_ratio() {
		return route_ratio;
	}
	public void setRoute_ratio(String route_ratio) {
		this.route_ratio = route_ratio;
	}
	public String getRoute_tt_avg() {
		return route_tt_avg;
	}
	public void setRoute_tt_avg(String route_tt_avg) {
		this.route_tt_avg = route_tt_avg;
	}
	public String getTo_anti_ice() {
		return to_anti_ice;
	}
	public void setTo_anti_ice(String to_anti_ice) {
		this.to_anti_ice = to_anti_ice;
	}
	public String getTo_vft() {
		return to_vft;
	}
	public void setTo_vft(String to_vft) {
		this.to_vft = to_vft;
	}
	public String getTo_atis() {
		return to_atis;
	}
	public void setTo_atis(String to_atis) {
		this.to_atis = to_atis;
	}
	public String getLd_anti_ice() {
		return ld_anti_ice;
	}
	public void setLd_anti_ice(String ld_anti_ice) {
		this.ld_anti_ice = ld_anti_ice;
	}
	public String getLd_atis() {
		return ld_atis;
	}
	public void setLd_atis(String ld_atis) {
		this.ld_atis = ld_atis;
	}
	public String getFuel_trip_time() {
		return fuel_trip_time;
	}
	public void setFuel_trip_time(String fuel_trip_time) {
		this.fuel_trip_time = fuel_trip_time;
	}
	public String getFuel_cont_time() {
		return fuel_cont_time;
	}
	public void setFuel_cont_time(String fuel_cont_time) {
		this.fuel_cont_time = fuel_cont_time;
	}
	public String getFuel_alt1_time() {
		return fuel_alt1_time;
	}
	public void setFuel_alt1_time(String fuel_alt1_time) {
		this.fuel_alt1_time = fuel_alt1_time;
	}
	public String getFuel_alt2_time() {
		return fuel_alt2_time;
	}
	public void setFuel_alt2_time(String fuel_alt2_time) {
		this.fuel_alt2_time = fuel_alt2_time;
	}
	public String getFuel_hold_time() {
		return fuel_hold_time;
	}
	public void setFuel_hold_time(String fuel_hold_time) {
		this.fuel_hold_time = fuel_hold_time;
	}
	public String getFuel_comp_time() {
		return fuel_comp_time;
	}
	public void setFuel_comp_time(String fuel_comp_time) {
		this.fuel_comp_time = fuel_comp_time;
	}
	public String getFuel_min_time() {
		return fuel_min_time;
	}
	public void setFuel_min_time(String fuel_min_time) {
		this.fuel_min_time = fuel_min_time;
	}
	public String getFuel_taxi_time() {
		return fuel_taxi_time;
	}
	public void setFuel_taxi_time(String fuel_taxi_time) {
		this.fuel_taxi_time = fuel_taxi_time;
	}
	public String getFuel_extra_time() {
		return fuel_extra_time;
	}
	public void setFuel_extra_time(String fuel_extra_time) {
		this.fuel_extra_time = fuel_extra_time;
	}
	public String getFuel_ramp_time() {
		return fuel_ramp_time;
	}
	public void setFuel_ramp_time(String fuel_ramp_time) {
		this.fuel_ramp_time = fuel_ramp_time;
	}
	public String getFuel_corr_time() {
		return fuel_corr_time;
	}
	public void setFuel_corr_time(String fuel_corr_time) {
		this.fuel_corr_time = fuel_corr_time;
	}
	public String getFuel_act_time() {
		return fuel_act_time;
	}
	public void setFuel_act_time(String fuel_act_time) {
		this.fuel_act_time = fuel_act_time;
	}
	public String getWb_distribution() {
		return wb_distribution;
	}
	public void setWb_distribution(String wb_distribution) {
		this.wb_distribution = wb_distribution;
	}
	public String getDoc_vertical() {
		return doc_vertical;
	}
	public void setDoc_vertical(String doc_vertical) {
		this.doc_vertical = doc_vertical;
	}
	@Override
	public String toString() {
		return "FlightObject [fid=" + fid + ", sp_flight_id=" + sp_flight_id + ", user_id=" + user_id
				+ ", service_provider=" + service_provider + ", flight_log_name=" + flight_log_name + ", flight_name="
				+ flight_name + ", dep=" + dep + ", dest=" + dest + ", std=" + std + ", sta=" + sta + ", eta=" + eta
				+ ", last_edit_date=" + last_edit_date + ", version=" + version + ", status=" + status
				+ ", status_change_date=" + status_change_date + ", sp_pps_account=" + sp_pps_account + ", atc_id="
				+ atc_id + ", atc_time=" + atc_time + ", atc_ctot=" + atc_ctot + ", atc_addr=" + atc_addr + ", atc_dof="
				+ atc_dof + ", atc_eet=" + atc_eet + ", atc_status=" + atc_status + ", aircraft_registration="
				+ aircraft_registration + ", aircraft_type=" + aircraft_type + ", flight_remark=" + flight_remark
				+ ", alt1=" + alt1 + ", alt2=" + alt2 + ", crew_cdr=" + crew_cdr + ", crew_cop=" + crew_cop
				+ ", crew_acm_1=" + crew_acm_1 + ", crew_acm_2=" + crew_acm_2 + ", crew_ca_1=" + crew_ca_1
				+ ", crew_ca_2=" + crew_ca_2 + ", crew_ca_3=" + crew_ca_3 + ", crew_ca_4=" + crew_ca_4 + ", crew_ca_5="
				+ crew_ca_5 + ", times_ctot=" + times_ctot + ", times_off=" + times_off + ", times_on=" + times_on
				+ ", times_airb=" + times_airb + ", times_land=" + times_land + ", times_blk=" + times_blk
				+ ", times_flt=" + times_flt + ", route_desc=" + route_desc + ", route_fir_trans=" + route_fir_trans
				+ ", route_climb=" + route_climb + ", route_cruise=" + route_cruise + ", route_descend=" + route_descend
				+ ", route_hold=" + route_hold + ", route_ratio=" + route_ratio + ", route_gcd=" + route_gcd
				+ ", route_fl=" + route_fl + ", route_fl_max=" + route_fl_max + ", route_fl_min=" + route_fl_min
				+ ", route_tt_avg=" + route_tt_avg + ", route_wv_vcomp=" + route_wv_vcomp + ", route_dist_total="
				+ route_dist_total + ", route_dist_alt1=" + route_dist_alt1 + ", route_dist_alt2=" + route_dist_alt2
				+ ", route_dist_era=" + route_dist_era + ", route_dist_toalt=" + route_dist_toalt + ", dep_icao="
				+ dep_icao + ", dep_iata=" + dep_iata + ", dep_name=" + dep_name + ", dep_rwyl=" + dep_rwyl
				+ ", dep_elev=" + dep_elev + ", dep_rwy=" + dep_rwy + ", dep_fac=" + dep_fac + ", dep_ceil=" + dep_ceil
				+ ", dep_rvr=" + dep_rvr + ", dep_lat=" + dep_lat + ", dep_lon=" + dep_lon + ", dest_icao=" + dest_icao
				+ ", dest_iata=" + dest_iata + ", dest_name=" + dest_name + ", dest_rwyl=" + dest_rwyl + ", dest_elev="
				+ dest_elev + ", dest_fac=" + dest_fac + ", dest_rwy=" + dest_rwy + ", dest_ceil=" + dest_ceil
				+ ", dest_rvr=" + dest_rvr + ", dest_lat=" + dest_lat + ", dest_lon=" + dest_lon + ", alt1_icao="
				+ alt1_icao + ", alt1_iata=" + alt1_iata + ", alt1_name=" + alt1_name + ", alt1_rwyl=" + alt1_rwyl
				+ ", alt1_elev=" + alt1_elev + ", alt1_fac=" + alt1_fac + ", alt1_rwy=" + alt1_rwy + ", alt1_ceil="
				+ alt1_ceil + ", alt1_rvr=" + alt1_rvr + ", alt1_lat=" + alt1_lat + ", alt1_lon=" + alt1_lon
				+ ", alt2_icao=" + alt2_icao + ", alt2_iata=" + alt2_iata + ", alt2_name=" + alt2_name + ", alt2_rwyl="
				+ alt2_rwyl + ", alt2_elev=" + alt2_elev + ", alt2_fac=" + alt2_fac + ", alt2_rwy=" + alt2_rwy
				+ ", alt2_ceil=" + alt2_ceil + ", alt2_rvr=" + alt2_rvr + ", alt2_lat=" + alt2_lat + ", alt2_lon="
				+ alt2_lon + ", era_icao=" + era_icao + ", era_iata=" + era_iata + ", era_name=" + era_name
				+ ", era_rwyl=" + era_rwyl + ", era_elev=" + era_elev + ", era_fac=" + era_fac + ", era_rwy=" + era_rwy
				+ ", era_ceil=" + era_ceil + ", era_rvr=" + era_rvr + ", era_lat=" + era_lat + ", era_lon=" + era_lon
				+ ", toalt_icao=" + toalt_icao + ", toalt_iata=" + toalt_iata + ", toalt_name=" + toalt_name
				+ ", toalt_rwyl=" + toalt_rwyl + ", toalt_elev=" + toalt_elev + ", toalt_fac=" + toalt_fac
				+ ", toalt_rwy=" + toalt_rwy + ", toalt_ceil=" + toalt_ceil + ", toalt_rvr=" + toalt_rvr
				+ ", toalt_lat=" + toalt_lat + ", toalt_lon=" + toalt_lon + ", rvsm_sel_alt=" + rvsm_sel_alt
				+ ", rvsm_pri1=" + rvsm_pri1 + ", rvsm_pri2=" + rvsm_pri2 + ", rvsm_sby_alt=" + rvsm_sby_alt
				+ ", to_flaps=" + to_flaps + ", to_anti_ice=" + to_anti_ice + ", to_rwy_cond=" + to_rwy_cond
				+ ", to_v1=" + to_v1 + ", to_vr=" + to_vr + ", to_v2=" + to_v2 + ", to_vfr=" + to_vfr + ", to_vft="
				+ to_vft + ", to_rpm=" + to_rpm + ", to_pitch=" + to_pitch + ", to_dist=" + to_dist + ", to_elev="
				+ to_elev + ", to_wv_w=" + to_wv_w + ", to_wv_v=" + to_wv_v + ", to_gust=" + to_gust + ", to_temp="
				+ to_temp + ", to_dew=" + to_dew + ", to_qnh=" + to_qnh + ", to_v_emg=" + to_v_emg + ", to_atis="
				+ to_atis + ", ld_flaps=" + ld_flaps + ", ld_anti_ice=" + ld_anti_ice + ", ld_rwy_cond=" + ld_rwy_cond
				+ ", ld_vref=" + ld_vref + ", ld_vapp=" + ld_vapp + ", ld_ga_rpm=" + ld_ga_rpm + ", ld_dist=" + ld_dist
				+ ", ld_elev=" + ld_elev + ", ld_wv_w=" + ld_wv_w + ", ld_wv_v=" + ld_wv_v + ", ld_gust=" + ld_gust
				+ ", ld_temp=" + ld_temp + ", ld_dew=" + ld_dew + ", ld_qnh=" + ld_qnh + ", ld_atis=" + ld_atis
				+ ", sign_check1=" + sign_check1 + ", sign_check2=" + sign_check2 + ", sign_check3=" + sign_check3
				+ ", sign_check4=" + sign_check4 + ", user_remark=" + user_remark + ", sign=" + sign + ", sign_image="
				+ sign_image + ", sign_date=" + sign_date + ", sign_by_pin=" + sign_by_pin + ", fuel_trip=" + fuel_trip
				+ ", fuel_trip_time=" + fuel_trip_time + ", fuel_cont=" + fuel_cont + ", fuel_cont_time="
				+ fuel_cont_time + ", fuel_alt1=" + fuel_alt1 + ", fuel_alt1_time=" + fuel_alt1_time + ", fuel_alt2="
				+ fuel_alt2 + ", fuel_alt2_time=" + fuel_alt2_time + ", fuel_hold=" + fuel_hold + ", fuel_hold_time="
				+ fuel_hold_time + ", fuel_comp=" + fuel_comp + ", fuel_comp_time=" + fuel_comp_time + ", fuel_min="
				+ fuel_min + ", fuel_min_time=" + fuel_min_time + ", fuel_taxi=" + fuel_taxi + ", fuel_taxi_time="
				+ fuel_taxi_time + ", fuel_ramp_min=" + fuel_ramp_min + ", fuel_extra=" + fuel_extra
				+ ", fuel_extra_time=" + fuel_extra_time + ", fuel_ramp=" + fuel_ramp + ", fuel_ramp_time="
				+ fuel_ramp_time + ", fuel_corr=" + fuel_corr + ", fuel_corr_time=" + fuel_corr_time + ", fuel_apu="
				+ fuel_apu + ", fuel_act=" + fuel_act + ", fuel_act_time=" + fuel_act_time + ", fuel_max=" + fuel_max
				+ ", fuel_take_off=" + fuel_take_off + ", fuel_on_block=" + fuel_on_block + ", fuel_gain_loss="
				+ fuel_gain_loss + ", uom_weight=" + uom_weight + ", weight_bo=" + weight_bo + ", weight_payload="
				+ weight_payload + ", weight_zf=" + weight_zf + ", weight_zf_max=" + weight_zf_max + ", weight_ramp="
				+ weight_ramp + ", weight_to=" + weight_to + ", weight_to_max=" + weight_to_max + ", weight_ld="
				+ weight_ld + ", weight_ld_max=" + weight_ld_max + ", weight_ld_fuel=" + weight_ld_fuel
				+ ", load_pax_mfci=" + load_pax_mfci + ", load_paxtot_qty=" + load_paxtot_qty + ", load_paxtot_weight="
				+ load_paxtot_weight + ", load_bagtot_weight=" + load_bagtot_weight + ", load_fueltot_weight="
				+ load_fueltot_weight + ", wb_distribution=" + wb_distribution + ", fir_list=" + fir_list
				+ ", adequate_airport_list=" + adequate_airport_list + ", alternate_airport_list="
				+ alternate_airport_list + ", delay_codes=" + delay_codes + ", doc_sigmet=" + doc_sigmet + ", doc_swx="
				+ doc_swx + ", doc_vertical=" + doc_vertical + ", doc_wind=" + doc_wind + ", doc_runway_analysis="
				+ doc_runway_analysis + ", doc_load_manifest=" + doc_load_manifest + ", weather_updated_on="
				+ weather_updated_on + ", flight_completed_on=" + flight_completed_on + ", flight_updated_on="
				+ flight_updated_on + ", waypoint=" + waypoint + ", flightMeta=" + flightMeta + ", weather=" + weather
				+ ", firNotam=" + firNotam + ", airportNotam=" + airportNotam + ", fuelCorrection=" + fuelCorrection
				+ ", airports=" + airports + "]";
	} 
	
	
	
}
