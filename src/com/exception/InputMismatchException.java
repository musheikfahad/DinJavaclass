package com.exception;

import java.util.Scanner;

public class InputMismatchException {

	public static void main(String[] args) {
		//3) Input MIsmatch xception
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you age ???");
		
		int age = sc.nextInt();
		System.out.println(age);

	}

}
