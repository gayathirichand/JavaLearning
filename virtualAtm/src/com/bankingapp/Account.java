package com.bankingapp;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
void withdraw(double amount) {
	System.out.println("withdrawing");
}void deposite(double amount) {
	System.out.println("deposite");

}
double getBalance() {
	return balance;
}
}
