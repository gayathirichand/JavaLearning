package com.inter.exampls;

public abstract class CardPayment implements IPaymentProcessro {

void cardType(String type) {
	System.out.println("Card type is "+type);
}

}

class CreditCardPayment extends CardPayment{
	
	//concrete method
  void cardLimit(double amount) {
System.out.println(" Card limit is raised to "+amount);		
	}

  @Override
  public void payAmount(double amount) {
	  System.out.println(" paying through credit card "+amount);		
	
  }
	
}

class DebitCardPayment extends CardPayment{

	@Override
	public void payAmount(double amount) {
System.out.println("Paying through debit card "+amount);		
	}
	//default method can be overridden in subclasses
	public  void checkOffers() {
		System.out.println("offers only on purchase above 5000");
	}
}