package com.Variable;

public class VariablePractice {
	
	
	public  void add(int x , int y) {
		
		
		int z = x+y;
		System.out.println("Answer is =" +z);
		
		
	}
	
	public int additition(int a , int b) {
		int c = a+b;
	return c ;

	}

	public static void main(String[] args) {
		VariablePractice obj = new VariablePractice();
		
		obj.add(12, 35);
		
		obj.add(122, 656);
		
	int add = obj.additition(12, 34);
		System.out.println(add);
		

	}

}
