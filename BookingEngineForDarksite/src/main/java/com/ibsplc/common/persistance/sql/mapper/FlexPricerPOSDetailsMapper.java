package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;

public class FlexPricerPOSDetailsMapper implements RowMapper<FlexPricerRequestVO>{

	public FlexPricerRequestVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		FlexPricerRequestVO flexPricerRequestVO = new FlexPricerRequestVO();
		flexPricerRequestVO.setSiteQueueOfficeID(rs.getString("queue_office_id"));
		flexPricerRequestVO.setSitePointOfTicketing(rs.getString("point_of_ticketing"));
		flexPricerRequestVO.setSiteQueueNumber(rs.getString("queue_number"));
		flexPricerRequestVO.setSiteQueueCategory(rs.getString("queue_category"));
		flexPricerRequestVO.setAmadeusSiteOfficeID(rs.getString("amadeus_office_id"));
		return flexPricerRequestVO;
	}

}
