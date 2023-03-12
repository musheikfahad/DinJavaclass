package com.arraypackages;

public class ArrayPractice {

	public static void main(String[] args) {
		int a[] = new int[5];

		a[0] = 1;

		a[1] = 2;

		a[2] = 4;

		a[3] = 6;

		a[4] = 78;

		System.out.println(a[0]);

		System.out.println(a[1]);
		System.out.println(a[2]);

		System.out.println(a[3]);

		System.out.println(a[4]);
		
		
		System.out.println();
		
		System.out.println("using for loop");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println();
		System.out.println("by using for each loops");
 for (int itss : a) {
	System.out.println(itss);
}
	}

}
