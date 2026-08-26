package com.training.basic;

import java.util.Arrays;

public class Smaller {

	public static void main(String[] args) {

		int[] num = {9,56,74,34,567,87,988};
		if (num.length > 0) {   //checking array has value or null
			int small = num[0];// should not initiate with 0 may it will have -ge num
			for (int i = 1; i < num.length; i++) {
				small = num[0];
				if (num[i] < small) {
					small = num[i];
				}
			}
			System.out.println(small+"  smallest numer ");

		}else {
		      System.out.println("array has no value");

		}

		// java 8

		int smallest = Arrays.stream(num).min().orElse(0);
		System.out.println(smallest + "   using java 8");
	
	}

}
