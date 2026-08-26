package com.training.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int k = 0; k < num.length; k++) {
			if (num[k] % 2 == 0) {
				System.out.print(num[k] + "  ");
			}
		}
		System.out.println("  ");

		System.out.println("using java 8    ");

//java 8

		Arrays.stream(num).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + "  "));
		System.out.println("");

		List<Integer> even = Arrays.stream(num).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());

		System.out.println(even );
	}

}
