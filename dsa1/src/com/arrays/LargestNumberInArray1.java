package com.arrays;

public class LargestNumberInArray1 {

	public static void main(String[] args) {
		int[] a = { 44, 66, 99, 77, 33, 22, 55 };

		System.out.println("Find The Largest Number in Array : "
				+ findLargetNumberInArray(a));
	}

	private static int findLargetNumberInArray(int[] a) {

		int max = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}

		}
		return max;

	}

}
