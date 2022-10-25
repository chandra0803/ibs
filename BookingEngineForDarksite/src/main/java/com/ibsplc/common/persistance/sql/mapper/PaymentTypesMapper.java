package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.ParameterMasterVO;

public class PaymentTypesMapper implements RowMapper<ParameterMasterVO>{

	public ParameterMasterVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ParameterMasterVO parameterMasterVO = new ParameterMasterVO();
		parameterMasterVO.setMasterCode(rs.getString("master_code"));
		parameterMasterVO.setMasterDescription(rs.getString("master_description"));
		parameterMasterVO.setValue(rs.getString("hours"));		
		return parameterMasterVO;
	}

}