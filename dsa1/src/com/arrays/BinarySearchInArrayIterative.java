package com.arrays;


public class BinarySearchInArrayIterative {
	public static void main(String[] args) {
		int a[] = {12,23,34,45,56,67,78,89,99};
		BinarySearchInArrayIterative b = new BinarySearchInArrayIterative();
		int i = b.binarySearchArrayIterative(a,2);
		if (i == -1) {
			System.out.println("value doen's exist in Array");
		}else {
			System.out.println("the value position is : "+i);
		}
	}

	public int binarySearchArrayIterative(int[] a, int vaule) {
		
		int start = 0;
		int end = a.length-1;
		
		if (a.length == 0 ||start > end) {
			return -1;
		}
		
		
		while(start<= end){
			
		int mid = (start + end)/2;// or start+((end - start)/2)
		
		if (vaule == a[mid]) {
			return mid;
		}
		if (vaule < a[mid]) {
			end = mid-1;
			//return binarySearchArrayIterative(a, vaule, start, mid-1);
		}else {
			start = mid+1;
			//return binarySearchArrayIterative(a, vaule, mid+1, end);
		}
		}
		return -1;
		
		
	}

}
