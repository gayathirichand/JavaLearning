package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		List<String> courses = Arrays.asList("Java","Css","Spring","Html","Angular","Microservice");
//sort and get the first element
	Optional<String> opt=courses.stream().sorted().findFirst();
	String course = opt.get();
	
		System.out.println(course);
		
		//filter and 
		 course=courses.stream().filter(s->s.startsWith("S")).findFirst().orElse("no course found");
			System.out.println(course);
			
			
			List<Integer> nums = Arrays.asList(11,15,91,63,85);

	}

}
