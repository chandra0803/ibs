package com.ibsplc.common.persistence.dao.impl;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.ibsplc.common.excelparsing.ReadExcel;
import com.ibsplc.common.persistence.dao.CommonDao;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.flightsearch.vo.AirLinkParameterMasterVO;
import com.ibsplc.flightsearch.vo.AmadeusLanguageCodeVO;
import com.ibsplc.flightsearch.vo.CitiMasterLocalizationVO;
import com.ibsplc.flightsearch.vo.CitiesVO;
import com.ibsplc.flightsearch.vo.ConfiguredPOSVO;
import com.ibsplc.flightsearch.vo.FlexPricerDetailsVO;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.ParameterMasterLocalizationVO;
import com.ibsplc.flightsearch.vo.ParameterMasterVO;
import com.ibsplc.flightsearch.vo.PaymentMappingVO;
import com.ibsplc.flightsearch.vo.PosCityMasterVO;
import com.ibsplc.flightsearch.vo.PosDetailsVO;
import com.ibsplc.flightsearch.vo.PromoFaresVO;
import com.ibsplc.flightsearch.vo.RegionVO;
import com.ibsplc.flightsearch.vo.RetrieveRequestVO;
import com.ibsplc.flightsearch.vo.RouteConfigVO;
import com.ibsplc.flightsearch.vo.SavePNRRequestVO;
import com.ibsplc.flightsearch.vo.TripDetailsVO;
import com.ibsplc.framework.persistance.dao.AbstractDao;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

/**
 * @author a-5316
 *
 */
@Repository("commonDao")
//@Transactional
public class CommonDaoImpl extends AbstractDao implements CommonDao {

	/**
	 * to get logs
	 */
	private static final Logger LOGGER = Log4j2Logger.create(CommonDaoImpl.class);

	@Autowired
	private Environment environment;

	 

	@Override
	public List<RouteConfigVO> getRouteConfigEntities(final String origin, final String destination,
			final String productMasterCode) throws DataAccessException {

		// String routeConfigEntityQuery =
		// environment.getRequiredProperty("getRouteConfigEntities.query");

		List<RouteConfigVO> returnList = new ArrayList<RouteConfigVO>();
		List<RouteConfigVO> routeConfig = ReadExcel.getRouteConfigVOList("airlink_route_config.xlsx");
		LOGGER.info("RouteConfig  params - origin:" + origin + ",destination:" + destination + ",productMasterCode:"
				+ productMasterCode);

		for (Iterator iterator = routeConfig.iterator(); iterator.hasNext();) {
			RouteConfigVO routeConfig2 = (RouteConfigVO) iterator.next();
			if (routeConfig2.getOrigin().equalsIgnoreCase(origin)
					&& routeConfig2.getDestination().equalsIgnoreCase(destination)
					&& routeConfig2.getProductMasterCode().equalsIgnoreCase(productMasterCode)) {
				LOGGER.info("getRouteConfigEntities matched:" + routeConfig2);
				returnList.add(routeConfig2);
			}
		}
		return returnList;
	}

	@Override
	public List<CitiesVO> getCityMasterEntities(final String departureCity) throws DataAccessException {
		String cityMasterEntityQueries = environment.getRequiredProperty("getCityMasterEntities.query");
		List<CitiesVO> returnList = new ArrayList<CitiesVO>();
		List<CitiesVO> citiesVOlst = ReadExcel.getCityMasterList("airlink_city_master.xlsx");
		LOGGER.info("getCityMasterEntities tobe find departureCity:" + departureCity);
		List<String> departureCityLst = new ArrayList<String>();
		if (departureCity.contains(",")) {
			String dcity[] = departureCity.split(",");
			for (int i = 0; i < dcity.length; i++) {
				departureCityLst.add(departureCity.split(",")[i]);
			}
		}
 
		 
		for (Iterator iterator = citiesVOlst.iterator(); iterator.hasNext();) {
			CitiesVO cityDetails = (CitiesVO) iterator.next();
			if (departureCityLst.size() > 0) {
				for (Iterator dcityIterator = departureCityLst.iterator(); dcityIterator.hasNext();) {
					String dcity = (String) dcityIterator.next();
					if (cityDetails.getCityCode().equalsIgnoreCase(dcity)) {
						//LOGGER.info("getCityMasterEntities matched:" + cityDetails);
						returnList.add(cityDetails);
					}
				}
			}else{
				if (cityDetails.getCityCode().equalsIgnoreCase(departureCity)) {
					//LOGGER.info("getCityMasterEntities matched:" + cityDetails);
					returnList.add(cityDetails);
				}	
			}
		}
		//LOGGER.info("getCityMasterEntities matched:" + returnList);
		return returnList;
	}

