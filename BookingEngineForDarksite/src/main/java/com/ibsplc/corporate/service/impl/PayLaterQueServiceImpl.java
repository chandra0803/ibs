package com.ibsplc.corporate.service.impl;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.controller.CommonController;
import com.ibsplc.common.persistence.dao.CommonDao;
import com.ibsplc.common.persistence.dao.entity.PnrListDB;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.common.vo.ItineraryVO;
import com.ibsplc.corporate.service.PayLaterQueService;
import com.ibsplc.framework.exception.model.CustomException;
import com.ibsplc.framework.exception.model.CustomGenericException;
import com.ibsplc.framework.util.date.DateUtilities;
import com.ibsplc.framework.util.filereader.FileReader;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.reservation.util.BookingTransformer;
import com.ibsplc.reservation.vo.BookingInformationVO;
import com.ibsplc.reservation.vo.BookingVO;
import com.ibsplc.reservation.vo.Remarks;
import com.ibsplc.reservation.vo.RetrievePNRResponseVO;
@Service("payLaterQueService")
public class PayLaterQueServiceImpl implements PayLaterQueService{
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CommonDao commonDao;
	
	@Autowired
	private CommonController commonController;
	
	private static final Logger LOGGER = Log4j2Logger.create(PayLaterQueServiceImpl.class);
	
	private static final String ERROR_RESULT_CODE = "201";
	private static final String EXCEPTION_RESULT_CODE = "500";
	private static final String HYPHEN = "-";
	private static final String CUSTOM_ERROR_CODE_1002 = "1002";


