package com.loops;

public class Loops {
	/*
	 * looping statement or control statement
	 * 
	 * it has 3 parts
	 * 
	 * 1) initialization ---> where we start
	 * 
	 * 2) condition --> where we stop , loo[p will run based on condition , if condition is true then loop will run otherwise it will stop
	 * 
	 * 3) iteration --> increase or decrease the value
	 * 
	 * 
	 * inc or dec operatorm
	 * 
	 * i++ == i+1 --> post increment
	 * 
	 * i-- == i-a --> post decrement
	 * 
	 * ++i == 1+i --> pre inc
	 * 
	 * --i == 1-i --> pre dec
	 * 
	 * TYPES OF LOOPING STATEMENTS ARE 
	 * 1)WHILE LOOP
	 * 2) DO WHILE LOOP
	 * 3)FOR LOOP
	 * 4)FOR EACH LOOP (espesially for arrays) or ITERATIVE LOOPS
	 * 5) NESTED FOR LOOPS
	 * 5)
	 */
	public static void main(String[] args) {
		
		int i;
		for (i = 0; i <=5; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		System.out.println(i);
		
		System.out.println("nextttttttttttttt decrement");
		
		
		for ( i = 5; i >=1; i--) {
			System.out.println(i);
		}
		
		System.out.println("-------------------");
		System.out.println(i);
	}

}



