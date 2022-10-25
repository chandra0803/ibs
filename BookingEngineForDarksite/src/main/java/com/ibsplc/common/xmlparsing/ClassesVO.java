/**
 * This Software is the proprietary information of IBS Software Services
 * (p) Ltd and SAA. Usage is subject to license terms.
 *
 * @ Created On Feb 23, 2007 9:01:47 AM;
 * @ Created By Joseph
 */
package com.ibsplc.common.xmlparsing;

import com.ibsplc.framework.vo.AbstractVO;

/**
 * This class is used to store the details of each class
 * @author A-
 */
public class ClassesVO extends AbstractVO
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This field represents the class code
	 */
    private String classCode;

	/**
	 * This field represents the description of the class code.
	 * Got from classDescription.xml file
	 */
	 private String classDescription;

	 /**
	  * This represents the class type of the present subclass.
	  * ie whether this belongs to economy, firstclass or business.
	  * Possible values are:
	  * 1 - Economy Class
	  * 2 - Business Class
	  * 3 - First Class
	  */
	 private String classType;
	 
	/**
	 * This field represents the fare type to which the class belongs.
	 * Got from fareClasses.xml file.
	 * Possible values are:
	 * 1 - Go Fares
	 * 2 - Saver Fares
	 * 3 - Flexi Fares
	 * 4 - Business Fares
	 */
	 private String fareType;

	/**
	 * This field represents the order of the classes in the fare hierarchy.
	 * The highest possible value is 1.
	 * The lowest possible value will depend on the number of classes in that fare type
	 * We upgrade from the lowest to the highest ie eg from 5-->4-->3-->2-->1
	 */
	 private int upgradeOrder;

	 /**
	  * This variable denotes if the given class can be changed to the same class 
	  * Its value is populated from the classDescription.xml file
	  * and the name of the attribute for the class is upgradeNotNeeded="Y"
	  */
	 private boolean isUpgradeNotNeeded;

	/**
	 * Returns the classCode.
	 * @return Returns the classCode.
	 */
	public String getClassCode() {
		return classCode;
	}
	

	/**
	 * The classCode to set.
	 * @param classCode The classCode to set.
	 */
	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}
	

	/**
	 * Returns the classDescription.
	 * @return Returns the classDescription.
	 */
	public String getClassDescription() {
		return classDescription;
	}
	

	/**
	 * The classDescription to set.
	 * @param classDescription The classDescription to set.
	 */
	public void setClassDescription(String classDescription) {
		this.classDescription = classDescription;
	}
	

	/**
	 * Returns the fareType.
	 * @return Returns the fareType.
	 */
	public String getFareType() {
		return fareType;
	}
	

	/**
	 * The fareType to set.
	 * @param fareType The fareType to set.
	 */
	public void setFareType(String fareType) {
		this.fareType = fareType;
	}
	

	/**
	 * Returns the upgradeOrder.
	 * @return Returns the upgradeOrder.
	 */
	public int getUpgradeOrder() {
		return upgradeOrder;
	}
	

	/**
	 * The upgradeOrder to set.
	 * @param upgradeOrder The upgradeOrder to set.
	 */
	public void setUpgradeOrder(int upgradeOrder) {
		this.upgradeOrder = upgradeOrder;
	}


	/**
	 * Returns the classType.
	 * @return Returns the classType.
	 */
	public String getClassType() {
		return classType;
	}
	


	/**
	 * The classType to set.
	 * @param classType The classType to set.
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}


	/**
	 * Returns the isHighestSubClass.
	 * @return Returns the isHighestSubClass.
	 */
	public boolean isUpgradeNotNeeded() {
		return isUpgradeNotNeeded;
	}


	/**
	 * The isUpgradeNotNeeded to set.
	 * @param isUpgradeNotNeededTemp The isUpgradeNotNeeded to set.
	 */
	public void setUpgradeNotNeeded(boolean isUpgradeNotNeededTemp) {
		this.isUpgradeNotNeeded = isUpgradeNotNeededTemp;
	}
	
	


}