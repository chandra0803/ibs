package com.ibsplc.pushNotification.mediators;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.collections.CollectionUtils;
import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.amadeus.xml.apalrr_17_1_1a.DCSLSTGetPassengerListReply;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.pushNotification.util.MqResponseTransformer;
import com.ibsplc.pushNotification.vo.PassengerListVO;

public class PassengerListResponseMediator extends AbstractMediator {

	public boolean mediate(MessageContext context) {

		log.info("Entering PassengerListResponseMediator");
		String errorMsg = CommonKeys.ERROR;
		String soapMessage = context.getEnvelope().getBody().getFirstElement().toString();
		//PassengerListVO passengerListVO = (PassengerListVO) context.getProperty("passengerListVO");

		InputStream inputStream = new ByteArrayInputStream(soapMessage.getBytes(Charset.forName("UTF-8")));
		Unmarshaller unmarshaller;
		try {
			unmarshaller = JAXBContext.newInstance(DCSLSTGetPassengerListReply.class).createUnmarshaller();
			DCSLSTGetPassengerListReply passengerListReply = (DCSLSTGetPassengerListReply) unmarshaller
					.unmarshal(inputStream);
			int sequence = 1;
			if (context.getProperty("sequenceNumber") != null) {
				String sequenceNumber = (String) context.getProperty("sequenceNumber");
				sequence = Integer.parseInt(sequenceNumber) + 1;
				context.setProperty("sequenceNumber", String.valueOf(sequence));
			}
			if (passengerListReply != null && passengerListReply.getFlightDetailsGroup() != null) {
				log.info(" PassengerList Figures returned");
				PassengerListVO passengerListVORES=MqResponseTransformer.transformPassengerListReply(passengerListReply);
				context.setProperty("PassengerListResponseStatus", CommonKeys.SUCCESS);
				ObjectMapper mapperObj = new ObjectMapper();
				String jsonResponse = null;
				jsonResponse = mapperObj.writeValueAsString(passengerListVORES);
				context.setProperty("paxListVO", passengerListVORES);
				context.setProperty("paxListReponse", jsonResponse.toString());
			} else {

				if (CollectionUtils.isNotEmpty(passengerListReply.getErrors())
						&& passengerListReply.getErrors().size() > 0) {
					if (!passengerListReply.getErrors().get(0).getErrorWarningDescription().getFreeText().isEmpty()) {
						log.info("Invalid response ::" + passengerListReply.getErrors().get(0)
								.getErrorWarningDescription().getFreeText().get(0));
						errorMsg = passengerListReply.getErrors().get(0).getErrorWarningDescription().getFreeText()
								.get(0);
					}
				}
				context.setProperty("PassengerListResponseStatus", CommonKeys.ERROR);
				context.setProperty("PassengerListResponseErrorMessage", errorMsg);
			}

		} catch (Exception e1) {
			log.error("Exception while processiong the passenger List Figures: ", e1);
			context.setProperty("PassengerListResponseErrorMessage", "Exception while processiong the PassengerListResponse response");
			context.setProperty("PassengerListResponseStatus", CommonKeys.ERROR);
			return true;
		}

		return true;
	}

}
