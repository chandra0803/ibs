package com.ibsplc.amadeus.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import com.ibsplc.amadeus.vo.ParameterVO;

public final class DateUtilities {

	/**
	 * timeZone
	 */
	private static TimeZone timeZone = TimeZone.getDefault();

	/**
	 * The date in dd-MMM-yyyy HH:mm
	 */
	public static final String DD_MMM_YYYY_HH24MI = "dd-MMM-yyyy HH:mm";

	/**
	 * The date in dd-MMM-yyyy HH:mm:ss
	 */
	public static final String DD_MMM_YYYY_HH24MISS = "dd-MMM-yyyy HH:mm:ss";

	/**
	 * The date in dd-MM-yyyy
	 */
	public static final String DD_MM_YYYY = "dd-MM-yyyy";
	/**
	 * DDMMM
	 */
	public static final String DDMMM = "ddMMM";

	/**
	 * YYYYMMDDHH24MISS
	 */
	public static final String YYYYMMDDHH24MISS = "yyyyMMddHHmmss";

	/**
	 * The date in yyyy-MM-dd
	 */
	public static final String YYYY_MM_DD = "yyyy-MM-dd";

	/**
	 * for zero padding
	 */
	public static final String ZERO_PAD = "0";

	/**
	 * for zero padding
	 */
	public static final String UTC = "UTC";

	/**
	 * DATE_TIME_WITHOUT_DELIMITER format
	 */
	public static final String DATE_TIME_WITHOUT_DELIMITER = "ddMMyyyyHHmmss";
	/**
	 * Constant in hour format
	 */
	public static final String HH24MI = "HH:mm";
	/**
	 * The date in dd-MMM-yyyy
	 */
	public static final String DD_MMM_YYYY = "dd-MMM-yyyy";

	/**
	 * EEE_dd_MMM : Header date format used for calendar display
	 */
	public static final String EEE_dd_MMM = "EEE dd MMM";

	/**
	 * tempDate
	 */
	private static Date tempDate;
	/**
	 * For year
	 */
	public static final String YYYY = "yyyy";

	/**
	 * This instance is responsible for setting the position in the text from
	 * which parsing should start.
	 */
	private static ParsePosition parsePosition = new ParsePosition(0);
	/**
	 * All validations are done with respect to this value. The default date
	 * format is "dd-MM-YYYY".
	 */
	private static String dateFormat = "dd-MM-yyyy";
	/**
	 * DD_MMM_YY
	 */
	public static final String DD_MMM_YY = "dd-MMM-yy";
	/**
	 * DD_MMM_YY_HH24MI
	 */
	public static final String DD_MMM_YY_HH24MI = "dd-MMM-yy HH:mm";

	/**
	 * Date format that represents a full date, month and year. e.g. 01 January
	 * 2001 01:01
	 */
	public static final String DD_MMMM_YYYY_HH24MI = "dd MMMM yyyy, HH:mm";

	/**
	 * MM_YY
	 */
	public static final String MM_YY = "MM-yy";

	/**
	 * WEEK_DAYS - String[]
	 */
	private static final String[] WEEK_DAYS = { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY",
			"SATURDAY" };

