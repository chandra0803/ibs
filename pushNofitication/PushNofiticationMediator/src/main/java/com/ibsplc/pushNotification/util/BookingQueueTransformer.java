package com.ibsplc.pushNotification.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amadeus.xml.pnracc_17_1_1a.ElementManagementSegmentType;
import com.amadeus.xml.pnracc_17_1_1a.LongFreeTextType;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply;
import com.amadeus.xml.pnracc_17_1_1a.PNRReply.DataElementsMaster.DataElementsIndiv;
import com.amadeus.xml.pnracc_17_1_1a.TravellerInformationType185946S;
import com.ibsplc.pushNotification.types.ContactInfoType;
import com.ibsplc.pushNotification.vo.AlternateContactDetailsVO;
import com.ibsplc.pushNotification.vo.BookingVO;
import com.ibsplc.pushNotification.vo.PaxVO;

public class BookingQueueTransformer {

	/**
	 * Logger.
	 */
	private static final Log log = LogFactory.getLog(BookingQueueTransformer.class);

	public static BookingVO transformingPNRNotifyContact(final PNRReply pnrReply) {
		log.info("Transforming the Amadeus PNR Reply");
		BookingVO bookingVO = new BookingVO();

		// TravellerInfo - surname
		PaxVO paxVO = null;
		List<PaxVO> passengerDetails = new ArrayList<PaxVO>();
		if (pnrReply.getTravellerInfo() != null) {
			for (PNRReply.TravellerInfo travellerInfo : pnrReply.getTravellerInfo()) {
				if (travellerInfo.getPassengerData() != null && travellerInfo.getPassengerData().get(0) != null
						&& travellerInfo.getPassengerData().get(0).getTravellerInformation() != null) {

					paxVO = new PaxVO();
					TravellerInformationType185946S travellerInfoobj = travellerInfo.getPassengerData().get(0)
							.getTravellerInformation();
					if (travellerInfoobj.getTraveller() != null) {
						paxVO.setSurName(travellerInfoobj.getTraveller().getSurname());
					}

				}
				passengerDetails.add(paxVO);
			}
		}
		bookingVO.setPassengerDetails(passengerDetails);

		// PNR Number
		if (pnrReply.getPnrHeader() != null && pnrReply.getPnrHeader().get(0) != null
				&& pnrReply.getPnrHeader().get(0).getReservationInfo() != null
				&& pnrReply.getPnrHeader().get(0).getReservationInfo().getReservation() != null
				&& pnrReply.getPnrHeader().get(0).getReservationInfo().getReservation().get(0) != null) {
			bookingVO.setPnrNumber(
					pnrReply.getPnrHeader().get(0).getReservationInfo().getReservation().get(0).getControlNumber());
		}

		// Office ID
		if (pnrReply.getSecurityInformation() != null) {
			if (pnrReply.getSecurityInformation().getResponsibilityInformation() != null) {
				bookingVO.setOfficeId(pnrReply.getSecurityInformation().getResponsibilityInformation().getOfficeId());
			}
			if (pnrReply.getSecurityInformation().getSecondRpInformation() != null) {
				bookingVO.setCreatingOfficeId(
						pnrReply.getSecurityInformation().getSecondRpInformation().getCreationOfficeId());
			}
		}

		// Contact Info
		if (pnrReply.getDataElementsMaster() != null
				&& CollectionUtils.isNotEmpty(pnrReply.getDataElementsMaster().getDataElementsIndiv())) {
			for (DataElementsIndiv dataElementsIndiv : pnrReply.getDataElementsMaster().getDataElementsIndiv()) {
				if (dataElementsIndiv.getElementManagementData() != null) {
					ElementManagementSegmentType segmentType = dataElementsIndiv.getElementManagementData();
					String segmentName = segmentType.getSegmentName();
					String refNumber = null;
					String refQualifier = null;
					if (segmentType.getReference() != null) {
						refNumber = segmentType.getReference().getNumber().toString();
						refQualifier = segmentType.getReference().getQualifier();
					}
					if (StringUtils.equals(segmentName, ContactInfoType.PHONE_DETAILS.getType())) {
						populateNotifyContactDetails(bookingVO, refNumber, dataElementsIndiv);
					}
				}
			}
		}

		return bookingVO;
	}

