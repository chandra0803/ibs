package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.vo.PromoFaresVO;

public class PromoFaresVOMapper implements RowMapper<PromoFaresVO>{
	
	/* (non-Javadoc)
	 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
	 *
	 * Author A-7383
	 */
	public PromoFaresVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		PromoFaresVO promoFaresVO = new PromoFaresVO();
		promoFaresVO.setPromoFareId(rs.getInt("promo_id"));
		promoFaresVO.setPromoCode(rs.getString("promo_code"));
		promoFaresVO.setFareBasis(rs.getString("fare_basis"));
		promoFaresVO.setStartDate(rs.getString("start_date"));
		promoFaresVO.setEndDate(rs.getString("end_date"));
		promoFaresVO.setOrginCode(rs.getString("origin_code"));
		promoFaresVO.setDestiCode(rs.getString("destin_code"));
		promoFaresVO.setStartTime(rs.getFloat("start_time"));
		promoFaresVO.setEndTime(rs.getFloat("end_time"));
		promoFaresVO.setPrivateFareAccountCode(rs.getString("private_fare_account_code"));
			
		return promoFaresVO;
	}

}