	@Override
	public List<CitiesVO> getCityMasterEntitiesByCountry(final String  country) throws DataAccessException {
		String cityMasterEntityQueries = environment.getRequiredProperty("getCityMasterEntities.query");
		List<CitiesVO> returnList = new ArrayList<CitiesVO>();
		List<CitiesVO> tmpList = new ArrayList<CitiesVO>();
		List<CitiesVO> citiesVOlst = ReadExcel.getCityMasterList("airlink_city_master.xlsx");
		LOGGER.info("getCityMasterEntities tobe find Country:" + country);
		List<String> countryLst = new ArrayList<String>();
		if (country.contains(",")) {
			String dcity[] = country.split(",");
			for (int i = 0; i < dcity.length; i++) {
				countryLst.add(country.split(",")[i]);
			}
		}
		for (Iterator iterator = citiesVOlst.iterator(); iterator.hasNext();) {
			CitiesVO cityDetails = (CitiesVO) iterator.next();
			if (countryLst.size() > 0) {
				for (Iterator dcityIterator = countryLst.iterator(); dcityIterator.hasNext();) {
					String dCountry = (String) dcityIterator.next();
					if (cityDetails.getCountryCode().equalsIgnoreCase(dCountry)) {
						//LOGGER.info("getCityMasterEntities matched list:" + cityDetails);
						returnList.add(cityDetails);
					}
				}
			}else{
				if (cityDetails.getCountryCode().equalsIgnoreCase(country)) {
					//LOGGER.info("getCityMasterEntities matched:" + cityDetails);
					returnList.add(cityDetails);
				}
			}
		}
		if(null != returnList && returnList.size() > 1){			
			tmpList.addAll(returnList);
			returnList.clear();
			returnList.add(tmpList.get(0));
		}
		LOGGER.info("getCityMasterEntitiesByCountry matched:" + returnList);
		return returnList;
	}	
	@Override
	public List<ConfiguredPOSVO> getConfiguredPOSList(final String countryCode, final String language,
			final String productCode) throws DataAccessException {
		String posDetailsQuery = environment.getRequiredProperty("getConfiguredPOSList.query");

		LOGGER.info("ConfiguredPOSList params countryCode:" + countryCode + ", language:" + language);
		/*
		 * select
		 * m.`city_code`,ifnull(lan.city_description,m.`city_description`)
		 * city_description,
		 * m.`country_code`,if(lan.`localization`='ZH',ifnull(m.`
		 * city_description`,lan.`city_description`),
		 * ifnull(lan.`city_description`,m.`city_description`))
		 * ORDR,ifnull(lan.`localization`,m.localization) localization from
		 * `airlink_pos_city_master` pos,`airlink_city_master` m left join
		 * `airlink_city_master_localization` lan on
		 * (m.`city_code`=lan.`city_code` and lan.`localization` = ?) where
		 * pos.`city_code`=m.`city_code` and m.country_code=? and
		 * pos.`product_master_code`=? and m.`origin_indicator`='Y' order by
		 * ORDR,city_description
		 */

		List<ConfiguredPOSVO> returnList = new ArrayList<ConfiguredPOSVO>();
		List<CitiesVO> citiesVOlst = ReadExcel.getCityMasterList("airlink_city_master.xlsx");
		List<PosCityMasterVO> posCityMasterVOLst = ReadExcel.getPosCityMasterVODetails("airlink_pos_city_master.xlsx");
		List<CitiMasterLocalizationVO> citiMasterLocalizationLst = ReadExcel
				.getCitiMasterLocalizationDetails("airlink_city_master_localization.xlsx");

		/*
		 * LOGGER.info("citiesVOlst.size():"+citiesVOlst.size());
		 * LOGGER.info("posCityMasterVOLst.size():"+posCityMasterVOLst.size());
		 * LOGGER.info("citiMasterLocalizationLst.size():"+
		 * citiMasterLocalizationLst.size());
		 */
		citiesVOlst.stream()
				.flatMap(c1 -> citiMasterLocalizationLst.stream()
						// .filter(Objects::nonNull)
						.filter(c2 -> c1.getCityCode().equalsIgnoreCase(c2.getCityCode())
								&& c2.getLocalization().equalsIgnoreCase(language))
						.map(c2 -> new AbstractMap.SimpleImmutableEntry<>(c1, c2)))
				.flatMap(c3 -> posCityMasterVOLst.stream()
						// .filter(Objects::nonNull)
						.filter(c4 -> c4.getCityCode().equalsIgnoreCase(c3.getKey().getCityCode())
								&& c3.getKey().getCountryCode().equalsIgnoreCase(countryCode)
								&& c4.getProductMasterCode().equalsIgnoreCase(productCode)
								&& ("Y").equalsIgnoreCase(c3.getKey().getOriginIndicator()))
						.map(c2 -> new AbstractMap.SimpleImmutableEntry<>(c2, c3)))
				.collect(Collectors.toList()).stream().forEach(i -> {
					List cityDescriptionList = new ArrayList();
					cityDescriptionList.add(i.getValue().getKey());
					String cDescription = "ZH";
					String mDescription = "ZH";
					String lDescription = "ZH";
					cDescription = Optional.ofNullable(i.getValue().getKey().getCityDesciption())
							.orElse(i.getValue().getValue().getCityDescription());
					if ("ZH".equalsIgnoreCase(i.getValue().getValue().getCityDescription())) {
						mDescription = Optional.ofNullable(i.getValue().getValue().getCityDescription())
								.orElse(i.getValue().getKey().getCityDesciption());
						lDescription = Optional.ofNullable(i.getValue().getKey().getCityDesciption())
								.orElse(i.getValue().getValue().getCityDescription());
					}
					String cLocation = Optional.ofNullable(i.getValue().getValue().getLocalization())
							.orElse(i.getValue().getKey().getLocalization());
					ConfiguredPOSVO configuredPOSVO2 = new ConfiguredPOSVO();
					configuredPOSVO2.setCityCode(i.getValue().getKey().getCityCode());
					configuredPOSVO2.setCityDescription(mDescription);
					configuredPOSVO2.setLanguae(cLocation);

					/*
					 * cityDescriptionList.sort((p1,p2)->{ if(p1.) });
					 */
					// Collections.sort(cDescription,
					// Comparator.compare(cityDescriptionList,lDescription));
					returnList.add(configuredPOSVO2);
				});

		/*
		 * Left outer join (also known as left join): this join returns all the
		 * rows from left table combine with the matching rows of the right
		 * table.
		 */

		LOGGER.info("ConfiguredPOSList returnList.size():" + returnList.size());
		return returnList;
	}

