package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//Optional practice
public class Example3 {

	public static void main(String[] args) {

		List<Integer> nums = List.of(11, 32, 60, 64, 85);
		nums.stream().filter(n -> n % 2 == 0).forEach(s -> System.out.println(s));
		System.out.println("--------------------");
		int oddNum = nums.stream().filter(n -> n % 2 != 0).findFirst().orElse(0);
		System.out.println(oddNum);

		System.out.println("--------------------");
		nums.stream().map(n -> n * 2).forEach(s -> System.out.println(s));
		System.out.println("--------------------");
		nums.stream().map(n -> n * 2).sorted().forEach(s -> System.out.println(s));
		System.out.println("--------------------");
		nums.stream().map(n -> n * 2).sorted().limit(3).forEach(s -> System.out.println(s));

//		Sort the list in desc order based on length and if same length
//		string are there then sort them ascending order.

		List<String> al = Arrays.asList("xapple", "bananaasdf", "orange", "pear", "kiwi", "grape");

		al.stream().sorted((o1, o2) -> {
			int rs = Integer.compare(o2.length(), o1.length());
			if (rs == 0) {
				return o1.compareTo(o2);
			}
			return rs;
		}).forEach(System.out::println);

//		Ans:
//		bananaasdf
//		orange
//		xapple
//		grape
//		kiwi
//		pear
	}

}
