package com.scanner;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {
		
		
		Scanner input  = new Scanner(System.in);
		System.out.println("enter your name ?");
		
		String name = input.nextLine();
		 System.out.println("your name is :-" + name);
		 
		 System.out.println("Enter your age ?");
		  int age = input.nextInt();
		  System.out.println("your age is :" + age);
		  
		  
		  System.out.println("whats your height??");
		  
		  float height = input.nextFloat();
		
		  
		  System.out.println("your height is :" + height);
		  
		  
		  System.out.println("your initial??");
		  
		  char charAt = input.next().charAt(0);
		  
		  System.out.println(charAt);
		  
		  
		  System.out.println("enter your pass word??");
		  
		  String pw = input.next();
		  System.out.println("your password is:" +pw);
	}

}