	/**
	 * getting a date from a date in default format
	 *
	 * @param date
	 * @return Date
	 * @throws ParseException
	 */
	public static Date getDate(String date, String format) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.parse(date);

	}

	/**
	 * Converting a date to String in default format
	 *
	 * @param date
	 * @return String
	 * @throws ParseException
	 */
	public static String convertToDateString(Date date, String format) throws ParseException {

		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.format(date);
	}

	/**
	 * getting current time
	 *
	 * @return Date
	 */
	public static Date getCurrentDate() {
		return new Date();
	}

	/**
	 * This method gives the current date in the sudate format.
	 * 
	 * @return current date in the date format
	 */
	public static String getCurrentDate(String dateFormats) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		if (tempDate == null) {
			tempDate = new Date();
		} else {
			tempDate.setTime(System.currentTimeMillis());
		}

		initialiseDateFormat(dateFormats);
		return simpleDateFormat.format(tempDate);
	}

	/**
	 * This method is responsible for making sure the simple date format
	 * instance's properties has been set to up to date values. It is
	 * necessiated because there is no constructor. All methods invoke this
	 * method before using the simple date format.
	 * 
	 * @param givenFormat
	 *            the format to applied as the pattern
	 */
	private static void initialiseDateFormat(String givenFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		parsePosition.setIndex(0);
		parsePosition.setErrorIndex(0);
		if (timeZone != null) {
			simpleDateFormat.setTimeZone(timeZone);
		}
		simpleDateFormat.applyPattern(givenFormat);
		simpleDateFormat.setLenient(false);
	}

	/**
	 * getting current year
	 *
	 * @return int
	 */
	public static int getCurrentYear() {
		Calendar calendar = new GregorianCalendar();
		return calendar.get(java.util.Calendar.YEAR);
	}

	/**
	 * getting current time calendar
	 *
	 * @return Date
	 * @throws ParseException
	 */
	public static Calendar getCurrentCalendar(String timezoneName) throws ParseException {

		return new GregorianCalendar(TimeZone.getTimeZone(timezoneName));
	}

	/**
	 * getting string correspond to (current date - given hour/date) etc with
	 * date in given format
	 *
	 * @param field
	 *            Calendar.HOUR,Calendar.DAY etc
	 * @param amount
	 *            how many hour/date etc before current date
	 * @return String
	 * @throws ParseException
	 */
	public static Calendar getDateBeforeCalendar(int field, int amount, String timeZne) throws ParseException {

		Calendar cal = new GregorianCalendar();
		if (timeZne != null) {
			cal.setTimeZone(TimeZone.getTimeZone(timeZne));
		}
		amount = -amount;
		cal.add(field, amount);
		return cal;
	}

	/**
	 * converting minute to millisecond
	 *
	 * @param min
	 * @return long
	 */
	public static long convertMinutesToMilliSec(long min) {
		return min * 60 * 1000;
	}

	/**
	 * converting millisecond to minute
	 *
	 * @param millisec
	 * @return long
	 */
	public static long convertMilliSecToMinutes(long millisec) {
		return millisec / (60 * 1000);
	}

	/**
	 * Converts the input date string into toformat with time information.
	 *
	 * @param fromFormat
	 *            The format of the input date
	 * @param dateTime
	 *            The input date string
	 * @param toFormat
	 *            The format of the output date
	 * @return The input date string converted to current date format with time
	 *         information.
	 * @throws ParseException
	 */
	public static String reformatDateTimeString(String fromFormat, String dateTime, String toFormat)
			throws ParseException {

		if (((fromFormat != null) && (fromFormat.trim().length() > 0))
				&& ((toFormat != null) && (toFormat.trim().length() > 0))
				&& ((dateTime != null) && (dateTime.trim().length() > 0))) {
			SimpleDateFormat simpleDateFmat = new SimpleDateFormat();
			simpleDateFmat.applyPattern(fromFormat);
			Date date = simpleDateFmat.parse(dateTime);
			simpleDateFmat.applyPattern(toFormat);
			return simpleDateFmat.format(date).toUpperCase();
		} else {
			return null;
		}
	}

	/**
	 * setting given time in current date. input time in HH:mm format
	 *
	 * @return Date
	 * @throws ParseException
	 */
	public static Date setTimeOnCurrentDay(String hourMinuteTime) throws ParseException {
		Calendar cal = new GregorianCalendar();
		String hourPart = hourMinuteTime.substring(0, hourMinuteTime.indexOf(':'));
		String minutePart = hourMinuteTime.substring((hourMinuteTime.indexOf(':')) + 1);

		cal.set(Calendar.HOUR_OF_DAY, Integer.parseInt(hourPart));
		cal.set(Calendar.MINUTE, Integer.parseInt(minutePart));
		cal.set(Calendar.SECOND, 0);
		return cal.getTime();

	}

	/**
	 * This method compare the given Date with current date.Time factor is not
	 * considered
	 *
	 * @param time
	 * @return int 0 if same day as current day -1 if a future date and +1 if
	 *         previous date
	 * @throws ParseException
	 */
	public static int compareWithCurrentDateOnly(Date time) throws ParseException {
		Calendar cal = new GregorianCalendar();
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		Calendar calnew = new GregorianCalendar();
		calnew.setTime(time);
		calnew.set(Calendar.HOUR_OF_DAY, 0);
		calnew.set(Calendar.MINUTE, 0);
		calnew.set(Calendar.SECOND, 0);
		return cal.getTime().compareTo(calnew.getTime());

	}

	/**
	 * This method compare the given Date with current date.Time factor is not
	 * considered
	 *
	 * @param time
	 * @return the value 0 if date1 is equal to date2; a value less than 0 if
	 *         date1 is before the date2; and a value greater than 0 if date1 is
	 *         after date2.
	 * 
	 * @throws ParseException
	 */
	public static int compareDates(Date date1, Date date2) throws ParseException {
		Calendar cal = new GregorianCalendar();
		cal.setTime(date1);
		cal.set(Calendar.AM_PM, 0);
		cal.set(Calendar.HOUR, 0);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		Calendar calnew = new GregorianCalendar();
		calnew.setTime(date2);
		calnew.set(Calendar.AM_PM, 0);
		calnew.set(Calendar.HOUR, 0);
		calnew.set(Calendar.HOUR_OF_DAY, 0);
		calnew.set(Calendar.MINUTE, 0);
		calnew.set(Calendar.SECOND, 0);
		calnew.set(Calendar.MILLISECOND, 0);

		return cal.getTime().compareTo(calnew.getTime());

	}

	/**
	 * This method convert given local time to utc and convert into suitable
	 * string format
	 *
	 * @param localTime
	 * @param format
	 * @return int 0 if same day as current day -1 if a past date and +1 if
	 *         previous date
	 * @throws ParseException
	 */
	public static String getUTCTimeString(Calendar localTime, String format) throws ParseException {

		String result = null;

		Calendar utcCal = new GregorianCalendar(TimeZone.getTimeZone(UTC));
		utcCal.setTimeInMillis(localTime.getTimeInMillis());
		DateFormat frt = new SimpleDateFormat(DATE_TIME_WITHOUT_DELIMITER);
		StringBuffer strBuf = new StringBuffer();
		if (utcCal.get(Calendar.DATE) < 10) {
			strBuf.append(ZERO_PAD);
		}
		strBuf.append(utcCal.get(Calendar.DATE));
		if (utcCal.get(Calendar.MONTH) < 9) {
			strBuf.append(ZERO_PAD);
		}
		strBuf.append(String.valueOf((utcCal.get(Calendar.MONTH) + 1)));
		strBuf.append(utcCal.get(Calendar.YEAR));
		if (utcCal.get(Calendar.HOUR_OF_DAY) < 10) {
			strBuf.append(ZERO_PAD);
		}
		strBuf.append(utcCal.get(Calendar.HOUR_OF_DAY));
		if (utcCal.get(Calendar.MINUTE) < 10) {
			strBuf.append(ZERO_PAD);
		}
		strBuf.append(utcCal.get(Calendar.MINUTE));
		if (utcCal.get(Calendar.SECOND) < 10) {
			strBuf.append(ZERO_PAD);
		}
		strBuf.append(utcCal.get(Calendar.SECOND));

		Date a = frt.parse(strBuf.toString());

		result = DateUtilities.convertToDateString(a, format);

		return result;

	}

	/**
	 * addDate- Adds the no of days passed to the date object and returns the
	 * result
	 * 
	 * @param dateObj
	 * @param daysToAdd
	 * @return
	 */
	public static Date addDate(Date dateObj, int daysToAdd) {
		if (daysToAdd != 0) {
			Calendar c = new GregorianCalendar();
			c.setTime(dateObj);
			c.add(Calendar.DATE, daysToAdd);
			dateObj = c.getTime();
		}
		return dateObj;
	}

	/**
	 * Retuns the String representation of the date in the format requested
	 * 
	 * @param Date
	 * @param format
	 */
	public static String getDateAsString(Date date, String format) {
		if ((date == null) || (format == null)) {
			throw new IllegalArgumentException(" Argument to DateUtility is null");
		}
		SimpleDateFormat dateFormat1 = new SimpleDateFormat();
		dateFormat1.setLenient(false);
		dateFormat1.applyPattern(format);
		return dateFormat1.format(date);
	}

	/**
	 * getDateFromString
	 * 
	 * @param dateString
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date getDateFromString(String dateString, String format) throws ParseException {

		if (dateString == null || format == null) {
			return null;
		}
		DateFormat formatter = new SimpleDateFormat(format);
		Calendar result = Calendar.getInstance();
		result.setTime(formatter.parse(dateString));
		return result.getTime();
	}

	/**
	 * Adds the given value to the given date. The type of value added,
	 * determines if the given value is to be added a day or a year or a month.
	 * the value of this param is null, it is taken as D
	 */
	public static Date addDays(Date date, String typeOfValue, int valueIncremented) {
		if (date == null) {
			throw new IllegalArgumentException(" Argument to DateUtility is null");
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		if ("Y".equals(typeOfValue)) {
			cal.add(Calendar.YEAR, valueIncremented);
		} else if ("M".equals(typeOfValue)) {
			cal.add(Calendar.MONTH, valueIncremented);
		} else {
			cal.add(Calendar.DATE, valueIncremented);
		}
		return cal.getTime();
	}

	/**
	 * This method gives the date obtained by adding the given increment to the
	 * given field in the given date value.
	 *
	 * @return current date in the date format
	 */
	public static String getNextDate(String dateValue, int field, int increment, String dateFormats) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		Calendar calendar = parseToCalendar(dateValue, dateFormats);
		calendar.add(field, increment);

		initialiseDateFormat(dateFormats);
		return simpleDateFormat.format(calendar.getTime());
	}

	/**
	 * This method gives a <code>Calendar</code> instance by parsing the given
	 * <code>date</code> as per the <code>dateFormat</code>. The
	 * <code>HOUR_OF_DAY</code>, <code>MINUTE</code>, <code>SECOND</code> and
	 * <code>MILLISECOND</code> values are set to zero. Ideally, this should not
	 * have been set. This has been done as a work around to help the server
	 * code retrieve data for transaction reports. Please contact Pradeep (EJB)
	 * of TCC before taking this off.
	 *
	 * And why should it not be set? Because the date format may contain hour,
	 * second, millisecond, etc. In such case, those values will be lost.
	 *
	 * @param date
	 *            the value to be formatted into a calendar instance
	 * @return the date corresponding of the supplied value
	 */
	public static Calendar parseToCalendar(String date) {
		return parseToCalendar(date, dateFormat);
	}

	/**
	 * This method gives a <code>Calendar</code> instance by parsing the given
	 * <code>date</code> as per the <code>dateFormat</code>. The
	 * <code>HOUR_OF_DAY</code>, <code>MINUTE</code>, <code>SECOND</code> and
	 * <code>MILLISECOND</code> values are set to zero. Ideally, this should not
	 * have been set. This has been done as a work around to help the server
	 * code retrieve data for transaction reports. Please contact Pradeep (EJB)
	 * of TCC before taking this off.
	 *
	 * And why should it not be set? Because the date format may contain hour,
	 * second, millisecond, etc. In such case, those values will be lost.
	 *
	 * @param date
	 *            the value to be formatted into a calendar instance
	 * @return the date corresponding of the supplied value
	 */
	public static Calendar parseToCalendar(String date, String dateFormats) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(parseDate(date, dateFormats));
		return calendar;
	}

	/**
	 * This method gives a <code>Date</code> instance by parsing the given
	 * <code>date</code> as per the supplied <code>givenFormat</code>. You can
	 * be sure of only the values in the fields specified by <code>
	 * givenFormat</code>. The other fields of the date will have the values set
	 * by the time when it was created.
	 *
	 * @param date
	 *            the value to be formatted into a date instance
	 * @param givenFormat
	 *            the format to be used for formatting the date
	 * @return the date corresponding of the supplied value
	 * @exception IllegalArgumentException
	 *                if the <code>date</code> does not conform to
	 *                <code>givenFormat</code>.
	 */

	public static Date parseDate(String date, String givenFormat) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
		initialiseDateFormat(givenFormat);
		Date parsedDate = null;

		parsedDate = simpleDateFormat.parse(date, parsePosition);
		if (parsedDate != null) {
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(parsedDate);

			// All of the text should have been parsed if the date is to be
			// valid. We check the index at which parsing stopped. If the date
			// is valid, the index will be the length of the parsed string.
			// Otherwise parsedDate would have been created with the values
			// for the fields after the index as 0.
			if ((calendar.get(Calendar.YEAR) < 1000) || (parsePosition.getIndex() < date.length())) {
				parsedDate = null;
			}
		}

		return parsedDate;
	}

	/**
	 * Return the difference between two dates in minutes
	 */
	public static double minutesBetween(Date firstDate, Date secondDate) {
		if ((firstDate == null) || (secondDate == null)) {
			throw new IllegalArgumentException(" Argument to DateUtility is null");
		}
		long minutes;

		if (firstDate.after(secondDate)) {
			minutes = firstDate.getTime() - secondDate.getTime();
		} else {

			minutes = secondDate.getTime() - firstDate.getTime();
		}
		return (double) minutes / (1000 * 60);
	}

	/**
	 * this functioin ll return a paramVO of next "X" years where the X is
	 * passed as String.. eg : getConsecutiveYears("5") returns 5 year's value
	 * starting from the current year of the format 07,08,09,10,11...
	 * 
	 * @param noOfYears
	 * @return ArrayList which comprises of PrameterVO
	 * 
	 */
	public static ArrayList getConsecutiveYears(String noOfYears) {

		ArrayList Years = new ArrayList();
		ParameterVO params = null;
		Calendar result = Calendar.getInstance();
		String dateString = getDateAsString(result.getTime(), DD_MMM_YY);
		String dateStringArr[] = dateString.split("-");
		int currYear = Integer.parseInt(dateStringArr[2]);

		for (int i = 0; i < Integer.parseInt(noOfYears); i++) {
			params = new ParameterVO();

			if (String.valueOf(currYear).length() == 1) {
				params.setMasterCode("0" + (String.valueOf(currYear)));
				params.setMasterDescription("0" + (String.valueOf(currYear)));
			} else {
				params.setMasterCode(String.valueOf(currYear));
				params.setMasterDescription(String.valueOf(currYear));
			}
			Years.add(params);
			currYear++;
		}
		return Years;
	}

	/**
	 * getNextYears
	 * 
	 * @return
	 */
	public static ArrayList<ParameterVO> getNextYears() {
		ArrayList<ParameterVO> Years = new ArrayList<ParameterVO>();
		ParameterVO parameterVO;
		Date d = new Date();
		String dateString = getDateAsString(d, YYYY);
		int currYear = Integer.parseInt(dateString);

		for (int i = 0; i < 3; i++) {
			parameterVO = new ParameterVO();
			parameterVO.setMasterCode(String.valueOf(currYear));
			parameterVO.setMasterDescription(String.valueOf(currYear));
			Years.add(parameterVO);
			currYear++;
		}
		return Years;
	}

	/**
	 * getNextYears
	 * 
	 * @return
	 */
	public static ArrayList<ParameterVO> getNextYears(String date, String format) {
		ArrayList<ParameterVO> Years = new ArrayList<ParameterVO>();
		ParameterVO parameterVO;
		Date d;
		try {
			d = getDateFromString(date, format);
			String dateString = getDateAsString(d, YYYY);
			int currYear = Integer.parseInt(dateString);

			for (int i = 0; i < 3; i++) {
				parameterVO = new ParameterVO();
				parameterVO.setMasterCode(String.valueOf(currYear));
				parameterVO.setMasterDescription(String.valueOf(currYear));
				Years.add(parameterVO);
				currYear++;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return Years;
	}

	/**
	 * getWeekDay :
	 * 
	 * @param date
	 * @return
	 */
	public static String getWeekDay(Date date) {
		if (date != null) {
			return WEEK_DAYS[date.getDay()];
		}
		return "";
	}

	/**
	 * getDaysBetween :
	 * 
	 * @param date
	 * @return
	 */
	public static final int getDaysBetween(Date date1, Date date2) {
		Date dte1 = new Date(date1.getYear(), date1.getMonth(), date1.getDate());
		Date dte2 = new Date(date2.getYear(), date1.getMonth(), date2.getDate());
		/*
		 * Get the represented date in milliseconds
		 */
		long milis1 = dte1.getTime();
		long milis2 = dte2.getTime();
		/*
		 * Calculate difference in days
		 */
		return (int) ((milis2 - milis1) / (24 * 60 * 60 * 1000));
	}

	/**
	 * getMonthsBetween :
	 * 
	 * @param date
	 * @return
	 */
	public static double getMonthsBetween(String date1, String date2) {
		double monthsBetween = 0;
		try {
			Calendar cal1 = new GregorianCalendar();
			Date time1 = new Date(date1);
			cal1.setTime(time1);

			Calendar cal2 = new GregorianCalendar();
			Date time2 = new Date(date2);
			cal2.setTime(time2);

			long time1Millis = cal1.getTimeInMillis();
			long time2Millis = cal2.getTimeInMillis();

			double d1 = ((double) time1Millis) / (1000 * 60 * 60 * 24);
			double d2 = ((double) time2Millis) / (1000 * 60 * 60 * 24);

			monthsBetween = Math.round(Math.abs((d1 - d2) / 30));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error Occurred");
		}
		return monthsBetween;
	}

	/**
	 * Return the difference between two dates in hours
	 */
	public static double hoursBetween(Date firstDate, Date secondDate) {
		if ((firstDate == null) || (secondDate == null)) {
			throw new IllegalArgumentException(" Argument to DateUtility is null");
		}
		long minutes;

		if (firstDate.after(secondDate)) {
			minutes = firstDate.getTime() - secondDate.getTime();
		} else {

			minutes = secondDate.getTime() - firstDate.getTime();
		}
		return (double) minutes / (1000 * 60 * 60);
	}
	
	public static String reformatDateofBirth(String fromFormat, String dateTime, String toFormat)
			throws ParseException {

		if (((fromFormat != null) && (fromFormat.trim().length() > 0))
				&& ((toFormat != null) && (toFormat.trim().length() > 0))
				&& ((dateTime != null) && (dateTime.trim().length() > 0))) {
			SimpleDateFormat simpleDateFmat = new SimpleDateFormat();
			simpleDateFmat.applyPattern(fromFormat);
			Date date = simpleDateFmat.parse(dateTime);
			simpleDateFmat.applyPattern(toFormat);
			return simpleDateFmat.format(date);
		} else {
			return null;
		}
	}
}