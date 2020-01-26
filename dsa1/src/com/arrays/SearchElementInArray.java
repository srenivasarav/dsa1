package com.arrays;

public class SearchElementInArray {

	public static void main(String[] args) {
		int[] a = { 21, 22, 23, 45, 67, 78, 89 };
		SearchElementInArray s = new SearchElementInArray();
		int i = s.searchElement(a, 89);
		if (i == -1) {
			System.out.println("value doesn't exist in Array");
		}else {
			System.out.println("Array position is : "+i);
		}
	}

	public int searchElement(int[] a, int value) {
		if (a.length == 0) {
			System.out.println("Array Length is Zero [0]");
			return -1;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == value) {
				return i;
			}
		}
		return -1;
	}

}
