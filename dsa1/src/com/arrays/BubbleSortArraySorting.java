package com.arrays;

public class BubbleSortArraySorting {
	
	public static void main(String[] args) {
		int arr[] = {12,23,5,6,7,123,89,-1,0};
		BubbleSortArraySorting bubble = new BubbleSortArraySorting();
		System.out.print("Before Sorting the Array :");
		bubble.print(arr);
		System.out.println();
		bubble.sortArray(arr);
		System.out.print("After Sorting the Array :  ");
		bubble.print(arr);
	}

	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	public void sortArray(int[] arr) {
		if (arr.length == 0|| arr.length == 1) {
			return;
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int x = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= x;
				}
			}
		}
		
	}

}
