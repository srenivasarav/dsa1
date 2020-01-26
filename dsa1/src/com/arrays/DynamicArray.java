package com.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) throws IOException {
		int a[] = new int[6];
		int size = 5;
		int pos = 2;
		int num = 10;
		int len = 5;
		//System.out.println(n);
		for (int i = 0; i < size; i++) {
			System.out.println("Enter The Array Elements : ");			
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();
			a[i] =n;
			//System.out.println(a[i]);
		}
		System.out.println("***************");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Array Length : "+a.length);
		for (int i = len-1; i >= pos-1; i--) {
			a[i + 1] = a[i];
			//System.out.println(a[i + 1]);
		}
		a[pos-1] = num;
		//len++;
		
		System.out.println("***************");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
	}
}
