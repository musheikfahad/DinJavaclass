package com.StringTypes;

public class StringBuilderrr {

	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Ahad");

		System.out.println(s1);

		System.out.println(System.identityHashCode(s1));

		StringBuilder s2 = new StringBuilder("Ahad");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		// instead of  concat here we use append
		// later (s2) uses the forward(s1) memory
		System.out.println(s1.append(s2));
		System.out.println(System.identityHashCode(s1.append(s2)));
		// later (s1) uses the forward(s2) memory
		System.out.println(s2.append(s1));
		System.out.println(System.identityHashCode(s2.append(s1)));
	

	}

}
