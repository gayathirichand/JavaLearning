package com.training.basic;

public class PatternSame {
	

	public static void main(String[] args) {
//		13. create a pattern as(given below) 1 22 333 4444 - PatternSame.java 
		
		
		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}    
				System.out.print(" ");

		}
	}
}
