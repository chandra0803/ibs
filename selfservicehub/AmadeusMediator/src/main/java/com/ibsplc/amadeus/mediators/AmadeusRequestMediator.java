package com.ibsplc.amadeus.mediators;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.ibsplc.amadeus.util.MediatorUtil;

public class AmadeusRequestMediator extends AbstractMediator {

	public boolean mediate(MessageContext messageContext) {
		try {
			String nonce = MediatorUtil.getSoapNonce();
			String createdDate = MediatorUtil.getCreatedDate();
			String amadeusPassword = null;
			if (messageContext.getProperty("amadeusPassword") != null) {
				amadeusPassword = (String) messageContext.getProperty("amadeusPassword");
			} else {
				log.error("Amadeus web service password not found in registry");
				return false;
			}
			String password = MediatorUtil.getSoapPassword(amadeusPassword, createdDate, nonce);
			//log.info("password: " + password + " | createdDate: " + createdDate + " | nonce: " + nonce);
			messageContext.setProperty("nonce", nonce);
			messageContext.setProperty("createdDate", createdDate);
			messageContext.setProperty("password", password);
			return true;
		} catch (Exception e) {
			log.error("Exception in AmadeusRequestMediator.mediate: ", e);
			return false;
		}
	}

}
