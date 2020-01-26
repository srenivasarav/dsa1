package com.arrays;

import java.util.Scanner;

public class InsertElementArray {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		int num= 30;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Element position which you want to insert new value :");
		int pos = sc.nextInt();
		
		for (int i = a.length-1; i > pos; i--) {
			a[i] = a[i-1];
		}
		a[pos] = num;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}