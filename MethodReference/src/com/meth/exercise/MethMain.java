package com.meth.exercise;

import java.util.Arrays;
import java.util.List;

public class MethMain {

	public static void main(String[] args) {
		
		ISports ref =new Games()::show;
		String [] game= ref.printGames();
		//use streams - convert arary into a stream
		Arrays.stream(game).forEach(System.out::println);

		
		IInsurance ins = Bank:: getPremium;
		System.out.println(ins.calcInterest(200));

		System.out.println();
		List<String> course = Arrays.asList("Java","CSS","Python","Angular","Microservices");
		course.stream().map(String:: toUpperCase).sorted().forEach(System.out:: println);
	}
}
