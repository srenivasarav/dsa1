package com.arrays;

import javax.crypto.spec.PSource;

public class DeleteElement {
	
	static int count=0;
	
	public static void main(String[] args) {
		
		int a[] = {12,13,14,15,16};
		DeleteElement d = new DeleteElement();
		count = a.length;
	
		d.print(a);
		System.out.println();
		//d.deleteFromEnd(a);
		//d.deletFromValue(a,15);
		d.deleteFromosition(a,2);
		System.out.println();
		
		d.print(a);
	}
	
	public void deleteFromosition(int[] a, int position) {
		
		if (position> count|| position <= 0) {
			System.out.println("Invalid Position");
			return;
		}
		
		for (int i = position - 1; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
		count--;
	}

	public void deletFromValue(int[] a, int value) {
		int i;
		for (i = 0; i < a.length; i++) {
			if (value == a[i]) {
				break;
			}	
		}
		
		if (i == a.length) {
			System.out.println(" value doesn't exist in array ");
			return;
		}
		for (int j = i; j < a.length -1; j++) {
			a[j] = a[j+1];
		}
		count--;
	}

	public void deleteFromEnd(int[] a) {
		if (a.length <= 0) {
			return;
		}
		count--;
	}

	public void print(int[] a) {
		for (int i = 0; i < count; i++) {
			System.out.print(" "+a[i]);
		}
		
	}

	
}
