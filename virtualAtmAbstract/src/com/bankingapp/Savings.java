package com.bankingapp;

public class Savings extends Account {

	public Savings(double balance) {
		super(balance);
	}

	void withdraw(double amount) {
		System.out.println("Withdraw in Savings");
		balance =balance - amount;
	}

	@Override
	void deposite(double amount) {
		System.out.println("Deposite in Savings");
		balance= balance+amount;
	}
}
