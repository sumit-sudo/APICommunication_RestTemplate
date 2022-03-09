package com.sumit.restapi.communication.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.sumit.restapi.communication.entity.ApiErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	public ResponseEntity<ApiErrorResponse> itemNotFound(ItemNotFoundException exe)
	{
		ApiErrorResponse obj=new ApiErrorResponse(HttpStatus.NOT_FOUND, 404, exe.getMessage(), "Item with the given item id is not present", LocalDateTime.now());
		return new ResponseEntity<ApiErrorResponse>(obj,HttpStatus.NOT_FOUND);
	}
}
