package com.training.basic;

public class Perfect {

	public static void main(String[] args) {
		int num = 29;
		int sumOfNum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sumOfNum += i;
			}
		}
			if (num == sumOfNum) {
				System.out.println("It is a perfect number");
			} else {
				System.out.println("It is Not a perfect number");
			}

	}
}
