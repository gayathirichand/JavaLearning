package com.oops.basics;

public class CalculatorDemo {
	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		int num[] = { 1, 2 };
		calculator.sum(num);
		calculator.sum(1,2);
		calculator.sum(3,4,5);
		calculator.sum(5,6,7,8);

		Calculator calculator1 = new Calculator();
		System.out.println(calculator1.square(10));
	}
}