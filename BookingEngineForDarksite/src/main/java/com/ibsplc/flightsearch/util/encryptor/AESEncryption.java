package com.ibsplc.flightsearch.util.encryptor;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.text.SimpleDateFormat;
import java.util.Date;

import xjava.security.Cipher;
import xjava.security.IllegalBlockSizeException;

import com.ibsplc.framework.exception.model.CustomGenericException;
import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

import cryptix.provider.key.RawSecretKey;
import cryptix.util.core.Hex;

/**
 * @author a-5316
 *
 */
public class AESEncryption {
	
	private static final Logger LOGGER = Log4j2Logger.create(AESEncryption.class);
	private Cipher m_alg;
	private RawSecretKey m_key;
	/*
	 * mode of encryption
	 */
	private static final String RIJNDAEL = "Rijndael";
	/*
	 * Cryptography algorithm providers
	 */
	private static final String PROVIDER_CRYPTIX = "Cryptix";
	/*
	 * Amadeus encryption key 256 bits long
	 */ 
	private static final String ENCRYPTION_KEY  = "4A404E635166546A576E5A7234753778214125442A472D4B6150645367556B58";
	private final SimpleDateFormat yyyyMMddHHmmss = new SimpleDateFormat(CommonKeys.AMADEUS_DATE_FORMAT_WITH_TIME);

	/**
	 * Must (once) be dynamically installed. - could alternatively be set
	 * statically in $JAVAHOME/lib/security by changing security provider
	 *
	 */
	static {
		java.security.Security.addProvider(new cryptix.provider.Cryptix());
		//LOGGER.info(" Java Security - Add security provider - Cryptix provider added");
	}
	 
	public AESEncryption() {

	}
	
	public AESEncryption(String secretKey)
			throws java.security.NoSuchProviderException, java.security.NoSuchAlgorithmException {

			m_alg = Cipher.getInstance(RIJNDAEL, PROVIDER_CRYPTIX);
			m_key = new RawSecretKey(RIJNDAEL, Hex.fromString(secretKey));

	}
	
	/**
	 * Internal routine to convert a string to a byte array and to
	 * pad the byte array (with 0) in order to fill out the final block.
	 *
	 * padding value based on Cipher's defined block size.
	 *
	 * @param str
	 * @return
	 */
	private String convert(String str) {
		StringBuilder buf = new StringBuilder(str);
		int padding = 0;
		int sourceLength = 0;
		int blockSize;
		int i;

		sourceLength = str.length();
		blockSize = m_alg.blockSize();

		padding = blockSize - (sourceLength % blockSize);

		if (padding != blockSize) {

			for (i = 0; i < padding; i++) {
				buf.append(" ");
			}
		}
		return buf.toString();
	}
	
	/**
	 * encrypt supplied string.
	 *
	 * @param str to encrypted
	 * @return encrypted String
	 * @throws UnsupportedEncodingException 
	 * @throws IllegalBlockSizeException 
	 */
	public String encrypt(String str) throws java.security.KeyException, IllegalBlockSizeException, UnsupportedEncodingException {
		byte[] ect = null;
		String value;
		value = convert(str); // pad if necessary

		m_alg.initEncrypt(m_key);
		ect = m_alg.crypt(value.getBytes(CommonKeys.ENCRYPT_ENCODINGKEY));
		return Hex.toString(ect);
	}

	/**
	 * Method to encrypt the parameters
	 *
	 * @param params to encrypt
	 * @return String
	 */
	public String encryptAvailabilityRequest(String params){
		
		String encrypted = null;
		try{
			AESEncryption tcase = new AESEncryption(ENCRYPTION_KEY);
			String ENC_TIME=getCurrentTimeStamp(); //ie 20170715180000 - yyyymmddhhmmss
			String newParams;
			newParams="ENC_TIME="+ENC_TIME +"&"+params;
			encrypted = tcase.encrypt(newParams);
			encrypted="ENCT=1&"+"ENC="+encrypted;			 
		}catch (NoSuchProviderException e) {
			LOGGER.error("NoSuchProviderException while encrypting RequestParams"+e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);
		} catch (java.security.KeyException e) {
			LOGGER.error("CustomGenericException while encrypting RequestParams"+e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);
		} catch (NoSuchAlgorithmException e) {
			LOGGER.error("NoSuchAlgorithmException while encrypting RequestParams"+e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);
		} catch (IllegalBlockSizeException e) {
			LOGGER.error("IllegalBlockSizeException while encrypting RequestParams"+e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);
		} catch (UnsupportedEncodingException e) {
			LOGGER.error("UnsupportedEncodingException while encrypting RequestParams"+e);
			throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE, e);
		}
		
			return encrypted;
	}
	
	private String getCurrentTimeStamp() {
		return yyyyMMddHHmmss.format(new Date());
	 }

}
