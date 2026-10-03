package com.inter.exampls;

public class UpiPayment implements IPaymentProcessro {

	@Override
	public void payAmount(double amount) {
System.out.println("Paying the amount "+amount+"");
	}

	
	//override checkOffers
	@Override
	public void checkOffers() {
		System.out.println("10% discount of Dininig and Shopping");
	}
public void transactionStatus() {
	System.out.println("Checking status.....");
}
}
