package com.exceptionHandling;

public class TryCatchPractice {

	public static void main(String[] args) {
		// Try and Catch--> used to leave the code with error and do the execute the
		// code without error

		int a;
		int b;
		try {
			a = 5;

			b = 0;
			System.out.println(a / b);
		}
		
		
		
		catch (Exception errorcodeisolated) {  // here we mention particular exception like ex: Arithmaticexception
			// TODO Auto-generated catch block
			errorcodeisolated.printStackTrace();
		}
		
		finally {// you can execute code inside finally even the exception arise
			System.out.println("arithmatic Exception  For Testers and Developer Reference");
		}
		

		System.out.println("----------------------------");

		System.out.println("Remaining Code");
		
		
		System.out.println();

		int c = 4;
		System.out.println("c ="+c);

		int d = 6;
System.out.println("d ="+d);
		System.out.println(c + d);

		System.out.println("c+d ="+c+d);
	}  

}
