package com.ibsplc.amadeus.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.ibsplc.amadeus.vo.AbstractVO;

import java.util.ArrayList;

//@JsonInclude(Include.NON_NULL)
public class TaxInvoiceVO extends AbstractVO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This the company against which tax invoice is required.
	 */
	private String companyName;
	
	/**
	 * This is the vat number of the taxInvoice requested by the company
	 */
	private String vatNumber;
	
	/**
	 * This is the order number of the taxInvoice requested by the company
	 */
	private String orderNumber;
	
	/**
	 * This is the cost centre of the taxInvoice requested by the company
	 */
	private String costCentre;
	
	/**
	 * This is the postal code of the company
	 */
	private String postalCode;
	
	/**
	 * Is communication with the company desired via mail or via postal method
	 */
	private boolean isEMail;
	
	/**
	 * This is the email address of the company
	 */
	private String companyEmail;
	
	/**
	 * This is postal address of the company.  It will be an array of strings
	 */
	private ArrayList companyPostalAddress;

	/**
	 * get
	 * @return Returns the companyEmail.
	 */
	public String getCompanyEmail() {
		return companyEmail;
	}
	

	/**
	 * set
	 * @param companyEmail The companyEmail to set.
	 */
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	

	/**
	 * get
	 * @return Returns the companyName.
	 */
	public String getCompanyName() {
		return companyName;
	}
	

	/**
	 * set
	 * @param companyName The companyName to set.
	 */
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	

	/**
	 * get
	 * @return Returns the companyPostalAddress.
	 */
	public ArrayList getCompanyPostalAddress() {
		return companyPostalAddress;
	}
	

	/**
	 * set
	 * @param companyPostalAddress The companyPostalAddress to set.
	 */
	public void setCompanyPostalAddress(ArrayList companyPostalAddress) {
		this.companyPostalAddress = companyPostalAddress;
	}
	

	/**
	 * get
	 * @return Returns the costCentre.
	 */
	public String getCostCentre() {
		return costCentre;
	}
	

	/**
	 * set
	 * @param costCentre The costCentre to set.
	 */
	public void setCostCentre(String costCentre) {
		this.costCentre = costCentre;
	}
	

	/**
	 * get
	 * @return Returns the isEMail.
	 */
	public boolean isEMail() {
		return isEMail;
	}
	

	/**
	 * Set
	 * @param isEMailT The isEMail to set.
	 */
	public void setEMail(boolean isEMailT) {
		this.isEMail = isEMailT;
	}
	

	/**
	 * Get
	 * @return Returns the orderNumber.
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	

	/**
	 * Set
	 * @param orderNumber The orderNumber to set.
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	

	/**
	 * Get
	 * @return Returns the postalCode.
	 */
	public String getPostalCode() {
		return postalCode;
	}
	

	/**
	 * set
	 * @param postalCode The postalCode to set.
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	

	/**
	 * Get
	 * @return Returns the vatNumber.
	 */
	public String getVatNumber() {
		return vatNumber;
	}
	

	/**
	 * Set
	 * @param vatNumber The vatNumber to set.
	 */
	public void setVatNumber(String vatNumber) {
		this.vatNumber = vatNumber;
	}
	
	


}
