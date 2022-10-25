package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class AmadeusLanguageCodeMapper implements RowMapper<String>{
	public String mapRow(ResultSet rs, int arg1) throws SQLException {
		/*String  amaduesLanguageCode = rs.getString("amadeus_lang_code");
		return amaduesLanguageCode;*/
		
		return rs.getString("amadeus_lang_code");
	}
}
