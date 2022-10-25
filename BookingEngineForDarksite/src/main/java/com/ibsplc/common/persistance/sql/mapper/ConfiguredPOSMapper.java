package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.ConfiguredPOSVO;


	public class ConfiguredPOSMapper implements RowMapper<ConfiguredPOSVO>{

		public ConfiguredPOSVO mapRow(ResultSet rs, int arg1) throws SQLException {
					
			ConfiguredPOSVO vo = new ConfiguredPOSVO();
			vo.setCityCode(rs.getString("city_code"));
			vo.setCityDescription(rs.getString("city_description"));
			vo.setCountryCode(rs.getString("country_code"));
			vo.setLanguae(rs.getString("localization"));
			
			return vo;
		}
	}