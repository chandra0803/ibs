package com.ibsplc.framework.util.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

import org.joda.time.LocalDate;
import org.joda.time.Months;

import com.ibsplc.common.constants.CommonKeys;
import com.ibsplc.common.util.CommonsUtil;
import com.ibsplc.framework.util.filereader.FileReader;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

public class DateUtilities {
	public DateUtilities() {

	}

	/**
	 * Log4j implementation to log the necessary details
	 */
	private static final Logger LOGGER = Log4j2Logger.create(DateUtilities.class);
	/**
	 * DD_MMM_YY_HH24MI
	 */
	public static final String DD_MMM_YY_HH24MI = "dd-MMM-yy HH:mm";
	/**
	 * Date format that represents a full date, month and year. e.g. 01 January 2001
	 * 01:01
	 */
	public static final String DD_MMMM_YYYY_HH24MI = "dd MMMM yyyy, HH:mm";

	public static final String TIME_ZONES_PROPERTIES = "timezones.properties";

	private static Properties timezonesProperties;

	/**
	 * calculates the months between the two dates
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 */
	public static int getMonthsBetween(String date1, String date2) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat(CommonKeys.SCREEN_DATE_FORMAT);
		Calendar calendar1 = new GregorianCalendar();
		Calendar calendar2 = new GregorianCalendar();

		calendar1.setTime(format.parse(date1));
		calendar2.setTime(format.parse(date2));

		LocalDate localDate1 = new LocalDate(calendar1.getTimeInMillis());
		LocalDate localDate2= new LocalDate(calendar2.getTimeInMillis());
		return Months.monthsBetween(localDate1, localDate2).getMonths();
	}
	//Added on 30/10/2020 by A-8986 for mobile API -- start

	public static int getMonthsBetweenMobile(String date1, String date2) throws ParseException {
		
		SimpleDateFormat format = new SimpleDateFormat(CommonKeys.AMADEUS_DATE_FORMAT);
		Calendar calendar1 = new GregorianCalendar();
		Calendar calendar2 = new GregorianCalendar();

		calendar1.setTime(format.parse(date1));
		calendar2.setTime(format.parse(date2));

		LocalDate localDate1 = new LocalDate(calendar1.getTimeInMillis());
		LocalDate localDate2= new LocalDate(calendar2.getTimeInMillis());
		return Months.monthsBetween(localDate1, localDate2).getMonths();
	}
