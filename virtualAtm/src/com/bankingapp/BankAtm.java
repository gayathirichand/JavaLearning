package com.bankingapp;

import java.util.Scanner;

public class BankAtm {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose \'s\' for savings and \'c\' for current");
		String choice = scanner.next();
		Account account = null;
		
		if (choice.equalsIgnoreCase("S"))
			// super class ref = sub class object
			account = new Savings(20000);
		else {
			account = new Current("Current", 10000);
		    //create a ref of Current and downcast
			Current current = (Current)account;
			//call own method of current
			String[] loans = current.showLoanTypes();
			for (String loan : loans) {
				System.out.println(loan);
			}
			
		}
		 for(;;){
		// call the overridden methods using account ref
		System.out.println(
				"""
				Enter 1. withdraw
				      2. deposit 
				      3. Balance 
				      4. Exit
				""");
		int type = scanner.nextInt();
		switch (type) {
		case 1:
			System.out.println("Enter Amount to withdraw");
			double amount = scanner.nextDouble();
			account.withdraw(amount);
			break;
		case 2:
			System.out.println("Enter Amount to deposit");
			double amount1 = scanner.nextDouble();
			account.deposite(amount1);
			break;
		case 3:
			System.out.println("Balance is "+account.getBalance());
			break;
		case 4:
//			scanner.close();
			System.exit(0);
		}
	}	}

}
