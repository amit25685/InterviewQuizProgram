package com;

import java.util.Scanner;

public class ReverseStringRecursion2 {

	public static void main(String aa[]) {
		String str;
		System.out.println("Please Enter String:");
		Scanner scanner= new Scanner(System.in);
		str = scanner.nextLine();
		scanner.close();
		String reversed = reverseString(str);
		System.out.println("The Reverse String is: "+ reversed);
	}
	
	public static String reverseString(String str) {
		if(str.isEmpty())
			return str;
		else
			return reverseString(str.substring(1))+str.charAt(0);
	}
}

