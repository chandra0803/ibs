package com.ibsplc.common.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
import com.ibsplc.framework.vo.CommonResponseVO;

/**
 * @author a-5316
 *
 */
public final class CommonsUtil {
	/**
	 * to get logs
	 */
	private static final Logger LOGGER = Log4j2Logger.create(CommonsUtil.class);

	private CommonsUtil() {

	}

	/**
	 * to check if String is valid by checking if it is not null and not empty
	 * 
	 * @param Object
	 *            parameter
	 * @return boolean - if String valid or not
	 */
	public static boolean isStringValid(String parameter) {
		if (parameter != null && !parameter.trim().isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isStringsEqual(String string1, String string2) {
		if (!isStringValid(string1) && !isStringValid(string2)) {
			return true;
		}
		if (isStringValid(string1) && isStringValid(string2) && string1.equals(string2)) {
			return true;
		}
		return false;
	}
	
	public static BigDecimal round(BigDecimal value, int places) {
		if (places < 0) {
			throw new IllegalArgumentException();
		}
	    return value.setScale(places, RoundingMode.HALF_UP);
	}

	public static CommonResponseVO getResponseVO(String displayMessage, String sessionId, boolean isSuccess) {
		CommonResponseVO responseVO = new CommonResponseVO();
		if (isSuccess) {
			responseVO.setResultCode(CommonKeys.SUCCESS_RESULT_CODE);
			responseVO.setResultMessage(CommonKeys.SUCCESS_MESSAGE);
		} else {
			responseVO.setResultCode(CommonKeys.ERROR_RESULT_CODE);
			responseVO.setResultMessage(CommonKeys.ERROR_MESSAGE);
		}
		responseVO.setDisplayMessage(displayMessage);
		responseVO.setSessionId(sessionId);
		return responseVO;
	}


	/**
	 * Convert an exception to a String with full stack trace
	 * 
	 * @param ex
	 *            the exception
	 * @return a String with the full stacktrace error text
	 */
	public static String getStringFromStackTrace(Throwable ex) {
		if (ex == null) {
			return "";
		}
		StringWriter str = new StringWriter();
		PrintWriter writer = new PrintWriter(str);
		String stackTrace = null;
		try {
			ex.printStackTrace(writer);
			stackTrace = str.getBuffer().toString();
		} finally {
			try {
				str.close();
				writer.close();
			} catch (IOException e) {
				LOGGER.error("Exception while getting String from StackTrace : " + e);
			}
		}
		return stackTrace;
	}

	/**
	 * Encrypts using the key used for encryption.
	 * 
	 * @param key
	 * @param initVector
	 * @param encrypted
	 * @return String
	 * @throws BadPaddingException
	 * @throws IllegalBlockSizeException
	 * @throws InvalidAlgorithmParameterException
	 * @throws InvalidKeyException
	 * @throws NoSuchPaddingException
	 * @throws NoSuchAlgorithmException
	 * @throws UnsupportedEncodingException
	 * 
	 */
	public static String encrypt(String key, String initVector, String value) {
		String error = "";
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes(CommonKeys.ENCRYPT_ENCODINGKEY));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(CommonKeys.ENCRYPT_ENCODINGKEY),
					CommonKeys.ENCRYPT_TYPE);
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
			byte[] encrypted = cipher.doFinal(value.getBytes("UTF-8"));
			return Base64.encodeBase64String(encrypted);
		} catch (InvalidKeyException e) {
			LOGGER.error("Exception in encrypt for InvalidKeyException: ", e);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (InvalidAlgorithmParameterException e) {
			LOGGER.error("Exception in encrypt for InvalidAlgorithmParameterException: " + e);
			error = CommonKeys.ERROR_MESSAGE;
			// throw new CustomGenericException(CommonKeys.ERROR_RESULT_CODE,
			// error);
		} catch (BadPaddingException e) {
			LOGGER.error("Exception in encrypt for BadPaddingException:  ", e);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (IllegalBlockSizeException e) {
			error = CommonKeys.ERROR_MESSAGE;
			LOGGER.error("Exception in encrypt for IllegalBlockSizeException: ", e);
		} catch (NoSuchAlgorithmException ex) {
			error = CommonKeys.ERROR_MESSAGE;
			LOGGER.error("Exception in encrypt for NoSuchAlgorithmException: ", ex);
		} catch (NoSuchPaddingException e) {
			error = CommonKeys.ERROR_MESSAGE;
			LOGGER.error("Exception in encrypt for NoSuchPaddingException: ", e);
		} catch (UnsupportedEncodingException e) {
			error = CommonKeys.ERROR_MESSAGE;
			LOGGER.error("Exception in encrypt for UnsupportedEncodingException: ", e);
		}

		return error;
	}

	/**
	 * Decrypts encrypted byte array using the key used for encryption.
	 * 
	 * @param key
	 * @param initVector
	 * @param encryptedKey
	 * @return String
	 * 
	 */
	public static String decrypt(String key, String initVector, String encrypted) {
		String error = "";
		try {
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes(CommonKeys.ENCRYPT_ENCODINGKEY));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(CommonKeys.ENCRYPT_ENCODINGKEY),
					CommonKeys.ENCRYPT_TYPE);
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] original = cipher.doFinal(Base64.decodeBase64(encrypted));
			return new String(original, "UTF-8");
		} catch (NoSuchAlgorithmException ex) {
			LOGGER.error("Exception in encrypt for NoSuchAlgorithmException: " + ex);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (NoSuchPaddingException e) {
			LOGGER.error("Exception in encrypt for NoSuchPaddingException: " + e);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (UnsupportedEncodingException e) {
			LOGGER.error("Exception in encrypt for UnsupportedEncodingException: " + e);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (InvalidKeyException e) {
			LOGGER.error("Exception in encrypt for InvalidKeyException: " + e);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (InvalidAlgorithmParameterException e) {
			LOGGER.error("Exception in encrypt for InvalidAlgorithmParameterException: " + e);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (BadPaddingException e) {
			LOGGER.error("Exception in encrypt for BadPaddingException:  " + e);
			error = CommonKeys.ERROR_MESSAGE;
		} catch (IllegalBlockSizeException e) {
			LOGGER.error("Exception in encrypt for IllegalBlockSizeException: " + e);
			error = CommonKeys.ERROR_MESSAGE;
		}
		return error;

	}
	
	/*public static TaxInvoiceCommonResponseVO getCommonpdfResponseVO( String displayMessage,  String sessionId,  boolean isSuccess,  List<pdfDetailsVO> pdfList,  String pdfStatus) {
         TaxInvoiceCommonResponseVO responseVO = new TaxInvoiceCommonResponseVO();
        if (isSuccess) {
            responseVO.setResultCode("200");
            responseVO.setResultMessage("SUCCESS");
        }
        else {
            responseVO.setResultCode("201");
            responseVO.setResultMessage("ERROR");
        }
        responseVO.setDisplayMessage(displayMessage);
        responseVO.setSessionId(sessionId);
        responseVO.setPdfStatus(pdfStatus);
         List<pdfDetailsVO> pdfListVOs = new ArrayList<pdfDetailsVO>();
        pdfDetailsVO pdfListVO = null;
        if (pdfList != null) {
            for ( pdfDetailsVO list : pdfList) {
                pdfListVO = new pdfDetailsVO();
                pdfListVO.setPnrNumber(list.getPnrNumber());
                pdfListVO.setTaxInvoiceNumber(list.getTaxInvoiceNumber().toUpperCase());
                pdfListVO.setUpdationCount(list.getUpdationCount());
                pdfListVO.setPdfContent(null);
                pdfListVOs.add(pdfListVO);
                pdfListVO = null;
            }
        }
        responseVO.setPdfDetailsVO((List)pdfListVOs);
        return responseVO;
    }
    
    public static TaxInvoiceCommonResponseVO getCommonResponseVO( String displayMessage,  String sessionId,  boolean isSuccess,  String invoiceNumber) {
         TaxInvoiceCommonResponseVO responseVO = new TaxInvoiceCommonResponseVO();
        if (isSuccess) {
            responseVO.setResultCode("200");
            responseVO.setResultMessage("SUCCESS");
        }
        else {
            responseVO.setResultCode("201");
            responseVO.setResultMessage("ERROR");
        }
        responseVO.setDisplayMessage(displayMessage);
        responseVO.setSessionId(sessionId);
        return responseVO;
    }*/

/**
 * 	
 * @param collection
 * @return
 */
	public static boolean chkNullAndSizeCollection(List list) {
		//return collection != null && !CollectionUtils.sizeIsEmpty(collection);
		return (list != null && !list.isEmpty());
		//return true;
	}
/**
 * 
 * @param obj
 * @return
 */
	public static boolean chkNullObject(Object obj) {
		return obj != null && Objects.nonNull(obj);		 
	}

	/**
	 * 
	 * @param departureDate
	 * @return
	 */
	public static long dayDifference(String departureDate) {
		SimpleDateFormat timeStampFormat = new SimpleDateFormat("yyyy-MM-dd");
		String dDate = timeStampFormat.format(departureDate);

		// "departureDate":"19-10-2022"
		String currentTimeStamp = timeStampFormat.format(new Timestamp(System.currentTimeMillis()));
		Date d1 = null;
		Date d2 = null;
		try {
			d1 = timeStampFormat.parse(departureDate);
			d2 = timeStampFormat.parse(currentTimeStamp);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		// Get msec from each, and subtract.
		return d2.getTime() - d1.getTime();
	}
}
