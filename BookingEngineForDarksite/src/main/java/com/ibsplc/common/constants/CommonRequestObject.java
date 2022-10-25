package com.ibsplc.common.constants;
import java.io.Serializable;

public class CommonRequestObject implements Serializable{

	private static final long serialVersionUID = 1L;
	private String url;
	private String uri;
	private String contextPath;
	private String hostIpAddress;

	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUri() {
		return uri;
	}
	public void setUri(String uri) {
		this.uri = uri;
	}
	public String getContextPath() {
		return contextPath;
	}
	public void setContextPath(String contextPath) {
		this.contextPath = contextPath;
	}
	public String getHostIpAddress() {
		return hostIpAddress;
	}
	public void setHostIpAddress(String hostIpAddress) {
		this.hostIpAddress = hostIpAddress;
	}
	
}