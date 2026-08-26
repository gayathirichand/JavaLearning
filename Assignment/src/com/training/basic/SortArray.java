package com.training.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {
			int num[]= {4,6,8,1,3,9,5,2};
			int small=num[0];
			for(int i=1;i<num.length;i++) {
				
			}
			// using java 8 
			
			List<Integer> sortedArray=Arrays.stream(num).boxed().sorted().collect(Collectors.toList());
			System.out.println(sortedArray);
	}

}
