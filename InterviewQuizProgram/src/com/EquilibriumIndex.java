package com;

import java.io.IOException;

/*Given an array A of n positive numbers. Task is to find the first Equilibrium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.
*/
public class EquilibriumIndex {
	public static int equilibriumPoint(long arr[], int n) {
		long sum = 0;
		long leftsum = 0;

		for (int i = 0; i < n; ++i)
			sum += arr[i];

		for (int i = 0; i < n; ++i) {
			sum -= arr[i];

			if (leftsum == sum)
				return i + 1;

			leftsum += arr[i];
		}
		return -1;
	}

	public static void main(String[] args) throws IOException {
		long arr[] = { 1, 2, 3, 4, 5, 1, 3, 2, 4 };
		int arr_size = arr.length;
		System.out.print("Equilibrium Index : ");
		System.out.println(equilibriumPoint(arr, arr_size));
	}
}
