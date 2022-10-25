package com.ibsplc.common.persistence.dao.entity;

import java.io.Serializable;
import java.sql.*;
 
import java.util.Date;
import com.ibsplc.framework.vo.AbstractVO;

 
public class PnrListDB extends AbstractVO implements Serializable{
	private static final long serialVersionUID = 1L;
	 
	private int id;

	 
	private String session_id;

	 
	private int crp_id;

	 
	private int user_id;
	
	 
	private String pnr;

	 
	private String passenger_dtl;
	
	 
	private String itinerary_dtl;
	
	 
	private Date departure_field_one;
	
	 
	private boolean payLater;
	
	 
	private boolean pnrActive;
	
	 
	private Date creation_time;
	
	 
	private Date modified_time;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public int getCrp_id() {
		return crp_id;
	}

	public void setCrp_id(int crp_id) {
		this.crp_id = crp_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getPassenger_dtl() {
		return passenger_dtl;
	}

	public void setPassenger_dtl(String passenger_dtl) {
		this.passenger_dtl = passenger_dtl;
	}

	public String getItinerary_dtl() {
		return itinerary_dtl;
	}

	public void setItinerary_dtl(String itinerary_dtl) {
		this.itinerary_dtl = itinerary_dtl;
	}

	public Date getDeparture_field_one() {
		return departure_field_one;
	}

	public void setDeparture_field_one(Date departure_field_one) {
		this.departure_field_one = departure_field_one;
	}

	public boolean getPayLater() {
		return payLater;
	}

	public void setPayLater(boolean b) {
		this.payLater = b;
	}

	public boolean getPnrActive() {
		return pnrActive;
	}

	public void setPnrActive(boolean b) {
		this.pnrActive = b;
	}

	public Date getCreation_time() {
		return creation_time;
	}

	public void setCreation_time(Date creation_time) {
		this.creation_time = creation_time;
	}

	public Date getModified_time() {
		return modified_time;
	}

	public void setModified_time(Date modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString() {
		return "PnrListDB [id=" + id + ", session_id=" + session_id + ", crp_id=" + crp_id + ", user_id=" + user_id
				+ ", passenger_dtl=" + passenger_dtl + ", itinerary_dtl=" + itinerary_dtl + ", departure_field_one="
				+ departure_field_one + ", payLater=" + payLater + ", pnrActive=" + pnrActive + ", creation_time="
				+ creation_time + ", modified_time=" + modified_time + "]";
	}
	


}
