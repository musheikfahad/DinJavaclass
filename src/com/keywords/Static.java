package com.keywords;

public class Static {
/*
 * its a keyword
 * 
 * its used in two levels
 * 
 * 1) method level
 * 2) variable level(class variable)
 * 
 * once we declare method or class variable as a static we call tgose meth and variabled withoutusing object 
 *  
 *  we cannot use static in class level
 * 
 * 
 * 
 */
	
	static int y = 12;
	
	public static void woobject() {
		System.out.println("static meth");

	}
	
	public static void main(String[] args) {
		System.out.println(y);
		woobject();
	}
}
