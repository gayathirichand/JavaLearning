package com.training.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Odd {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		for (int h = 0; h < num.length; h++) {
			if (num[h] % 2 != 0)
				System.out.print(num[h] + "  ");
		}

		// using java 8

		List<Integer> odd = Arrays.stream(num).filter(n -> n % 2 != 0).boxed().collect(Collectors.toList());

		System.out.println(odd);

		Arrays.stream(num).filter(n -> n % 2 != 0).forEach(n -> System.out.print(n + " "));

	}

}
