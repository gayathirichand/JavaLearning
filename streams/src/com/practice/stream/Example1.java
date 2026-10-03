package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Raju", "Geetha", "Manav", "Shail", "Gayu", "Prachi", "Charan");
		Predicate<String> pred = name -> {
			if (name.contains("R"))
				return true;
			return false;
		};
		List<String> newName = names.stream().filter(str -> str.startsWith("G")).collect(Collectors.toList());
		System.out.println(newName);

		names.stream().limit(5).sorted().forEach(str -> System.out.println(str.toUpperCase()));
		System.out.println("");
		// get names and convert to upper case
		Function<String, String> fun = str -> str.toUpperCase();
//		names.stream().forEach(str->System.out.println(str.toUpperCase()));
		names.stream().map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
// input is str -> output is length of each string value
	  names.stream().map(str->str.length()).forEach(str -> System.out.println(str));
	//convert list to stream , filter by names having o , sort them 
	  newName=  names.stream().filter(n->n.contains("o")).sorted().collect(Collectors.toList());
		System.out.println(newName);

	  
	  
	  // add hello with each element and print them output 
		  names.stream().map(str->"Hello "+str).forEach(str -> System.out.println(str));

	
	
	
	}

}