	@Override
	public List<ConfiguredPOSVO> getRegionalCityList(final String countryCode, final String language,
			final String product) throws DataAccessException {

		LOGGER.info("getRegionalCityList parms - countryCode:" + countryCode + "; language:" + language + ",product:"
				+ product);
		String regionalCityListQuery = environment.getRequiredProperty("getRegionalCityList.query");
		/*
		 * select city_master.country_code,city_master.city_code,city_master.
		 * city_description,
		 * city_master.airport_description,city_master.localization,cm.
		 * region_code,cm.country_code,
		 * cm.country_desc,cm.lang,cm.city_code,cm.active_indicator,rm.
		 * region_desc from airlink_city_master city_master left outer join
		 * airlink_country_master cm
		 * on(city_master.country_code=cm.country_code) left outer join
		 * airlink_region_master rm on ( cm.region_code=rm.region_code) left
		 * outer join airlink_pos_city_master pm on( city_master.city_code =
		 * pm.city_code) where city_master.localization='en' and
		 * cm.region_code='AF' and cm.lang=? and cm.country_code!=? and
		 * pm.product_master_code = ? and pm.active_indicator = 'Y' and
		 * city_master.origin_indicator = 'Y' and cm.active_indicator = 'Y';
		 */

		List<ConfiguredPOSVO> returnList = new ArrayList<ConfiguredPOSVO>();
		List<CitiesVO> citiesVOlst = ReadExcel.getCityMasterList("airlink_city_master.xlsx");
		List<PosDetailsVO> countryVOlst = ReadExcel.getCountryMasterDetailsVoList("airlink_country_master.xlsx");
		List<RegionVO> regionMasterVOlst = ReadExcel.getRegionMasterDetailsVoList("airlink_region_master.xlsx");
		List<PosCityMasterVO> airlinkPosCityMasterVOLst = ReadExcel
				.getPosCityMasterVODetails("airlink_pos_city_master.xlsx");
		 

		citiesVOlst.stream()
				.flatMap(c1 -> countryVOlst.stream().filter(Objects::nonNull)
						.filter(c2 -> c1.getCityCode().equalsIgnoreCase(c2.getCityCode()) && c2 != null)
						.map(c2 -> new AbstractMap.SimpleImmutableEntry<>(c1, c2)))
				.flatMap(
						c3 -> regionMasterVOlst.stream()
								// .filter(Objects::nonNull)
								.filter(region -> region.getRegionCode()
										.equalsIgnoreCase(c3.getValue().getRegionCode()))
								.map(region -> new AbstractMap.SimpleImmutableEntry<>(c3, region)))
				.flatMap(
						c4 -> airlinkPosCityMasterVOLst.stream()
								// .filter(Objects::nonNull)
								// .peek(pmlocal ->
								// LOGGER.info("getRegionalCityList size: " +
								// c4.getKey()))
								.filter(posCity -> posCity.getCityCode()
										.equalsIgnoreCase(c4.getKey().getKey().getCityCode()))
								.map(posCity -> new AbstractMap.SimpleImmutableEntry<>(c4, posCity)))
				.collect(Collectors.toList()).stream()
				// .filter(Objects::nonNull)
				.filter(app2 -> (null != app2.getKey().getKey().getValue().getLang()
						&& app2.getKey().getKey().getValue().getLang().equalsIgnoreCase(language)
						&& ("AF").equalsIgnoreCase(app2.getKey().getValue().getRegionCode())
						&& null != app2.getKey().getKey().getValue()
						&& ("Y").equalsIgnoreCase(app2.getKey().getKey().getValue().getActiveIndicator())
						&& !app2.getKey().getKey().getValue().getCountryCode().equalsIgnoreCase(countryCode)
						&& ("EN").equalsIgnoreCase(app2.getKey().getKey().getKey().getLocalization())
						&& ("Y").equalsIgnoreCase(app2.getKey().getKey().getKey().getOriginIndicator())))
				.collect(Collectors.toList()).stream().forEach(i -> {
					ConfiguredPOSVO configuredPOSVO2 = new ConfiguredPOSVO();
					configuredPOSVO2.setCityCode(i.getKey().getKey().getKey().getCityCode());
					configuredPOSVO2.setCityDescription(i.getKey().getKey().getKey().getCityDesciption());
					configuredPOSVO2.setCountryCode(i.getKey().getKey().getKey().getCountryCode());
					configuredPOSVO2.setCurrency(i.getKey().getKey().getValue().getCurrency());
					configuredPOSVO2.setLanguae(i.getKey().getKey().getValue().getLang());
					configuredPOSVO2.setPosType(i.getKey().getKey().getValue().getPosType());
					returnList.add(configuredPOSVO2);
				});

		LOGGER.info("getRegionalCityList returnList.size():" + returnList.size());

		return returnList;

	}

