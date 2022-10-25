package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.ERetailConfigVO;

public class ERetailConfigVOMapper  implements RowMapper<ERetailConfigVO>{

	public ERetailConfigVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ERetailConfigVO eRetailConfigVO = new ERetailConfigVO();
		eRetailConfigVO.setParameterCode(rs.getString("master_code"));
		eRetailConfigVO.setParameterDescription(rs.getString("master_description"));
		eRetailConfigVO.setParameterValue(rs.getString("value"));
			
		return eRetailConfigVO;
	}

}