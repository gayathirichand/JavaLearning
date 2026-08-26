package com.training.basic;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Sum {

	public static void main(String[] args) {
		int [] num = {1,2,3,4,5,6};
		int sum=0;
		for(int j =0;j<=num.length;j++) {
			 sum += j;
		} System.out.println(sum);
		double avg = sum/num.length;
	 System.out.println(avg);
	 
	 sum=0;

	 for(int val:num) {
		 sum+=val;
	 }System.out.println(sum+" using for each loop");
// using java 8
//	 method 1
		int n1=5;
		int sum1 = IntStream.rangeClosed(1,n1).reduce(0,(a,b)->(a+b));
		System.out.println(sum1);
//		double avgg=sum/n1;
//		 method 2
		
		IntSummaryStatistics stats = IntStream.rangeClosed(1, n1)
                .summaryStatistics();

System.out.println("Sum = " + stats.getSum());
System.out.println("Average = " + stats.getAverage());
System.out.println("min = " + stats.getCount());

//Method 3 if input is array/arraylist
int ss=Arrays.stream(num).sum();
double avg1=Arrays.stream(num).average().orElse(0);

System.out.println("method 3 Sum = " + ss);
System.out.println("method 3 Average = " + avg1);


	}

}
