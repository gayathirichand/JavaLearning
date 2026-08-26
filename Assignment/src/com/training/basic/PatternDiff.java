package com.training.basic;

public class PatternDiff {

	public static void main(String[] args) {
		

//14. create a pattern as(given below)1 23 456 789 - PatternDiff.java 
		int count=1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 0; j <i; j++) {
				if(count<=9)
				System.out.print(count);
			count++;
			}
			System.out.print(" ");

		}
	}

}
