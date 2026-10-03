package com.voterapp.service;

import com.voterapp.exceptions.LocalityNotFoundException;
import com.voterapp.exceptions.NotEligibleException;
import com.voterapp.exceptions.UnderAgeException;
import com.voterapp.exceptions.VoterIdNotFoundException;

public class ElectionBoothImpl implements IElectionBooth {
	public boolean checkEligibility(int age, String locality, long voterId) throws NotEligibleException {
		if (checkAge(age) && checkLocality(locality) && checkVoterId(voterId))
			return true;
		return false;
	}

	private boolean checkAge(int age) throws UnderAgeException {
		// if age is below 18 throw this exception
		if (age < 18) {
			throw new UnderAgeException("You are under age");
		}
		return false;
	}

	private boolean checkLocality(String locality) throws LocalityNotFoundException {
//voter should be wihin locality
		String[] localities = new String[] { "JP Nagar", "Surya Nagar", "Electroni City" };
		// check if the locality is same
		for (String nlocality : localities) {
			if (locality.equals(nlocality)) {
				return true;
			}
			// if not throw exception
			throw new LocalityNotFoundException("Your Locality is Invalid");
		}
		return false;

	}

	private boolean checkVoterId(long voterId) throws VoterIdNotFoundException {
		// check if id is between 1000-10000 if not throw an exception
		return true;
	}
}
