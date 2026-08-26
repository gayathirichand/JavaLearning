package com.training.basic;

public class Fibonacci {
	

	public static void main(String[] args) {
		int firstNum = 0;
		int SecondNUm = 1;
		int nxtNum = 0;
		int n = 6;
		System.out.print(firstNum+" "+SecondNUm);
		for (int i = 2; i < n; i++) {
			nxtNum = firstNum + SecondNUm;
			System.out.print(" "+nxtNum);
			firstNum = SecondNUm;
			SecondNUm = nxtNum;
		}

	}

}
