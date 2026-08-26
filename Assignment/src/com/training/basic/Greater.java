package com.training.basic;

import java.util.Arrays;

public class Greater {

	public static void main(String[] args) {
		int[] num = { 9, 56, 74, 34, 567, 87, 988 };
		if (num.length > 0) {
			int high = num[0];
			for (int i = 1; i < num.length; i++) {
				high = num[0];
				if (num[i] > high) {
					high = num[i];
				}
			}
			System.out.println(high);

		} else {
			System.out.println("array has no value");

		}

		// using java 8

		int largest = Arrays.stream(num).max().orElse(0);
		System.out.println(largest + "   using java 8");

		// find greater of three numbers
		int x = 10;
		int y = 20;
		int z = 30;
		int greaterNum = x;
		if (y > greaterNum) {
			greaterNum = y;
		}
		if (z > greaterNum) {
			greaterNum = z;
		}
		System.out.println(greaterNum + "    new one");
	}

}