	@Override
	public List<AirLinkParameterMasterVO> getERetailConfigDetails() throws DataAccessException {
		// String query =
		// environment.getRequiredProperty("getERetailVOParameters.query");
		// List<AirLinkParameterMasterVO> parameterMasterLst = new
		// ArrayList<AirLinkParameterMasterVO>();
		List<AirLinkParameterMasterVO> eRetailConfigDetails = ReadExcel
				.getParameterMasterVOList("airlink_parameter_master.xlsx");
		return eRetailConfigDetails;
	}

	@Override
	public List<AirLinkParameterMasterVO> getERetailConfigDetailsWithMasterCode(final String masterCode)
			throws DataAccessException {
		List<AirLinkParameterMasterVO> parameterMasterLst = new ArrayList<AirLinkParameterMasterVO>();
		// String query =
		// environment.getRequiredProperty("getERetailVOParametersWithMasterCode.query");
		return ReadExcel.getParameterMasterVOList("airlink_parameter_master.xlsx");
	}

	@Override
	public List<FlexPricerDetailsVO> getFlexPricerDetailsList(final String flexConfigName, final String routeType)
			throws DataAccessException {
		// String query =
		// environment.getRequiredProperty("getFlexPricerDetails.query");
		List<FlexPricerDetailsVO> flexPricerDetailsVOLst = new ArrayList<FlexPricerDetailsVO>();
		FlexPricerDetailsVO flexPricerDetailsVO = new FlexPricerDetailsVO();
		// List<FlexPricerDetails> flexPricerDetailsLst =
		// ExcelDataToJava.getFlexPricerDetailsList();
		LOGGER.info("FlexPricerDetails params flexConfigName:" + flexConfigName + ", routeType:" + routeType);

		// List<FlexPricerRequestVO> flexPricerRequestLst =
		// ReadExcel.getFlexPricerRequestVOList("FlexPricerRequest.xlsx");
		List<FlexPricerDetailsVO> flexPricerDetailsLst = ReadExcel
				.getFlexPricerDetailsVOList("airlink_flex_pricer.xlsx");
		for (Iterator iterator = flexPricerDetailsLst.iterator(); iterator.hasNext();) {
			FlexPricerDetailsVO flexPricerDetails = (FlexPricerDetailsVO) iterator.next();
			// Optional.ofNullable(flexPricerDetails).ifPresent(var ->
			// flexPricerDetails.setFlexConfigName(var) );
			if (flexPricerDetails.getFlexConfigName().equalsIgnoreCase(flexConfigName)) {
				if (flexPricerDetails.getRouteType().equalsIgnoreCase(routeType)) {
					flexPricerDetailsVOLst.add(flexPricerDetails);
				}
			}

		}

		return flexPricerDetailsVOLst;
	}

