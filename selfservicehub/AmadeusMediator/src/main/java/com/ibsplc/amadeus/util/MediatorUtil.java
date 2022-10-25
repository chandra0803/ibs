package com.ibsplc.amadeus.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class MediatorUtil {

	private static final Log LOGGER = LogFactory.getLog(MediatorUtil.class);

	public static String getSoapPassword(String password, String createdDate, String nonce) {
		String passwordDigest = null;
		MessageDigest sha1;

		try {
			sha1 = MessageDigest.getInstance("SHA-1");
			sha1.update(Base64.getDecoder().decode(nonce));
			sha1.update(createdDate.getBytes(StandardCharsets.UTF_8));
			byte[] hash = MessageDigest.getInstance("SHA-1").digest(password.getBytes(StandardCharsets.UTF_8));
			passwordDigest = Base64.getEncoder().encodeToString(sha1.digest(hash));
			sha1.reset();
		} catch (Exception e) {
			LOGGER.error("Exception in getSoapPassword: ", e);
		}
		LOGGER.info("passwordDigest: " + passwordDigest);
		return passwordDigest;
	}

	public static String getSoapNonce() {
		String nonce = null;

		SecureRandom random = null;
		try {
			random = SecureRandom.getInstance("SHA1PRNG");
			byte[] nonceValue = new byte[16];
			random.nextBytes(nonceValue);
			nonce = Base64.getEncoder().encodeToString(nonceValue);
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error("Exception in getSoapNonce: ", e);
		}
		return nonce;
	}

	public static String getCreatedDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:sss'Z'");
		long ONE_MINUTE_IN_MILLIS = 60000;
		Calendar calendar = Calendar.getInstance();
		long t = calendar.getTimeInMillis();
		Date date = new Date(t + (1 * ONE_MINUTE_IN_MILLIS));
		sdf.setTimeZone(TimeZone.getTimeZone("Zulu"));
		String createdDate = sdf.format(date);
		return createdDate;
	}

	public static String getExpiresDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:sss'Z'");
		long ONE_MINUTE_IN_MILLIS = 60000;
		Calendar calendar = Calendar.getInstance();
		long t = calendar.getTimeInMillis();
		Date date = new Date(t + (2 * ONE_MINUTE_IN_MILLIS));
		sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
		String expiresDate = sdf.format(date);
		//String expiresDate = sdf.format(calendar.getTime());
		return expiresDate;
	}

}
