package com;

import java.util.*;

/*
 * How to find duplicate elements in a given integers list in java using Stream functions?
 */
public class DuplicateElements {

	public static void main(String aa[]) {
		List<Integer> list= Arrays.asList(10,15,8,49,25,98,98,32,15);
		Set<Integer> set = new HashSet<>();
		list.stream()
		.filter(n-> !set.add(n))
		.forEach(System.out::println);
	}
}