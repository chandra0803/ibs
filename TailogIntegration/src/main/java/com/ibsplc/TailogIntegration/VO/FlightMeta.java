package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FlightMeta implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;

    @JsonProperty(required = false)
	private String gross_climb;
    @JsonProperty(required = false)
	private String fuel_density;
    @JsonProperty(required = false)
	private String destination_fuel_receipt;
    @JsonProperty(required = false)
	private String adequate_airport_list_pdf;
    @JsonProperty(required = false)
	private String fuel_engine_on_mass;
    @JsonProperty(required = false)
	private String change_log; //confirm
    @JsonProperty(required = false)
	private String fuel_before_uplift_mass;
    @JsonProperty(required = false)
	private String fuel_oil_uplift;
    @JsonProperty(required = false)
    private String crew_disp;
    @JsonProperty(required = false)
	private String acceleration;
    @JsonProperty(required = false)
	private String fuel_last_flight_mass;
    @JsonProperty(required = false)
	private String fuel_type;
    @JsonProperty(required = false)
	private String cruise_profile;
    @JsonProperty(required = false)
	private String temp_top_of_climb;
    @JsonProperty(required = false)
	private String flight_route;
    @JsonProperty(required = false)
	private String checklist; //confirm
    @JsonProperty(required = false)
	private String departure_fuel_receipt;
    @JsonProperty(required = false)
	private String fuel_uplift_mass;
    @JsonProperty(required = false)
	private String to_vy;
    @JsonProperty(required = false)
	private String load_manifest;
    @JsonProperty(required = false)
	private String to_v2_flaps_9_15;
    @JsonProperty(required = false)
	private String ld_eng_air;
    @JsonProperty(required = false)
	private String to_v4;
    @JsonProperty(required = false)
	private String pax_qty_dest1;
    @JsonProperty(required = false)
	private String to_vfs;
    @JsonProperty(required = false)
	private String regulated_to_mass;
    @JsonProperty(required = false)
	private String departure3_fuel_receipt;
    @JsonProperty(required = false)
	private String fuel_burned_after_uplift_mass;
    @JsonProperty(required = false)
	private String gufi;
    @JsonProperty(required = false)
	private String fuel_burned_after_engineoff_mass;
    @JsonProperty(required = false)
	private String fuel_rem_after_flight_completion_mass;
    @JsonProperty(required = false)
	private String to_se_acc;
    @JsonProperty(required = false)
	private String to_vref;
    @JsonProperty(required = false)
	private String ld_airport;
    @JsonProperty(required = false)
	private String ld_vyse;
    @JsonProperty(required = false)
	private String to_glide;
    @JsonProperty(required = false)
	private String dep_refuel_volume;
    @JsonProperty(required = false)
	private String star_procedure;
    @JsonProperty(required = false)
	private String dep_refuel_density;
    @JsonProperty(required = false)
	private String rvsm_sel_pri_2_before_fl290;
    @JsonProperty(required = false)
	private String ld_v2_flaps_0;
    @JsonProperty(required = false)
	private String to_vac;
    @JsonProperty(required = false)
	private String sid_procedure;
    @JsonProperty(required = false)
	private String ld_vfs;
    @JsonProperty(required = false)
	private String ld_vfto;
    @JsonProperty(required = false)
	private String rvsm_notification_before_fl290_status;
    @JsonProperty(required = false)
	private String ld_v2_flaps_9;
    @JsonProperty(required = false)
	private String climb_reduced_torque;
    @JsonProperty(required = false)
	private String fuel_burned_before_uplift_mass;
    @JsonProperty(required = false)
	private String aircraft_cycles_pre_flight;
    @JsonProperty(required = false)
	private String rvsm_sel_alt_before_fl290;
    @JsonProperty(required = false)
	private String regulated_ld_mass;
    @JsonProperty(required = false)
	private String rvsm_notification_enroute4_status;
    @JsonProperty(required = false)
	private String ld_vma;
    @JsonProperty(required = false)
	private String security_search_check;
    @JsonProperty(required = false)
	private String to_eng_air;
    @JsonProperty(required = false)
	private String successfull_cat_2;
    @JsonProperty(required = false)
	private String ld_pilot;
    @JsonProperty(required = false)
	private String rvsm_notification_enroute3_status;
    @JsonProperty(required = false)
	private String fuel_weight_volume_segment_index;
    @JsonProperty(required = false)
	private String to_v2_flaps_0;
    @JsonProperty(required = false)
	private String check_cat_2;
    @JsonProperty(required = false)
	private String rvsm_notification_enroute2_status;
    @JsonProperty(required = false)
	private String burned_fuel_mass;
    @JsonProperty(required = false)
	private String ld_vac;
    @JsonProperty(required = false)
	private String rvsm_notification_before_takeoff_status;
    @JsonProperty(required = false)
	private String fuel_load_cb;
    @JsonProperty(required = false)
	private String departure_fuel_provider;
    @JsonProperty(required = false)
	private String to_stab_trim;
    @JsonProperty(required = false)
	private String rvsm_notification_enroute1_status;
    @JsonProperty(required = false)
	private String climb_torque_max;
    @JsonProperty(required = false)
	private String to_vyse;
    @JsonProperty(required = false)
	private String dep_visibility;
    @JsonProperty(required = false)
	private String departure_receipt_number;
    @JsonProperty(required = false)
	private String to_torque_max;
    @JsonProperty(required = false)
	private String actual_trip_fuel;
    @JsonProperty(required = false)
	private String landing_cycles;
    @JsonProperty(required = false)
	private String to_vfto;
    @JsonProperty(required = false)
	private String alt1_route_desc;
    @JsonProperty(required = false)
	private String rvsm_applicable_status;
    @JsonProperty(required = false)
	private String to_engine_pressure_ratio;
    @JsonProperty(required = false)
	private String to_reduced_torque;
    @JsonProperty(required = false)
	private String to_pilot;
    @JsonProperty(required = false)
	private String fuel_engine_burned_mass;
    @JsonProperty(required = false)
	private String to_vx;
    @JsonProperty(required = false)
	private String pax_qty_dest3;
    @JsonProperty(required = false)
	private String all_block_check;
    @JsonProperty(required = false)
	private String to_acceleration_altitude;
    @JsonProperty(required = false)
	private String to_vg;
    @JsonProperty(required = false)
	private String rvsm_sel_pri_1_before_fl290;
    @JsonProperty(required = false)
	private String dest_visibility;
    @JsonProperty(required = false)
	private String departure2_fuel_receipt;
    @JsonProperty(required = false)
	private String aircraft_config_cb;
    @JsonProperty(required = false)
	private String pax_qty_dest2;
    @JsonProperty(required = false)
    private String rvsm_entry_at_fl290;
    @JsonProperty(required = false)
    private String alt2_route_desc;
    @JsonProperty(required = false)
    private String cop_role;
    @JsonProperty(required = false)
    private String cdr_role;
    @JsonProperty(required = false)
    private String aircraft_registered;
    @JsonProperty(required = false)
    private String rvsm_sby_alt_before_fl290;
    @JsonProperty(required = false)
    private String planned_landing_rvr;
    @JsonProperty(required = false)
    private String planned_alt1_runway_length;
    @JsonProperty(required = false)
    private String planned_alt1_ceil;
    @JsonProperty(required = false)
    private String planned_alt1_rvr;
    @JsonProperty(required = false)
    private String planned_landing_ceil;
    @JsonProperty(required = false)
    private String planned_landing_runway_length;
    @JsonProperty(required = false)
    private String departure2_receipt_number;
    @JsonProperty(required = false)
    private String dep2_refuel_volume;
    @JsonProperty(required = false)
    private String departure2_fuel_provider;
    @JsonProperty(required = false)
    private String departure3_receipt_number;
    @JsonProperty(required = false)
    private String dep3_refuel_volume;
    @JsonProperty(required = false)
    private String departure3_fuel_provider;
    @JsonProperty(required = false)
    private String planned_takeoff_rvr;
    @JsonProperty(required = false)
    private String planned_takeoff_fac;
    @JsonProperty(required = false)
    private String planned_landing_runway_name;
    @JsonProperty(required = false)
    private String planned_landing_fac;
    @JsonProperty(required = false)
	private String planned_takeoff_runway_name;
    @JsonProperty(required = false)
    private String planned_takeoff_runway_length;
    @JsonProperty(required = false)
    private String planned_takeoff_ceil;
    @JsonProperty(required = false)
    private String to_n1_ref_redu_flex;
    @JsonProperty(required = false)
    private String isFuelTakeOffEdited;
    @JsonProperty(required = false)
    private String rvsm_entry_at_enroute1;
    @JsonProperty(required = false)
    private String to_torque;
    @JsonProperty(required = false)
    private String ld_ga_torque;
    @JsonProperty(required = false)
    private String rvsm_entry_at_enroute2;
    
	
	public String getTo_torque() {
		return to_torque;
	}
	public void setTo_torque(String to_torque) {
		this.to_torque = to_torque;
	}
	public String getLd_ga_torque() {
		return ld_ga_torque;
	}
	public void setLd_ga_torque(String ld_ga_torque) {
		this.ld_ga_torque = ld_ga_torque;
	}
	public String getRvsm_entry_at_enroute2() {
		return rvsm_entry_at_enroute2;
	}
	public void setRvsm_entry_at_enroute2(String rvsm_entry_at_enroute2) {
		this.rvsm_entry_at_enroute2 = rvsm_entry_at_enroute2;
	}
	public String getGross_climb() {
		return gross_climb;
	}
	public void setGross_climb(String gross_climb) {
		this.gross_climb = gross_climb;
	}
	public String getFuel_density() {
		return fuel_density;
	}
	public void setFuel_density(String fuel_density) {
		this.fuel_density = fuel_density;
	}
	public String getAdequate_airport_list_pdf() {
		return adequate_airport_list_pdf;
	}
	public void setAdequate_airport_list_pdf(String adequate_airport_list_pdf) {
		this.adequate_airport_list_pdf = adequate_airport_list_pdf;
	}
	public String getFuel_engine_on_mass() {
		return fuel_engine_on_mass;
	}
	public void setFuel_engine_on_mass(String fuel_engine_on_mass) {
		this.fuel_engine_on_mass = fuel_engine_on_mass;
	}
	public String getChange_log() {
		return change_log;
	}
	public void setChange_log(String change_log) {
		this.change_log = change_log;
	}
	public String getCrew_disp() {
		return crew_disp;
	}
	public void setCrew_disp(String crew_disp) {
		this.crew_disp = crew_disp;
	}
	public String getFuel_last_flight_mass() {
		return fuel_last_flight_mass;
	}
	public void setFuel_last_flight_mass(String fuel_last_flight_mass) {
		this.fuel_last_flight_mass = fuel_last_flight_mass;
	}
	public String getFuel_type() {
		return fuel_type;
	}
	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}
	public String getCruise_profile() {
		return cruise_profile;
	}
	public void setCruise_profile(String cruise_profile) {
		this.cruise_profile = cruise_profile;
	}
	public String getTemp_top_of_climb() {
		return temp_top_of_climb;
	}
	public void setTemp_top_of_climb(String temp_top_of_climb) {
		this.temp_top_of_climb = temp_top_of_climb;
	}
	public String getFlight_route() {
		return flight_route;
	}
	public void setFlight_route(String flight_route) {
		this.flight_route = flight_route;
	}
	public String getChecklist() {
		return checklist;
	}
	public void setChecklist(String checklist) {
		this.checklist = checklist;
	}
	public String getDeparture_fuel_receipt() {
		return departure_fuel_receipt;
	}
	public void setDeparture_fuel_receipt(String departure_fuel_receipt) {
		this.departure_fuel_receipt = departure_fuel_receipt;
	}
	
	public String getDestination_fuel_receipt() {
		return destination_fuel_receipt;
	}
	public void setDestination_fuel_receipt(String destination_fuel_receipt) {
		this.destination_fuel_receipt = destination_fuel_receipt;
	}
	public String getFuel_before_uplift_mass() {
		return fuel_before_uplift_mass;
	}
	public void setFuel_before_uplift_mass(String fuel_before_uplift_mass) {
		this.fuel_before_uplift_mass = fuel_before_uplift_mass;
	}
	public String getFuel_oil_uplift() {
		return fuel_oil_uplift;
	}
	public void setFuel_oil_uplift(String fuel_oil_uplift) {
		this.fuel_oil_uplift = fuel_oil_uplift;
	}
	public String getAcceleration() {
		return acceleration;
	}
	public void setAcceleration(String acceleration) {
		this.acceleration = acceleration;
	}
	public String getFuel_uplift_mass() {
		return fuel_uplift_mass;
	}
	public void setFuel_uplift_mass(String fuel_uplift_mass) {
		this.fuel_uplift_mass = fuel_uplift_mass;
	}
	public String getTo_vy() {
		return to_vy;
	}
	public void setTo_vy(String to_vy) {
		this.to_vy = to_vy;
	}
	public String getLoad_manifest() {
		return load_manifest;
	}
	public void setLoad_manifest(String load_manifest) {
		this.load_manifest = load_manifest;
	}
	public String getTo_v2_flaps_9_15() {
		return to_v2_flaps_9_15;
	}
	public void setTo_v2_flaps_9_15(String to_v2_flaps_9_15) {
		this.to_v2_flaps_9_15 = to_v2_flaps_9_15;
	}
	public String getLd_eng_air() {
		return ld_eng_air;
	}
	public void setLd_eng_air(String ld_eng_air) {
		this.ld_eng_air = ld_eng_air;
	}
	public String getTo_v4() {
		return to_v4;
	}
	public void setTo_v4(String to_v4) {
		this.to_v4 = to_v4;
	}
	public String getPax_qty_dest1() {
		return pax_qty_dest1;
	}
	public void setPax_qty_dest1(String pax_qty_dest1) {
		this.pax_qty_dest1 = pax_qty_dest1;
	}
	public String getTo_vfs() {
		return to_vfs;
	}
	public void setTo_vfs(String to_vfs) {
		this.to_vfs = to_vfs;
	}
	public String getRegulated_to_mass() {
		return regulated_to_mass;
	}
	public void setRegulated_to_mass(String regulated_to_mass) {
		this.regulated_to_mass = regulated_to_mass;
	}
	public String getDeparture3_fuel_receipt() {
		return departure3_fuel_receipt;
	}
	public void setDeparture3_fuel_receipt(String departure3_fuel_receipt) {
		this.departure3_fuel_receipt = departure3_fuel_receipt;
	}
	public String getFuel_burned_after_uplift_mass() {
		return fuel_burned_after_uplift_mass;
	}
	public void setFuel_burned_after_uplift_mass(String fuel_burned_after_uplift_mass) {
		this.fuel_burned_after_uplift_mass = fuel_burned_after_uplift_mass;
	}
	public String getGufi() {
		return gufi;
	}
	public void setGufi(String gufi) {
		this.gufi = gufi;
	}
	public String getFuel_burned_after_engineoff_mass() {
		return fuel_burned_after_engineoff_mass;
	}
	public void setFuel_burned_after_engineoff_mass(String fuel_burned_after_engineoff_mass) {
		this.fuel_burned_after_engineoff_mass = fuel_burned_after_engineoff_mass;
	}
	public String getFuel_rem_after_flight_completion_mass() {
		return fuel_rem_after_flight_completion_mass;
	}
	public void setFuel_rem_after_flight_completion_mass(String fuel_rem_after_flight_completion_mass) {
		this.fuel_rem_after_flight_completion_mass = fuel_rem_after_flight_completion_mass;
	}
	public String getTo_se_acc() {
		return to_se_acc;
	}
	public void setTo_se_acc(String to_se_acc) {
		this.to_se_acc = to_se_acc;
	}
	public String getTo_vref() {
		return to_vref;
	}
	public void setTo_vref(String to_vref) {
		this.to_vref = to_vref;
	}
	public String getLd_airport() {
		return ld_airport;
	}
	public void setLd_airport(String ld_airport) {
		this.ld_airport = ld_airport;
	}
	public String getLd_vyse() {
		return ld_vyse;
	}
	public void setLd_vyse(String ld_vyse) {
		this.ld_vyse = ld_vyse;
	}
	public String getTo_glide() {
		return to_glide;
	}
	public void setTo_glide(String to_glide) {
		this.to_glide = to_glide;
	}
	public String getDep_refuel_volume() {
		return dep_refuel_volume;
	}
	public void setDep_refuel_volume(String dep_refuel_volume) {
		this.dep_refuel_volume = dep_refuel_volume;
	}
	public String getStar_procedure() {
		return star_procedure;
	}
	public void setStar_procedure(String star_procedure) {
		this.star_procedure = star_procedure;
	}
	public String getDep_refuel_density() {
		return dep_refuel_density;
	}
	public void setDep_refuel_density(String dep_refuel_density) {
		this.dep_refuel_density = dep_refuel_density;
	}
	public String getRvsm_sel_pri_2_before_fl290() {
		return rvsm_sel_pri_2_before_fl290;
	}
	public void setRvsm_sel_pri_2_before_fl290(String rvsm_sel_pri_2_before_fl290) {
		this.rvsm_sel_pri_2_before_fl290 = rvsm_sel_pri_2_before_fl290;
	}
	public String getLd_v2_flaps_0() {
		return ld_v2_flaps_0;
	}
	public void setLd_v2_flaps_0(String ld_v2_flaps_0) {
		this.ld_v2_flaps_0 = ld_v2_flaps_0;
	}
	public String getTo_vac() {
		return to_vac;
	}
	public void setTo_vac(String to_vac) {
		this.to_vac = to_vac;
	}
	public String getSid_procedure() {
		return sid_procedure;
	}
	public void setSid_procedure(String sid_procedure) {
		this.sid_procedure = sid_procedure;
	}
	public String getLd_vfs() {
		return ld_vfs;
	}
	public void setLd_vfs(String ld_vfs) {
		this.ld_vfs = ld_vfs;
	}
	public String getLd_vfto() {
		return ld_vfto;
	}
	public void setLd_vfto(String ld_vfto) {
		this.ld_vfto = ld_vfto;
	}
	public String getRvsm_notification_before_fl290_status() {
		return rvsm_notification_before_fl290_status;
	}
	public void setRvsm_notification_before_fl290_status(String rvsm_notification_before_fl290_status) {
		this.rvsm_notification_before_fl290_status = rvsm_notification_before_fl290_status;
	}
	public String getLd_v2_flaps_9() {
		return ld_v2_flaps_9;
	}
	public void setLd_v2_flaps_9(String ld_v2_flaps_9) {
		this.ld_v2_flaps_9 = ld_v2_flaps_9;
	}
	public String getClimb_reduced_torque() {
		return climb_reduced_torque;
	}
	public void setClimb_reduced_torque(String climb_reduced_torque) {
		this.climb_reduced_torque = climb_reduced_torque;
	}
	public String getFuel_burned_before_uplift_mass() {
		return fuel_burned_before_uplift_mass;
	}
	public void setFuel_burned_before_uplift_mass(String fuel_burned_before_uplift_mass) {
		this.fuel_burned_before_uplift_mass = fuel_burned_before_uplift_mass;
	}
	public String getAircraft_cycles_pre_flight() {
		return aircraft_cycles_pre_flight;
	}
	public void setAircraft_cycles_pre_flight(String aircraft_cycles_pre_flight) {
		this.aircraft_cycles_pre_flight = aircraft_cycles_pre_flight;
	}
	public String getRvsm_sel_alt_before_fl290() {
		return rvsm_sel_alt_before_fl290;
	}
	public void setRvsm_sel_alt_before_fl290(String rvsm_sel_alt_before_fl290) {
		this.rvsm_sel_alt_before_fl290 = rvsm_sel_alt_before_fl290;
	}
	public String getRegulated_ld_mass() {
		return regulated_ld_mass;
	}
	public void setRegulated_ld_mass(String regulated_ld_mass) {
		this.regulated_ld_mass = regulated_ld_mass;
	}
	public String getRvsm_notification_enroute4_status() {
		return rvsm_notification_enroute4_status;
	}
	public void setRvsm_notification_enroute4_status(String rvsm_notification_enroute4_status) {
		this.rvsm_notification_enroute4_status = rvsm_notification_enroute4_status;
	}
	public String getLd_vma() {
		return ld_vma;
	}
	public void setLd_vma(String ld_vma) {
		this.ld_vma = ld_vma;
	}
	public String getSecurity_search_check() {
		return security_search_check;
	}
	public void setSecurity_search_check(String security_search_check) {
		this.security_search_check = security_search_check;
	}
	public String getTo_eng_air() {
		return to_eng_air;
	}
	public void setTo_eng_air(String to_eng_air) {
		this.to_eng_air = to_eng_air;
	}
	public String getSuccessfull_cat_2() {
		return successfull_cat_2;
	}
	public void setSuccessfull_cat_2(String successfull_cat_2) {
		this.successfull_cat_2 = successfull_cat_2;
	}
	public String getRvsm_notification_enroute3_status() {
		return rvsm_notification_enroute3_status;
	}
	public void setRvsm_notification_enroute3_status(String rvsm_notification_enroute3_status) {
		this.rvsm_notification_enroute3_status = rvsm_notification_enroute3_status;
	}
	public String getFuel_weight_volume_segment_index() {
		return fuel_weight_volume_segment_index;
	}
	public void setFuel_weight_volume_segment_index(String fuel_weight_volume_segment_index) {
		this.fuel_weight_volume_segment_index = fuel_weight_volume_segment_index;
	}
	public String getTo_v2_flaps_0() {
		return to_v2_flaps_0;
	}
	public void setTo_v2_flaps_0(String to_v2_flaps_0) {
		this.to_v2_flaps_0 = to_v2_flaps_0;
	}
	public String getCheck_cat_2() {
		return check_cat_2;
	}
	public void setCheck_cat_2(String check_cat_2) {
		this.check_cat_2 = check_cat_2;
	}
	public String getRvsm_notification_enroute2_status() {
		return rvsm_notification_enroute2_status;
	}
	public void setRvsm_notification_enroute2_status(String rvsm_notification_enroute2_status) {
		this.rvsm_notification_enroute2_status = rvsm_notification_enroute2_status;
	}
	public String getBurned_fuel_mass() {
		return burned_fuel_mass;
	}
	public void setBurned_fuel_mass(String burned_fuel_mass) {
		this.burned_fuel_mass = burned_fuel_mass;
	}
	public String getLd_vac() {
		return ld_vac;
	}
	public void setLd_vac(String ld_vac) {
		this.ld_vac = ld_vac;
	}
	public String getRvsm_notification_before_takeoff_status() {
		return rvsm_notification_before_takeoff_status;
	}
	public void setRvsm_notification_before_takeoff_status(String rvsm_notification_before_takeoff_status) {
		this.rvsm_notification_before_takeoff_status = rvsm_notification_before_takeoff_status;
	}
	public String getFuel_load_cb() {
		return fuel_load_cb;
	}
	public void setFuel_load_cb(String fuel_load_cb) {
		this.fuel_load_cb = fuel_load_cb;
	}
	public String getTo_stab_trim() {
		return to_stab_trim;
	}
	public void setTo_stab_trim(String to_stab_trim) {
		this.to_stab_trim = to_stab_trim;
	}
	public String getRvsm_notification_enroute1_status() {
		return rvsm_notification_enroute1_status;
	}
	public void setRvsm_notification_enroute1_status(String rvsm_notification_enroute1_status) {
		this.rvsm_notification_enroute1_status = rvsm_notification_enroute1_status;
	}
	public String getClimb_torque_max() {
		return climb_torque_max;
	}
	public void setClimb_torque_max(String climb_torque_max) {
		this.climb_torque_max = climb_torque_max;
	}
	public String getTo_vyse() {
		return to_vyse;
	}
	public void setTo_vyse(String to_vyse) {
		this.to_vyse = to_vyse;
	}
	public String getDep_visibility() {
		return dep_visibility;
	}
	public void setDep_visibility(String dep_visibility) {
		this.dep_visibility = dep_visibility;
	}
	public String getDeparture_receipt_number() {
		return departure_receipt_number;
	}
	public void setDeparture_receipt_number(String departure_receipt_number) {
		this.departure_receipt_number = departure_receipt_number;
	}
	public String getTo_torque_max() {
		return to_torque_max;
	}
	public void setTo_torque_max(String to_torque_max) {
		this.to_torque_max = to_torque_max;
	}
	public String getActual_trip_fuel() {
		return actual_trip_fuel;
	}
	public void setActual_trip_fuel(String actual_trip_fuel) {
		this.actual_trip_fuel = actual_trip_fuel;
	}
	public String getLanding_cycles() {
		return landing_cycles;
	}
	public void setLanding_cycles(String landing_cycles) {
		this.landing_cycles = landing_cycles;
	}
	public String getTo_vfto() {
		return to_vfto;
	}
	public void setTo_vfto(String to_vfto) {
		this.to_vfto = to_vfto;
	}
	public String getAlt1_route_desc() {
		return alt1_route_desc;
	}
	public void setAlt1_route_desc(String alt1_route_desc) {
		this.alt1_route_desc = alt1_route_desc;
	}
	public String getRvsm_applicable_status() {
		return rvsm_applicable_status;
	}
	public void setRvsm_applicable_status(String rvsm_applicable_status) {
		this.rvsm_applicable_status = rvsm_applicable_status;
	}
	public String getTo_engine_pressure_ratio() {
		return to_engine_pressure_ratio;
	}
	public void setTo_engine_pressure_ratio(String to_engine_pressure_ratio) {
		this.to_engine_pressure_ratio = to_engine_pressure_ratio;
	}
	public String getTo_reduced_torque() {
		return to_reduced_torque;
	}
	public void setTo_reduced_torque(String to_reduced_torque) {
		this.to_reduced_torque = to_reduced_torque;
	}
	public String getFuel_engine_burned_mass() {
		return fuel_engine_burned_mass;
	}
	public void setFuel_engine_burned_mass(String fuel_engine_burned_mass) {
		this.fuel_engine_burned_mass = fuel_engine_burned_mass;
	}
	public String getTo_vx() {
		return to_vx;
	}
	public void setTo_vx(String to_vx) {
		this.to_vx = to_vx;
	}
	public String getPax_qty_dest3() {
		return pax_qty_dest3;
	}
	public void setPax_qty_dest3(String pax_qty_dest3) {
		this.pax_qty_dest3 = pax_qty_dest3;
	}
	public String getAll_block_check() {
		return all_block_check;
	}
	public void setAll_block_check(String all_block_check) {
		this.all_block_check = all_block_check;
	}
	public String getTo_acceleration_altitude() {
		return to_acceleration_altitude;
	}
	public void setTo_acceleration_altitude(String to_acceleration_altitude) {
		this.to_acceleration_altitude = to_acceleration_altitude;
	}
	public String getTo_vg() {
		return to_vg;
	}
	public void setTo_vg(String to_vg) {
		this.to_vg = to_vg;
	}
	public String getRvsm_sel_pri_1_before_fl290() {
		return rvsm_sel_pri_1_before_fl290;
	}
	public void setRvsm_sel_pri_1_before_fl290(String rvsm_sel_pri_1_before_fl290) {
		this.rvsm_sel_pri_1_before_fl290 = rvsm_sel_pri_1_before_fl290;
	}
	public String getDest_visibility() {
		return dest_visibility;
	}
	public void setDest_visibility(String dest_visibility) {
		this.dest_visibility = dest_visibility;
	}
	public String getDeparture2_fuel_receipt() {
		return departure2_fuel_receipt;
	}
	public void setDeparture2_fuel_receipt(String departure2_fuel_receipt) {
		this.departure2_fuel_receipt = departure2_fuel_receipt;
	}
	public String getAircraft_config_cb() {
		return aircraft_config_cb;
	}
	public void setAircraft_config_cb(String aircraft_config_cb) {
		this.aircraft_config_cb = aircraft_config_cb;
	}
	public String getPax_qty_dest2() {
		return pax_qty_dest2;
	}
	public void setPax_qty_dest2(String pax_qty_dest2) {
		this.pax_qty_dest2 = pax_qty_dest2;
	}
	
	public String getDeparture_fuel_provider() {
		return departure_fuel_provider;
	}
	public void setDeparture_fuel_provider(String departure_fuel_provider) {
		this.departure_fuel_provider = departure_fuel_provider;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getLd_pilot() {
		return ld_pilot;
	}
	public void setLd_pilot(String ld_pilot) {
		this.ld_pilot = ld_pilot;
	}
	public String getTo_pilot() {
		return to_pilot;
	}
	public void setTo_pilot(String to_pilot) {
		this.to_pilot = to_pilot;
	}
	
	public String getRvsm_entry_at_fl290() {
		return rvsm_entry_at_fl290;
	}
	public void setRvsm_entry_at_fl290(String rvsm_entry_at_fl290) {
		this.rvsm_entry_at_fl290 = rvsm_entry_at_fl290;
	}
	
	public String getAlt2_route_desc() {
		return alt2_route_desc;
	}
	public void setAlt2_route_desc(String alt2_route_desc) {
		this.alt2_route_desc = alt2_route_desc;
	}
	
	public String getCop_role() {
		return cop_role;
	}
	public void setCop_role(String cop_role) {
		this.cop_role = cop_role;
	}
	
	public String getCdr_role() {
		return cdr_role;
	}
	public void setCdr_role(String cdr_role) {
		this.cdr_role = cdr_role;
	}
	
	public String getAircraft_registered() {
		return aircraft_registered;
	}
	public void setAircraft_registered(String aircraft_registered) {
		this.aircraft_registered = aircraft_registered;
	}
	
	public String getRvsm_sby_alt_before_fl290() {
		return rvsm_sby_alt_before_fl290;
	}
	public void setRvsm_sby_alt_before_fl290(String rvsm_sby_alt_before_fl290) {
		this.rvsm_sby_alt_before_fl290 = rvsm_sby_alt_before_fl290;
	}
	
	public String getPlanned_landing_rvr() {
		return planned_landing_rvr;
	}
	public void setPlanned_landing_rvr(String planned_landing_rvr) {
		this.planned_landing_rvr = planned_landing_rvr;
	}
	
	public String getPlanned_alt1_runway_length() {
		return planned_alt1_runway_length;
	}
	public void setPlanned_alt1_runway_length(String planned_alt1_runway_length) {
		this.planned_alt1_runway_length = planned_alt1_runway_length;
	}
	public String getPlanned_alt1_ceil() {
		return planned_alt1_ceil;
	}
	public void setPlanned_alt1_ceil(String planned_alt1_ceil) {
		this.planned_alt1_ceil = planned_alt1_ceil;
	}
	public String getPlanned_alt1_rvr() {
		return planned_alt1_rvr;
	}
	public void setPlanned_alt1_rvr(String planned_alt1_rvr) {
		this.planned_alt1_rvr = planned_alt1_rvr;
	}
	public String getPlanned_landing_ceil() {
		return planned_landing_ceil;
	}
	public void setPlanned_landing_ceil(String planned_landing_ceil) {
		this.planned_landing_ceil = planned_landing_ceil;
	}
	public String getPlanned_landing_runway_length() {
		return planned_landing_runway_length;
	}
	public void setPlanned_landing_runway_length(String planned_landing_runway_length) {
		this.planned_landing_runway_length = planned_landing_runway_length;
	}
	public String getDeparture2_receipt_number() {
		return departure2_receipt_number;
	}
	public void setDeparture2_receipt_number(String departure2_receipt_number) {
		this.departure2_receipt_number = departure2_receipt_number;
	}
	public String getDep2_refuel_volume() {
		return dep2_refuel_volume;
	}
	public void setDep2_refuel_volume(String dep2_refuel_volume) {
		this.dep2_refuel_volume = dep2_refuel_volume;
	}
	public String getDeparture2_fuel_provider() {
		return departure2_fuel_provider;
	}
	public void setDeparture2_fuel_provider(String departure2_fuel_provider) {
		this.departure2_fuel_provider = departure2_fuel_provider;
	}
	public String getDeparture3_receipt_number() {
		return departure3_receipt_number;
	}
	public void setDeparture3_receipt_number(String departure3_receipt_number) {
		this.departure3_receipt_number = departure3_receipt_number;
	}
	public String getDep3_refuel_volume() {
		return dep3_refuel_volume;
	}
	public void setDep3_refuel_volume(String dep3_refuel_volume) {
		this.dep3_refuel_volume = dep3_refuel_volume;
	}
	public String getDeparture3_fuel_provider() {
		return departure3_fuel_provider;
	}
	public void setDeparture3_fuel_provider(String departure3_fuel_provider) {
		this.departure3_fuel_provider = departure3_fuel_provider;
	}
	
	public String getPlanned_takeoff_rvr() {
		return planned_takeoff_rvr;
	}
	public void setPlanned_takeoff_rvr(String planned_takeoff_rvr) {
		this.planned_takeoff_rvr = planned_takeoff_rvr;
	}
	public String getPlanned_takeoff_fac() {
		return planned_takeoff_fac;
	}
	public void setPlanned_takeoff_fac(String planned_takeoff_fac) {
		this.planned_takeoff_fac = planned_takeoff_fac;
	}
	public String getPlanned_landing_runway_name() {
		return planned_landing_runway_name;
	}
	public void setPlanned_landing_runway_name(String planned_landing_runway_name) {
		this.planned_landing_runway_name = planned_landing_runway_name;
	}
	public String getPlanned_landing_fac() {
		return planned_landing_fac;
	}
	public void setPlanned_landing_fac(String planned_landing_fac) {
		this.planned_landing_fac = planned_landing_fac;
	}
	public String getPlanned_takeoff_runway_name() {
		return planned_takeoff_runway_name;
	}
	public void setPlanned_takeoff_runway_name(String planned_takeoff_runway_name) {
		this.planned_takeoff_runway_name = planned_takeoff_runway_name;
	}
	public String getPlanned_takeoff_runway_length() {
		return planned_takeoff_runway_length;
	}
	public void setPlanned_takeoff_runway_length(String planned_takeoff_runway_length) {
		this.planned_takeoff_runway_length = planned_takeoff_runway_length;
	}
	public String getPlanned_takeoff_ceil() {
		return planned_takeoff_ceil;
	}
	public void setPlanned_takeoff_ceil(String planned_takeoff_ceil) {
		this.planned_takeoff_ceil = planned_takeoff_ceil;
	}
	
	public String getRvsm_entry_at_enroute1() {
		return rvsm_entry_at_enroute1;
	}
	public void setRvsm_entry_at_enroute1(String rvsm_entry_at_enroute1) {
		this.rvsm_entry_at_enroute1 = rvsm_entry_at_enroute1;
	}
	public String getTo_n1_ref_redu_flex() {
		return to_n1_ref_redu_flex;
	}
	public void setTo_n1_ref_redu_flex(String to_n1_ref_redu_flex) {
		this.to_n1_ref_redu_flex = to_n1_ref_redu_flex;
	}
	public String getIsFuelTakeOffEdited() {
		return isFuelTakeOffEdited;
	}
	public void setIsFuelTakeOffEdited(String isFuelTakeOffEdited) {
		this.isFuelTakeOffEdited = isFuelTakeOffEdited;
	}
	
	
}
