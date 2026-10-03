package com.meth.examples;

public class CalcMethRef {

	public static void main(String[] args) {

		// referring to a static method - call using class name
		ICalculator ref = Processor::sum;// refer the method
		ref.calculate(10, 20);

		// refer a non static method -call using obj name
		ref = new Processor()::product;// implementation
		ref.calculate(10, 20);// calling
		
		
		Processor processorRef = new Processor();
		ref = processorRef::product;
		ref.calculate(33, 20);

	}
}
