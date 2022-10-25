package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.ConfiguredPOSVO;

public class ConfiguredPOSDetailsMapper implements RowMapper<ConfiguredPOSVO>{

	public ConfiguredPOSVO mapRow(ResultSet rs, int arg1) throws SQLException {
				
		ConfiguredPOSVO vo = new ConfiguredPOSVO();
		vo.setCountryCode(rs.getString("country_code"));
		vo.setCityCode(rs.getString("city_code"));
		vo.setPosType(rs.getString("pos_type"));
		vo.setCurrency(rs.getString("currency"));
		
		return vo;
	}
}