package com.exceptionHandling;

public class WithThrowandThrows {
	
	public static void validate(int age) throws Exception {
		//  with throw and tghrows
		
		if (age>=18) {
			throw new Exception ("you can vote");
			
		}
		else {
			System.out.println("you cant vote");
		}

	}
	public static void main(String[] args) throws Exception  {

		validate(19);
		
	
	}

}
