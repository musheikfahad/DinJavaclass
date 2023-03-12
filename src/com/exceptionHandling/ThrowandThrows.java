package com.exceptionHandling;

public class ThrowandThrows {
public static void validate(int age) {
	// voting system with out throw and tghrows
	
	if (age>=18) {
		System.out.println("you can vote");
		
		System.out.println(14/0);
		
	}
	else {
		System.out.println("you cant vote");
	}

}
public static void main(String[] args) {

	validate(25);
	
}
}