	/*public void callListOfPNR() {
		
		LOGGER.info("Inside callListOfPNR method");
		
		ResponseEntity<AmadeusQueListResponse> response = null;
		Properties configProperties = FileReader.getProperties("/eRetail.properties");
		String postUrl = null;
		PNRListResponseVO pnrListResponseVO = null;
		
		String customMessageOne = configProperties.getProperty("pnrlist.custom.message.one");
		String customMessageTwo = configProperties.getProperty("pnr.custom.message.two");
		
		LOGGER.info("Custom message one : "+customMessageOne+", custom message two : "+customMessageTwo);
		
		//Retrieving the list of Pay later PNRs from Q99 
		PNRListRequestVO pnrListRequestVO = new PNRListRequestVO();
		pnrListRequestVO.setOfficeID("");
		List<DateVO> dateperiod = new DateUtilities().getDatePeriod();
		pnrListRequestVO.setBeginDay(dateperiod.get(1).getDay());
		pnrListRequestVO.setBeginMonth(dateperiod.get(1).getMonth());
		pnrListRequestVO.setBeginYear(dateperiod.get(1).getYear());
		pnrListRequestVO.setEndDay(dateperiod.get(0).getDay());
		pnrListRequestVO.setEndMonth(dateperiod.get(0).getMonth());
		pnrListRequestVO.setEndYear(dateperiod.get(0).getYear());
//		pnrListRequestVO.setSelectionDetails(configProperties.getProperty("SELECTION_DETAILS"));
//		pnrListRequestVO.setQueNumber(configProperties.getProperty("QUEUE_NUMBER"));
//		pnrListRequestVO.setOfficeID(configProperties.getProperty("OFFICE_ID"));
		pnrListRequestVO.setSelectionDetails("CD");
		pnrListRequestVO.setQueNumber("32");
		pnrListRequestVO.setOfficeID("JNB4Z08AA");
		pnrListRequestVO.setCategoryNumber("1");
		pnrListRequestVO.setCategoryType("C");
		//a-8551
		List<PNRListVO> pnrListVOs = new ArrayList<>();
		try {
			
			LOGGER.info("Retrieving PNRList against OfficeId : " + pnrListRequestVO.getOfficeID() + " from Queue: "
					+ pnrListRequestVO.getQueNumber());
				
				postUrl = configProperties.getProperty("AMADEUS_PNRLIST_ENDPOINT");
			
			RestTemplate restTemp = new RestTemplate();
			LOGGER.info("Begin /POST request to fetch PNRList from " + postUrl);
			
			try {
				response = restTemp.postForEntity(postUrl, pnrListRequestVO, AmadeusQueListResponse.class);
			}
			catch (RestClientException e) {
				LOGGER.error("Rest client exception while calling retrieve PNR list "+ e);
			}
				if (response != null && response.getBody() != null && response.getBody().getAmadeusQueResponse() != null) {
					String resultCode = response.getBody().getAmadeusQueResponse().getResultCode();
					LOGGER.info("Response code: ---" + resultCode);

					if (CommonsUtil.isStringValid(resultCode) && resultCode.equals(ERROR_RESULT_CODE)) {
						LOGGER.info("PNR List error. Error code in response : "
								+ response.getBody().getAmadeusQueResponse().getResultCode());
						throw new CustomException(ERROR_RESULT_CODE,
								configProperties.getProperty("pnrlist.retrieve.error"));
						
					} else if (CommonsUtil.isStringValid(resultCode) && resultCode.equals(EXCEPTION_RESULT_CODE)) {
						LOGGER.info("PNR List exception. Error code in response : "
								+ response.getBody().getAmadeusQueResponse().getResultCode());
						throw new CustomException(EXCEPTION_RESULT_CODE,
								customMessageOne + HYPHEN + CUSTOM_ERROR_CODE_1002 + HYPHEN + customMessageTwo);
					}
					
					if( response.getBody().getAmadeusQueResponse().getQueListDetails() != null
						&& response.getBody().getAmadeusQueResponse().getQueListDetails().getPnrListVOs() != null){
						pnrListResponseVO = response.getBody().getAmadeusQueResponse();	
						//a-8551
						 pnrListVOs=pnrListResponseVO.getQueListDetails().getPnrListVOs();
						}
				}
				//Need to change the entity PNRListDB
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
				List<PnrListDB> pnrListDB=commonDao.getListOfFoaPnr(formatter.format(new java.util.Date()));
				//Get List of PNRs from DB
				List<String> pnrListFromDB=new ArrayList<String>();
				for(PnrListDB pnrVO:pnrListDB) {
					if(pnrVO.getPnrActive())
					pnrListFromDB.add(pnrVO.getPnr());
				}
				//Retrieve the list of PNRs which are not available in DB
				List<PnrVO> pnrList=new ArrayList<PnrVO>();
				
				for(PNRListVO pnrListVO:pnrListVOs) {					
					if(!(pnrListFromDB.contains(pnrListVO.getPnrNumber()))) {
						PnrVO pnrVO=new PnrVO();
						pnrVO.setPnr(pnrListVO.getPnrNumber());
						pnrVO.setSurName(pnrListVO.getSurName());
						pnrList.add(pnrVO);
					}		
				}
				LOGGER.info("List of new pnr's which is not entered in DB"+pnrList.toString());
				//Retrieve the PNR details
				for(PnrVO pnrVO:pnrList) {
					String retrieveUrl= configProperties.getProperty("AMADEUS_RETRIEVE_PNR_ENDPOINT");
					LOGGER.info("Retrieve URL : "+retrieveUrl);
					boolean status=retrieveAndSavePnrDetails(pnrVO,retrieveUrl,configProperties);
					if(status)
						LOGGER.info("Retrieved and saved the PNR:"+pnrVO.getPnr()+" successfully");
					else {
						LOGGER.info("Exception while retrieving and saving the details of PNR:"+pnrVO.getPnr());
					}
						
				}
					
		}catch(Exception e) {
			LOGGER.info("Exception while calling the list of PNRs:"+e);
			
		}
		
		
	}
	
	public boolean retrieveAndSavePnrDetails(PnrVO pnrVO,String url,Properties configProperties) {
		
		String clientSessionId=commonController.getNewSessionId();
		
		String displayMessage = configProperties.getProperty("error.message.to.users");
		String customMessageOne = configProperties.getProperty("pnr.custom.message.one");
		String customMessageTwo = configProperties.getProperty("pnr.custom.message.two");
		
		BookingInformationVO bookingInfo = new BookingInformationVO();
		bookingInfo.setPnrNumber(pnrVO.getPnr());
		bookingInfo.setSurName(pnrVO.getSurName());
		bookingInfo.setClientSessionId(clientSessionId);
		
		 * 
		 * 
		 * 
		 

		ResponseEntity<RetrievePNRResponseVO> response = null;
		RestTemplate restTemp = new RestTemplate();
		
		BookingVO bookingVO = null;
		try {
			response = restTemp.postForEntity(url, bookingInfo,
					RetrievePNRResponseVO.class);
			if (null != response && response.getBody() != null && response.getBody().getAmadeusResponse() != null) {
				String resultCode = response.getBody().getAmadeusResponse().getResultCode();
				LOGGER.info("Response code: ---" + resultCode);
				
				if (CommonsUtil.isStringValid(resultCode) && resultCode.equals(CommonKeys.ERROR_RESULT_CODE)) {
					throw new CustomException(CommonKeys.ERROR_RESULT_CODE,
							environment.getRequiredProperty("pnr.retrieve.error"));
				} else if (CommonsUtil.isStringValid(resultCode)
						&& resultCode.equals(CommonKeys.EXCEPTION_RESULT_CODE)) {
					throw new CustomException(CommonKeys.ERROR_RESULT_CODE, customMessageOne + CommonKeys.HYPHEN
							+ CommonKeys.CUSTOM_ERROR_CODE_1002 + CommonKeys.HYPHEN + customMessageTwo);
				}
				RetrievePNRResponseVO result = response.getBody();
				bookingVO = BookingTransformer.transform(result);
			} else {
				LOGGER.info("Error while retrieving booking details from Amadeus WS ---");
				throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, displayMessage);
			}
		} catch (RestClientException e) {
			LOGGER.info("Error while retrieving booking details from Amadeus WS : " + e);
			throw new CustomException(CommonKeys.ERROR_RESULT_CODE, e, customMessageOne + CommonKeys.HYPHEN
					+ CommonKeys.CUSTOM_ERROR_CODE_1001 + CommonKeys.HYPHEN + customMessageTwo);
		}
		
		return savePayLaterPnr(bookingVO);
	}

	private boolean savePayLaterPnr(BookingVO bookingVO) {
		// TODO Auto-generated method stub
		
		//PnrListDB pnrDBEntity=new PnrListDB();
		//LOGGER.info("Product type : "+bookingVO.getProduct());
		//if(bookingVO.getProduct().equalsIgnoreCase("B2B")) {
		
		LOGGER.info("Inside savePayLaterPnr method for PNR : "+bookingVO.getPnrNumber()+", "+bookingVO.getPnrNum());
			
			String departureDate=null;
			if(bookingVO.getItineraryDetails()!=null&&bookingVO.getItineraryDetails().size()>0)
				departureDate=bookingVO.getItineraryDetails().get(0).getDepartureDate();
			
			LOGGER.info("Departure date : "+departureDate);
				
			if(bookingVO.getRemarksList()!=null) {
				LOGGER.info("Remarklist is present");
				if(bookingVO.getRemarksList().getRemarks()!=null) {
		for(Remarks remarks:bookingVO.getRemarksList().getRemarks()) {
			LOGGER.info("Remark Type : "+remarks.getType());
		if(remarks.getType().contains("RM")&& remarks.getFreetext().contains("FOA FLIGHTSEARCH REMARKS")) {
			LOGGER.info("FOA PNR:"+bookingVO.getPnrNum()+" is an FOA PNR");
			int startIndex=remarks.getFreetext().indexOf("-")+1;
			int endIndex=remarks.getFreetext().indexOf("%%F");
			//pnrDBEntity.setSession_id(remarks.getFreetext().substring(startIndex, endIndex));
			//LOGGER.info("FOA session id : "+pnrDBEntity.getSession_id());
			String reverseRemark=new StringBuilder(remarks.getFreetext()).reverse().toString();
			String userIDReverse=reverseRemark.split("F%%")[0];
			String crpIdReverse=reverseRemark.split("F%%")[1];
			LOGGER.info("Setting crp id....");
		//		pnrDBEntity.setCrp_id(Integer.parseInt(new StringBuilder(crpIdReverse).reverse().toString()));
		//		LOGGER.info("Setting user id....");
		//		pnrDBEntity.setUser_id(Integer.parseInt(new StringBuilder(userIDReverse).reverse().toString()));
		//		
		//		LOGGER.info("Setting PNR....");
		//		pnrDBEntity.setPnr(bookingVO.getPnrNum());
		
		
		try {
//			if(departureDate!=null) {
//			Date date=(Date) new SimpleDateFormat("dd-MM-yyyy").parse(departureDate);
//			LOGGER.info("Setting departure date....");
//			pnrDBEntity.setDeparture_field_one(date);
//			}
				Gson gson = null;
				gson = new GsonBuilder().serializeNulls().create();
		      if(!CollectionUtils.isEmpty(bookingVO.getItineraryDetails())) {
		        	 for(ItineraryVO itineraryVO : bookingVO.getItineraryDetails()) {
		        	 PnrListDB pnrDBEntity=new PnrListDB();
		        	 pnrDBEntity.setPnr(bookingVO.getPnrNum());
		        	 pnrDBEntity.setSession_id(remarks.getFreetext().substring(startIndex, endIndex));
		        	 pnrDBEntity.setCrp_id(Integer.parseInt(new StringBuilder(crpIdReverse).reverse().toString()));
		        	 pnrDBEntity.setUser_id(Integer.parseInt(new StringBuilder(userIDReverse).reverse().toString()));
		        	 if(!CollectionUtils.isEmpty(bookingVO.getPassengerDetails()))
		        		 pnrDBEntity.setPassenger_dtl(gson.toJson(bookingVO.getPassengerDetails()));
		        	 pnrDBEntity.setItinerary_dtl(gson.toJson(itineraryVO));
		        	 pnrDBEntity.setDeparture_field_one(parseAmdeusDepartureDate(itineraryVO.getDepartureDate()));
		        	 pnrDBEntity.setPayLater(true);
		        	 pnrDBEntity.setPnrActive(true);
		        	 pnrDBEntity.setCreation_time(new java.util.Date());
		        	 commonDao.saveOrUpdatePayLaterPNR(pnrDBEntity);
	     		     LOGGER.info("FOA Details saved to DB");
				      pnrDBEntity=null;
		         } 
		        	 return true;
				}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.info("Exception occured while saving the details in DB:"+e);
			return false;
		}
		
//		try {
//			LOGGER.info("Saving details in foa_pnr_table");
//		commonDao.saveOrUpdatePayLaterPNR(pnrDBEntity);
//		return true;
//		}catch(Exception e) {
//			LOGGER.info("Exception occured while saving the details in DB:"+e);
//			return false;
//		}
		
		}
		
		
		
		}
			}
		}else {
			
			LOGGER.info("Remarklist is null");
			return false;
			
		}
		}else {
			LOGGER.info("PNR is not a B2B PNR");
			return false;
		}
		return false;
						
	}
	
	public java.util.Date parseAmdeusDepartureDate(String originalDepartureDate) {
		try {
			LOGGER.entering("PaylaterQueueServiceImpl", "parseAmdeusDepartureDate");
			LOGGER.info("Input date "+originalDepartureDate);
		DateFormat DateFormat;
		DateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm");
		java.util.Date originalDate = DateFormat.parse(originalDepartureDate);
		DateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String finalDepartureDateString = DateFormat.format(originalDate);
		System.out.println(finalDepartureDateString);
		//again bak to date
		java.util.Date finalDepartureDate = DateFormat.parse(finalDepartureDateString);
		LOGGER.info("Final departure Date:"+finalDepartureDate);
		return finalDepartureDate;
		}catch(Exception e) {
			LOGGER.info("Parse exception in parseAmdeusDepartureDate "+e.toString() );
		}
		return null;
	
	
}*/
}