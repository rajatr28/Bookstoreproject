package com.capgemini.bookstore.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.bookstore.exception.CustomerException;

@RestControllerAdvice
public class CustomerAdvice {
	@ExceptionHandler(value = {CustomerException.class})
	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	public Error handleException1(Exception ex) {
		return new Error(ex.getMessage());
	}

}
