package com.ibsplc.pushNotification.vo;

public class CustomerLevelVO {
      
	private static final long serialVersionUID = 1L;
	
	 private CustomerDataVO customerData;
     private ProductLevelVO productLevel;
	/**
	 * @return the customerData
	 */
	public CustomerDataVO getCustomerData() {
		return customerData;
	}
	/**
	 * @param customerData the customerData to set
	 */
	public void setCustomerData(CustomerDataVO customerData) {
		this.customerData = customerData;
	}
	/**
	 * @return the productLevel
	 */
	public ProductLevelVO getProductLevel() {
		return productLevel;
	}
	/**
	 * @param productLevel the productLevel to set
	 */
	public void setProductLevel(ProductLevelVO productLevel) {
		this.productLevel = productLevel;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerLevel [customerData=" + customerData + ", productLevel=" + productLevel + "]";
	}
      
      
}