	@Override
	public List<String> getAmadeusLanguageCode(final String language) throws DataAccessException {
		// String amadeusLanguageCodeQuery =
		// environment.getRequiredProperty("getAmadeusLanguageCode.query");
		// getAmadeusLanguageCode.query=select amadeus_lang_code from
		// airlink_amadeus_language_mapper
		// where master_number in (select master_number from
		// airlink_parameter_master where master_code=?);

		List<String> returnAmadeusLanguageCodeLst = new ArrayList<String>();
		List<AmadeusLanguageCodeVO> amadeusLanguageCodeVOLst = ReadExcel
				.getAmadeusLanguageCodeList("airlink_amadeus_language_mapper.xlsx");
		List<AirLinkParameterMasterVO> parameterMasterVOLst = ReadExcel
				.getParameterMasterVOList("airlink_parameter_master.xlsx");

		for (Iterator iterator = parameterMasterVOLst.iterator(); iterator.hasNext();) {
			AirLinkParameterMasterVO airLinkParameterMasterVO = (AirLinkParameterMasterVO) iterator.next();
			if (airLinkParameterMasterVO.getMasterCode().equalsIgnoreCase(language)) {
				for (Iterator iteratorAmadeus = amadeusLanguageCodeVOLst.iterator(); iteratorAmadeus.hasNext();) {
					AmadeusLanguageCodeVO amadeusLanguageCodeVO = (AmadeusLanguageCodeVO) iteratorAmadeus.next();
					if (amadeusLanguageCodeVO.getMasterNumber()
							.equalsIgnoreCase(airLinkParameterMasterVO.getMasterNumber())) {
						returnAmadeusLanguageCodeLst.add((String) amadeusLanguageCodeVO.getAmadeusLangCode());

					}
				}
			}
		}
		// LOGGER.info("@@@@@ matched
		// getAmadeusLanguageCode:"+returnAmadeusLanguageCodeLst);

		return returnAmadeusLanguageCodeLst;
	}

	@Override
	public List<PromoFaresVO> getPromofareDetailsByFareCode(final String promoCode) throws DataAccessException {
		// String query =
		// environment.getRequiredProperty("getPromofareDetailsByFareCode.query");
		List<PromoFaresVO> returnList = null;
		List<PromoFaresVO> flexPricerDetailsLst = ReadExcel.getPromoFaresVOList("airlink_promofares.xlsx");
		// LOGGER.info("getPromofareDetailsByFareCode tobe matched promoCode:"+
		// promoCode);
		for (Iterator iterator = flexPricerDetailsLst.iterator(); iterator.hasNext();) {
			PromoFaresVO promoFaresVO = (PromoFaresVO) iterator.next();
			// LOGGER.info("getPromofareDetailsByFareCode promoCode:"+
			// promoFaresVO.getPromoCode());
			if (promoFaresVO.getPromoCode().equalsIgnoreCase(promoCode)) {
				// LOGGER.info("getPromofareDetailsByFareCode matched:"+
				// returnList);
				returnList.add(promoFaresVO);
			}
		}
		return returnList;

	}

