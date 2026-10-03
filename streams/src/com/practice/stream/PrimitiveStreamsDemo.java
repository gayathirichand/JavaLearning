package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class PrimitiveStreamsDemo {
	public static void main(String[] args) {

//  list/collection/set => List<Integer>,List<String>,List<Employee>
//convert into a stream the method is => list.stream()
//returns Stream<Integer>, Stream<String>,Stream<Double>,Stream<Object>
		List<Integer> numslist = Arrays.asList(1, 2, 3, 4, 5);
		numslist.stream().forEach(System.out::println);
//arrays - object => Integer[],String[], Employee[], Double[]
//convert into a stream the method is => Arrays.stream()
//returns Stream<Integer>, Stream<String>,Stream<Double>,Stream<Object>
		Integer[] nums = new Integer[] { 10, 20, 30 };
		Arrays.stream(nums).forEach(System.out::println);
//arrays - primitive => int[],double[], long[],char[]
//convert into a stream the method is => Arrays.stream()
//returns IntStream, DoubleStream, LongStream
		// aggregate operation sum , average, min, max

		int[] pnums = new int[] { 10, 20, 30 };
		// convert to stream and get sum . if not hav evalue sum can be 0
		int sum = Arrays.stream(pnums).filter(num -> num > 40).sum();
		System.out.println(sum);

		// get the average
		OptionalDouble avg = Arrays.stream(pnums).filter(num -> num > 40).average();
		avg.ifPresent(System.out::println);
//		System.out.println(avg.getAsDouble());
		
		// max
		OptionalInt optmax= Arrays.stream(new int[] {50,10,20,30,40}).max();
		optmax.ifPresent(System.out::println);
		//min 
				OptionalInt optmin= Arrays.stream(new int[] {10,20,30,40}).min();
				optmin.ifPresent(System.out::println);
				
				//even numbers 100-120
		 sum =	IntStream.range(100, 120)
				.filter(n->n%2==0)
//				.forEach(System.out::println);
				.sum();
		 System.out.println(sum);
	}
}
