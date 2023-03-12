package com.StringTypes;

public class StringBufferrrrrrr {

	// mutable string its store outside the constant string pool

	public static void main(String[] args) {
		
		// it use different memory location for original and duplicate content 
		StringBuffer s1 = new StringBuffer("Musheik");

		System.out.println(s1);
		
		System.out.println(System.identityHashCode(s1));
		
		StringBuffer s2 = new StringBuffer("Musheik");
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
			// while concating here we use append
		// later (s2) uses the forward(s1) memory
		System.out.println(s1.append(s2));
		System.out.println(System.identityHashCode(s1.append(s2)));
		// later (s1) uses the forward(s2) memory
		System.out.println(s2.append(s1));
		System.out.println(System.identityHashCode(s2.append(s1)));
		
		StringBuffer s3 = new StringBuffer("elonmusk");
		System.out.println(s3);
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s3.insert(2,	 "venki"));
		
		System.out.println(System.identityHashCode(s3));
		
		System.out.println(s3.replace(2	, 5, "love"));
		
		System.out.println(System.identityHashCode(s3));
	}

}
