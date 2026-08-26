package com.training.basic;

import java.util.Arrays;

public class SmallSecond {

	public static void main(String[] args) {
		int[] num = {55,44,33,66,98,12};

		int firstSmall=num[0],secondSmall=0;
		for (int k = 1; k < num.length; k++) {
			if(num[k]<firstSmall ) {
				secondSmall=firstSmall;
				firstSmall=num[k];
			}			
		}System.out.println(secondSmall);
		
		//with reference 
		int[] num1 = { -1,1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		int firstSmall1= Integer.MAX_VALUE;
        int secondSmall1 = Integer.MAX_VALUE;

        for (int value : num1) {

            if (value < firstSmall1) {

                secondSmall1 = firstSmall1;
                firstSmall1 = value;

            } else if (value > firstSmall1 && value < secondSmall1) {

                secondSmall1 = value;
            }
        }

        System.out.println("Smallest = " + firstSmall1);
        System.out.println("Second Smallest = " + secondSmall1);
        
        // using java 8 
        int secSmall=		Arrays.stream(num1).distinct().sorted().skip(1).findFirst().getAsInt();
        System.out.println(secSmall);
	}

}
