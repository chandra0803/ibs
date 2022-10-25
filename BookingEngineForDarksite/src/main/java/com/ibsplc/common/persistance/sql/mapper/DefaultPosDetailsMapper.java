package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.PosDetailsVO;

public class DefaultPosDetailsMapper implements RowMapper<PosDetailsVO>{

	public PosDetailsVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		PosDetailsVO posDetailsVO = new PosDetailsVO();
		posDetailsVO.setAmadeusPos(rs.getString("amadeus_pos"));
		posDetailsVO.setCityCode(rs.getString("city_code"));
		
		return posDetailsVO;
	}

}