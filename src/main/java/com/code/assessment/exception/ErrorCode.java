package com.code.assessment.exception;

import org.springframework.http.HttpStatus;

public interface ErrorCode {

	String code();
	
	HttpStatus httpStatus();
	
}
