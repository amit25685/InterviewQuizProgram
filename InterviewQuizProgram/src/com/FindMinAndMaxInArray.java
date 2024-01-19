package com;

import java.util.Arrays;
import java.util.Comparator;

public class FindMinAndMaxInArray {

	public static void main(String aa[]) {
		int[] arr= { 2, 3, 1, 22, 11, 33, 5};
		// Find the max number
		int max= Arrays.stream(arr).boxed().max(Integer::compareTo).get();
		System.out.println("Max Value by java 8 : "+max);
		
		// Find the min number
		  int min = Arrays.stream(arr).boxed().max(Comparator.reverseOrder()).get();
		  System.out.println("Min Value by java 8 : "+min);
	}
}