	/**
	 * Populates Notify contact information on the booking.
	 *
	 * @param bookingVO
	 *            booking.
	 * @param refNumber
	 *            contact info reference.
	 * @param dataElementsIndiv
	 *            contact info data element.
	 */
	private static void populateNotifyContactDetails(final BookingVO bookingVO, final String refNumber,
			final DataElementsIndiv dataElementsIndiv) {
		if (CollectionUtils.isEmpty(dataElementsIndiv.getOtherDataFreetext())) {
			log.error("DataElementsIndiv does not contain OtherDataFreetext for AP reference:" + refNumber);
			return;
		}
		log.info("Populating contact details");
		for (LongFreeTextType longFreeTextType : dataElementsIndiv.getOtherDataFreetext()) {
			if (longFreeTextType.getFreetextDetail() != null) {
				String contactInfoType = longFreeTextType.getFreetextDetail().getType();
				if (longFreeTextType.getLongFreetext() != null) {
					if (StringUtils.equals(contactInfoType, ContactInfoType.CONTACT_NUMBER.getType())) {
						setPhoneNumbers(bookingVO, refNumber, longFreeTextType);
					} else if (StringUtils.equals(contactInfoType, ContactInfoType.EMAIL_ADDRESS.getType())) {
						bookingVO.setEmailAddress(longFreeTextType.getLongFreetext());
						bookingVO.setEmailAddressReferenceNumber(refNumber);
					}
				}
			}
		}
	}

	/**
	 * Sets phone numbers from the {@see LongFreeTextType} to the
	 * {@see BookingVO}.
	 *
	 * @param bookingVO
	 *            booking to set phone numbers on.
	 * @param refNumber
	 *            phone number reference.
	 * @param longFreeTextType
	 *            object containing phone numbers.
	 */
	private static void setPhoneNumbers(final BookingVO bookingVO, final String refNumber,
			final LongFreeTextType longFreeTextType) {
		log.info("Setting phone number from: " + longFreeTextType.getLongFreetext());
		String[] phoneNumberDetails = longFreeTextType.getLongFreetext().split("-");
		if (phoneNumberDetails.length == 2) {
			String phoneNumberType = phoneNumberDetails[1];
			if (StringUtils.equals(phoneNumberType, ContactInfoType.MOBILE_PHONE.getType())) {
				bookingVO.setMobileTelephone(phoneNumberDetails[0]);
				bookingVO.setMobileTelephoneReferenceNumber(refNumber);
			} else if (StringUtils.equals(phoneNumberType, ContactInfoType.HOME_PHONE.getType())) {
				bookingVO.setDayTimeTelephone(phoneNumberDetails[0]);
				bookingVO.setDayTimeTelephoneReferenceNumber(refNumber);
			} else if (StringUtils.equals(phoneNumberType, ContactInfoType.EMERGENCY_PHONE.getType())) {
				AlternateContactDetailsVO alternateContactDetailsVO = new AlternateContactDetailsVO();
				alternateContactDetailsVO.setAltTelePhoneNumber(phoneNumberDetails[0]);
				alternateContactDetailsVO.setReferenceNumber(refNumber);
				bookingVO.setAlternateContactDetailsVO(alternateContactDetailsVO);
			}

		}
		if (longFreeTextType.getFreetextDetail().getStatus() != null && StringUtils
				.equals(longFreeTextType.getFreetextDetail().getStatus(), ContactInfoType.NOTIFY_CONTACT.getType())) {
			String[] notifyNumberDetails = longFreeTextType.getLongFreetext().split("/");
			if (notifyNumberDetails.length == 2) {
				String phoneNumber = notifyNumberDetails[1];
				if (phoneNumber != null && phoneNumber.length() >= 2) {
					String notifNumber = phoneNumber.substring(2);
					bookingVO.setNotifymobileTelephone(notifNumber);
				}
				/*if (phoneNumber != null && phoneNumber.length() >= 4) {
					String notifRefNumber = phoneNumber.substring(1, 4);
					bookingVO.setNotifymobileTelephoneRefNumber(notifRefNumber);
				}
				if (phoneNumber != null && phoneNumber.length() > 4) {
					String notifNumber = phoneNumber.substring(4);
					bookingVO.setNotifymobileTelephone(notifNumber);
				}*/
			}
		}
	}

}