	@Override
	public List<PosCityMasterVO> updateRequestWithPOSDetails(final String product, final String dapartureCity)
			throws DataAccessException {
		String getFlexPricerPOSDetailsQuery = environment.getRequiredProperty("getFlexPricerPOSDetails.query");
		List<FlexPricerRequestVO> requestWithPOSDetailsLst = new ArrayList<FlexPricerRequestVO>();
		List<FlexPricerRequestVO> returnList1 = new ArrayList<FlexPricerRequestVO>();
		List<PosCityMasterVO> returnList = new ArrayList<PosCityMasterVO>();

		List<PosCityMasterVO> posCityMasterVOLst = new ArrayList<PosCityMasterVO>();
		//requestWithPOSDetailsLst = ReadExcel.getFlexPricerPOSDetails("airlink_pos_city_master.xlsx");
		posCityMasterVOLst = ReadExcel.getPosCityMasterVODetails("airlink_pos_city_master.xlsx");
		 LOGGER.info("updateRequestWithPOSDetails params:"+ product+", dapartureCity:"+dapartureCity);		
		 
		if(null != product && null!= dapartureCity){
		for (Iterator iterator = posCityMasterVOLst.iterator(); iterator.hasNext();) {
			PosCityMasterVO posCityMasterVO = (PosCityMasterVO) iterator.next();
			if(posCityMasterVO.getProductMasterCode().equalsIgnoreCase(product)){
				if(posCityMasterVO.getCityCode().equalsIgnoreCase(dapartureCity)){
					returnList.add(posCityMasterVO);
					 //LOGGER.info("updateRequestWithPOSDetails matched:"+ returnList);
				}
			}		
		}
		 
	}
	//LOGGER.info("updateRequestWithPOSDetails returnList:"+returnList);
		return returnList;
	}

	@Override
	public List<ConfiguredPOSVO> getConfiguredPosDetails(final String countryCode, final String language)
			throws DataAccessException {
		String posDetailsQuery = environment.getRequiredProperty("getConfiguredPOSDetails.query"); 
		List<PosDetailsVO> osDetailsVOLst = ReadExcel.getCountryMasterDetailsVoList("airlink_country_master.xlsx");
		LOGGER.info("getConfiguredPosDetails tobe match countryCode:"+ countryCode+", language:"+language);		

		List<PosDetailsVO> returnList = new ArrayList<PosDetailsVO>();
		for (Iterator iterator = osDetailsVOLst.iterator(); iterator.hasNext();) {
			PosDetailsVO posDetailsVO = (PosDetailsVO) iterator.next();
			if(posDetailsVO.getCountryCode().equalsIgnoreCase(countryCode)){
			 
				if(posDetailsVO.getLang().equalsIgnoreCase(language)){
					LOGGER.info("getConfiguredPosDetails matched:"+ posDetailsVO);
					returnList.add(posDetailsVO);
				}
			}			
		}
		return new ArrayList<ConfiguredPOSVO>(); 
	}

