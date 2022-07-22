package com.ap.App.Exception;

import javax.persistence.NoResultException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;



@ControllerAdvice
public class CommonExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<ErrorTemplate> handlerForException(NoResultException exp)
	{
		ErrorTemplate template = new ErrorTemplate();
		
		template.setActionType("Customer Not Available in our database , Please try Again");
		
		return new ResponseEntity<ErrorTemplate>(template,HttpStatus.BAD_REQUEST);
	}
	

}