//Added on 30/10/2020 by A-8986 for mobile API -- end

	public static String getDateInAmadeusFormat(String date) throws ParseException {
		SimpleDateFormat screenDateFormat = new SimpleDateFormat(CommonKeys.SCREEN_DATE_FORMAT);
		SimpleDateFormat amadeusDateFormat = new SimpleDateFormat(CommonKeys.AMADEUS_DATE_FORMAT);
		Date d = screenDateFormat.parse(date);
		return amadeusDateFormat.format(d);
	}

	public static Date addDaysToDate(Date date, int numberOfDays) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, numberOfDays);
		return cal.getTime();
	}

	public static Calendar getDateAsCalendarObject(String date) throws ParseException {
		if (CommonsUtil.isStringValid(date)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(CommonKeys.SCREEN_DATE_FORMAT);
			Date d = simpleDateFormat.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(d);
			return calendar;
		}
		return null;
	}
	
	public static Calendar getDateOfFormatAsCalendarObject(String date, String format) throws ParseException {
		if (CommonsUtil.isStringValid(date)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
			Date d = simpleDateFormat.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(d);
			return calendar;
		}
		return null;
	}

	public static Calendar getDateAsCalendarObjectOfFormat(String date, String format) throws ParseException {
		if (CommonsUtil.isStringValid(date)) {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
			Date d = simpleDateFormat.parse(date);
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(d);
			return calendar;
		}
		return null;
	}

	public static String getDateInFormat(String format, Calendar calendar) {
		if (calendar == null || !CommonsUtil.isStringValid(format)) {
			return CommonKeys.EMPTY_STRING;
		}
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		return simpleDateFormat.format(calendar.getTime());
	}

	public static Date getDateInDateFormatForFlightSchedule(String date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat(CommonKeys.DATE_FORMAT_WITH_TIME);
		if (!CommonsUtil.isStringValid(date)) {
			return null;
		}
		String[] s = date.split("T");
		String newDay = s[0].concat(" ").concat(s[1]);
		Date newDate = null;
		newDate = dateFormat.parse(newDay);

		return newDate;
	}

	/**
	 * Formats a travel date from 01-Jan-01 01:01 to 01 January 2001 01:01
	 *
	 * @param dateToFormat
	 *            travel date to format.
	 * @return formatted date.
	 */
	public static String getFormattedDate(String dateToFormat) {
		try {
			return reformatDateTimeString(DD_MMM_YY_HH24MI, dateToFormat, DD_MMMM_YYYY_HH24MI);
		} catch (ParseException exception) {
			LOGGER.error("Could not format given date." + exception.getMessage());
		}
		return dateToFormat;
	}

	/**
	 * Converts the input date string into to format with time information.
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

	public static String convertLocalTimeToUTC(String place, String entrydate) {

		timezonesProperties = FileReader.getProperties(TIME_ZONES_PROPERTIES);
		String timeZone = timezonesProperties.getProperty(place);
		// String deptTime="16-AUG-2018 05:30";
		Date date;
		String d2 = null;
		try {
			DateFormat formatterIST = new SimpleDateFormat(CommonKeys.DATE_FORMAT_DD_MM_YYYY_HH_MM);
			formatterIST.setTimeZone(TimeZone.getTimeZone(timeZone));

			date = formatterIST.parse(entrydate);

			LOGGER.info(" Time as per timezone 1=>" + formatterIST.format(date));

			DateFormat formatterUTC = new SimpleDateFormat(CommonKeys.DATE_FORMAT_DD_MM_YYYY_HH_MM);
			formatterUTC.setTimeZone(TimeZone.getTimeZone(CommonKeys.UTC)); // UTC timezone
			d2 = formatterUTC.format(date);
			LOGGER.info(" UTC time 2=>" + d2);

		} catch (ParseException e) {
			LOGGER.error("ParseException" + e);
		}
		return d2;
	}

	public static boolean isDate1AfterDate2(String date1, String date2) {

		try {

			SimpleDateFormat sdf = new SimpleDateFormat(CommonKeys.DATE_FORMAT_DD_MM_YYYY_HH_MM);
			Date d1 = sdf.parse(date1);
			Date d2 = sdf.parse(date2);
			
			if(d1.after(d2)) {
				return true;
			}
			return false;
		} catch (ParseException e) {
			LOGGER.error("ParseException" + e);
		}
		return false;
	}
	/**
	 * Calculates the days between two given dates
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 */
	public static double getDaysBetween(String date1, String date2) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(CommonKeys.SCREEN_DATE_FORMAT);
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();

		Date d1 = format.parse(date1);
		cal1.setTime(d1);
		Date d2 = format.parse(date2);
		cal2.setTime(d2);
		
		long time1Millis = cal1.getTimeInMillis();
		long time2Millis = cal2.getTimeInMillis();
		
		return TimeUnit.DAYS.convert(Math.abs(time2Millis - time1Millis), TimeUnit.MILLISECONDS);
		
	}
	//Added on 30/10/2020 by A-8986 for mobile API -- start
	public static double getDaysBetweenMobile(String date1, String date2) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(CommonKeys.AMADEUS_DATE_FORMAT);
		Calendar cal1 = new GregorianCalendar();
		Calendar cal2 = new GregorianCalendar();

		Date d1 = format.parse(date1);
		cal1.setTime(d1);
		Date d2 = format.parse(date2);
		cal2.setTime(d2);
		
		long time1Millis = cal1.getTimeInMillis();
		long time2Millis = cal2.getTimeInMillis();
		
		return TimeUnit.DAYS.convert(Math.abs(time2Millis - time1Millis), TimeUnit.MILLISECONDS);
		
	}
	//Added on 30/10/2020 by A-8986 for mobile API -- end

	/**
	 * Compares two dates
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 */
	public static boolean compareDates(String date1, String date2) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(CommonKeys.SCREEN_DATE_FORMAT);
			Date d1 = sdf.parse(date1);
			Date d2 = sdf.parse(date2);

			if (d1.after(d2) || d1.equals(d2)) {
				return true;
			}
			return false;
		} catch (ParseException e) {
			LOGGER.error("ParseException" + e);
		}
		return false;
	}
	
	//Added on 30/10/2020 by A-8986 for mobile api -- start
	public static boolean compareDatesMobile(String date1, String date2) {

		try {
			SimpleDateFormat sdf = new SimpleDateFormat(CommonKeys.AMADEUS_DATE_FORMAT);
			Date d1 = sdf.parse(date1);
			Date d2 = sdf.parse(date2);

			if (d1.after(d2) || d1.equals(d2)) {
				return true;
			}
			return false;
		} catch (ParseException e) {
			LOGGER.error("ParseException" + e);
		}
		return false;
	}
	//Added on 30/10/2020 by A-8986 for mobile api -- end
	
	public static String parseAmadeusFormat(String date) throws ParseException {
		SimpleDateFormat screenDateFormat = new SimpleDateFormat(CommonKeys.SCREEN_DATE_FORMAT);
		SimpleDateFormat amadeusDateFormat = new SimpleDateFormat(CommonKeys.AMADEUS_DATE_FORMAT);
		Date d = amadeusDateFormat.parse(date);
		return screenDateFormat.format(d);
	}
	
	/*public List<DateVO> getDatePeriod() {
		List<DateVO> datePeriod = new ArrayList<DateVO>();
		
		try {
		
			DateVO todaysdate = new DateVO();
			Date d = new Date();
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(d);

			todaysdate.setYear(String.valueOf(calendar.get(Calendar.YEAR)));
			todaysdate.setMonth(String.valueOf(calendar.get(Calendar.MONTH) + 1));
			todaysdate.setDay(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
			datePeriod.add(todaysdate);

			DateVO previousday = new DateVO();
			calendar.add(Calendar.DATE, -14);

			previousday.setYear(String.valueOf(calendar.get(Calendar.YEAR)));
			previousday.setMonth(String.valueOf(calendar.get(Calendar.MONTH) + 1));
			previousday.setDay(String.valueOf(calendar.get(Calendar.DAY_OF_MONTH)));
			datePeriod.add(previousday);
		    
		}
		catch (Exception e) {
			LOGGER.error("Unable to set date duration."+e);
		}
		    
		    
		return datePeriod;
	}*/
}
