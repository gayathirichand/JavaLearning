package com.bankingapp;

public class Current extends Account {
	String accountType;

	public Current(	String accountType,double balance) {
		super(balance);
		this.accountType=accountType;
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw in Current");
		balance = balance-amount-100;
	}

	@Override
	void deposite(double amount) {
		System.out.println("Withdraw in Current");
		balance =balance+ amount+50;
	}

	String [] showLoanTypes() {
		return new String []{"Short term","Long term","Vehicle loan"};
	}
	
	
	
	
	
	
}
