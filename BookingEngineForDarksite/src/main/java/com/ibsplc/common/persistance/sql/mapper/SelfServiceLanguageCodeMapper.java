package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SelfServiceLanguageCodeMapper implements RowMapper<String>  {
	public String mapRow(ResultSet rs, int arg1) throws SQLException {
		/*String  SelfServiceLanguageCode = rs.getString("selfservice_lang_code");
		return selfServiceLanguageCode;*/
		
		return rs.getString("selfservice_lang_code");
	}

}
