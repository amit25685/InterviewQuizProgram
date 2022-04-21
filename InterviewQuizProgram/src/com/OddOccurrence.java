package com;

public class OddOccurrence {

	static int getOddOccurence(int arr[], int n) {
		int i;
		int res = 0;
		for (i = 0; i < n; i++) {
			res = res ^ arr[i];
		}
		return res;
	}

	public static void main(String aap[]) {
		int arr[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = arr.length;
		System.out.println(getOddOccurence(arr, n));
	}
}