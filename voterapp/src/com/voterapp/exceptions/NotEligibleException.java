package com.voterapp.exceptions;

//custom exception
public class NotEligibleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// add default and parametersied constructor

	public NotEligibleException() {
		super();
	}

	public NotEligibleException(String message) {
		super(message);
	}

}
