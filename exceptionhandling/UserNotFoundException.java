package com.ashokit.exceptionhandling;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException() {
		System.out.println("UserNotFoundException Class Constructor.....");
	}
	
	public UserNotFoundException(String errorMessage) {
		//passing errorMessage RuntimeException
		super(errorMessage);
	}
	
	public UserNotFoundException(String errorMessage,String userId) {
		//errorMessage = %s User Not Found <----> AIT3435 User Not Found
		super(String.format(errorMessage,userId));		
	}
	
	public UserNotFoundException(String errorMessage,String userId,Throwable cause) {
		super(String.format(errorMessage,userId),cause);
	}
}