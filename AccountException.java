package com.lti.day5.Exception;

//public class AccountException extends Exception {
public class AccountException extends RuntimeException {		
	
	String s;

	public AccountException(String s) {
		super(s);									//Calls the constructors of RuntimeException
	}

	
}
