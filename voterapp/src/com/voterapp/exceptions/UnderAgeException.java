package com.voterapp.exceptions;

//custom exception
public class UnderAgeException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// add default and parametersied constructor

	public UnderAgeException() {
		super();
	}

	public UnderAgeException(String message) {
		super(message);
	}

}
