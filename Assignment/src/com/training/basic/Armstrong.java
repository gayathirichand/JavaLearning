package com.training.basic;

import java.util.Arrays;

public class Armstrong {

	public static void main(String[] args) {
		int n = 153;
		// method 1
		String power = String.valueOf(n);
		int pw = power.length();
		int cubVal = 1;
		int arm = 0;
		for (int j = 0; j < power.length(); j++) {
			char val = power.charAt(j);
			int num = Character.getNumericValue(val);
			int count = 1;
			while (count <= pw) {
				cubVal *= Integer.valueOf(num);
				count++;
			}
			int cuvfinal = cubVal;
			cubVal = 1;
			arm += cuvfinal;
		}
		System.out.println(arm);
		// method 2
		
		
		// using java 8
		int kk = Arrays.stream(power.split("")).mapToInt(Integer::parseInt)
				.map(digit -> (int) Math.pow(digit, pw))
				.sum();
		System.out.println(kk);
		if (kk == n) {
			System.out.println("amrstrong");
		}
		else {
			System.out.println("Not amrstrong");
		}
	}

}
