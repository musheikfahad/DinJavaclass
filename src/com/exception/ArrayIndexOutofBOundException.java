package com.exception;

public class ArrayIndexOutofBOundException {

	public static void main(String[] args) {
		// 4) Array index out of bound exception
		int a[] = new int[5];

		a[0] = 1;

		a[1] = 2;

		a[2] = 4;

		a[3] = 6;

		a[4] = 78;
		
		a[5] = 98; // out ob index
		System.out.println("by using for each loops");
		 for (int itss : a) {
			System.out.println(itss);
		}

	}

}
