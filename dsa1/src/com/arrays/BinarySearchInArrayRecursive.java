package com.arrays;

import javax.xml.bind.ValidationEvent;

public class BinarySearchInArrayRecursive {
	public static void main(String[] args) {
		int a[] = {12,23,34,45,56,67,78,89,99};
		BinarySearchInArrayRecursive b = new BinarySearchInArrayRecursive();
		int i = b.binarySearchArrayRecursive(a,99,0,a.length-1);
		if (i == -1) {
			System.out.println("value doen's exist in Array");
		}else {
			System.out.println("the value position is : "+i);
		}
	}

	public int binarySearchArrayRecursive(int[] a, int vaule, int start, int end) {
		if (a.length == 0 ||start > end) {
			return -1;
		}
		
		int mid = (start + end)/2;// or start+((end - start)/2)
		
		if (vaule == a[mid]) {
			return mid;
		}
		if (vaule < a[mid]) {
			return binarySearchArrayRecursive(a, vaule, start, mid-1);
		}else {
			return binarySearchArrayRecursive(a, vaule, mid+1, end);
		} 
		
		
	}

}
