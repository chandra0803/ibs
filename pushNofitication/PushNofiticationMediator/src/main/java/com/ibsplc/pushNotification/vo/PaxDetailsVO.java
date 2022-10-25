package com.ibsplc.pushNotification.vo;

public class PaxDetailsVO {
      private String surname;
      private String type;
      private String gender;
      private OtherPaxDetailsVO otherPaxDetails;
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the otherPaxDetails
	 */
	public OtherPaxDetailsVO getOtherPaxDetails() {
		return otherPaxDetails;
	}
	/**
	 * @param otherPaxDetails the otherPaxDetails to set
	 */
	public void setOtherPaxDetails(OtherPaxDetailsVO otherPaxDetails) {
		this.otherPaxDetails = otherPaxDetails;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaxDetails [surname=" + surname + ", type=" + type + ", gender=" + gender + ", otherPaxDetails="
				+ otherPaxDetails + "]";
	}
      
      
}
