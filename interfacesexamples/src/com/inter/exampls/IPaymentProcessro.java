package com.inter.exampls;

public interface IPaymentProcessro {
	
	String message="Payment Gateway App";
	
	//abstract method 
	void payAmount(double amount);
	
	//static method can be called only by interface name
	//common for all implementation classes
	
	static void printReceipt(double amount) {
		System.out.println("Receipt for amount paid "+amount);
	}

	//default method can be overridden in subclasses
default void checkOffers() {
	System.out.println("offers on dining and movies");
}

}