	@Override
	public List<PosDetailsVO> getDefaultPosDetailsList(final String country, final String language)
			throws DataAccessException {
		String getDefaultPosDetailsListQuery = environment.getRequiredProperty("getDefaultPosDetailsList.query");
		List<PosDetailsVO> osDetailsVOLst = ReadExcel.getCountryMasterDetailsVoList("airlink_country_master.xlsx");
		List<PosDetailsVO> returnList = new ArrayList<PosDetailsVO>();
		List<CitiesVO> cityDetailsVoList = null;
		boolean isCityCodeEmpty = false;
		LOGGER.info("getDefaultPosDetailsList params country:" + country + ", language:" + language);

		List<String> countryLst = new ArrayList<String>();
		  
			if(null != country && country.contains(",")){	 
			String dcity[] = country.split(",");
			for (int i = 0; i < dcity.length; i++) {
				countryLst.add(country.split(",")[i]);
			}
		 }
			  
		if (null != country && null != language) {
			for (Iterator iterator = osDetailsVOLst.iterator(); iterator.hasNext();) {
				PosDetailsVO posDetailsVO = (PosDetailsVO) iterator.next();
				if(!countryLst.isEmpty() && countryLst.size() > 0){
				for (Iterator dcityIterator = countryLst.iterator(); dcityIterator.hasNext();) {
					String dCountry = (String) dcityIterator.next();
					if (posDetailsVO.getCountryCode().equalsIgnoreCase(dCountry)) {
						if (posDetailsVO.getLang().equalsIgnoreCase(language)) {
							returnList.add(posDetailsVO);
							//LOGGER.info("getDefaultPosDetailsList matched1:" + returnList);
						}
					}
				}
			}else{
				if (posDetailsVO.getCountryCode().equalsIgnoreCase(country)) {
					if (posDetailsVO.getLang().equalsIgnoreCase(language)) {
						returnList.add(posDetailsVO);
						//LOGGER.info("getDefaultPosDetailsList matched:" + returnList);
					}
				}
			}
			}
		}
	/* if(null == returnList || returnList.isEmpty()){
		  returnList.add(osDetailsVOLst.get(0));
	 }*/
		
	for (Iterator iterator = returnList.iterator(); iterator.hasNext();) {
		PosDetailsVO posDetailsVO = (PosDetailsVO) iterator.next();
		 if(null == posDetailsVO.getCityCode() || posDetailsVO.getCityCode().isEmpty() || posDetailsVO.getCityCode().equalsIgnoreCase("NULL")){
			 isCityCodeEmpty = true;
		 }			
	}
	 
	if(isCityCodeEmpty && null != returnList && returnList.size() > 0){
			try{
				cityDetailsVoList = getCityMasterEntitiesByCountry(osDetailsVOLst.get(0).getCountryCode());			 	  
			} catch (DataAccessException e) {
				LOGGER.error("Error occured while retrieving data for citiesVO" + e);
			}
			 
		 
			if (cityDetailsVoList != null && !cityDetailsVoList.isEmpty()) {	
				returnList.get(0).setCityCode(cityDetailsVoList.get(0).getCityCode());
			}
					 			 
	 }	
		LOGGER.info("getDefaultPosDetailsList matched returnList :" + returnList);
		return returnList;
	}
	 
	/**
	 * This method return the payment types allowed for the POSCITY and product
	 */
	public List<AirLinkParameterMasterVO> getPaymentTypesAllowed(final String language, final String posCity,
			final String productCode, final String departureDate, String sessionID) throws DataAccessException {
		 
		LOGGER.info("getPaymentTypesAllowed params - language:"+ language+", posCity:"+posCity+", productCode:"+productCode
				+", departureDate:"+departureDate+", sessionID:"+sessionID);
		
		//String getPaymentTypesQuery = environment.getRequiredProperty("getPaymentTypesAllowed.query");
	 
		List<AirLinkParameterMasterVO> parameterMasterVOReturnLst =  new ArrayList<AirLinkParameterMasterVO>();
		ParameterMasterVO parameterMasterVO = new ParameterMasterVO();
		List<FlexPricerRequestVO> returnList = new ArrayList<FlexPricerRequestVO>();
		 
		List<AirLinkParameterMasterVO>  parameterMasterVOLst =  ReadExcel.getParameterMasterVOList("airlink_parameter_master.xlsx");
		List<PaymentMappingVO>  paymentMappingVOLst =  ReadExcel.getPaymentTypesAllowed("airlink_payment_mapping.xlsx");
		List<PosCityMasterVO> airlinkPosCityMasterVOLst = ReadExcel.getPosCityMasterVODetails("airlink_pos_city_master.xlsx");
		List<ParameterMasterLocalizationVO> parameterMasterLocalizationLst = ReadExcel.getParameterMasterLocalizationDetails("airlink_parameter_master_localization.xlsx");
		
		/*LOGGER.info("parameterMasterVOLst size:"+ parameterMasterVOLst.size());
		LOGGER.info("paymentMappingVOLst size:"+ paymentMappingVOLst.size());
		LOGGER.info("airlinkPosCityMasterVOLst size:"+ airlinkPosCityMasterVOLst.size());
		LOGGER.info("parameterMasterLocalizationLst size:"+ parameterMasterLocalizationLst.size());
		 */
        
        paymentMappingVOLst
        .stream()
        .flatMap(c1 ->
        parameterMasterLocalizationLst.stream()
       // .filter(Objects::nonNull)
        .filter(c2 -> c1.getMasterNumber().equalsIgnoreCase(c2.getMasterNumber())  
        && c2.getLanguage().equalsIgnoreCase(language))        
        .map(c2 -> new AbstractMap.SimpleImmutableEntry<>(c1, c2)))        
        .flatMap(c3 -> 	        
        parameterMasterVOLst.stream()        
       // .peek(pmlocal -> LOGGER.info("parameterMasterLocalizationLst size: " + c3.getKey()))
	   .filter(c4 -> c4.getCategoryNumber().equalsIgnoreCase(c3.getKey().getCategoryNumber())
	    		&& c3.getKey().getMasterNumber().equalsIgnoreCase(c4.getMasterCode()) 
	     ) 
        .map(c5 -> new AbstractMap.SimpleImmutableEntry<>(c5,c3)))
        .flatMap(c6 -> 	
        airlinkPosCityMasterVOLst.stream() 
        //.filter(Objects::nonNull)
        .filter(c7-> c6.getValue().getKey().getPosId().equalsIgnoreCase(c7.getPosId())
        		&& c7.getCityCode().equalsIgnoreCase(posCity)
        		&& c7.getProductMasterCode().equalsIgnoreCase(productCode)
        		&& c6.getKey().getCategoryNumber().equalsIgnoreCase("5")
        		&& "Y".equalsIgnoreCase(c6.getKey().getActInd())
        		&& "Y".equalsIgnoreCase(c6.getValue().getKey().getActInd())
        		&& CommonsUtil.dayDifference(departureDate)>0)
       .map(c5 -> new AbstractMap.SimpleImmutableEntry<>(c5,c6)))       
       .collect(Collectors.toList())          
       .stream()         
       .forEach(i -> {
    	  // LOGGER.info("getMasterCode:"+ i.getValue().getKey().getMasterCode());
    	   AirLinkParameterMasterVO airLinkParameterMasterVO = new AirLinkParameterMasterVO(); 
    	   airLinkParameterMasterVO.setMasterCode(i.getValue().getKey().getMasterCode());
    	   airLinkParameterMasterVO.setMasterDescription(i.getValue().getKey().getMasterDescription());
    	   airLinkParameterMasterVO.setMasterNumber(i.getValue().getKey().getMasterNumber());
    	   airLinkParameterMasterVO.setValue(i.getValue().getValue().getKey().getHours());
    	   parameterMasterVOReturnLst.add(airLinkParameterMasterVO);         
          
       });
    	LOGGER.info("ReturnLst for parameterMaster size:"+ parameterMasterVOReturnLst.size());   
   return parameterMasterVOReturnLst;
	 
	} 

 

 
	public List<TripDetailsVO> getBookingDetails(final SavePNRRequestVO tripDetailsRequestVO)
			throws DataAccessException {
		LOGGER.info("Inside getBookingDetails " + tripDetailsRequestVO.getPnrNum());
		return new ArrayList<TripDetailsVO>();
	//	String query = environment.getRequiredProperty("getBookingDetails.query");
		 
	}
 /**
	 * This method checks whether the PNR number has already been added or not
	 */
 
