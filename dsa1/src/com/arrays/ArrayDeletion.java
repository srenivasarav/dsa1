package com.arrays;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		
		int[] a = new int[6];
		a[0] = 22;
		a[1] = 23;
		a[2] = 24;
		a[3] = 25;
		a[4] = 26;
		a[5] = 27;
		System.out.println("Enter the Position of the Element");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int pos = n;
		int size = a.length;

		/*if (pos <= 0 || pos > size) {
			System.out.println("Invalid Position");
		} else {

			for (int i = pos - 1; i < size - 1; i++) {
				a[i] = a[i + 1];
			}
			size--;

		}
		*/
		
		//or
		
		if (pos > a.length) 
			throw new ArrayIndexOutOfBoundsException("The Argument is bigger the array size you are trying to insert");

		
		if (pos >= 0 || pos > size) {

			for (int i = pos - 1; i < a.length; i++) {
				if (a.length > i + 1) {
					a[i] = a[i + 1];
				} else {
					a[i] = 0;
				}

			}
		}else {
			return;
		}
		size--;
			
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
