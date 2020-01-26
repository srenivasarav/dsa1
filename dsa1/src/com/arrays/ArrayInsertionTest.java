package com.arrays;

public class ArrayInsertionTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int pos = 3;
		int size = 50;
		int num = 99;
		int a[] = new int[10];
		int b[] = {1,2,3,4,5};
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		a[5] = 6;

		System.out.println("Length of The Array : " + a.length);

		if (pos >= a.length || pos >= size + 1) {
			System.exit(1);
		} else {
			for (int i = a.length - 1; i >= pos - 1; i--) {
				a[pos - 1] = a[i];
			}
			a[pos - 1] = num;
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
