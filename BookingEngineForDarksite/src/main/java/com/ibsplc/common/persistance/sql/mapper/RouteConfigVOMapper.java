package com.ibsplc.common.persistance.sql.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ibsplc.flightsearch.controller.FlightSearchController;
import com.ibsplc.flightsearch.vo.RouteConfigVO;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

public class RouteConfigVOMapper implements RowMapper<RouteConfigVO>{
	
	private static final Logger LOGGER = Log4j2Logger.create(RouteConfigVOMapper.class);
	
	public RouteConfigVO mapRow(ResultSet rs, int arg1) throws SQLException {
		RouteConfigVO rce = new RouteConfigVO();
		rce.setFlexConfigName(rs.getString("flex_config_name"));
		//rce.setIsRedirectedToSAA(rs.getString("is_redirected_to_SAA"));	
		//rce.setThreeDsecuredEnabled(rs.getString("3D_secured_enabled")); -- Commented on 08/09/2020
		rce.setIsRouteConfigurational(rs.getString("is_route_operational"));// Added on 08/09/2020
		//HD-316604 -Removing 'Redirect to SAA' and '4Z live date' in admin tool by A-10261
				/*rce.setEffectiveDate(rs.getDate("4z_live_date"));
				rce.setIsRedirectedToSAA(rs.getString("is_redirected_to_SAA"));	*/
				// HD-316604 Ends
						
		//rce.setEffectiveDate(rs.getDate("4z_live_date"));
		
		//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- start
		
		rce.setIsAirlinkRoute(rs.getString("is_airlink_route"));
		
		//Added on 24/02/2021 by A-8986 to add a new Amadeus Trip Request Parameter -- end
		
		//Added  03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- start
		
		rce.setIsDirectTrip(rs.getString("is_set_direct_trip"));
						
	   //Added 03/11/2021 by A-10083 to add a new Amadeus Trip Request Parameter -- end

		LOGGER.info("Flex Config Name :"+rce.getFlexConfigName()+", Is Route Operational:"+rce.getIsRouteConfigurational()+","
				+ ", Is Airlink Route:"+rce.getIsAirlinkRoute());
		return rce;
	}
}