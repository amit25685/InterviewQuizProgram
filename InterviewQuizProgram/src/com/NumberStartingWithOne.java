package com;

import java.util.List;
import java.util.Arrays;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class NumberStartingWithOne {

	public static void main(String aa[]) {
		List<Integer> list= Arrays.asList(10,15,8,49,25,98,32);
		list.stream()
		.map(p->p+"") //convert to string
		.filter(p->p.startsWith("1"))
		.forEach(System.out::println);
	}
}
