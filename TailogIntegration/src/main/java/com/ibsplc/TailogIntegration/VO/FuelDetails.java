package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class FuelDetails implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;

	private double fuel_level;
	private double cost;
	private double wc;
	private double time1;
	private double fuel1;
	private double time2;
	private double fuel2;
	private double time3;
	private double fuel3;
	private double fuel_lower;
	private double cost_difference;
	
	
	public double getFuel_level() {
		return fuel_level;
	}
	public void setFuel_level(double fuel_level) {
		this.fuel_level = fuel_level;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public double getWc() {
		return wc;
	}
	public void setWc(double wc) {
		this.wc = wc;
	}
	public double getTime1() {
		return time1;
	}
	public void setTime1(double time1) {
		this.time1 = time1;
	}
	public double getFuel1() {
		return fuel1;
	}
	public void setFuel1(double fuel1) {
		this.fuel1 = fuel1;
	}
	public double getTime2() {
		return time2;
	}
	public void setTime2(double time2) {
		this.time2 = time2;
	}
	public double getFuel2() {
		return fuel2;
	}
	public void setFuel2(double fuel2) {
		this.fuel2 = fuel2;
	}
	public double getTime3() {
		return time3;
	}
	public void setTime3(double time3) {
		this.time3 = time3;
	}
	public double getFuel3() {
		return fuel3;
	}
	public void setFuel3(double fuel3) {
		this.fuel3 = fuel3;
	}
	public double getFuel_lower() {
		return fuel_lower;
	}
	public void setFuel_lower(double fuel_lower) {
		this.fuel_lower = fuel_lower;
	}
	public double getCost_difference() {
		return cost_difference;
	}
	public void setCost_difference(double cost_difference) {
		this.cost_difference = cost_difference;
	}
	@Override
	public String toString() {
		return "FuelDetails [fuel_level=" + fuel_level + ", cost=" + cost + ", wc=" + wc + ", time1=" + time1
				+ ", fuel1=" + fuel1 + ", time2=" + time2 + ", fuel2=" + fuel2 + ", time3=" + time3 + ", fuel3=" + fuel3
				+ ", fuel_lower=" + fuel_lower + ", cost_difference=" + cost_difference + "]";
	}
	
	
}
