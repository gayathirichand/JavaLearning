package com.bankingapp;

public abstract class Account {
	double balance;
	static final String BANKNAME="ABC Bank";
    static String idProof ="AAdhar Details" ;
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	abstract void withdraw(double amount);
	abstract void deposite(double amount);
	double getBalance() {
		return balance;
	}
	final void printInfo() {
		loanApproval();
		System.out.println("Loan approved member details");
	}
	private void loanApproval() {
		System.out.println("Loan approval process");
	}
	 static void documentsNeeded() {
		  System.out.println("Id Proof Needed " + idProof);
		  System.out.println("Address Proof needed ");
		  }
}
