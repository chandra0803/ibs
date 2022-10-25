package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.common.persistence.dao.entity.PnrListDB;

public class PnrListDBEntityMapper implements RowMapper<PnrListDB>{

	@Override
	public PnrListDB mapRow(ResultSet rs, int arg1) throws SQLException {
		
		
		
		PnrListDB f = new PnrListDB();
		f.setId(rs.getInt("id"));
		f.setSession_id(rs.getString("session_id"));;
		f.setCrp_id(rs.getInt("crp_id"));
		f.setUser_id(rs.getInt("user_id"));
		f.setPnr(rs.getString("pnr"));
		f.setItinerary_dtl(rs.getString("itinerary_dtl"));
		f.setPassenger_dtl(rs.getString("passenger_dtl"));
		f.setPayLater(rs.getBoolean("payLater"));
		f.setPnrActive(rs.getBoolean("pnrActive"));
		f.setDeparture_field_one(rs.getDate("departure_field_one"));
		f.setCreation_time(rs.getDate("creation_time"));
		f.setModified_time(rs.getDate("modified_time"));
		
		return f;
	}

}