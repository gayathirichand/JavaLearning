package com.training.basic;

import java.util.Arrays;
import java.util.Comparator;

public class LargeSecond {

	public static void main(String[] args) {
		int num[] = { 33, 54, 23, 13, 56, 78, 98, 65, 99 };
		int firstLarge = num[0], secondLarge = 0;

		for (int h = 0; h < num.length; h++) {
			if (num[h] > firstLarge) {
				secondLarge = firstLarge;
				firstLarge = num[h];

			}
		}
		System.out.println(secondLarge);
		
		int num1[] = {7,6,5,4,3,2};
		int firstLarge1 = Integer.MIN_VALUE, secondLarge1 = Integer.MIN_VALUE;
		for(int value :num1) {
			if (value > firstLarge1) {
				secondLarge1 = firstLarge1;
				firstLarge1 = value;
			}else if(value <firstLarge1 && value>secondLarge1) {
				secondLarge1=value;
			}

		} System.out.println(secondLarge1);
		
		
		//Using java 8 
		int numm=Arrays.stream(num1).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(numm);

	}

}
