package com.voterapp.exceptions;

//custom exception
public class VoterIdNotFoundException extends NotEligibleException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// add default and parametersied constructor

	public VoterIdNotFoundException() {
		super();
	}

	public VoterIdNotFoundException(String message) {
		super(message);
	}

}
