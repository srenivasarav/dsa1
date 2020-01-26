package com.arrays;


//Find The Largest number in Array.
public class LargestNumberInArray {

	public static int findLargestNumber(int[] a) {
	
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					int temp  = a[i];
					a[i] =a[j];
					a[j] = temp;							
					
				}
				System.out.println(a);
			}

		}
		return a[a.length - 3];
	}

	public static void main(String[] args) {
		int[] wav = { 11, 3, 6, 3, 7, 8, 9, 3, 4, 7, 2, 74 };
		System.out.println("largest Number in Array : " +findLargestNumber(wav));
		
	}
}
