package com;

import java.util.*;
/*
Q: Given a list of integers, find out all the even numbers 
that exist in the list using Stream functions?
*/
public class EvenNumber {

	public static void main (String aa[]) {
		List<Integer> list= Arrays.asList(10,15,8,49,25,98,32);
		list.stream()
		.filter(n -> n%2==0)
		.forEach(System.out::println);
	}
}
