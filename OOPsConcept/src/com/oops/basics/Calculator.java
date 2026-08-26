package com.oops.basics;

public class Calculator {
	void sum(int...nums) {
		int sum = 0;
		for (int num : nums) {
			sum += num;
		}System.out.println(sum);
	}

	double square(int a) {
		return Math.pow(a, 2);

	}

}