	public List<TripDetailsVO> isPNRdetailsExist(String pnrNum) {
 
		String isPNRdetailsExistQuery = environment.getRequiredProperty("getBookingDetails.query");
		/*return getJdbcTemplate().query(isPNRdetailsExistQuery, new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, pnrNum);
			}
		}, new TripDetailsMapper());*/
		return new ArrayList<TripDetailsVO>();
	}
 /**
	 * This method returns the booking details for a particular email id
	 */
	public List<TripDetailsVO> checkBookingDetails(RetrieveRequestVO retrieveRequest) {
		 
		String checkBookingDetailsQuery = environment.getRequiredProperty("checkBookingDetails.query");
		 
		return new ArrayList<TripDetailsVO>();
	}
	/**
	 * Method to list the Airport description for a given city and localization
	 * @param cityCode
	 * @param localization
	 * @return cityVO list
	 */
	public List<CitiesVO> getAirportDescription(final String cityCode, final String localization) throws DataAccessException {
 
		String query =  environment.getRequiredProperty("getAirportDescription.query");
		return new ArrayList<CitiesVO>();
		/*return getJdbcTemplate().query(query, new PreparedStatementSetter() {
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, localization);
				ps.setString(2, cityCode);
			}
		}, new CityMasterEntitiesMapper());*/

	}

	public List<String> getOfficeIdList() {
		String query = "select office_id from airlink_office_id_table";
		return new ArrayList<String>();		 
	}
	
 
	 
	public String checkBusinessClassEnabled(String departure,String destination) {
 
		String checkBusinessClassEnabledQuery = environment.getRequiredProperty("checkBusinessClassEnabled.query");
		List<String> businessClassCheck= null; 
		
		LOGGER.info("businessClassCheckVO.getBusinessClassList().get(0) : "+businessClassCheck.get(0));
		return businessClassCheck.get(0);

	}
	 
}
	 
