package com.StringTypes;

public class Practice {

	public static void main(String[] args) {
		String n = " welcome to java";
		 String[] split =n.split("To Java");
		 System.out.println(split);
		 
		 for (String it : split) {
			System.out.println(it);
		}
	}

}
