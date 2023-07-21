package com.trading_system.service.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.trading_system.service.response.ApiResponse;

import jakarta.validation.UnexpectedTypeException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ApiResponse> gobalExceptionHandler(Exception ex){
		String message =ex.getMessage();
		ApiResponse ar=new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(ar,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourseNotFoundException ex){
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(NumberFormatException.class)
	public ResponseEntity<ApiResponse> NumberFormatExceptionHandler(NumberFormatException ex){
		String message = ex.getMessage();
		ApiResponse apiResponse = new ApiResponse(message,false);
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){
		Map<String,String> response = new HashMap<>();
		ex.getBindingResult().getAllErrors().forEach((error)->{
			String fieldName=((FieldError)error).getField();
			String message=(error).getDefaultMessage();
			response.put(fieldName, message);	
		});
		return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
	}
	
//	@ExceptionHandler(UnexpectedTypeException.class)
//	public ResponseEntity<Map<String,String>> handleMethodArgumentNotValidException(UnexpectedTypeException ex){
//		Map<String,String> response = new HashMap<>();
//		ex.getBindingResult().getAllErrors().forEach((error)->{
//			String fieldName=((FieldError)error).getField();
//			String message=(error).getDefaultMessage();
//			response.put(fieldName, message);
//		});
//		return new ResponseEntity<Map<String,String>>(response,HttpStatus.BAD_REQUEST);
//	}
	
	
}

                                                                         