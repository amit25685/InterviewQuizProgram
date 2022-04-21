package com;

import java.util.HashMap;

public class OddOccurrence2 {

	static int getOddOccurence(int arr[], int n) {
		HashMap<Integer, Integer> hmap = new HashMap<>();
		// putting all elements into Hashmap
		for (int i = 0; i < n; i++) {
			if (hmap.containsKey(arr[i])) {
				int val = hmap.get(arr[i]);
				hmap.put(arr[i], val + 1);
			} else {
				hmap.put(arr[i], 1);
			}
		}

		for (Integer a : hmap.keySet()) {
			if (hmap.get(a) % 2 != 0)
				return a;
		}
		return -1;
	}

	public static void main(String aap[]) {
		int arr[] = new int[] { 2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
		int n = arr.length;
		System.out.println(getOddOccurence(arr, n));
	}
}