package com.ibsplc.pushNotification.mediators;

import org.apache.synapse.MessageContext;
import org.apache.synapse.mediators.AbstractMediator;

import com.ibsplc.pushNotification.util.AmadeusMediatorUtil;

public class NotificationAmadeusRequestMediator extends AbstractMediator {

	public boolean mediate(MessageContext messageContext) {
		try {
			String nonce = AmadeusMediatorUtil.getSoapNonce();
			String createdDate = AmadeusMediatorUtil.getCreatedDate();
			String amadeusPassword = null;
			if (messageContext.getProperty("mqAmadeusPassword") != null) {
				amadeusPassword = (String) messageContext.getProperty("mqAmadeusPassword");
			} else {
				log.error("Amadeus DCS web service password not found in registry");
				return false;
			}
			String password = AmadeusMediatorUtil.getSoapPassword(amadeusPassword, createdDate, nonce);
			log.info("dcs ws password: " + password + " | createdDate: " + createdDate + " | nonce: " + nonce);
			messageContext.setProperty("nonce", nonce);
			messageContext.setProperty("createdDate", createdDate);
			messageContext.setProperty("password", password);
			return true;
		} catch (Exception e) {
			log.error("Exception in AmadeusDCSRequestMediator.mediate: ", e);
			return false;
		}
	}

}
