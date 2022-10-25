package com.ibsplc.flightsearch.vo;

import java.io.Serializable;

import com.poiji.annotation.ExcelCellName;

public class ERetailConfigVO implements Serializable {


private static final long serialVersionUID = 1L;

@ExcelCellName("PARAMETERCODE") 
private String parameterCode;

@ExcelCellName("PARAMETERDESCRIPTION") 
private String parameterDescription;

@ExcelCellName("PARAMETERVALUE") 
private String parameterValue;

public String getParameterCode() {
	return parameterCode;
}

public void setParameterCode(String parameterCode) {
	this.parameterCode = parameterCode;
}

public String getParameterDescription() {
	return parameterDescription;
}

public void setParameterDescription(String parameterDescription) {
	this.parameterDescription = parameterDescription;
}

public String getParameterValue() {
	return parameterValue;
}

public void setParameterValue(String parameterValue) {
	this.parameterValue = parameterValue;
}
}

