package com.voterapp.service;

public interface IElectionBooth {
	static boolean checkEligibility(int age, String locality, long voterId) {
		return false;
	}

}
