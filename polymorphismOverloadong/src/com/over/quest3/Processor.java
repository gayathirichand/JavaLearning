package com.over.quest3;

public class Processor {

	void calculate(double x) {
		System.out.println("Print the squareroot: "+(x * x));
	} 

	void calculate(int x, int y) {
		System.out.println("Print the product: "+(x * y));

	} 

	void calculate(double x, double y) {
		System.out.println("Print the difference: "+(x - y));

	} 

	void calculate(double x, int y) {
		System.out.println( "print x power y: "+(Math.pow(x, y)));

	} 

	void calculate(int x) {
		System.out.println("Print the square: "+(x * x));

	}

}
