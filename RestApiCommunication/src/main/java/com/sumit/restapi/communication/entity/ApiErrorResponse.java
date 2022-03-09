package com.sumit.restapi.communication.entity;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ApiErrorResponse {

	private HttpStatus staus;
	private int errorCode;
	private String message;
	private String detail;
	private LocalDateTime time;
	
	public ApiErrorResponse(HttpStatus staus, int errorCode, String message, String detail, LocalDateTime time) {
		super();
		this.staus = staus;
		this.errorCode = errorCode;
		this.message = message;
		this.detail = detail;
		this.time = time;
	}
	public HttpStatus getStaus() {
		return staus;
	}
	public int getErrorCode() {
		return errorCode;
	}
	public String getMessage() {
		return message;
	}
	public String getDetail() {
		return detail;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setStaus(HttpStatus staus) {
		this.staus = staus;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
		
}
