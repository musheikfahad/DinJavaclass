package com.exception;

public class NullPointerException {

	public static void main(String[] args) {
		// 2) null pointer exception
		
		String a = "musheik";
		int length = a.length();
		System.out.println(length);
		
		String b = null;
		int length2 = b.length();
		System.out.println(length2);

	}

}
