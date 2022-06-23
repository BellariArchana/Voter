package com.voter.statusinfo;

import org.springframework.http.HttpStatus;

public class SuccessInfo {
	
	private int httpCode;
	private HttpStatus status;
	private String message;
	private int Id;
	public SuccessInfo(int httpCode, HttpStatus status, String message, int adminId) {
		super();
		this.httpCode = httpCode;
		this.status = status;
		this.message = message;
		this.Id = adminId;
	}
	public int getHttpCode() {
		return httpCode;
	}
	public void setHttpCode(int httpCode) {
		this.httpCode = httpCode;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}

}
