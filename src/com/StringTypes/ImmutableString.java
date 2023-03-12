package com.StringTypes;

public class ImmutableString {

	public static void main(String[] args) {
		
		// in imuutable string both original and duplicate string also same share same memeory and it stored inside string constant pool+8
		String s1 = "Musheik";
		System.out.println(s1);
		System.out.println(System.identityHashCode(s1));
		
		String s2 = "Musheik";
		System.out.println(s2);
		System.out.println(System.identityHashCode(s2));
		
		// when we using concat operator it allocates new memory and it a new string store its into the string constant pool
		
		System.out.println(s1+s2);
		System.out.println(System.identityHashCode(s1+s2));

	}

}
