package com.exception;

public class StringIndexOutOfBoundException {

	public static void main(String[] args) {
		// 5) String index out of bound exception
		
		String s = "musheik";
		
		char characteratmusheik = s.charAt(3);
		
		System.out.println(characteratmusheik);
		
		char characteratmusheik2 = s.charAt(9);
		System.out.println(characteratmusheik2);

	}

}
