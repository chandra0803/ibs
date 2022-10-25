package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.FlexPricerDetailsVO;

public class FlexPricerDetailsVOMapper implements RowMapper<FlexPricerDetailsVO> {

	@Override
	public FlexPricerDetailsVO mapRow(ResultSet rs, int arg1) throws SQLException {
		FlexPricerDetailsVO fpd = new FlexPricerDetailsVO();
		fpd.setFareFamily1(rs.getString("fare_fmly_economy"));
		fpd.setFareFamily2(rs.getString("fare_fmly_premium_economy"));
		fpd.setFareFamily3(rs.getString("fare_fmly_business"));
		fpd.setPricingType(rs.getString("pricing_type"));
		fpd.setDisplayType(rs.getString("display_type"));
		fpd.setArrangeBy(rs.getString("arrange_by"));
		fpd.setDateRangeValue1(rs.getString("date_range_value_1"));
		fpd.setDateRangeValue2(rs.getString("date_range_value_2"));
		fpd.setDateRangeQualifier1(rs.getString("date_range_qualifier_1"));
		fpd.setDateRangeQualifier2(rs.getString("date_range_qualifier_2"));
		fpd.setFareFamilyMcity1(rs.getString("fare_fmly_economy_mcity"));
		fpd.setFareFamilyMcity2(rs.getString("fare_fmly_premium_economy_mcity"));
		fpd.setFareFamilyMcity3(rs.getString("fare_fmly_business_mcity"));
		return fpd;
	}

}
