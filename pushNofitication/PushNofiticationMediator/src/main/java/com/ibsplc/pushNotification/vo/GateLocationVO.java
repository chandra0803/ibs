package com.ibsplc.pushNotification.vo;

/**
 * @author A-6620
 *
 */
public class GateLocationVO {

	/**
	 * description of the facility
	 */
	private String description;

	/**
	 * Unique Reference to a Facility of a given Type in a terminal
	 */
	private String identifier;

	/**
	 * Type of the Facility
	 */
	private String type;

	/**
	 * Id is used to identify the deskwhere user is setting.
	 */
	private String workstationId;

	/**
	 * @return description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return identifier
	 */
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @param identifier
	 */
	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return workstationId
	 */
	public String getWorkstationId() {
		return workstationId;
	}

	/**
	 * @param workstationId
	 */
	public void setWorkstationId(String workstationId) {
		this.workstationId = workstationId;
	}

}
