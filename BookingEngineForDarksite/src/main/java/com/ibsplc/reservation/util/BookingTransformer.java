package com.ibsplc.reservation.util;

import java.util.ArrayList;
import java.util.List;

import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.reservation.vo.BookingVO;
import com.ibsplc.reservation.vo.RemarkList;
import com.ibsplc.reservation.vo.Remarks;
import com.ibsplc.reservation.vo.RemarksList;
import com.ibsplc.reservation.vo.RetrievePNRResponseVO;
import com.ibsplc.reservation.vo.TicketProcessVO;
import com.ibsplc.reservation.vo.RemarksList;

/**
 * @author a-5316
 *
 */
public class BookingTransformer {
	/**
	 * to get logs
	 */
	private static final Logger LOGGER = Log4j2Logger.create(BookingTransformer.class);

	private BookingTransformer() {

	}

	/**
	 * Transforms the response into a BookingVO
	 *
	 * @param response
	 *            received from Amadeus
	 * 
	 * @return bookingVO
	 */
	public static BookingVO transform(final RetrievePNRResponseVO result) {

		BookingVO bookingVO = new BookingVO();
		if (result != null && result.getAmadeusResponse() != null
				&& result.getAmadeusResponse().getPnrDetails() != null) {

			LOGGER.info("Response for Post Request:: " + result.getAmadeusResponse().toString());
			String creationOfficeID = result.getAmadeusResponse().getPnrDetails().getCreatingOfficeId();
			LOGGER.info("Creation OfficeId:  " + creationOfficeID);
			bookingVO.setAmadeusSiteOfficeID(creationOfficeID);
			bookingVO.setServiceSessionId(result.getAmadeusResponse().getSessionId());
			bookingVO.setSequenceNumber(result.getAmadeusResponse().getSequenceNumber());
			bookingVO.setSecurityToken(result.getAmadeusResponse().getSecurityToken());
			bookingVO.setPnrNum(result.getAmadeusResponse().getPnrDetails().getPnrNumber());

			bookingVO.setTicketed(result.getAmadeusResponse().getPnrDetails().isTicketed());
			bookingVO.setEmdDetails(result.getAmadeusResponse().getPnrDetails().getEmdDetails());
			bookingVO.setPassengerDetails(result.getAmadeusResponse().getPnrDetails().getPassengerDetails());
			bookingVO.setItineraryDetails(result.getAmadeusResponse().getPnrDetails().getItineraryDetails());
			bookingVO.setAdultFareBreakDownMap(result.getAmadeusResponse().getPnrDetails().getAdultFareBreakDownMap());
			bookingVO.setChildFareBreakDownMap(result.getAmadeusResponse().getPnrDetails().getChildFareBreakDownMap());
			bookingVO
					.setInfantFareBreakDownMap(result.getAmadeusResponse().getPnrDetails().getInfantFareBreakDownMap());
			bookingVO.setEmailId(result.getAmadeusResponse().getPnrDetails().getEmailAddress());
			bookingVO.setFareDetails(result.getAmadeusResponse().getPnrDetails().getFareDetails());
			bookingVO.setSource(result.getAmadeusResponse().getPnrDetails().getBookingSource());
			bookingVO.setResultMessage(result.getAmadeusResponse().getResultMessage());
			bookingVO.setEmdAmount(result.getAmadeusResponse().getPnrDetails().getEmdAmount());

			bookingVO.setTotalAmountForAdults(result.getAmadeusResponse().getPnrDetails().getTotalAmountForAdults());
			bookingVO
					.setTotalAmountForChildren(result.getAmadeusResponse().getPnrDetails().getTotalAmountForChildren());
			bookingVO.setTotalAmountForInfants(result.getAmadeusResponse().getPnrDetails().getTotalAmountForInfants());

			bookingVO.setTotalBookingAmount(result.getAmadeusResponse().getPnrDetails().getTotalBookingAmount());
			if (result.getAmadeusResponse().getPnrDetails().getFareDetails() != null
					&& result.getAmadeusResponse().getPnrDetails().getFareDetails().getPenaltyDetails() != null) {
				bookingVO.setPenaltyFee(result.getAmadeusResponse().getPnrDetails().getFareDetails().getPenaltyDetails()
						.getPenaltyAmount());
			}
			
			List<RemarkList> remarkList=result.getAmadeusResponse().getPnrDetails().getRemarkLists();
			List<Remarks> remarksList=new ArrayList<Remarks>();
			
			if(remarkList!=null) {
			for(RemarkList remark:remarkList) {
				
				if(remark.getExtendedRemark()!=null) {
					Remarks extRemarks=new Remarks();
					if(remark.getExtendedRemark().getStructuredRemark().getType()!=null)
					extRemarks.setType(remark.getExtendedRemark().getStructuredRemark().getType());	
					if(remark.getExtendedRemark().getStructuredRemark().getFreetext()!=null)
					extRemarks.setFreetext(remark.getExtendedRemark().getStructuredRemark().getFreetext());
					if(extRemarks!=null)
					remarksList.add(extRemarks);
				}
				
				if(remark.getMiscellaneousRemarks()!=null) {
					Remarks misRemarks=new Remarks();
					if(remark.getMiscellaneousRemarks().getRemarks().getType()!=null)
					misRemarks.setType(remark.getMiscellaneousRemarks().getRemarks().getType());
					if(remark.getMiscellaneousRemarks().getRemarks().getFreetext()!=null)
					misRemarks.setFreetext(remark.getMiscellaneousRemarks().getRemarks().getFreetext());
					if(misRemarks!=null)
					remarksList.add(misRemarks);
				}
			}
			RemarksList finalRemarks = new RemarksList();
			finalRemarks.setRemarks(remarksList);
			bookingVO.setRemarksList(finalRemarks);
		}
			
			RemarksList remarksListVO=new RemarksList();
			remarksListVO.setRemarks(remarksList);
			bookingVO.setRemarksList(remarksListVO);

		}
		return bookingVO;
	}

	/**
	 * Transforms the Ticket Process EDoc response into a TicketProcessVO
	 *
	 * @param response
	 *            received from Amadeus
	 * 
	 * @return TicketProcessVO
	 */
	public static TicketProcessVO transformResponse(final RetrievePNRResponseVO result) {

		TicketProcessVO ticketProcessVO = new TicketProcessVO();
		if (result != null && result.getAmadeusResponse() != null
				&& result.getAmadeusResponse().getPnrDetails() != null) {

			LOGGER.info("eDoc Response for Post Request:: " + result.getAmadeusResponse().toString());
			ticketProcessVO.setTaxDetails(result.getAmadeusResponse().getPnrDetails().getTaxDetails());
			ticketProcessVO.setFareInfoDetails(result.getAmadeusResponse().getPnrDetails().getFareInfoDetails());

			ticketProcessVO.setServiceSessionId(result.getAmadeusResponse().getSessionId());
			ticketProcessVO.setSecurityToken(result.getAmadeusResponse().getSecurityToken());
			ticketProcessVO.setSequenceNumber(result.getAmadeusResponse().getSequenceNumber());
		}
		return ticketProcessVO;
	}

}
