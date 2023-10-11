package com;

public class ReverseString3 {
	public static void main(String[] args) {
		String str = "welcomejava";

		System.out.println(reverse(str));
	}

	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid String");
		StringBuilder out = new StringBuilder();
		char[] chars = in.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			out.append(chars[i]);

		}
		return out.toString();

	}
}
