package com.arrays;

public class DeleteElementInArray {
	
	static int count = 5;
	
	public static void main(String[] args) {
		DeleteElementInArray d = new DeleteElementInArray();
		int a[] = {12,43,54,32,56};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(" "+a[i]);
		}
		System.out.println();
		
	  /*d.deleteFromEnd(a);
		d.print(a);
		
		d.deleteValue(a,56);
		d.print(a);*/
		
		d.deleteromPosition(a,2);
		d.print(a);
	}

	public void deleteromPosition(int[] a, int postion) {
		
		if (postion > count || postion <= 0) {
			System.out.println("Invalid Position");
			return;
		}
		
		for (int i = postion -1; i < count - 1; i++) {
			a[i] = a[i+1];	
		}
		count--;
	}

	public void deleteValue(int[] a, int value) {
		int i;
		 for (i = 0; i < count; i++) {
			if (a[i] == value) 
				break;		
		}
		 
		if (i == count) {
			System.out.println("Value doesn't exist in array");
			return;
		}
		for (int j = i; j < count-1; j++) {
			a[j] = a[j+1]; 
		}
		count--;
				
	}

	public void print(int[] a) {
		for (int i = 0; i < count; i++) {
			System.out.print(" "+a[i]);
		}
		
	}

	public void deleteFromEnd(int a[]) {
		if (a.length <= 0) {
			return;
		}
		count--;
		
	}

}
