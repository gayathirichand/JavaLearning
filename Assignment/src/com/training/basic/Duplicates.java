package com.training.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



//17. count the duplicates in an array - Duplicates.java 

public class Duplicates {

	public static void main(String[] args) {
       int[]  num = {1,2,2,3,3,3,4,5,5,6,7,7,7,8};
	   ArrayList<Integer> unique=new ArrayList<>();
int count =0;
       for(int kk=0;kk<num.length;kk++) {
    	   if(!unique.contains(num[kk])) {
        	   unique.add(num[kk]);

    	   }else {
    		   count++;
    	   }
       }System.out.println(count);
       
       // using java 8 
       
       int originalCount=num.length;
       List<Integer> duplicate=Arrays.stream(num).distinct().boxed().collect(Collectors.toList());
       int dupArraySize=duplicate.size();
       int duplicateCount =  originalCount-dupArraySize;
       System.out.println(duplicateCount);
	}

}
      