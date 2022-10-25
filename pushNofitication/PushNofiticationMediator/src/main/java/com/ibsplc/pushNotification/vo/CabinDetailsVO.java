package com.ibsplc.pushNotification.vo;

public class CabinDetailsVO extends AbstractVO {

	private static final long serialVersionUID = 1L;
	/**
	 * Booking Class
	 */
	private String bookingClass;
	/**
	 * Class Designator
	 */
	private String classDesignator;

	/**
	 * @return the bookingClass
	 */
	public String getBookingClass() {
		return bookingClass;
	}

	/**
	 * @param bookingClass
	 *            the bookingClass to set
	 */
	public void setBookingClass(String bookingClass) {
		this.bookingClass = bookingClass;
	}

	/**
	 * @return the classDesignator
	 */
	public String getClassDesignator() {
		return classDesignator;
	}

	/**
	 * @param classDesignator
	 *            the classDesignator to set
	 */
	public void setClassDesignator(String classDesignator) {
		this.classDesignator = classDesignator;
	}

}
