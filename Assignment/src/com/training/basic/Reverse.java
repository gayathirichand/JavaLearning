package com.training.basic;


public class Reverse {

	public static void main(String[] args) {
//		18. reverse the number - Reverse.java 

		int num = 12345;
//method 1 
		String number = String.valueOf(num);
		for (int j = number.length() - 1; j >= 0; j--) {
			System.out.print(number.charAt(j));
		}
		System.out.println("");

//method 2 
		StringBuilder reverse=new StringBuilder(number).reverse();
		System.out.println(reverse+" using string builder");
		

	}

}
