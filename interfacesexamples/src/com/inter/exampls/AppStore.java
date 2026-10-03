package com.inter.exampls;

public class AppStore {

	public static void main(String[] args) {
		// interface ref = implementation class

		IPaymentProcessro paymentProcessor = new UpiPayment();
		paymentProcessor.payAmount(2000);// default method
		paymentProcessor.checkOffers();//overridden default method in upi payment

		IPaymentProcessro.printReceipt(1000);// static method using interface
		System.out.println(IPaymentProcessro.message);//call static variable
         //own method of upi payment
		UpiPayment upiPayment = (UpiPayment) paymentProcessor;
		upiPayment.transactionStatus();
		
		//card payment
		paymentProcessor= new CreditCardPayment();
		paymentProcessor.checkOffers();
		
		
		CreditCardPayment credit =(CreditCardPayment)paymentProcessor;
		//all methods in credit card payment
		credit.cardLimit(3900);
		// super class method
		credit.cardType("VISA");
		//call interface method
		credit.payAmount(4500);
		//default method
		credit.checkOffers();//calls the method in interface
	
		
		paymentProcessor=new DebitCardPayment();
		paymentProcessor.payAmount(3000);
		paymentProcessor.checkOffers();//calls from debit card payment
	
	
	
	}

}
