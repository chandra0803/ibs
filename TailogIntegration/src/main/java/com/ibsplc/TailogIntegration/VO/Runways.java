package com.ibsplc.TailogIntegration.VO;

import java.io.Serializable;

public class Runways implements Serializable {
 
    //default serialVersion id
    private static final long serialVersionUID = 1L;
    
	private String name;
	private String length;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	@Override
	public String toString() {
		return "Runways [name=" + name + ", length=" + length + "]";
	}
	
	
}
