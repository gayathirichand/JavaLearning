package com.training.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArray {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6 };

		// method 1
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i]);
		}
		System.out.println("");

		// method 2

		List<Integer> reverse = Arrays.stream(num).boxed().sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		System.out.println(reverse+" using java 8 ");
	}

}
