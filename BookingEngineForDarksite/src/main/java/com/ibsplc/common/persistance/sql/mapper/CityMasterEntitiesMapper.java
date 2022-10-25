package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.CitiesVO;

	public class CityMasterEntitiesMapper implements RowMapper<CitiesVO>{
		public CitiesVO mapRow(ResultSet rs, int arg1) throws SQLException {
					
			CitiesVO vo = new CitiesVO();
			vo.setCountryCode(rs.getString("country_code"));
			vo.setCityCode(rs.getString("city_code"));
			vo.setCityDesciption(rs.getString("city_description"));
			vo.setAirportDescription(rs.getString("airport_description"));
			
			return vo;
		}

	}