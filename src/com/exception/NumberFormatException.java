package com.exception;

public class NumberFormatException {

	public static void main(String[] args) {
		// 7)Number Format Exception
		
		String m = "1234";
		int numberrr = Integer.parseInt(m);
		System.out.println(numberrr);
		
		String A = "1233$@$@fg";
		int number2 = Integer.parseInt(A);
		System.out.println(number2);
	}

}
