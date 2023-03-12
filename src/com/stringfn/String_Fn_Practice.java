package com.stringfn;

public class String_Fn_Practice {

	public static void main(String[] args) {
		String n = " Hayyan";

		// 1) length
		String musheik = "Welcome To Java";
		// length always in number
		int len = musheik.length();

		System.out.println(" 1-->length = " + len);

		System.out.println();

		// 2) Equals is a case sensitive method it checks every word
		boolean Equal1 = musheik.equals("Welcome To Java");

		System.out.println(" 2-->is it Equal1 =" + Equal1);
		System.out.println();
		boolean Equal2 = musheik.equals("welcome to java");
		System.out.println(" 3-->is it Equal2 =" + Equal2);
		System.out.println();

		// 3) Equals ignore case

		boolean equalsIgnoreCase = musheik.equalsIgnoreCase("welcome to java");
		System.out.println(" 3-->is it equalsignorecase =" + equalsIgnoreCase);
		System.out.println();

		// 4) to upper case

		String upperCase = musheik.toUpperCase();

		System.out.println(" 4--> after applying upper case =" + upperCase);
		System.out.println();

		// 5) lowercase
		String lowerCase = musheik.toLowerCase();

		System.out.println(" 5--> after applying lower case =" + lowerCase);

		System.out.println();

		// 6 ) startswith also case sensitive

		boolean startsWith = musheik.startsWith("Welcome");

		System.out.println(" 6--> to find starting letter or word =" + startsWith);

		System.out.println();

		// 7) enswith this also case sensitive

		boolean endsWith = musheik.endsWith("Java");

		System.out.println(" 7--> to ends with =" + endsWith);

		System.out.println();

		// 8) contains

		boolean contains = musheik.contains("java");

		System.out.println(" 8--> is contains  =" + contains);

		System.out.println();

		// 9) index of

		int indexOf = musheik.indexOf('j');

		System.out.println(" 9--> index of J is =" + indexOf);
		System.out.println();
		int indexOf2 = musheik.indexOf('J');

		System.out.println(" 9--> index of J is =" + indexOf2);
		// 10) laast index of
		
		int lastIndexOf = musheik.lastIndexOf('e');
		
		
		System.out.println(" 10--> Lastindex of e is =" + lastIndexOf);
	System.out.println();
	
	
	//11) char at
	
	char charAt = musheik.charAt(6);
	
	
	System.out.println(" 11--> charat position 6 is =" + charAt);
	
	System.out.println();
	
	//12) replace
	
	String replace = musheik.replace("Java", "Python");
	
	System.out.println(" 12--> replace a string java with of another string  =" + replace);
	System.out.println();
	
	//13) isempty
	String hayyan = "";
	boolean empty = hayyan.isEmpty();
	
	System.out.println(" 13-->String at hayyan is empty ="+ empty);
	System.out.println();
	boolean empty2 = musheik.isEmpty();
	
	System.out.println(" 14-->String at musheik is empty ="+ empty2);
	System.out.println();
	
	
	// 14) trim method ,, it will delete all the space befire and after
	String Safwan = "       welcome To jannathul firdowse        ";	
	String trim = Safwan.trim();
	
	System.out.println("14)--> after trimming =" +trim);
	
	System.out.println();
	
	//15) Substring
	 String substring = musheik.substring(3);
	 System.out.println("15)--> after substring =" +substring);
	 System.out.println();
	 
	 String substring2 = musheik.substring(2, 12);
	 System.out.println("15)--> after substring =" +substring2);
	 System.out.println();
	
	//16) Split its an string array we can use int or float array or etc  this also case sensitive
	 
	 String[] split = musheik.split("To Java");
	  
	 // array so we are gonna use for each loop
	 
	 
	 for (String it : split) {
		 System.out.println("16)--> after splitting space or any letters =" +it);
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

}
