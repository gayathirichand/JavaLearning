package com.training.basic;

import java.util.stream.IntStream;

public class Factorial {
	

	public static void main(String[] args) {
		int n = 5;
		int facNum = 1;
		for (int g = 2; g <= n; g++) {
			facNum = g * facNum;
		}
		System.out.println("Factorial numfor "+n+" is "+facNum);
		
		
		//Using java 8
		
		int n1=5;

		int fac = IntStream.rangeClosed(1,n1).reduce(1,(a,b)->(a*b));
		System.out.println(fac);

	}
}