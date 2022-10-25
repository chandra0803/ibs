package com.ibsplc.amadeus.vo;

import java.math.BigInteger;

public class ReferenceVO extends AbstractVO {
	
public String qualifier;
public String number;


/**
 * @return the qualifier
 */
public String getQualifier() {
	return qualifier;
}
/**
 * @param qualifier the qualifier to set
 */
public void setQualifier(String qualifier) {
	this.qualifier = qualifier;
}
/**
 * @return the number
 */
public String getNumber() {
	return number;
}
/**
 * @param number the number to set
 */
public void setNumber(String number) {
	this.number = number;
}



}
